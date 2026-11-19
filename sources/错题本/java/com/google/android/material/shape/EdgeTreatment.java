package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f, float f7, @NonNull ShapePath shapePath) {
        getEdgePath(f, f / 2.0f, f7, shapePath);
    }

    public void getEdgePath(float f, float f7, float f8, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f, 0.0f);
    }
}
