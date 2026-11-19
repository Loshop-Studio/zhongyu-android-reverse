package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.unit.Density;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface ParentDataModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier parentDataModifier, InterfaceC9540l interfaceC9540l) {
            return ParentDataModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(ParentDataModifier parentDataModifier, InterfaceC9540l interfaceC9540l) {
            return ParentDataModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier parentDataModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) ParentDataModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(ParentDataModifier parentDataModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) ParentDataModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(ParentDataModifier parentDataModifier, Modifier modifier) {
            return ParentDataModifier.super.then(modifier);
        }
    }

    Object modifyParentData(Density density, Object obj);
}
