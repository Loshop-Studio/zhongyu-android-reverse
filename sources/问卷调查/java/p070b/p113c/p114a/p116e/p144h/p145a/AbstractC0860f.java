package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: b.c.a.e.h.a.f */
/* loaded from: classes.dex */
public abstract class AbstractC0860f extends AbstractC0858d {

    /* renamed from: j */
    public static final RectF f4659j = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: k */
    public static final RectF f4660k = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: l */
    public static final RectF f4661l = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0858d
    /* renamed from: f */
    public void mo2565f(Canvas canvas, int i, int i2, Paint paint) {
        float f2 = i;
        RectF rectF = this.f4654i ? f4660k : f4659j;
        canvas.scale(f2 / rectF.width(), i2 / rectF.height());
        canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        mo2570i(canvas, paint);
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0858d
    /* renamed from: g */
    public void mo2566g(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }

    /* renamed from: h */
    public void m2569h(Canvas canvas, Paint paint, float f2, float f3) {
        canvas.drawArc(f4661l, f2 - 90.0f, f3, false, paint);
    }

    /* renamed from: i */
    public abstract void mo2570i(Canvas canvas, Paint paint);
}
