package p263u5;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.m */
/* loaded from: classes4.dex */
public abstract class AbstractC9694m {
    /* renamed from: a */
    public static final EzyPaint.Paint m16193a(Paint paint, float f10, float f11) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        EzyPaint.Paint.C7123b c7123bM9100z = EzyPaint.Paint.m9100z();
        c7123bM9100z.m9123q(paint.getColor());
        c7123bM9100z.m9131y(paint.getStrokeWidth());
        c7123bM9100z.m9125s(f10);
        c7123bM9100z.m9127u(f11);
        c7123bM9100z.m9128v(paint.getStyle().ordinal());
        c7123bM9100z.m9129w(paint.getTextSize());
        EzyPaint.Paint paintBuild = c7123bM9100z.build();
        Intrinsics.checkNotNullExpressionValue(paintBuild, "builder.build()");
        return paintBuild;
    }

    /* renamed from: b */
    public static final EzyPointF.PointF m16194b(PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        EzyPointF.PointF.C7126b c7126bM9138n = EzyPointF.PointF.m9138n();
        c7126bM9138n.m9160t(pointF.x);
        c7126bM9138n.m9161u(pointF.y);
        EzyPointF.PointF pointFBuild = c7126bM9138n.build();
        Intrinsics.checkNotNullExpressionValue(pointFBuild, "builder.build()");
        return pointFBuild;
    }

    /* renamed from: c */
    public static final EzyRectF.RectF m16195c(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        EzyRectF.RectF.C7130b c7130bM9175t = EzyRectF.RectF.m9175t();
        c7130bM9175t.m9196s(rectF.left);
        c7130bM9175t.m9199v(rectF.top);
        c7130bM9175t.m9198u(rectF.right);
        c7130bM9175t.m9194q(rectF.bottom);
        EzyRectF.RectF rectFBuild = c7130bM9175t.build();
        Intrinsics.checkNotNullExpressionValue(rectFBuild, "builder.build()");
        return rectFBuild;
    }

    /* renamed from: d */
    public static final Paint m16196d(EzyPaint.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint paint2 = new Paint();
        paint2.setColor(paint.getColor());
        paint2.setStrokeWidth(paint.getWidth());
        if (paint.m9106w() != 0.0f) {
            paint2.setPathEffect(new DashPathEffect(new float[]{paint.m9105v(), paint.m9106w()}, 0.0f));
        }
        int iM9107x = paint.m9107x();
        paint2.setStyle(iM9107x != 0 ? iM9107x != 1 ? Paint.Style.FILL_AND_STROKE : Paint.Style.STROKE : Paint.Style.FILL);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setTextSize(paint.m9108y());
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        return paint2;
    }

    /* renamed from: e */
    public static final PointF m16197e(EzyPointF.PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return new PointF(pointF.getX(), pointF.getY());
    }

    /* renamed from: f */
    public static final RectF m16198f(EzyRectF.RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return new RectF(rectF.getLeft(), rectF.getTop(), rectF.getRight(), rectF.getBottom());
    }
}
