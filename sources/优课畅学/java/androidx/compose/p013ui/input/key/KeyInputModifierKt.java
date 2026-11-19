package androidx.compose.p013ui.input.key;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class KeyInputModifierKt {
    public static final Modifier onKeyEvent(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new KeyInputElement(interfaceC10570l, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new KeyInputElement(null, interfaceC10570l));
    }
}
