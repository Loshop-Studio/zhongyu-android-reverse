package com.google.android.material.shape;

/* loaded from: classes.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float f4) {
        this.radius = f4 - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    boolean forceIntersection() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f4, float f5, float f6, ShapePath shapePath) {
        float fSqrt = (float) ((this.radius * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.radius, 2.0d) - Math.pow(fSqrt, 2.0d));
        shapePath.reset(f5 - fSqrt, ((float) (-((this.radius * Math.sqrt(2.0d)) - this.radius))) + fSqrt2);
        shapePath.lineTo(f5, (float) (-((this.radius * Math.sqrt(2.0d)) - this.radius)));
        shapePath.lineTo(f5 + fSqrt, ((float) (-((this.radius * Math.sqrt(2.0d)) - this.radius))) + fSqrt2);
    }
}
