package p070b.p113c.p114a.p116e.p144h.p145a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: b.c.a.e.h.a.g */
/* loaded from: classes.dex */
public class C0861g extends AbstractC0858d {

    /* renamed from: l */
    public static final RectF f4662l = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: m */
    public static final RectF f4663m = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: j */
    public int f4664j;

    /* renamed from: k */
    public int f4665k;

    public C0861g(Context context) {
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f4664j = Math.round(4.0f * f2);
        this.f4665k = Math.round(f2 * 16.0f);
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0858d
    /* renamed from: f */
    public void mo2565f(Canvas canvas, int i, int i2, Paint paint) {
        float f2 = i;
        RectF rectF = this.f4654i ? f4663m : f4662l;
        canvas.scale(f2 / rectF.width(), i2 / rectF.height());
        canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        mo2571h(canvas, paint);
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.AbstractC0858d
    /* renamed from: g */
    public void mo2566g(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4654i ? this.f4665k : this.f4664j;
    }

    /* renamed from: h */
    public void mo2571h(Canvas canvas, Paint paint) {
        canvas.drawRect(f4662l, paint);
    }
}
