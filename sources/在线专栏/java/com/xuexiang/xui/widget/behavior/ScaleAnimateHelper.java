package com.xuexiang.xui.widget.behavior;

import android.animation.ValueAnimator;
import android.view.View;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ScaleAnimateHelper implements AnimateHelper {
    public int mCurrentState = 1;
    public View mTarget;

    private ScaleAnimateHelper(View view) {
        this.mTarget = view;
    }

    public static ScaleAnimateHelper get(View view) {
        return new ScaleAnimateHelper(view);
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public int getState() {
        return this.mCurrentState;
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public void hide() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mTarget.getScaleX(), IGoodView.DEFAULT_TO_ALPHA);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.behavior.ScaleAnimateHelper.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ScaleAnimateHelper.this.mTarget.setScaleX(fFloatValue);
                ScaleAnimateHelper.this.mTarget.setScaleY(fFloatValue);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.mCurrentState = 0;
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public void setMode(int i4) {
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public void setStartY(float f4) {
    }

    @Override // com.xuexiang.xui.widget.behavior.AnimateHelper
    public void show() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mTarget.getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.behavior.ScaleAnimateHelper.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ScaleAnimateHelper.this.mTarget.setScaleX(fFloatValue);
                ScaleAnimateHelper.this.mTarget.setScaleY(fFloatValue);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.mCurrentState = 1;
    }
}
