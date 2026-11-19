package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface PointerInputModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(PointerInputModifier pointerInputModifier, InterfaceC9540l interfaceC9540l) {
            return PointerInputModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(PointerInputModifier pointerInputModifier, InterfaceC9540l interfaceC9540l) {
            return PointerInputModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(PointerInputModifier pointerInputModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) PointerInputModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(PointerInputModifier pointerInputModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) PointerInputModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(PointerInputModifier pointerInputModifier, Modifier modifier) {
            return PointerInputModifier.super.then(modifier);
        }
    }

    PointerInputFilter getPointerInputFilter();
}
