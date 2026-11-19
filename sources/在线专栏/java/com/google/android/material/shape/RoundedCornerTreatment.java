package com.google.android.material.shape;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(ShapePath shapePath, float f4, float f5, float f6) {
        shapePath.reset(IGoodView.DEFAULT_TO_ALPHA, f6 * f5, 180.0f, 180.0f - f4);
        float f7 = f6 * 2.0f * f5;
        shapePath.addArc(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f7, f7, 180.0f, f4);
    }

    @Deprecated
    public RoundedCornerTreatment(float f4) {
        this.radius = f4;
    }
}
