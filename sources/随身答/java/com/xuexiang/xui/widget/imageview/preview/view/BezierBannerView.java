package com.xuexiang.xui.widget.imageview.preview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes4.dex */
public class BezierBannerView extends View implements ViewPager.OnPageChangeListener {

    /* renamed from: L */
    public static int f7677L = 1;

    /* renamed from: M */
    public static int f7678M = 2;

    /* renamed from: A */
    public int f7679A;

    /* renamed from: B */
    public int f7680B;

    /* renamed from: C */
    public int f7681C;

    /* renamed from: D */
    public float f7682D;

    /* renamed from: E */
    public float f7683E;

    /* renamed from: F */
    public float f7684F;

    /* renamed from: G */
    public float f7685G;

    /* renamed from: H */
    public float f7686H;

    /* renamed from: I */
    public float f7687I;

    /* renamed from: J */
    public int f7688J;

    /* renamed from: K */
    public Interpolator f7689K;

    /* renamed from: a */
    public Paint f7690a;

    /* renamed from: b */
    public Paint f7691b;

    /* renamed from: c */
    public Path f7692c;

    /* renamed from: d */
    public Path f7693d;

    /* renamed from: e */
    public int f7694e;

    /* renamed from: f */
    public int f7695f;

    /* renamed from: g */
    public float f7696g;

    /* renamed from: h */
    public float f7697h;

    /* renamed from: i */
    public float f7698i;

    /* renamed from: j */
    public float f7699j;

    /* renamed from: k */
    public float f7700k;

    /* renamed from: l */
    public float f7701l;

    /* renamed from: m */
    public float f7702m;

    /* renamed from: n */
    public float f7703n;

    /* renamed from: o */
    public float f7704o;

    /* renamed from: p */
    public float f7705p;

    /* renamed from: q */
    public float f7706q;

    /* renamed from: r */
    public float f7707r;

    /* renamed from: s */
    public float f7708s;

    /* renamed from: t */
    public float f7709t;

    /* renamed from: u */
    public float f7710u;

    /* renamed from: v */
    public boolean f7711v;

    /* renamed from: w */
    public float f7712w;

    /* renamed from: x */
    public float f7713x;

    /* renamed from: y */
    public float f7714y;

    /* renamed from: z */
    public int f7715z;

    public BezierBannerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m6902a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(this);
        if (viewPager.getAdapter() != null) {
            this.f7679A = viewPager.getAdapter().getCount();
        }
        this.f7715z = viewPager.getCurrentItem();
        m6909h();
        this.f7688J = f7678M;
        invalidate();
    }

    /* renamed from: b */
    public final float m6903b(int i9) {
        if (i9 == 0) {
            return this.f7697h;
        }
        float f10 = this.f7696g;
        float f11 = this.f7699j;
        return (i9 * (f10 + (2.0f * f11))) + f11 + (this.f7697h - f11);
    }

    /* renamed from: c */
    public float m6904c(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* renamed from: d */
    public float m6905d(float f10, float f11, int i9) {
        float f12;
        float f13;
        if (i9 == this.f7680B) {
            f12 = f11 - f10;
            f13 = this.f7712w;
        } else {
            f12 = f11 - f10;
            f13 = this.f7713x;
        }
        return f10 + (f12 * f13);
    }

    /* renamed from: e */
    public float m6906e(float f10, float f11) {
        return f10 + ((f11 - f10) * this.f7714y);
    }

    /* renamed from: f */
    public final void m6907f(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BezierBannerView);
        this.f7694e = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_selectedColor, -1);
        this.f7695f = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_unSelectedColor, -5592406);
        this.f7697h = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_selectedRadius, this.f7697h);
        this.f7699j = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_unSelectedRadius, this.f7699j);
        this.f7696g = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_spacing, this.f7696g);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public final void m6908g() {
        Paint paint = new Paint(1);
        paint.setColor(this.f7694e);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f7690a = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f7695f);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.f7691b = paint2;
    }

    /* renamed from: h */
    public final void m6909h() {
        this.f7692c.reset();
        this.f7693d.reset();
        float interpolation = this.f7689K.getInterpolation(this.f7714y);
        this.f7703n = m6905d(m6903b(this.f7715z), m6903b(this.f7715z + 1) - this.f7697h, this.f7681C);
        float f10 = this.f7697h;
        this.f7704o = f10;
        this.f7698i = m6904c(f10, 0.0f, interpolation);
        double radians = Math.toRadians(m6905d(45.0f, 0.0f, this.f7680B));
        float fSin = (float) (Math.sin(radians) * this.f7698i);
        float fCos = (float) (Math.cos(radians) * this.f7698i);
        this.f7705p = m6905d(m6903b(this.f7715z) + this.f7697h, m6903b(this.f7715z + 1), this.f7680B);
        float f11 = this.f7697h;
        this.f7706q = f11;
        this.f7701l = m6904c(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(m6905d(0.0f, 45.0f, this.f7681C));
        float fSin2 = (float) (Math.sin(radians2) * this.f7701l);
        float fCos2 = (float) (Math.cos(radians2) * this.f7701l);
        this.f7684F = this.f7703n + fSin;
        this.f7685G = this.f7704o - fCos;
        this.f7686H = this.f7705p - fSin2;
        this.f7687I = this.f7697h - fCos2;
        this.f7682D = m6906e(m6903b(this.f7715z) + this.f7697h, m6903b(this.f7715z + 1) - this.f7697h);
        this.f7683E = this.f7697h;
        this.f7692c.moveTo(this.f7684F, this.f7685G);
        this.f7692c.quadTo(this.f7682D, this.f7683E, this.f7686H, this.f7687I);
        this.f7692c.lineTo(this.f7686H, this.f7697h + fCos2);
        this.f7692c.quadTo(this.f7682D, this.f7697h, this.f7684F, this.f7685G + (fCos * 2.0f));
        this.f7692c.lineTo(this.f7684F, this.f7685G);
        this.f7709t = m6905d(m6903b(this.f7715z + 1), m6903b(this.f7715z) + this.f7699j, this.f7681C);
        this.f7710u = this.f7697h;
        this.f7700k = m6904c(this.f7699j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m6905d(45.0f, 0.0f, this.f7680B));
        float fSin3 = (float) (Math.sin(radians3) * this.f7700k);
        float fCos3 = (float) (Math.cos(radians3) * this.f7700k);
        this.f7707r = m6905d(m6903b(this.f7715z + 1) - this.f7699j, m6903b(this.f7715z), this.f7680B);
        this.f7708s = this.f7697h;
        this.f7702m = m6904c(0.0f, this.f7699j, interpolation);
        double radians4 = Math.toRadians(m6905d(0.0f, 45.0f, this.f7681C));
        float fSin4 = (float) (Math.sin(radians4) * this.f7702m);
        float fCos4 = (float) (Math.cos(radians4) * this.f7702m);
        float f12 = this.f7709t - fSin3;
        float f13 = this.f7710u - fCos3;
        float f14 = this.f7707r + fSin4;
        float f15 = this.f7708s - fCos4;
        float fM6906e = m6906e(m6903b(this.f7715z + 1) - this.f7699j, m6903b(this.f7715z) + this.f7699j);
        float f16 = this.f7697h;
        this.f7693d.moveTo(f12, f13);
        this.f7693d.quadTo(fM6906e, f16, f14, f15);
        this.f7693d.lineTo(f14, this.f7697h + fCos4);
        this.f7693d.quadTo(fM6906e, f16, f12, (fCos3 * 2.0f) + f13);
        this.f7693d.lineTo(f12, f13);
    }

    /* renamed from: i */
    public final void m6910i() {
        this.f7692c.reset();
        this.f7693d.reset();
        float interpolation = this.f7689K.getInterpolation(this.f7714y);
        this.f7703n = m6905d(m6903b(this.f7715z), m6903b(this.f7715z - 1) + this.f7697h, this.f7681C);
        float f10 = this.f7697h;
        this.f7704o = f10;
        this.f7698i = m6904c(f10, 0.0f, interpolation);
        double radians = Math.toRadians(m6905d(45.0f, 0.0f, this.f7680B));
        float fSin = (float) (Math.sin(radians) * this.f7698i);
        float fCos = (float) (Math.cos(radians) * this.f7698i);
        this.f7705p = m6905d(m6903b(this.f7715z) - this.f7697h, m6903b(this.f7715z - 1), this.f7680B);
        float f11 = this.f7697h;
        this.f7706q = f11;
        this.f7701l = m6904c(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(m6905d(0.0f, 45.0f, this.f7681C));
        float fSin2 = (float) (Math.sin(radians2) * this.f7701l);
        float fCos2 = (float) (Math.cos(radians2) * this.f7701l);
        this.f7684F = this.f7703n - fSin;
        this.f7685G = this.f7704o - fCos;
        this.f7686H = this.f7705p + fSin2;
        this.f7687I = this.f7697h - fCos2;
        this.f7682D = m6906e(m6903b(this.f7715z) - this.f7697h, m6903b(this.f7715z - 1) + this.f7697h);
        this.f7683E = this.f7697h;
        this.f7692c.moveTo(this.f7684F, this.f7685G);
        this.f7692c.quadTo(this.f7682D, this.f7683E, this.f7686H, this.f7687I);
        this.f7692c.lineTo(this.f7686H, this.f7697h + fCos2);
        this.f7692c.quadTo(this.f7682D, this.f7697h, this.f7684F, this.f7685G + (fCos * 2.0f));
        this.f7692c.lineTo(this.f7684F, this.f7685G);
        this.f7709t = m6905d(m6903b(this.f7715z - 1), m6903b(this.f7715z) - this.f7699j, this.f7681C);
        this.f7710u = this.f7697h;
        this.f7700k = m6904c(this.f7699j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m6905d(45.0f, 0.0f, this.f7680B));
        float fSin3 = (float) (Math.sin(radians3) * this.f7700k);
        float fCos3 = (float) (Math.cos(radians3) * this.f7700k);
        this.f7707r = m6905d(m6903b(this.f7715z - 1) + this.f7699j, m6903b(this.f7715z), this.f7680B);
        this.f7708s = this.f7697h;
        this.f7702m = m6904c(0.0f, this.f7699j, interpolation);
        double radians4 = Math.toRadians(m6905d(0.0f, 45.0f, this.f7681C));
        float fSin4 = (float) (Math.sin(radians4) * this.f7702m);
        float fCos4 = (float) (Math.cos(radians4) * this.f7702m);
        float f12 = this.f7709t + fSin3;
        float f13 = this.f7710u - fCos3;
        float f14 = this.f7707r - fSin4;
        float f15 = this.f7708s - fCos4;
        float fM6906e = m6906e(m6903b(this.f7715z - 1) + this.f7699j, m6903b(this.f7715z) - this.f7699j);
        float f16 = this.f7697h;
        this.f7693d.moveTo(f12, f13);
        this.f7693d.quadTo(fM6906e, f16, f14, f15);
        this.f7693d.lineTo(f14, this.f7697h + fCos4);
        this.f7693d.quadTo(fM6906e, f16, f12, (fCos3 * 2.0f) + f13);
        this.f7693d.lineTo(f12, f13);
    }

    /* renamed from: j */
    public void m6911j() {
        this.f7712w = 0.0f;
        this.f7713x = 0.0f;
        this.f7714y = 0.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i9;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        for (int i10 = 0; i10 < this.f7679A; i10++) {
            int i11 = this.f7688J;
            if (i11 == f7678M) {
                int i12 = this.f7715z;
                if (i10 != i12 && i10 != i12 + 1) {
                    canvas.drawCircle(m6903b(i10), this.f7697h, this.f7699j, this.f7691b);
                }
            } else if (i11 == f7677L && i10 != (i9 = this.f7715z) && i10 != i9 - 1) {
                canvas.drawCircle(m6903b(i10), this.f7697h, this.f7699j, this.f7691b);
            }
        }
        canvas.drawCircle(this.f7707r, this.f7708s, this.f7702m, this.f7691b);
        canvas.drawCircle(this.f7709t, this.f7710u, this.f7700k, this.f7691b);
        canvas.drawPath(this.f7693d, this.f7691b);
        canvas.drawCircle(this.f7705p, this.f7706q, this.f7701l, this.f7690a);
        canvas.drawCircle(this.f7703n, this.f7704o, this.f7698i, this.f7690a);
        canvas.drawPath(this.f7692c, this.f7690a);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float f10 = this.f7699j;
        int paddingLeft = (int) ((f10 * 2.0f * this.f7679A) + ((this.f7697h - f10) * 2.0f) + ((r5 - 1) * this.f7696g) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.f7697h * 2.0f) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, paddingLeft);
        }
        if (mode2 != 1073741824 && mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i9) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i9, float f10, int i10) {
        if (f10 == 0.0f) {
            this.f7715z = i9;
            m6911j();
        }
        float f11 = i9 + f10;
        int i11 = this.f7715z;
        if (f11 - i11 > 0.0f) {
            this.f7688J = f7678M;
            if (f11 > i11 + 1) {
                this.f7715z = i9;
                return;
            } else {
                setProgress(f10);
                return;
            }
        }
        if (f11 - i11 < 0.0f) {
            this.f7688J = f7677L;
            if (f11 < i11 - 1) {
                this.f7715z = i9;
            } else {
                setProgress(1.0f - f10);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i9) {
    }

    public void setDirection(int i9) {
        this.f7688J = i9;
    }

    public void setProgress(float f10) {
        if (f10 == 0.0f) {
            return;
        }
        this.f7714y = f10;
        if (f10 <= 0.5d) {
            this.f7712w = f10 / 0.5f;
            this.f7713x = 0.0f;
        } else {
            this.f7713x = (f10 - 0.5f) / 0.5f;
            this.f7712w = 1.0f;
        }
        if (this.f7688J == f7678M) {
            m6909h();
        } else {
            m6910i();
        }
        invalidate();
    }

    public BezierBannerView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f7692c = new Path();
        this.f7693d = new Path();
        this.f7696g = 80.0f;
        this.f7697h = 30.0f;
        this.f7699j = 20.0f;
        this.f7711v = false;
        this.f7712w = 0.0f;
        this.f7713x = 0.0f;
        this.f7715z = 0;
        this.f7680B = 1;
        this.f7681C = 2;
        this.f7689K = new AccelerateDecelerateInterpolator();
        m6907f(attributeSet);
        m6908g();
    }
}
