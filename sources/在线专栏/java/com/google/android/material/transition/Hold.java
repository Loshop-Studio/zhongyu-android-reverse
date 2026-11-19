package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C0752x;
import androidx.transition.Visibility;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public final class Hold extends Visibility {
    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        return ValueAnimator.ofFloat(IGoodView.DEFAULT_TO_ALPHA);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        return ValueAnimator.ofFloat(IGoodView.DEFAULT_TO_ALPHA);
    }
}
