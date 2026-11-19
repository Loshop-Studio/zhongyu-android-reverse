package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;

/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes5.dex */
public final /* synthetic */ class C6686e implements MultiViewUpdateListener.Listener {
    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        MultiViewUpdateListener.setAlpha(valueAnimator, view);
    }
}
