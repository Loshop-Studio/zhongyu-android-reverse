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

    public DisplayOrientedMeteringPointFactory(@NonNull Display display, @NonNull CameraInfo cameraInfo, float f, float f7) {
        this.mWidth = f;
        this.mHeight = f7;
        this.mDisplay = display;
        this.mCameraInfo = cameraInfo;
    }

    private int getRelativeCameraOrientation(boolean z8) {
        try {
            int sensorRotationDegrees = this.mCameraInfo.getSensorRotationDegrees(this.mDisplay.getRotation());
            return z8 ? (360 - sensorRotationDegrees) % 360 : sensorRotationDegrees;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PointF convertPoint(float f, float f7) {
        float f8 = this.mWidth;
        float f9 = this.mHeight;
        boolean z8 = this.mCameraInfo.getLensFacing() == 0;
        int relativeCameraOrientation = getRelativeCameraOrientation(z8);
        if (relativeCameraOrientation != 90 && relativeCameraOrientation != 270) {
            f7 = f;
            f = f7;
            f9 = f8;
            f8 = f9;
        }
        if (relativeCameraOrientation == 90) {
            f = f8 - f;
        } else if (relativeCameraOrientation == 180) {
            f7 = f9 - f7;
            f = f8 - f;
        } else if (relativeCameraOrientation == 270) {
            f7 = f9 - f7;
        }
        if (z8) {
            f7 = f9 - f7;
        }
        return new PointF(f7 / f9, f / f8);
    }
}
