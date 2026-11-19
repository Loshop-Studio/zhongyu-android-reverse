package com.xuexiang.xui.widget.imageview.preview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v4.media.AbstractC0037f;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes3.dex */
public class BezierBannerView extends View implements ViewPager.OnPageChangeListener {

    /* renamed from: A */
    public final int f4456A;

    /* renamed from: B */
    public final int f4457B;

    /* renamed from: C */
    public float f4458C;

    /* renamed from: D */
    public float f4459D;

    /* renamed from: E */
    public float f4460E;

    /* renamed from: F */
    public float f4461F;

    /* renamed from: G */
    public float f4462G;

    /* renamed from: H */
    public float f4463H;

    /* renamed from: I */
    public int f4464I;

    /* renamed from: J */
    public final AccelerateDecelerateInterpolator f4465J;

    /* renamed from: a */
    public final Paint f4466a;

    /* renamed from: b */
    public final Paint f4467b;

    /* renamed from: c */
    public final Path f4468c;

    /* renamed from: d */
    public final Path f4469d;

    /* renamed from: e */
    public final int f4470e;

    /* renamed from: f */
    public final int f4471f;

    /* renamed from: g */
    public final float f4472g;

    /* renamed from: h */
    public final float f4473h;

    /* renamed from: i */
    public float f4474i;

    /* renamed from: j */
    public final float f4475j;

    /* renamed from: k */
    public float f4476k;

    /* renamed from: l */
    public float f4477l;

    /* renamed from: m */
    public float f4478m;

    /* renamed from: n */
    public float f4479n;

    /* renamed from: o */
    public float f4480o;

    /* renamed from: p */
    public float f4481p;

    /* renamed from: q */
    public float f4482q;

    /* renamed from: r */
    public float f4483r;

    /* renamed from: s */
    public float f4484s;

    /* renamed from: t */
    public float f4485t;

    /* renamed from: u */
    public float f4486u;

    /* renamed from: v */
    public float f4487v;

    /* renamed from: w */
    public float f4488w;

    /* renamed from: x */
    public float f4489x;

    /* renamed from: y */
    public int f4490y;

    /* renamed from: z */
    public int f4491z;

    public BezierBannerView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public static float m3508b(float f, float f7, float f8) {
        return AbstractC0037f.m77b(f7, f, f8, f);
    }

    /* renamed from: a */
    public final float m3509a(int i) {
        if (i == 0) {
            return this.f4473h;
        }
        float f = this.f4475j;
        return (this.f4473h - f) + (((2.0f * f) + this.f4472g) * i) + f;
    }

    /* renamed from: c */
    public final float m3510c(float f, float f7, int i) {
        float f8;
        float f9;
        if (i == this.f4456A) {
            f8 = f7 - f;
            f9 = this.f4487v;
        } else {
            f8 = f7 - f;
            f9 = this.f4488w;
        }
        return (f8 * f9) + f;
    }

    /* renamed from: d */
    public final void m3511d() {
        Path path = this.f4468c;
        path.reset();
        Path path2 = this.f4469d;
        path2.reset();
        float interpolation = this.f4465J.getInterpolation(this.f4489x);
        float fM3509a = m3509a(this.f4490y);
        float fM3509a2 = m3509a(this.f4490y + 1) - this.f4473h;
        int i = this.f4457B;
        this.f4479n = m3510c(fM3509a, fM3509a2, i);
        float f = this.f4473h;
        this.f4480o = f;
        this.f4474i = m3508b(f, 0.0f, interpolation);
        int i8 = this.f4456A;
        double radians = Math.toRadians(m3510c(45.0f, 0.0f, i8));
        float fSin = (float) (Math.sin(radians) * this.f4474i);
        float fCos = (float) (Math.cos(radians) * this.f4474i);
        this.f4481p = m3510c(m3509a(this.f4490y) + this.f4473h, m3509a(this.f4490y + 1), i8);
        float f7 = this.f4473h;
        this.f4482q = f7;
        this.f4477l = m3508b(0.0f, f7, interpolation);
        double radians2 = Math.toRadians(m3510c(0.0f, 45.0f, i));
        float fSin2 = (float) (Math.sin(radians2) * this.f4477l);
        float fCos2 = (float) (Math.cos(radians2) * this.f4477l);
        this.f4460E = this.f4479n + fSin;
        this.f4461F = this.f4480o - fCos;
        this.f4462G = this.f4481p - fSin2;
        this.f4463H = this.f4473h - fCos2;
        float fM3509a3 = m3509a(this.f4490y) + this.f4473h;
        float fM3509a4 = m3509a(this.f4490y + 1);
        float f8 = this.f4473h;
        this.f4458C = (((fM3509a4 - f8) - fM3509a3) * this.f4489x) + fM3509a3;
        this.f4459D = f8;
        path.moveTo(this.f4460E, this.f4461F);
        path.quadTo(this.f4458C, this.f4459D, this.f4462G, this.f4463H);
        path.lineTo(this.f4462G, this.f4473h + fCos2);
        path.quadTo(this.f4458C, this.f4473h, this.f4460E, (fCos * 2.0f) + this.f4461F);
        path.lineTo(this.f4460E, this.f4461F);
        this.f4485t = m3510c(m3509a(this.f4490y + 1), m3509a(this.f4490y) + this.f4475j, i);
        this.f4486u = this.f4473h;
        this.f4476k = m3508b(this.f4475j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m3510c(45.0f, 0.0f, i8));
        float fSin3 = (float) (Math.sin(radians3) * this.f4476k);
        float fCos3 = (float) (Math.cos(radians3) * this.f4476k);
        this.f4483r = m3510c(m3509a(this.f4490y + 1) - this.f4475j, m3509a(this.f4490y), i8);
        this.f4484s = this.f4473h;
        this.f4478m = m3508b(0.0f, this.f4475j, interpolation);
        double radians4 = Math.toRadians(m3510c(0.0f, 45.0f, i));
        float fSin4 = (float) (Math.sin(radians4) * this.f4478m);
        float fCos4 = (float) (Math.cos(radians4) * this.f4478m);
        float f9 = this.f4485t - fSin3;
        float f10 = this.f4486u - fCos3;
        float f11 = this.f4483r + fSin4;
        float f12 = this.f4484s - fCos4;
        float fM3509a5 = m3509a(this.f4490y + 1) - this.f4475j;
        float fM3509a6 = (((m3509a(this.f4490y) + this.f4475j) - fM3509a5) * this.f4489x) + fM3509a5;
        path2.moveTo(f9, f10);
        float f13 = this.f4473h;
        path2.quadTo(fM3509a6, f13, f11, f12);
        path2.lineTo(f11, this.f4473h + fCos4);
        path2.quadTo(fM3509a6, f13, f9, (fCos3 * 2.0f) + f10);
        path2.lineTo(f9, f10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        for (int i8 = 0; i8 < this.f4491z; i8++) {
            int i9 = this.f4464I;
            if (i9 == 2) {
                int i10 = this.f4490y;
                if (i8 != i10 && i8 != i10 + 1) {
                    canvas.drawCircle(m3509a(i8), this.f4473h, this.f4475j, this.f4467b);
                }
            } else if (i9 == 1 && i8 != (i = this.f4490y) && i8 != i - 1) {
                canvas.drawCircle(m3509a(i8), this.f4473h, this.f4475j, this.f4467b);
            }
        }
        canvas.drawCircle(this.f4483r, this.f4484s, this.f4478m, this.f4467b);
        canvas.drawCircle(this.f4485t, this.f4486u, this.f4476k, this.f4467b);
        canvas.drawPath(this.f4469d, this.f4467b);
        canvas.drawCircle(this.f4481p, this.f4482q, this.f4477l, this.f4466a);
        canvas.drawCircle(this.f4479n, this.f4480o, this.f4474i, this.f4466a);
        canvas.drawPath(this.f4468c, this.f4466a);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        float f = this.f4475j;
        int iM77b = (int) (((r5 - 1) * this.f4472g) + AbstractC0037f.m77b(this.f4473h, f, 2.0f, f * 2.0f * this.f4491z) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.f4473h * 2.0f) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, iM77b);
        }
        if (mode2 != 1073741824 && mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i8) {
        if (f == 0.0f) {
            this.f4490y = i;
            Log.d("com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView", "到达");
            this.f4487v = 0.0f;
            this.f4488w = 0.0f;
            this.f4489x = 0.0f;
        }
        float f7 = i + f;
        int i9 = this.f4490y;
        if (f7 - i9 > 0.0f) {
            this.f4464I = 2;
            if (f7 <= i9 + 1) {
                setProgress(f);
                return;
            } else {
                this.f4490y = i;
                Log.d("com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView", "向左快速滑动");
                return;
            }
        }
        if (f7 - i9 < 0.0f) {
            this.f4464I = 1;
            if (f7 >= i9 - 1) {
                setProgress(1.0f - f);
            } else {
                this.f4490y = i;
                Log.d("com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView", "向右快速滑动");
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
    }

    public void setDirection(int i) {
        this.f4464I = i;
    }

    public void setProgress(float f) {
        if (f == 0.0f) {
            return;
        }
        this.f4489x = f;
        if (f <= 0.5d) {
            this.f4487v = f / 0.5f;
            this.f4488w = 0.0f;
        } else {
            this.f4488w = (f - 0.5f) / 0.5f;
            this.f4487v = 1.0f;
        }
        if (this.f4464I == 2) {
            m3511d();
        } else {
            Path path = this.f4468c;
            path.reset();
            Path path2 = this.f4469d;
            path2.reset();
            float interpolation = this.f4465J.getInterpolation(this.f4489x);
            float fM3509a = m3509a(this.f4490y);
            float fM3509a2 = m3509a(this.f4490y - 1) + this.f4473h;
            int i = this.f4457B;
            this.f4479n = m3510c(fM3509a, fM3509a2, i);
            float f7 = this.f4473h;
            this.f4480o = f7;
            this.f4474i = m3508b(f7, 0.0f, interpolation);
            int i8 = this.f4456A;
            double radians = Math.toRadians(m3510c(45.0f, 0.0f, i8));
            float fSin = (float) (Math.sin(radians) * this.f4474i);
            float fCos = (float) (Math.cos(radians) * this.f4474i);
            this.f4481p = m3510c(m3509a(this.f4490y) - this.f4473h, m3509a(this.f4490y - 1), i8);
            float f8 = this.f4473h;
            this.f4482q = f8;
            this.f4477l = m3508b(0.0f, f8, interpolation);
            double radians2 = Math.toRadians(m3510c(0.0f, 45.0f, i));
            float fSin2 = (float) (Math.sin(radians2) * this.f4477l);
            float fCos2 = (float) (Math.cos(radians2) * this.f4477l);
            this.f4460E = this.f4479n - fSin;
            this.f4461F = this.f4480o - fCos;
            this.f4462G = this.f4481p + fSin2;
            this.f4463H = this.f4473h - fCos2;
            float fM3509a3 = m3509a(this.f4490y) - this.f4473h;
            float fM3509a4 = m3509a(this.f4490y - 1);
            float f9 = this.f4473h;
            this.f4458C = (((fM3509a4 + f9) - fM3509a3) * this.f4489x) + fM3509a3;
            this.f4459D = f9;
            path.moveTo(this.f4460E, this.f4461F);
            path.quadTo(this.f4458C, this.f4459D, this.f4462G, this.f4463H);
            path.lineTo(this.f4462G, this.f4473h + fCos2);
            path.quadTo(this.f4458C, this.f4473h, this.f4460E, (fCos * 2.0f) + this.f4461F);
            path.lineTo(this.f4460E, this.f4461F);
            this.f4485t = m3510c(m3509a(this.f4490y - 1), m3509a(this.f4490y) - this.f4475j, i);
            this.f4486u = this.f4473h;
            this.f4476k = m3508b(this.f4475j, 0.0f, interpolation);
            double radians3 = Math.toRadians(m3510c(45.0f, 0.0f, i8));
            float fSin3 = (float) (Math.sin(radians3) * this.f4476k);
            float fCos3 = (float) (Math.cos(radians3) * this.f4476k);
            this.f4483r = m3510c(m3509a(this.f4490y - 1) + this.f4475j, m3509a(this.f4490y), i8);
            this.f4484s = this.f4473h;
            this.f4478m = m3508b(0.0f, this.f4475j, interpolation);
            double radians4 = Math.toRadians(m3510c(0.0f, 45.0f, i));
            float fSin4 = (float) (Math.sin(radians4) * this.f4478m);
            float fCos4 = (float) (Math.cos(radians4) * this.f4478m);
            float f10 = this.f4485t + fSin3;
            float f11 = this.f4486u - fCos3;
            float f12 = this.f4483r - fSin4;
            float f13 = this.f4484s - fCos4;
            float fM3509a5 = m3509a(this.f4490y - 1) + this.f4475j;
            float fM3509a6 = (((m3509a(this.f4490y) - this.f4475j) - fM3509a5) * this.f4489x) + fM3509a5;
            path2.moveTo(f10, f11);
            float f14 = this.f4473h;
            path2.quadTo(fM3509a6, f14, f12, f13);
            path2.lineTo(f12, this.f4473h + fCos4);
            path2.quadTo(fM3509a6, f14, f10, (fCos3 * 2.0f) + f11);
            path2.lineTo(f10, f11);
        }
        invalidate();
    }

    public BezierBannerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezierBannerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4468c = new Path();
        this.f4469d = new Path();
        this.f4472g = 80.0f;
        this.f4473h = 30.0f;
        this.f4475j = 20.0f;
        this.f4487v = 0.0f;
        this.f4488w = 0.0f;
        this.f4490y = 0;
        this.f4456A = 1;
        this.f4457B = 2;
        this.f4465J = new AccelerateDecelerateInterpolator();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BezierBannerView);
        this.f4470e = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_selectedColor, -1);
        this.f4471f = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_unSelectedColor, -5592406);
        this.f4473h = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_selectedRadius, this.f4473h);
        this.f4475j = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_unSelectedRadius, this.f4475j);
        this.f4472g = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_spacing, this.f4472g);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        paint.setColor(this.f4470e);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f4466a = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f4471f);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.f4467b = paint2;
    }
}
