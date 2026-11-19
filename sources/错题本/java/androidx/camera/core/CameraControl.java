package androidx.camera.core;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import p049e1.InterfaceFutureC5453a;

/* loaded from: classes.dex */
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@NonNull String str) {
            super(str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@NonNull String str, @NonNull Throwable th) {
            super(str, th);
        }
    }

    @NonNull
    InterfaceFutureC5453a cancelFocusAndMetering();

    @NonNull
    InterfaceFutureC5453a enableTorch(boolean z8);

    @NonNull
    InterfaceFutureC5453a setExposureCompensationIndex(int i);

    @NonNull
    InterfaceFutureC5453a setLinearZoom(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f);

    @NonNull
    InterfaceFutureC5453a setZoomRatio(float f);

    @NonNull
    InterfaceFutureC5453a startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction);
}
