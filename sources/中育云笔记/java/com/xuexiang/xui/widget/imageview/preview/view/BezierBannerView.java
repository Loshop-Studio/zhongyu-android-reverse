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

/* loaded from: classes5.dex */
public class BezierBannerView extends View implements ViewPager.OnPageChangeListener {

    /* renamed from: N */
    public static int f16283N = 1;

    /* renamed from: O */
    public static int f16284O = 2;

    /* renamed from: A */
    public float f16285A;

    /* renamed from: B */
    public int f16286B;

    /* renamed from: C */
    public int f16287C;

    /* renamed from: D */
    public int f16288D;

    /* renamed from: E */
    public int f16289E;

    /* renamed from: F */
    public float f16290F;

    /* renamed from: G */
    public float f16291G;

    /* renamed from: H */
    public float f16292H;

    /* renamed from: I */
    public float f16293I;

    /* renamed from: J */
    public float f16294J;

    /* renamed from: K */
    public float f16295K;

    /* renamed from: L */
    public int f16296L;

    /* renamed from: M */
    public Interpolator f16297M;

    /* renamed from: c */
    public Paint f16298c;

    /* renamed from: d */
    public Paint f16299d;

    /* renamed from: e */
    public Path f16300e;

    /* renamed from: f */
    public Path f16301f;

    /* renamed from: g */
    public int f16302g;

    /* renamed from: h */
    public int f16303h;

    /* renamed from: i */
    public float f16304i;

    /* renamed from: j */
    public float f16305j;

    /* renamed from: k */
    public float f16306k;

    /* renamed from: l */
    public float f16307l;

    /* renamed from: m */
    public float f16308m;

    /* renamed from: n */
    public float f16309n;

    /* renamed from: o */
    public float f16310o;

    /* renamed from: p */
    public float f16311p;

    /* renamed from: q */
    public float f16312q;

    /* renamed from: r */
    public float f16313r;

    /* renamed from: s */
    public float f16314s;

    /* renamed from: t */
    public float f16315t;

    /* renamed from: u */
    public float f16316u;

    /* renamed from: v */
    public float f16317v;

    /* renamed from: w */
    public float f16318w;

    /* renamed from: x */
    public boolean f16319x;

    /* renamed from: y */
    public float f16320y;

    /* renamed from: z */
    public float f16321z;

    public BezierBannerView(Context context) {
        this(context, null);
    }

    /* renamed from: g */
    private void m12881g() {
        Paint paint = new Paint(1);
        paint.setColor(this.f16302g);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f16298c = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f16303h);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.f16299d = paint2;
    }

    /* renamed from: a */
    public void m12882a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(this);
        if (viewPager.getAdapter() != null) {
            this.f16287C = viewPager.getAdapter().getCount();
        }
        this.f16286B = viewPager.getCurrentItem();
        m12888h();
        this.f16296L = f16284O;
        invalidate();
    }

    /* renamed from: b */
    public final float m12883b(int i10) {
        if (i10 == 0) {
            return this.f16305j;
        }
        float f10 = this.f16304i;
        float f11 = this.f16307l;
        return (i10 * (f10 + (2.0f * f11))) + f11 + (this.f16305j - f11);
    }

    /* renamed from: c */
    public float m12884c(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* renamed from: d */
    public float m12885d(float f10, float f11, int i10) {
        float f12;
        float f13;
        if (i10 == this.f16288D) {
            f12 = f11 - f10;
            f13 = this.f16320y;
        } else {
            f12 = f11 - f10;
            f13 = this.f16321z;
        }
        return f10 + (f12 * f13);
    }

    /* renamed from: e */
    public float m12886e(float f10, float f11) {
        return f10 + ((f11 - f10) * this.f16285A);
    }

    /* renamed from: f */
    public final void m12887f(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BezierBannerView);
        this.f16302g = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_selectedColor, -1);
        this.f16303h = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_unSelectedColor, -5592406);
        this.f16305j = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_selectedRadius, this.f16305j);
        this.f16307l = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_unSelectedRadius, this.f16307l);
        this.f16304i = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_spacing, this.f16304i);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    public final void m12888h() {
        this.f16300e.reset();
        this.f16301f.reset();
        float interpolation = this.f16297M.getInterpolation(this.f16285A);
        this.f16311p = m12885d(m12883b(this.f16286B), m12883b(this.f16286B + 1) - this.f16305j, this.f16289E);
        float f10 = this.f16305j;
        this.f16312q = f10;
        this.f16306k = m12884c(f10, 0.0f, interpolation);
        double radians = Math.toRadians(m12885d(45.0f, 0.0f, this.f16288D));
        float fSin = (float) (Math.sin(radians) * this.f16306k);
        float fCos = (float) (Math.cos(radians) * this.f16306k);
        this.f16313r = m12885d(m12883b(this.f16286B) + this.f16305j, m12883b(this.f16286B + 1), this.f16288D);
        float f11 = this.f16305j;
        this.f16314s = f11;
        this.f16309n = m12884c(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(m12885d(0.0f, 45.0f, this.f16289E));
        float fSin2 = (float) (Math.sin(radians2) * this.f16309n);
        float fCos2 = (float) (Math.cos(radians2) * this.f16309n);
        this.f16292H = this.f16311p + fSin;
        this.f16293I = this.f16312q - fCos;
        this.f16294J = this.f16313r - fSin2;
        this.f16295K = this.f16305j - fCos2;
        this.f16290F = m12886e(m12883b(this.f16286B) + this.f16305j, m12883b(this.f16286B + 1) - this.f16305j);
        this.f16291G = this.f16305j;
        this.f16300e.moveTo(this.f16292H, this.f16293I);
        this.f16300e.quadTo(this.f16290F, this.f16291G, this.f16294J, this.f16295K);
        this.f16300e.lineTo(this.f16294J, this.f16305j + fCos2);
        this.f16300e.quadTo(this.f16290F, this.f16305j, this.f16292H, this.f16293I + (fCos * 2.0f));
        this.f16300e.lineTo(this.f16292H, this.f16293I);
        this.f16317v = m12885d(m12883b(this.f16286B + 1), m12883b(this.f16286B) + this.f16307l, this.f16289E);
        this.f16318w = this.f16305j;
        this.f16308m = m12884c(this.f16307l, 0.0f, interpolation);
        double radians3 = Math.toRadians(m12885d(45.0f, 0.0f, this.f16288D));
        float fSin3 = (float) (Math.sin(radians3) * this.f16308m);
        float fCos3 = (float) (Math.cos(radians3) * this.f16308m);
        this.f16315t = m12885d(m12883b(this.f16286B + 1) - this.f16307l, m12883b(this.f16286B), this.f16288D);
        this.f16316u = this.f16305j;
        this.f16310o = m12884c(0.0f, this.f16307l, interpolation);
        double radians4 = Math.toRadians(m12885d(0.0f, 45.0f, this.f16289E));
        float fSin4 = (float) (Math.sin(radians4) * this.f16310o);
        float fCos4 = (float) (Math.cos(radians4) * this.f16310o);
        float f12 = this.f16317v - fSin3;
        float f13 = this.f16318w - fCos3;
        float f14 = this.f16315t + fSin4;
        float f15 = this.f16316u - fCos4;
        float fM12886e = m12886e(m12883b(this.f16286B + 1) - this.f16307l, m12883b(this.f16286B) + this.f16307l);
        float f16 = this.f16305j;
        this.f16301f.moveTo(f12, f13);
        this.f16301f.quadTo(fM12886e, f16, f14, f15);
        this.f16301f.lineTo(f14, this.f16305j + fCos4);
        this.f16301f.quadTo(fM12886e, f16, f12, (fCos3 * 2.0f) + f13);
        this.f16301f.lineTo(f12, f13);
    }

    /* renamed from: i */
    public final void m12889i() {
        this.f16300e.reset();
        this.f16301f.reset();
        float interpolation = this.f16297M.getInterpolation(this.f16285A);
        this.f16311p = m12885d(m12883b(this.f16286B), m12883b(this.f16286B - 1) + this.f16305j, this.f16289E);
        float f10 = this.f16305j;
        this.f16312q = f10;
        this.f16306k = m12884c(f10, 0.0f, interpolation);
        double radians = Math.toRadians(m12885d(45.0f, 0.0f, this.f16288D));
        float fSin = (float) (Math.sin(radians) * this.f16306k);
        float fCos = (float) (Math.cos(radians) * this.f16306k);
        this.f16313r = m12885d(m12883b(this.f16286B) - this.f16305j, m12883b(this.f16286B - 1), this.f16288D);
        float f11 = this.f16305j;
        this.f16314s = f11;
        this.f16309n = m12884c(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(m12885d(0.0f, 45.0f, this.f16289E));
        float fSin2 = (float) (Math.sin(radians2) * this.f16309n);
        float fCos2 = (float) (Math.cos(radians2) * this.f16309n);
        this.f16292H = this.f16311p - fSin;
        this.f16293I = this.f16312q - fCos;
        this.f16294J = this.f16313r + fSin2;
        this.f16295K = this.f16305j - fCos2;
        this.f16290F = m12886e(m12883b(this.f16286B) - this.f16305j, m12883b(this.f16286B - 1) + this.f16305j);
        this.f16291G = this.f16305j;
        this.f16300e.moveTo(this.f16292H, this.f16293I);
        this.f16300e.quadTo(this.f16290F, this.f16291G, this.f16294J, this.f16295K);
        this.f16300e.lineTo(this.f16294J, this.f16305j + fCos2);
        this.f16300e.quadTo(this.f16290F, this.f16305j, this.f16292H, this.f16293I + (fCos * 2.0f));
        this.f16300e.lineTo(this.f16292H, this.f16293I);
        this.f16317v = m12885d(m12883b(this.f16286B - 1), m12883b(this.f16286B) - this.f16307l, this.f16289E);
        this.f16318w = this.f16305j;
        this.f16308m = m12884c(this.f16307l, 0.0f, interpolation);
        double radians3 = Math.toRadians(m12885d(45.0f, 0.0f, this.f16288D));
        float fSin3 = (float) (Math.sin(radians3) * this.f16308m);
        float fCos3 = (float) (Math.cos(radians3) * this.f16308m);
        this.f16315t = m12885d(m12883b(this.f16286B - 1) + this.f16307l, m12883b(this.f16286B), this.f16288D);
        this.f16316u = this.f16305j;
        this.f16310o = m12884c(0.0f, this.f16307l, interpolation);
        double radians4 = Math.toRadians(m12885d(0.0f, 45.0f, this.f16289E));
        float fSin4 = (float) (Math.sin(radians4) * this.f16310o);
        float fCos4 = (float) (Math.cos(radians4) * this.f16310o);
        float f12 = this.f16317v + fSin3;
        float f13 = this.f16318w - fCos3;
        float f14 = this.f16315t - fSin4;
        float f15 = this.f16316u - fCos4;
        float fM12886e = m12886e(m12883b(this.f16286B - 1) + this.f16307l, m12883b(this.f16286B) - this.f16307l);
        float f16 = this.f16305j;
        this.f16301f.moveTo(f12, f13);
        this.f16301f.quadTo(fM12886e, f16, f14, f15);
        this.f16301f.lineTo(f14, this.f16305j + fCos4);
        this.f16301f.quadTo(fM12886e, f16, f12, (fCos3 * 2.0f) + f13);
        this.f16301f.lineTo(f12, f13);
    }

    /* renamed from: j */
    public void m12890j() {
        this.f16320y = 0.0f;
        this.f16321z = 0.0f;
        this.f16285A = 0.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        for (int i11 = 0; i11 < this.f16287C; i11++) {
            int i12 = this.f16296L;
            if (i12 == f16284O) {
                int i13 = this.f16286B;
                if (i11 != i13 && i11 != i13 + 1) {
                    canvas.drawCircle(m12883b(i11), this.f16305j, this.f16307l, this.f16299d);
                }
            } else if (i12 == f16283N && i11 != (i10 = this.f16286B) && i11 != i10 - 1) {
                canvas.drawCircle(m12883b(i11), this.f16305j, this.f16307l, this.f16299d);
            }
        }
        canvas.drawCircle(this.f16315t, this.f16316u, this.f16310o, this.f16299d);
        canvas.drawCircle(this.f16317v, this.f16318w, this.f16308m, this.f16299d);
        canvas.drawPath(this.f16301f, this.f16299d);
        canvas.drawCircle(this.f16313r, this.f16314s, this.f16309n, this.f16298c);
        canvas.drawCircle(this.f16311p, this.f16312q, this.f16306k, this.f16298c);
        canvas.drawPath(this.f16300e, this.f16298c);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = this.f16307l;
        int paddingLeft = (int) ((f10 * 2.0f * this.f16287C) + ((this.f16305j - f10) * 2.0f) + ((r5 - 1) * this.f16304i) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.f16305j * 2.0f) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, paddingLeft);
        }
        if (mode2 != 1073741824 && mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
        if (f10 == 0.0f) {
            this.f16286B = i10;
            m12890j();
        }
        float f11 = i10 + f10;
        int i12 = this.f16286B;
        if (f11 - i12 > 0.0f) {
            this.f16296L = f16284O;
            if (f11 > i12 + 1) {
                this.f16286B = i10;
                return;
            } else {
                setProgress(f10);
                return;
            }
        }
        if (f11 - i12 < 0.0f) {
            this.f16296L = f16283N;
            if (f11 < i12 - 1) {
                this.f16286B = i10;
            } else {
                setProgress(1.0f - f10);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
    }

    public void setDirection(int i10) {
        this.f16296L = i10;
    }

    public void setProgress(float f10) {
        if (f10 == 0.0f) {
            return;
        }
        this.f16285A = f10;
        if (f10 <= 0.5d) {
            this.f16320y = f10 / 0.5f;
            this.f16321z = 0.0f;
        } else {
            this.f16321z = (f10 - 0.5f) / 0.5f;
            this.f16320y = 1.0f;
        }
        if (this.f16296L == f16284O) {
            m12888h();
        } else {
            m12889i();
        }
        invalidate();
    }

    public BezierBannerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezierBannerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16300e = new Path();
        this.f16301f = new Path();
        this.f16304i = 80.0f;
        this.f16305j = 30.0f;
        this.f16307l = 20.0f;
        this.f16319x = false;
        this.f16320y = 0.0f;
        this.f16321z = 0.0f;
        this.f16286B = 0;
        this.f16288D = 1;
        this.f16289E = 2;
        this.f16297M = new AccelerateDecelerateInterpolator();
        m12887f(attributeSet);
        m12881g();
    }
}
