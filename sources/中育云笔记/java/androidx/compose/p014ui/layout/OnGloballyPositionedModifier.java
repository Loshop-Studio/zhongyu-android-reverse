package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface OnGloballyPositionedModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnGloballyPositionedModifier onGloballyPositionedModifier, InterfaceC9540l interfaceC9540l) {
            return OnGloballyPositionedModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(OnGloballyPositionedModifier onGloballyPositionedModifier, InterfaceC9540l interfaceC9540l) {
            return OnGloballyPositionedModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(OnGloballyPositionedModifier onGloballyPositionedModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) OnGloballyPositionedModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(OnGloballyPositionedModifier onGloballyPositionedModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) OnGloballyPositionedModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(OnGloballyPositionedModifier onGloballyPositionedModifier, Modifier modifier) {
            return OnGloballyPositionedModifier.super.then(modifier);
        }
    }

    void onGloballyPositioned(LayoutCoordinates layoutCoordinates);
}
