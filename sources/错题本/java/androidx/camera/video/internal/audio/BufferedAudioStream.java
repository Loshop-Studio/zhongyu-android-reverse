package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a5.RunnableC0017h;

/* loaded from: classes.dex */
public class BufferedAudioStream implements AudioStream {
    private static final int DATA_WAITING_TIME_MILLIS = 1;
    private static final int DEFAULT_BUFFER_SIZE_IN_FRAME = 1024;
    private static final int DEFAULT_QUEUE_SIZE = 500;
    private static final String TAG = "BufferedAudioStream";
    private final AudioStream mAudioStream;
    private int mBufferSize;
    private final int mBytesPerFrame;
    private final int mQueueMaxSize;
    private final int mSampleRate;
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);

    @GuardedBy("mLock")
    private final Queue<AudioData> mAudioDataQueue = new ConcurrentLinkedQueue();
    private final Executor mProducerExecutor = CameraXExecutors.newSequentialExecutor(CameraXExecutors.audioExecutor());
    private final Object mLock = new Object();

    @Nullable
    @GuardedBy("mLock")
    private AudioData mAudioDataNotFullyRead = null;
    private final AtomicBoolean mIsCollectingAudioData = new AtomicBoolean(false);

    public static class AudioData {
        private final ByteBuffer mByteBuffer;
        private final int mBytesPerFrame;
        private final int mSampleRate;
        private long mTimestampNs;

        public AudioData(@NonNull ByteBuffer byteBuffer, @NonNull AudioStream.PacketInfo packetInfo, int i, int i8) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit != packetInfo.getSizeInBytes()) {
                StringBuilder sbM94s = AbstractC0037f.m94s(iLimit, "Byte buffer size is not match with packet info: ", " != ");
                sbM94s.append(packetInfo.getSizeInBytes());
                throw new IllegalStateException(sbM94s.toString());
            }
            this.mBytesPerFrame = i;
            this.mSampleRate = i8;
            this.mByteBuffer = byteBuffer;
            this.mTimestampNs = packetInfo.getTimestampNs();
        }

        public int getRemainingBufferSizeInBytes() {
            return this.mByteBuffer.remaining();
        }

        public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
            int iRemaining;
            long j7 = this.mTimestampNs;
            int iPosition = this.mByteBuffer.position();
            int iPosition2 = byteBuffer.position();
            if (this.mByteBuffer.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.mTimestampNs += AudioUtils.frameCountToDurationNs(AudioUtils.sizeToFrameCount(iRemaining, this.mBytesPerFrame), this.mSampleRate);
                ByteBuffer byteBufferDuplicate = this.mByteBuffer.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                iRemaining = this.mByteBuffer.remaining();
                byteBuffer.put(this.mByteBuffer).limit(iPosition2 + iRemaining).position(iPosition2);
            }
            this.mByteBuffer.position(iPosition + iRemaining);
            return AudioStream.PacketInfo.m817of(iRemaining, j7);
        }
    }

    public BufferedAudioStream(@NonNull AudioStream audioStream, @NonNull AudioSettings audioSettings) {
        this.mAudioStream = audioStream;
        int bytesPerFrame = audioSettings.getBytesPerFrame();
        this.mBytesPerFrame = bytesPerFrame;
        int sampleRate = audioSettings.getSampleRate();
        this.mSampleRate = sampleRate;
        Preconditions.checkArgument(((long) bytesPerFrame) > 0, "mBytesPerFrame must be greater than 0.");
        Preconditions.checkArgument(((long) sampleRate) > 0, "mSampleRate must be greater than 0.");
        this.mQueueMaxSize = DEFAULT_QUEUE_SIZE;
        this.mBufferSize = bytesPerFrame * 1024;
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void collectAudioData() {
        if (this.mIsCollectingAudioData.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.mBufferSize);
            AudioData audioData = new AudioData(byteBufferAllocateDirect, this.mAudioStream.read(byteBufferAllocateDirect), this.mBytesPerFrame, this.mSampleRate);
            int i = this.mQueueMaxSize;
            synchronized (this.mLock) {
                try {
                    this.mAudioDataQueue.offer(audioData);
                    while (this.mAudioDataQueue.size() > i) {
                        this.mAudioDataQueue.poll();
                        Logger.m591w(TAG, "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.mIsCollectingAudioData.get()) {
                this.mProducerExecutor.execute(new RunnableC0490e(this, 2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2() {
        this.mIsCollectingAudioData.set(false);
        this.mAudioStream.release();
        synchronized (this.mLock) {
            this.mAudioDataNotFullyRead = null;
            this.mAudioDataQueue.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCallback$3(AudioStream.AudioStreamCallback audioStreamCallback, Executor executor) {
        this.mAudioStream.setCallback(audioStreamCallback, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() throws IllegalStateException {
        try {
            this.mAudioStream.start();
            startCollectingAudioData();
        } catch (AudioStream.AudioStreamException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$1() throws IllegalStateException {
        this.mIsCollectingAudioData.set(false);
        this.mAudioStream.stop();
        synchronized (this.mLock) {
            this.mAudioDataNotFullyRead = null;
            this.mAudioDataQueue.clear();
        }
    }

    private void startCollectingAudioData() {
        if (this.mIsCollectingAudioData.getAndSet(true)) {
            return;
        }
        collectAudioData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateCollectionBufferSize, reason: merged with bridge method [inline-methods] */
    public void lambda$updateCollectionBufferSizeAsync$4(int i) {
        int i8 = this.mBufferSize;
        if (i8 == i) {
            return;
        }
        int i9 = this.mBytesPerFrame;
        this.mBufferSize = (i / i9) * i9;
        StringBuilder sbM94s = AbstractC0037f.m94s(i8, "Update buffer size from ", " to ");
        sbM94s.append(this.mBufferSize);
        Logger.m585d(TAG, sbM94s.toString());
    }

    private void updateCollectionBufferSizeAsync(int i) {
        this.mProducerExecutor.execute(new RunnableC0491f(this, i, 0));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    @SuppressLint({"BanThreadSleep"})
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) throws InterruptedException {
        boolean z8;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        updateCollectionBufferSizeAsync(byteBuffer.remaining());
        AudioStream.PacketInfo packetInfoM817of = AudioStream.PacketInfo.m817of(0, 0L);
        do {
            synchronized (this.mLock) {
                try {
                    AudioData audioDataPoll = this.mAudioDataNotFullyRead;
                    this.mAudioDataNotFullyRead = null;
                    if (audioDataPoll == null) {
                        audioDataPoll = this.mAudioDataQueue.poll();
                    }
                    if (audioDataPoll != null) {
                        packetInfoM817of = audioDataPoll.read(byteBuffer);
                        if (audioDataPoll.getRemainingBufferSizeInBytes() > 0) {
                            this.mAudioDataNotFullyRead = audioDataPoll;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z8 = packetInfoM817of.getSizeInBytes() <= 0 && this.mIsStarted.get() && !this.mIsReleased.get();
            if (z8) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {
                    Logger.m592w(TAG, "Interruption while waiting for audio data", e);
                    return packetInfoM817of;
                }
            }
        } while (z8);
        return packetInfoM817of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        this.mProducerExecutor.execute(new RunnableC0490e(this, 3));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable AudioStream.AudioStreamCallback audioStreamCallback, @Nullable Executor executor) {
        boolean z8 = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z8 = false;
        }
        Preconditions.checkArgument(z8, "executor can't be null with non-null callback.");
        this.mProducerExecutor.execute(new RunnableC0017h(this, audioStreamCallback, 6, executor));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws ExecutionException, IllegalStateException, InterruptedException, AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new RunnableC0490e(this, 1), null);
        this.mProducerExecutor.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            this.mIsStarted.set(false);
            throw new AudioStream.AudioStreamException(e);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() throws IllegalStateException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(false)) {
            this.mProducerExecutor.execute(new RunnableC0490e(this, 0));
        }
    }
}
