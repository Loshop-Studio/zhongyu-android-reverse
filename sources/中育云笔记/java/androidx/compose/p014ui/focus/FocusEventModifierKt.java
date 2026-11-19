package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class FocusEventModifierKt {
    public static final Modifier onFocusEvent(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new FocusEventElement(interfaceC9540l));
    }
}
