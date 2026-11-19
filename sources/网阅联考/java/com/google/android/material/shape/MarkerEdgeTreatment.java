package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float f4) {
        this.radius = f4 - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f4, float f5, float f6, @NonNull ShapePath shapePath) {
        float fSqrt = (float) ((this.radius * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.radius, 2.0d) - Math.pow(fSqrt, 2.0d));
        shapePath.reset(f5 - fSqrt, ((float) (-((this.radius * Math.sqrt(2.0d)) - this.radius))) + fSqrt2);
        shapePath.lineTo(f5, (float) (-((this.radius * Math.sqrt(2.0d)) - this.radius)));
        shapePath.lineTo(f5 + fSqrt, ((float) (-((this.radius * Math.sqrt(2.0d)) - this.radius))) + fSqrt2);
    }
}
