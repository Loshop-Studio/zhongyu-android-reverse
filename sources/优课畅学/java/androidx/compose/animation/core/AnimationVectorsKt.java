package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f10) {
        return new AnimationVector1D(f10);
    }

    public static final <T extends AnimationVector> T copy(T t10) {
        T t11 = (T) newInstance(t10);
        int size$animation_core_release = t11.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            t11.set$animation_core_release(i10, t10.get$animation_core_release(i10));
        }
        return t11;
    }

    public static final <T extends AnimationVector> void copyFrom(T t10, T t11) {
        int size$animation_core_release = t10.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            t10.set$animation_core_release(i10, t11.get$animation_core_release(i10));
        }
    }

    public static final <T extends AnimationVector> T newInstance(T t10) {
        T t11 = (T) t10.newVector$animation_core_release();
        AbstractC9133u.m16131e(t11, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t11;
    }

    public static final AnimationVector2D AnimationVector(float f10, float f11) {
        return new AnimationVector2D(f10, f11);
    }

    public static final AnimationVector3D AnimationVector(float f10, float f11, float f12) {
        return new AnimationVector3D(f10, f11, f12);
    }

    public static final AnimationVector4D AnimationVector(float f10, float f11, float f12, float f13) {
        return new AnimationVector4D(f10, f11, f12, f13);
    }
}
