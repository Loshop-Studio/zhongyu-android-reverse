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
    public static int f6419L = 1;

    /* renamed from: M */
    public static int f6420M = 2;

    /* renamed from: A */
    public int f6421A;

    /* renamed from: B */
    public int f6422B;

    /* renamed from: C */
    public int f6423C;

    /* renamed from: D */
    public float f6424D;

    /* renamed from: E */
    public float f6425E;

    /* renamed from: F */
    public float f6426F;

    /* renamed from: G */
    public float f6427G;

    /* renamed from: H */
    public float f6428H;

    /* renamed from: I */
    public float f6429I;

    /* renamed from: J */
    public int f6430J;

    /* renamed from: K */
    public Interpolator f6431K;

    /* renamed from: a */
    public Paint f6432a;

    /* renamed from: b */
    public Paint f6433b;

    /* renamed from: c */
    public Path f6434c;

    /* renamed from: d */
    public Path f6435d;

    /* renamed from: e */
    public int f6436e;

    /* renamed from: f */
    public int f6437f;

    /* renamed from: g */
    public float f6438g;

    /* renamed from: h */
    public float f6439h;

    /* renamed from: i */
    public float f6440i;

    /* renamed from: j */
    public float f6441j;

    /* renamed from: k */
    public float f6442k;

    /* renamed from: l */
    public float f6443l;

    /* renamed from: m */
    public float f6444m;

    /* renamed from: n */
    public float f6445n;

    /* renamed from: o */
    public float f6446o;

    /* renamed from: p */
    public float f6447p;

    /* renamed from: q */
    public float f6448q;

    /* renamed from: r */
    public float f6449r;

    /* renamed from: s */
    public float f6450s;

    /* renamed from: t */
    public float f6451t;

    /* renamed from: u */
    public float f6452u;

    /* renamed from: v */
    public boolean f6453v;

    /* renamed from: w */
    public float f6454w;

    /* renamed from: x */
    public float f6455x;

    /* renamed from: y */
    public float f6456y;

    /* renamed from: z */
    public int f6457z;

    public BezierBannerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m5796a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(this);
        if (viewPager.getAdapter() != null) {
            this.f6421A = viewPager.getAdapter().getCount();
        }
        this.f6457z = viewPager.getCurrentItem();
        m5803h();
        this.f6430J = f6420M;
        invalidate();
    }

    /* renamed from: b */
    public final float m5797b(int i10) {
        if (i10 == 0) {
            return this.f6439h;
        }
        float f10 = this.f6438g;
        float f11 = this.f6441j;
        return (i10 * (f10 + (2.0f * f11))) + f11 + (this.f6439h - f11);
    }

    /* renamed from: c */
    public float m5798c(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* renamed from: d */
    public float m5799d(float f10, float f11, int i10) {
        float f12;
        float f13;
        if (i10 == this.f6422B) {
            f12 = f11 - f10;
            f13 = this.f6454w;
        } else {
            f12 = f11 - f10;
            f13 = this.f6455x;
        }
        return f10 + (f12 * f13);
    }

    /* renamed from: e */
    public float m5800e(float f10, float f11) {
        return f10 + ((f11 - f10) * this.f6456y);
    }

    /* renamed from: f */
    public final void m5801f(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BezierBannerView);
        this.f6436e = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_selectedColor, -1);
        this.f6437f = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_unSelectedColor, -5592406);
        this.f6439h = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_selectedRadius, this.f6439h);
        this.f6441j = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_unSelectedRadius, this.f6441j);
        this.f6438g = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_spacing, this.f6438g);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public final void m5802g() {
        Paint paint = new Paint(1);
        paint.setColor(this.f6436e);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f6432a = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f6437f);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.f6433b = paint2;
    }

    /* renamed from: h */
    public final void m5803h() {
        this.f6434c.reset();
        this.f6435d.reset();
        float interpolation = this.f6431K.getInterpolation(this.f6456y);
        this.f6445n = m5799d(m5797b(this.f6457z), m5797b(this.f6457z + 1) - this.f6439h, this.f6423C);
        float f10 = this.f6439h;
        this.f6446o = f10;
        this.f6440i = m5798c(f10, 0.0f, interpolation);
        double radians = Math.toRadians(m5799d(45.0f, 0.0f, this.f6422B));
        float fSin = (float) (Math.sin(radians) * this.f6440i);
        float fCos = (float) (Math.cos(radians) * this.f6440i);
        this.f6447p = m5799d(m5797b(this.f6457z) + this.f6439h, m5797b(this.f6457z + 1), this.f6422B);
        float f11 = this.f6439h;
        this.f6448q = f11;
        this.f6443l = m5798c(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(m5799d(0.0f, 45.0f, this.f6423C));
        float fSin2 = (float) (Math.sin(radians2) * this.f6443l);
        float fCos2 = (float) (Math.cos(radians2) * this.f6443l);
        this.f6426F = this.f6445n + fSin;
        this.f6427G = this.f6446o - fCos;
        this.f6428H = this.f6447p - fSin2;
        this.f6429I = this.f6439h - fCos2;
        this.f6424D = m5800e(m5797b(this.f6457z) + this.f6439h, m5797b(this.f6457z + 1) - this.f6439h);
        this.f6425E = this.f6439h;
        this.f6434c.moveTo(this.f6426F, this.f6427G);
        this.f6434c.quadTo(this.f6424D, this.f6425E, this.f6428H, this.f6429I);
        this.f6434c.lineTo(this.f6428H, this.f6439h + fCos2);
        this.f6434c.quadTo(this.f6424D, this.f6439h, this.f6426F, this.f6427G + (fCos * 2.0f));
        this.f6434c.lineTo(this.f6426F, this.f6427G);
        this.f6451t = m5799d(m5797b(this.f6457z + 1), m5797b(this.f6457z) + this.f6441j, this.f6423C);
        this.f6452u = this.f6439h;
        this.f6442k = m5798c(this.f6441j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m5799d(45.0f, 0.0f, this.f6422B));
        float fSin3 = (float) (Math.sin(radians3) * this.f6442k);
        float fCos3 = (float) (Math.cos(radians3) * this.f6442k);
        this.f6449r = m5799d(m5797b(this.f6457z + 1) - this.f6441j, m5797b(this.f6457z), this.f6422B);
        this.f6450s = this.f6439h;
        this.f6444m = m5798c(0.0f, this.f6441j, interpolation);
        double radians4 = Math.toRadians(m5799d(0.0f, 45.0f, this.f6423C));
        float fSin4 = (float) (Math.sin(radians4) * this.f6444m);
        float fCos4 = (float) (Math.cos(radians4) * this.f6444m);
        float f12 = this.f6451t - fSin3;
        float f13 = this.f6452u - fCos3;
        float f14 = this.f6449r + fSin4;
        float f15 = this.f6450s - fCos4;
        float fM5800e = m5800e(m5797b(this.f6457z + 1) - this.f6441j, m5797b(this.f6457z) + this.f6441j);
        float f16 = this.f6439h;
        this.f6435d.moveTo(f12, f13);
        this.f6435d.quadTo(fM5800e, f16, f14, f15);
        this.f6435d.lineTo(f14, this.f6439h + fCos4);
        this.f6435d.quadTo(fM5800e, f16, f12, (fCos3 * 2.0f) + f13);
        this.f6435d.lineTo(f12, f13);
    }

    /* renamed from: i */
    public final void m5804i() {
        this.f6434c.reset();
        this.f6435d.reset();
        float interpolation = this.f6431K.getInterpolation(this.f6456y);
        this.f6445n = m5799d(m5797b(this.f6457z), m5797b(this.f6457z - 1) + this.f6439h, this.f6423C);
        float f10 = this.f6439h;
        this.f6446o = f10;
        this.f6440i = m5798c(f10, 0.0f, interpolation);
        double radians = Math.toRadians(m5799d(45.0f, 0.0f, this.f6422B));
        float fSin = (float) (Math.sin(radians) * this.f6440i);
        float fCos = (float) (Math.cos(radians) * this.f6440i);
        this.f6447p = m5799d(m5797b(this.f6457z) - this.f6439h, m5797b(this.f6457z - 1), this.f6422B);
        float f11 = this.f6439h;
        this.f6448q = f11;
        this.f6443l = m5798c(0.0f, f11, interpolation);
        double radians2 = Math.toRadians(m5799d(0.0f, 45.0f, this.f6423C));
        float fSin2 = (float) (Math.sin(radians2) * this.f6443l);
        float fCos2 = (float) (Math.cos(radians2) * this.f6443l);
        this.f6426F = this.f6445n - fSin;
        this.f6427G = this.f6446o - fCos;
        this.f6428H = this.f6447p + fSin2;
        this.f6429I = this.f6439h - fCos2;
        this.f6424D = m5800e(m5797b(this.f6457z) - this.f6439h, m5797b(this.f6457z - 1) + this.f6439h);
        this.f6425E = this.f6439h;
        this.f6434c.moveTo(this.f6426F, this.f6427G);
        this.f6434c.quadTo(this.f6424D, this.f6425E, this.f6428H, this.f6429I);
        this.f6434c.lineTo(this.f6428H, this.f6439h + fCos2);
        this.f6434c.quadTo(this.f6424D, this.f6439h, this.f6426F, this.f6427G + (fCos * 2.0f));
        this.f6434c.lineTo(this.f6426F, this.f6427G);
        this.f6451t = m5799d(m5797b(this.f6457z - 1), m5797b(this.f6457z) - this.f6441j, this.f6423C);
        this.f6452u = this.f6439h;
        this.f6442k = m5798c(this.f6441j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m5799d(45.0f, 0.0f, this.f6422B));
        float fSin3 = (float) (Math.sin(radians3) * this.f6442k);
        float fCos3 = (float) (Math.cos(radians3) * this.f6442k);
        this.f6449r = m5799d(m5797b(this.f6457z - 1) + this.f6441j, m5797b(this.f6457z), this.f6422B);
        this.f6450s = this.f6439h;
        this.f6444m = m5798c(0.0f, this.f6441j, interpolation);
        double radians4 = Math.toRadians(m5799d(0.0f, 45.0f, this.f6423C));
        float fSin4 = (float) (Math.sin(radians4) * this.f6444m);
        float fCos4 = (float) (Math.cos(radians4) * this.f6444m);
        float f12 = this.f6451t + fSin3;
        float f13 = this.f6452u - fCos3;
        float f14 = this.f6449r - fSin4;
        float f15 = this.f6450s - fCos4;
        float fM5800e = m5800e(m5797b(this.f6457z - 1) + this.f6441j, m5797b(this.f6457z) - this.f6441j);
        float f16 = this.f6439h;
        this.f6435d.moveTo(f12, f13);
        this.f6435d.quadTo(fM5800e, f16, f14, f15);
        this.f6435d.lineTo(f14, this.f6439h + fCos4);
        this.f6435d.quadTo(fM5800e, f16, f12, (fCos3 * 2.0f) + f13);
        this.f6435d.lineTo(f12, f13);
    }

    /* renamed from: j */
    public void m5805j() {
        this.f6454w = 0.0f;
        this.f6455x = 0.0f;
        this.f6456y = 0.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        for (int i11 = 0; i11 < this.f6421A; i11++) {
            int i12 = this.f6430J;
            if (i12 == f6420M) {
                int i13 = this.f6457z;
                if (i11 != i13 && i11 != i13 + 1) {
                    canvas.drawCircle(m5797b(i11), this.f6439h, this.f6441j, this.f6433b);
                }
            } else if (i12 == f6419L && i11 != (i10 = this.f6457z) && i11 != i10 - 1) {
                canvas.drawCircle(m5797b(i11), this.f6439h, this.f6441j, this.f6433b);
            }
        }
        canvas.drawCircle(this.f6449r, this.f6450s, this.f6444m, this.f6433b);
        canvas.drawCircle(this.f6451t, this.f6452u, this.f6442k, this.f6433b);
        canvas.drawPath(this.f6435d, this.f6433b);
        canvas.drawCircle(this.f6447p, this.f6448q, this.f6443l, this.f6432a);
        canvas.drawCircle(this.f6445n, this.f6446o, this.f6440i, this.f6432a);
        canvas.drawPath(this.f6434c, this.f6432a);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = this.f6441j;
        int paddingLeft = (int) ((f10 * 2.0f * this.f6421A) + ((this.f6439h - f10) * 2.0f) + ((r5 - 1) * this.f6438g) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.f6439h * 2.0f) + getPaddingTop() + getPaddingBottom());
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
            this.f6457z = i10;
            m5805j();
        }
        float f11 = i10 + f10;
        int i12 = this.f6457z;
        if (f11 - i12 > 0.0f) {
            this.f6430J = f6420M;
            if (f11 > i12 + 1) {
                this.f6457z = i10;
                return;
            } else {
                setProgress(f10);
                return;
            }
        }
        if (f11 - i12 < 0.0f) {
            this.f6430J = f6419L;
            if (f11 < i12 - 1) {
                this.f6457z = i10;
            } else {
                setProgress(1.0f - f10);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
    }

    public void setDirection(int i10) {
        this.f6430J = i10;
    }

    public void setProgress(float f10) {
        if (f10 == 0.0f) {
            return;
        }
        this.f6456y = f10;
        if (f10 <= 0.5d) {
            this.f6454w = f10 / 0.5f;
            this.f6455x = 0.0f;
        } else {
            this.f6455x = (f10 - 0.5f) / 0.5f;
            this.f6454w = 1.0f;
        }
        if (this.f6430J == f6420M) {
            m5803h();
        } else {
            m5804i();
        }
        invalidate();
    }

    public BezierBannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6434c = new Path();
        this.f6435d = new Path();
        this.f6438g = 80.0f;
        this.f6439h = 30.0f;
        this.f6441j = 20.0f;
        this.f6453v = false;
        this.f6454w = 0.0f;
        this.f6455x = 0.0f;
        this.f6457z = 0;
        this.f6422B = 1;
        this.f6423C = 2;
        this.f6431K = new AccelerateDecelerateInterpolator();
        m5801f(attributeSet);
        m5802g();
    }
}
