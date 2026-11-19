package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes2.dex */
public interface FocusEventModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusEventModifier focusEventModifier, InterfaceC9540l interfaceC9540l) {
            return FocusEventModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(FocusEventModifier focusEventModifier, InterfaceC9540l interfaceC9540l) {
            return FocusEventModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(FocusEventModifier focusEventModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) FocusEventModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(FocusEventModifier focusEventModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) FocusEventModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(FocusEventModifier focusEventModifier, Modifier modifier) {
            return FocusEventModifier.super.then(modifier);
        }
    }

    void onFocusEvent(FocusState focusState);
}
