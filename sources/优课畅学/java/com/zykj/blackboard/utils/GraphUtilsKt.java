package com.zykj.blackboard.utils;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class GraphUtilsKt {
    public static final EzyPaint.Paint covertEzyPaint(Paint paint, float f10, float f11) {
        AbstractC9133u.m16133g(paint, "<this>");
        EzyPaint.Paint.C7233b c7233bM8474n = EzyPaint.Paint.m8474n();
        c7233bM8474n.m8497q(paint.getColor());
        c7233bM8474n.m8505y(paint.getStrokeWidth());
        c7233bM8474n.m8499s(f10);
        c7233bM8474n.m8501u(f11);
        c7233bM8474n.m8502v(paint.getStyle().ordinal());
        c7233bM8474n.m8503w(paint.getTextSize());
        EzyPaint.Paint paintBuild = c7233bM8474n.build();
        AbstractC9133u.m16132f(paintBuild, "builder.build()");
        return paintBuild;
    }

    public static final EzyPointF.PointF covertEzyPointF(PointF pointF) {
        AbstractC9133u.m16133g(pointF, "<this>");
        EzyPointF.PointF.C7236b c7236bM8512e = EzyPointF.PointF.m8512e();
        c7236bM8512e.m8534t(pointF.x);
        c7236bM8512e.m8535u(pointF.y);
        EzyPointF.PointF pointFBuild = c7236bM8512e.build();
        AbstractC9133u.m16132f(pointFBuild, "builder.build()");
        return pointFBuild;
    }

    public static final EzyRectF.RectF covertEzyRectF(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "<this>");
        EzyRectF.RectF.C7240b c7240bM8548h = EzyRectF.RectF.m8548h();
        c7240bM8548h.m8569s(rectF.left);
        c7240bM8548h.m8572v(rectF.top);
        c7240bM8548h.m8571u(rectF.right);
        c7240bM8548h.m8567q(rectF.bottom);
        EzyRectF.RectF rectFBuild = c7240bM8548h.build();
        AbstractC9133u.m16132f(rectFBuild, "builder.build()");
        return rectFBuild;
    }

    public static final Paint covertPaint(EzyPaint.Paint paint) {
        AbstractC9133u.m16133g(paint, "<this>");
        Paint paint2 = new Paint();
        paint2.setColor(paint.getColor());
        paint2.setStrokeWidth(paint.getWidth());
        if (paint.m8477k() != 0.0f) {
            paint2.setPathEffect(new DashPathEffect(new float[]{paint.m8476j(), paint.m8477k()}, 0.0f));
        }
        int iM8478l = paint.m8478l();
        paint2.setStyle(iM8478l != 0 ? iM8478l != 1 ? Paint.Style.FILL_AND_STROKE : Paint.Style.STROKE : Paint.Style.FILL);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setTextSize(paint.m8479m());
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        return paint2;
    }

    public static final PointF covertPointF(EzyPointF.PointF pointF) {
        AbstractC9133u.m16133g(pointF, "<this>");
        return new PointF(pointF.getX(), pointF.getY());
    }

    public static final RectF covertRectF(EzyRectF.RectF rectF) {
        AbstractC9133u.m16133g(rectF, "<this>");
        return new RectF(rectF.getLeft(), rectF.getTop(), rectF.getRight(), rectF.getBottom());
    }
}
