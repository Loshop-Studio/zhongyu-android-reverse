package androidx.camera.core.impl.utils;

import androidx.camera.core.Logger;

/* loaded from: classes.dex */
public final class CameraOrientationUtil {
    private static final String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 90) {
            return 1;
        }
        if (i9 == 180) {
            return 2;
        }
        if (i9 == 270) {
            return 3;
        }
        throw new IllegalStateException("Invalid sensor rotation: " + i9);
    }

    public static int getRelativeImageRotation(int i9, int i10, boolean z9) {
        int i11 = z9 ? ((i10 - i9) + 360) % 360 : (i10 + i9) % 360;
        if (Logger.isVerboseEnabled(TAG)) {
            Logger.m501d(TAG, String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i9), Integer.valueOf(i10), Boolean.valueOf(z9), Integer.valueOf(i11)));
        }
        return i11;
    }

    public static int surfaceRotationToDegrees(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 1) {
            return 90;
        }
        if (i9 == 2) {
            return 180;
        }
        if (i9 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i9);
    }
}
