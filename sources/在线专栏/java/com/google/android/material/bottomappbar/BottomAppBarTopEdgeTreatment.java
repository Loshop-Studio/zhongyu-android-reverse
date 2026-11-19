package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private float cradleVerticalOffset;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f4, float f5, float f6) {
        this.fabMargin = f4;
        this.roundedCornerRadius = f5;
        setCradleVerticalOffset(f6);
        this.horizontalOffset = IGoodView.DEFAULT_TO_ALPHA;
    }

    float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f4, float f5, float f6, ShapePath shapePath) {
        float f7 = this.fabDiameter;
        if (f7 == IGoodView.DEFAULT_TO_ALPHA) {
            shapePath.lineTo(f4, IGoodView.DEFAULT_TO_ALPHA);
            return;
        }
        float f8 = ((this.fabMargin * 2.0f) + f7) / 2.0f;
        float f9 = f6 * this.roundedCornerRadius;
        float f10 = f5 + this.horizontalOffset;
        float f11 = (this.cradleVerticalOffset * f6) + ((1.0f - f6) * f8);
        if (f11 / f8 >= 1.0f) {
            shapePath.lineTo(f4, IGoodView.DEFAULT_TO_ALPHA);
            return;
        }
        float f12 = f8 + f9;
        float f13 = f11 + f9;
        float fSqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f10 - fSqrt;
        float f15 = f10 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f13));
        float f16 = 90.0f - degrees;
        shapePath.lineTo(f14, IGoodView.DEFAULT_TO_ALPHA);
        float f17 = f9 * 2.0f;
        shapePath.addArc(f14 - f9, IGoodView.DEFAULT_TO_ALPHA, f14 + f9, f17, 270.0f, degrees);
        shapePath.addArc(f10 - f8, (-f8) - f11, f10 + f8, f8 - f11, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        shapePath.addArc(f15 - f9, IGoodView.DEFAULT_TO_ALPHA, f15 + f9, f17, 270.0f - degrees, degrees);
        shapePath.lineTo(f4, IGoodView.DEFAULT_TO_ALPHA);
    }

    float getFabCradleMargin() {
        return this.fabMargin;
    }

    float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    void setCradleVerticalOffset(float f4) {
        if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f4;
    }

    void setFabCradleMargin(float f4) {
        this.fabMargin = f4;
    }

    void setFabCradleRoundedCornerRadius(float f4) {
        this.roundedCornerRadius = f4;
    }

    public void setFabDiameter(float f4) {
        this.fabDiameter = f4;
    }

    void setHorizontalOffset(float f4) {
        this.horizontalOffset = f4;
    }
}
