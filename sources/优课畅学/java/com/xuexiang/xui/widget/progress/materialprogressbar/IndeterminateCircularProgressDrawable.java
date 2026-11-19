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
public class IndeterminateCircularProgressDrawable extends AbstractC6978c implements InterfaceC6996u {

    /* renamed from: n */
    public static final RectF f8065n = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: o */
    public static final RectF f8066o = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: p */
    public static final RectF f8067p = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: j */
    public int f8068j;

    /* renamed from: k */
    public int f8069k;

    /* renamed from: l */
    public RingPathTransform f8070l;

    /* renamed from: m */
    public RingRotation f8071m;

    public static class RingPathTransform {

        /* renamed from: a */
        public float f8072a;

        /* renamed from: b */
        public float f8073b;

        /* renamed from: c */
        public float f8074c;

        public RingPathTransform() {
        }

        @Keep
        public void setTrimPathEnd(float f10) {
            this.f8073b = f10;
        }

        @Keep
        public void setTrimPathOffset(float f10) {
            this.f8074c = f10;
        }

        @Keep
        public void setTrimPathStart(float f10) {
            this.f8072a = f10;
        }
    }

    public static class RingRotation {

        /* renamed from: a */
        public float f8075a;

        public RingRotation() {
        }

        @Keep
        public void setRotation(float f10) {
            this.f8075a = f10;
        }
    }

    public IndeterminateCircularProgressDrawable(Context context) {
        super(context);
        this.f8070l = new RingPathTransform();
        this.f8071m = new RingRotation();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f8068j = Math.round(42.0f * f10);
        this.f8069k = Math.round(f10 * 48.0f);
        this.f8120i = new Animator[]{AbstractC6976a.m7117a(this.f8070l), AbstractC6976a.m7120d(this.f8071m)};
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6980e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6995t
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo7095c(boolean z10) {
        super.mo7095c(z10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6980e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6995t
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo7096d() {
        return super.mo7096d();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6978c, com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return m7100l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return m7100l();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6979d
    /* renamed from: h */
    public void mo7097h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f8122h) {
            RectF rectF = f8066o;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f8065n;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        m7099k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6979d
    /* renamed from: i */
    public void mo7098i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6978c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    /* renamed from: k */
    public final void m7099k(Canvas canvas, Paint paint) {
        int iSave = canvas.save();
        canvas.rotate(this.f8071m.f8075a);
        RingPathTransform ringPathTransform = this.f8070l;
        float f10 = ringPathTransform.f8074c;
        canvas.drawArc(f8067p, ((f10 + r3) * 360.0f) - 90.0f, (ringPathTransform.f8073b - ringPathTransform.f8072a) * 360.0f, false, paint);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: l */
    public final int m7100l() {
        return this.f8122h ? this.f8069k : this.f8068j;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC7000y
    public /* bridge */ /* synthetic */ void setTint(int i10) {
        super.setTint(i10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC7000y
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC7000y
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6978c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6978c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
