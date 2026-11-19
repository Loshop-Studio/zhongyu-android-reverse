package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusChangedModifierKt;
import androidx.compose.p013ui.focus.FocusRequester;
import androidx.compose.p013ui.focus.FocusRequesterModifierKt;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class TextFieldGestureModifiersKt {
    public static final Modifier textFieldFocusModifier(Modifier modifier, boolean z10, FocusRequester focusRequester, MutableInteractionSource mutableInteractionSource, InterfaceC10570l interfaceC10570l) {
        return FocusableKt.focusable(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), interfaceC10570l), z10, mutableInteractionSource);
    }
}
