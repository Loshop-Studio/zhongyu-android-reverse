package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.animation.core.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0368c {
    /* renamed from: a */
    public static float m142a(FloatAnimationSpec floatAnimationSpec, float f4, float f5, float f6) {
        return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f4, f5, f6), f4, f5, f6);
    }

    /* renamed from: c */
    public static VectorizedFloatAnimationSpec m144c(FloatAnimationSpec floatAnimationSpec, TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedFloatAnimationSpec(floatAnimationSpec);
    }
}
