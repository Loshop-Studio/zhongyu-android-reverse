package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f6, float f7, float f8) {
        shapePath.reset(0.0f, f8 * f7, 180.0f, 180.0f - f6);
        double d6 = f8;
        double d7 = f7;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f6)) * d6 * d7), (float) (Math.sin(Math.toRadians(90.0f - f6)) * d6 * d7));
    }

    @Deprecated
    public CutCornerTreatment(float f6) {
        this.size = f6;
    }
}
