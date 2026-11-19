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
import com.xuexiang.xui.utils.AbstractC6872b;

/* loaded from: classes4.dex */
public class MiniLoadingView extends View {

    /* renamed from: a */
    public int f8058a;

    /* renamed from: b */
    public int f8059b;

    /* renamed from: c */
    public int f8060c;

    /* renamed from: d */
    public ValueAnimator f8061d;

    /* renamed from: e */
    public Paint f8062e;

    /* renamed from: f */
    public ValueAnimator.AnimatorUpdateListener f8063f;

    /* renamed from: com.xuexiang.xui.widget.progress.loading.MiniLoadingView$a */
    public class C6972a implements ValueAnimator.AnimatorUpdateListener {
        public C6972a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MiniLoadingView.this.f8060c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MiniLoadingView.this.invalidate();
        }
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MiniLoadingStyle);
    }

    /* renamed from: b */
    public final void m7090b(Canvas canvas, int i10) {
        int i11 = this.f8058a;
        int i12 = i11 / 12;
        int i13 = i11 / 6;
        float f10 = i12;
        this.f8062e.setStrokeWidth(f10);
        int i14 = this.f8058a;
        canvas.rotate(i10, i14 / 2.0f, i14 / 2.0f);
        int i15 = this.f8058a;
        canvas.translate(i15 / 2.0f, i15 / 2.0f);
        int i16 = 0;
        while (i16 < 12) {
            canvas.rotate(30.0f);
            i16++;
            this.f8062e.setAlpha((int) ((i16 * 255.0f) / 12.0f));
            float f11 = f10 / 2.0f;
            canvas.translate(0.0f, ((-this.f8058a) / 2.0f) + f11);
            Canvas canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, 0.0f, i13, this.f8062e);
            canvas2.translate(0.0f, (this.f8058a / 2.0f) - f11);
            canvas = canvas2;
        }
    }

    /* renamed from: c */
    public final void m7091c(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MiniLoadingView, i10, 0);
        this.f8058a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MiniLoadingView_mlv_loading_view_size, AbstractC6872b.m6425a(context, 32.0f));
        this.f8059b = typedArrayObtainStyledAttributes.getColor(R$styleable.MiniLoadingView_mlv_loading_view_color, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m7092d() {
        Paint paint = new Paint();
        this.f8062e = paint;
        paint.setColor(this.f8059b);
        this.f8062e.setAntiAlias(true);
        this.f8062e.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: e */
    public void m7093e() {
        ValueAnimator valueAnimator = this.f8061d;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                return;
            }
            this.f8061d.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
        this.f8061d = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(this.f8063f);
        this.f8061d.setDuration(600L);
        this.f8061d.setRepeatMode(1);
        this.f8061d.setRepeatCount(-1);
        this.f8061d.setInterpolator(new LinearInterpolator());
        this.f8061d.start();
    }

    /* renamed from: f */
    public void m7094f() {
        ValueAnimator valueAnimator = this.f8061d;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f8063f);
            this.f8061d.removeAllUpdateListeners();
            this.f8061d.cancel();
            this.f8061d = null;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7093e();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7094f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        m7090b(canvas, this.f8060c * 30);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f8058a;
        setMeasuredDimension(i12, i12);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            m7093e();
        } else {
            m7094f();
        }
    }

    public void setColor(int i10) {
        this.f8059b = i10;
        this.f8062e.setColor(i10);
        invalidate();
    }

    public void setSize(int i10) {
        this.f8058a = i10;
        requestLayout();
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8060c = 0;
        this.f8063f = new C6972a();
        m7091c(context, attributeSet, i10);
        m7092d();
    }
}
