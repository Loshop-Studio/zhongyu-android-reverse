package androidx.compose.p014ui.input.rotary;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class RotaryInputModifierKt {
    public static final Modifier onPreRotaryScrollEvent(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new RotaryInputElement(null, interfaceC9540l));
    }

    public static final Modifier onRotaryScrollEvent(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new RotaryInputElement(interfaceC9540l, null));
    }
}
