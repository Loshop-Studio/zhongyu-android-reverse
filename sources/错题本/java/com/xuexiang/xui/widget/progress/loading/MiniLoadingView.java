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
import com.xuexiang.xui.widget.button.C4168f;
import p073h4.AbstractC5625a;

/* loaded from: classes3.dex */
public class MiniLoadingView extends View {

    /* renamed from: a */
    public int f4697a;

    /* renamed from: b */
    public int f4698b;

    /* renamed from: c */
    public int f4699c;

    /* renamed from: d */
    public ValueAnimator f4700d;

    /* renamed from: e */
    public final Paint f4701e;

    /* renamed from: f */
    public final C4168f f4702f;

    public MiniLoadingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m3543a() {
        ValueAnimator valueAnimator = this.f4700d;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                return;
            }
            this.f4700d.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
        this.f4700d = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(this.f4702f);
        this.f4700d.setDuration(600L);
        this.f4700d.setRepeatMode(1);
        this.f4700d.setRepeatCount(-1);
        this.f4700d.setInterpolator(new LinearInterpolator());
        this.f4700d.start();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3543a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f4700d;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f4702f);
            this.f4700d.removeAllUpdateListeners();
            this.f4700d.cancel();
            this.f4700d = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        int i = this.f4699c * 30;
        int i8 = this.f4697a;
        int i9 = i8 / 6;
        float f = i8 / 12;
        this.f4701e.setStrokeWidth(f);
        float f7 = this.f4697a / 2.0f;
        canvas.rotate(i, f7, f7);
        float f8 = this.f4697a / 2.0f;
        canvas.translate(f8, f8);
        int i10 = 0;
        while (i10 < 12) {
            canvas.rotate(30.0f);
            int i11 = i10 + 1;
            this.f4701e.setAlpha((int) ((i11 * 255.0f) / 12.0f));
            float f9 = f / 2.0f;
            canvas.translate(0.0f, ((-this.f4697a) / 2.0f) + f9);
            canvas.drawLine(0.0f, 0.0f, 0.0f, i9, this.f4701e);
            canvas.translate(0.0f, (this.f4697a / 2.0f) - f9);
            i10 = i11;
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        int i9 = this.f4697a;
        setMeasuredDimension(i9, i9);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m3543a();
            return;
        }
        ValueAnimator valueAnimator = this.f4700d;
        if (valueAnimator != null) {
            valueAnimator.removeUpdateListener(this.f4702f);
            this.f4700d.removeAllUpdateListeners();
            this.f4700d.cancel();
            this.f4700d = null;
        }
    }

    public void setColor(int i) {
        this.f4698b = i;
        this.f4701e.setColor(i);
        invalidate();
    }

    public void setSize(int i) {
        this.f4697a = i;
        requestLayout();
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MiniLoadingStyle);
    }

    public MiniLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4699c = 0;
        this.f4702f = new C4168f(this, 3);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MiniLoadingView, i, 0);
        this.f4697a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MiniLoadingView_mlv_loading_view_size, AbstractC5625a.m4948h(context, 32.0f));
        this.f4698b = typedArrayObtainStyledAttributes.getColor(R$styleable.MiniLoadingView_mlv_loading_view_color, -1);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f4701e = paint;
        paint.setColor(this.f4698b);
        this.f4701e.setAntiAlias(true);
        this.f4701e.setStrokeCap(Paint.Cap.ROUND);
    }
}
