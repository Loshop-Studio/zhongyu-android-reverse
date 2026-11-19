package androidx.compose.p014ui.input.key;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class KeyInputModifierKt {
    public static final Modifier onKeyEvent(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new KeyInputElement(interfaceC9540l, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new KeyInputElement(null, interfaceC9540l));
    }
}
