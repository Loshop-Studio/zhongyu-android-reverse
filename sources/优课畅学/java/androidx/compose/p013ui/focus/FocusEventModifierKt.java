package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class FocusEventModifierKt {
    public static final Modifier onFocusEvent(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new FocusEventElement(interfaceC10570l));
    }
}
