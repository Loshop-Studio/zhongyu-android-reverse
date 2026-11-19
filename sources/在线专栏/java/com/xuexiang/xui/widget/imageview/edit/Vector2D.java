package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.PointF;

/* loaded from: classes.dex */
class Vector2D extends PointF {
    Vector2D() {
    }

    static float getAngle(Vector2D vector2D, Vector2D vector2D2) {
        vector2D.normalize();
        vector2D2.normalize();
        return (float) ((Math.atan2(((PointF) vector2D2).y, ((PointF) vector2D2).x) - Math.atan2(((PointF) vector2D).y, ((PointF) vector2D).x)) * 57.29577951308232d);
    }

    private void normalize() {
        float f4 = ((PointF) this).x;
        float f5 = ((PointF) this).y;
        float fSqrt = (float) Math.sqrt((f4 * f4) + (f5 * f5));
        ((PointF) this).x /= fSqrt;
        ((PointF) this).y /= fSqrt;
    }

    public Vector2D(float f4, float f5) {
        super(f4, f5);
    }
}
