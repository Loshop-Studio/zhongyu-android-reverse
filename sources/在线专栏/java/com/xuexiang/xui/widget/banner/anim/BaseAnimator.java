package com.xuexiang.xui.widget.banner.anim;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public abstract class BaseAnimator {
    private long mDelay;
    private Interpolator mInterpolator;
    private AnimatorListener mListener;
    protected long mDuration = 500;
    protected AnimatorSet mAnimatorSet = new AnimatorSet();

    public interface AnimatorListener {
        void onAnimationCancel(Animator animator);

        void onAnimationEnd(Animator animator);

        void onAnimationRepeat(Animator animator);

        void onAnimationStart(Animator animator);
    }

    public static void reset(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(IGoodView.DEFAULT_TO_ALPHA);
        view.setTranslationY(IGoodView.DEFAULT_TO_ALPHA);
        view.setRotation(IGoodView.DEFAULT_TO_ALPHA);
        view.setRotationY(IGoodView.DEFAULT_TO_ALPHA);
        view.setRotationX(IGoodView.DEFAULT_TO_ALPHA);
    }

    public BaseAnimator delay(long j4) {
        this.mDelay = j4;
        return this;
    }

    public BaseAnimator duration(long j4) {
        this.mDuration = j4;
        return this;
    }

    public BaseAnimator interpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
        return this;
    }

    public BaseAnimator listener(AnimatorListener animatorListener) {
        this.mListener = animatorListener;
        return this;
    }

    public void playOn(View view) {
        start(view);
    }

    public abstract void setAnimation(View view);

    protected void start(View view) {
        reset(view);
        setAnimation(view);
        this.mAnimatorSet.setDuration(this.mDuration);
        Interpolator interpolator = this.mInterpolator;
        if (interpolator != null) {
            this.mAnimatorSet.setInterpolator(interpolator);
        }
        long j4 = this.mDelay;
        if (j4 > 0) {
            this.mAnimatorSet.setStartDelay(j4);
        }
        if (this.mListener != null) {
            this.mAnimatorSet.addListener(new Animator.AnimatorListener() { // from class: com.xuexiang.xui.widget.banner.anim.BaseAnimator.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    BaseAnimator.this.mListener.onAnimationCancel(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BaseAnimator.this.mListener.onAnimationEnd(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    BaseAnimator.this.mListener.onAnimationRepeat(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    BaseAnimator.this.mListener.onAnimationStart(animator);
                }
            });
        }
        this.mAnimatorSet.start();
    }
}
