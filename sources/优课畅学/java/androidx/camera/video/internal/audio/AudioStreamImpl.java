package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.compat.Api23Impl;
import androidx.camera.video.internal.compat.Api24Impl;
import androidx.camera.video.internal.compat.Api29Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class AudioStreamImpl implements AudioStream {
    private static final long DIFF_LIMIT_FROM_SYSTEM_TIME_NS = TimeUnit.MILLISECONDS.toNanos(500);
    private static final String TAG = "AudioStreamImpl";

    @NonNull
    private AudioRecord mAudioRecord;

    @Nullable
    private AudioManager.AudioRecordingCallback mAudioRecordingCallback;

    @Nullable
    private AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBufferSize;
    private final int mBytesPerFrame;

    @Nullable
    private Executor mCallbackExecutor;
    private final AudioSettings mSettings;
    private long mTotalFramesRead;
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicReference<Boolean> mNotifiedSilenceState = new AtomicReference<>(null);
    private boolean mShouldFallbackToSystemTime = false;

    @RequiresApi(29)
    public class AudioRecordingApi29Callback extends AudioManager.AudioRecordingCallback {
        public AudioRecordingApi29Callback() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                if (Api24Impl.getClientAudioSessionId(audioRecordingConfiguration) == AudioStreamImpl.this.mAudioRecord.getAudioSessionId()) {
                    AudioStreamImpl.this.notifySilenced(Api29Impl.isClientSilenced(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioStreamImpl(@NonNull AudioSettings audioSettings, @Nullable Context context) throws AudioStream.AudioStreamException, IllegalArgumentException {
        if (!isSettingsSupported(audioSettings.getSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(audioSettings.getSampleRate()), Integer.valueOf(audioSettings.getChannelCount()), Integer.valueOf(audioSettings.getAudioFormat())));
        }
        this.mSettings = audioSettings;
        this.mBytesPerFrame = audioSettings.getBytesPerFrame();
        int minBufferSize = getMinBufferSize(audioSettings.getSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat());
        Preconditions.checkState(minBufferSize > 0);
        int i10 = minBufferSize * 2;
        this.mBufferSize = i10;
        AudioRecord audioRecordCreateAudioRecord = createAudioRecord(i10, audioSettings, context);
        this.mAudioRecord = audioRecordCreateAudioRecord;
        checkAudioRecordInitialStateOrReleaseAndThrow(audioRecordCreateAudioRecord);
    }

    private static void checkAudioRecordInitialStateOrReleaseAndThrow(@NonNull AudioRecord audioRecord) throws AudioStream.AudioStreamException {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    private static AudioRecord createAudioRecord(int i10, @NonNull AudioSettings audioSettings, @Nullable Context context) throws IllegalArgumentException {
        int i11 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(audioSettings.getSampleRate()).setChannelMask(AudioUtils.channelCountToChannelMask(audioSettings.getChannelCount())).setEncoding(audioSettings.getAudioFormat()).build();
        AudioRecord.Builder builderCreateAudioRecordBuilder = Api23Impl.createAudioRecordBuilder();
        if (i11 >= 31 && context != null) {
            Api31Impl.setContext(builderCreateAudioRecordBuilder, context);
        }
        Api23Impl.setAudioSource(builderCreateAudioRecordBuilder, audioSettings.getAudioSource());
        Api23Impl.setAudioFormat(builderCreateAudioRecordBuilder, audioFormatBuild);
        Api23Impl.setBufferSizeInBytes(builderCreateAudioRecordBuilder, i10);
        return Api23Impl.build(builderCreateAudioRecordBuilder);
    }

    private long generatePresentationTimeNs() {
        long jComputeInterpolatedTimeNs;
        if (this.mShouldFallbackToSystemTime) {
            jComputeInterpolatedTimeNs = -1;
        } else {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (Api24Impl.getTimestamp(this.mAudioRecord, audioTimestamp, 0) == 0) {
                jComputeInterpolatedTimeNs = AudioUtils.computeInterpolatedTimeNs(this.mSettings.getSampleRate(), this.mTotalFramesRead, audioTimestamp);
                if (Math.abs(jComputeInterpolatedTimeNs - System.nanoTime()) > DIFF_LIMIT_FROM_SYSTEM_TIME_NS) {
                    this.mShouldFallbackToSystemTime = true;
                }
            } else {
                Logger.m485w(TAG, "Unable to get audio timestamp");
            }
            jComputeInterpolatedTimeNs = -1;
        }
        return jComputeInterpolatedTimeNs == -1 ? System.nanoTime() : jComputeInterpolatedTimeNs;
    }

    private static int getMinBufferSize(int i10, int i11, int i12) {
        return AudioRecord.getMinBufferSize(i10, AudioUtils.channelCountToChannelConfig(i11), i12);
    }

    private static boolean hasAudioTimestampQuirk() {
        return DeviceQuirks.get(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean isSettingsSupported(int i10, int i11, int i12) {
        return i10 > 0 && i11 > 0 && getMinBufferSize(i10, i11, i12) > 0;
    }

    public void notifySilenced(final boolean z10) {
        Executor executor = this.mCallbackExecutor;
        final AudioStream.AudioStreamCallback audioStreamCallback = this.mAudioStreamCallback;
        if (executor == null || audioStreamCallback == null || Objects.equals(this.mNotifiedSilenceState.getAndSet(Boolean.valueOf(z10)), Boolean.valueOf(z10))) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.n
            @Override // java.lang.Runnable
            public final void run() {
                audioStreamCallback.onSilenceStateChanged(z10);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
        long jGeneratePresentationTimeNs;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        int i10 = this.mAudioRecord.read(byteBuffer, this.mBufferSize);
        if (i10 > 0) {
            byteBuffer.limit(i10);
            jGeneratePresentationTimeNs = generatePresentationTimeNs();
            this.mTotalFramesRead += AudioUtils.sizeToFrameCount(i10, this.mBytesPerFrame);
        } else {
            jGeneratePresentationTimeNs = 0;
        }
        return AudioStream.PacketInfo.m730of(i10, jGeneratePresentationTimeNs);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.mAudioRecordingCallback) != null) {
            Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioRecordingCallback);
        }
        this.mAudioRecord.release();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable AudioStream.AudioStreamCallback audioStreamCallback, @Nullable Executor executor) {
        boolean z10 = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "executor can't be null with non-null callback.");
        this.mAudioStreamCallback = audioStreamCallback;
        this.mCallbackExecutor = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.mAudioRecordingCallback;
            if (audioRecordingCallback != null) {
                Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioRecordingCallback);
            }
            if (audioStreamCallback == null) {
                return;
            }
            if (this.mAudioRecordingCallback == null) {
                this.mAudioRecordingCallback = new AudioRecordingApi29Callback();
            }
            Api29Impl.registerAudioRecordingCallback(this.mAudioRecord, executor, this.mAudioRecordingCallback);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws IllegalStateException, AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        if (hasAudioTimestampQuirk()) {
            checkAudioRecordInitialStateOrReleaseAndThrow(this.mAudioRecord);
        }
        this.mAudioRecord.startRecording();
        boolean z10 = false;
        if (this.mAudioRecord.getRecordingState() != 3) {
            this.mIsStarted.set(false);
            throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + this.mAudioRecord.getRecordingState());
        }
        this.mTotalFramesRead = 0L;
        this.mShouldFallbackToSystemTime = false;
        this.mNotifiedSilenceState.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration activeRecordingConfiguration = Api29Impl.getActiveRecordingConfiguration(this.mAudioRecord);
            z10 = activeRecordingConfiguration != null && Api29Impl.isClientSilenced(activeRecordingConfiguration);
        }
        notifySilenced(z10);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @SuppressLint({"MissingPermission"})
    public void stop() throws IllegalStateException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(false)) {
            this.mAudioRecord.stop();
            if (this.mAudioRecord.getRecordingState() != 1) {
                Logger.m485w(TAG, "Failed to stop AudioRecord with state: " + this.mAudioRecord.getRecordingState());
            }
            if (hasAudioTimestampQuirk()) {
                this.mAudioRecord.release();
                this.mAudioRecord = createAudioRecord(this.mBufferSize, this.mSettings, null);
            }
        }
    }
}
