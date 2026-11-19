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
import com.xuexiang.xui.utils.AbstractC6482g;

/* loaded from: classes4.dex */
public class IndeterminateHorizontalProgressDrawable extends AbstractC6572c implements InterfaceC6590u, InterfaceC6591v {

    /* renamed from: p */
    public static final RectF f6654p = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: q */
    public static final RectF f6655q = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: r */
    public static final RectF f6656r = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* renamed from: s */
    public static final RectTransformX f6657s = new RectTransformX(-522.6f, 0.1f);

    /* renamed from: t */
    public static final RectTransformX f6658t = new RectTransformX(-197.6f, 0.1f);

    /* renamed from: j */
    public int f6659j;

    /* renamed from: k */
    public int f6660k;

    /* renamed from: l */
    public boolean f6661l;

    /* renamed from: m */
    public float f6662m;

    /* renamed from: n */
    public RectTransformX f6663n;

    /* renamed from: o */
    public RectTransformX f6664o;

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        this.f6661l = true;
        this.f6663n = new RectTransformX(f6657s);
        this.f6664o = new RectTransformX(f6658t);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f6659j = Math.round(4.0f * f10);
        this.f6660k = Math.round(f10 * 16.0f);
        this.f6662m = AbstractC6482g.m5388s(context, R.attr.disabledAlpha, 0.0f);
        this.f6698i = new Animator[]{AbstractC6570a.m5928b(this.f6663n), AbstractC6570a.m5929c(this.f6664o)};
    }

    /* renamed from: k */
    public static void m5912k(Canvas canvas, Paint paint) {
        canvas.drawRect(f6654p, paint);
    }

    /* renamed from: l */
    public static void m5913l(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
        int iSave = canvas.save();
        canvas.translate(rectTransformX.f6665a, 0.0f);
        canvas.scale(rectTransformX.f6666b, 1.0f);
        canvas.drawRect(f6656r, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: a */
    public boolean mo5914a() {
        return this.f6661l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: b */
    public void mo5915b(boolean z9) {
        if (this.f6661l != z9) {
            this.f6661l = z9;
            invalidateSelf();
        }
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
        return this.f6700h ? this.f6660k : this.f6659j;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6573d
    /* renamed from: h */
    public void mo5907h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f6700h) {
            RectF rectF = f6655q;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f6654p;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        if (this.f6661l) {
            paint.setAlpha(Math.round(this.f6691a * this.f6662m));
            m5912k(canvas, paint);
            paint.setAlpha(this.f6691a);
        }
        m5913l(canvas, this.f6664o, paint);
        m5913l(canvas, this.f6663n, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6573d
    /* renamed from: i */
    public void mo5908i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6572c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6571b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
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

    public static class RectTransformX {

        /* renamed from: a */
        public float f6665a;

        /* renamed from: b */
        public float f6666b;

        public RectTransformX(float f10, float f11) {
            this.f6665a = f10;
            this.f6666b = f11;
        }

        @Keep
        public void setScaleX(float f10) {
            this.f6666b = f10;
        }

        @Keep
        public void setTranslateX(float f10) {
            this.f6665a = f10;
        }

        public RectTransformX(RectTransformX rectTransformX) {
            this.f6665a = rectTransformX.f6665a;
            this.f6666b = rectTransformX.f6666b;
        }
    }
}
