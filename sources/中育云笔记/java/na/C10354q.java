package na;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: na.q */
/* loaded from: classes5.dex */
public final class C10354q {

    /* renamed from: a */
    public static final C10354q f24664a = new C10354q();

    /* renamed from: a */
    public final Path m21675a(RectF rectF, Matrix matrix, float f10) {
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        Path path = new Path();
        float fMapRadius = (f10 / 2) / matrix.mapRadius(1.0f);
        path.moveTo(rectF.left + fMapRadius, rectF.top);
        path.lineTo(rectF.right - fMapRadius, rectF.top);
        path.moveTo(rectF.right, rectF.top + fMapRadius);
        path.lineTo(rectF.right, rectF.bottom - fMapRadius);
        path.moveTo(rectF.right - fMapRadius, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.moveTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left, rectF.top + fMapRadius);
        C10356s c10356s = C10356s.f24665a;
        c10356s.m21681d(path, rectF.left, rectF.top, fMapRadius);
        c10356s.m21678a(path, rectF.right, rectF.top, fMapRadius);
        c10356s.m21682e(path, rectF.right, rectF.bottom, fMapRadius);
        path.transform(matrix);
        return path;
    }

    /* renamed from: b */
    public final Path m21676b(RectF rectF, Matrix matrix, float f10) {
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        Path path = new Path();
        float f11 = 2;
        float fMapRadius = (f10 / f11) / matrix.mapRadius(1.0f);
        path.moveTo(rectF.left, rectF.top);
        path.lineTo(rectF.right - fMapRadius, rectF.top);
        path.moveTo(rectF.right, rectF.top + fMapRadius);
        path.lineTo(rectF.right, rectF.bottom);
        path.moveTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.moveTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left, rectF.top);
        C10356s.f24665a.m21678a(path, rectF.right, rectF.top, fMapRadius);
        float f12 = fMapRadius / f11;
        path.moveTo(rectF.right, rectF.bottom - f12);
        path.lineTo(rectF.right - f12, rectF.bottom);
        path.moveTo(rectF.right, rectF.bottom - fMapRadius);
        path.lineTo(rectF.right - fMapRadius, rectF.bottom);
        path.transform(matrix);
        return path;
    }
}
