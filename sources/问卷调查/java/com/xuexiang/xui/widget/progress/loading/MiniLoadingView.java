package com.xuexiang.xui.widget.progress.loading;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.C0788b;

/* loaded from: classes.dex */
public class MiniLoadingView extends View {

    /* renamed from: b */
    public int f5376b;

    /* renamed from: c */
    public int f5377c;

    /* renamed from: d */
    public int f5378d;

    /* renamed from: e */
    public ValueAnimator f5379e;

    /* renamed from: f */
    public Paint f5380f;

    /* renamed from: g */
    public ValueAnimator.AnimatorUpdateListener f5381g;

    /* renamed from: com.xuexiang.xui.widget.progress.loading.MiniLoadingView$a */
    public class C0979a implements ValueAnimator.AnimatorUpdateListener {
        public C0979a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MiniLoadingView.this.f5378d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MiniLoadingView.this.invalidate();
        }
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1088R.attr.MiniLoadingStyle);
        this.f5378d = 0;
        this.f5381g = new C0979a();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0788b.f4454h, C1088R.attr.MiniLoadingStyle, 0);
        this.f5376b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, C0787a.m2474h(context, 32.0f));
        this.f5377c = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f5380f = paint;
        paint.setColor(this.f5377c);
        this.f5380f.setAntiAlias(true);
        this.f5380f.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: a */
    public void m2780a() {
        ValueAnimator valueAnimator = this.f5379e;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
            this.f5379e = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(this.f5381g);
            this.f5379e.setDuration(600L);
            this.f5379e.setRepeatMode(1);
            this.f5379e.setRepeatCount(-1);
            this.f5379e.setInterpolator(new LinearInterpolator());
        } else if (valueAnimator.isStarted()) {
            return;
        }
        this.f5379e.start();
    }

    /* renamed from: b */
    public void m2781b() {
        ValueAnimator valueAnimator = this.f5379e;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f5381g);
            this.f5379e.removeAllUpdateListeners();
            this.f5379e.cancel();
            this.f5379e = null;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2780a();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2781b();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        int i = this.f5378d * 30;
        int i2 = this.f5376b;
        int i3 = i2 / 12;
        int i4 = i2 / 6;
        float f2 = i3;
        this.f5380f.setStrokeWidth(f2);
        float f3 = this.f5376b / 2.0f;
        canvas.rotate(i, f3, f3);
        float f4 = this.f5376b / 2.0f;
        canvas.translate(f4, f4);
        int i5 = 0;
        while (i5 < 12) {
            canvas.rotate(30.0f);
            i5++;
            this.f5380f.setAlpha((int) ((i5 * 255.0f) / 12.0f));
            float f5 = f2 / 2.0f;
            canvas.translate(0.0f, ((-this.f5376b) / 2.0f) + f5);
            canvas.drawLine(0.0f, 0.0f, 0.0f, i4, this.f5380f);
            canvas.translate(0.0f, (this.f5376b / 2.0f) - f5);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f5376b;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m2780a();
        } else {
            m2781b();
        }
    }

    public void setColor(int i) {
        this.f5377c = i;
        this.f5380f.setColor(i);
        invalidate();
    }

    public void setSize(int i) {
        this.f5376b = i;
        requestLayout();
    }
}
