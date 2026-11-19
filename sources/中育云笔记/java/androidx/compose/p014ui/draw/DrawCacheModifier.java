package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface DrawCacheModifier extends DrawModifier {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawCacheModifier drawCacheModifier, InterfaceC9540l interfaceC9540l) {
            return DrawCacheModifier.super.all(interfaceC9540l);
        }

        @Deprecated
        public static boolean any(DrawCacheModifier drawCacheModifier, InterfaceC9540l interfaceC9540l) {
            return DrawCacheModifier.super.any(interfaceC9540l);
        }

        @Deprecated
        public static <R> R foldIn(DrawCacheModifier drawCacheModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) DrawCacheModifier.super.foldIn(r10, interfaceC9544p);
        }

        @Deprecated
        public static <R> R foldOut(DrawCacheModifier drawCacheModifier, R r10, InterfaceC9544p interfaceC9544p) {
            return (R) DrawCacheModifier.super.foldOut(r10, interfaceC9544p);
        }

        @Deprecated
        public static Modifier then(DrawCacheModifier drawCacheModifier, Modifier modifier) {
            return DrawCacheModifier.super.then(modifier);
        }
    }

    void onBuildCache(BuildDrawCacheParams buildDrawCacheParams);
}
