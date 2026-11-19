package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class DrawModifierKt {
    public static final CacheDrawModifierNode CacheDrawModifierNode(InterfaceC9540l interfaceC9540l) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), interfaceC9540l);
    }

    public static final Modifier drawBehind(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new DrawBehindElement(interfaceC9540l));
    }

    public static final Modifier drawWithCache(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new DrawWithCacheElement(interfaceC9540l));
    }

    public static final Modifier drawWithContent(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new DrawWithContentElement(interfaceC9540l));
    }
}
