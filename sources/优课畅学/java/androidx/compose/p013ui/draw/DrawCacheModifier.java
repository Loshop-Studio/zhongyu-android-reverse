package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface DrawCacheModifier extends DrawModifier {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawCacheModifier drawCacheModifier, InterfaceC10570l interfaceC10570l) {
            return DrawCacheModifier.super.all(interfaceC10570l);
        }

        @Deprecated
        public static boolean any(DrawCacheModifier drawCacheModifier, InterfaceC10570l interfaceC10570l) {
            return DrawCacheModifier.super.any(interfaceC10570l);
        }

        @Deprecated
        public static <R> R foldIn(DrawCacheModifier drawCacheModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) DrawCacheModifier.super.foldIn(r10, interfaceC10574p);
        }

        @Deprecated
        public static <R> R foldOut(DrawCacheModifier drawCacheModifier, R r10, InterfaceC10574p interfaceC10574p) {
            return (R) DrawCacheModifier.super.foldOut(r10, interfaceC10574p);
        }

        @Deprecated
        public static Modifier then(DrawCacheModifier drawCacheModifier, Modifier modifier) {
            return DrawCacheModifier.super.then(modifier);
        }
    }

    void onBuildCache(BuildDrawCacheParams buildDrawCacheParams);
}
