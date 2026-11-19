package p263u5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.q */
/* loaded from: classes4.dex */
public final class C9698q {

    /* renamed from: a */
    public static final C9698q f17137a = new C9698q();

    /* renamed from: a */
    public final Path m16210a(RectF rectF, Matrix matrix, float f10) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
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
        C9700s c9700s = C9700s.f17138a;
        c9700s.m16216d(path, rectF.left, rectF.top, fMapRadius);
        c9700s.m16213a(path, rectF.right, rectF.top, fMapRadius);
        c9700s.m16217e(path, rectF.right, rectF.bottom, fMapRadius);
        path.transform(matrix);
        return path;
    }

    /* renamed from: b */
    public final Path m16211b(RectF rectF, Matrix matrix, float f10) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
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
        C9700s.f17138a.m16213a(path, rectF.right, rectF.top, fMapRadius);
        float f12 = fMapRadius / f11;
        path.moveTo(rectF.right, rectF.bottom - f12);
        path.lineTo(rectF.right - f12, rectF.bottom);
        path.moveTo(rectF.right, rectF.bottom - fMapRadius);
        path.lineTo(rectF.right - fMapRadius, rectF.bottom);
        path.transform(matrix);
        return path;
    }
}
