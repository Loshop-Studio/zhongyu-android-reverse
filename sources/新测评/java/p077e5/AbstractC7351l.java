package p077e5;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.l */
/* loaded from: classes4.dex */
public abstract class AbstractC7351l {
    /* renamed from: a */
    public static final EzyPaint.Paint m11770a(Paint paint, float f10, float f11) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        EzyPaint.Paint.C6804b c6804bM7968w = EzyPaint.Paint.m7968w();
        c6804bM7968w.m7991q(paint.getColor());
        c6804bM7968w.m7999y(paint.getStrokeWidth());
        c6804bM7968w.m7993s(f10);
        c6804bM7968w.m7995u(f11);
        c6804bM7968w.m7996v(paint.getStyle().ordinal());
        c6804bM7968w.m7997w(paint.getTextSize());
        EzyPaint.Paint paintBuild = c6804bM7968w.build();
        Intrinsics.checkNotNullExpressionValue(paintBuild, "builder.build()");
        return paintBuild;
    }

    /* renamed from: b */
    public static final EzyPointF.PointF m11771b(PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        EzyPointF.PointF.C6807b c6807bM8006m = EzyPointF.PointF.m8006m();
        c6807bM8006m.m8028t(pointF.x);
        c6807bM8006m.m8029u(pointF.y);
        EzyPointF.PointF pointFBuild = c6807bM8006m.build();
        Intrinsics.checkNotNullExpressionValue(pointFBuild, "builder.build()");
        return pointFBuild;
    }

    /* renamed from: c */
    public static final EzyRectF.RectF m11772c(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        EzyRectF.RectF.C6811b c6811bM8043q = EzyRectF.RectF.m8043q();
        c6811bM8043q.m8064s(rectF.left);
        c6811bM8043q.m8067v(rectF.top);
        c6811bM8043q.m8066u(rectF.right);
        c6811bM8043q.m8062q(rectF.bottom);
        EzyRectF.RectF rectFBuild = c6811bM8043q.build();
        Intrinsics.checkNotNullExpressionValue(rectFBuild, "builder.build()");
        return rectFBuild;
    }

    /* renamed from: d */
    public static final Paint m11773d(EzyPaint.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint paint2 = new Paint();
        paint2.setColor(paint.getColor());
        paint2.setStrokeWidth(paint.getWidth());
        if (paint.m7971t() != 0.0f) {
            paint2.setPathEffect(new DashPathEffect(new float[]{paint.m7970s(), paint.m7971t()}, 0.0f));
        }
        int iM7972u = paint.m7972u();
        paint2.setStyle(iM7972u != 0 ? iM7972u != 1 ? Paint.Style.FILL_AND_STROKE : Paint.Style.STROKE : Paint.Style.FILL);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setTextSize(paint.m7973v());
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        return paint2;
    }

    /* renamed from: e */
    public static final PointF m11774e(EzyPointF.PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return new PointF(pointF.getX(), pointF.getY());
    }

    /* renamed from: f */
    public static final RectF m11775f(EzyRectF.RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return new RectF(rectF.getLeft(), rectF.getTop(), rectF.getRight(), rectF.getBottom());
    }
}
