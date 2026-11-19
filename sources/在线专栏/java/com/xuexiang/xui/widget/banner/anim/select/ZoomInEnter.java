package com.xuexiang.xui.widget.banner.anim.select;

import android.animation.ObjectAnimator;
import android.view.View;
import com.xuexiang.xui.widget.banner.anim.BaseAnimator;

/* loaded from: classes.dex */
public class ZoomInEnter extends BaseAnimator {
    public ZoomInEnter() {
        this.mDuration = 200L;
    }

    @Override // com.xuexiang.xui.widget.banner.anim.BaseAnimator
    public void setAnimation(View view) {
        this.mAnimatorSet.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.5f), ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.5f));
    }
}
