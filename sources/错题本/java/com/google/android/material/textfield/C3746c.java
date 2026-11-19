package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3746c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f2931a;

    /* renamed from: b */
    public final /* synthetic */ EndIconDelegate f2932b;

    public /* synthetic */ C3746c(EndIconDelegate endIconDelegate, int i) {
        this.f2931a = i;
        this.f2932b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2931a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f2932b).lambda$getAlphaAnimator$3(valueAnimator);
                break;
            case 1:
                ((ClearTextEndIconDelegate) this.f2932b).lambda$getScaleAnimator$4(valueAnimator);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f2932b).lambda$getAlphaAnimator$6(valueAnimator);
                break;
        }
    }
}
