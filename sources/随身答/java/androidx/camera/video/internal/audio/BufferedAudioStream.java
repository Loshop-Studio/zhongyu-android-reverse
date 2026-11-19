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

        public AudioData(@NonNull ByteBuffer byteBuffer, @NonNull AudioStream.PacketInfo packetInfo, int i9, int i10) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit == packetInfo.getSizeInBytes()) {
                this.mBytesPerFrame = i9;
                this.mSampleRate = i10;
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
            long j9 = this.mTimestampNs;
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
            return AudioStream.PacketInfo.m735of(iRemaining, j9);
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
    public static /* synthetic */ void m737a(BufferedAudioStream bufferedAudioStream) throws IllegalStateException {
        bufferedAudioStream.mIsCollectingAudioData.set(false);
        bufferedAudioStream.mAudioStream.stop();
        synchronized (bufferedAudioStream.mLock) {
            bufferedAudioStream.mAudioDataNotFullyRead = null;
            bufferedAudioStream.mAudioDataQueue.clear();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m738b(BufferedAudioStream bufferedAudioStream) throws IllegalStateException {
        bufferedAudioStream.getClass();
        try {
            bufferedAudioStream.mAudioStream.start();
            bufferedAudioStream.startCollectingAudioData();
        } catch (AudioStream.AudioStreamException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m739c(BufferedAudioStream bufferedAudioStream) {
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
            int i9 = this.mQueueMaxSize;
            synchronized (this.mLock) {
                try {
                    this.mAudioDataQueue.offer(audioData);
                    while (this.mAudioDataQueue.size() > i9) {
                        this.mAudioDataQueue.poll();
                        Logger.m507w(TAG, "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.mIsCollectingAudioData.get()) {
                this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f856a.collectAudioData();
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
    public void updateCollectionBufferSize(int i9) {
        int i10 = this.mBufferSize;
        if (i10 == i9) {
            return;
        }
        int i11 = this.mBytesPerFrame;
        this.mBufferSize = (i9 / i11) * i11;
        Logger.m501d(TAG, "Update buffer size from " + i10 + " to " + this.mBufferSize);
    }

    private void updateCollectionBufferSizeAsync(final int i9) {
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f857a.updateCollectionBufferSize(i9);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    @SuppressLint({"BanThreadSleep"})
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) throws InterruptedException {
        boolean z9;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        updateCollectionBufferSizeAsync(byteBuffer.remaining());
        AudioStream.PacketInfo packetInfoM735of = AudioStream.PacketInfo.m735of(0, 0L);
        do {
            synchronized (this.mLock) {
                try {
                    AudioData audioDataPoll = this.mAudioDataNotFullyRead;
                    this.mAudioDataNotFullyRead = null;
                    if (audioDataPoll == null) {
                        audioDataPoll = this.mAudioDataQueue.poll();
                    }
                    if (audioDataPoll != null) {
                        packetInfoM735of = audioDataPoll.read(byteBuffer);
                        if (audioDataPoll.getRemainingBufferSizeInBytes() > 0) {
                            this.mAudioDataNotFullyRead = audioDataPoll;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z9 = packetInfoM735of.getSizeInBytes() <= 0 && this.mIsStarted.get() && !this.mIsReleased.get();
            if (z9) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e10) {
                    Logger.m508w(TAG, "Interruption while waiting for audio data", e10);
                    return packetInfoM735of;
                }
            }
        } while (z9);
        return packetInfoM735of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.t
            @Override // java.lang.Runnable
            public final void run() {
                BufferedAudioStream.m739c(this.f859a);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable final AudioStream.AudioStreamCallback audioStreamCallback, @Nullable final Executor executor) {
        boolean z9 = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z9 = false;
        }
        Preconditions.checkArgument(z9, "executor can't be null with non-null callback.");
        this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f852a.mAudioStream.setCallback(audioStreamCallback, executor);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws ExecutionException, IllegalStateException, InterruptedException, AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: androidx.camera.video.internal.audio.q
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException {
                BufferedAudioStream.m738b(this.f855a);
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
    public void stop() throws IllegalStateException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(false)) {
            this.mProducerExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.o
                @Override // java.lang.Runnable
                public final void run() throws IllegalStateException {
                    BufferedAudioStream.m737a(this.f851a);
                }
            });
        }
    }
}
