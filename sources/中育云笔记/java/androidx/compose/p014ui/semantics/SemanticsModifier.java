package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public interface SemanticsModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(SemanticsModifier semanticsModifier, InterfaceC9540l interfaceC9540l) {
            return SemanticsModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(SemanticsModifier semanticsModifier, InterfaceC9540l interfaceC9540l) {
            return SemanticsModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier semanticsModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) SemanticsModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier semanticsModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) SemanticsModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static int getId(SemanticsModifier semanticsModifier) {
            return SemanticsModifier.super.getId();
        }

        @InterfaceC10770a
        public static /* synthetic */ void getId$annotations() {
        }

        @Deprecated
        public static Modifier then(SemanticsModifier semanticsModifier, Modifier modifier) {
            return SemanticsModifier.super.then(modifier);
        }
    }

    default int getId() {
        return -1;
    }

    SemanticsConfiguration getSemanticsConfiguration();
}
