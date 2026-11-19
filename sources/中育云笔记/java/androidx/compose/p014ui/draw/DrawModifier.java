package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface DrawModifier extends Modifier.Element {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawModifier drawModifier, InterfaceC9540l interfaceC9540l) {
            return DrawModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(DrawModifier drawModifier, InterfaceC9540l interfaceC9540l) {
            return DrawModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(DrawModifier drawModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) DrawModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(DrawModifier drawModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) DrawModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(DrawModifier drawModifier, Modifier modifier) {
            return DrawModifier.super.then(modifier);
        }
    }

    void draw(ContentDrawScope contentDrawScope);
}
