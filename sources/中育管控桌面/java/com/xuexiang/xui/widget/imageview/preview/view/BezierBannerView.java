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

/* loaded from: classes3.dex */
public class BezierBannerView extends View implements ViewPager.OnPageChangeListener {

    /* renamed from: L */
    public static int f5144L = 1;

    /* renamed from: M */
    public static int f5145M = 2;

    /* renamed from: A */
    public int f5146A;

    /* renamed from: B */
    public int f5147B;

    /* renamed from: C */
    public int f5148C;

    /* renamed from: D */
    public float f5149D;

    /* renamed from: E */
    public float f5150E;

    /* renamed from: F */
    public float f5151F;

    /* renamed from: G */
    public float f5152G;

    /* renamed from: H */
    public float f5153H;

    /* renamed from: I */
    public float f5154I;

    /* renamed from: J */
    public int f5155J;

    /* renamed from: K */
    public Interpolator f5156K;

    /* renamed from: a */
    public Paint f5157a;

    /* renamed from: b */
    public Paint f5158b;

    /* renamed from: c */
    public Path f5159c;

    /* renamed from: d */
    public Path f5160d;

    /* renamed from: e */
    public int f5161e;

    /* renamed from: f */
    public int f5162f;

    /* renamed from: g */
    public float f5163g;

    /* renamed from: h */
    public float f5164h;

    /* renamed from: i */
    public float f5165i;

    /* renamed from: j */
    public float f5166j;

    /* renamed from: k */
    public float f5167k;

    /* renamed from: l */
    public float f5168l;

    /* renamed from: m */
    public float f5169m;

    /* renamed from: n */
    public float f5170n;

    /* renamed from: o */
    public float f5171o;

    /* renamed from: p */
    public float f5172p;

    /* renamed from: q */
    public float f5173q;

    /* renamed from: r */
    public float f5174r;

    /* renamed from: s */
    public float f5175s;

    /* renamed from: t */
    public float f5176t;

    /* renamed from: u */
    public float f5177u;

    /* renamed from: v */
    public boolean f5178v;

    /* renamed from: w */
    public float f5179w;

    /* renamed from: x */
    public float f5180x;

    /* renamed from: y */
    public float f5181y;

    /* renamed from: z */
    public int f5182z;

    public BezierBannerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m4815a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(this);
        if (viewPager.getAdapter() != null) {
            this.f5146A = viewPager.getAdapter().getCount();
        }
        this.f5182z = viewPager.getCurrentItem();
        m4822h();
        this.f5155J = f5145M;
        invalidate();
    }

    /* renamed from: b */
    public final float m4816b(int i6) {
        if (i6 == 0) {
            return this.f5164h;
        }
        float f6 = this.f5163g;
        float f7 = this.f5166j;
        return (i6 * (f6 + (2.0f * f7))) + f7 + (this.f5164h - f7);
    }

    /* renamed from: c */
    public float m4817c(float f6, float f7, float f8) {
        return f6 + ((f7 - f6) * f8);
    }

    /* renamed from: d */
    public float m4818d(float f6, float f7, int i6) {
        float f8;
        float f9;
        if (i6 == this.f5147B) {
            f8 = f7 - f6;
            f9 = this.f5179w;
        } else {
            f8 = f7 - f6;
            f9 = this.f5180x;
        }
        return f6 + (f8 * f9);
    }

    /* renamed from: e */
    public float m4819e(float f6, float f7) {
        return f6 + ((f7 - f6) * this.f5181y);
    }

    /* renamed from: f */
    public final void m4820f(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BezierBannerView);
        this.f5161e = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_selectedColor, -1);
        this.f5162f = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierBannerView_bbv_unSelectedColor, -5592406);
        this.f5164h = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_selectedRadius, this.f5164h);
        this.f5166j = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_unSelectedRadius, this.f5166j);
        this.f5163g = typedArrayObtainStyledAttributes.getDimension(R$styleable.BezierBannerView_bbv_spacing, this.f5163g);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public final void m4821g() {
        Paint paint = new Paint(1);
        paint.setColor(this.f5161e);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f5157a = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f5162f);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.f5158b = paint2;
    }

    /* renamed from: h */
    public final void m4822h() {
        this.f5159c.reset();
        this.f5160d.reset();
        float interpolation = this.f5156K.getInterpolation(this.f5181y);
        this.f5170n = m4818d(m4816b(this.f5182z), m4816b(this.f5182z + 1) - this.f5164h, this.f5148C);
        float f6 = this.f5164h;
        this.f5171o = f6;
        this.f5165i = m4817c(f6, 0.0f, interpolation);
        double radians = Math.toRadians(m4818d(45.0f, 0.0f, this.f5147B));
        float fSin = (float) (Math.sin(radians) * this.f5165i);
        float fCos = (float) (Math.cos(radians) * this.f5165i);
        this.f5172p = m4818d(m4816b(this.f5182z) + this.f5164h, m4816b(this.f5182z + 1), this.f5147B);
        float f7 = this.f5164h;
        this.f5173q = f7;
        this.f5168l = m4817c(0.0f, f7, interpolation);
        double radians2 = Math.toRadians(m4818d(0.0f, 45.0f, this.f5148C));
        float fSin2 = (float) (Math.sin(radians2) * this.f5168l);
        float fCos2 = (float) (Math.cos(radians2) * this.f5168l);
        this.f5151F = this.f5170n + fSin;
        this.f5152G = this.f5171o - fCos;
        this.f5153H = this.f5172p - fSin2;
        this.f5154I = this.f5164h - fCos2;
        this.f5149D = m4819e(m4816b(this.f5182z) + this.f5164h, m4816b(this.f5182z + 1) - this.f5164h);
        this.f5150E = this.f5164h;
        this.f5159c.moveTo(this.f5151F, this.f5152G);
        this.f5159c.quadTo(this.f5149D, this.f5150E, this.f5153H, this.f5154I);
        this.f5159c.lineTo(this.f5153H, this.f5164h + fCos2);
        this.f5159c.quadTo(this.f5149D, this.f5164h, this.f5151F, this.f5152G + (fCos * 2.0f));
        this.f5159c.lineTo(this.f5151F, this.f5152G);
        this.f5176t = m4818d(m4816b(this.f5182z + 1), m4816b(this.f5182z) + this.f5166j, this.f5148C);
        this.f5177u = this.f5164h;
        this.f5167k = m4817c(this.f5166j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m4818d(45.0f, 0.0f, this.f5147B));
        float fSin3 = (float) (Math.sin(radians3) * this.f5167k);
        float fCos3 = (float) (Math.cos(radians3) * this.f5167k);
        this.f5174r = m4818d(m4816b(this.f5182z + 1) - this.f5166j, m4816b(this.f5182z), this.f5147B);
        this.f5175s = this.f5164h;
        this.f5169m = m4817c(0.0f, this.f5166j, interpolation);
        double radians4 = Math.toRadians(m4818d(0.0f, 45.0f, this.f5148C));
        float fSin4 = (float) (Math.sin(radians4) * this.f5169m);
        float fCos4 = (float) (Math.cos(radians4) * this.f5169m);
        float f8 = this.f5176t - fSin3;
        float f9 = this.f5177u - fCos3;
        float f10 = this.f5174r + fSin4;
        float f11 = this.f5175s - fCos4;
        float fM4819e = m4819e(m4816b(this.f5182z + 1) - this.f5166j, m4816b(this.f5182z) + this.f5166j);
        float f12 = this.f5164h;
        this.f5160d.moveTo(f8, f9);
        this.f5160d.quadTo(fM4819e, f12, f10, f11);
        this.f5160d.lineTo(f10, this.f5164h + fCos4);
        this.f5160d.quadTo(fM4819e, f12, f8, (fCos3 * 2.0f) + f9);
        this.f5160d.lineTo(f8, f9);
    }

    /* renamed from: i */
    public final void m4823i() {
        this.f5159c.reset();
        this.f5160d.reset();
        float interpolation = this.f5156K.getInterpolation(this.f5181y);
        this.f5170n = m4818d(m4816b(this.f5182z), m4816b(this.f5182z - 1) + this.f5164h, this.f5148C);
        float f6 = this.f5164h;
        this.f5171o = f6;
        this.f5165i = m4817c(f6, 0.0f, interpolation);
        double radians = Math.toRadians(m4818d(45.0f, 0.0f, this.f5147B));
        float fSin = (float) (Math.sin(radians) * this.f5165i);
        float fCos = (float) (Math.cos(radians) * this.f5165i);
        this.f5172p = m4818d(m4816b(this.f5182z) - this.f5164h, m4816b(this.f5182z - 1), this.f5147B);
        float f7 = this.f5164h;
        this.f5173q = f7;
        this.f5168l = m4817c(0.0f, f7, interpolation);
        double radians2 = Math.toRadians(m4818d(0.0f, 45.0f, this.f5148C));
        float fSin2 = (float) (Math.sin(radians2) * this.f5168l);
        float fCos2 = (float) (Math.cos(radians2) * this.f5168l);
        this.f5151F = this.f5170n - fSin;
        this.f5152G = this.f5171o - fCos;
        this.f5153H = this.f5172p + fSin2;
        this.f5154I = this.f5164h - fCos2;
        this.f5149D = m4819e(m4816b(this.f5182z) - this.f5164h, m4816b(this.f5182z - 1) + this.f5164h);
        this.f5150E = this.f5164h;
        this.f5159c.moveTo(this.f5151F, this.f5152G);
        this.f5159c.quadTo(this.f5149D, this.f5150E, this.f5153H, this.f5154I);
        this.f5159c.lineTo(this.f5153H, this.f5164h + fCos2);
        this.f5159c.quadTo(this.f5149D, this.f5164h, this.f5151F, this.f5152G + (fCos * 2.0f));
        this.f5159c.lineTo(this.f5151F, this.f5152G);
        this.f5176t = m4818d(m4816b(this.f5182z - 1), m4816b(this.f5182z) - this.f5166j, this.f5148C);
        this.f5177u = this.f5164h;
        this.f5167k = m4817c(this.f5166j, 0.0f, interpolation);
        double radians3 = Math.toRadians(m4818d(45.0f, 0.0f, this.f5147B));
        float fSin3 = (float) (Math.sin(radians3) * this.f5167k);
        float fCos3 = (float) (Math.cos(radians3) * this.f5167k);
        this.f5174r = m4818d(m4816b(this.f5182z - 1) + this.f5166j, m4816b(this.f5182z), this.f5147B);
        this.f5175s = this.f5164h;
        this.f5169m = m4817c(0.0f, this.f5166j, interpolation);
        double radians4 = Math.toRadians(m4818d(0.0f, 45.0f, this.f5148C));
        float fSin4 = (float) (Math.sin(radians4) * this.f5169m);
        float fCos4 = (float) (Math.cos(radians4) * this.f5169m);
        float f8 = this.f5176t + fSin3;
        float f9 = this.f5177u - fCos3;
        float f10 = this.f5174r - fSin4;
        float f11 = this.f5175s - fCos4;
        float fM4819e = m4819e(m4816b(this.f5182z - 1) + this.f5166j, m4816b(this.f5182z) - this.f5166j);
        float f12 = this.f5164h;
        this.f5160d.moveTo(f8, f9);
        this.f5160d.quadTo(fM4819e, f12, f10, f11);
        this.f5160d.lineTo(f10, this.f5164h + fCos4);
        this.f5160d.quadTo(fM4819e, f12, f8, (fCos3 * 2.0f) + f9);
        this.f5160d.lineTo(f8, f9);
    }

    /* renamed from: j */
    public void m4824j() {
        this.f5179w = 0.0f;
        this.f5180x = 0.0f;
        this.f5181y = 0.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i6;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        for (int i7 = 0; i7 < this.f5146A; i7++) {
            int i8 = this.f5155J;
            if (i8 == f5145M) {
                int i9 = this.f5182z;
                if (i7 != i9 && i7 != i9 + 1) {
                    canvas.drawCircle(m4816b(i7), this.f5164h, this.f5166j, this.f5158b);
                }
            } else if (i8 == f5144L && i7 != (i6 = this.f5182z) && i7 != i6 - 1) {
                canvas.drawCircle(m4816b(i7), this.f5164h, this.f5166j, this.f5158b);
            }
        }
        canvas.drawCircle(this.f5174r, this.f5175s, this.f5169m, this.f5158b);
        canvas.drawCircle(this.f5176t, this.f5177u, this.f5167k, this.f5158b);
        canvas.drawPath(this.f5160d, this.f5158b);
        canvas.drawCircle(this.f5172p, this.f5173q, this.f5168l, this.f5157a);
        canvas.drawCircle(this.f5170n, this.f5171o, this.f5165i, this.f5157a);
        canvas.drawPath(this.f5159c, this.f5157a);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        float f6 = this.f5166j;
        int paddingLeft = (int) ((f6 * 2.0f * this.f5146A) + ((this.f5164h - f6) * 2.0f) + ((r5 - 1) * this.f5163g) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.f5164h * 2.0f) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, paddingLeft);
        }
        if (mode2 != 1073741824 && mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i6) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i6, float f6, int i7) {
        if (f6 == 0.0f) {
            this.f5182z = i6;
            m4824j();
        }
        float f7 = i6 + f6;
        int i8 = this.f5182z;
        if (f7 - i8 > 0.0f) {
            this.f5155J = f5145M;
            if (f7 > i8 + 1) {
                this.f5182z = i6;
                return;
            } else {
                setProgress(f6);
                return;
            }
        }
        if (f7 - i8 < 0.0f) {
            this.f5155J = f5144L;
            if (f7 < i8 - 1) {
                this.f5182z = i6;
            } else {
                setProgress(1.0f - f6);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i6) {
    }

    public void setDirection(int i6) {
        this.f5155J = i6;
    }

    public void setProgress(float f6) {
        if (f6 == 0.0f) {
            return;
        }
        this.f5181y = f6;
        if (f6 <= 0.5d) {
            this.f5179w = f6 / 0.5f;
            this.f5180x = 0.0f;
        } else {
            this.f5180x = (f6 - 0.5f) / 0.5f;
            this.f5179w = 1.0f;
        }
        if (this.f5155J == f5145M) {
            m4822h();
        } else {
            m4823i();
        }
        invalidate();
    }

    public BezierBannerView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f5159c = new Path();
        this.f5160d = new Path();
        this.f5163g = 80.0f;
        this.f5164h = 30.0f;
        this.f5166j = 20.0f;
        this.f5178v = false;
        this.f5179w = 0.0f;
        this.f5180x = 0.0f;
        this.f5182z = 0;
        this.f5147B = 1;
        this.f5148C = 2;
        this.f5156K = new AccelerateDecelerateInterpolator();
        m4820f(attributeSet);
        m4821g();
    }
}
