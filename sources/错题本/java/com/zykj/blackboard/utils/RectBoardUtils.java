package com.zykj.blackboard.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, m5110d2 = {"Lcom/zykj/blackboard/utils/RectBoardUtils;", "", "()V", "getSelectActionRectBoardPath", "Landroid/graphics/Path;", "rectF", "Landroid/graphics/RectF;", "matrix", "Landroid/graphics/Matrix;", "iconWidth", "", "getTextActionRectBoardPath", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RectBoardUtils {

    @NotNull
    public static final RectBoardUtils INSTANCE = new RectBoardUtils();

    private RectBoardUtils() {
    }

    @NotNull
    public final Path getSelectActionRectBoardPath(@NotNull RectF rectF, @NotNull Matrix matrix, float iconWidth) {
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        Path path = new Path();
        float fMapRadius = (iconWidth / 2) / matrix.mapRadius(1.0f);
        path.moveTo(rectF.left + fMapRadius, rectF.top);
        path.lineTo(rectF.right - fMapRadius, rectF.top);
        path.moveTo(rectF.right, rectF.top + fMapRadius);
        path.lineTo(rectF.right, rectF.bottom - fMapRadius);
        path.moveTo(rectF.right - fMapRadius, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.moveTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left, rectF.top + fMapRadius);
        ShapeUtils shapeUtils = ShapeUtils.INSTANCE;
        shapeUtils.drawRotateIconToPath(path, rectF.left, rectF.top, fMapRadius);
        shapeUtils.drawDeleteIconToPath(path, rectF.right, rectF.top, fMapRadius);
        shapeUtils.drawScaleIconToPath(path, rectF.right, rectF.bottom, fMapRadius);
        path.transform(matrix);
        return path;
    }

    @NotNull
    public final Path getTextActionRectBoardPath(@NotNull RectF rectF, @NotNull Matrix matrix, float iconWidth) {
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        Path path = new Path();
        float f = 2;
        float fMapRadius = (iconWidth / f) / matrix.mapRadius(1.0f);
        path.moveTo(rectF.left, rectF.top);
        path.lineTo(rectF.right - fMapRadius, rectF.top);
        path.moveTo(rectF.right, rectF.top + fMapRadius);
        path.lineTo(rectF.right, rectF.bottom);
        path.moveTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.moveTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left, rectF.top);
        ShapeUtils.INSTANCE.drawDeleteIconToPath(path, rectF.right, rectF.top, fMapRadius);
        float f7 = fMapRadius / f;
        path.moveTo(rectF.right, rectF.bottom - f7);
        path.lineTo(rectF.right - f7, rectF.bottom);
        path.moveTo(rectF.right, rectF.bottom - fMapRadius);
        path.lineTo(rectF.right - fMapRadius, rectF.bottom);
        path.transform(matrix);
        return path;
    }
}
