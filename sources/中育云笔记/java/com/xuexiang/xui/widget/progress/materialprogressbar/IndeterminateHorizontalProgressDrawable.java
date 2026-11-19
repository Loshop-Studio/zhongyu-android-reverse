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
import com.xuexiang.xui.utils.AbstractC8041g;

/* loaded from: classes5.dex */
public class IndeterminateHorizontalProgressDrawable extends AbstractC8211c implements InterfaceC8229u, InterfaceC8230v {

    /* renamed from: r */
    public static final RectF f16788r = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: s */
    public static final RectF f16789s = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: t */
    public static final RectF f16790t = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* renamed from: u */
    public static final RectTransformX f16791u = new RectTransformX(-522.6f, 0.1f);

    /* renamed from: v */
    public static final RectTransformX f16792v = new RectTransformX(-197.6f, 0.1f);

    /* renamed from: l */
    public int f16793l;

    /* renamed from: m */
    public int f16794m;

    /* renamed from: n */
    public boolean f16795n;

    /* renamed from: o */
    public float f16796o;

    /* renamed from: p */
    public RectTransformX f16797p;

    /* renamed from: q */
    public RectTransformX f16798q;

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        this.f16795n = true;
        this.f16797p = new RectTransformX(f16791u);
        this.f16798q = new RectTransformX(f16792v);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f16793l = Math.round(4.0f * f10);
        this.f16794m = Math.round(f10 * 16.0f);
        this.f16796o = AbstractC8041g.m12224k(context, R.attr.disabledAlpha, 0.0f);
        this.f16832k = new Animator[]{AbstractC8209a.m13143b(this.f16797p), AbstractC8209a.m13144c(this.f16798q)};
    }

    /* renamed from: k */
    public static void m13127k(Canvas canvas, Paint paint) {
        canvas.drawRect(f16788r, paint);
    }

    /* renamed from: l */
    public static void m13128l(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
        int iSave = canvas.save();
        canvas.translate(rectTransformX.f16799a, 0.0f);
        canvas.scale(rectTransformX.f16800b, 1.0f);
        canvas.drawRect(f16790t, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: a */
    public boolean mo13129a() {
        return this.f16795n;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: b */
    public void mo13130b(boolean z10) {
        if (this.f16795n != z10) {
            this.f16795n = z10;
            invalidateSelf();
        }
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
        return this.f16834j ? this.f16794m : this.f16793l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8212d
    /* renamed from: h */
    public void mo13122h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f16834j) {
            RectF rectF = f16789s;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f16788r;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        if (this.f16795n) {
            paint.setAlpha(Math.round(this.f16825c * this.f16796o));
            m13127k(canvas, paint);
            paint.setAlpha(this.f16825c);
        }
        m13128l(canvas, this.f16798q, paint);
        m13128l(canvas, this.f16797p, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8212d
    /* renamed from: i */
    public void mo13123i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8211c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC8210b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
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

    public static class RectTransformX {

        /* renamed from: a */
        public float f16799a;

        /* renamed from: b */
        public float f16800b;

        public RectTransformX(float f10, float f11) {
            this.f16799a = f10;
            this.f16800b = f11;
        }

        @Keep
        public void setScaleX(float f10) {
            this.f16800b = f10;
        }

        @Keep
        public void setTranslateX(float f10) {
            this.f16799a = f10;
        }

        public RectTransformX(RectTransformX rectTransformX) {
            this.f16799a = rectTransformX.f16799a;
            this.f16800b = rectTransformX.f16800b;
        }
    }
}
