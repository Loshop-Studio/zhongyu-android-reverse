package com.xuexiang.xui.widget.layout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.button.C4168f;
import p004a3.InterpolatorC0008a;
import p210z2.C6810a;

/* loaded from: classes3.dex */
public class ExpandableLayout extends FrameLayout {

    /* renamed from: a */
    public final int f4516a;

    /* renamed from: b */
    public final float f4517b;

    /* renamed from: c */
    public float f4518c;

    /* renamed from: d */
    public final int f4519d;

    /* renamed from: e */
    public int f4520e;

    /* renamed from: f */
    public final InterpolatorC0008a f4521f;

    /* renamed from: g */
    public ValueAnimator f4522g;

    public ExpandableLayout(Context context) {
        this(context, null);
    }

    public int getDuration() {
        return this.f4516a;
    }

    public float getExpansion() {
        return this.f4518c;
    }

    public int getOrientation() {
        return this.f4519d;
    }

    public float getParallax() {
        return this.f4517b;
    }

    public int getState() {
        return this.f4520e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.f4522g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i9 = this.f4519d;
        int i10 = i9 == 0 ? measuredWidth : measuredHeight;
        setVisibility((this.f4518c == 0.0f && i10 == 0) ? 8 : 0);
        int iRound = i10 - Math.round(i10 * this.f4518c);
        float f = this.f4517b;
        if (f > 0.0f) {
            float f7 = iRound * f;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (i9 == 0) {
                    childAt.setTranslationX((getLayoutDirection() != 1 ? -1 : 1) * f7);
                } else {
                    childAt.setTranslationY(-f7);
                }
            }
        }
        if (i9 == 0) {
            setMeasuredDimension(measuredWidth - iRound, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight - iRound);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        float f = bundle.getFloat("key_expansion");
        this.f4518c = f;
        this.f4520e = f == 1.0f ? 3 : 0;
        super.onRestoreInstanceState(bundle.getParcelable("key_super_state"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        int i = this.f4520e;
        float f = (i == 2 || i == 3) ? 1.0f : 0.0f;
        this.f4518c = f;
        bundle.putFloat("key_expansion", f);
        bundle.putParcelable("key_super_state", parcelableOnSaveInstanceState);
        return bundle;
    }

    public void setExpanded(boolean z8) {
        int i = this.f4520e;
        if (z8 == (i == 2 || i == 3)) {
            return;
        }
        ValueAnimator valueAnimator = this.f4522g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4522g = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f4518c, z8 ? 1.0f : 0.0f);
        this.f4522g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.f4521f);
        this.f4522g.setDuration(this.f4516a);
        this.f4522g.addUpdateListener(new C4168f(this, 6));
        this.f4522g.addListener(new C6810a(this, z8 ? 1 : 0));
        this.f4522g.start();
    }

    public void setExpansion(float f) {
        float f7 = this.f4518c;
        if (f7 == f) {
            return;
        }
        float f8 = f - f7;
        if (f == 0.0f) {
            this.f4520e = 0;
        } else if (f == 1.0f) {
            this.f4520e = 3;
        } else if (f8 < 0.0f) {
            this.f4520e = 1;
        } else if (f8 > 0.0f) {
            this.f4520e = 2;
        }
        setVisibility(this.f4520e == 0 ? 8 : 0);
        this.f4518c = f;
        requestLayout();
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4516a = 300;
        this.f4521f = new InterpolatorC0008a(InterpolatorC0008a.f19c);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ExpandableLayout);
            this.f4516a = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableLayout_el_duration, 300);
            this.f4518c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ExpandableLayout_el_expanded, false) ? 1.0f : 0.0f;
            this.f4519d = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableLayout_android_orientation, 1);
            this.f4517b = typedArrayObtainStyledAttributes.getFloat(R$styleable.ExpandableLayout_el_parallax, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.f4520e = this.f4518c != 0.0f ? 3 : 0;
            this.f4517b = Math.min(1.0f, Math.max(0.0f, this.f4517b));
        }
    }
}
