package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f6, float f7, @NonNull ShapePath shapePath) {
        getEdgePath(f6, f6 / 2.0f, f7, shapePath);
    }

    public void getEdgePath(float f6, float f7, float f8, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f6, 0.0f);
    }
}
