package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.camera.core.CameraState;

/* loaded from: classes.dex */
final class AutoValue_CameraState_StateError extends CameraState.StateError {
    private final Throwable cause;
    private final int code;

    public AutoValue_CameraState_StateError(int i10, @Nullable Throwable th) {
        this.code = i10;
        this.cause = th;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState.StateError) {
            CameraState.StateError stateError = (CameraState.StateError) obj;
            if (this.code == stateError.getCode() && ((th = this.cause) != null ? th.equals(stateError.getCause()) : stateError.getCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState.StateError
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
        return this.code;
    }

    public int hashCode() {
        int i10 = (this.code ^ 1000003) * 1000003;
        Throwable th = this.cause;
        return i10 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.code + ", cause=" + this.cause + "}";
    }
}
