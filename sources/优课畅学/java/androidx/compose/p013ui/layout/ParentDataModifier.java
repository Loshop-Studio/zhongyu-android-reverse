package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.unit.Density;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface ParentDataModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier parentDataModifier, InterfaceC10570l interfaceC10570l) {
            return ParentDataModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(ParentDataModifier parentDataModifier, InterfaceC10570l interfaceC10570l) {
            return ParentDataModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier parentDataModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) ParentDataModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(ParentDataModifier parentDataModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) ParentDataModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(ParentDataModifier parentDataModifier, Modifier modifier) {
            return ParentDataModifier.super.then(modifier);
        }
    }

    Object modifyParentData(Density density, Object obj);
}
