package androidx.compose.p013ui.modifier;

import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Stable;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Stable
/* loaded from: classes2.dex */
public interface ModifierLocalConsumer extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ModifierLocalConsumer modifierLocalConsumer, InterfaceC10570l interfaceC10570l) {
            return ModifierLocalConsumer.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(ModifierLocalConsumer modifierLocalConsumer, InterfaceC10570l interfaceC10570l) {
            return ModifierLocalConsumer.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(ModifierLocalConsumer modifierLocalConsumer, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) ModifierLocalConsumer.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(ModifierLocalConsumer modifierLocalConsumer, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) ModifierLocalConsumer.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(ModifierLocalConsumer modifierLocalConsumer, Modifier modifier) {
            return ModifierLocalConsumer.super.then(modifier);
        }
    }

    void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope);
}
