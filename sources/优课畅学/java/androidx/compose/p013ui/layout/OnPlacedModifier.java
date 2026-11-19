package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface OnPlacedModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnPlacedModifier onPlacedModifier, InterfaceC10570l interfaceC10570l) {
            return OnPlacedModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(OnPlacedModifier onPlacedModifier, InterfaceC10570l interfaceC10570l) {
            return OnPlacedModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(OnPlacedModifier onPlacedModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) OnPlacedModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(OnPlacedModifier onPlacedModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) OnPlacedModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(OnPlacedModifier onPlacedModifier, Modifier modifier) {
            return OnPlacedModifier.super.then(modifier);
        }
    }

    void onPlaced(LayoutCoordinates layoutCoordinates);
}
