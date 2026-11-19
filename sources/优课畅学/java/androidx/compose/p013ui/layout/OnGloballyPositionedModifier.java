package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface OnGloballyPositionedModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnGloballyPositionedModifier onGloballyPositionedModifier, InterfaceC10570l interfaceC10570l) {
            return OnGloballyPositionedModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(OnGloballyPositionedModifier onGloballyPositionedModifier, InterfaceC10570l interfaceC10570l) {
            return OnGloballyPositionedModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(OnGloballyPositionedModifier onGloballyPositionedModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) OnGloballyPositionedModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(OnGloballyPositionedModifier onGloballyPositionedModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) OnGloballyPositionedModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(OnGloballyPositionedModifier onGloballyPositionedModifier, Modifier modifier) {
            return OnGloballyPositionedModifier.super.then(modifier);
        }
    }

    void onGloballyPositioned(LayoutCoordinates layoutCoordinates);
}
