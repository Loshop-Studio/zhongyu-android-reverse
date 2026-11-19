package androidx.compose.p013ui.input.key;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class SoftwareKeyboardInterceptionModifierKt {
    public static final Modifier onInterceptKeyBeforeSoftKeyboard(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new SoftKeyboardInterceptionElement(interfaceC10570l, null));
    }

    public static final Modifier onPreInterceptKeyBeforeSoftKeyboard(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new SoftKeyboardInterceptionElement(null, interfaceC10570l));
    }
}
