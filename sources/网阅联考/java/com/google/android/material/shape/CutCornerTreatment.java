package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f4, float f5, float f6) {
        shapePath.reset(0.0f, f6 * f5, 180.0f, 180.0f - f4);
        double d4 = f6;
        double d5 = f5;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f4)) * d4 * d5), (float) (Math.sin(Math.toRadians(90.0f - f4)) * d4 * d5));
    }

    @Deprecated
    public CutCornerTreatment(float f4) {
        this.size = f4;
    }
}
