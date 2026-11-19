package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, InterfaceC10575q interfaceC10575q) {
        return modifier.then(new LayoutElement(interfaceC10575q));
    }
}
