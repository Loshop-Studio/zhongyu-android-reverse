package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;

/* loaded from: classes4.dex */
public class ResultPoint {

    /* renamed from: x */
    private final float f4062x;

    /* renamed from: y */
    private final float f4063y;

    public ResultPoint(float f10, float f11) {
        this.f4062x = f10;
        this.f4063y = f11;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f10 = resultPoint2.f4062x;
        float f11 = resultPoint2.f4063y;
        return ((resultPoint3.f4062x - f10) * (resultPoint.f4063y - f11)) - ((resultPoint3.f4063y - f11) * (resultPoint.f4062x - f10));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f4062x, resultPoint.f4063y, resultPoint2.f4062x, resultPoint2.f4063y);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float fDistance = distance(resultPointArr[0], resultPointArr[1]);
        float fDistance2 = distance(resultPointArr[1], resultPointArr[2]);
        float fDistance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (fDistance2 >= fDistance && fDistance2 >= fDistance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (fDistance3 < fDistance2 || fDistance3 < fDistance) {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        } else {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f4062x == resultPoint.f4062x && this.f4063y == resultPoint.f4063y) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f4062x;
    }

    public final float getY() {
        return this.f4063y;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f4062x) * 31) + Float.floatToIntBits(this.f4063y);
    }

    public final String toString() {
        return "(" + this.f4062x + ',' + this.f4063y + ')';
    }
}
