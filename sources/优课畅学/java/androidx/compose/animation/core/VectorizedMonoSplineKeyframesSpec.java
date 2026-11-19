package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final IntObjectMap<Pair<V, Easing>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private float[][] values;
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(IntList intList, IntObjectMap<Pair<V, Easing>> intObjectMap, int i10, int i11, float f10) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i10;
        this.delayMillis = i11;
        this.periodicBias = f10;
    }

    private final int findEntryForTimeMillis(int i10) {
        int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, i10, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTimeFromIndex(int i10, int i11) {
        float f10;
        IntList intList = this.timestamps;
        if (i10 >= intList._size - 1) {
            f10 = i11;
        } else {
            int i12 = intList.get(i10);
            int i13 = this.timestamps.get(i10 + 1);
            if (i11 != i12) {
                float f11 = i13 - i12;
                return ((f11 * getEasing(i10).transform((i11 - i12) / f11)) + i12) / 1000;
            }
            f10 = i12;
        }
        return f10 / 1000;
    }

    private final Easing getEasing(int i10) {
        Easing easing;
        Pair<V, Easing> pair = this.keyframes.get(this.timestamps.get(i10));
        return (pair == null || (easing = (Easing) pair.m15907g()) == null) ? EasingKt.getLinearEasing() : easing;
    }

    private final void init(V v10, V v11, V v12) {
        float[] fArr;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v10);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v12);
            int i10 = this.timestamps._size;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = this.timestamps.get(i11) / 1000;
            }
            this.times = fArr2;
        }
        if (this.monoSpline != null && AbstractC9133u.m16128b(this.lastInitialValue, v10) && AbstractC9133u.m16128b(this.lastTargetValue, v11)) {
            return;
        }
        boolean zM16128b = AbstractC9133u.m16128b(this.lastInitialValue, v10);
        boolean zM16128b2 = AbstractC9133u.m16128b(this.lastTargetValue, v11);
        this.lastInitialValue = v10;
        this.lastTargetValue = v11;
        int size$animation_core_release = v10.getSize$animation_core_release();
        float[][] fArr3 = this.values;
        if (fArr3 == null) {
            int i12 = this.timestamps._size;
            fArr3 = new float[i12][];
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = this.timestamps.get(i13);
                Pair<V, Easing> pair = this.keyframes.get(i14);
                if (i14 == 0 && pair == null) {
                    fArr = new float[size$animation_core_release];
                    for (int i15 = 0; i15 < size$animation_core_release; i15++) {
                        fArr[i15] = v10.get$animation_core_release(i15);
                    }
                } else if (i14 == getDurationMillis() && pair == null) {
                    fArr = new float[size$animation_core_release];
                    for (int i16 = 0; i16 < size$animation_core_release; i16++) {
                        fArr[i16] = v11.get$animation_core_release(i16);
                    }
                } else {
                    AbstractC9133u.m16130d(pair);
                    AnimationVector animationVector = (AnimationVector) pair.m15906e();
                    float[] fArr4 = new float[size$animation_core_release];
                    for (int i17 = 0; i17 < size$animation_core_release; i17++) {
                        fArr4[i17] = animationVector.get$animation_core_release(i17);
                    }
                    fArr = fArr4;
                }
                fArr3[i13] = fArr;
            }
            this.values = fArr3;
        } else {
            if (!zM16128b && !this.keyframes.containsKey(0)) {
                int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, 0, 0, 0, 6, null);
                float[] fArr5 = new float[size$animation_core_release];
                for (int i18 = 0; i18 < size$animation_core_release; i18++) {
                    fArr5[i18] = v10.get$animation_core_release(i18);
                }
                fArr3[iBinarySearch$default] = fArr5;
            }
            if (!zM16128b2 && !this.keyframes.containsKey(getDurationMillis())) {
                int iBinarySearch$default2 = IntList.binarySearch$default(this.timestamps, getDurationMillis(), 0, 0, 6, null);
                float[] fArr6 = new float[size$animation_core_release];
                for (int i19 = 0; i19 < size$animation_core_release; i19++) {
                    fArr6[i19] = v11.get$animation_core_release(i19);
                }
                fArr3[iBinarySearch$default2] = fArr6;
            }
        }
        float[] fArr7 = this.times;
        if (fArr7 == null) {
            AbstractC9133u.m16151y("times");
            fArr7 = null;
        }
        this.monoSpline = new MonoSpline(fArr7, fArr3, this.periodicBias);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j10, V v10, V v11, V v12) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j10 / AnimationKt.MillisToNanos);
        Pair<V, Easing> pair = this.keyframes.get(iClampPlayTime);
        if (pair != null) {
            return (V) pair.m15906e();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return v11;
        }
        if (iClampPlayTime <= 0) {
            return v10;
        }
        init(v10, v11, v12);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        V v13 = this.valueVector;
        AbstractC9133u.m16130d(v13);
        MonoSpline monoSpline = this.monoSpline;
        AbstractC9133u.m16130d(monoSpline);
        monoSpline.getPos(getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime), v13, iFindEntryForTimeMillis);
        return v13;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j10, V v10, V v11, V v12) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j10 / AnimationKt.MillisToNanos);
        init(v10, v11, v12);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        V v13 = this.velocityVector;
        AbstractC9133u.m16130d(v13);
        MonoSpline monoSpline = this.monoSpline;
        AbstractC9133u.m16130d(monoSpline);
        monoSpline.getSlope(getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime), v13, iFindEntryForTimeMillis);
        return v13;
    }
}
