package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface PointerInputModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(PointerInputModifier pointerInputModifier, InterfaceC10570l interfaceC10570l) {
            return PointerInputModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(PointerInputModifier pointerInputModifier, InterfaceC10570l interfaceC10570l) {
            return PointerInputModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(PointerInputModifier pointerInputModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) PointerInputModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(PointerInputModifier pointerInputModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) PointerInputModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(PointerInputModifier pointerInputModifier, Modifier modifier) {
            return PointerInputModifier.super.then(modifier);
        }
    }

    PointerInputFilter getPointerInputFilter();
}
