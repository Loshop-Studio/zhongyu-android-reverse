package com.xuexiang.xui.widget.layout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.xuexiang.xui.R$styleable;
import p405x8.C11811a;

/* loaded from: classes5.dex */
public class ExpandableLayout extends FrameLayout {

    /* renamed from: c */
    public int f16364c;

    /* renamed from: d */
    public float f16365d;

    /* renamed from: e */
    public float f16366e;

    /* renamed from: f */
    public int f16367f;

    /* renamed from: g */
    public int f16368g;

    /* renamed from: h */
    public Interpolator f16369h;

    /* renamed from: i */
    public ValueAnimator f16370i;

    /* renamed from: com.xuexiang.xui.widget.layout.ExpandableLayout$a */
    public class C8165a implements ValueAnimator.AnimatorUpdateListener {
        public C8165a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ExpandableLayout.this.setExpansion(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.xuexiang.xui.widget.layout.ExpandableLayout$b */
    public class C8166b implements Animator.AnimatorListener {

        /* renamed from: a */
        public int f16372a;

        /* renamed from: b */
        public boolean f16373b;

        public C8166b(int i10) {
            this.f16372a = i10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16373b = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f16373b) {
                return;
            }
            ExpandableLayout.this.f16368g = this.f16372a == 0 ? 0 : 3;
            ExpandableLayout.this.setExpansion(this.f16372a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ExpandableLayout.this.f16368g = this.f16372a == 0 ? 1 : 2;
        }
    }

    public ExpandableLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final void m12908b(int i10) {
        ValueAnimator valueAnimator = this.f16370i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16370i = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16366e, i10);
        this.f16370i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.f16369h);
        this.f16370i.setDuration(this.f16364c);
        this.f16370i.addUpdateListener(new C8165a());
        this.f16370i.addListener(new C8166b(i10));
        this.f16370i.start();
    }

    /* renamed from: c */
    public boolean m12909c() {
        int i10 = this.f16368g;
        return i10 == 2 || i10 == 3;
    }

    /* renamed from: d */
    public void m12910d(boolean z10, boolean z11) {
        if (z10 == m12909c()) {
            return;
        }
        if (z11) {
            m12908b(z10 ? 1 : 0);
        } else {
            setExpansion(z10 ? 1.0f : 0.0f);
        }
    }

    /* renamed from: e */
    public ExpandableLayout m12911e(float f10) {
        this.f16365d = Math.min(1.0f, Math.max(0.0f, f10));
        return this;
    }

    public int getDuration() {
        return this.f16364c;
    }

    public float getExpansion() {
        return this.f16366e;
    }

    public int getOrientation() {
        return this.f16367f;
    }

    public float getParallax() {
        return this.f16365d;
    }

    public int getState() {
        return this.f16368g;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.f16370i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i12 = this.f16367f == 0 ? measuredWidth : measuredHeight;
        setVisibility((this.f16366e == 0.0f && i12 == 0) ? 8 : 0);
        int iRound = i12 - Math.round(i12 * this.f16366e);
        float f10 = this.f16365d;
        if (f10 > 0.0f) {
            float f11 = iRound * f10;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (this.f16367f == 0) {
                    childAt.setTranslationX((getLayoutDirection() != 1 ? -1 : 1) * f11);
                } else {
                    childAt.setTranslationY(-f11);
                }
            }
        }
        if (this.f16367f == 0) {
            setMeasuredDimension(measuredWidth - iRound, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight - iRound);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        float f10 = bundle.getFloat("key_expansion");
        this.f16366e = f10;
        this.f16368g = f10 == 1.0f ? 3 : 0;
        super.onRestoreInstanceState(bundle.getParcelable("key_super_state"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        float f10 = m12909c() ? 1.0f : 0.0f;
        this.f16366e = f10;
        bundle.putFloat("key_expansion", f10);
        bundle.putParcelable("key_super_state", parcelableOnSaveInstanceState);
        return bundle;
    }

    public void setExpanded(boolean z10) {
        m12910d(z10, true);
    }

    public void setExpansion(float f10) {
        float f11 = this.f16366e;
        if (f11 == f10) {
            return;
        }
        float f12 = f10 - f11;
        if (f10 == 0.0f) {
            this.f16368g = 0;
        } else if (f10 == 1.0f) {
            this.f16368g = 3;
        } else if (f12 < 0.0f) {
            this.f16368g = 1;
        } else if (f12 > 0.0f) {
            this.f16368g = 2;
        }
        setVisibility(this.f16368g == 0 ? 8 : 0);
        this.f16366e = f10;
        requestLayout();
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16364c = 300;
        this.f16369h = new C11811a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ExpandableLayout);
            this.f16364c = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableLayout_el_duration, 300);
            this.f16366e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ExpandableLayout_el_expanded, false) ? 1.0f : 0.0f;
            this.f16367f = typedArrayObtainStyledAttributes.getInt(R$styleable.ExpandableLayout_android_orientation, 1);
            this.f16365d = typedArrayObtainStyledAttributes.getFloat(R$styleable.ExpandableLayout_el_parallax, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.f16368g = this.f16366e != 0.0f ? 3 : 0;
            m12911e(this.f16365d);
        }
    }
}
