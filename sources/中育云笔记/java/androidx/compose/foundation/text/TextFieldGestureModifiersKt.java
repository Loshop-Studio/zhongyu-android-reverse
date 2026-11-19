package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusChangedModifierKt;
import androidx.compose.p014ui.focus.FocusRequester;
import androidx.compose.p014ui.focus.FocusRequesterModifierKt;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class TextFieldGestureModifiersKt {
    public static final Modifier textFieldFocusModifier(Modifier modifier, boolean z10, FocusRequester focusRequester, MutableInteractionSource mutableInteractionSource, InterfaceC9540l interfaceC9540l) {
        return FocusableKt.focusable(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), interfaceC9540l), z10, mutableInteractionSource);
    }
}
