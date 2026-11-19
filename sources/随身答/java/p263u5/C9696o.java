package p263u5;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.o */
/* loaded from: classes4.dex */
public final class C9696o {

    /* renamed from: a */
    public static final C9696o f17133a = new C9696o();

    /* renamed from: b */
    public static final float[] f17134b = new float[2];

    /* renamed from: c */
    public static final float[] f17135c = new float[2];

    /* renamed from: a */
    public final float m16203a(PointF p12, PointF p22, PointF p9) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        Intrinsics.checkNotNullParameter(p9, "p");
        float f10 = p22.x;
        float f11 = p12.x;
        float f12 = p9.y;
        float f13 = p12.y;
        return ((f10 - f11) * (f12 - f13)) - ((p9.x - f11) * (p22.y - f13));
    }

    /* renamed from: b */
    public final boolean m16204b(PointF leftTop, PointF rightTop, PointF rightBottom, PointF leftBottom, PointF p9) {
        Intrinsics.checkNotNullParameter(leftTop, "leftTop");
        Intrinsics.checkNotNullParameter(rightTop, "rightTop");
        Intrinsics.checkNotNullParameter(rightBottom, "rightBottom");
        Intrinsics.checkNotNullParameter(leftBottom, "leftBottom");
        Intrinsics.checkNotNullParameter(p9, "p");
        return m16203a(leftTop, leftBottom, p9) * m16203a(rightBottom, rightTop, p9) >= 0.0f && m16203a(leftBottom, rightBottom, p9) * m16203a(rightTop, leftTop, p9) >= 0.0f;
    }

    /* renamed from: c */
    public final boolean m16205c(RectF rectF, Matrix matrix, PointF p9) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(p9, "p");
        return m16204b(m16206d(rectF.left, rectF.top, matrix), m16206d(rectF.right, rectF.top, matrix), m16206d(rectF.right, rectF.bottom, matrix), m16206d(rectF.left, rectF.bottom, matrix), p9);
    }

    /* renamed from: d */
    public final PointF m16206d(float f10, float f11, Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return m16207e(new PointF(f10, f11), matrix);
    }

    /* renamed from: e */
    public final PointF m16207e(PointF pointF, Matrix matrix) {
        Intrinsics.checkNotNullParameter(pointF, "pointF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArr = f17134b;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float[] fArr2 = f17135c;
        float f10 = pointF.x;
        fArr2[0] = f10;
        float f11 = pointF.y;
        fArr2[1] = f11;
        matrix.mapPoints(fArr, new float[]{f10, f11});
        return new PointF(fArr[0], fArr[1]);
    }
}
