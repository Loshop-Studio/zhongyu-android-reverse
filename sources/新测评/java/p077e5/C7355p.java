package p077e5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.p */
/* loaded from: classes4.dex */
public final class C7355p {

    /* renamed from: a */
    public static final C7355p f11924a = new C7355p();

    /* renamed from: a */
    public final Path m11786a(RectF rectF, Matrix matrix, float f10) {
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
        C7357r c7357r = C7357r.f11925a;
        c7357r.m11792d(path, rectF.left, rectF.top, fMapRadius);
        c7357r.m11789a(path, rectF.right, rectF.top, fMapRadius);
        c7357r.m11793e(path, rectF.right, rectF.bottom, fMapRadius);
        path.transform(matrix);
        return path;
    }

    /* renamed from: b */
    public final Path m11787b(RectF rectF, Matrix matrix, float f10) {
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
        C7357r.f11925a.m11789a(path, rectF.right, rectF.top, fMapRadius);
        float f12 = fMapRadius / f11;
        path.moveTo(rectF.right, rectF.bottom - f12);
        path.lineTo(rectF.right - f12, rectF.bottom);
        path.moveTo(rectF.right, rectF.bottom - fMapRadius);
        path.lineTo(rectF.right - fMapRadius, rectF.bottom);
        path.transform(matrix);
        return path;
    }
}
