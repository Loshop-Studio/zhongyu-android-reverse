package p263u5;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.s */
/* loaded from: classes4.dex */
public final class C9700s {

    /* renamed from: a */
    public static final C9700s f17138a = new C9700s();

    /* renamed from: a */
    public final Path m16213a(Path path, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(path, "path");
        path.addCircle(f10, f11, f12, Path.Direction.CW);
        float f13 = f12 * 0.4f;
        float f14 = f10 - f13;
        float f15 = f11 - f13;
        path.moveTo(f14, f15);
        float f16 = f10 + f13;
        float f17 = f11 + f13;
        path.lineTo(f16, f17);
        path.moveTo(f16, f15);
        path.lineTo(f14, f17);
        return path;
    }

    /* renamed from: b */
    public final Path m16214b(Path path, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(path, "path");
        float f13 = 2;
        float f14 = ((f12 * f13) / 3) / f13;
        float f15 = f12 / f13;
        float f16 = 1.73205f * f15;
        RectF rectF = new RectF(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        path.addArc(rectF, 30.0f, 120.0f);
        float f17 = f10 - f16;
        float f18 = f11 - f15;
        path.moveTo(f17, f18 - f14);
        path.lineTo(f17, f18);
        path.lineTo(f17 + f14, f18);
        path.addArc(rectF, 30.0f - 180, 120.0f);
        float f19 = f16 + f10;
        float f20 = f15 + f11;
        path.moveTo(f19, f20 + f14);
        path.lineTo(f19, f20);
        path.lineTo(f19 - f14, f20);
        path.addRect(f10 - f14, f11 - f14, f10 + f14, f11 + f14, Path.Direction.CW);
        return path;
    }

    /* renamed from: c */
    public final Path m16215c(Path path, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(path, "path");
        path.addCircle(f10, f11, f12, Path.Direction.CW);
        float f13 = f12 * 0.5f;
        float f14 = f10 - f13;
        float f15 = f11 - f13;
        path.moveTo(f14, f15);
        float f16 = f10 + f13;
        float f17 = f13 + f11;
        path.lineTo(f16, f17);
        path.moveTo(f14, f11);
        path.lineTo(f14, f15);
        path.lineTo(f10, f15);
        path.moveTo(f16, f11);
        path.lineTo(f16, f17);
        path.lineTo(f10, f17);
        return path;
    }

    /* renamed from: d */
    public final Path m16216d(Path path, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(path, "path");
        path.addCircle(f10, f11, f12, Path.Direction.CW);
        float f13 = f12 * 0.5f;
        float f14 = 0.7f * f13;
        float f15 = 180 - 30.0f;
        float f16 = f10 - f13;
        float f17 = f11 - f13;
        float f18 = f10 + f13;
        float f19 = f13 + f11;
        path.addArc(new RectF(f16, f17, f18, f19), 30.0f, f15);
        path.moveTo(f16, f11 + f14);
        path.lineTo(f16, f11);
        path.addArc(new RectF(f16, f17, f18, f19), 0.0f, -f15);
        path.moveTo(f18, f11 - f14);
        path.lineTo(f18, f11);
        return path;
    }

    /* renamed from: e */
    public final Path m16217e(Path path, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(path, "path");
        path.addCircle(f10, f11, f12, Path.Direction.CW);
        float f13 = 0.5f * f12;
        float f14 = f12 * 0.1f;
        float f15 = 0.7f * f13;
        float f16 = f10 - f13;
        float f17 = f11 - f13;
        path.moveTo(f16, f17);
        path.lineTo(f10 - f14, f11 - f14);
        path.moveTo(f16 + f15, f17);
        path.lineTo(f16, f17);
        path.lineTo(f16, f17 + f15);
        float f18 = f10 + f13;
        float f19 = f13 + f11;
        path.moveTo(f18, f19);
        path.lineTo(f10 + f14, f11 + f14);
        path.moveTo(f18 - f15, f19);
        path.lineTo(f18, f19);
        float f20 = f19 - f15;
        path.lineTo(f18, f20);
        path.moveTo(f18, f20);
        return path;
    }

    /* renamed from: f */
    public final Path m16218f(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Path path = new Path();
        path.moveTo(rectF.left + (rectF.width() * 0.25f), rectF.top + (rectF.height() * 0.5f));
        path.lineTo(rectF.left + (rectF.width() * 0.417f), rectF.top + (rectF.height() * 0.667f));
        path.lineTo(rectF.left + (rectF.width() * 0.75f), rectF.top + (rectF.height() * 0.292f));
        return path;
    }
}
