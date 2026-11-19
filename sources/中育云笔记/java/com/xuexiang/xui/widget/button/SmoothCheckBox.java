package com.xuexiang.xui.widget.button;

import android.animation.ValueAnimator;
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
import android.view.animation.LinearInterpolator;
import android.widget.Checkable;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8041g;

/* loaded from: classes5.dex */
public class SmoothCheckBox extends View implements Checkable {

    /* renamed from: w */
    public static final int f15581w = Color.parseColor("#DFDFDF");

    /* renamed from: c */
    public Paint f15582c;

    /* renamed from: d */
    public Paint f15583d;

    /* renamed from: e */
    public Paint f15584e;

    /* renamed from: f */
    public Point[] f15585f;

    /* renamed from: g */
    public Point f15586g;

    /* renamed from: h */
    public Path f15587h;

    /* renamed from: i */
    public float f15588i;

    /* renamed from: j */
    public float f15589j;

    /* renamed from: k */
    public float f15590k;

    /* renamed from: l */
    public float f15591l;

    /* renamed from: m */
    public float f15592m;

    /* renamed from: n */
    public int f15593n;

    /* renamed from: o */
    public int f15594o;

    /* renamed from: p */
    public int f15595p;

    /* renamed from: q */
    public int f15596q;

    /* renamed from: r */
    public int f15597r;

    /* renamed from: s */
    public int f15598s;

    /* renamed from: t */
    public int f15599t;

    /* renamed from: u */
    public boolean f15600u;

    /* renamed from: v */
    public boolean f15601v;

    /* renamed from: com.xuexiang.xui.widget.button.SmoothCheckBox$a */
    public class ViewOnClickListenerC8073a implements View.OnClickListener {
        public ViewOnClickListenerC8073a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SmoothCheckBox.this.toggle();
            SmoothCheckBox.this.f15601v = false;
            SmoothCheckBox.this.f15590k = 0.0f;
            if (SmoothCheckBox.this.isChecked()) {
                SmoothCheckBox.this.m12461v();
            } else {
                SmoothCheckBox.this.m12462w();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SmoothCheckBox$b */
    public class RunnableC8074b implements Runnable {
        public RunnableC8074b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmoothCheckBox.this.postInvalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SmoothCheckBox$c */
    public class C8075c implements ValueAnimator.AnimatorUpdateListener {
        public C8075c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothCheckBox.this.f15591l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothCheckBox smoothCheckBox = SmoothCheckBox.this;
            smoothCheckBox.f15598s = SmoothCheckBox.m12452r(smoothCheckBox.f15597r, SmoothCheckBox.this.f15596q, 1.0f - SmoothCheckBox.this.f15591l);
            SmoothCheckBox.this.postInvalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SmoothCheckBox$d */
    public class C8076d implements ValueAnimator.AnimatorUpdateListener {
        public C8076d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothCheckBox.this.f15592m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothCheckBox.this.postInvalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SmoothCheckBox$e */
    public class C8077e implements ValueAnimator.AnimatorUpdateListener {
        public C8077e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothCheckBox.this.f15591l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothCheckBox smoothCheckBox = SmoothCheckBox.this;
            smoothCheckBox.f15598s = SmoothCheckBox.m12452r(smoothCheckBox.f15596q, SmoothCheckBox.this.f15599t, SmoothCheckBox.this.f15591l);
            SmoothCheckBox.this.postInvalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SmoothCheckBox$f */
    public class C8078f implements ValueAnimator.AnimatorUpdateListener {
        public C8078f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmoothCheckBox.this.f15592m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SmoothCheckBox.this.postInvalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SmoothCheckBox$g */
    public class RunnableC8079g implements Runnable {
        public RunnableC8079g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmoothCheckBox.this.f15601v = true;
            SmoothCheckBox.this.postInvalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.SmoothCheckBox$h */
    public interface InterfaceC8080h {
    }

    public SmoothCheckBox(Context context) {
        this(context, null);
    }

    /* renamed from: r */
    public static int m12452r(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f15600u;
    }

    /* renamed from: m */
    public final void m12453m(Canvas canvas) {
        this.f15584e.setColor(this.f15598s);
        int i10 = this.f15586g.x;
        canvas.drawCircle(i10, r0.y, i10 * this.f15592m, this.f15584e);
    }

    /* renamed from: n */
    public final void m12454n(Canvas canvas) {
        this.f15582c.setColor(this.f15597r);
        canvas.drawCircle(this.f15586g.x, r0.y, (r1 - this.f15595p) * this.f15591l, this.f15582c);
    }

    /* renamed from: o */
    public final void m12455o(Canvas canvas) {
        if (this.f15601v && isChecked()) {
            m12457q(canvas);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m12453m(canvas);
        m12454n(canvas);
        m12455o(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f15593n = getMeasuredWidth();
        int measuredWidth = this.f15595p;
        if (measuredWidth == 0) {
            measuredWidth = getMeasuredWidth() / 10;
        }
        this.f15595p = measuredWidth;
        int iMin = Math.min(measuredWidth, getMeasuredWidth() / 5);
        this.f15595p = iMin;
        this.f15595p = Math.max(iMin, 3);
        Point point = this.f15586g;
        point.x = this.f15593n / 2;
        point.y = getMeasuredHeight() / 2;
        this.f15585f[0].x = Math.round((getMeasuredWidth() / 30.0f) * 7.0f);
        this.f15585f[0].y = Math.round((getMeasuredHeight() / 30.0f) * 14.0f);
        this.f15585f[1].x = Math.round((getMeasuredWidth() / 30.0f) * 13.0f);
        this.f15585f[1].y = Math.round((getMeasuredHeight() / 30.0f) * 20.0f);
        this.f15585f[2].x = Math.round((getMeasuredWidth() / 30.0f) * 22.0f);
        this.f15585f[2].y = Math.round((getMeasuredHeight() / 30.0f) * 10.0f);
        Point[] pointArr = this.f15585f;
        double dPow = Math.pow(pointArr[1].x - pointArr[0].x, 2.0d);
        Point[] pointArr2 = this.f15585f;
        this.f15588i = (float) Math.sqrt(dPow + Math.pow(pointArr2[1].y - pointArr2[0].y, 2.0d));
        Point[] pointArr3 = this.f15585f;
        double dPow2 = Math.pow(pointArr3[2].x - pointArr3[1].x, 2.0d);
        Point[] pointArr4 = this.f15585f;
        this.f15589j = (float) Math.sqrt(dPow2 + Math.pow(pointArr4[2].y - pointArr4[1].y, 2.0d));
        this.f15583d.setStrokeWidth(this.f15595p);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(m12459t(i10), m12459t(i11));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        setChecked(bundle.getBoolean("InstanceState"));
        super.onRestoreInstanceState(bundle.getParcelable("InstanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("InstanceState", super.onSaveInstanceState());
        bundle.putBoolean("InstanceState", isChecked());
        return bundle;
    }

    /* renamed from: p */
    public final void m12456p() {
        postDelayed(new RunnableC8079g(), this.f15594o);
    }

    /* renamed from: q */
    public final void m12457q(Canvas canvas) {
        this.f15587h.reset();
        float f10 = this.f15590k;
        float f11 = this.f15588i;
        if (f10 < f11) {
            int i10 = this.f15593n;
            float f12 = f10 + (((float) i10) / 20.0f >= 3.0f ? i10 / 20.0f : 3.0f);
            this.f15590k = f12;
            Point[] pointArr = this.f15585f;
            Point point = pointArr[0];
            int i11 = point.x;
            Point point2 = pointArr[1];
            int i12 = point.y;
            this.f15587h.moveTo(i11, i12);
            this.f15587h.lineTo(i11 + (((point2.x - i11) * f12) / f11), i12 + (((point2.y - i12) * f12) / f11));
            canvas.drawPath(this.f15587h, this.f15583d);
            float f13 = this.f15590k;
            float f14 = this.f15588i;
            if (f13 > f14) {
                this.f15590k = f14;
            }
        } else {
            Path path = this.f15587h;
            Point point3 = this.f15585f[0];
            path.moveTo(point3.x, point3.y);
            Path path2 = this.f15587h;
            Point point4 = this.f15585f[1];
            path2.lineTo(point4.x, point4.y);
            canvas.drawPath(this.f15587h, this.f15583d);
            float f15 = this.f15590k;
            float f16 = this.f15588i;
            float f17 = this.f15589j;
            if (f15 < f16 + f17) {
                Point[] pointArr2 = this.f15585f;
                Point point5 = pointArr2[1];
                int i13 = point5.x;
                Point point6 = pointArr2[2];
                float f18 = i13 + (((point6.x - i13) * (f15 - f16)) / f17);
                float f19 = point5.y - (((r5 - point6.y) * (f15 - f16)) / f17);
                this.f15587h.reset();
                Path path3 = this.f15587h;
                Point point7 = this.f15585f[1];
                path3.moveTo(point7.x, point7.y);
                this.f15587h.lineTo(f18, f19);
                canvas.drawPath(this.f15587h, this.f15583d);
                this.f15590k += Math.max(this.f15593n / 20, 3);
            } else {
                this.f15587h.reset();
                Path path4 = this.f15587h;
                Point point8 = this.f15585f[1];
                path4.moveTo(point8.x, point8.y);
                Path path5 = this.f15587h;
                Point point9 = this.f15585f[2];
                path5.lineTo(point9.x, point9.y);
                canvas.drawPath(this.f15587h, this.f15583d);
            }
        }
        if (this.f15590k < this.f15588i + this.f15589j) {
            postDelayed(new RunnableC8074b(), 10L);
        }
    }

    /* renamed from: s */
    public final void m12458s(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SmoothCheckBox, i10, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.SmoothCheckBox_scb_color_tick, -1);
        this.f15594o = typedArrayObtainStyledAttributes.getInt(R$styleable.SmoothCheckBox_scb_duration, 300);
        this.f15598s = typedArrayObtainStyledAttributes.getColor(R$styleable.SmoothCheckBox_scb_color_unchecked_stroke, f15581w);
        this.f15596q = typedArrayObtainStyledAttributes.getColor(R$styleable.SmoothCheckBox_scb_color_checked, AbstractC8041g.m12217d(context, R$attr.colorAccent));
        this.f15597r = typedArrayObtainStyledAttributes.getColor(R$styleable.SmoothCheckBox_scb_color_unchecked, -1);
        this.f15595p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SmoothCheckBox_scb_stroke_width, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f15599t = this.f15598s;
        Paint paint = new Paint(1);
        this.f15583d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f15583d.setStrokeCap(Paint.Cap.ROUND);
        this.f15583d.setColor(color);
        Paint paint2 = new Paint(1);
        this.f15584e = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f15584e.setColor(this.f15598s);
        Paint paint3 = new Paint(1);
        this.f15582c = paint3;
        paint3.setStyle(style);
        this.f15582c.setColor(this.f15596q);
        this.f15587h = new Path();
        this.f15586g = new Point();
        Point[] pointArr = new Point[3];
        this.f15585f = pointArr;
        pointArr[0] = new Point();
        this.f15585f[1] = new Point();
        this.f15585f[2] = new Point();
        setOnClickListener(new ViewOnClickListenerC8073a());
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f15600u = z10;
        m12460u();
        invalidate();
    }

    public void setCheckedSilent(boolean z10) {
        this.f15600u = z10;
        m12460u();
        invalidate();
    }

    public void setOnCheckedChangeListener(InterfaceC8080h interfaceC8080h) {
    }

    /* renamed from: t */
    public final int m12459t(int i10) {
        int iM12188b = AbstractC8037c.m12188b(getContext(), 25.0f);
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return Math.min(iM12188b, size);
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* renamed from: u */
    public final void m12460u() {
        this.f15601v = true;
        this.f15592m = 1.0f;
        this.f15591l = isChecked() ? 0.0f : 1.0f;
        this.f15598s = isChecked() ? this.f15596q : this.f15599t;
        this.f15590k = isChecked() ? this.f15588i + this.f15589j : 0.0f;
    }

    /* renamed from: v */
    public final void m12461v() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration((this.f15594o / 3) * 2);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C8075c());
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        valueAnimatorOfFloat2.setDuration(this.f15594o);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new C8076d());
        valueAnimatorOfFloat2.start();
        m12456p();
    }

    /* renamed from: w */
    public final void m12462w() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f15594o);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C8077e());
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        valueAnimatorOfFloat2.setDuration(this.f15594o);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new C8078f());
        valueAnimatorOfFloat2.start();
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.SmoothCheckBoxStyle);
    }

    public SmoothCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15591l = 1.0f;
        this.f15592m = 1.0f;
        m12458s(context, attributeSet, i10);
    }
}
