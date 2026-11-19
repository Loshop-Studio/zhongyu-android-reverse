package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface OnPlacedModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnPlacedModifier onPlacedModifier, InterfaceC9540l interfaceC9540l) {
            return OnPlacedModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(OnPlacedModifier onPlacedModifier, InterfaceC9540l interfaceC9540l) {
            return OnPlacedModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(OnPlacedModifier onPlacedModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) OnPlacedModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(OnPlacedModifier onPlacedModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) OnPlacedModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(OnPlacedModifier onPlacedModifier, Modifier modifier) {
            return OnPlacedModifier.super.then(modifier);
        }
    }

    void onPlaced(LayoutCoordinates layoutCoordinates);
}
