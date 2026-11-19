package com.xuexiang.xui.widget.banner.anim.unselect;

import android.animation.ObjectAnimator;
import android.view.View;
import com.xuexiang.xui.widget.banner.anim.BaseAnimator;

/* loaded from: classes.dex */
public class NoAnimExist extends BaseAnimator {
    public NoAnimExist() {
        this.mDuration = 200L;
    }

    @Override // com.xuexiang.xui.widget.banner.anim.BaseAnimator
    public void setAnimation(View view) {
        this.mAnimatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f));
    }
}
