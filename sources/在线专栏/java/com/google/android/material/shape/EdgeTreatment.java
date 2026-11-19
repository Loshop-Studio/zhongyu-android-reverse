package com.google.android.material.shape;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class EdgeTreatment {
    boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f4, float f5, ShapePath shapePath) {
        getEdgePath(f4, f4 / 2.0f, f5, shapePath);
    }

    public void getEdgePath(float f4, float f5, float f6, ShapePath shapePath) {
        shapePath.lineTo(f4, IGoodView.DEFAULT_TO_ALPHA);
    }
}
