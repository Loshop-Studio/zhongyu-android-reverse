package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.animation.core.f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0371f {
    /* renamed from: a */
    public static AnimationVector m150a(VectorizedAnimationSpec vectorizedAnimationSpec, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return vectorizedAnimationSpec.getVelocityFromNanos(vectorizedAnimationSpec.getDurationNanos(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }
}
