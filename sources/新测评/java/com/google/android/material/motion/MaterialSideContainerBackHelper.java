package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.C5442R;
import com.google.android.material.animation.AnimationUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(C5442R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(C5442R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(C5442R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean checkAbsoluteGravity(@GravityInt int i10, @GravityInt int i11) {
        return (GravityCompat.getAbsoluteGravity(i10, ViewCompat.getLayoutDirection(this.view)) & i11) == i11;
    }

    private int getEdgeMargin(boolean z9) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z9 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v9 = this.view;
        if (v9 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v9;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt final int i10, @Nullable Animator.AnimatorListener animatorListener, @Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z9 = backEventCompat.getSwipeEdge() == 0;
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i10, 3);
        float width = (this.view.getWidth() * this.view.getScaleX()) + getEdgeMargin(zCheckAbsoluteGravity);
        V v9 = this.view;
        Property property = View.TRANSLATION_X;
        if (zCheckAbsoluteGravity) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v9, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z9, i10);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        super.onStartBackProgress(backEventCompat);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt int i10) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i10);
    }

    @VisibleForTesting
    public void updateBackProgress(float f10, boolean z9, @GravityInt int i10) {
        int right;
        float fInterpolateProgress = interpolateProgress(f10);
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i10, 3);
        boolean z10 = z9 == zCheckAbsoluteGravity;
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.maxScaleXDistanceShrink / f11;
            float f14 = this.maxScaleXDistanceGrow / f11;
            float f15 = this.maxScaleYDistance / f12;
            V v9 = this.view;
            if (zCheckAbsoluteGravity) {
                f11 = 0.0f;
            }
            v9.setPivotX(f11);
            if (!z10) {
                f14 = -f13;
            }
            float fLerp = AnimationUtils.lerp(0.0f, f14, fInterpolateProgress);
            float f16 = fLerp + 1.0f;
            this.view.setScaleX(f16);
            float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f15, fInterpolateProgress);
            this.view.setScaleY(fLerp2);
            V v10 = this.view;
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (zCheckAbsoluteGravity) {
                        right = (width - childAt.getRight()) + childAt.getWidth();
                    } else {
                        right = -childAt.getLeft();
                    }
                    childAt.setPivotX(right);
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z10 ? 1.0f - fLerp : 1.0f;
                    float f18 = fLerp2 != 0.0f ? (f16 / fLerp2) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }
}
