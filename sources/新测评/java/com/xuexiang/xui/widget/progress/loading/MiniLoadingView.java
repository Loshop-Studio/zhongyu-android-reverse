package com.xuexiang.xui.widget.progress.loading;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6477b;

/* loaded from: classes4.dex */
public class MiniLoadingView extends View {

    /* renamed from: a */
    public int f6636a;

    /* renamed from: b */
    public int f6637b;

    /* renamed from: c */
    public int f6638c;

    /* renamed from: d */
    public ValueAnimator f6639d;

    /* renamed from: e */
    public Paint f6640e;

    /* renamed from: f */
    public ValueAnimator.AnimatorUpdateListener f6641f;

    /* renamed from: com.xuexiang.xui.widget.progress.loading.MiniLoadingView$a */
    public class C6566a implements ValueAnimator.AnimatorUpdateListener {
        public C6566a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MiniLoadingView.this.f6638c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MiniLoadingView.this.invalidate();
        }
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MiniLoadingStyle);
    }

    /* renamed from: b */
    public final void m5900b(Canvas canvas, int i10) {
        int i11 = this.f6636a;
        int i12 = i11 / 12;
        int i13 = i11 / 6;
        float f10 = i12;
        this.f6640e.setStrokeWidth(f10);
        int i14 = this.f6636a;
        canvas.rotate(i10, i14 / 2.0f, i14 / 2.0f);
        int i15 = this.f6636a;
        canvas.translate(i15 / 2.0f, i15 / 2.0f);
        int i16 = 0;
        while (i16 < 12) {
            canvas.rotate(30.0f);
            i16++;
            this.f6640e.setAlpha((int) ((i16 * 255.0f) / 12.0f));
            float f11 = f10 / 2.0f;
            canvas.translate(0.0f, ((-this.f6636a) / 2.0f) + f11);
            Canvas canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, 0.0f, i13, this.f6640e);
            canvas2.translate(0.0f, (this.f6636a / 2.0f) - f11);
            canvas = canvas2;
        }
    }

    /* renamed from: c */
    public final void m5901c(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MiniLoadingView, i10, 0);
        this.f6636a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MiniLoadingView_mlv_loading_view_size, AbstractC6477b.m5341a(context, 32.0f));
        this.f6637b = typedArrayObtainStyledAttributes.getColor(R$styleable.MiniLoadingView_mlv_loading_view_color, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m5902d() {
        Paint paint = new Paint();
        this.f6640e = paint;
        paint.setColor(this.f6637b);
        this.f6640e.setAntiAlias(true);
        this.f6640e.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: e */
    public void m5903e() {
        ValueAnimator valueAnimator = this.f6639d;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                return;
            }
            this.f6639d.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
        this.f6639d = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(this.f6641f);
        this.f6639d.setDuration(600L);
        this.f6639d.setRepeatMode(1);
        this.f6639d.setRepeatCount(-1);
        this.f6639d.setInterpolator(new LinearInterpolator());
        this.f6639d.start();
    }

    /* renamed from: f */
    public void m5904f() {
        ValueAnimator valueAnimator = this.f6639d;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f6641f);
            this.f6639d.removeAllUpdateListeners();
            this.f6639d.cancel();
            this.f6639d = null;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m5903e();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5904f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        m5900b(canvas, this.f6638c * 30);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f6636a;
        setMeasuredDimension(i12, i12);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            m5903e();
        } else {
            m5904f();
        }
    }

    public void setColor(int i10) {
        this.f6637b = i10;
        this.f6640e.setColor(i10);
        invalidate();
    }

    public void setSize(int i10) {
        this.f6636a = i10;
        requestLayout();
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6638c = 0;
        this.f6641f = new C6566a();
        m5901c(context, attributeSet, i10);
        m5902d();
    }
}
