package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;

/* loaded from: classes2.dex */
public final class FocusRequesterModifierKt {
    public static final Modifier focusRequester(Modifier modifier, FocusRequester focusRequester) {
        return modifier.then(new FocusRequesterElement(focusRequester));
    }
}
