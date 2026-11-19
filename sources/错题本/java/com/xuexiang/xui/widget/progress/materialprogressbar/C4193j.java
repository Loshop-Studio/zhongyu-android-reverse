package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.j */
/* loaded from: classes3.dex */
public final class C4193j extends AbstractC4186c implements InterfaceC4203t, InterfaceC4204u {

    /* renamed from: p */
    public static final RectF f4764p = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: q */
    public static final RectF f4765q = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: r */
    public static final RectF f4766r = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* renamed from: s */
    public static final IndeterminateHorizontalProgressDrawable$RectTransformX f4767s = new IndeterminateHorizontalProgressDrawable$RectTransformX(-522.6f);

    /* renamed from: t */
    public static final IndeterminateHorizontalProgressDrawable$RectTransformX f4768t = new IndeterminateHorizontalProgressDrawable$RectTransformX(-197.6f);

    /* renamed from: j */
    public int f4769j;

    /* renamed from: k */
    public int f4770k;

    /* renamed from: l */
    public boolean f4771l;

    /* renamed from: m */
    public float f4772m;

    /* renamed from: n */
    public IndeterminateHorizontalProgressDrawable$RectTransformX f4773n;

    /* renamed from: o */
    public IndeterminateHorizontalProgressDrawable$RectTransformX f4774o;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: a */
    public final boolean mo3559a() {
        return this.f4771l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: b */
    public final void mo3560b(boolean z8) {
        if (this.f4771l != z8) {
            this.f4771l = z8;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d
    /* renamed from: e */
    public final void mo3555e(Canvas canvas, Paint paint, int i, int i8) {
        boolean z8 = this.f4742h;
        RectF rectF = f4764p;
        if (z8) {
            RectF rectF2 = f4765q;
            canvas.scale(i / rectF2.width(), i8 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        } else {
            canvas.scale(i / rectF.width(), i8 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        }
        if (this.f4771l) {
            paint.setAlpha(Math.round(this.f4735a * this.f4772m));
            canvas.drawRect(rectF, paint);
            paint.setAlpha(this.f4735a);
        }
        IndeterminateHorizontalProgressDrawable$RectTransformX indeterminateHorizontalProgressDrawable$RectTransformX = this.f4774o;
        int iSave = canvas.save();
        canvas.translate(indeterminateHorizontalProgressDrawable$RectTransformX.f4723a, 0.0f);
        canvas.scale(indeterminateHorizontalProgressDrawable$RectTransformX.f4724b, 1.0f);
        RectF rectF3 = f4766r;
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(iSave);
        IndeterminateHorizontalProgressDrawable$RectTransformX indeterminateHorizontalProgressDrawable$RectTransformX2 = this.f4773n;
        int iSave2 = canvas.save();
        canvas.translate(indeterminateHorizontalProgressDrawable$RectTransformX2.f4723a, 0.0f);
        canvas.scale(indeterminateHorizontalProgressDrawable$RectTransformX2.f4724b, 1.0f);
        canvas.drawRect(rectF3, paint);
        canvas.restoreToCount(iSave2);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC4187d
    /* renamed from: f */
    public final void mo3556f(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4742h ? this.f4770k : this.f4769j;
    }
}
