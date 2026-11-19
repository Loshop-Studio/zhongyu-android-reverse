package com.xuexiang.xui.widget.progress.materialprogressbar;

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

/* loaded from: classes4.dex */
public class IndeterminateCircularProgressDrawable extends AbstractC6892c implements InterfaceC6910u {

    /* renamed from: n */
    public static final RectF f7901n = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: o */
    public static final RectF f7902o = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: p */
    public static final RectF f7903p = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: j */
    public int f7904j;

    /* renamed from: k */
    public int f7905k;

    /* renamed from: l */
    public RingPathTransform f7906l;

    /* renamed from: m */
    public RingRotation f7907m;

    public static class RingPathTransform {

        /* renamed from: a */
        public float f7908a;

        /* renamed from: b */
        public float f7909b;

        /* renamed from: c */
        public float f7910c;

        public RingPathTransform() {
        }

        @Keep
        public void setTrimPathEnd(float f10) {
            this.f7909b = f10;
        }

        @Keep
        public void setTrimPathOffset(float f10) {
            this.f7910c = f10;
        }

        @Keep
        public void setTrimPathStart(float f10) {
            this.f7908a = f10;
        }
    }

    public static class RingRotation {

        /* renamed from: a */
        public float f7911a;

        public RingRotation() {
        }

        @Keep
        public void setRotation(float f10) {
            this.f7911a = f10;
        }
    }

    public IndeterminateCircularProgressDrawable(Context context) {
        super(context);
        this.f7906l = new RingPathTransform();
        this.f7907m = new RingRotation();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f7904j = Math.round(42.0f * f10);
        this.f7905k = Math.round(f10 * 48.0f);
        this.f7956i = new Animator[]{AbstractC6890a.m7025a(this.f7906l), AbstractC6890a.m7028d(this.f7907m)};
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
        return m7008l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return m7008l();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6893d
    /* renamed from: h */
    public void mo7005h(Canvas canvas, int i9, int i10, Paint paint) {
        if (this.f7958h) {
            RectF rectF = f7902o;
            canvas.scale(i9 / rectF.width(), i10 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f7901n;
            canvas.scale(i9 / rectF2.width(), i10 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        m7007k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6893d
    /* renamed from: i */
    public void mo7006i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6892c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6891b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    /* renamed from: k */
    public final void m7007k(Canvas canvas, Paint paint) {
        int iSave = canvas.save();
        canvas.rotate(this.f7907m.f7911a);
        RingPathTransform ringPathTransform = this.f7906l;
        float f10 = ringPathTransform.f7910c;
        canvas.drawArc(f7903p, ((f10 + r3) * 360.0f) - 90.0f, (ringPathTransform.f7909b - ringPathTransform.f7908a) * 360.0f, false, paint);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: l */
    public final int m7008l() {
        return this.f7958h ? this.f7905k : this.f7904j;
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
}
