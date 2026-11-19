package com.google.android.material.motion;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.navigation.DrawerLayoutUtils;

/* renamed from: com.google.android.material.motion.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3624b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f2888a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f2889b;

    public /* synthetic */ C3624b(ViewGroup viewGroup, int i) {
        this.f2888a = i;
        this.f2889b = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2888a) {
            case 0:
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$0((ClippableRoundedCornerLayout) this.f2889b, valueAnimator);
                break;
            default:
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0((DrawerLayout) this.f2889b, valueAnimator);
                break;
        }
    }
}
