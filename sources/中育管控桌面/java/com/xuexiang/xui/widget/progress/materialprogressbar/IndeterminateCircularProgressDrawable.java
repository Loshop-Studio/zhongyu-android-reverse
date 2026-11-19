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

/* loaded from: classes3.dex */
public class IndeterminateCircularProgressDrawable extends AbstractC5950c implements InterfaceC5968u {

    /* renamed from: n */
    public static final RectF f5352n = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: o */
    public static final RectF f5353o = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: p */
    public static final RectF f5354p = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: j */
    public int f5355j;

    /* renamed from: k */
    public int f5356k;

    /* renamed from: l */
    public RingPathTransform f5357l;

    /* renamed from: m */
    public RingRotation f5358m;

    public static class RingPathTransform {

        /* renamed from: a */
        public float f5359a;

        /* renamed from: b */
        public float f5360b;

        /* renamed from: c */
        public float f5361c;

        public RingPathTransform() {
        }

        @Keep
        public void setTrimPathEnd(float f6) {
            this.f5360b = f6;
        }

        @Keep
        public void setTrimPathOffset(float f6) {
            this.f5361c = f6;
        }

        @Keep
        public void setTrimPathStart(float f6) {
            this.f5359a = f6;
        }
    }

    public static class RingRotation {

        /* renamed from: a */
        public float f5362a;

        public RingRotation() {
        }

        @Keep
        public void setRotation(float f6) {
            this.f5362a = f6;
        }
    }

    public IndeterminateCircularProgressDrawable(Context context) {
        super(context);
        this.f5357l = new RingPathTransform();
        this.f5358m = new RingRotation();
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f5355j = Math.round(42.0f * f6);
        this.f5356k = Math.round(f6 * 48.0f);
        this.f5407i = new Animator[]{AbstractC5948a.m4936a(this.f5357l), AbstractC5948a.m4939d(this.f5358m)};
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5952e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5967t
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo4914c(boolean z6) {
        super.mo4914c(z6);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5952e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5967t
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo4915d() {
        return super.mo4915d();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5950c, com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return m4919l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return m4919l();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5951d
    /* renamed from: h */
    public void mo4916h(Canvas canvas, int i6, int i7, Paint paint) {
        if (this.f5409h) {
            RectF rectF = f5353o;
            canvas.scale(i6 / rectF.width(), i7 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f5352n;
            canvas.scale(i6 / rectF2.width(), i7 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        m4918k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5951d
    /* renamed from: i */
    public void mo4917i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5950c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    /* renamed from: k */
    public final void m4918k(Canvas canvas, Paint paint) {
        int iSave = canvas.save();
        canvas.rotate(this.f5358m.f5362a);
        RingPathTransform ringPathTransform = this.f5357l;
        float f6 = ringPathTransform.f5361c;
        canvas.drawArc(f5354p, ((f6 + r3) * 360.0f) - 90.0f, (ringPathTransform.f5360b - ringPathTransform.f5359a) * 360.0f, false, paint);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: l */
    public final int m4919l() {
        return this.f5409h ? this.f5356k : this.f5355j;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i6) {
        super.setAlpha(i6);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5972y
    public /* bridge */ /* synthetic */ void setTint(int i6) {
        super.setTint(i6);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5972y
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5972y
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5950c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5950c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
