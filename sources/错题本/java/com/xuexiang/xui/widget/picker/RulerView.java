package com.xuexiang.xui.widget.picker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.button.C4168f;
import io.github.inflationx.calligraphy3.HasTypeface;
import p042d3.C5416a;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class RulerView extends View implements HasTypeface {

    /* renamed from: a */
    public int f4555a;

    /* renamed from: b */
    public int f4556b;

    /* renamed from: c */
    public int f4557c;

    /* renamed from: d */
    public int f4558d;

    /* renamed from: e */
    public int f4559e;

    /* renamed from: f */
    public int f4560f;

    /* renamed from: g */
    public float f4561g;

    /* renamed from: h */
    public int f4562h;

    /* renamed from: i */
    public boolean f4563i;

    /* renamed from: j */
    public final float f4564j;

    /* renamed from: k */
    public ValueAnimator f4565k;

    /* renamed from: l */
    public final VelocityTracker f4566l;

    /* renamed from: m */
    public final String f4567m;

    /* renamed from: n */
    public int f4568n;

    /* renamed from: o */
    public int f4569o;

    /* renamed from: p */
    public float f4570p;

    /* renamed from: q */
    public float f4571q;

    /* renamed from: r */
    public float f4572r;

    public RulerView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final float m3526a(float f) {
        return (this.f4569o / 2.0f) - ((f - this.f4560f) * (this.f4559e * this.f4558d));
    }

    public float getCurrentValue() {
        return this.f4564j;
    }

    public String getSelectValue() {
        return this.f4567m;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i9 = this.f4556b;
            if (this.f4563i) {
                throw null;
            }
            this.f4568n = getPaddingBottom() + getPaddingTop() + (this.f4557c * 2) + i9;
        } else if (mode == 0 || mode == 1073741824) {
            this.f4568n = getPaddingBottom() + getPaddingTop() + size;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + size2;
        this.f4569o = paddingRight;
        setMeasuredDimension(paddingRight, this.f4568n);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        float x3 = motionEvent.getX();
        VelocityTracker velocityTracker = this.f4566l;
        velocityTracker.computeCurrentVelocity(500);
        velocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            ValueAnimator valueAnimator = this.f4565k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f4565k.end();
                this.f4565k.cancel();
            }
            this.f4570p = motionEvent.getX();
        } else if (action == 1) {
            this.f4572r = this.f4571q;
            int xVelocity = (int) velocityTracker.getXVelocity();
            if (Math.abs(xVelocity) >= 50 && !this.f4565k.isRunning()) {
                ValueAnimator duration = ValueAnimator.ofInt(0, xVelocity / 20).setDuration(Math.abs(xVelocity / 10));
                this.f4565k = duration;
                duration.setInterpolator(new DecelerateInterpolator());
                this.f4565k.addUpdateListener(new C4168f(this, 1));
                this.f4565k.addListener(new C5416a(this, 0));
                this.f4565k.start();
            }
            velocityTracker.clear();
        } else if (action == 2) {
            float f = (x3 - this.f4570p) + this.f4572r;
            this.f4571q = f;
            float f7 = this.f4569o / 2.0f;
            if (f >= f7) {
                this.f4571q = f7;
            } else if (f <= m3526a(this.f4562h)) {
                this.f4571q = m3526a(this.f4562h);
            }
        }
        invalidate();
        return true;
    }

    public void setBgColor(int i) {
        invalidate();
    }

    public void setCurrentValue(float f) {
        float f7 = f / this.f4555a;
        if (f7 < this.f4560f || f7 > this.f4562h) {
            return;
        }
        invalidate();
    }

    public void setFirstScale(float f) {
        this.f4561g = f;
        invalidate();
    }

    public void setIsBgRoundRect(boolean z8) {
        invalidate();
    }

    public void setLargeScaleColor(int i) {
    }

    public void setLargeScaleStroke(int i) {
        invalidate();
    }

    public void setMaxScale(int i) {
        this.f4562h = i;
        invalidate();
    }

    public void setMidScaleColor(int i) {
        invalidate();
    }

    public void setMidScaleStroke(int i) {
        invalidate();
    }

    public void setMinScale(int i) {
        this.f4560f = i;
        invalidate();
    }

    public void setResultNumColor(int i) {
        invalidate();
    }

    public void setResultNumTextSize(int i) {
        invalidate();
    }

    public void setRulerHeight(int i) {
        this.f4556b = i;
        invalidate();
    }

    public void setRulerToResultGap(int i) {
        this.f4557c = i;
        invalidate();
    }

    public void setScaleCount(int i) {
        this.f4558d = i;
        invalidate();
    }

    public void setScaleGap(int i) {
        this.f4559e = i;
        invalidate();
    }

    public void setScaleLimit(int i) {
        this.f4555a = i;
        invalidate();
    }

    public void setScaleNumColor(int i) {
        invalidate();
    }

    public void setScaleNumTextSize(int i) {
        invalidate();
    }

    public void setShowScaleResult(boolean z8) {
        this.f4563i = z8;
        invalidate();
    }

    public void setSmallScaleColor(int i) {
        invalidate();
    }

    public void setSmallScaleStroke(int i) {
        invalidate();
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
    }

    public void setUnit(String str) {
        invalidate();
    }

    public void setUnitColor(int i) {
        invalidate();
    }

    public void setUnitTextSize(int i) {
        invalidate();
    }

    public RulerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.RulerViewStyle);
    }

    public RulerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4555a = 1;
        this.f4556b = 50;
        this.f4557c = 12;
        this.f4558d = 10;
        this.f4559e = 10;
        this.f4560f = 0;
        this.f4561g = 50.0f;
        this.f4562h = 100;
        this.f4563i = true;
        this.f4564j = 50.0f;
        this.f4566l = VelocityTracker.obtain();
        this.f4567m = String.valueOf(this.f4561g);
        this.f4571q = 0.0f;
        this.f4572r = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RulerView, i, 0);
        this.f4555a = typedArrayObtainStyledAttributes.getInt(R$styleable.RulerView_rv_scaleLimit, this.f4555a);
        this.f4556b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_rulerHeight, (int) TypedValue.applyDimension(1, this.f4556b, getResources().getDisplayMetrics()));
        this.f4557c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_rulerToResultGap, (int) TypedValue.applyDimension(1, this.f4557c, getResources().getDisplayMetrics()));
        this.f4558d = typedArrayObtainStyledAttributes.getInt(R$styleable.RulerView_rv_scaleCount, this.f4558d);
        this.f4559e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RulerView_rv_scaleGap, (int) TypedValue.applyDimension(1, this.f4559e, getResources().getDisplayMetrics()));
        this.f4560f = typedArrayObtainStyledAttributes.getInt(R$styleable.RulerView_rv_minScale, this.f4560f) / this.f4555a;
        this.f4561g = typedArrayObtainStyledAttributes.getFloat(R$styleable.RulerView_rv_firstScale, this.f4561g) / this.f4555a;
        this.f4562h = typedArrayObtainStyledAttributes.getInt(R$styleable.RulerView_rv_maxScale, this.f4562h) / this.f4555a;
        AbstractC6582a.m6217a();
        throw null;
    }
}
