package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.internal.ViewUtils;

/* renamed from: com.google.android.material.search.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3673a implements AccessibilityManagerCompat.TouchExplorationStateChangeListener, AnimatableView.Listener, ViewUtils.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ Object f2891a;

    public /* synthetic */ C3673a(Object obj) {
        this.f2891a = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f2891a).start();
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        return ((SearchView) this.f2891a).lambda$setUpToolbarInsetListener$4(view, windowInsetsCompat, relativePadding);
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z8) {
        ((SearchBar) this.f2891a).lambda$new$0(z8);
    }
}
