package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC8721a
/* loaded from: classes2.dex */
public interface FocusEventModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusEventModifier focusEventModifier, InterfaceC10570l interfaceC10570l) {
            return FocusEventModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(FocusEventModifier focusEventModifier, InterfaceC10570l interfaceC10570l) {
            return FocusEventModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(FocusEventModifier focusEventModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) FocusEventModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(FocusEventModifier focusEventModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) FocusEventModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(FocusEventModifier focusEventModifier, Modifier modifier) {
            return FocusEventModifier.super.then(modifier);
        }
    }

    void onFocusEvent(FocusState focusState);
}
