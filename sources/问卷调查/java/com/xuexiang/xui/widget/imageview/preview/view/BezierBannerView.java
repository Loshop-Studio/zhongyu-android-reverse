package com.xuexiang.xui.widget.imageview.preview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import p000a.p068t.p069a.C0446b;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p113c.p114a.C0788b;

/* loaded from: classes.dex */
public class BezierBannerView extends View implements C0446b.i {

    /* renamed from: L */
    public static final String f5236L = BezierBannerView.class.getName();

    /* renamed from: A */
    public int f5237A;

    /* renamed from: B */
    public int f5238B;

    /* renamed from: C */
    public int f5239C;

    /* renamed from: D */
    public float f5240D;

    /* renamed from: E */
    public float f5241E;

    /* renamed from: F */
    public float f5242F;

    /* renamed from: G */
    public float f5243G;

    /* renamed from: H */
    public float f5244H;

    /* renamed from: I */
    public float f5245I;

    /* renamed from: J */
    public int f5246J;

    /* renamed from: K */
    public Interpolator f5247K;

    /* renamed from: b */
    public Paint f5248b;

    /* renamed from: c */
    public Paint f5249c;

    /* renamed from: d */
    public Path f5250d;

    /* renamed from: e */
    public Path f5251e;

    /* renamed from: f */
    public int f5252f;

    /* renamed from: g */
    public int f5253g;

    /* renamed from: h */
    public float f5254h;

    /* renamed from: i */
    public float f5255i;

    /* renamed from: j */
    public float f5256j;

    /* renamed from: k */
    public float f5257k;

    /* renamed from: l */
    public float f5258l;

    /* renamed from: m */
    public float f5259m;

    /* renamed from: n */
    public float f5260n;

    /* renamed from: o */
    public float f5261o;

    /* renamed from: p */
    public float f5262p;

    /* renamed from: q */
    public float f5263q;

    /* renamed from: r */
    public float f5264r;

    /* renamed from: s */
    public float f5265s;

    /* renamed from: t */
    public float f5266t;

    /* renamed from: u */
    public float f5267u;

    /* renamed from: v */
    public float f5268v;

    /* renamed from: w */
    public float f5269w;

    /* renamed from: x */
    public float f5270x;

    /* renamed from: y */
    public float f5271y;

    /* renamed from: z */
    public int f5272z;

    public BezierBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5250d = new Path();
        this.f5251e = new Path();
        this.f5254h = 80.0f;
        this.f5255i = 30.0f;
        this.f5257k = 20.0f;
        this.f5269w = 0.0f;
        this.f5270x = 0.0f;
        this.f5272z = 0;
        this.f5238B = 1;
        this.f5239C = 2;
        this.f5247K = new AccelerateDecelerateInterpolator();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0788b.f4449c);
        this.f5252f = typedArrayObtainStyledAttributes.getColor(0, -1);
        this.f5253g = typedArrayObtainStyledAttributes.getColor(3, -5592406);
        this.f5255i = typedArrayObtainStyledAttributes.getDimension(1, this.f5255i);
        this.f5257k = typedArrayObtainStyledAttributes.getDimension(4, this.f5257k);
        this.f5254h = typedArrayObtainStyledAttributes.getDimension(2, this.f5254h);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        paint.setColor(this.f5252f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f5248b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f5253g);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.f5249c = paint2;
    }

    @Override // p000a.p068t.p069a.C0446b.i
    /* renamed from: a */
    public void mo1551a(int i) {
    }

    @Override // p000a.p068t.p069a.C0446b.i
    /* renamed from: b */
    public void mo1552b(int i, float f2, int i2) {
        String str;
        String str2 = f5236L;
        if (f2 == 0.0f) {
            this.f5272z = i;
            Log.d(str2, "到达");
            this.f5269w = 0.0f;
            this.f5270x = 0.0f;
            this.f5271y = 0.0f;
        }
        float f3 = i + f2;
        int i3 = this.f5272z;
        if (f3 - i3 > 0.0f) {
            this.f5246J = 2;
            if (f3 <= i3 + 1) {
                setProgress(f2);
                return;
            } else {
                this.f5272z = i;
                str = "向左快速滑动";
            }
        } else {
            if (f3 - i3 >= 0.0f) {
                return;
            }
            this.f5246J = 1;
            if (f3 >= i3 - 1) {
                setProgress(1.0f - f2);
                return;
            } else {
                this.f5272z = i;
                str = "向右快速滑动";
            }
        }
        Log.d(str2, str);
    }

    @Override // p000a.p068t.p069a.C0446b.i
    /* renamed from: c */
    public void mo1553c(int i) {
    }

    /* renamed from: d */
    public final float m2762d(int i) {
        if (i == 0) {
            return this.f5255i;
        }
        float f2 = this.f5254h;
        float f3 = this.f5257k;
        return (this.f5255i - f3) + (((2.0f * f3) + f2) * i) + f3;
    }

    /* renamed from: e */
    public float m2763e(float f2, float f3, float f4) {
        return C0561a.m2073a(f3, f2, f4, f2);
    }

    /* renamed from: f */
    public float m2764f(float f2, float f3, int i) {
        return ((f3 - f2) * (i == this.f5238B ? this.f5269w : this.f5270x)) + f2;
    }

    /* renamed from: g */
    public float m2765g(float f2, float f3) {
        return ((f3 - f2) * this.f5271y) + f2;
    }

    /* renamed from: h */
    public final void m2766h() {
        this.f5250d.reset();
        this.f5251e.reset();
        float interpolation = this.f5247K.getInterpolation(this.f5271y);
        this.f5261o = m2764f(m2762d(this.f5272z), m2762d(this.f5272z + 1) - this.f5255i, this.f5239C);
        float f2 = this.f5255i;
        this.f5262p = f2;
        this.f5256j = m2763e(f2, 0.0f, interpolation);
        double radians = Math.toRadians(m2764f(45.0f, 0.0f, this.f5238B));
        float fSin = (float) (Math.sin(radians) * this.f5256j);
        float fCos = (float) (Math.cos(radians) * this.f5256j);
        this.f5263q = m2764f(m2762d(this.f5272z) + this.f5255i, m2762d(this.f5272z + 1), this.f5238B);
        float f3 = this.f5255i;
        this.f5264r = f3;
        this.f5259m = m2763e(0.0f, f3, interpolation);
        double radians2 = Math.toRadians(m2764f(0.0f, 45.0f, this.f5239C));
        float fSin2 = (float) (Math.sin(radians2) * this.f5259m);
        float fCos2 = (float) (Math.cos(radians2) * this.f5259m);
        this.f5242F = this.f5261o + fSin;
        this.f5243G = this.f5262p - fCos;
        this.f5244H = this.f5263q - fSin2;
        this.f5245I = this.f5255i - fCos2;
        this.f5240D = m2765g(m2762d(this.f5272z) + this.f5255i, m2762d(this.f5272z + 1) - this.f5255i);
        this.f5241E = this.f5255i;
        this.f5250d.moveTo(this.f5242F, this.f5243G);
        this.f5250d.quadTo(this.f5240D, this.f5241E, this.f5244H, this.f5245I);
        this.f5250d.lineTo(this.f5244H, this.f5255i + fCos2);
        this.f5250d.quadTo(this.f5240D, this.f5255i, this.f5242F, (fCos * 2.0f) + this.f5243G);
        this.f5250d.lineTo(this.f5242F, this.f5243G);
        this.f5267u = m2764f(m2762d(this.f5272z + 1), m2762d(this.f5272z) + this.f5257k, this.f5239C);
        this.f5268v = this.f5255i;
        this.f5258l = m2763e(this.f5257k, 0.0f, interpolation);
        double radians3 = Math.toRadians(m2764f(45.0f, 0.0f, this.f5238B));
        float fSin3 = (float) (Math.sin(radians3) * this.f5258l);
        float fCos3 = (float) (Math.cos(radians3) * this.f5258l);
        this.f5265s = m2764f(m2762d(this.f5272z + 1) - this.f5257k, m2762d(this.f5272z), this.f5238B);
        this.f5266t = this.f5255i;
        this.f5260n = m2763e(0.0f, this.f5257k, interpolation);
        double radians4 = Math.toRadians(m2764f(0.0f, 45.0f, this.f5239C));
        float fSin4 = (float) (Math.sin(radians4) * this.f5260n);
        float fCos4 = (float) (Math.cos(radians4) * this.f5260n);
        float f4 = this.f5267u - fSin3;
        float f5 = this.f5268v - fCos3;
        float f6 = this.f5265s + fSin4;
        float f7 = this.f5266t - fCos4;
        float fM2765g = m2765g(m2762d(this.f5272z + 1) - this.f5257k, m2762d(this.f5272z) + this.f5257k);
        float f8 = this.f5255i;
        this.f5251e.moveTo(f4, f5);
        this.f5251e.quadTo(fM2765g, f8, f6, f7);
        this.f5251e.lineTo(f6, this.f5255i + fCos4);
        this.f5251e.quadTo(fM2765g, f8, f4, (fCos3 * 2.0f) + f5);
        this.f5251e.lineTo(f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            super.onDraw(r6)
            r6.save()
            int r0 = r5.getPaddingLeft()
            float r0 = (float) r0
            int r1 = r5.getPaddingTop()
            float r1 = (float) r1
            r6.translate(r0, r1)
            r0 = 0
        L14:
            int r1 = r5.f5237A
            if (r0 >= r1) goto L42
            int r1 = r5.f5246J
            r2 = 2
            if (r1 != r2) goto L34
            int r1 = r5.f5272z
            if (r0 == r1) goto L3f
            int r1 = r1 + 1
            if (r0 != r1) goto L26
            goto L3f
        L26:
            float r1 = r5.m2762d(r0)
            float r2 = r5.f5255i
            float r3 = r5.f5257k
            android.graphics.Paint r4 = r5.f5249c
            r6.drawCircle(r1, r2, r3, r4)
            goto L3f
        L34:
            r2 = 1
            if (r1 != r2) goto L3f
            int r1 = r5.f5272z
            if (r0 == r1) goto L3f
            int r1 = r1 + (-1)
            if (r0 != r1) goto L26
        L3f:
            int r0 = r0 + 1
            goto L14
        L42:
            float r0 = r5.f5265s
            float r1 = r5.f5266t
            float r2 = r5.f5260n
            android.graphics.Paint r3 = r5.f5249c
            r6.drawCircle(r0, r1, r2, r3)
            float r0 = r5.f5267u
            float r1 = r5.f5268v
            float r2 = r5.f5258l
            android.graphics.Paint r3 = r5.f5249c
            r6.drawCircle(r0, r1, r2, r3)
            android.graphics.Path r0 = r5.f5251e
            android.graphics.Paint r1 = r5.f5249c
            r6.drawPath(r0, r1)
            float r0 = r5.f5263q
            float r1 = r5.f5264r
            float r2 = r5.f5259m
            android.graphics.Paint r3 = r5.f5248b
            r6.drawCircle(r0, r1, r2, r3)
            float r0 = r5.f5261o
            float r1 = r5.f5262p
            float r2 = r5.f5256j
            android.graphics.Paint r3 = r5.f5248b
            r6.drawCircle(r0, r1, r2, r3)
            android.graphics.Path r0 = r5.f5250d
            android.graphics.Paint r1 = r5.f5248b
            r6.drawPath(r0, r1)
            r6.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.preview.view.BezierBannerView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        float f2 = this.f5257k;
        int iM2073a = (int) (((r5 - 1) * this.f5254h) + C0561a.m2073a(this.f5255i, f2, 2.0f, f2 * 2.0f * this.f5237A) + getPaddingLeft() + getPaddingRight());
        int paddingTop = (int) ((this.f5255i * 2.0f) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824 && mode == Integer.MIN_VALUE) {
            size = Math.min(size, iM2073a);
        }
        if (mode2 != 1073741824 && mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop);
        }
        setMeasuredDimension(size, size2);
    }

    public void setDirection(int i) {
        this.f5246J = i;
    }

    public void setProgress(float f2) {
        if (f2 == 0.0f) {
            return;
        }
        this.f5271y = f2;
        if (f2 <= 0.5d) {
            this.f5269w = f2 / 0.5f;
            this.f5270x = 0.0f;
        } else {
            this.f5270x = (f2 - 0.5f) / 0.5f;
            this.f5269w = 1.0f;
        }
        if (this.f5246J == 2) {
            m2766h();
        } else {
            this.f5250d.reset();
            this.f5251e.reset();
            float interpolation = this.f5247K.getInterpolation(this.f5271y);
            this.f5261o = m2764f(m2762d(this.f5272z), m2762d(this.f5272z - 1) + this.f5255i, this.f5239C);
            float f3 = this.f5255i;
            this.f5262p = f3;
            this.f5256j = m2763e(f3, 0.0f, interpolation);
            double radians = Math.toRadians(m2764f(45.0f, 0.0f, this.f5238B));
            float fSin = (float) (Math.sin(radians) * this.f5256j);
            float fCos = (float) (Math.cos(radians) * this.f5256j);
            this.f5263q = m2764f(m2762d(this.f5272z) - this.f5255i, m2762d(this.f5272z - 1), this.f5238B);
            float f4 = this.f5255i;
            this.f5264r = f4;
            this.f5259m = m2763e(0.0f, f4, interpolation);
            double radians2 = Math.toRadians(m2764f(0.0f, 45.0f, this.f5239C));
            float fSin2 = (float) (Math.sin(radians2) * this.f5259m);
            float fCos2 = (float) (Math.cos(radians2) * this.f5259m);
            this.f5242F = this.f5261o - fSin;
            this.f5243G = this.f5262p - fCos;
            this.f5244H = this.f5263q + fSin2;
            this.f5245I = this.f5255i - fCos2;
            this.f5240D = m2765g(m2762d(this.f5272z) - this.f5255i, m2762d(this.f5272z - 1) + this.f5255i);
            this.f5241E = this.f5255i;
            this.f5250d.moveTo(this.f5242F, this.f5243G);
            this.f5250d.quadTo(this.f5240D, this.f5241E, this.f5244H, this.f5245I);
            this.f5250d.lineTo(this.f5244H, this.f5255i + fCos2);
            this.f5250d.quadTo(this.f5240D, this.f5255i, this.f5242F, (fCos * 2.0f) + this.f5243G);
            this.f5250d.lineTo(this.f5242F, this.f5243G);
            this.f5267u = m2764f(m2762d(this.f5272z - 1), m2762d(this.f5272z) - this.f5257k, this.f5239C);
            this.f5268v = this.f5255i;
            this.f5258l = m2763e(this.f5257k, 0.0f, interpolation);
            double radians3 = Math.toRadians(m2764f(45.0f, 0.0f, this.f5238B));
            float fSin3 = (float) (Math.sin(radians3) * this.f5258l);
            float fCos3 = (float) (Math.cos(radians3) * this.f5258l);
            this.f5265s = m2764f(m2762d(this.f5272z - 1) + this.f5257k, m2762d(this.f5272z), this.f5238B);
            this.f5266t = this.f5255i;
            this.f5260n = m2763e(0.0f, this.f5257k, interpolation);
            double radians4 = Math.toRadians(m2764f(0.0f, 45.0f, this.f5239C));
            float fSin4 = (float) (Math.sin(radians4) * this.f5260n);
            float fCos4 = (float) (Math.cos(radians4) * this.f5260n);
            float f5 = this.f5267u + fSin3;
            float f6 = this.f5268v - fCos3;
            float f7 = this.f5265s - fSin4;
            float f8 = this.f5266t - fCos4;
            float fM2765g = m2765g(m2762d(this.f5272z - 1) + this.f5257k, m2762d(this.f5272z) - this.f5257k);
            float f9 = this.f5255i;
            this.f5251e.moveTo(f5, f6);
            this.f5251e.quadTo(fM2765g, f9, f7, f8);
            this.f5251e.lineTo(f7, this.f5255i + fCos4);
            this.f5251e.quadTo(fM2765g, f9, f5, (fCos3 * 2.0f) + f6);
            this.f5251e.lineTo(f5, f6);
        }
        invalidate();
    }
}
