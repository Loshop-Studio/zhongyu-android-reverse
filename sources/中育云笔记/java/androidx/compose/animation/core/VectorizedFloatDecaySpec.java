package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(V v10, V v11) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v10);
        }
        V v12 = this.velocityVector;
        if (v12 == null) {
            AbstractC9979u.m20312y("velocityVector");
            v12 = null;
        }
        int size$animation_core_release = v12.getSize$animation_core_release();
        long jMax = 0;
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            jMax = Math.max(jMax, this.floatDecaySpec.getDurationNanos(v10.get$animation_core_release(i10), v11.get$animation_core_release(i10)));
        }
        return jMax;
    }

    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getTargetValue(V v10, V v11) {
        if (this.targetVector == null) {
            this.targetVector = (V) AnimationVectorsKt.newInstance(v10);
        }
        V v12 = this.targetVector;
        if (v12 == null) {
            AbstractC9979u.m20312y("targetVector");
            v12 = null;
        }
        int size$animation_core_release = v12.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v13 = this.targetVector;
            if (v13 == null) {
                AbstractC9979u.m20312y("targetVector");
                v13 = null;
            }
            v13.set$animation_core_release(i10, this.floatDecaySpec.getTargetValue(v10.get$animation_core_release(i10), v11.get$animation_core_release(i10)));
        }
        V v14 = this.targetVector;
        if (v14 != null) {
            return v14;
        }
        AbstractC9979u.m20312y("targetVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getValueFromNanos(long j10, V v10, V v11) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v10);
        }
        V v12 = this.valueVector;
        if (v12 == null) {
            AbstractC9979u.m20312y("valueVector");
            v12 = null;
        }
        int size$animation_core_release = v12.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v13 = this.valueVector;
            if (v13 == null) {
                AbstractC9979u.m20312y("valueVector");
                v13 = null;
            }
            v13.set$animation_core_release(i10, this.floatDecaySpec.getValueFromNanos(j10, v10.get$animation_core_release(i10), v11.get$animation_core_release(i10)));
        }
        V v14 = this.valueVector;
        if (v14 != null) {
            return v14;
        }
        AbstractC9979u.m20312y("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getVelocityFromNanos(long j10, V v10, V v11) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v10);
        }
        V v12 = this.velocityVector;
        if (v12 == null) {
            AbstractC9979u.m20312y("velocityVector");
            v12 = null;
        }
        int size$animation_core_release = v12.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v13 = this.velocityVector;
            if (v13 == null) {
                AbstractC9979u.m20312y("velocityVector");
                v13 = null;
            }
            v13.set$animation_core_release(i10, this.floatDecaySpec.getVelocityFromNanos(j10, v10.get$animation_core_release(i10), v11.get$animation_core_release(i10)));
        }
        V v14 = this.velocityVector;
        if (v14 != null) {
            return v14;
        }
        AbstractC9979u.m20312y("velocityVector");
        return null;
    }
}
