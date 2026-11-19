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
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.layout.interpolator.FastOutSlowInInterpolator;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ExpandableLayout extends FrameLayout {
    private static final int DEFAULT_DURATION = 300;
    public static final int HORIZONTAL = 0;
    public static final String KEY_EXPANSION = "key_expansion";
    public static final String KEY_SUPER_STATE = "key_super_state";
    public static final int VERTICAL = 1;
    private ValueAnimator mAnimator;
    private int mDuration;
    private float mExpansion;
    private Interpolator mInterpolator;
    private OnExpansionChangedListener mListener;
    private int mOrientation;
    private float mParallax;
    private int mState;

    private class ExpansionListener implements Animator.AnimatorListener {
        private boolean canceled;
        private int targetExpansion;

        public ExpansionListener(int i4) {
            this.targetExpansion = i4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.canceled = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.canceled) {
                return;
            }
            ExpandableLayout.this.mState = this.targetExpansion == 0 ? 0 : 3;
            ExpandableLayout.this.setExpansion(this.targetExpansion);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ExpandableLayout.this.mState = this.targetExpansion == 0 ? 1 : 2;
        }
    }

    public interface OnExpansionChangedListener {
        void onExpansionChanged(float f4, int i4);
    }

    public interface State {
        public static final int COLLAPSED = 0;
        public static final int COLLAPSING = 1;
        public static final int EXPANDED = 3;
        public static final int EXPANDING = 2;
    }

    public ExpandableLayout(Context context) {
        this(context, null);
    }

    private void animateSize(int i4) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mExpansion, i4);
        this.mAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.mInterpolator);
        this.mAnimator.setDuration(this.mDuration);
        this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.layout.ExpandableLayout.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ExpandableLayout.this.setExpansion(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.mAnimator.addListener(new ExpansionListener(i4));
        this.mAnimator.start();
    }

    public void collapse() {
        collapse(true);
    }

    public void expand() {
        expand(true);
    }

    public int getDuration() {
        return this.mDuration;
    }

    public float getExpansion() {
        return this.mExpansion;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public float getParallax() {
        return this.mParallax;
    }

    public int getState() {
        return this.mState;
    }

    public boolean isExpanded() {
        int i4 = this.mState;
        return i4 == 2 || i4 == 3;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i6 = this.mOrientation == 0 ? measuredWidth : measuredHeight;
        setVisibility((this.mExpansion == IGoodView.DEFAULT_TO_ALPHA && i6 == 0) ? 8 : 0);
        int iRound = i6 - Math.round(i6 * this.mExpansion);
        float f4 = this.mParallax;
        if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
            float f5 = iRound * f4;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (this.mOrientation == 0) {
                    childAt.setTranslationX((getLayoutDirection() == 1 ? 1 : -1) * f5);
                } else {
                    childAt.setTranslationY(-f5);
                }
            }
        }
        if (this.mOrientation == 0) {
            setMeasuredDimension(measuredWidth - iRound, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight - iRound);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        float f4 = bundle.getFloat(KEY_EXPANSION);
        this.mExpansion = f4;
        this.mState = f4 == 1.0f ? 3 : 0;
        super.onRestoreInstanceState(bundle.getParcelable(KEY_SUPER_STATE));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        float f4 = isExpanded() ? 1.0f : IGoodView.DEFAULT_TO_ALPHA;
        this.mExpansion = f4;
        bundle.putFloat(KEY_EXPANSION, f4);
        bundle.putParcelable(KEY_SUPER_STATE, parcelableOnSaveInstanceState);
        return bundle;
    }

    public ExpandableLayout setDuration(int i4) {
        this.mDuration = i4;
        return this;
    }

    public void setExpanded(boolean z3) {
        setExpanded(z3, true);
    }

    public void setExpansion(float f4) {
        float f5 = this.mExpansion;
        if (f5 == f4) {
            return;
        }
        float f6 = f4 - f5;
        if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            this.mState = 0;
        } else if (f4 == 1.0f) {
            this.mState = 3;
        } else if (f6 < IGoodView.DEFAULT_TO_ALPHA) {
            this.mState = 1;
        } else if (f6 > IGoodView.DEFAULT_TO_ALPHA) {
            this.mState = 2;
        }
        setVisibility(this.mState == 0 ? 8 : 0);
        this.mExpansion = f4;
        requestLayout();
        OnExpansionChangedListener onExpansionChangedListener = this.mListener;
        if (onExpansionChangedListener != null) {
            onExpansionChangedListener.onExpansionChanged(f4, this.mState);
        }
    }

    public ExpandableLayout setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
        return this;
    }

    public ExpandableLayout setOnExpansionChangedListener(OnExpansionChangedListener onExpansionChangedListener) {
        this.mListener = onExpansionChangedListener;
        return this;
    }

    public ExpandableLayout setOrientation(int i4) {
        if (i4 < 0 || i4 > 1) {
            throw new IllegalArgumentException("Orientation must be either 0 (horizontal) or 1 (vertical)");
        }
        this.mOrientation = i4;
        return this;
    }

    public ExpandableLayout setParallax(float f4) {
        this.mParallax = Math.min(1.0f, Math.max(IGoodView.DEFAULT_TO_ALPHA, f4));
        return this;
    }

    public void toggle() {
        toggle(true);
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDuration = 300;
        this.mInterpolator = new FastOutSlowInInterpolator();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2042R.styleable.ExpandableLayout);
            this.mDuration = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.ExpandableLayout_el_duration, 300);
            this.mExpansion = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.ExpandableLayout_el_expanded, false) ? 1.0f : IGoodView.DEFAULT_TO_ALPHA;
            this.mOrientation = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.ExpandableLayout_android_orientation, 1);
            this.mParallax = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.ExpandableLayout_el_parallax, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.mState = this.mExpansion != IGoodView.DEFAULT_TO_ALPHA ? 3 : 0;
            setParallax(this.mParallax);
        }
    }

    public void collapse(boolean z3) {
        setExpanded(false, z3);
    }

    public void expand(boolean z3) {
        setExpanded(true, z3);
    }

    public void setExpanded(boolean z3, boolean z4) {
        if (z3 == isExpanded()) {
            return;
        }
        if (z4) {
            animateSize(z3 ? 1 : 0);
        } else {
            setExpansion(z3 ? 1.0f : 0.0f);
        }
    }

    public void toggle(boolean z3) {
        if (isExpanded()) {
            collapse(z3);
        } else {
            expand(z3);
        }
    }
}
