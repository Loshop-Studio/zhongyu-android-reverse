package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public abstract class MeteringPointFactory {

    @Nullable
    private Rational mSurfaceAspectRatio;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MeteringPointFactory() {
        this(null);
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract PointF convertPoint(float f, float f7);

    @NonNull
    public final MeteringPoint createPoint(float f, float f7) {
        return createPoint(f, f7, getDefaultPointSize());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSurfaceAspectRatio(@NonNull Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MeteringPointFactory(@Nullable Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    @NonNull
    public final MeteringPoint createPoint(float f, float f7, float f8) {
        PointF pointFConvertPoint = convertPoint(f, f7);
        return new MeteringPoint(pointFConvertPoint.x, pointFConvertPoint.y, f8, this.mSurfaceAspectRatio);
    }
}
