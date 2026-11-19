package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final InterfaceC9545q transition;

    public FadeInFadeOutAnimationItem(T t10, InterfaceC9545q interfaceC9545q) {
        this.key = t10;
        this.transition = interfaceC9545q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, InterfaceC9545q interfaceC9545q, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i10 & 2) != 0) {
            interfaceC9545q = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, interfaceC9545q);
    }

    public final T component1() {
        return this.key;
    }

    public final InterfaceC9545q component2() {
        return this.transition;
    }

    public final FadeInFadeOutAnimationItem<T> copy(T t10, InterfaceC9545q interfaceC9545q) {
        return new FadeInFadeOutAnimationItem<>(t10, interfaceC9545q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return AbstractC9979u.m20289b(this.key, fadeInFadeOutAnimationItem.key) && AbstractC9979u.m20289b(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    public final InterfaceC9545q getTransition() {
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
