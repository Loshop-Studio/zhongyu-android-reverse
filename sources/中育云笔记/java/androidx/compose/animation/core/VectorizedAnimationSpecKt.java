package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {
    private static final int[] EmptyIntArray = new int[0];
    private static final float[] EmptyFloatArray = new float[0];
    private static final ArcSpline EmptyArcSpline = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j10) {
        long delayMillis = j10 - vectorizedDurationBasedAnimationSpec.getDelayMillis();
        long durationMillis = vectorizedDurationBasedAnimationSpec.getDurationMillis();
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        return delayMillis > durationMillis ? durationMillis : delayMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends AnimationVector> Animations createSpringAnimations(V v10, float f10, float f11) {
        return v10 != null ? new Animations(v10, f10, f11) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt.createSpringAnimations.1
            private final FloatSpringSpec[] anims;

            /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
            {
                int size$animation_core_release = v10.getSize$animation_core_release();
                FloatSpringSpec[] floatSpringSpecArr = new FloatSpringSpec[size$animation_core_release];
                for (int i10 = 0; i10 < size$animation_core_release; i10++) {
                    floatSpringSpecArr[i10] = new FloatSpringSpec(f10, f11, v10.get$animation_core_release(i10));
                }
                this.anims = floatSpringSpecArr;
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i10) {
                return this.anims[i10];
            }
        } : new Animations(f10, f11) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt.createSpringAnimations.2
            private final FloatSpringSpec anim;

            {
                this.anim = new FloatSpringSpec(f10, f11, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i10) {
                return this.anim;
            }
        };
    }

    public static final <V extends AnimationVector> long getDurationMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v10, V v11, V v12) {
        return vectorizedAnimationSpec.getDurationNanos(v10, v11, v12) / AnimationKt.MillisToNanos;
    }

    public static final <V extends AnimationVector> V getValueFromMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j10, V v10, V v11, V v12) {
        return (V) vectorizedAnimationSpec.getValueFromNanos(j10 * AnimationKt.MillisToNanos, v10, v11, v12);
    }
}
