package androidx.compose.p014ui.input.key;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class SoftwareKeyboardInterceptionModifierKt {
    public static final Modifier onInterceptKeyBeforeSoftKeyboard(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new SoftKeyboardInterceptionElement(interfaceC9540l, null));
    }

    public static final Modifier onPreInterceptKeyBeforeSoftKeyboard(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new SoftKeyboardInterceptionElement(null, interfaceC9540l));
    }
}
