package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusTargetNode;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public final class FocusModifierKt {
    @InterfaceC8721a
    public static final Modifier focusModifier(Modifier modifier) {
        return focusTarget(modifier);
    }

    public static final Modifier focusTarget(Modifier modifier) {
        return modifier.then(FocusTargetNode.FocusTargetElement.INSTANCE);
    }
}
