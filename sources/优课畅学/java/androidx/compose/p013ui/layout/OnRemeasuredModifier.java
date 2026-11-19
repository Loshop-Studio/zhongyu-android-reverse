package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface OnRemeasuredModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnRemeasuredModifier onRemeasuredModifier, InterfaceC10570l interfaceC10570l) {
            return OnRemeasuredModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(OnRemeasuredModifier onRemeasuredModifier, InterfaceC10570l interfaceC10570l) {
            return OnRemeasuredModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(OnRemeasuredModifier onRemeasuredModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) OnRemeasuredModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(OnRemeasuredModifier onRemeasuredModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) OnRemeasuredModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(OnRemeasuredModifier onRemeasuredModifier, Modifier modifier) {
            return OnRemeasuredModifier.super.then(modifier);
        }
    }

    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    void m25681onRemeasuredozmzZPI(long j10);
}
