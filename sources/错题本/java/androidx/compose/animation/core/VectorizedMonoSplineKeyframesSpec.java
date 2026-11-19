package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J/\u0010#\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b)\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020.\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010,R\u0018\u00108\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,¨\u00069"}, m5110d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/collection/IntList;", "timestamps", "Landroidx/collection/IntObjectMap;", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "", "durationMillis", "delayMillis", "", "periodicBias", "<init>", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IIF)V", "initialValue", "targetValue", "initialVelocity", "Ld6/s;", "init", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "index", "getEasing", "(I)Landroidx/compose/animation/core/Easing;", "timeMillis", "getEasedTimeFromIndex", "(II)F", "findEntryForTimeMillis", "(I)I", "", "playTimeNanos", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "Landroidx/collection/IntList;", "Landroidx/collection/IntObjectMap;", "I", "getDurationMillis", "()I", "getDelayMillis", "F", "valueVector", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "", "times", "[F", "Landroidx/compose/animation/core/MonoSpline;", "monoSpline", "Landroidx/compose/animation/core/MonoSpline;", "", "values", "[[F", "lastInitialValue", "lastTargetValue", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n1#1,190:1\n65#2:191\n65#2:192\n70#2:195\n425#3:193\n425#3:194\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n50#1:191\n67#1:192\n161#1:195\n82#1:193\n86#1:194\n*E\n"})
/* loaded from: classes.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;

    @NotNull
    private final IntObjectMap<Pair<V, Easing>> keyframes;

    @Nullable
    private V lastInitialValue;

    @Nullable
    private V lastTargetValue;

    @Nullable
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;

    @NotNull
    private final IntList timestamps;

    @Nullable
    private V valueVector;

    @Nullable
    private float[][] values;

    @Nullable
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(@NotNull IntList intList, @NotNull IntObjectMap<Pair<V, Easing>> intObjectMap, int i, int i8, float f) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i;
        this.delayMillis = i8;
        this.periodicBias = f;
    }

    private final int findEntryForTimeMillis(int timeMillis) {
        int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, timeMillis, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTimeFromIndex(int index, int timeMillis) {
        float fTransform;
        IntList intList = this.timestamps;
        if (index >= intList._size - 1) {
            fTransform = timeMillis;
        } else {
            int i = intList.get(index);
            int i8 = this.timestamps.get(index + 1);
            if (timeMillis == i) {
                fTransform = i;
            } else {
                float f = i8 - i;
                fTransform = (getEasing(index).transform((timeMillis - i) / f) * f) + i;
            }
        }
        return fTransform / 1000;
    }

    private final Easing getEasing(int index) {
        Easing second;
        Pair<V, Easing> pair = this.keyframes.get(this.timestamps.get(index));
        return (pair == null || (second = pair.getSecond()) == null) ? EasingKt.getLinearEasing() : second;
    }

    private final void init(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
            int i = this.timestamps._size;
            float[] fArr2 = new float[i];
            for (int i8 = 0; i8 < i; i8++) {
                fArr2[i8] = this.timestamps.get(i8) / 1000;
            }
            this.times = fArr2;
        }
        if (this.monoSpline != null && AbstractC5830k.m5325b(this.lastInitialValue, initialValue) && AbstractC5830k.m5325b(this.lastTargetValue, targetValue)) {
            return;
        }
        boolean zM5325b = AbstractC5830k.m5325b(this.lastInitialValue, initialValue);
        boolean zM5325b2 = AbstractC5830k.m5325b(this.lastTargetValue, targetValue);
        this.lastInitialValue = initialValue;
        this.lastTargetValue = targetValue;
        int size = initialValue.getSize();
        float[][] fArr3 = this.values;
        if (fArr3 == null) {
            int i9 = this.timestamps._size;
            fArr3 = new float[i9][];
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = this.timestamps.get(i10);
                Pair<V, Easing> pair = this.keyframes.get(i11);
                if (i11 == 0 && pair == null) {
                    fArr = new float[size];
                    for (int i12 = 0; i12 < size; i12++) {
                        fArr[i12] = initialValue.get$animation_core_release(i12);
                    }
                } else if (i11 == getDurationMillis() && pair == null) {
                    fArr = new float[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        fArr[i13] = targetValue.get$animation_core_release(i13);
                    }
                } else {
                    AbstractC5830k.m5327d(pair);
                    V first = pair.getFirst();
                    float[] fArr4 = new float[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        fArr4[i14] = first.get$animation_core_release(i14);
                    }
                    fArr = fArr4;
                }
                fArr3[i10] = fArr;
            }
            this.values = fArr3;
        } else {
            if (!zM5325b && !this.keyframes.containsKey(0)) {
                int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, 0, 0, 0, 6, null);
                float[] fArr5 = new float[size];
                for (int i15 = 0; i15 < size; i15++) {
                    fArr5[i15] = initialValue.get$animation_core_release(i15);
                }
                fArr3[iBinarySearch$default] = fArr5;
            }
            if (!zM5325b2 && !this.keyframes.containsKey(getDurationMillis())) {
                int iBinarySearch$default2 = IntList.binarySearch$default(this.timestamps, getDurationMillis(), 0, 0, 6, null);
                float[] fArr6 = new float[size];
                for (int i16 = 0; i16 < size; i16++) {
                    fArr6[i16] = targetValue.get$animation_core_release(i16);
                }
                fArr3[iBinarySearch$default2] = fArr6;
            }
        }
        float[] fArr7 = this.times;
        if (fArr7 == null) {
            AbstractC5830k.m5339p("times");
            throw null;
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
    @NotNull
    public V getValueFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / AnimationKt.MillisToNanos);
        Pair<V, Easing> pair = this.keyframes.get(iClampPlayTime);
        if (pair != null) {
            return pair.getFirst();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (iClampPlayTime <= 0) {
            return initialValue;
        }
        init(initialValue, targetValue, initialVelocity);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        V v2 = this.valueVector;
        AbstractC5830k.m5327d(v2);
        MonoSpline monoSpline = this.monoSpline;
        AbstractC5830k.m5327d(monoSpline);
        monoSpline.getPos(getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime), v2, iFindEntryForTimeMillis);
        return v2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / AnimationKt.MillisToNanos);
        init(initialValue, targetValue, initialVelocity);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        V v2 = this.velocityVector;
        AbstractC5830k.m5327d(v2);
        MonoSpline monoSpline = this.monoSpline;
        AbstractC5830k.m5327d(monoSpline);
        monoSpline.getSlope(getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime), v2, iFindEntryForTimeMillis);
        return v2;
    }
}
