package com.xuexiang.xui.widget.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import p016b0.RunnableC3059a;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class RippleView extends FrameLayout {

    /* renamed from: a */
    public int f4082a;

    /* renamed from: b */
    public int f4083b;

    /* renamed from: c */
    public int f4084c;

    /* renamed from: d */
    public boolean f4085d;

    /* renamed from: e */
    public int f4086e;

    /* renamed from: f */
    public float f4087f;

    /* renamed from: g */
    public ScaleAnimation f4088g;

    /* renamed from: h */
    public Integer f4089h;

    /* renamed from: i */
    public int f4090i;

    /* renamed from: j */
    public int f4091j;

    public enum RippleType {
        SIMPLE(0),
        DOUBLE(1),
        RECTANGLE(2);

        int type;

        RippleType(int i) {
            this.type = i;
        }
    }

    public RippleView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f4085d) {
            canvas.save();
            if (this.f4083b > 0) {
                throw null;
            }
            this.f4085d = false;
            canvas.restore();
            invalidate();
        }
    }

    public int getFrameRate() {
        return this.f4082a;
    }

    public int getRippleAlpha() {
        return this.f4084c;
    }

    public int getRippleColor() {
        return this.f4090i;
    }

    public int getRippleDuration() {
        return this.f4083b;
    }

    public int getRipplePadding() {
        return this.f4091j;
    }

    public RippleType getRippleType() {
        return RippleType.values()[this.f4089h.intValue()];
    }

    public int getZoomDuration() {
        return this.f4086e;
    }

    public float getZoomScale() {
        return this.f4087f;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        float f = this.f4087f;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f, i >> 1, i8 >> 1);
        this.f4088g = scaleAnimation;
        scaleAnimation.setDuration(this.f4086e);
        this.f4088g.setRepeatMode(2);
        this.f4088g.setRepeatCount(1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    public void setCentered(Boolean bool) {
    }

    public void setFrameRate(int i) {
        this.f4082a = i;
    }

    public void setOnRippleCompleteListener(InterfaceC4164b interfaceC4164b) {
    }

    public void setRippleAlpha(int i) {
        this.f4084c = i;
    }

    public void setRippleColor(@ColorRes int i) {
        this.f4090i = getResources().getColor(i);
    }

    public void setRippleDuration(int i) {
        this.f4083b = i;
    }

    public void setRipplePadding(int i) {
        this.f4091j = i;
    }

    public void setRippleType(RippleType rippleType) {
        this.f4089h = Integer.valueOf(rippleType.ordinal());
    }

    public void setZoomDuration(int i) {
        this.f4086e = i;
    }

    public void setZoomScale(float f) {
        this.f4087f = f;
    }

    public void setZooming(Boolean bool) {
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.RippleViewStyle);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4082a = 10;
        this.f4083b = 400;
        this.f4084c = 90;
        this.f4085d = false;
        new RunnableC3059a(this, 10);
        context.obtainStyledAttributes(attributeSet, R$styleable.RippleView, i, 0);
        AbstractC6582a.m6217a();
        throw null;
    }
}
