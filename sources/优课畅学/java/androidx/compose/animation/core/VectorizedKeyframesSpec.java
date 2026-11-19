package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private ArcSpline arcSpline;
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;
    private final IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private int[] modes;
    private float[] posArray;
    private float[] slopeArray;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private V velocityVector;

    public /* synthetic */ VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i10, int i11, Easing easing, int i12, AbstractC9126n abstractC9126n) {
        this(intList, intObjectMap, i10, i11, easing, i12);
    }

    private final int findEntryForTimeMillis(int i10) {
        int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, i10, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTime(int i10) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(i10), i10, false);
    }

    private final float getEasedTimeFromIndex(int i10, int i11, boolean z10) {
        Easing easing;
        float f10;
        IntList intList = this.timestamps;
        if (i10 >= intList._size - 1) {
            f10 = i11;
        } else {
            int i12 = intList.get(i10);
            int i13 = this.timestamps.get(i10 + 1);
            if (i11 == i12) {
                f10 = i12;
            } else {
                int i14 = i13 - i12;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(i12);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f11 = i14;
                float fTransform = easing.transform((i11 - i12) / f11);
                if (z10) {
                    return fTransform;
                }
                f10 = (f11 * fTransform) + i12;
            }
        }
        return f10 / 1000;
    }

    private final void init(V v10, V v11, V v12) {
        float[] fArr;
        boolean z10 = this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v10);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v12);
            int i10 = this.timestamps._size;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = this.timestamps.get(i11) / 1000;
            }
            this.times = fArr2;
            int i12 = this.timestamps._size;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(this.timestamps.get(i13));
                int iM20313getArcMode9TMq4 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.m20313getArcMode9TMq4() : this.initialArcMode;
                if (!ArcMode.m20252equalsimpl0(iM20313getArcMode9TMq4, ArcMode.Companion.m20258getArcLinear9TMq4())) {
                    z10 = true;
                }
                iArr[i13] = iM20313getArcMode9TMq4;
            }
            this.modes = iArr;
        }
        if (z10) {
            if (this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline && AbstractC9133u.m16128b(this.lastInitialValue, v10) && AbstractC9133u.m16128b(this.lastTargetValue, v11)) {
                return;
            }
            this.lastInitialValue = v10;
            this.lastTargetValue = v11;
            int size$animation_core_release = (v10.getSize$animation_core_release() % 2) + v10.getSize$animation_core_release();
            this.posArray = new float[size$animation_core_release];
            this.slopeArray = new float[size$animation_core_release];
            int i14 = this.timestamps._size;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = this.timestamps.get(i15);
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(i16);
                if (i16 == 0 && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size$animation_core_release];
                    for (int i17 = 0; i17 < size$animation_core_release; i17++) {
                        fArr[i17] = v10.get$animation_core_release(i17);
                    }
                } else if (i16 == getDurationMillis() && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size$animation_core_release];
                    for (int i18 = 0; i18 < size$animation_core_release; i18++) {
                        fArr[i18] = v11.get$animation_core_release(i18);
                    }
                } else {
                    AbstractC9133u.m16130d(vectorizedKeyframeSpecElementInfo2);
                    AnimationVector vectorValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
                    float[] fArr4 = new float[size$animation_core_release];
                    for (int i19 = 0; i19 < size$animation_core_release; i19++) {
                        fArr4[i19] = vectorValue.get$animation_core_release(i19);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.arcSpline = new ArcSpline(this.modes, this.times, fArr3);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.animation.core.AnimationVector] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j10, V v10, V v11, V v12) {
        ?? vectorValue;
        ?? vectorValue2;
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j10 / AnimationKt.MillisToNanos);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(iClampPlayTime);
        if (vectorizedKeyframeSpecElementInfo != null) {
            return (V) vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return v11;
        }
        if (iClampPlayTime <= 0) {
            return v10;
        }
        init(v10, v11, v12);
        V v13 = this.valueVector;
        AbstractC9133u.m16130d(v13);
        int i10 = 0;
        if (this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline) {
            float easedTime = getEasedTime(iClampPlayTime);
            float[] fArr = this.posArray;
            this.arcSpline.getPos(easedTime, fArr);
            int length = fArr.length;
            while (i10 < length) {
                v13.set$animation_core_release(i10, fArr[i10]);
                i10++;
            }
            return v13;
        }
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime, true);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(this.timestamps.get(iFindEntryForTimeMillis));
        if (vectorizedKeyframeSpecElementInfo2 != null && (vectorValue2 = vectorizedKeyframeSpecElementInfo2.getVectorValue()) != 0) {
            v10 = vectorValue2;
        }
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(this.timestamps.get(iFindEntryForTimeMillis + 1));
        if (vectorizedKeyframeSpecElementInfo3 != null && (vectorValue = vectorizedKeyframeSpecElementInfo3.getVectorValue()) != 0) {
            v11 = vectorValue;
        }
        int size$animation_core_release = v13.getSize$animation_core_release();
        while (i10 < size$animation_core_release) {
            v13.set$animation_core_release(i10, (v10.get$animation_core_release(i10) * (1 - easedTimeFromIndex)) + (v11.get$animation_core_release(i10) * easedTimeFromIndex));
            i10++;
        }
        return v13;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j10, V v10, V v11, V v12) {
        long jClampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j10 / AnimationKt.MillisToNanos);
        if (jClampPlayTime < 0) {
            return v12;
        }
        init(v10, v11, v12);
        V v13 = this.velocityVector;
        AbstractC9133u.m16130d(v13);
        int i10 = 0;
        if (this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline) {
            float easedTime = getEasedTime((int) jClampPlayTime);
            float[] fArr = this.slopeArray;
            this.arcSpline.getSlope(easedTime, fArr);
            int length = fArr.length;
            while (i10 < length) {
                v13.set$animation_core_release(i10, fArr[i10]);
                i10++;
            }
        } else {
            AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, jClampPlayTime - 1, v10, v11, v12);
            AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, jClampPlayTime, v10, v11, v12);
            int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
            while (i10 < size$animation_core_release) {
                v13.set$animation_core_release(i10, (valueFromMillis.get$animation_core_release(i10) - valueFromMillis2.get$animation_core_release(i10)) * 1000.0f);
                i10++;
            }
        }
        return v13;
    }

    private VectorizedKeyframesSpec(IntList intList, IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> intObjectMap, int i10, int i11, Easing easing, int i12) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i10;
        this.delayMillis = i11;
        this.defaultEasing = easing;
        this.initialArcMode = i12;
        this.modes = VectorizedAnimationSpecKt.EmptyIntArray;
        this.times = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.posArray = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.slopeArray = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this(map, i10, (i12 & 4) != 0 ? 0 : i11);
    }

    public VectorizedKeyframesSpec(Map<Integer, ? extends Pair<? extends V, ? extends Easing>> map, int i10, int i11) {
        MutableIntList mutableIntList = new MutableIntList(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            mutableIntList.add(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!map.containsKey(Integer.valueOf(i10))) {
            mutableIntList.add(i10);
        }
        mutableIntList.sort();
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        for (Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<? extends V, ? extends Easing> value = entry.getValue();
            mutableIntObjectMap.set(iIntValue, new VectorizedKeyframeSpecElementInfo((AnimationVector) value.m15906e(), (Easing) value.m15907g(), ArcMode.Companion.m20258getArcLinear9TMq4(), null));
        }
        this(mutableIntList, mutableIntObjectMap, i10, i11, EasingKt.getLinearEasing(), ArcMode.Companion.m20258getArcLinear9TMq4(), null);
    }
}
