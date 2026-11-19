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

/* loaded from: classes5.dex */
public class IndeterminateCircularProgressDrawable extends AbstractC8211c implements InterfaceC8229u {

    /* renamed from: p */
    public static final RectF f16777p = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: q */
    public static final RectF f16778q = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: r */
    public static final RectF f16779r = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: l */
    public int f16780l;

    /* renamed from: m */
    public int f16781m;

    /* renamed from: n */
    public RingPathTransform f16782n;

    /* renamed from: o */
    public RingRotation f16783o;

    public static class RingPathTransform {

        /* renamed from: a */
        public float f16784a;

        /* renamed from: b */
        public float f16785b;

        /* renamed from: c */
        public float f16786c;

        public RingPathTransform() {
        }

        @Keep
        public void setTrimPathEnd(float f10) {
            this.f16785b = f10;
        }

        @Keep
        public void setTrimPathOffset(float f10) {
            this.f16786c = f10;
        }

        @Keep
        public void setTrimPathStart(float f10) {
            this.f16784a = f10;
        }
    }

    public static class RingRotation {

        /* renamed from: a */
        public float f16787a;

        public RingRotation() {
        }

        @Keep
        public void setRotation(float f10) {
            this.f16787a = f10;
        }
    }

    public IndeterminateCircularProgressDrawable(Context context) {
        super(context);
        this.f16782n = new RingPathTransform();
        this.f16783o = new RingRotation();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f16780l = Math.round(42.0f * f10);
        this.f16781m = Math.round(f10 * 48.0f);
        this.f16832k = new Animator[]{AbstractC8209a.m13142a(this.f16782n), AbstractC8209a.m13145d(this.f16783o)};
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8213e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8228t
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo13120c(boolean z10) {
        super.mo13120c(z10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8213e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8228t
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo13121d() {
        return super.mo13121d();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8211c, com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return m13125l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return m13125l();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8212d
    /* renamed from: h */
    public void mo13122h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f16834j) {
            RectF rectF = f16778q;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f16777p;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        m13124k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8212d
    /* renamed from: i */
    public void mo13123i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8211c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    /* renamed from: k */
    public final void m13124k(Canvas canvas, Paint paint) {
        int iSave = canvas.save();
        canvas.rotate(this.f16783o.f16787a);
        RingPathTransform ringPathTransform = this.f16782n;
        float f10 = ringPathTransform.f16786c;
        canvas.drawArc(f16779r, ((f10 + r3) * 360.0f) - 90.0f, (ringPathTransform.f16785b - ringPathTransform.f16784a) * 360.0f, false, paint);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: l */
    public final int m13125l() {
        return this.f16834j ? this.f16781m : this.f16780l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8233y
    public /* bridge */ /* synthetic */ void setTint(int i10) {
        super.setTint(i10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8233y
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8233y
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8211c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8211c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
