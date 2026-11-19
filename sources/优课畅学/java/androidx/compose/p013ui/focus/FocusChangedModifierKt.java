package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class FocusChangedModifierKt {
    public static final Modifier onFocusChanged(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new FocusChangedElement(interfaceC10570l));
    }
}
