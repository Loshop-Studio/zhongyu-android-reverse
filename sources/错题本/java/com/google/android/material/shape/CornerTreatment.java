package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f, float f7, @NonNull ShapePath shapePath) {
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f7, float f8) {
        getCornerPath(f, f7, shapePath);
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f7, @NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        getCornerPath(shapePath, f, f7, cornerSize.getCornerSize(rectF));
    }
}
