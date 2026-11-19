package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class DrawModifierKt {
    public static final CacheDrawModifierNode CacheDrawModifierNode(InterfaceC10570l interfaceC10570l) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), interfaceC10570l);
    }

    public static final Modifier drawBehind(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new DrawBehindElement(interfaceC10570l));
    }

    public static final Modifier drawWithCache(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new DrawWithCacheElement(interfaceC10570l));
    }

    public static final Modifier drawWithContent(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new DrawWithContentElement(interfaceC10570l));
    }
}
