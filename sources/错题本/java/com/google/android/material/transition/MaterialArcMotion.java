package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* loaded from: classes2.dex */
public final class MaterialArcMotion extends PathMotion {
    private static PointF getControlPoint(float f, float f7, float f8, float f9) {
        return f7 > f9 ? new PointF(f8, f7) : new PointF(f, f9);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(f, f7);
        PointF controlPoint = getControlPoint(f, f7, f8, f9);
        path.quadTo(controlPoint.x, controlPoint.y, f8, f9);
        return path;
    }
}
