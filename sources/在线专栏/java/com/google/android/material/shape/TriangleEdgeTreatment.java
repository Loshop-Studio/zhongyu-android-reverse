package com.google.android.material.shape;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f4, boolean z3) {
        this.size = f4;
        this.inside = z3;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f4, float f5, float f6, ShapePath shapePath) {
        shapePath.lineTo(f5 - (this.size * f6), IGoodView.DEFAULT_TO_ALPHA);
        shapePath.lineTo(f5, (this.inside ? this.size : -this.size) * f6);
        shapePath.lineTo(f5 + (this.size * f6), IGoodView.DEFAULT_TO_ALPHA);
        shapePath.lineTo(f4, IGoodView.DEFAULT_TO_ALPHA);
    }
}
