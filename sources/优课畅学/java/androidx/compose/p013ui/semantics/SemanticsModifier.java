package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.Modifier;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface SemanticsModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(SemanticsModifier semanticsModifier, InterfaceC10570l interfaceC10570l) {
            return SemanticsModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(SemanticsModifier semanticsModifier, InterfaceC10570l interfaceC10570l) {
            return SemanticsModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier semanticsModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) SemanticsModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier semanticsModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) SemanticsModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static int getId(SemanticsModifier semanticsModifier) {
            return SemanticsModifier.super.getId();
        }

        @InterfaceC8721a
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
