package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f6, float f7, @NonNull ShapePath shapePath) {
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f6, float f7, float f8) {
        getCornerPath(f6, f7, shapePath);
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f6, float f7, @NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        getCornerPath(shapePath, f6, f7, cornerSize.getCornerSize(rectF));
    }
}
