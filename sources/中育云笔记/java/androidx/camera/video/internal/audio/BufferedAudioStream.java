package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
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

        public AudioData(@NonNull ByteBuffer byteBuffer, @NonNull AudioStream.PacketInfo packetInfo, int i10, int i11) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit == packetInfo.getSizeInBytes()) {
                this.mBytesPerFrame = i10;
                this.mSampleRate = i11;
                this.mByteBuffer = byteBuffer;
                this.mTimestampNs = packetInfo.getTimestampNs();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + iLimit + " != " + packetInfo.getSizeInBytes());
        }

        public int getRemainingBufferSizeInBytes() {
            return this.mByteBuffer.remaining();
        }

        public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
            int iRemaining;
            long j10 = this.mTimestampNs;
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
            return AudioStream.PacketInfo.m807of(iRemaining, j10);
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

    /* renamed from: a */
    public static /* synthetic */ void m809a(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.mIsCollectingAudioData.set(false);
        bufferedAudioStream.mAudioStream.stop();
        synchronized (bufferedAudioStream.mLock) {
            bufferedAudioStream.mAudioDataNotFullyRead = null;
            bufferedAudioStream.mAudioDataQueue.clear();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m810b(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.getClass();
        try {
            bufferedAudioStream.mAudioStream.start();
            bufferedAudioStream.startCollectingAudioData();
        } catch (AudioStream.AudioStreamException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m811c(BufferedAudioStream bufferedAudioStream) {
        bufferedAudioStream.mIsCollectingAudioData.set(false);
        bufferedAudioStream.mAudioStream.release();
        synchronized (bufferedAudioStream.mLock) {
            bufferedAudioStream.mAudioDataNotFullyRead = null;
            bufferedAudioStream.mAudioDataQueue.clear();
        }
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
            int i10 = this.mQueueMaxSize;
            synchronized (this.mLock) {
                try {
                    this.mAudioDataQueue.offer(audioData);
                    while (this.mAudioDataQueue.size() > i10) {
                        this.mAudioDataQueue.poll();
                        Logger.m579w(TAG, "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.mIsCollectingAudioData.get()) {
                this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f871c.collectAudioData();
                    }
                });
            }
        }
    }

    private void startCollectingAudioData() {
        if (this.mIsCollectingAudioData.getAndSet(true)) {
            return;
        }
        collectAudioData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCollectionBufferSize(int i10) {
        int i11 = this.mBufferSize;
        if (i11 == i10) {
            return;
        }
        int i12 = this.mBytesPerFrame;
        this.mBufferSize = (i10 / i12) * i12;
        Logger.m573d(TAG, "Update buffer size from " + i11 + " to " + this.mBufferSize);
    }

    private void updateCollectionBufferSizeAsync(final int i10) {
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f872c.updateCollectionBufferSize(i10);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    @SuppressLint({"BanThreadSleep"})
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) throws InterruptedException {
        boolean z10;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        updateCollectionBufferSizeAsync(byteBuffer.remaining());
        AudioStream.PacketInfo packetInfoM807of = AudioStream.PacketInfo.m807of(0, 0L);
        do {
            synchronized (this.mLock) {
                try {
                    AudioData audioDataPoll = this.mAudioDataNotFullyRead;
                    this.mAudioDataNotFullyRead = null;
                    if (audioDataPoll == null) {
                        audioDataPoll = this.mAudioDataQueue.poll();
                    }
                    if (audioDataPoll != null) {
                        packetInfoM807of = audioDataPoll.read(byteBuffer);
                        if (audioDataPoll.getRemainingBufferSizeInBytes() > 0) {
                            this.mAudioDataNotFullyRead = audioDataPoll;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z10 = packetInfoM807of.getSizeInBytes() <= 0 && this.mIsStarted.get() && !this.mIsReleased.get();
            if (z10) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e10) {
                    Logger.m580w(TAG, "Interruption while waiting for audio data", e10);
                    return packetInfoM807of;
                }
            }
        } while (z10);
        return packetInfoM807of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.t
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m811c(this.f874c);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable final AudioStream.AudioStreamCallback audioStreamCallback, @Nullable final Executor executor) {
        boolean z10 = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "executor can't be null with non-null callback.");
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f867c.mAudioStream.setCallback(audioStreamCallback, executor);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws ExecutionException, InterruptedException, AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: androidx.camera.video.internal.audio.q
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m810b(this.f870c);
            }
        }, null);
        this.mProducerExecutor.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e10) {
            this.mIsStarted.set(false);
            throw new AudioStream.AudioStreamException(e10);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(false)) {
            this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.o
                @Override // java.lang.Runnable
                public final void run() {
                    BufferedAudioStream.m809a(this.f866c);
                }
            });
        }
    }
}
