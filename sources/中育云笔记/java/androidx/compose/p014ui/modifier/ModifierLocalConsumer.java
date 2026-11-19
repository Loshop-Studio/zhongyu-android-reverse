package androidx.compose.p014ui.modifier;

import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

@Stable
/* loaded from: classes2.dex */
public interface ModifierLocalConsumer extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ModifierLocalConsumer modifierLocalConsumer, InterfaceC9540l interfaceC9540l) {
            return ModifierLocalConsumer.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(ModifierLocalConsumer modifierLocalConsumer, InterfaceC9540l interfaceC9540l) {
            return ModifierLocalConsumer.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(ModifierLocalConsumer modifierLocalConsumer, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) ModifierLocalConsumer.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(ModifierLocalConsumer modifierLocalConsumer, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) ModifierLocalConsumer.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(ModifierLocalConsumer modifierLocalConsumer, Modifier modifier) {
            return ModifierLocalConsumer.super.then(modifier);
        }
    }

    void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope);
}
