package com.xuexiang.xui.widget.textview.badge;

import android.graphics.PointF;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.List;

/* loaded from: classes.dex */
public class MathUtils {
    public static final double CIRCLE_RADIAN = 6.283185307179586d;

    private MathUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void getInnerTangentPoints(PointF pointF, float f4, Double d4, List<PointF> list) {
        float fSin;
        if (d4 != null) {
            double dAtan = (float) Math.atan(d4.doubleValue());
            double d5 = f4;
            float fCos = (float) (Math.cos(dAtan) * d5);
            fSin = (float) (Math.sin(dAtan) * d5);
            f4 = fCos;
        } else {
            fSin = IGoodView.DEFAULT_TO_ALPHA;
        }
        list.add(new PointF(pointF.x + f4, pointF.y + fSin));
        list.add(new PointF(pointF.x - f4, pointF.y - fSin));
    }

    public static float getPointDistance(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    public static int getQuadrant(PointF pointF, PointF pointF2) {
        float f4 = pointF.x;
        float f5 = pointF2.x;
        if (f4 > f5) {
            float f6 = pointF.y;
            float f7 = pointF2.y;
            if (f6 > f7) {
                return 4;
            }
            return f6 < f7 ? 1 : -1;
        }
        if (f4 >= f5) {
            return -1;
        }
        float f8 = pointF.y;
        float f9 = pointF2.y;
        if (f8 > f9) {
            return 3;
        }
        return f8 < f9 ? 2 : -1;
    }

    public static double getTanRadian(double d4, int i4) {
        if (d4 < 0.0d) {
            d4 += 1.5707963267948966d;
        }
        return d4 + ((i4 - 1) * 1.5707963267948966d);
    }

    public static double radianToAngle(double d4) {
        return (d4 / 6.283185307179586d) * 360.0d;
    }
}
