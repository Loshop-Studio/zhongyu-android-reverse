package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;

/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes5.dex */
public final /* synthetic */ class C6683b implements MultiViewUpdateListener.Listener {
    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        MultiViewUpdateListener.setTranslationX(valueAnimator, view);
    }
}
