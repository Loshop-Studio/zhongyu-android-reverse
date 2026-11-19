package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C0752x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    /* renamed from: X */
    public static final int f7401X = 0;

    /* renamed from: Y */
    public static final int f7402Y = 1;

    /* renamed from: Z */
    public static final int f7403Z = 2;
    private final int axis;
    private final boolean forward;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    public MaterialSharedAxis(int i4, boolean z3) {
        super(createPrimaryAnimatorProvider(i4, z3), createSecondaryAnimatorProvider());
        this.axis = i4;
        this.forward = z3;
    }

    private static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i4, boolean z3) {
        if (i4 == 0) {
            return new SlideDistanceProvider(z3 ? 8388613 : 8388611);
        }
        if (i4 == 1) {
            return new SlideDistanceProvider(z3 ? 80 : 48);
        }
        if (i4 == 2) {
            return new ScaleProvider(z3);
        }
        throw new IllegalArgumentException("Invalid axis: " + i4);
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    public int getAxis() {
        return this.axis;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.forward;
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        return super.onAppear(viewGroup, view, c0752x, c0752x2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        return super.onDisappear(viewGroup, view, c0752x, c0752x2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
