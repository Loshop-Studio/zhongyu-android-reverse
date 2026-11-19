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
import com.xuexiang.xui.utils.AbstractC6877g;

/* loaded from: classes4.dex */
public class IndeterminateHorizontalProgressDrawable extends AbstractC6978c implements InterfaceC6996u, InterfaceC6997v {

    /* renamed from: p */
    public static final RectF f8076p = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);

    /* renamed from: q */
    public static final RectF f8077q = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);

    /* renamed from: r */
    public static final RectF f8078r = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);

    /* renamed from: s */
    public static final RectTransformX f8079s = new RectTransformX(-522.6f, 0.1f);

    /* renamed from: t */
    public static final RectTransformX f8080t = new RectTransformX(-197.6f, 0.1f);

    /* renamed from: j */
    public int f8081j;

    /* renamed from: k */
    public int f8082k;

    /* renamed from: l */
    public boolean f8083l;

    /* renamed from: m */
    public float f8084m;

    /* renamed from: n */
    public RectTransformX f8085n;

    /* renamed from: o */
    public RectTransformX f8086o;

    public IndeterminateHorizontalProgressDrawable(Context context) {
        super(context);
        this.f8083l = true;
        this.f8085n = new RectTransformX(f8079s);
        this.f8086o = new RectTransformX(f8080t);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f8081j = Math.round(4.0f * f10);
        this.f8082k = Math.round(f10 * 16.0f);
        this.f8084m = AbstractC6877g.m6485s(context, R.attr.disabledAlpha, 0.0f);
        this.f8120i = new Animator[]{AbstractC6976a.m7118b(this.f8085n), AbstractC6976a.m7119c(this.f8086o)};
    }

    /* renamed from: k */
    public static void m7102k(Canvas canvas, Paint paint) {
        canvas.drawRect(f8076p, paint);
    }

    /* renamed from: l */
    public static void m7103l(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
        int iSave = canvas.save();
        canvas.translate(rectTransformX.f8087a, 0.0f);
        canvas.scale(rectTransformX.f8088b, 1.0f);
        canvas.drawRect(f8078r, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: a */
    public boolean mo7104a() {
        return this.f8083l;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: b */
    public void mo7105b(boolean z10) {
        if (this.f8083l != z10) {
            this.f8083l = z10;
            invalidateSelf();
        }
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
        return this.f8122h ? this.f8082k : this.f8081j;
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6979d
    /* renamed from: h */
    public void mo7097h(Canvas canvas, int i10, int i11, Paint paint) {
        if (this.f8122h) {
            RectF rectF = f8077q;
            canvas.scale(i10 / rectF.width(), i11 / rectF.height());
            canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        } else {
            RectF rectF2 = f8076p;
            canvas.scale(i10 / rectF2.width(), i11 / rectF2.height());
            canvas.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        }
        if (this.f8083l) {
            paint.setAlpha(Math.round(this.f8113a * this.f8084m));
            m7102k(canvas, paint);
            paint.setAlpha(this.f8113a);
        }
        m7103l(canvas, this.f8086o, paint);
        m7103l(canvas, this.f8085n, paint);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6979d
    /* renamed from: i */
    public void mo7098i(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6978c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.AbstractC6977b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return super.isStateful();
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

    public static class RectTransformX {

        /* renamed from: a */
        public float f8087a;

        /* renamed from: b */
        public float f8088b;

        public RectTransformX(float f10, float f11) {
            this.f8087a = f10;
            this.f8088b = f11;
        }

        @Keep
        public void setScaleX(float f10) {
            this.f8088b = f10;
        }

        @Keep
        public void setTranslateX(float f10) {
            this.f8087a = f10;
        }

        public RectTransformX(RectTransformX rectTransformX) {
            this.f8087a = rectTransformX.f8087a;
            this.f8088b = rectTransformX.f8088b;
        }
    }
}
