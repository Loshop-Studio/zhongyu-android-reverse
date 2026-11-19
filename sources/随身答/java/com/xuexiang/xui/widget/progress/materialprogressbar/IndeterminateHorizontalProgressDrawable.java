package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import com.xuexiang.xui.utils.AbstractC6801g;

/* loaded from: classes4.dex */
public class IndeterminateHorizontalProgressDrawable extends AbstractC6892c implements InterfaceC6910u, InterfaceC6911v {

    /* renamed from: p */
    public static final RectF f7912p = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: q */
    public static final RectF f7913q = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: r */
    public static final RectF f7914r = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* renamed from: s */
    public static final RectTransformX f7915s = new RectTransformX(-522.6f, 0.1f);

    /* renamed from: t */
    public static final RectTransformX f7916t = new RectTransformX(-197.6f, 0.1f);

    /* renamed from: j */
    public int f7917j;

    /* renamed from: k */
    public int f7918k;

    /* renamed from: l */
    public boolean f7919l;

    /* renamed from: m */
    public float f7920m;

    /* renamed from: n */
    public RectTransformX f7921n;

    /* renamed from: o */
    public RectTransformX f7922o;

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        this.f7919l = true;
        this.f7921n = new RectTransformX(f7915s);
        this.f7922o = new RectTransformX(f7916t);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f7917j = Math.round(4.0f * f10);
        this.f7918k = Math.round(f10 * 16.0f);
        this.f7920m = AbstractC6801g.m6485r(context, R.attr.disabledAlpha, 0.0f);
        this.f7956i = new Animator[]{AbstractC6890a.m7026b(this.f7921n), AbstractC6890a.m7027c(this.f7922o)};
    }

    /* renamed from: k */
    public static void m7010k(Canvas canvas, Paint paint) {
        canvas.drawRect(f7912p, paint);
    }

    /* renamed from: l */
    public static void m7011l(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
        int iSave = canvas.save();
        canvas.translate(rectTransformX.f7923a, 0.0f);
        canvas.scale(rectTransformX.f7924b, 1.0f);
        canvas.drawRect(f7914r, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: a */
    public boolean mo7012a() {
        return this.f7919l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: b */
    public void mo7013b(boolean z9) {
        if (this.f7919l != z9) {
            this.f7919l = z9;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6894e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6909t
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo7003c(boolean z9) {
        super.mo7003c(z9);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6894e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6909t
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo7004d() {
        return super.mo7004d();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6892c, com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7958h ? this.f7918k : this.f7917j;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6893d
    /* renamed from: h */
    public void mo7005h(Canvas canvas, int i9, int i10, Paint paint) {
        if (this.f7958h) {
            RectF rectF = f7913q;
            canvas.scale(i9 / rectF.width(), i10 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f7912p;
            canvas.scale(i9 / rectF2.width(), i10 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        if (this.f7919l) {
            paint.setAlpha(Math.round(this.f7949a * this.f7920m));
            m7010k(canvas, paint);
            paint.setAlpha(this.f7949a);
        }
        m7011l(canvas, this.f7922o, paint);
        m7011l(canvas, this.f7921n, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6893d
    /* renamed from: i */
    public void mo7006i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6892c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i9) {
        super.setAlpha(i9);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6914y
    public /* bridge */ /* synthetic */ void setTint(int i9) {
        super.setTint(i9);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6914y
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6914y
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6892c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6892c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public static class RectTransformX {

        /* renamed from: a */
        public float f7923a;

        /* renamed from: b */
        public float f7924b;

        public RectTransformX(float f10, float f11) {
            this.f7923a = f10;
            this.f7924b = f11;
        }

        @Keep
        public void setScaleX(float f10) {
            this.f7924b = f10;
        }

        @Keep
        public void setTranslateX(float f10) {
            this.f7923a = f10;
        }

        public RectTransformX(RectTransformX rectTransformX) {
            this.f7923a = rectTransformX.f7923a;
            this.f7924b = rectTransformX.f7924b;
        }
    }
}
