package com.xuexiang.xui.widget.behavior;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class TranslateAnimateHelper implements AnimateHelper {
    public static int MODE_BOTTOM = 2333;
    public static int MODE_TITLE = 233;
    private float mFirstY;
    private float mMargin;
    public float mStartY;
    public View mTarget;
    public int mCurrentState = 1;
    public int mMode = MODE_TITLE;

    private TranslateAnimateHelper(View view) {
        this.mFirstY = IGoodView.DEFAULT_TO_ALPHA;
        this.mTarget = view;
        this.mFirstY = view.getY();
        this.mMargin = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0305e) this.mTarget.getLayoutParams())).topMargin + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0305e) this.mTarget.getLayoutParams())).bottomMargin;
    }

    public static TranslateAnimateHelper get(View view) {
        return new TranslateAnimateHelper(view);
    }

    private void hideBottom() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mTarget.getY(), this.mFirstY + this.mTarget.getHeight() + this.mMargin);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.behavior.TranslateAnimateHelper.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TranslateAnimateHelper.this.mTarget.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.start();
        this.mCurrentState = 0;
    }

    private void hideTitle() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mTarget.getY(), -this.mTarget.getHeight());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.behavior.TranslateAnimateHelper.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TranslateAnimateHelper.this.mTarget.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.start();
        this.mCurrentState = 0;
    }

    private void setState(int i4) {
        this.mCurrentState = i4;
    }

    private void showBottom() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mTarget.getY(), this.mFirstY);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.behavior.TranslateAnimateHelper.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TranslateAnimateHelper.this.mTarget.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.start();
        this.mCurrentState = 1;
    }

    private void showTitle() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mTarget.getY(), IGoodView.DEFAULT_TO_ALPHA);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.behavior.TranslateAnimateHelper.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TranslateAnimateHelper.this.mTarget.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.start();
        this.mCurrentState = 1;
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public int getState() {
        return this.mCurrentState;
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public void hide() {
        int i4 = this.mMode;
        if (i4 == MODE_TITLE) {
            hideTitle();
        } else if (i4 == MODE_BOTTOM) {
            hideBottom();
        }
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public void setMode(int i4) {
        this.mMode = i4;
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public void setStartY(float f4) {
        this.mStartY = f4;
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public void show() {
        int i4 = this.mMode;
        if (i4 == MODE_TITLE) {
            showTitle();
        } else if (i4 == MODE_BOTTOM) {
            showBottom();
        }
    }
}
