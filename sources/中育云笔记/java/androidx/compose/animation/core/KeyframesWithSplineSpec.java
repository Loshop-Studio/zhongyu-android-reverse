package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import kotlin.Pair;

@Immutable
/* loaded from: classes.dex */
public final class KeyframesWithSplineSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesWithSplineSpecConfig<T> config;
    private float periodicBias;

    @StabilityInferred(parameters = 2)
    public static final class KeyframesWithSplineSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframesSpec.KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesWithSplineSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core_release(Object obj) {
            return createEntityFor$animation_core_release((KeyframesWithSplineSpecConfig<T>) obj);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core_release(T t10) {
            return new KeyframesSpec.KeyframeEntity<>(t10, null, 0, 6, null);
        }
    }

    public KeyframesWithSplineSpec(KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig) {
        this.config = keyframesWithSplineSpecConfig;
        this.periodicBias = Float.NaN;
    }

    public final KeyframesWithSplineSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i10;
        MutableIntObjectMap<KeyframesSpec.KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        MutableIntList mutableIntList = new MutableIntList(keyframes$animation_core_release.getSize() + 2);
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(keyframes$animation_core_release.getSize());
        int[] iArr3 = keyframes$animation_core_release.keys;
        Object[] objArr3 = keyframes$animation_core_release.values;
        long[] jArr = keyframes$animation_core_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            KeyframesSpec.KeyframeEntity keyframeEntity = (KeyframesSpec.KeyframeEntity) objArr3[i15];
                            mutableIntList.add(i16);
                            i10 = i12;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            mutableIntObjectMap.set(i16, new Pair(twoWayConverter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core_release()), keyframeEntity.getEasing$animation_core_release()));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!keyframes$animation_core_release.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!keyframes$animation_core_release.containsKey(this.config.getDurationMillis())) {
            mutableIntList.add(this.config.getDurationMillis());
        }
        mutableIntList.sort();
        return new VectorizedMonoSplineKeyframesSpec(mutableIntList, mutableIntObjectMap, this.config.getDurationMillis(), this.config.getDelayMillis(), this.periodicBias);
    }

    public KeyframesWithSplineSpec(KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        this(keyframesWithSplineSpecConfig);
        this.periodicBias = f10;
    }
}
