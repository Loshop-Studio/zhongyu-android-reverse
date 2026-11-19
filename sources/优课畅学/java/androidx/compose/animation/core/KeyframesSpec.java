package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.camera.video.AudioStats;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

@Immutable
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesSpecConfig<T> config;

    @StabilityInferred(parameters = 0)
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public static final int $stable = 8;
        private int arcMode;

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i10, AbstractC9126n abstractC9126n) {
            this(obj, easing, i10);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyframeEntity)) {
                return false;
            }
            KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
            return AbstractC9133u.m16128b(keyframeEntity.getValue$animation_core_release(), getValue$animation_core_release()) && AbstractC9133u.m16128b(keyframeEntity.getEasing$animation_core_release(), getEasing$animation_core_release()) && ArcMode.m20252equalsimpl0(keyframeEntity.arcMode, this.arcMode);
        }

        /* renamed from: getArcMode--9T-Mq4$animation_core_release, reason: not valid java name */
        public final int m20261getArcMode9TMq4$animation_core_release() {
            return this.arcMode;
        }

        public int hashCode() {
            T value$animation_core_release = getValue$animation_core_release();
            return ((((value$animation_core_release != null ? value$animation_core_release.hashCode() : 0) * 31) + ArcMode.m20253hashCodeimpl(this.arcMode)) * 31) + getEasing$animation_core_release().hashCode();
        }

        /* renamed from: setArcMode-Rur9ykg$animation_core_release, reason: not valid java name */
        public final void m20262setArcModeRur9ykg$animation_core_release(int i10) {
            this.arcMode = i10;
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i10, int i11, AbstractC9126n abstractC9126n) {
            this(obj, (i11 & 2) != 0 ? EasingKt.getLinearEasing() : easing, (i11 & 4) != 0 ? ArcMode.Companion.m20258getArcLinear9TMq4() : i10, null);
        }

        private KeyframeEntity(T t10, Easing easing, int i10) {
            super(t10, easing, null);
            this.arcMode = i10;
        }
    }

    @StabilityInferred(parameters = 2)
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        /* renamed from: at */
        public /* bridge */ /* synthetic */ KeyframeBaseEntity mo823at(Object obj, int i10) {
            return mo823at((KeyframesSpecConfig<T>) obj, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity atFraction(Object obj, float f10) {
            return atFraction((KeyframesSpecConfig<T>) obj, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core_release(Object obj) {
            return createEntityFor$animation_core_release((KeyframesSpecConfig<T>) obj);
        }

        /* renamed from: using-ngzHuyU, reason: not valid java name */
        public final KeyframeEntity<T> m20263usingngzHuyU(KeyframeEntity<T> keyframeEntity, int i10) {
            keyframeEntity.m20262setArcModeRur9ykg$animation_core_release(i10);
            return keyframeEntity;
        }

        @InterfaceC8721a
        public final void with(KeyframeEntity<T> keyframeEntity, Easing easing) {
            keyframeEntity.setEasing$animation_core_release(easing);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        /* renamed from: at */
        public KeyframeEntity<T> mo823at(T t10, @IntRange(from = 0) int i10) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t10, null, 0, 6, null);
            getKeyframes$animation_core_release().set(i10, keyframeEntity);
            return keyframeEntity;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> atFraction(T t10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10) {
            return mo823at((KeyframesSpecConfig<T>) t10, Math.round(getDurationMillis() * f10));
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> createEntityFor$animation_core_release(T t10) {
            return new KeyframeEntity<>(t10, null, 0, 6, null);
        }
    }

    public KeyframesSpec(KeyframesSpecConfig<T> keyframesSpecConfig) {
        this.config = keyframesSpecConfig;
    }

    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i10;
        MutableIntList mutableIntList = new MutableIntList(this.config.getKeyframes$animation_core_release().getSize() + 2);
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(this.config.getKeyframes$animation_core_release().getSize());
        MutableIntObjectMap<KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        int[] iArr3 = keyframes$animation_core_release.keys;
        Object[] objArr = keyframes$animation_core_release.values;
        long[] jArr3 = keyframes$animation_core_release.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            KeyframeEntity keyframeEntity = (KeyframeEntity) objArr[i15];
                            mutableIntList.add(i16);
                            i10 = i12;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            mutableIntObjectMap.set(i16, new VectorizedKeyframeSpecElementInfo((AnimationVector) twoWayConverter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core_release()), keyframeEntity.getEasing$animation_core_release(), keyframeEntity.m20261getArcMode9TMq4$animation_core_release(), null));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.config.getKeyframes$animation_core_release().containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!this.config.getKeyframes$animation_core_release().containsKey(this.config.getDurationMillis())) {
            mutableIntList.add(this.config.getDurationMillis());
        }
        mutableIntList.sort();
        return new VectorizedKeyframesSpec<>(mutableIntList, mutableIntObjectMap, this.config.getDurationMillis(), this.config.getDelayMillis(), EasingKt.getLinearEasing(), ArcMode.Companion.m20258getArcLinear9TMq4(), null);
    }
}
