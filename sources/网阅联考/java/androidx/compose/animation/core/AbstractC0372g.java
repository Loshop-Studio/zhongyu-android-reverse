package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.animation.core.g */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0372g {
    /* renamed from: a */
    public static long m152a(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * AnimationKt.MillisToNanos;
    }
}
