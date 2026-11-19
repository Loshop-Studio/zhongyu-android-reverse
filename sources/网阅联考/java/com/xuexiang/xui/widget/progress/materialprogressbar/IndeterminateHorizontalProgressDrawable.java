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
import com.xuexiang.xui.utils.AbstractC3531f;

/* loaded from: classes2.dex */
public class IndeterminateHorizontalProgressDrawable extends AbstractC3611c implements InterfaceC3629u, InterfaceC3630v {

    /* renamed from: p */
    public static final RectF f3842p = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: q */
    public static final RectF f3843q = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: r */
    public static final RectF f3844r = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* renamed from: s */
    public static final RectTransformX f3845s = new RectTransformX(-522.6f, 0.1f);

    /* renamed from: t */
    public static final RectTransformX f3846t = new RectTransformX(-197.6f, 0.1f);

    /* renamed from: j */
    public int f3847j;

    /* renamed from: k */
    public int f3848k;

    /* renamed from: l */
    public boolean f3849l;

    /* renamed from: m */
    public float f3850m;

    /* renamed from: n */
    public RectTransformX f3851n;

    /* renamed from: o */
    public RectTransformX f3852o;

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        this.f3849l = true;
        this.f3851n = new RectTransformX(f3845s);
        this.f3852o = new RectTransformX(f3846t);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f3847j = Math.round(4.0f * f4);
        this.f3848k = Math.round(f4 * 16.0f);
        this.f3850m = AbstractC3531f.m4077j(context, R.attr.disabledAlpha, 0.0f);
        this.f3886i = new Animator[]{AbstractC3609a.m4559b(this.f3851n), AbstractC3609a.m4560c(this.f3852o)};
    }

    /* renamed from: k */
    public static void m4543k(Canvas canvas, Paint paint) {
        canvas.drawRect(f3842p, paint);
    }

    /* renamed from: l */
    public static void m4544l(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
        int iSave = canvas.save();
        canvas.translate(rectTransformX.f3853a, 0.0f);
        canvas.scale(rectTransformX.f3854b, 1.0f);
        canvas.drawRect(f3844r, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: a */
    public boolean mo4545a() {
        return this.f3849l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: b */
    public void mo4546b(boolean z3) {
        if (this.f3849l != z3) {
            this.f3849l = z3;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3613e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3628t
    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo4536c() {
        return super.mo4536c();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3613e, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3628t
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo4537d(boolean z3) {
        super.mo4537d(z3);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3611c, com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3888h ? this.f3848k : this.f3847j;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3612d
    /* renamed from: h */
    public void mo4538h(Canvas canvas, int i4, int i5, Paint paint) {
        if (this.f3888h) {
            RectF rectF = f3843q;
            canvas.scale(i4 / rectF.width(), i5 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f3842p;
            canvas.scale(i4 / rectF2.width(), i5 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        if (this.f3849l) {
            paint.setAlpha(Math.round(this.f3879a * this.f3850m));
            m4543k(canvas, paint);
            paint.setAlpha(this.f3879a);
        }
        m4544l(canvas, this.f3852o, paint);
        m4544l(canvas, this.f3851n, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3612d
    /* renamed from: i */
    public void mo4539i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3611c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i4) {
        super.setAlpha(i4);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3633y
    public /* bridge */ /* synthetic */ void setTint(int i4) {
        super.setTint(i4);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3633y
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3610b, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3633y
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3611c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC3611c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public static class RectTransformX {

        /* renamed from: a */
        public float f3853a;

        /* renamed from: b */
        public float f3854b;

        public RectTransformX(float f4, float f5) {
            this.f3853a = f4;
            this.f3854b = f5;
        }

        @Keep
        public void setScaleX(float f4) {
            this.f3854b = f4;
        }

        @Keep
        public void setTranslateX(float f4) {
            this.f3853a = f4;
        }

        public RectTransformX(RectTransformX rectTransformX) {
            this.f3853a = rectTransformX.f3853a;
            this.f3854b = rectTransformX.f3854b;
        }
    }
}
