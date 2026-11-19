package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f, boolean z8) {
        this.size = f;
        this.inside = z8;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f7, float f8, @NonNull ShapePath shapePath) {
        if (!this.inside) {
            float f9 = this.size;
            shapePath.lineTo(f7 - (f9 * f8), 0.0f, f7, (-f9) * f8);
            shapePath.lineTo((this.size * f8) + f7, 0.0f, f, 0.0f);
        } else {
            shapePath.lineTo(f7 - (this.size * f8), 0.0f);
            float f10 = this.size;
            shapePath.lineTo(f7, f10 * f8, (f10 * f8) + f7, 0.0f);
            shapePath.lineTo(f, 0.0f);
        }
    }
}
