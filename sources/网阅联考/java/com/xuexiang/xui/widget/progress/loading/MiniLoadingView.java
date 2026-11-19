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
import com.xuexiang.xui.utils.AbstractC3527b;

/* loaded from: classes2.dex */
public class MiniLoadingView extends View {

    /* renamed from: a */
    public int f3824a;

    /* renamed from: b */
    public int f3825b;

    /* renamed from: c */
    public int f3826c;

    /* renamed from: d */
    public ValueAnimator f3827d;

    /* renamed from: e */
    public Paint f3828e;

    /* renamed from: f */
    public ValueAnimator.AnimatorUpdateListener f3829f;

    /* renamed from: com.xuexiang.xui.widget.progress.loading.MiniLoadingView$a */
    public class C3605a implements ValueAnimator.AnimatorUpdateListener {
        public C3605a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MiniLoadingView.this.f3826c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MiniLoadingView.this.invalidate();
        }
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MiniLoadingStyle);
    }

    /* renamed from: b */
    public final void m4531b(Canvas canvas, int i4) {
        int i5 = this.f3824a;
        int i6 = i5 / 12;
        int i7 = i5 / 6;
        float f4 = i6;
        this.f3828e.setStrokeWidth(f4);
        int i8 = this.f3824a;
        canvas.rotate(i4, i8 / 2.0f, i8 / 2.0f);
        int i9 = this.f3824a;
        canvas.translate(i9 / 2.0f, i9 / 2.0f);
        int i10 = 0;
        while (i10 < 12) {
            canvas.rotate(30.0f);
            i10++;
            this.f3828e.setAlpha((int) ((i10 * 255.0f) / 12.0f));
            float f5 = f4 / 2.0f;
            canvas.translate(0.0f, ((-this.f3824a) / 2.0f) + f5);
            canvas.drawLine(0.0f, 0.0f, 0.0f, i7, this.f3828e);
            canvas.translate(0.0f, (this.f3824a / 2.0f) - f5);
        }
    }

    /* renamed from: c */
    public final void m4532c(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MiniLoadingView, i4, 0);
        this.f3824a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MiniLoadingView_mlv_loading_view_size, AbstractC3527b.m4048b(context, 32.0f));
        this.f3825b = typedArrayObtainStyledAttributes.getColor(R$styleable.MiniLoadingView_mlv_loading_view_color, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m4533d() {
        Paint paint = new Paint();
        this.f3828e = paint;
        paint.setColor(this.f3825b);
        this.f3828e.setAntiAlias(true);
        this.f3828e.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: e */
    public void m4534e() {
        ValueAnimator valueAnimator = this.f3827d;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                return;
            }
            this.f3827d.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
        this.f3827d = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(this.f3829f);
        this.f3827d.setDuration(600L);
        this.f3827d.setRepeatMode(1);
        this.f3827d.setRepeatCount(-1);
        this.f3827d.setInterpolator(new LinearInterpolator());
        this.f3827d.start();
    }

    /* renamed from: f */
    public void m4535f() {
        ValueAnimator valueAnimator = this.f3827d;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f3829f);
            this.f3827d.removeAllUpdateListeners();
            this.f3827d.cancel();
            this.f3827d = null;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4534e();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4535f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        m4531b(canvas, this.f3826c * 30);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        int i6 = this.f3824a;
        setMeasuredDimension(i6, i6);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (i4 == 0) {
            m4534e();
        } else {
            m4535f();
        }
    }

    public void setColor(int i4) {
        this.f3825b = i4;
        this.f3828e.setColor(i4);
        invalidate();
    }

    public void setSize(int i4) {
        this.f3824a = i4;
        requestLayout();
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3826c = 0;
        this.f3829f = new C3605a();
        m4532c(context, attributeSet, i4);
        m4533d();
    }
}
