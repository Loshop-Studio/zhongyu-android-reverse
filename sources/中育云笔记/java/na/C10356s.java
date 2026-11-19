package na;

import android.graphics.Path;
import android.graphics.RectF;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: na.s */
/* loaded from: classes5.dex */
public final class C10356s {

    /* renamed from: a */
    public static final C10356s f24665a = new C10356s();

    /* renamed from: a */
    public final Path m21678a(Path path, float f10, float f11, float f12) {
        AbstractC9979u.m20294g(path, "path");
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
    public final Path m21679b(Path path, float f10, float f11, float f12) {
        AbstractC9979u.m20294g(path, "path");
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
        path.addArc(rectF, 30.0f - Opcodes.GETFIELD, 120.0f);
        float f19 = f16 + f10;
        float f20 = f15 + f11;
        path.moveTo(f19, f20 + f14);
        path.lineTo(f19, f20);
        path.lineTo(f19 - f14, f20);
        path.addRect(f10 - f14, f11 - f14, f10 + f14, f11 + f14, Path.Direction.CW);
        return path;
    }

    /* renamed from: c */
    public final Path m21680c(Path path, float f10, float f11, float f12) {
        AbstractC9979u.m20294g(path, "path");
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
    public final Path m21681d(Path path, float f10, float f11, float f12) {
        AbstractC9979u.m20294g(path, "path");
        path.addCircle(f10, f11, f12, Path.Direction.CW);
        float f13 = f12 * 0.5f;
        float f14 = 0.7f * f13;
        float f15 = Opcodes.GETFIELD - 30.0f;
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
    public final Path m21682e(Path path, float f10, float f11, float f12) {
        AbstractC9979u.m20294g(path, "path");
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
    public final Path m21683f(RectF rectF) {
        AbstractC9979u.m20294g(rectF, "rectF");
        Path path = new Path();
        path.moveTo(rectF.left + (rectF.width() * 0.125f), rectF.top + (rectF.height() * 0.5625f));
        path.lineTo(rectF.left + (rectF.width() * 0.3833f), rectF.top + (rectF.height() * 0.7917f));
        path.lineTo(rectF.left + (rectF.width() * 0.875f), rectF.top + (rectF.height() * 0.25f));
        return path;
    }
}
