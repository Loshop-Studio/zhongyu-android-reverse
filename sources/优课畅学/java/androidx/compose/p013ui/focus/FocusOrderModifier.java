package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC8721a
/* loaded from: classes2.dex */
public interface FocusOrderModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusOrderModifier focusOrderModifier, InterfaceC10570l interfaceC10570l) {
            return FocusOrderModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(FocusOrderModifier focusOrderModifier, InterfaceC10570l interfaceC10570l) {
            return FocusOrderModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(FocusOrderModifier focusOrderModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) FocusOrderModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(FocusOrderModifier focusOrderModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) FocusOrderModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(FocusOrderModifier focusOrderModifier, Modifier modifier) {
            return FocusOrderModifier.super.then(modifier);
        }
    }

    void populateFocusOrder(FocusOrder focusOrder);
}
