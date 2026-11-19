package com.zykj.blackboard.utils;

import android.graphics.Path;
import android.graphics.RectF;
import com.tencent.rtmp.TXLiveConstants;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ShapeUtils {
    public static final ShapeUtils INSTANCE = new ShapeUtils();

    private ShapeUtils() {
    }

    public final Path drawDeleteIconToPath(Path path, float f10, float f11, float f12) {
        AbstractC9133u.m16133g(path, "path");
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

    public final Path drawNewRotateIconToPath(Path path, float f10, float f11, float f12) {
        AbstractC9133u.m16133g(path, "path");
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
        path.addArc(rectF, 30.0f - TXLiveConstants.RENDER_ROTATION_180, 120.0f);
        float f19 = f16 + f10;
        float f20 = f15 + f11;
        path.moveTo(f19, f20 + f14);
        path.lineTo(f19, f20);
        path.lineTo(f19 - f14, f20);
        path.addRect(f10 - f14, f11 - f14, f10 + f14, f11 + f14, Path.Direction.CW);
        return path;
    }

    public final Path drawNewScaleIconToPath(Path path, float f10, float f11, float f12) {
        AbstractC9133u.m16133g(path, "path");
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

    public final Path drawRotateIconToPath(Path path, float f10, float f11, float f12) {
        AbstractC9133u.m16133g(path, "path");
        path.addCircle(f10, f11, f12, Path.Direction.CW);
        float f13 = f12 * 0.5f;
        float f14 = 0.7f * f13;
        float f15 = TXLiveConstants.RENDER_ROTATION_180 - 30.0f;
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

    public final Path drawScaleIconToPath(Path path, float f10, float f11, float f12) {
        AbstractC9133u.m16133g(path, "path");
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

    public final Path drawTickInRectFToPath(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        Path path = new Path();
        path.moveTo(rectF.left + (rectF.width() * 0.125f), rectF.top + (rectF.height() * 0.5625f));
        path.lineTo(rectF.left + (rectF.width() * 0.3833f), rectF.top + (rectF.height() * 0.7917f));
        path.lineTo(rectF.left + (rectF.width() * 0.875f), rectF.top + (rectF.height() * 0.25f));
        return path;
    }

    public final Path drawTranslateIconToPath(Path path, float f10, float f11, float f12) {
        AbstractC9133u.m16133g(path, "path");
        path.addRect(f10 - f12, f11 - f12, f10 + f12, f11 + f12, Path.Direction.CW);
        return path;
    }
}
