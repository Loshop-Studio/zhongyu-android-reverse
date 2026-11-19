package com.zykj.satisfaction.update;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p070b.p146d.p152b.C0900g;

/* loaded from: classes.dex */
public class PercentCircleView extends View {

    /* renamed from: b */
    public Paint f5449b;

    /* renamed from: c */
    public Paint f5450c;

    /* renamed from: d */
    public Paint f5451d;

    /* renamed from: e */
    public Paint f5452e;

    /* renamed from: f */
    public int f5453f;

    /* renamed from: g */
    public int f5454g;

    /* renamed from: h */
    public float f5455h;

    /* renamed from: i */
    public RectF f5456i;

    /* renamed from: j */
    public float f5457j;

    /* renamed from: k */
    public int f5458k;

    /* renamed from: l */
    public String f5459l;

    /* renamed from: m */
    public int f5460m;

    /* renamed from: n */
    public int f5461n;

    /* renamed from: o */
    public int f5462o;

    /* renamed from: p */
    public int f5463p;

    /* renamed from: q */
    public int f5464q;

    /* renamed from: r */
    public int f5465r;

    /* renamed from: s */
    public int f5466s;

    /* renamed from: t */
    public int f5467t;

    /* renamed from: u */
    public int f5468u;

    /* renamed from: v */
    public int f5469v;

    /* renamed from: w */
    public int f5470w;

    /* renamed from: x */
    public RectF f5471x;

    public PercentCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5455h = 0.0f;
        this.f5458k = 123;
        this.f5459l = "0%";
        this.f5460m = 123;
        this.f5461n = -1;
        this.f5463p = 15987699;
        this.f5465r = 2606746;
        this.f5467t = 30;
        this.f5468u = -1509949440;
        this.f5470w = 10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0900g.f4751a);
        this.f5460m = typedArrayObtainStyledAttributes.getInt(2, this.f5458k);
        this.f5462o = typedArrayObtainStyledAttributes.getColor(0, this.f5461n);
        this.f5469v = typedArrayObtainStyledAttributes.getColor(4, this.f5468u);
        this.f5464q = typedArrayObtainStyledAttributes.getColor(3, this.f5463p);
        this.f5466s = typedArrayObtainStyledAttributes.getColor(1, this.f5465r);
        typedArrayObtainStyledAttributes.recycle();
        this.f5457j = -90.0f;
        this.f5455h = 0.0f;
        Paint paint = new Paint();
        this.f5450c = paint;
        paint.setAntiAlias(true);
        this.f5450c.setColor(this.f5462o);
        this.f5450c.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f5449b = paint2;
        paint2.setColor(this.f5469v);
        this.f5449b.setAntiAlias(true);
        this.f5449b.setStyle(Paint.Style.FILL);
        this.f5449b.setTextSize(this.f5467t);
        this.f5449b.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint();
        this.f5451d = paint3;
        paint3.setAntiAlias(true);
        this.f5451d.setColor(this.f5464q);
        this.f5451d.setStyle(Paint.Style.STROKE);
        this.f5451d.setStrokeWidth(this.f5470w);
        Paint paint4 = new Paint();
        this.f5452e = paint4;
        paint4.setAntiAlias(true);
        this.f5452e.setColor(this.f5466s);
        this.f5452e.setStyle(Paint.Style.STROKE);
        this.f5452e.setStrokeWidth(this.f5470w);
        this.f5467t = (int) this.f5449b.getTextSize();
    }

    /* renamed from: a */
    public final int m2793a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = this.f5460m * 2;
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f5453f, this.f5454g, this.f5460m, this.f5450c);
        canvas.drawText(String.valueOf(this.f5459l), this.f5453f, (this.f5467t / 2.0f) + this.f5454g, this.f5449b);
        canvas.drawArc(this.f5471x, this.f5457j, 360.0f, false, this.f5451d);
        canvas.drawArc(this.f5456i, this.f5457j, this.f5455h, false, this.f5452e);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f5453f = getMeasuredWidth() / 2;
        this.f5454g = getMeasuredHeight() / 2;
        int i5 = this.f5460m;
        int i6 = this.f5453f;
        if (i5 > i6) {
            this.f5460m = i6;
        }
        int i7 = this.f5453f;
        int i8 = this.f5460m;
        int i9 = this.f5470w;
        int i10 = this.f5454g;
        this.f5456i = new RectF((i9 / 2.0f) + (i7 - i8), (i9 / 2.0f) + (i10 - i8), (i7 + i8) - (i9 / 2.0f), (i10 + i8) - (i9 / 2.0f));
        int i11 = this.f5453f;
        int i12 = this.f5460m;
        int i13 = this.f5470w;
        int i14 = this.f5454g;
        this.f5471x = new RectF((i13 / 2.0f) + (i11 - i12), (i13 / 2.0f) + (i14 - i12), (i11 + i12) - (i13 / 2.0f), (i14 + i12) - (i13 / 2.0f));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m2793a(i), m2793a(i));
    }

    public void setTargetPercent(float f2) {
        this.f5459l = ((int) (100.0f * f2)) + "%";
        this.f5455h = f2 * 360.0f;
        invalidate();
    }
}
