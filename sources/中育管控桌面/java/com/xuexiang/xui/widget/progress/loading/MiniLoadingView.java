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
import com.xuexiang.xui.utils.AbstractC5854b;

/* loaded from: classes3.dex */
public class MiniLoadingView extends View {

    /* renamed from: a */
    public int f5345a;

    /* renamed from: b */
    public int f5346b;

    /* renamed from: c */
    public int f5347c;

    /* renamed from: d */
    public ValueAnimator f5348d;

    /* renamed from: e */
    public Paint f5349e;

    /* renamed from: f */
    public ValueAnimator.AnimatorUpdateListener f5350f;

    /* renamed from: com.xuexiang.xui.widget.progress.loading.MiniLoadingView$a */
    public class C5944a implements ValueAnimator.AnimatorUpdateListener {
        public C5944a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MiniLoadingView.this.f5347c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MiniLoadingView.this.invalidate();
        }
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MiniLoadingStyle);
    }

    /* renamed from: b */
    public final void m4909b(Canvas canvas, int i6) {
        int i7 = this.f5345a;
        int i8 = i7 / 12;
        int i9 = i7 / 6;
        float f6 = i8;
        this.f5349e.setStrokeWidth(f6);
        int i10 = this.f5345a;
        canvas.rotate(i6, i10 / 2.0f, i10 / 2.0f);
        int i11 = this.f5345a;
        canvas.translate(i11 / 2.0f, i11 / 2.0f);
        int i12 = 0;
        while (i12 < 12) {
            canvas.rotate(30.0f);
            i12++;
            this.f5349e.setAlpha((int) ((i12 * 255.0f) / 12.0f));
            float f7 = f6 / 2.0f;
            canvas.translate(0.0f, ((-this.f5345a) / 2.0f) + f7);
            Canvas canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, 0.0f, i9, this.f5349e);
            canvas2.translate(0.0f, (this.f5345a / 2.0f) - f7);
            canvas = canvas2;
        }
    }

    /* renamed from: c */
    public final void m4910c(Context context, AttributeSet attributeSet, int i6) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MiniLoadingView, i6, 0);
        this.f5345a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MiniLoadingView_mlv_loading_view_size, AbstractC5854b.m4346a(context, 32.0f));
        this.f5346b = typedArrayObtainStyledAttributes.getColor(R$styleable.MiniLoadingView_mlv_loading_view_color, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m4911d() {
        Paint paint = new Paint();
        this.f5349e = paint;
        paint.setColor(this.f5346b);
        this.f5349e.setAntiAlias(true);
        this.f5349e.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: e */
    public void m4912e() {
        ValueAnimator valueAnimator = this.f5348d;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                return;
            }
            this.f5348d.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
        this.f5348d = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(this.f5350f);
        this.f5348d.setDuration(600L);
        this.f5348d.setRepeatMode(1);
        this.f5348d.setRepeatCount(-1);
        this.f5348d.setInterpolator(new LinearInterpolator());
        this.f5348d.start();
    }

    /* renamed from: f */
    public void m4913f() {
        ValueAnimator valueAnimator = this.f5348d;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f5350f);
            this.f5348d.removeAllUpdateListeners();
            this.f5348d.cancel();
            this.f5348d = null;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4912e();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4913f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        m4909b(canvas, this.f5347c * 30);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        int i8 = this.f5345a;
        setMeasuredDimension(i8, i8);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i6) {
        super.onVisibilityChanged(view, i6);
        if (i6 == 0) {
            m4912e();
        } else {
            m4913f();
        }
    }

    public void setColor(int i6) {
        this.f5346b = i6;
        this.f5349e.setColor(i6);
        invalidate();
    }

    public void setSize(int i6) {
        this.f5345a = i6;
        requestLayout();
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f5347c = 0;
        this.f5350f = new C5944a();
        m4910c(context, attributeSet, i6);
        m4911d();
    }
}
