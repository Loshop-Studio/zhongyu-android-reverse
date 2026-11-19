package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes2.dex */
public interface FocusOrderModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusOrderModifier focusOrderModifier, InterfaceC9540l interfaceC9540l) {
            return FocusOrderModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(FocusOrderModifier focusOrderModifier, InterfaceC9540l interfaceC9540l) {
            return FocusOrderModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(FocusOrderModifier focusOrderModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) FocusOrderModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(FocusOrderModifier focusOrderModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) FocusOrderModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(FocusOrderModifier focusOrderModifier, Modifier modifier) {
            return FocusOrderModifier.super.then(modifier);
        }
    }

    void populateFocusOrder(FocusOrder focusOrder);
}
