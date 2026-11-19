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

/* loaded from: classes2.dex */
public class BezierBannerView extends View implements ViewPager.OnPageChangeListener {

    /* renamed from: L */
    public static int f3623L = 1;

    /* renamed from: M */
    public static int f3624M = 2;

    /* renamed from: A */
    public int f3625A;

    /* renamed from: B */
    public int f3626B;

    /* renamed from: C */
    public int f3627C;

    /* renamed from: D */
    public float f3628D;

    /* renamed from: E */
    public float f3629E;

    /* renamed from: F */
    public float f3630F;

    /* renamed from: G */
    public float f3631G;

    /* renamed from: H */
    public float f3632H;

    /* renamed from: I */
    public float f3633I;

    /* renamed from: J */
    public int f3634J;

    /* renamed from: K */
    public Interpolator f3635K;

    /* renamed from: a */
    public Paint f3636a;

    /* renamed from: b */
    public Paint f3637b;

    /* renamed from: c */
    public Path f3638c;

    /* renamed from: d */
    public Path f3639d;

    /* renamed from: e */
    public int f3640e;

    /* renamed from: f */
    public int f3641f;

    /* renamed from: g */
    public float f3642g;

    /* renamed from: h */
    public float f3643h;

    /* renamed from: i */
    public float f3644i;

    /* renamed from: j */
    public float f3645j;

    /* renamed from: k */
    public float f3646k;

    /* renamed from: l */
    public float f3647l;

    /* renamed from: m */
    public float f3648m;

    /* renamed from: n */
    public float f3649n;

    /* renamed from: o */
    public float f3650o;

    /* renamed from: p */
    public float f3651p;

    /* renamed from: q */
    public float f3652q;

    /* renamed from: r */
    public float f3653r;

    /* renamed from: s */
    public float f3654s;

    /* renamed from: t */
    public float f3655t;

    /* renamed from: u */
    public float f3656u;

    /* renamed from: v */
    public boolean f3657v;

    /* renamed from: w */
    public float f3658w;

    /* renamed from: x */
    public float f3659x;

    /* renamed from: y */
    public float f3660y;

    /* renamed from: z */
    public int f3661z;

    public BezierBannerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m4437a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(this);
        if (viewPager.getAdapter() != null) {
            this.f3625A = viewPager.getAdapter().getCount();
        }
        this.f3661z = viewPager.getCurrentItem();
        m4444h();
        this.f3634J = f3624M;
        invalidate();
    }

    /* renamed from: b */
    public final float m4438b(int i4) {
        if (i4 == 0) {
            return this.f3643h;
        }
        float f4 = this.f3642g;
        float f5 = this.f3645j;
        return (i4 * (f4 + (2.0f * f5))) + f5 + (this.f3643h - f5);
    }

    /* renamed from: c */
    public float m4439c(float f4, float f5, float f6) {
        return f4 + ((f5 - f4) * f6);
    }

    /* renamed from: d */
    public float m4440d(float f4, float f5, int i4) {
        float f6;
        float f7;
        if (i4 == this.f3626B) {
            f6 = f5 - f4;
            f7 = this.f3658w;
        } else {
            f6 = f5 - f4;
            f7 = this.f3659x;
        }
        return f4 + (f6 * f7);
    }

    /* renamed from: e */
    public float m4441e(float f4, float f5) {
        return f4 + ((f5 - f4) * this.f3660y);
    }

    /* renamed from: f */
    public final void m4442f(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BezierBannerView);
        this.f3640e = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_selectedColor, -1);
        this.f3641f = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_unSelectedColor, -5592406);
        this.f3643h = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_selectedRadius, this.f3643h);
        this.f3645j = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_unSelectedRadius, this.f3645j);
        this.f3642g = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_spacing, this.f3642g);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public final void m4443g() {
        Paint paint = new Paint(1);
        paint.setColor(this.f3640e);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f3636a = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f3641f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.f3637b = paint2;
    }

    /* renamed from: h */
    public final void m4444h() {
        this.f3638c.reset();
        this.f3639d.reset();
        float interpolation = this.f3635K.getInterpolation(this.f3660y);
        this.f3649n = m4440d(m4438b(this.f3661z), m4438b(this.f3661z + 1) - this.f3643h, this.f3627C);
        float f4 = this.f3643h;
        this.f3650o = f4;
        this.f3644i = m4439c(f4, 0.0f, interpolation);
        double radians = Math.toRadians(m4440d(45.0f, 0.0f, this.f3626B));
        float fSin = (float) (Math.sin(radians) * this.f3644i);
        float fCos = (float) (Math.cos(radians) * this.f3644i);
        this.f3651p = m4440d(m4438b(this.f3661z) + this.f3643h, m4438b(this.f3661z + 1), this.f3626B);
        float f5 = this.f3643h;
        this.f3652q = f5;
        this.f3647l = m4439c(0.0f, f5, interpolation);
        double radians2 = Math.toRadians(m4440d(0.0f, 45.0f, this.f3627C));
        float fSin2 = (float) (Math.sin(radians2) * this.f3647l);
        float fCos2 = (float) (Math.cos(radians2) * this.f3647l);
        this.f3630F = this.f3649n + fSin;
        this.f3631G = this.f3650o - fCos;
        this.f3632H = this.f3651p - fSin2;
        this.f3633I = this.f3643h - fCos2;
        this.f3628D = m4441e(m4438b(this.f3661z) + this.f3643h, m4438b(this.f3661z + 1) - this.f3643h);
        this.f3629E = this.f3643h;
        this.f3638c.moveTo(this.f3630F, this.f3631G);
        this.f3638c.quadTo(this.f3628D, this.f3629E, this.f3632H, this.f3633I);
        this.f3638c.lineTo(this.f3632H, this.f3643h + fCos2);
        this.f3638c.quadTo(this.f3628D, this.f3643h, this.f3630F, this.f3631G + (fCos * 2.0f));
        this.f3638c.lineTo(this.f3630F, this.f3631G);
        this.f3655t = m4440d(m4438b(this.f3661z + 1), m4438b(this.f3661z) + this.f3645j, this.f3627C);
        this.f3656u = this.f3643h;
        this.f3646k = m4439c(this.f3645j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m4440d(45.0f, 0.0f, this.f3626B));
        float fSin3 = (float) (Math.sin(radians3) * this.f3646k);
        float fCos3 = (float) (Math.cos(radians3) * this.f3646k);
        this.f3653r = m4440d(m4438b(this.f3661z + 1) - this.f3645j, m4438b(this.f3661z), this.f3626B);
        this.f3654s = this.f3643h;
        this.f3648m = m4439c(0.0f, this.f3645j, interpolation);
        double radians4 = Math.toRadians(m4440d(0.0f, 45.0f, this.f3627C));
        float fSin4 = (float) (Math.sin(radians4) * this.f3648m);
        float fCos4 = (float) (Math.cos(radians4) * this.f3648m);
        float f6 = this.f3655t - fSin3;
        float f7 = this.f3656u - fCos3;
        float f8 = this.f3653r + fSin4;
        float f9 = this.f3654s - fCos4;
        float fM4441e = m4441e(m4438b(this.f3661z + 1) - this.f3645j, m4438b(this.f3661z) + this.f3645j);
        float f10 = this.f3643h;
        this.f3639d.moveTo(f6, f7);
        this.f3639d.quadTo(fM4441e, f10, f8, f9);
        this.f3639d.lineTo(f8, this.f3643h + fCos4);
        this.f3639d.quadTo(fM4441e, f10, f6, (fCos3 * 2.0f) + f7);
        this.f3639d.lineTo(f6, f7);
    }

    /* renamed from: i */
    public final void m4445i() {
        this.f3638c.reset();
        this.f3639d.reset();
        float interpolation = this.f3635K.getInterpolation(this.f3660y);
        this.f3649n = m4440d(m4438b(this.f3661z), m4438b(this.f3661z - 1) + this.f3643h, this.f3627C);
        float f4 = this.f3643h;
        this.f3650o = f4;
        this.f3644i = m4439c(f4, 0.0f, interpolation);
        double radians = Math.toRadians(m4440d(45.0f, 0.0f, this.f3626B));
        float fSin = (float) (Math.sin(radians) * this.f3644i);
        float fCos = (float) (Math.cos(radians) * this.f3644i);
        this.f3651p = m4440d(m4438b(this.f3661z) - this.f3643h, m4438b(this.f3661z - 1), this.f3626B);
        float f5 = this.f3643h;
        this.f3652q = f5;
        this.f3647l = m4439c(0.0f, f5, interpolation);
        double radians2 = Math.toRadians(m4440d(0.0f, 45.0f, this.f3627C));
        float fSin2 = (float) (Math.sin(radians2) * this.f3647l);
        float fCos2 = (float) (Math.cos(radians2) * this.f3647l);
        this.f3630F = this.f3649n - fSin;
        this.f3631G = this.f3650o - fCos;
        this.f3632H = this.f3651p + fSin2;
        this.f3633I = this.f3643h - fCos2;
        this.f3628D = m4441e(m4438b(this.f3661z) - this.f3643h, m4438b(this.f3661z - 1) + this.f3643h);
        this.f3629E = this.f3643h;
        this.f3638c.moveTo(this.f3630F, this.f3631G);
        this.f3638c.quadTo(this.f3628D, this.f3629E, this.f3632H, this.f3633I);
        this.f3638c.lineTo(this.f3632H, this.f3643h + fCos2);
        this.f3638c.quadTo(this.f3628D, this.f3643h, this.f3630F, this.f3631G + (fCos * 2.0f));
        this.f3638c.lineTo(this.f3630F, this.f3631G);
        this.f3655t = m4440d(m4438b(this.f3661z - 1), m4438b(this.f3661z) - this.f3645j, this.f3627C);
        this.f3656u = this.f3643h;
        this.f3646k = m4439c(this.f3645j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m4440d(45.0f, 0.0f, this.f3626B));
        float fSin3 = (float) (Math.sin(radians3) * this.f3646k);
        float fCos3 = (float) (Math.cos(radians3) * this.f3646k);
        this.f3653r = m4440d(m4438b(this.f3661z - 1) + this.f3645j, m4438b(this.f3661z), this.f3626B);
        this.f3654s = this.f3643h;
        this.f3648m = m4439c(0.0f, this.f3645j, interpolation);
        double radians4 = Math.toRadians(m4440d(0.0f, 45.0f, this.f3627C));
        float fSin4 = (float) (Math.sin(radians4) * this.f3648m);
        float fCos4 = (float) (Math.cos(radians4) * this.f3648m);
        float f6 = this.f3655t + fSin3;
        float f7 = this.f3656u - fCos3;
        float f8 = this.f3653r - fSin4;
        float f9 = this.f3654s - fCos4;
        float fM4441e = m4441e(m4438b(this.f3661z - 1) + this.f3645j, m4438b(this.f3661z) - this.f3645j);
        float f10 = this.f3643h;
        this.f3639d.moveTo(f6, f7);
        this.f3639d.quadTo(fM4441e, f10, f8, f9);
        this.f3639d.lineTo(f8, this.f3643h + fCos4);
        this.f3639d.quadTo(fM4441e, f10, f6, (fCos3 * 2.0f) + f7);
        this.f3639d.lineTo(f6, f7);
    }

    /* renamed from: j */
    public void m4446j() {
        this.f3658w = 0.0f;
        this.f3659x = 0.0f;
        this.f3660y = 0.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i4;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        for (int i5 = 0; i5 < this.f3625A; i5++) {
            int i6 = this.f3634J;
            if (i6 == f3624M) {
                int i7 = this.f3661z;
                if (i5 != i7 && i5 != i7 + 1) {
                    canvas.drawCircle(m4438b(i5), this.f3643h, this.f3645j, this.f3637b);
                }
            } else if (i6 == f3623L && i5 != (i4 = this.f3661z) && i5 != i4 - 1) {
                canvas.drawCircle(m4438b(i5), this.f3643h, this.f3645j, this.f3637b);
            }
        }
        canvas.drawCircle(this.f3653r, this.f3654s, this.f3648m, this.f3637b);
        canvas.drawCircle(this.f3655t, this.f3656u, this.f3646k, this.f3637b);
        canvas.drawPath(this.f3639d, this.f3637b);
        canvas.drawCircle(this.f3651p, this.f3652q, this.f3647l, this.f3636a);
        canvas.drawCircle(this.f3649n, this.f3650o, this.f3644i, this.f3636a);
        canvas.drawPath(this.f3638c, this.f3636a);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        float f4 = this.f3645j;
        int paddingLeft = (int) ((f4 * 2.0f * this.f3625A) + ((this.f3643h - f4) * 2.0f) + ((r5 - 1) * this.f3642g) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.f3643h * 2.0f) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, paddingLeft);
        }
        if (mode2 != 1073741824 && mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f4, int i5) {
        if (f4 == 0.0f) {
            this.f3661z = i4;
            m4446j();
        }
        float f5 = i4 + f4;
        int i6 = this.f3661z;
        if (f5 - i6 > 0.0f) {
            this.f3634J = f3624M;
            if (f5 > i6 + 1) {
                this.f3661z = i4;
                return;
            } else {
                setProgress(f4);
                return;
            }
        }
        if (f5 - i6 < 0.0f) {
            this.f3634J = f3623L;
            if (f5 < i6 - 1) {
                this.f3661z = i4;
            } else {
                setProgress(1.0f - f4);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i4) {
    }

    public void setDirection(int i4) {
        this.f3634J = i4;
    }

    public void setProgress(float f4) {
        if (f4 == 0.0f) {
            return;
        }
        this.f3660y = f4;
        if (f4 <= 0.5d) {
            this.f3658w = f4 / 0.5f;
            this.f3659x = 0.0f;
        } else {
            this.f3659x = (f4 - 0.5f) / 0.5f;
            this.f3658w = 1.0f;
        }
        if (this.f3634J == f3624M) {
            m4444h();
        } else {
            m4445i();
        }
        invalidate();
    }

    public BezierBannerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3638c = new Path();
        this.f3639d = new Path();
        this.f3642g = 80.0f;
        this.f3643h = 30.0f;
        this.f3645j = 20.0f;
        this.f3657v = false;
        this.f3658w = 0.0f;
        this.f3659x = 0.0f;
        this.f3661z = 0;
        this.f3626B = 1;
        this.f3627C = 2;
        this.f3635K = new AccelerateDecelerateInterpolator();
        m4442f(attributeSet);
        m4443g();
    }
}
