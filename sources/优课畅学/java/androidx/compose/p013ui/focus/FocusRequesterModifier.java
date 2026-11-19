package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC8721a
/* loaded from: classes2.dex */
public interface FocusRequesterModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusRequesterModifier focusRequesterModifier, InterfaceC10570l interfaceC10570l) {
            return FocusRequesterModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(FocusRequesterModifier focusRequesterModifier, InterfaceC10570l interfaceC10570l) {
            return FocusRequesterModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(FocusRequesterModifier focusRequesterModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) FocusRequesterModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(FocusRequesterModifier focusRequesterModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) FocusRequesterModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(FocusRequesterModifier focusRequesterModifier, Modifier modifier) {
            return FocusRequesterModifier.super.then(modifier);
        }
    }

    FocusRequester getFocusRequester();
}
