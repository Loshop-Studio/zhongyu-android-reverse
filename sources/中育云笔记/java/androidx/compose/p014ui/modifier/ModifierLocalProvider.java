package androidx.compose.p014ui.modifier;

import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

@Stable
/* loaded from: classes2.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(ModifierLocalProvider<T> modifierLocalProvider, InterfaceC9540l interfaceC9540l) {
            return ModifierLocalProvider.super.all(interfaceC9540l);
        }

        @Deprecated
        public static <T> boolean any(ModifierLocalProvider<T> modifierLocalProvider, InterfaceC9540l interfaceC9540l) {
            return ModifierLocalProvider.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <T, R> R foldIn(ModifierLocalProvider<T> modifierLocalProvider, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) ModifierLocalProvider.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <T, R> R foldOut(ModifierLocalProvider<T> modifierLocalProvider, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) ModifierLocalProvider.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static <T> Modifier then(ModifierLocalProvider<T> modifierLocalProvider, Modifier modifier) {
            return ModifierLocalProvider.super.then(modifier);
        }
    }

    ProvidableModifierLocal<T> getKey();

    T getValue();
}
