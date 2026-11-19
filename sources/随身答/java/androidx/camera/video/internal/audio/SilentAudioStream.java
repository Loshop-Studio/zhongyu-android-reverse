package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class SilentAudioStream implements AudioStream {
    private static final String TAG = "SilentAudioStream";

    @Nullable
    private AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBytesPerFrame;

    @Nullable
    private Executor mCallbackExecutor;
    private long mCurrentReadTimeNs;
    private final int mSampleRate;

    @Nullable
    private byte[] mZeroBytes;
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);

    public SilentAudioStream(@NonNull AudioSettings audioSettings) {
        this.mBytesPerFrame = audioSettings.getBytesPerFrame();
        this.mSampleRate = audioSettings.getSampleRate();
    }

    private static void blockUntilSystemTimeReached(long j9) throws InterruptedException {
        long jCurrentSystemTimeNs = j9 - currentSystemTimeNs();
        if (jCurrentSystemTimeNs > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jCurrentSystemTimeNs));
            } catch (InterruptedException e10) {
                Logger.m508w(TAG, "Ignore interruption", e10);
            }
        }
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    private static long currentSystemTimeNs() {
        return System.nanoTime();
    }

    private void notifySilenced() {
        final AudioStream.AudioStreamCallback audioStreamCallback = this.mAudioStreamCallback;
        Executor executor = this.mCallbackExecutor;
        if (audioStreamCallback == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.u
            @Override // java.lang.Runnable
            public final void run() {
                audioStreamCallback.onSilenceStateChanged(true);
            }
        });
    }

    private void writeSilenceToBuffer(@NonNull ByteBuffer byteBuffer, int i9) {
        Preconditions.checkState(i9 <= byteBuffer.remaining());
        byte[] bArr = this.mZeroBytes;
        if (bArr == null || bArr.length < i9) {
            this.mZeroBytes = new byte[i9];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.mZeroBytes, 0, i9).limit(i9 + iPosition).position(iPosition);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) throws InterruptedException {
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        long jSizeToFrameCount = AudioUtils.sizeToFrameCount(byteBuffer.remaining(), this.mBytesPerFrame);
        int iFrameCountToSize = (int) AudioUtils.frameCountToSize(jSizeToFrameCount, this.mBytesPerFrame);
        if (iFrameCountToSize <= 0) {
            return AudioStream.PacketInfo.m735of(0, this.mCurrentReadTimeNs);
        }
        long jFrameCountToDurationNs = this.mCurrentReadTimeNs + AudioUtils.frameCountToDurationNs(jSizeToFrameCount, this.mSampleRate);
        blockUntilSystemTimeReached(jFrameCountToDurationNs);
        writeSilenceToBuffer(byteBuffer, iFrameCountToSize);
        AudioStream.PacketInfo packetInfoM735of = AudioStream.PacketInfo.m735of(iFrameCountToSize, this.mCurrentReadTimeNs);
        this.mCurrentReadTimeNs = jFrameCountToDurationNs;
        return packetInfoM735of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        this.mIsReleased.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable AudioStream.AudioStreamCallback audioStreamCallback, @Nullable Executor executor) {
        boolean z9 = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z9 = false;
        }
        Preconditions.checkArgument(z9, "executor can't be null with non-null callback.");
        this.mAudioStreamCallback = audioStreamCallback;
        this.mCallbackExecutor = executor;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        this.mCurrentReadTimeNs = currentSystemTimeNs();
        notifySilenced();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        checkNotReleasedOrThrow();
        this.mIsStarted.set(false);
    }
}
