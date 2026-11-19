package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface DrawModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawModifier drawModifier, InterfaceC10570l interfaceC10570l) {
            return DrawModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(DrawModifier drawModifier, InterfaceC10570l interfaceC10570l) {
            return DrawModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(DrawModifier drawModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) DrawModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(DrawModifier drawModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) DrawModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(DrawModifier drawModifier, Modifier modifier) {
            return DrawModifier.super.then(modifier);
        }
    }

    void draw(ContentDrawScope contentDrawScope);
}
