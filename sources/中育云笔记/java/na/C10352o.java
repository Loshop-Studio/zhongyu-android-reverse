package na;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: na.o */
/* loaded from: classes5.dex */
public final class C10352o {

    /* renamed from: a */
    public static final C10352o f24660a = new C10352o();

    /* renamed from: b */
    public static final float[] f24661b = new float[2];

    /* renamed from: c */
    public static final float[] f24662c = new float[2];

    /* renamed from: a */
    public final float m21668a(PointF p12, PointF p22, PointF p10) {
        AbstractC9979u.m20294g(p12, "p1");
        AbstractC9979u.m20294g(p22, "p2");
        AbstractC9979u.m20294g(p10, "p");
        float f10 = p22.x;
        float f11 = p12.x;
        float f12 = p10.y;
        float f13 = p12.y;
        return ((f10 - f11) * (f12 - f13)) - ((p10.x - f11) * (p22.y - f13));
    }

    /* renamed from: b */
    public final boolean m21669b(PointF leftTop, PointF rightTop, PointF rightBottom, PointF leftBottom, PointF p10) {
        AbstractC9979u.m20294g(leftTop, "leftTop");
        AbstractC9979u.m20294g(rightTop, "rightTop");
        AbstractC9979u.m20294g(rightBottom, "rightBottom");
        AbstractC9979u.m20294g(leftBottom, "leftBottom");
        AbstractC9979u.m20294g(p10, "p");
        return m21668a(leftTop, leftBottom, p10) * m21668a(rightBottom, rightTop, p10) >= 0.0f && m21668a(leftBottom, rightBottom, p10) * m21668a(rightTop, leftTop, p10) >= 0.0f;
    }

    /* renamed from: c */
    public final boolean m21670c(RectF rectF, Matrix matrix, PointF p10) {
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(p10, "p");
        return m21669b(m21671d(rectF.left, rectF.top, matrix), m21671d(rectF.right, rectF.top, matrix), m21671d(rectF.right, rectF.bottom, matrix), m21671d(rectF.left, rectF.bottom, matrix), p10);
    }

    /* renamed from: d */
    public final PointF m21671d(float f10, float f11, Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        return m21672e(new PointF(f10, f11), matrix);
    }

    /* renamed from: e */
    public final PointF m21672e(PointF pointF, Matrix matrix) {
        AbstractC9979u.m20294g(pointF, "pointF");
        AbstractC9979u.m20294g(matrix, "matrix");
        float[] fArr = f24661b;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float[] fArr2 = f24662c;
        float f10 = pointF.x;
        fArr2[0] = f10;
        float f11 = pointF.y;
        fArr2[1] = f11;
        matrix.mapPoints(fArr, new float[]{f10, f11});
        return new PointF(fArr[0], fArr[1]);
    }
}
