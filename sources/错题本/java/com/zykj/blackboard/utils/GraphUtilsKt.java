package com.zykj.blackboard.utils;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyPointF$PointF;
import com.zykj.board.EzyRectF$RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p020b4.C3116b1;
import p020b4.C3157p0;
import p020b4.C3172u0;

@Metadata(m5109d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\r\u001a\u00020\b*\u00020\u0007\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\n¨\u0006\u000f"}, m5110d2 = {"covertEzyPaint", "Lcom/zykj/board/EzyPaint$Paint;", "Landroid/graphics/Paint;", "paintItemLength", "", "paintSpacing", "covertEzyPointF", "Lcom/zykj/board/EzyPointF$PointF;", "Landroid/graphics/PointF;", "covertEzyRectF", "Lcom/zykj/board/EzyRectF$RectF;", "Landroid/graphics/RectF;", "covertPaint", "covertPointF", "covertRectF", "blackboard_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphUtilsKt {
    @NotNull
    public static final EzyPaint$Paint covertEzyPaint(@NotNull Paint paint, float f, float f7) {
        AbstractC5830k.m5330g(paint, "<this>");
        C3157p0 c3157p0NewBuilder = EzyPaint$Paint.newBuilder();
        c3157p0NewBuilder.m2103i(paint.getColor());
        c3157p0NewBuilder.m2108n(paint.getStrokeWidth());
        c3157p0NewBuilder.m2104j(f);
        c3157p0NewBuilder.m2105k(f7);
        c3157p0NewBuilder.m2106l(paint.getStyle().ordinal());
        c3157p0NewBuilder.m2107m(paint.getTextSize());
        return c3157p0NewBuilder.build();
    }

    @NotNull
    public static final EzyPointF$PointF covertEzyPointF(@NotNull PointF pointF) {
        AbstractC5830k.m5330g(pointF, "<this>");
        C3172u0 c3172u0NewBuilder = EzyPointF$PointF.newBuilder();
        c3172u0NewBuilder.m2130i(pointF.x);
        c3172u0NewBuilder.m2131j(pointF.y);
        return c3172u0NewBuilder.build();
    }

    @NotNull
    public static final EzyRectF$RectF covertEzyRectF(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "<this>");
        C3116b1 c3116b1NewBuilder = EzyRectF$RectF.newBuilder();
        c3116b1NewBuilder.m2091j(rectF.left);
        c3116b1NewBuilder.m2093l(rectF.top);
        c3116b1NewBuilder.m2092k(rectF.right);
        c3116b1NewBuilder.m2090i(rectF.bottom);
        return c3116b1NewBuilder.build();
    }

    @NotNull
    public static final Paint covertPaint(@NotNull EzyPaint$Paint ezyPaint$Paint) {
        AbstractC5830k.m5330g(ezyPaint$Paint, "<this>");
        Paint paint = new Paint();
        paint.setColor(ezyPaint$Paint.getColor());
        paint.setStrokeWidth(ezyPaint$Paint.getWidth());
        if (ezyPaint$Paint.getSpacing() != 0.0f) {
            paint.setPathEffect(new DashPathEffect(new float[]{ezyPaint$Paint.getItemLength(), ezyPaint$Paint.getSpacing()}, 0.0f));
        }
        int style = ezyPaint$Paint.getStyle();
        paint.setStyle(style != 0 ? style != 1 ? Paint.Style.FILL_AND_STROKE : Paint.Style.STROKE : Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setTextSize(ezyPaint$Paint.getTextSize());
        paint.setDither(true);
        paint.setAntiAlias(true);
        return paint;
    }

    @NotNull
    public static final PointF covertPointF(@NotNull EzyPointF$PointF ezyPointF$PointF) {
        AbstractC5830k.m5330g(ezyPointF$PointF, "<this>");
        return new PointF(ezyPointF$PointF.getX(), ezyPointF$PointF.getY());
    }

    @NotNull
    public static final RectF covertRectF(@NotNull EzyRectF$RectF ezyRectF$RectF) {
        AbstractC5830k.m5330g(ezyRectF$RectF, "<this>");
        return new RectF(ezyRectF$RectF.getLeft(), ezyRectF$RectF.getTop(), ezyRectF$RectF.getRight(), ezyRectF$RectF.getBottom());
    }
}
