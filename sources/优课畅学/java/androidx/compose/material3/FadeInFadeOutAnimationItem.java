package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final InterfaceC10575q transition;

    public FadeInFadeOutAnimationItem(T t10, InterfaceC10575q interfaceC10575q) {
        this.key = t10;
        this.transition = interfaceC10575q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, InterfaceC10575q interfaceC10575q, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i10 & 2) != 0) {
            interfaceC10575q = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, interfaceC10575q);
    }

    public final T component1() {
        return this.key;
    }

    public final InterfaceC10575q component2() {
        return this.transition;
    }

    public final FadeInFadeOutAnimationItem<T> copy(T t10, InterfaceC10575q interfaceC10575q) {
        return new FadeInFadeOutAnimationItem<>(t10, interfaceC10575q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return AbstractC9133u.m16128b(this.key, fadeInFadeOutAnimationItem.key) && AbstractC9133u.m16128b(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    public final InterfaceC10575q getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t10 = this.key;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
