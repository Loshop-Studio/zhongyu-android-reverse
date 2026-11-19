package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.shape.MaterialShapeDrawable;

/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3465b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f2837a;

    /* renamed from: b */
    public final /* synthetic */ Object f2838b;

    /* renamed from: c */
    public final /* synthetic */ Object f2839c;

    public /* synthetic */ C3465b(int i, Object obj, Object obj2) {
        this.f2837a = i;
        this.f2838b = obj;
        this.f2839c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2837a) {
            case 0:
                ((AppBarLayout) this.f2838b).lambda$initializeLiftOnScrollWithElevation$1((MaterialShapeDrawable) this.f2839c, valueAnimator);
                break;
            default:
                ((ExpandCollapseAnimationHelper) this.f2838b).lambda$getExpandCollapseAnimator$0((Rect) this.f2839c, valueAnimator);
                break;
        }
    }
}
