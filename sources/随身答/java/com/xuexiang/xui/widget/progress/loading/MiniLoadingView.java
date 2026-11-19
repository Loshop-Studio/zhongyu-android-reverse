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
import com.xuexiang.xui.utils.AbstractC6796b;

/* loaded from: classes4.dex */
public class MiniLoadingView extends View {

    /* renamed from: a */
    public int f7894a;

    /* renamed from: b */
    public int f7895b;

    /* renamed from: c */
    public int f7896c;

    /* renamed from: d */
    public ValueAnimator f7897d;

    /* renamed from: e */
    public Paint f7898e;

    /* renamed from: f */
    public ValueAnimator.AnimatorUpdateListener f7899f;

    /* renamed from: com.xuexiang.xui.widget.progress.loading.MiniLoadingView$a */
    public class C6886a implements ValueAnimator.AnimatorUpdateListener {
        public C6886a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MiniLoadingView.this.f7896c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MiniLoadingView.this.invalidate();
        }
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MiniLoadingStyle);
    }

    /* renamed from: b */
    public final void m6998b(Canvas canvas, int i9) {
        int i10 = this.f7894a;
        int i11 = i10 / 12;
        int i12 = i10 / 6;
        float f10 = i11;
        this.f7898e.setStrokeWidth(f10);
        int i13 = this.f7894a;
        canvas.rotate(i9, i13 / 2.0f, i13 / 2.0f);
        int i14 = this.f7894a;
        canvas.translate(i14 / 2.0f, i14 / 2.0f);
        int i15 = 0;
        while (i15 < 12) {
            canvas.rotate(30.0f);
            i15++;
            this.f7898e.setAlpha((int) ((i15 * 255.0f) / 12.0f));
            float f11 = f10 / 2.0f;
            canvas.translate(0.0f, ((-this.f7894a) / 2.0f) + f11);
            Canvas canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, 0.0f, i12, this.f7898e);
            canvas2.translate(0.0f, (this.f7894a / 2.0f) - f11);
            canvas = canvas2;
        }
    }

    /* renamed from: c */
    public final void m6999c(Context context, AttributeSet attributeSet, int i9) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MiniLoadingView, i9, 0);
        this.f7894a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MiniLoadingView_mlv_loading_view_size, AbstractC6796b.m6442b(context, 32.0f));
        this.f7895b = typedArrayObtainStyledAttributes.getColor(R$styleable.MiniLoadingView_mlv_loading_view_color, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m7000d() {
        Paint paint = new Paint();
        this.f7898e = paint;
        paint.setColor(this.f7895b);
        this.f7898e.setAntiAlias(true);
        this.f7898e.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: e */
    public void m7001e() {
        ValueAnimator valueAnimator = this.f7897d;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                return;
            }
            this.f7897d.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
        this.f7897d = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(this.f7899f);
        this.f7897d.setDuration(600L);
        this.f7897d.setRepeatMode(1);
        this.f7897d.setRepeatCount(-1);
        this.f7897d.setInterpolator(new LinearInterpolator());
        this.f7897d.start();
    }

    /* renamed from: f */
    public void m7002f() {
        ValueAnimator valueAnimator = this.f7897d;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f7899f);
            this.f7897d.removeAllUpdateListeners();
            this.f7897d.cancel();
            this.f7897d = null;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7001e();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7002f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        m6998b(canvas, this.f7896c * 30);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int i11 = this.f7894a;
        setMeasuredDimension(i11, i11);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i9) {
        super.onVisibilityChanged(view, i9);
        if (i9 == 0) {
            m7001e();
        } else {
            m7002f();
        }
    }

    public void setColor(int i9) {
        this.f7895b = i9;
        this.f7898e.setColor(i9);
        invalidate();
    }

    public void setSize(int i9) {
        this.f7894a = i9;
        requestLayout();
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f7896c = 0;
        this.f7899f = new C6886a();
        m6999c(context, attributeSet, i9);
        m7000d();
    }
}
