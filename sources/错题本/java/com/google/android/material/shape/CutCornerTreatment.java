package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f7, float f8) {
        shapePath.reset(0.0f, f8 * f7, 180.0f, 180.0f - f);
        double d9 = f8;
        double d10 = f7;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f)) * d9 * d10), (float) (Math.sin(Math.toRadians(90.0f - f)) * d9 * d10));
    }

    @Deprecated
    public CutCornerTreatment(float f) {
        this.size = f;
    }
}
