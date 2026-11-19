package androidx.camera.core;

import android.graphics.PointF;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public final class DisplayOrientedMeteringPointFactory extends MeteringPointFactory {

    @NonNull
    private final CameraInfo mCameraInfo;

    @NonNull
    private final Display mDisplay;
    private final float mHeight;
    private final float mWidth;

    public DisplayOrientedMeteringPointFactory(@NonNull Display display, @NonNull CameraInfo cameraInfo, float f10, float f11) {
        this.mWidth = f10;
        this.mHeight = f11;
        this.mDisplay = display;
        this.mCameraInfo = cameraInfo;
    }

    private int getRelativeCameraOrientation(boolean z9) {
        try {
            int sensorRotationDegrees = this.mCameraInfo.getSensorRotationDegrees(this.mDisplay.getRotation());
            return z9 ? (360 - sensorRotationDegrees) % 360 : sensorRotationDegrees;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PointF convertPoint(float f10, float f11) {
        float f12 = this.mWidth;
        float f13 = this.mHeight;
        boolean z9 = this.mCameraInfo.getLensFacing() == 0;
        int relativeCameraOrientation = getRelativeCameraOrientation(z9);
        if (relativeCameraOrientation != 90 && relativeCameraOrientation != 270) {
            f11 = f10;
            f10 = f11;
            f13 = f12;
            f12 = f13;
        }
        if (relativeCameraOrientation == 90) {
            f10 = f12 - f10;
        } else if (relativeCameraOrientation == 180) {
            f11 = f13 - f11;
            f10 = f12 - f10;
        } else if (relativeCameraOrientation == 270) {
            f11 = f13 - f11;
        }
        if (z9) {
            f11 = f13 - f11;
        }
        return new PointF(f11 / f13, f10 / f12);
    }
}
