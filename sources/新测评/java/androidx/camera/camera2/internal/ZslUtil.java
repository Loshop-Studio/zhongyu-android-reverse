package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;

/* loaded from: classes.dex */
final class ZslUtil {
    private ZslUtil() {
    }

    public static boolean isCapabilitySupported(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, int i10) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }
}
