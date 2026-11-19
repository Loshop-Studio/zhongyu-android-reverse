package na;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: na.m */
/* loaded from: classes5.dex */
public abstract class AbstractC10350m {
    /* renamed from: a */
    public static final EzyPaint.Paint m21653a(Paint paint, float f10, float f11) {
        AbstractC9979u.m20294g(paint, "<this>");
        EzyPaint.Paint.C8501b c8501bM15719t = EzyPaint.Paint.m15719t();
        c8501bM15719t.m15742p(paint.getColor());
        c8501bM15719t.m15750x(paint.getStrokeWidth());
        c8501bM15719t.m15744r(f10);
        c8501bM15719t.m15746t(f11);
        c8501bM15719t.m15747u(paint.getStyle().ordinal());
        c8501bM15719t.m15748v(paint.getTextSize());
        EzyPaint.Paint paintBuild = c8501bM15719t.build();
        AbstractC9979u.m20293f(paintBuild, "builder.build()");
        return paintBuild;
    }

    /* renamed from: b */
    public static final EzyPointF.PointF m21654b(PointF pointF) {
        AbstractC9979u.m20294g(pointF, "<this>");
        EzyPointF.PointF.C8504b c8504bM15757f = EzyPointF.PointF.m15757f();
        c8504bM15757f.m15779s(pointF.x);
        c8504bM15757f.m15780t(pointF.y);
        EzyPointF.PointF pointFBuild = c8504bM15757f.build();
        AbstractC9979u.m20293f(pointFBuild, "builder.build()");
        return pointFBuild;
    }

    /* renamed from: c */
    public static final EzyRectF.RectF m21655c(RectF rectF) {
        AbstractC9979u.m20294g(rectF, "<this>");
        EzyRectF.RectF.C8508b c8508bM15793k = EzyRectF.RectF.m15793k();
        c8508bM15793k.m15814r(rectF.left);
        c8508bM15793k.m15817u(rectF.top);
        c8508bM15793k.m15816t(rectF.right);
        c8508bM15793k.m15812p(rectF.bottom);
        EzyRectF.RectF rectFBuild = c8508bM15793k.build();
        AbstractC9979u.m20293f(rectFBuild, "builder.build()");
        return rectFBuild;
    }

    /* renamed from: d */
    public static final Paint m21656d(EzyPaint.Paint paint) {
        AbstractC9979u.m20294g(paint, "<this>");
        Paint paint2 = new Paint();
        paint2.setColor(paint.getColor());
        paint2.setStrokeWidth(paint.getWidth());
        if (paint.m15722o() != 0.0f) {
            paint2.setPathEffect(new DashPathEffect(new float[]{paint.m15721n(), paint.m15722o()}, 0.0f));
        }
        int iM15723p = paint.m15723p();
        paint2.setStyle(iM15723p != 0 ? iM15723p != 1 ? Paint.Style.FILL_AND_STROKE : Paint.Style.STROKE : Paint.Style.FILL);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setTextSize(paint.m15724r());
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        return paint2;
    }

    /* renamed from: e */
    public static final PointF m21657e(EzyPointF.PointF pointF) {
        AbstractC9979u.m20294g(pointF, "<this>");
        return new PointF(pointF.getX(), pointF.getY());
    }

    /* renamed from: f */
    public static final RectF m21658f(EzyRectF.RectF rectF) {
        AbstractC9979u.m20294g(rectF, "<this>");
        return new RectF(rectF.getLeft(), rectF.getTop(), rectF.getRight(), rectF.getBottom());
    }
}
