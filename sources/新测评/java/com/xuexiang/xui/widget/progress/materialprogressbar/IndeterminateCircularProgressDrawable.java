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
public class IndeterminateCircularProgressDrawable extends AbstractC6572c implements InterfaceC6590u {

    /* renamed from: n */
    public static final RectF f6643n = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: o */
    public static final RectF f6644o = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);

    /* renamed from: p */
    public static final RectF f6645p = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: j */
    public int f6646j;

    /* renamed from: k */
    public int f6647k;

    /* renamed from: l */
    public RingPathTransform f6648l;

    /* renamed from: m */
    public RingRotation f6649m;

    public static class RingPathTransform {

        /* renamed from: a */
        public float f6650a;

        /* renamed from: b */
        public float f6651b;

        /* renamed from: c */
        public float f6652c;

        public RingPathTransform() {
        }

        @Keep
        public void setTrimPathEnd(float f10) {
            this.f6651b = f10;
        }

        @Keep
        public void setTrimPathOffset(float f10) {
            this.f6652c = f10;
        }

        @Keep
        public void setTrimPathStart(float f10) {
            this.f6650a = f10;
        }
    }

    public static class RingRotation {

        /* renamed from: a */
        public float f6653a;

        public RingRotation() {
        }

        @Keep
        public void setRotation(float f10) {
            this.f6653a = f10;
        }
    }

    public IndeterminateCircularProgressDrawable(Context context) {
        super(context);
        this.f6648l = new RingPathTransform();
        this.f6649m = new RingRotation();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f6646j = Math.round(42.0f * f10);
        this.f6647k = Math.round(f10 * 48.0f);
        this.f6698i = new Animator[]{AbstractC6570a.m5927a(this.f6648l), AbstractC6570a.m5930d(this.f6649m)};
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6574e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6589t
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo5905c(boolean z9) {
        super.mo5905c(z9);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6574e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6589t
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo5906d() {
        return super.mo5906d();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6572c, com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return m5910l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return m5910l();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6573d
    /* renamed from: h */
    public void mo5907h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f6700h) {
            RectF rectF = f6644o;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f6643n;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        m5909k(canvas, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6573d
    /* renamed from: i */
    public void mo5908i(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6572c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    /* renamed from: k */
    public final void m5909k(Canvas canvas, Paint paint) {
        int iSave = canvas.save();
        canvas.rotate(this.f6649m.f6653a);
        RingPathTransform ringPathTransform = this.f6648l;
        float f10 = ringPathTransform.f6652c;
        canvas.drawArc(f6645p, ((f10 + r3) * 360.0f) - 90.0f, (ringPathTransform.f6651b - ringPathTransform.f6650a) * 360.0f, false, paint);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: l */
    public final int m5910l() {
        return this.f6700h ? this.f6647k : this.f6646j;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6594y
    public /* bridge */ /* synthetic */ void setTint(int i10) {
        super.setTint(i10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6594y
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6594y
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6572c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6572c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
