package androidx.camera.core.impl.utils;

import androidx.camera.core.Logger;

/* loaded from: classes.dex */
public final class CameraOrientationUtil {
    private static final String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 90) {
            return 1;
        }
        if (i10 == 180) {
            return 2;
        }
        if (i10 == 270) {
            return 3;
        }
        throw new IllegalStateException("Invalid sensor rotation: " + i10);
    }

    public static int getRelativeImageRotation(int i10, int i11, boolean z9) {
        int i12 = z9 ? ((i11 - i10) + 360) % 360 : (i11 + i10) % 360;
        if (Logger.isVerboseEnabled(TAG)) {
            Logger.m723d(TAG, String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z9), Integer.valueOf(i12)));
        }
        return i12;
    }

    public static int surfaceRotationToDegrees(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i10);
    }
}
