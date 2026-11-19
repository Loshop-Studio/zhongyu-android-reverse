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
import com.xuexiang.xui.utils.AbstractC5859g;

/* loaded from: classes3.dex */
public class IndeterminateHorizontalProgressDrawable extends AbstractC5950c implements InterfaceC5968u, InterfaceC5969v {

    /* renamed from: p */
    public static final RectF f5363p = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: q */
    public static final RectF f5364q = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: r */
    public static final RectF f5365r = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* renamed from: s */
    public static final RectTransformX f5366s = new RectTransformX(-522.6f, 0.1f);

    /* renamed from: t */
    public static final RectTransformX f5367t = new RectTransformX(-197.6f, 0.1f);

    /* renamed from: j */
    public int f5368j;

    /* renamed from: k */
    public int f5369k;

    /* renamed from: l */
    public boolean f5370l;

    /* renamed from: m */
    public float f5371m;

    /* renamed from: n */
    public RectTransformX f5372n;

    /* renamed from: o */
    public RectTransformX f5373o;

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        this.f5370l = true;
        this.f5372n = new RectTransformX(f5366s);
        this.f5373o = new RectTransformX(f5367t);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f5368j = Math.round(4.0f * f6);
        this.f5369k = Math.round(f6 * 16.0f);
        this.f5371m = AbstractC5859g.m4393s(context, R.attr.disabledAlpha, 0.0f);
        this.f5407i = new Animator[]{AbstractC5948a.m4937b(this.f5372n), AbstractC5948a.m4938c(this.f5373o)};
    }

    /* renamed from: k */
    public static void m4921k(Canvas canvas, Paint paint) {
        canvas.drawRect(f5363p, paint);
    }

    /* renamed from: l */
    public static void m4922l(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
        int iSave = canvas.save();
        canvas.translate(rectTransformX.f5374a, 0.0f);
        canvas.scale(rectTransformX.f5375b, 1.0f);
        canvas.drawRect(f5365r, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: a */
    public boolean mo4923a() {
        return this.f5370l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: b */
    public void mo4924b(boolean z6) {
        if (this.f5370l != z6) {
            this.f5370l = z6;
            invalidateSelf();
        }
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
        return this.f5409h ? this.f5369k : this.f5368j;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5951d
    /* renamed from: h */
    public void mo4916h(Canvas canvas, int i6, int i7, Paint paint) {
        if (this.f5409h) {
            RectF rectF = f5364q;
            canvas.scale(i6 / rectF.width(), i7 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f5363p;
            canvas.scale(i6 / rectF2.width(), i7 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        if (this.f5370l) {
            paint.setAlpha(Math.round(this.f5400a * this.f5371m));
            m4921k(canvas, paint);
            paint.setAlpha(this.f5400a);
        }
        m4922l(canvas, this.f5373o, paint);
        m4922l(canvas, this.f5372n, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5951d
    /* renamed from: i */
    public void mo4917i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5950c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC5949b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
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

    public static class RectTransformX {

        /* renamed from: a */
        public float f5374a;

        /* renamed from: b */
        public float f5375b;

        public RectTransformX(float f6, float f7) {
            this.f5374a = f6;
            this.f5375b = f7;
        }

        @Keep
        public void setScaleX(float f6) {
            this.f5375b = f6;
        }

        @Keep
        public void setTranslateX(float f6) {
            this.f5374a = f6;
        }

        public RectTransformX(RectTransformX rectTransformX) {
            this.f5374a = rectTransformX.f5374a;
            this.f5375b = rectTransformX.f5375b;
        }
    }
}
