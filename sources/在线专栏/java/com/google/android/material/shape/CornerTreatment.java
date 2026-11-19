package com.google.android.material.shape;

import android.graphics.RectF;

/* loaded from: classes.dex */
public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f4, float f5, ShapePath shapePath) {
    }

    public void getCornerPath(ShapePath shapePath, float f4, float f5, float f6) {
        getCornerPath(f4, f5, shapePath);
    }

    public void getCornerPath(ShapePath shapePath, float f4, float f5, RectF rectF, CornerSize cornerSize) {
        getCornerPath(shapePath, f4, f5, cornerSize.getCornerSize(rectF));
    }
}
