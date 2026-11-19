package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface OnRemeasuredModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnRemeasuredModifier onRemeasuredModifier, InterfaceC9540l interfaceC9540l) {
            return OnRemeasuredModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(OnRemeasuredModifier onRemeasuredModifier, InterfaceC9540l interfaceC9540l) {
            return OnRemeasuredModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(OnRemeasuredModifier onRemeasuredModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) OnRemeasuredModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(OnRemeasuredModifier onRemeasuredModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) OnRemeasuredModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(OnRemeasuredModifier onRemeasuredModifier, Modifier modifier) {
            return OnRemeasuredModifier.super.then(modifier);
        }
    }

    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    void m32283onRemeasuredozmzZPI(long j10);
}
