package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* loaded from: classes.dex */
public final class CameraUnavailableExceptionHelper {
    private CameraUnavailableExceptionHelper() {
    }

    @NonNull
    public static CameraUnavailableException createFrom(@NonNull CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i9 = 1;
        if (reason != 1) {
            i9 = 2;
            if (reason != 2) {
                i9 = 3;
                if (reason != 3) {
                    i9 = 4;
                    if (reason != 4) {
                        i9 = 5;
                        if (reason != 5) {
                            i9 = reason != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i9, cameraAccessExceptionCompat);
    }
}
