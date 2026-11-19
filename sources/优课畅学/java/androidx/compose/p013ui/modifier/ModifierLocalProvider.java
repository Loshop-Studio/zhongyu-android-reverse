package androidx.compose.p013ui.modifier;

import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Stable;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Stable
/* loaded from: classes2.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(ModifierLocalProvider<T> modifierLocalProvider, InterfaceC10570l interfaceC10570l) {
            return ModifierLocalProvider.super.all(interfaceC10570l);
        }

        @Deprecated
        public static <T> boolean any(ModifierLocalProvider<T> modifierLocalProvider, InterfaceC10570l interfaceC10570l) {
            return ModifierLocalProvider.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <T, R> R foldIn(ModifierLocalProvider<T> modifierLocalProvider, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) ModifierLocalProvider.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <T, R> R foldOut(ModifierLocalProvider<T> modifierLocalProvider, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) ModifierLocalProvider.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static <T> Modifier then(ModifierLocalProvider<T> modifierLocalProvider, Modifier modifier) {
            return ModifierLocalProvider.super.then(modifier);
        }
    }

    ProvidableModifierLocal<T> getKey();

    T getValue();
}
