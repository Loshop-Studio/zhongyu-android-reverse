package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import com.google.android.material.internal.FadeThroughDrawable;

/* renamed from: com.google.android.material.search.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3674b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f2892a;

    /* renamed from: b */
    public final /* synthetic */ Object f2893b;

    public /* synthetic */ C3674b(Object obj, int i) {
        this.f2892a = i;
        this.f2893b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2892a) {
            case 0:
                ((View) this.f2893b).setAlpha(0.0f);
                break;
            case 1:
                SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$3((DrawerArrowDrawable) this.f2893b, valueAnimator);
                break;
            default:
                SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$4((FadeThroughDrawable) this.f2893b, valueAnimator);
                break;
        }
    }
}
