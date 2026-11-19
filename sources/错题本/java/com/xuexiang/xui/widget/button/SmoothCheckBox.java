package com.xuexiang.xui.widget.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.compose.material3.AbstractC1923c;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;
import p017b1.ViewOnClickListenerC3099c;
import p073h4.AbstractC5625a;

/* loaded from: classes3.dex */
public class SmoothCheckBox extends View implements Checkable {

    /* renamed from: u */
    public static final int f4093u = Color.parseColor("#DFDFDF");

    /* renamed from: a */
    public final Paint f4094a;

    /* renamed from: b */
    public final Paint f4095b;

    /* renamed from: c */
    public final Paint f4096c;

    /* renamed from: d */
    public final Point[] f4097d;

    /* renamed from: e */
    public final Point f4098e;

    /* renamed from: f */
    public final Path f4099f;

    /* renamed from: g */
    public float f4100g;

    /* renamed from: h */
    public float f4101h;

    /* renamed from: i */
    public float f4102i;

    /* renamed from: j */
    public float f4103j;

    /* renamed from: k */
    public float f4104k;

    /* renamed from: l */
    public int f4105l;

    /* renamed from: m */
    public final int f4106m;

    /* renamed from: n */
    public int f4107n;

    /* renamed from: o */
    public final int f4108o;

    /* renamed from: p */
    public final int f4109p;

    /* renamed from: q */
    public int f4110q;

    /* renamed from: r */
    public final int f4111r;

    /* renamed from: s */
    public boolean f4112s;

    /* renamed from: t */
    public boolean f4113t;

    public SmoothCheckBox(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static int m3463a(float f, int i, int i8) {
        int iAlpha = Color.alpha(i);
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        float f7 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i8) * f) + (iAlpha * f7)), (int) ((Color.red(i8) * f) + (iRed * f7)), (int) ((Color.green(i8) * f) + (iGreen * f7)), (int) ((Color.blue(i8) * f) + (iBlue * f7)));
    }

    /* renamed from: b */
    public final int m3464b(int i) {
        int iM4948h = AbstractC5625a.m4948h(getContext(), 25.0f);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return Math.min(iM4948h, size);
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    /* renamed from: c */
    public final void m3465c() {
        this.f4113t = true;
        this.f4104k = 1.0f;
        boolean z8 = this.f4112s;
        this.f4103j = z8 ? 0.0f : 1.0f;
        this.f4110q = z8 ? this.f4108o : this.f4111r;
        this.f4102i = z8 ? this.f4100g + this.f4101h : 0.0f;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4112s;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f4096c.setColor(this.f4110q);
        float f = this.f4098e.x;
        canvas.drawCircle(f, r0.y, this.f4104k * f, this.f4096c);
        this.f4094a.setColor(this.f4109p);
        canvas.drawCircle(this.f4098e.x, r0.y, (r1 - this.f4107n) * this.f4103j, this.f4094a);
        if (this.f4113t && this.f4112s) {
            this.f4099f.reset();
            float f7 = this.f4102i;
            float f8 = this.f4100g;
            if (f7 < f8) {
                float f9 = this.f4105l / 20.0f;
                if (f9 < 3.0f) {
                    f9 = 3.0f;
                }
                float f10 = f7 + f9;
                this.f4102i = f10;
                Point[] pointArr = this.f4097d;
                Point point = pointArr[0];
                float f11 = point.x;
                Point point2 = pointArr[1];
                float f12 = (((point2.x - r5) * f10) / f8) + f11;
                float f13 = point.y;
                this.f4099f.moveTo(f11, f13);
                this.f4099f.lineTo(f12, (((point2.y - r3) * f10) / f8) + f13);
                canvas.drawPath(this.f4099f, this.f4095b);
                float f14 = this.f4102i;
                float f15 = this.f4100g;
                if (f14 > f15) {
                    this.f4102i = f15;
                }
            } else {
                Point point3 = this.f4097d[0];
                this.f4099f.moveTo(point3.x, point3.y);
                Point point4 = this.f4097d[1];
                this.f4099f.lineTo(point4.x, point4.y);
                canvas.drawPath(this.f4099f, this.f4095b);
                float f16 = this.f4102i;
                float f17 = this.f4100g;
                float f18 = this.f4101h;
                if (f16 < f17 + f18) {
                    Point[] pointArr2 = this.f4097d;
                    Point point5 = pointArr2[1];
                    int i = point5.x;
                    Point point6 = pointArr2[2];
                    float f19 = f16 - f17;
                    float f20 = ((point6.x - i) * f19) / f18;
                    float fM1036D = AbstractC1923c.m1036D(f19, r1 - point6.y, f18, point5.y);
                    this.f4099f.reset();
                    Point point7 = this.f4097d[1];
                    this.f4099f.moveTo(point7.x, point7.y);
                    this.f4099f.lineTo(f20 + i, fM1036D);
                    canvas.drawPath(this.f4099f, this.f4095b);
                    this.f4102i += Math.max(this.f4105l / 20, 3);
                } else {
                    this.f4099f.reset();
                    Point point8 = this.f4097d[1];
                    this.f4099f.moveTo(point8.x, point8.y);
                    Point point9 = this.f4097d[2];
                    this.f4099f.lineTo(point9.x, point9.y);
                    canvas.drawPath(this.f4099f, this.f4095b);
                }
            }
            if (this.f4102i < this.f4100g + this.f4101h) {
                postDelayed(new RunnableC4165c(this, 0), 10L);
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        this.f4105l = getMeasuredWidth();
        int measuredWidth = this.f4107n;
        if (measuredWidth == 0) {
            measuredWidth = getMeasuredWidth() / 10;
        }
        this.f4107n = measuredWidth;
        int iMin = Math.min(measuredWidth, getMeasuredWidth() / 5);
        this.f4107n = iMin;
        this.f4107n = Math.max(iMin, 3);
        int i11 = this.f4105l / 2;
        Point point = this.f4098e;
        point.x = i11;
        point.y = getMeasuredHeight() / 2;
        this.f4097d[0].x = Math.round((getMeasuredWidth() / 30.0f) * 7.0f);
        this.f4097d[0].y = Math.round((getMeasuredHeight() / 30.0f) * 14.0f);
        this.f4097d[1].x = Math.round((getMeasuredWidth() / 30.0f) * 13.0f);
        this.f4097d[1].y = Math.round((getMeasuredHeight() / 30.0f) * 20.0f);
        this.f4097d[2].x = Math.round((getMeasuredWidth() / 30.0f) * 22.0f);
        this.f4097d[2].y = Math.round((getMeasuredHeight() / 30.0f) * 10.0f);
        Point[] pointArr = this.f4097d;
        double dPow = Math.pow(pointArr[1].x - pointArr[0].x, 2.0d);
        Point[] pointArr2 = this.f4097d;
        this.f4100g = (float) Math.sqrt(Math.pow(pointArr2[1].y - pointArr2[0].y, 2.0d) + dPow);
        Point[] pointArr3 = this.f4097d;
        double dPow2 = Math.pow(pointArr3[2].x - pointArr3[1].x, 2.0d);
        Point[] pointArr4 = this.f4097d;
        this.f4101h = (float) Math.sqrt(Math.pow(pointArr4[2].y - pointArr4[1].y, 2.0d) + dPow2);
        this.f4095b.setStrokeWidth(this.f4107n);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        setMeasuredDimension(m3464b(i), m3464b(i8));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        setChecked(bundle.getBoolean("InstanceState"));
        super.onRestoreInstanceState(bundle.getParcelable("InstanceState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("InstanceState", super.onSaveInstanceState());
        bundle.putBoolean("InstanceState", this.f4112s);
        return bundle;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        this.f4112s = z8;
        m3465c();
        invalidate();
    }

    public void setCheckedSilent(boolean z8) {
        this.f4112s = z8;
        m3465c();
        invalidate();
    }

    public void setOnCheckedChangeListener(InterfaceC4167e interfaceC4167e) {
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f4112s);
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.SmoothCheckBoxStyle);
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4103j = 1.0f;
        this.f4104k = 1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmoothCheckBox, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.SmoothCheckBox_scb_color_tick, -1);
        this.f4106m = typedArrayObtainStyledAttributes.getInt(R$styleable.SmoothCheckBox_scb_duration, 300);
        this.f4110q = typedArrayObtainStyledAttributes.getColor(R$styleable.SmoothCheckBox_scb_color_unchecked_stroke, f4093u);
        this.f4108o = typedArrayObtainStyledAttributes.getColor(R$styleable.SmoothCheckBox_scb_color_checked, AbstractC5806u.m5252F(context, R$attr.colorAccent, 0));
        this.f4109p = typedArrayObtainStyledAttributes.getColor(R$styleable.SmoothCheckBox_scb_color_unchecked, -1);
        this.f4107n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SmoothCheckBox_scb_stroke_width, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f4111r = this.f4110q;
        Paint paint = new Paint(1);
        this.f4095b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f4095b.setStrokeCap(Paint.Cap.ROUND);
        this.f4095b.setColor(color);
        Paint paint2 = new Paint(1);
        this.f4096c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f4096c.setColor(this.f4110q);
        Paint paint3 = new Paint(1);
        this.f4094a = paint3;
        paint3.setStyle(style);
        this.f4094a.setColor(this.f4108o);
        this.f4099f = new Path();
        this.f4098e = new Point();
        Point[] pointArr = new Point[3];
        this.f4097d = pointArr;
        pointArr[0] = new Point();
        this.f4097d[1] = new Point();
        this.f4097d[2] = new Point();
        setOnClickListener(new ViewOnClickListenerC3099c(this, 2));
    }
}
