package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B;\b\u0016\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBE\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000b\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J/\u0010(\u001a\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010)J/\u0010*\u001a\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010/R\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\u001a\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0018\u0010;\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0018\u0010<\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00109R\u0016\u0010=\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00107R\u0016\u0010>\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00107R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, m5110d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "durationMillis", "delayMillis", "<init>", "(Ljava/util/Map;II)V", "Landroidx/collection/IntList;", "timestamps", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "defaultEasing", "Landroidx/compose/animation/core/ArcMode;", "initialArcMode", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/e;)V", "initialValue", "targetValue", "initialVelocity", "Ld6/s;", "init", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "timeMillis", "", "getEasedTime", "(I)F", "index", "", "asFraction", "getEasedTimeFromIndex", "(IIZ)F", "findEntryForTimeMillis", "(I)I", "", "playTimeNanos", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "Landroidx/collection/IntList;", "Landroidx/collection/IntObjectMap;", "I", "getDurationMillis", "()I", "getDelayMillis", "Landroidx/compose/animation/core/Easing;", "", "modes", "[I", "", "times", "[F", "valueVector", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "lastInitialValue", "lastTargetValue", "posArray", "slopeArray", "Landroidx/compose/animation/core/ArcSpline;", "arcSpline", "Landroidx/compose/animation/core/ArcSpline;", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n*L\n1#1,1038:1\n215#2,2:1039\n215#2,2:1041\n65#3:1043\n65#3:1044\n65#3:1045\n70#3:1047\n71#4:1046\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n*L\n246#1:1039,2\n259#1:1041,2\n301#1:1043\n304#1:1044\n335#1:1045\n469#1:1047\n418#1:1046\n*E\n"})
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;

    @NotNull
    private ArcSpline arcSpline;

    @NotNull
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;

    @NotNull
    private final IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes;

    @Nullable
    private V lastInitialValue;

    @Nullable
    private V lastTargetValue;

    @NotNull
    private int[] modes;

    @NotNull
    private float[] posArray;

    @NotNull
    private float[] slopeArray;

    @NotNull
    private float[] times;

    @NotNull
    private final IntList timestamps;

    @Nullable
    private V valueVector;

    @Nullable
    private V velocityVector;

    public /* synthetic */ VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i, int i8, Easing easing, int i9, AbstractC5824e abstractC5824e) {
        this(intList, intObjectMap, i, i8, easing, i9);
    }

    private final int findEntryForTimeMillis(int timeMillis) {
        int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, timeMillis, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTime(int timeMillis) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(timeMillis), timeMillis, false);
    }

    private final float getEasedTimeFromIndex(int index, int timeMillis, boolean asFraction) {
        Easing easing;
        float f;
        IntList intList = this.timestamps;
        if (index >= intList._size - 1) {
            f = timeMillis;
        } else {
            int i = intList.get(index);
            int i8 = this.timestamps.get(index + 1);
            if (timeMillis == i) {
                f = i;
            } else {
                int i9 = i8 - i;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(i);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f7 = i9;
                float fTransform = easing.transform((timeMillis - i) / f7);
                if (asFraction) {
                    return fTransform;
                }
                f = (f7 * fTransform) + i;
            }
        }
        return f / 1000;
    }

    private final void init(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        boolean z8 = this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
            int i = this.timestamps._size;
            float[] fArr2 = new float[i];
            for (int i8 = 0; i8 < i; i8++) {
                fArr2[i8] = this.timestamps.get(i8) / 1000;
            }
            this.times = fArr2;
            int i9 = this.timestamps._size;
            int[] iArr = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(this.timestamps.get(i10));
                int iM6719getArcMode9TMq4 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.m6719getArcMode9TMq4() : this.initialArcMode;
                if (!ArcMode.m6658equalsimpl0(iM6719getArcMode9TMq4, ArcMode.INSTANCE.m6664getArcLinear9TMq4())) {
                    z8 = true;
                }
                iArr[i10] = iM6719getArcMode9TMq4;
            }
            this.modes = iArr;
        }
        if (z8) {
            if (this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline && AbstractC5830k.m5325b(this.lastInitialValue, initialValue) && AbstractC5830k.m5325b(this.lastTargetValue, targetValue)) {
                return;
            }
            this.lastInitialValue = initialValue;
            this.lastTargetValue = targetValue;
            int size = initialValue.getSize() + (initialValue.getSize() % 2);
            this.posArray = new float[size];
            this.slopeArray = new float[size];
            int i11 = this.timestamps._size;
            float[][] fArr3 = new float[i11][];
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = this.timestamps.get(i12);
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(i13);
                if (i13 == 0 && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        fArr[i14] = initialValue.get$animation_core_release(i14);
                    }
                } else if (i13 == getDurationMillis() && vectorizedKeyframeSpecElementInfo2 == null) {
                    fArr = new float[size];
                    for (int i15 = 0; i15 < size; i15++) {
                        fArr[i15] = targetValue.get$animation_core_release(i15);
                    }
                } else {
                    AbstractC5830k.m5327d(vectorizedKeyframeSpecElementInfo2);
                    AnimationVector vectorValue = vectorizedKeyframeSpecElementInfo2.getVectorValue();
                    float[] fArr4 = new float[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        fArr4[i16] = vectorValue.get$animation_core_release(i16);
                    }
                    fArr = fArr4;
                }
                fArr3[i12] = fArr;
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
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getValueFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        ?? vectorValue;
        ?? vectorValue2;
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / AnimationKt.MillisToNanos);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(iClampPlayTime);
        if (vectorizedKeyframeSpecElementInfo != null) {
            return (V) vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (iClampPlayTime <= 0) {
            return initialValue;
        }
        init(initialValue, targetValue, initialVelocity);
        V v2 = this.valueVector;
        AbstractC5830k.m5327d(v2);
        int i = 0;
        if (this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline) {
            float easedTime = getEasedTime(iClampPlayTime);
            float[] fArr = this.posArray;
            this.arcSpline.getPos(easedTime, fArr);
            int length = fArr.length;
            while (i < length) {
                v2.set$animation_core_release(i, fArr[i]);
                i++;
            }
        } else {
            int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
            float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime, true);
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(this.timestamps.get(iFindEntryForTimeMillis));
            if (vectorizedKeyframeSpecElementInfo2 != null && (vectorValue2 = vectorizedKeyframeSpecElementInfo2.getVectorValue()) != 0) {
                initialValue = vectorValue2;
            }
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(this.timestamps.get(iFindEntryForTimeMillis + 1));
            if (vectorizedKeyframeSpecElementInfo3 != null && (vectorValue = vectorizedKeyframeSpecElementInfo3.getVectorValue()) != 0) {
                targetValue = vectorValue;
            }
            int size = v2.getSize();
            while (i < size) {
                v2.set$animation_core_release(i, (targetValue.get$animation_core_release(i) * easedTimeFromIndex) + ((1 - easedTimeFromIndex) * initialValue.get$animation_core_release(i)));
                i++;
            }
        }
        return v2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        long jClampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / AnimationKt.MillisToNanos);
        if (jClampPlayTime < 0) {
            return initialVelocity;
        }
        init(initialValue, targetValue, initialVelocity);
        V v2 = this.velocityVector;
        AbstractC5830k.m5327d(v2);
        int i = 0;
        if (this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline) {
            float easedTime = getEasedTime((int) jClampPlayTime);
            float[] fArr = this.slopeArray;
            this.arcSpline.getSlope(easedTime, fArr);
            int length = fArr.length;
            while (i < length) {
                v2.set$animation_core_release(i, fArr[i]);
                i++;
            }
        } else {
            AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, jClampPlayTime - 1, initialValue, targetValue, initialVelocity);
            AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, jClampPlayTime, initialValue, targetValue, initialVelocity);
            int size = valueFromMillis.getSize();
            while (i < size) {
                v2.set$animation_core_release(i, (valueFromMillis.get$animation_core_release(i) - valueFromMillis2.get$animation_core_release(i)) * 1000.0f);
                i++;
            }
        }
        return v2;
    }

    private VectorizedKeyframesSpec(IntList intList, IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> intObjectMap, int i, int i8, Easing easing, int i9) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i8;
        this.defaultEasing = easing;
        this.initialArcMode = i9;
        this.modes = VectorizedAnimationSpecKt.EmptyIntArray;
        this.times = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.posArray = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.slopeArray = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i, int i8, int i9, AbstractC5824e abstractC5824e) {
        this(map, i, (i9 & 4) != 0 ? 0 : i8);
    }

    public VectorizedKeyframesSpec(@NotNull Map<Integer, ? extends Pair<? extends V, ? extends Easing>> map, int i, int i8) {
        MutableIntList mutableIntList = new MutableIntList(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            mutableIntList.add(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!map.containsKey(Integer.valueOf(i))) {
            mutableIntList.add(i);
        }
        mutableIntList.sort();
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        for (Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<? extends V, ? extends Easing> value = entry.getValue();
            mutableIntObjectMap.set(iIntValue, new VectorizedKeyframeSpecElementInfo(value.getFirst(), value.getSecond(), ArcMode.INSTANCE.m6664getArcLinear9TMq4(), null));
        }
        this(mutableIntList, mutableIntObjectMap, i, i8, EasingKt.getLinearEasing(), ArcMode.INSTANCE.m6664getArcLinear9TMq4(), null);
    }
}
