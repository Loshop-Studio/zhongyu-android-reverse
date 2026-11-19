package androidx.compose.p013ui.input.rotary;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class RotaryInputModifierKt {
    public static final Modifier onPreRotaryScrollEvent(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new RotaryInputElement(null, interfaceC10570l));
    }

    public static final Modifier onRotaryScrollEvent(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new RotaryInputElement(interfaceC10570l, null));
    }
}
