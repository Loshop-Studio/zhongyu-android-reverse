package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.anims = animations;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v10, V v11, V v12) {
        int size$animation_core_release = v10.getSize$animation_core_release();
        long jMax = 0;
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            jMax = Math.max(jMax, this.anims.get(i10).getDurationNanos(v10.get$animation_core_release(i10), v11.get$animation_core_release(i10), v12.get$animation_core_release(i10)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V v10, V v11, V v12) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(v12);
        }
        V v13 = this.endVelocityVector;
        if (v13 == null) {
            AbstractC9979u.m20312y("endVelocityVector");
            v13 = null;
        }
        int size$animation_core_release = v13.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v14 = this.endVelocityVector;
            if (v14 == null) {
                AbstractC9979u.m20312y("endVelocityVector");
                v14 = null;
            }
            v14.set$animation_core_release(i10, this.anims.get(i10).getEndVelocity(v10.get$animation_core_release(i10), v11.get$animation_core_release(i10), v12.get$animation_core_release(i10)));
        }
        V v15 = this.endVelocityVector;
        if (v15 != null) {
            return v15;
        }
        AbstractC9979u.m20312y("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j10, V v10, V v11, V v12) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v10);
        }
        V v13 = this.valueVector;
        if (v13 == null) {
            AbstractC9979u.m20312y("valueVector");
            v13 = null;
        }
        int size$animation_core_release = v13.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v14 = this.valueVector;
            if (v14 == null) {
                AbstractC9979u.m20312y("valueVector");
                v14 = null;
            }
            v14.set$animation_core_release(i10, this.anims.get(i10).getValueFromNanos(j10, v10.get$animation_core_release(i10), v11.get$animation_core_release(i10), v12.get$animation_core_release(i10)));
        }
        V v15 = this.valueVector;
        if (v15 != null) {
            return v15;
        }
        AbstractC9979u.m20312y("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j10, V v10, V v11, V v12) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v12);
        }
        V v13 = this.velocityVector;
        if (v13 == null) {
            AbstractC9979u.m20312y("velocityVector");
            v13 = null;
        }
        int size$animation_core_release = v13.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v14 = this.velocityVector;
            if (v14 == null) {
                AbstractC9979u.m20312y("velocityVector");
                v14 = null;
            }
            v14.set$animation_core_release(i10, this.anims.get(i10).getVelocityFromNanos(j10, v10.get$animation_core_release(i10), v11.get$animation_core_release(i10), v12.get$animation_core_release(i10)));
        }
        V v15 = this.velocityVector;
        if (v15 != null) {
            return v15;
        }
        AbstractC9979u.m20312y("velocityVector");
        return null;
    }

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int i10) {
                return floatAnimationSpec;
            }
        });
    }
}
