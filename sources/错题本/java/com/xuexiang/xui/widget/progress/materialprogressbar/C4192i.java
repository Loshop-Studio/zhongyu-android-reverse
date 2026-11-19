package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.i */
/* loaded from: classes3.dex */
public final class C4192i extends AbstractC4186c implements InterfaceC4203t {

    /* renamed from: n */
    public static final RectF f4757n = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: o */
    public static final RectF f4758o = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: p */
    public static final RectF f4759p = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: j */
    public int f4760j;

    /* renamed from: k */
    public int f4761k;

    /* renamed from: l */
    public IndeterminateCircularProgressDrawable$RingPathTransform f4762l;

    /* renamed from: m */
    public IndeterminateCircularProgressDrawable$RingRotation f4763m;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d
    /* renamed from: e */
    public final void mo3555e(Canvas canvas, Paint paint, int i, int i8) {
        if (this.f4742h) {
            RectF rectF = f4758o;
            canvas.scale(i / rectF.width(), i8 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f4757n;
            canvas.scale(i / rectF2.width(), i8 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        int iSave = canvas.save();
        canvas.rotate(this.f4763m.f4722a);
        IndeterminateCircularProgressDrawable$RingPathTransform indeterminateCircularProgressDrawable$RingPathTransform = this.f4762l;
        float f = indeterminateCircularProgressDrawable$RingPathTransform.f4721c;
        canvas.drawArc(f4759p, ((f + r1) * 360.0f) - 90.0f, (indeterminateCircularProgressDrawable$RingPathTransform.f4720b - indeterminateCircularProgressDrawable$RingPathTransform.f4719a) * 360.0f, false, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d
    /* renamed from: f */
    public final void mo3556f(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4742h ? this.f4761k : this.f4760j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4742h ? this.f4761k : this.f4760j;
    }
}
