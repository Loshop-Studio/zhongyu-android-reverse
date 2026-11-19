package com.zykj.blackboard.utils;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J&\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J&\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/blackboard/utils/ShapeUtils;", "", "()V", "drawDeleteIconToPath", "Landroid/graphics/Path;", "path", "x", "", "y", "radius", "drawNewRotateIconToPath", "drawNewScaleIconToPath", "drawRotateIconToPath", "drawScaleIconToPath", "drawTickInRectFToPath", "rectF", "Landroid/graphics/RectF;", "drawTranslateIconToPath", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ShapeUtils {

    @NotNull
    public static final ShapeUtils INSTANCE = new ShapeUtils();

    private ShapeUtils() {
    }

    @NotNull
    public final Path drawDeleteIconToPath(@NotNull Path path, float x3, float y2, float radius) {
        AbstractC5830k.m5330g(path, "path");
        path.addCircle(x3, y2, radius, Path.Direction.CW);
        float f = radius * 0.4f;
        float f7 = x3 - f;
        float f8 = y2 - f;
        path.moveTo(f7, f8);
        float f9 = x3 + f;
        float f10 = y2 + f;
        path.lineTo(f9, f10);
        path.moveTo(f9, f8);
        path.lineTo(f7, f10);
        return path;
    }

    @NotNull
    public final Path drawNewRotateIconToPath(@NotNull Path path, float x3, float y2, float radius) {
        AbstractC5830k.m5330g(path, "path");
        float f = 2;
        float f7 = ((radius * f) / 3) / f;
        float f8 = radius / f;
        float f9 = 1.73205f * f8;
        RectF rectF = new RectF(x3 - radius, y2 - radius, x3 + radius, radius + y2);
        path.addArc(rectF, 30.0f, 120.0f);
        float f10 = x3 - f9;
        float f11 = y2 - f8;
        path.moveTo(f10, f11 - f7);
        path.lineTo(f10, f11);
        path.lineTo(f10 + f7, f11);
        path.addArc(rectF, 30.0f - 180, 120.0f);
        float f12 = f9 + x3;
        float f13 = f8 + y2;
        path.moveTo(f12, f13 + f7);
        path.lineTo(f12, f13);
        path.lineTo(f12 - f7, f13);
        path.addRect(x3 - f7, y2 - f7, x3 + f7, y2 + f7, Path.Direction.CW);
        return path;
    }

    @NotNull
    public final Path drawNewScaleIconToPath(@NotNull Path path, float x3, float y2, float radius) {
        AbstractC5830k.m5330g(path, "path");
        path.addCircle(x3, y2, radius, Path.Direction.CW);
        float f = radius * 0.5f;
        float f7 = x3 - f;
        float f8 = y2 - f;
        path.moveTo(f7, f8);
        float f9 = x3 + f;
        float f10 = f + y2;
        path.lineTo(f9, f10);
        path.moveTo(f7, y2);
        path.lineTo(f7, f8);
        path.lineTo(x3, f8);
        path.moveTo(f9, y2);
        path.lineTo(f9, f10);
        path.lineTo(x3, f10);
        return path;
    }

    @NotNull
    public final Path drawRotateIconToPath(@NotNull Path path, float x3, float y2, float radius) {
        AbstractC5830k.m5330g(path, "path");
        path.addCircle(x3, y2, radius, Path.Direction.CW);
        float f = radius * 0.5f;
        float f7 = 0.7f * f;
        float f8 = 180 - 30.0f;
        float f9 = x3 - f;
        float f10 = y2 - f;
        float f11 = x3 + f;
        float f12 = f + y2;
        path.addArc(new RectF(f9, f10, f11, f12), 30.0f, f8);
        path.moveTo(f9, y2 + f7);
        path.lineTo(f9, y2);
        path.addArc(new RectF(f9, f10, f11, f12), 0.0f, -f8);
        path.moveTo(f11, y2 - f7);
        path.lineTo(f11, y2);
        return path;
    }

    @NotNull
    public final Path drawScaleIconToPath(@NotNull Path path, float x3, float y2, float radius) {
        AbstractC5830k.m5330g(path, "path");
        path.addCircle(x3, y2, radius, Path.Direction.CW);
        float f = 0.5f * radius;
        float f7 = radius * 0.1f;
        float f8 = 0.7f * f;
        float f9 = x3 - f;
        float f10 = y2 - f;
        path.moveTo(f9, f10);
        path.lineTo(x3 - f7, y2 - f7);
        path.moveTo(f9 + f8, f10);
        path.lineTo(f9, f10);
        path.lineTo(f9, f10 + f8);
        float f11 = x3 + f;
        float f12 = f + y2;
        path.moveTo(f11, f12);
        path.lineTo(x3 + f7, y2 + f7);
        path.moveTo(f11 - f8, f12);
        path.lineTo(f11, f12);
        float f13 = f12 - f8;
        path.lineTo(f11, f13);
        path.moveTo(f11, f13);
        return path;
    }

    @NotNull
    public final Path drawTickInRectFToPath(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        Path path = new Path();
        path.moveTo((rectF.width() * 0.25f) + rectF.left, (rectF.height() * 0.5f) + rectF.top);
        path.lineTo((rectF.width() * 0.417f) + rectF.left, (rectF.height() * 0.667f) + rectF.top);
        path.lineTo((rectF.width() * 0.75f) + rectF.left, (rectF.height() * 0.292f) + rectF.top);
        return path;
    }

    @NotNull
    public final Path drawTranslateIconToPath(@NotNull Path path, float x3, float y2, float radius) {
        AbstractC5830k.m5330g(path, "path");
        path.addRect(x3 - radius, y2 - radius, x3 + radius, y2 + radius, Path.Direction.CW);
        return path;
    }
}
