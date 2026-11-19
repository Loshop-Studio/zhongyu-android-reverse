package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.AbstractC8726f;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {
    public static final int $stable = 8;
    private Easing easing;
    private final T value;

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, AbstractC9126n abstractC9126n) {
        this(obj, easing);
    }

    public final Easing getEasing$animation_core_release() {
        return this.easing;
    }

    public final T getValue$animation_core_release() {
        return this.value;
    }

    public final void setEasing$animation_core_release(Easing easing) {
        this.easing = easing;
    }

    public final <V extends AnimationVector> Pair<V, Easing> toPair$animation_core_release(InterfaceC10570l interfaceC10570l) {
        return AbstractC8726f.m14230a(interfaceC10570l.invoke(this.value), this.easing);
    }

    private KeyframeBaseEntity(T t10, Easing easing) {
        this.value = t10;
        this.easing = easing;
    }
}
