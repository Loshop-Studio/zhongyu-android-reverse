package p077e5;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.n */
/* loaded from: classes4.dex */
public final class C7353n {

    /* renamed from: a */
    public static final C7353n f11920a = new C7353n();

    /* renamed from: b */
    public static final float[] f11921b = new float[2];

    /* renamed from: c */
    public static final float[] f11922c = new float[2];

    /* renamed from: a */
    public final float m11780a(PointF p12, PointF p22, PointF p10) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        Intrinsics.checkNotNullParameter(p10, "p");
        float f10 = p22.x;
        float f11 = p12.x;
        float f12 = p10.y;
        float f13 = p12.y;
        return ((f10 - f11) * (f12 - f13)) - ((p10.x - f11) * (p22.y - f13));
    }

    /* renamed from: b */
    public final boolean m11781b(PointF leftTop, PointF rightTop, PointF rightBottom, PointF leftBottom, PointF p10) {
        Intrinsics.checkNotNullParameter(leftTop, "leftTop");
        Intrinsics.checkNotNullParameter(rightTop, "rightTop");
        Intrinsics.checkNotNullParameter(rightBottom, "rightBottom");
        Intrinsics.checkNotNullParameter(leftBottom, "leftBottom");
        Intrinsics.checkNotNullParameter(p10, "p");
        return m11780a(leftTop, leftBottom, p10) * m11780a(rightBottom, rightTop, p10) >= 0.0f && m11780a(leftBottom, rightBottom, p10) * m11780a(rightTop, leftTop, p10) >= 0.0f;
    }

    /* renamed from: c */
    public final boolean m11782c(RectF rectF, Matrix matrix, PointF p10) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(p10, "p");
        return m11781b(m11783d(rectF.left, rectF.top, matrix), m11783d(rectF.right, rectF.top, matrix), m11783d(rectF.right, rectF.bottom, matrix), m11783d(rectF.left, rectF.bottom, matrix), p10);
    }

    /* renamed from: d */
    public final PointF m11783d(float f10, float f11, Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return m11784e(new PointF(f10, f11), matrix);
    }

    /* renamed from: e */
    public final PointF m11784e(PointF pointF, Matrix matrix) {
        Intrinsics.checkNotNullParameter(pointF, "pointF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArr = f11921b;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float[] fArr2 = f11922c;
        float f10 = pointF.x;
        fArr2[0] = f10;
        float f11 = pointF.y;
        fArr2[1] = f11;
        matrix.mapPoints(fArr, new float[]{f10, f11});
        return new PointF(fArr[0], fArr[1]);
    }
}
