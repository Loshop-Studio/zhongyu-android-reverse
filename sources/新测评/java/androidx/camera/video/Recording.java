package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.core.util.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Recording implements AutoCloseable {
    private final CloseGuardHelper mCloseGuard;
    private final AtomicBoolean mIsClosed;
    private final boolean mIsPersistent;
    private final OutputOptions mOutputOptions;
    private final Recorder mRecorder;
    private final long mRecordingId;

    public Recording(@NonNull Recorder recorder, long j10, @NonNull OutputOptions outputOptions, boolean z9, boolean z10) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mIsClosed = atomicBoolean;
        CloseGuardHelper closeGuardHelperCreate = CloseGuardHelper.create();
        this.mCloseGuard = closeGuardHelperCreate;
        this.mRecorder = recorder;
        this.mRecordingId = j10;
        this.mOutputOptions = outputOptions;
        this.mIsPersistent = z9;
        if (z10) {
            atomicBoolean.set(true);
        } else {
            closeGuardHelperCreate.open("stop");
        }
    }

    @NonNull
    public static Recording createFinalizedFrom(@NonNull PendingRecording pendingRecording, long j10) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j10, pendingRecording.getOutputOptions(), pendingRecording.isPersistent(), true);
    }

    @NonNull
    public static Recording from(@NonNull PendingRecording pendingRecording, long j10) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j10, pendingRecording.getOutputOptions(), pendingRecording.isPersistent(), false);
    }

    private void stopWithError(int i10, @Nullable Throwable th) throws Throwable {
        this.mCloseGuard.close();
        if (this.mIsClosed.getAndSet(true)) {
            return;
        }
        this.mRecorder.stop(this, i10, th);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Throwable {
        stopWithError(0, null);
    }

    public void finalize() throws Throwable {
        try {
            this.mCloseGuard.warnIfOpen();
            stopWithError(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    @NonNull
    public OutputOptions getOutputOptions() {
        return this.mOutputOptions;
    }

    public long getRecordingId() {
        return this.mRecordingId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isClosed() {
        return this.mIsClosed.get();
    }

    @ExperimentalPersistentRecording
    public boolean isPersistent() {
        return this.mIsPersistent;
    }

    public void mute(boolean z9) {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.mute(this, z9);
    }

    public void pause() {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.pause(this);
    }

    public void resume() {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.resume(this);
    }

    public void stop() {
        close();
    }
}
