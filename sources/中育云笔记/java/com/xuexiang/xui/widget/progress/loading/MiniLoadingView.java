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
import com.xuexiang.xui.utils.AbstractC8037c;

/* loaded from: classes5.dex */
public class MiniLoadingView extends View {

    /* renamed from: c */
    public int f16753c;

    /* renamed from: d */
    public int f16754d;

    /* renamed from: e */
    public int f16755e;

    /* renamed from: f */
    public ValueAnimator f16756f;

    /* renamed from: g */
    public Paint f16757g;

    /* renamed from: h */
    public ValueAnimator.AnimatorUpdateListener f16758h;

    /* renamed from: com.xuexiang.xui.widget.progress.loading.MiniLoadingView$a */
    public class C8205a implements ValueAnimator.AnimatorUpdateListener {
        public C8205a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MiniLoadingView.this.f16755e = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MiniLoadingView.this.invalidate();
        }
    }

    public MiniLoadingView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final void m13108b(Canvas canvas, int i10) {
        int i11 = this.f16753c;
        int i12 = i11 / 12;
        int i13 = i11 / 6;
        float f10 = i12;
        this.f16757g.setStrokeWidth(f10);
        int i14 = this.f16753c;
        canvas.rotate(i10, i14 / 2.0f, i14 / 2.0f);
        int i15 = this.f16753c;
        canvas.translate(i15 / 2.0f, i15 / 2.0f);
        int i16 = 0;
        while (i16 < 12) {
            canvas.rotate(30.0f);
            i16++;
            this.f16757g.setAlpha((int) ((i16 * 255.0f) / 12.0f));
            float f11 = f10 / 2.0f;
            canvas.translate(0.0f, ((-this.f16753c) / 2.0f) + f11);
            Canvas canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, 0.0f, i13, this.f16757g);
            canvas2.translate(0.0f, (this.f16753c / 2.0f) - f11);
            canvas = canvas2;
        }
    }

    /* renamed from: c */
    public final void m13109c(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MiniLoadingView, i10, 0);
        this.f16753c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MiniLoadingView_mlv_loading_view_size, AbstractC8037c.m12188b(context, 32.0f));
        this.f16754d = typedArrayObtainStyledAttributes.getColor(R$styleable.MiniLoadingView_mlv_loading_view_color, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m13110d() {
        Paint paint = new Paint();
        this.f16757g = paint;
        paint.setColor(this.f16754d);
        this.f16757g.setAntiAlias(true);
        this.f16757g.setStrokeCap(Paint.Cap.ROUND);
    }

    /* renamed from: e */
    public void m13111e() {
        ValueAnimator valueAnimator = this.f16756f;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                return;
            }
            this.f16756f.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
        this.f16756f = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(this.f16758h);
        this.f16756f.setDuration(600L);
        this.f16756f.setRepeatMode(1);
        this.f16756f.setRepeatCount(-1);
        this.f16756f.setInterpolator(new LinearInterpolator());
        this.f16756f.start();
    }

    /* renamed from: f */
    public void m13112f() {
        ValueAnimator valueAnimator = this.f16756f;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f16758h);
            this.f16756f.removeAllUpdateListeners();
            this.f16756f.cancel();
            this.f16756f = null;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m13111e();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m13112f();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        m13108b(canvas, this.f16755e * 30);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f16753c;
        setMeasuredDimension(i12, i12);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            m13111e();
        } else {
            m13112f();
        }
    }

    public void setColor(int i10) {
        this.f16754d = i10;
        this.f16757g.setColor(i10);
        invalidate();
    }

    public void setSize(int i10) {
        this.f16753c = i10;
        requestLayout();
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MiniLoadingStyle);
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16755e = 0;
        this.f16758h = new C8205a();
        m13109c(context, attributeSet, i10);
        m13110d();
    }
}
