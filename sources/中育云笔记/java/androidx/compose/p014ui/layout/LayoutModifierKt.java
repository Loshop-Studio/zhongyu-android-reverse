package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, InterfaceC9545q interfaceC9545q) {
        return modifier.then(new LayoutElement(interfaceC9545q));
    }
}
