package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes2.dex */
public interface FocusRequesterModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusRequesterModifier focusRequesterModifier, InterfaceC9540l interfaceC9540l) {
            return FocusRequesterModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(FocusRequesterModifier focusRequesterModifier, InterfaceC9540l interfaceC9540l) {
            return FocusRequesterModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(FocusRequesterModifier focusRequesterModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) FocusRequesterModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(FocusRequesterModifier focusRequesterModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) FocusRequesterModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(FocusRequesterModifier focusRequesterModifier, Modifier modifier) {
            return FocusRequesterModifier.super.then(modifier);
        }
    }

    FocusRequester getFocusRequester();
}
