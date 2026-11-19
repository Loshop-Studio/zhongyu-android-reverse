package androidx.camera.core.impl.utils;

import android.support.v4.media.AbstractC0037f;
import androidx.camera.core.Logger;

/* loaded from: classes.dex */
public final class CameraOrientationUtil {
    private static final String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalStateException(AbstractC0037f.m81f(i, "Invalid sensor rotation: "));
    }

    public static int getRelativeImageRotation(int i, int i8, boolean z8) {
        int i9 = z8 ? ((i8 - i) + 360) % 360 : (i8 + i) % 360;
        if (Logger.isVerboseEnabled(TAG)) {
            StringBuilder sbM99x = AbstractC0037f.m99x("getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", i, ", isOppositeFacing=", i8);
            sbM99x.append(z8);
            sbM99x.append(", result=");
            sbM99x.append(i9);
            Logger.m585d(TAG, sbM99x.toString());
        }
        return i9;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Unsupported surface rotation: "));
    }
}
