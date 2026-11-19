package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.camera.video.AudioStats;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {
    public static final int $stable = 8;
    private int delayMillis;
    private int durationMillis;
    private final MutableIntObjectMap<E> keyframes;

    public /* synthetic */ KeyframesSpecBaseConfig(AbstractC9972n abstractC9972n) {
        this();
    }

    /* renamed from: at */
    public E mo900at(T t10, @IntRange(from = 0) int i10) {
        E e10 = (E) createEntityFor$animation_core_release(t10);
        this.keyframes.set(i10, e10);
        return e10;
    }

    public E atFraction(T t10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return (E) mo900at(t10, Math.round(this.durationMillis * f10));
    }

    public abstract E createEntityFor$animation_core_release(T t10);

    @IntRange(from = 0)
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    @IntRange(from = 0)
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final MutableIntObjectMap<E> getKeyframes$animation_core_release() {
        return this.keyframes;
    }

    public final void setDelayMillis(@IntRange(from = 0) int i10) {
        this.delayMillis = i10;
    }

    public final void setDurationMillis(@IntRange(from = 0) int i10) {
        this.durationMillis = i10;
    }

    public final E using(E e10, Easing easing) {
        e10.setEasing$animation_core_release(easing);
        return e10;
    }

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        this.keyframes = IntObjectMapKt.mutableIntObjectMapOf();
    }
}
