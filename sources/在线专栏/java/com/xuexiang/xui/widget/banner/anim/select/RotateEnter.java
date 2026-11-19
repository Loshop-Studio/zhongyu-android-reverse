package com.xuexiang.xui.widget.banner.anim.select;

import android.animation.ObjectAnimator;
import android.view.View;
import com.xuexiang.xui.widget.banner.anim.BaseAnimator;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class RotateEnter extends BaseAnimator {
    public RotateEnter() {
        this.mDuration = 200L;
    }

    @Override // com.xuexiang.xui.widget.banner.anim.BaseAnimator
    public void setAnimation(View view) {
        this.mAnimatorSet.playTogether(ObjectAnimator.ofFloat(view, "rotation", IGoodView.DEFAULT_TO_ALPHA, 180.0f));
    }
}
