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
    public static int f7836L = 1;

    /* renamed from: M */
    public static int f7837M = 2;

    /* renamed from: A */
    public int f7838A;

    /* renamed from: B */
    public int f7839B;

    /* renamed from: C */
    public int f7840C;

    /* renamed from: D */
    public float f7841D;

    /* renamed from: E */
    public float f7842E;

    /* renamed from: F */
    public float f7843F;

    /* renamed from: G */
    public float f7844G;

    /* renamed from: H */
    public float f7845H;

    /* renamed from: I */
    public float f7846I;

    /* renamed from: J */
    public int f7847J;

    /* renamed from: K */
    public Interpolator f7848K;

    /* renamed from: a */
    public Paint f7849a;

    /* renamed from: b */
    public Paint f7850b;

    /* renamed from: c */
    public Path f7851c;

    /* renamed from: d */
    public Path f7852d;

    /* renamed from: e */
    public int f7853e;

    /* renamed from: f */
    public int f7854f;

    /* renamed from: g */
    public float f7855g;

    /* renamed from: h */
    public float f7856h;

    /* renamed from: i */
    public float f7857i;

    /* renamed from: j */
    public float f7858j;

    /* renamed from: k */
    public float f7859k;

    /* renamed from: l */
    public float f7860l;

    /* renamed from: m */
    public float f7861m;

    /* renamed from: n */
    public float f7862n;

    /* renamed from: o */
    public float f7863o;

    /* renamed from: p */
    public float f7864p;

    /* renamed from: q */
    public float f7865q;

    /* renamed from: r */
    public float f7866r;

    /* renamed from: s */
    public float f7867s;

    /* renamed from: t */
    public float f7868t;

    /* renamed from: u */
    public float f7869u;

    /* renamed from: v */
    public boolean f7870v;

    /* renamed from: w */
    public float f7871w;

    /* renamed from: x */
    public float f7872x;

    /* renamed from: y */
    public float f7873y;

    /* renamed from: z */
    public int f7874z;

    public BezierBannerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m6990a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(this);
        if (viewPager.getAdapter() != null) {
            this.f7838A = viewPager.getAdapter().getCount();
        }
        this.f7874z = viewPager.getCurrentItem();
        m6997h();
        this.f7847J = f7837M;
        invalidate();
    }

    /* renamed from: b */
    public final float m6991b(int i10) {
        if (i10 == 0) {
            return this.f7856h;
        }
        float f10 = this.f7855g;
        float f11 = this.f7858j;
        return (i10 * (f10 + (2.0f * f11))) + f11 + (this.f7856h - f11);
    }

    /* renamed from: c */
    public float m6992c(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* renamed from: d */
    public float m6993d(float f10, float f11, int i10) {
        float f12;
        float f13;
        if (i10 == this.f7839B) {
            f12 = f11 - f10;
            f13 = this.f7871w;
        } else {
            f12 = f11 - f10;
            f13 = this.f7872x;
        }
        return f10 + (f12 * f13);
    }

    /* renamed from: e */
    public float m6994e(float f10, float f11) {
        return f10 + ((f11 - f10) * this.f7873y);
    }

    /* renamed from: f */
    public final void m6995f(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BezierBannerView);
        this.f7853e = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_selectedColor, -1);
        this.f7854f = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_unSelectedColor, -5592406);
        this.f7856h = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_selectedRadius, this.f7856h);
        this.f7858j = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_unSelectedRadius, this.f7858j);
        this.f7855g = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_spacing, this.f7855g);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public final void m6996g() {
        Paint paint = new Paint(1);
        paint.setColor(this.f7853e);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f7849a = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f7854f);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.f7850b = paint2;
    }

    /* renamed from: h */
    public final void m6997h() {
        this.f7851c.reset();
        this.f7852d.reset();
        float interpolation = this.f7848K.getInterpolation(this.f7873y);
        this.f7862n = m6993d(m6991b(this.f7874z), m6991b(this.f7874z + 1) - this.f7856h, this.f7840C);
        float f10 = this.f7856h;
        this.f7863o = f10;
        this.f7857i = m6992c(f10, 0.0f, interpolation);
        double radians = Math.toRadians(m6993d(45.0f, 0.0f, this.f7839B));
        float fSin = (float) (Math.sin(radians) * this.f7857i);
        float fCos = (float) (Math.cos(radians) * this.f7857i);
        this.f7864p = m6993d(m6991b(this.f7874z) + this.f7856h, m6991b(this.f7874z + 1), this.f7839B);
        float f11 = this.f7856h;
        this.f7865q = f11;
        this.f7860l = m6992c(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(m6993d(0.0f, 45.0f, this.f7840C));
        float fSin2 = (float) (Math.sin(radians2) * this.f7860l);
        float fCos2 = (float) (Math.cos(radians2) * this.f7860l);
        this.f7843F = this.f7862n + fSin;
        this.f7844G = this.f7863o - fCos;
        this.f7845H = this.f7864p - fSin2;
        this.f7846I = this.f7856h - fCos2;
        this.f7841D = m6994e(m6991b(this.f7874z) + this.f7856h, m6991b(this.f7874z + 1) - this.f7856h);
        this.f7842E = this.f7856h;
        this.f7851c.moveTo(this.f7843F, this.f7844G);
        this.f7851c.quadTo(this.f7841D, this.f7842E, this.f7845H, this.f7846I);
        this.f7851c.lineTo(this.f7845H, this.f7856h + fCos2);
        this.f7851c.quadTo(this.f7841D, this.f7856h, this.f7843F, this.f7844G + (fCos * 2.0f));
        this.f7851c.lineTo(this.f7843F, this.f7844G);
        this.f7868t = m6993d(m6991b(this.f7874z + 1), m6991b(this.f7874z) + this.f7858j, this.f7840C);
        this.f7869u = this.f7856h;
        this.f7859k = m6992c(this.f7858j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m6993d(45.0f, 0.0f, this.f7839B));
        float fSin3 = (float) (Math.sin(radians3) * this.f7859k);
        float fCos3 = (float) (Math.cos(radians3) * this.f7859k);
        this.f7866r = m6993d(m6991b(this.f7874z + 1) - this.f7858j, m6991b(this.f7874z), this.f7839B);
        this.f7867s = this.f7856h;
        this.f7861m = m6992c(0.0f, this.f7858j, interpolation);
        double radians4 = Math.toRadians(m6993d(0.0f, 45.0f, this.f7840C));
        float fSin4 = (float) (Math.sin(radians4) * this.f7861m);
        float fCos4 = (float) (Math.cos(radians4) * this.f7861m);
        float f12 = this.f7868t - fSin3;
        float f13 = this.f7869u - fCos3;
        float f14 = this.f7866r + fSin4;
        float f15 = this.f7867s - fCos4;
        float fM6994e = m6994e(m6991b(this.f7874z + 1) - this.f7858j, m6991b(this.f7874z) + this.f7858j);
        float f16 = this.f7856h;
        this.f7852d.moveTo(f12, f13);
        this.f7852d.quadTo(fM6994e, f16, f14, f15);
        this.f7852d.lineTo(f14, this.f7856h + fCos4);
        this.f7852d.quadTo(fM6994e, f16, f12, (fCos3 * 2.0f) + f13);
        this.f7852d.lineTo(f12, f13);
    }

    /* renamed from: i */
    public final void m6998i() {
        this.f7851c.reset();
        this.f7852d.reset();
        float interpolation = this.f7848K.getInterpolation(this.f7873y);
        this.f7862n = m6993d(m6991b(this.f7874z), m6991b(this.f7874z - 1) + this.f7856h, this.f7840C);
        float f10 = this.f7856h;
        this.f7863o = f10;
        this.f7857i = m6992c(f10, 0.0f, interpolation);
        double radians = Math.toRadians(m6993d(45.0f, 0.0f, this.f7839B));
        float fSin = (float) (Math.sin(radians) * this.f7857i);
        float fCos = (float) (Math.cos(radians) * this.f7857i);
        this.f7864p = m6993d(m6991b(this.f7874z) - this.f7856h, m6991b(this.f7874z - 1), this.f7839B);
        float f11 = this.f7856h;
        this.f7865q = f11;
        this.f7860l = m6992c(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(m6993d(0.0f, 45.0f, this.f7840C));
        float fSin2 = (float) (Math.sin(radians2) * this.f7860l);
        float fCos2 = (float) (Math.cos(radians2) * this.f7860l);
        this.f7843F = this.f7862n - fSin;
        this.f7844G = this.f7863o - fCos;
        this.f7845H = this.f7864p + fSin2;
        this.f7846I = this.f7856h - fCos2;
        this.f7841D = m6994e(m6991b(this.f7874z) - this.f7856h, m6991b(this.f7874z - 1) + this.f7856h);
        this.f7842E = this.f7856h;
        this.f7851c.moveTo(this.f7843F, this.f7844G);
        this.f7851c.quadTo(this.f7841D, this.f7842E, this.f7845H, this.f7846I);
        this.f7851c.lineTo(this.f7845H, this.f7856h + fCos2);
        this.f7851c.quadTo(this.f7841D, this.f7856h, this.f7843F, this.f7844G + (fCos * 2.0f));
        this.f7851c.lineTo(this.f7843F, this.f7844G);
        this.f7868t = m6993d(m6991b(this.f7874z - 1), m6991b(this.f7874z) - this.f7858j, this.f7840C);
        this.f7869u = this.f7856h;
        this.f7859k = m6992c(this.f7858j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m6993d(45.0f, 0.0f, this.f7839B));
        float fSin3 = (float) (Math.sin(radians3) * this.f7859k);
        float fCos3 = (float) (Math.cos(radians3) * this.f7859k);
        this.f7866r = m6993d(m6991b(this.f7874z - 1) + this.f7858j, m6991b(this.f7874z), this.f7839B);
        this.f7867s = this.f7856h;
        this.f7861m = m6992c(0.0f, this.f7858j, interpolation);
        double radians4 = Math.toRadians(m6993d(0.0f, 45.0f, this.f7840C));
        float fSin4 = (float) (Math.sin(radians4) * this.f7861m);
        float fCos4 = (float) (Math.cos(radians4) * this.f7861m);
        float f12 = this.f7868t + fSin3;
        float f13 = this.f7869u - fCos3;
        float f14 = this.f7866r - fSin4;
        float f15 = this.f7867s - fCos4;
        float fM6994e = m6994e(m6991b(this.f7874z - 1) + this.f7858j, m6991b(this.f7874z) - this.f7858j);
        float f16 = this.f7856h;
        this.f7852d.moveTo(f12, f13);
        this.f7852d.quadTo(fM6994e, f16, f14, f15);
        this.f7852d.lineTo(f14, this.f7856h + fCos4);
        this.f7852d.quadTo(fM6994e, f16, f12, (fCos3 * 2.0f) + f13);
        this.f7852d.lineTo(f12, f13);
    }

    /* renamed from: j */
    public void m6999j() {
        this.f7871w = 0.0f;
        this.f7872x = 0.0f;
        this.f7873y = 0.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        for (int i11 = 0; i11 < this.f7838A; i11++) {
            int i12 = this.f7847J;
            if (i12 == f7837M) {
                int i13 = this.f7874z;
                if (i11 != i13 && i11 != i13 + 1) {
                    canvas.drawCircle(m6991b(i11), this.f7856h, this.f7858j, this.f7850b);
                }
            } else if (i12 == f7836L && i11 != (i10 = this.f7874z) && i11 != i10 - 1) {
                canvas.drawCircle(m6991b(i11), this.f7856h, this.f7858j, this.f7850b);
            }
        }
        canvas.drawCircle(this.f7866r, this.f7867s, this.f7861m, this.f7850b);
        canvas.drawCircle(this.f7868t, this.f7869u, this.f7859k, this.f7850b);
        canvas.drawPath(this.f7852d, this.f7850b);
        canvas.drawCircle(this.f7864p, this.f7865q, this.f7860l, this.f7849a);
        canvas.drawCircle(this.f7862n, this.f7863o, this.f7857i, this.f7849a);
        canvas.drawPath(this.f7851c, this.f7849a);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = this.f7858j;
        int paddingLeft = (int) ((f10 * 2.0f * this.f7838A) + ((this.f7856h - f10) * 2.0f) + ((r5 - 1) * this.f7855g) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.f7856h * 2.0f) + getPaddingTop() + getPaddingBottom());
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
            this.f7874z = i10;
            m6999j();
        }
        float f11 = i10 + f10;
        int i12 = this.f7874z;
        if (f11 - i12 > 0.0f) {
            this.f7847J = f7837M;
            if (f11 > i12 + 1) {
                this.f7874z = i10;
                return;
            } else {
                setProgress(f10);
                return;
            }
        }
        if (f11 - i12 < 0.0f) {
            this.f7847J = f7836L;
            if (f11 < i12 - 1) {
                this.f7874z = i10;
            } else {
                setProgress(1.0f - f10);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
    }

    public void setDirection(int i10) {
        this.f7847J = i10;
    }

    public void setProgress(float f10) {
        if (f10 == 0.0f) {
            return;
        }
        this.f7873y = f10;
        if (f10 <= 0.5d) {
            this.f7871w = f10 / 0.5f;
            this.f7872x = 0.0f;
        } else {
            this.f7872x = (f10 - 0.5f) / 0.5f;
            this.f7871w = 1.0f;
        }
        if (this.f7847J == f7837M) {
            m6997h();
        } else {
            m6998i();
        }
        invalidate();
    }

    public BezierBannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7851c = new Path();
        this.f7852d = new Path();
        this.f7855g = 80.0f;
        this.f7856h = 30.0f;
        this.f7858j = 20.0f;
        this.f7870v = false;
        this.f7871w = 0.0f;
        this.f7872x = 0.0f;
        this.f7874z = 0;
        this.f7839B = 1;
        this.f7840C = 2;
        this.f7848K = new AccelerateDecelerateInterpolator();
        m6995f(attributeSet);
        m6996g();
    }
}
