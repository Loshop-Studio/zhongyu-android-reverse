package com.zykj.paint.extensions;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.paint.graphic.Graph;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001\u001a\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\n"}, m5110d2 = {"inverts", "Landroid/graphics/Matrix;", "mapPoint", "Landroid/graphics/PointF;", "pointF", "Lcom/zykj/paint/graphic/Graph;", "matrix", "x", "", "y", "paint_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphExtKt {
    @NotNull
    public static final Matrix inverts(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        return matrix2;
    }

    @NotNull
    public static final PointF mapPoint(@NotNull Graph graph, float f, float f7, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graph, "<this>");
        AbstractC5830k.m5330g(matrix, "matrix");
        return mapPoint(graph, new PointF(f, f7), matrix);
    }

    @NotNull
    public static final PointF mapPoint(@NotNull Graph graph, @NotNull PointF pointF, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graph, "<this>");
        AbstractC5830k.m5330g(pointF, "pointF");
        AbstractC5830k.m5330g(matrix, "matrix");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        return new PointF(fArr[0], fArr[1]);
    }

    @NotNull
    public static final PointF mapPoint(@NotNull Matrix matrix, @NotNull PointF pointF) {
        AbstractC5830k.m5330g(matrix, "<this>");
        AbstractC5830k.m5330g(pointF, "pointF");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        return new PointF(fArr[0], fArr[1]);
    }
}
