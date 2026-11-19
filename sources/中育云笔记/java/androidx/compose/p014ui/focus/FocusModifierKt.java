package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusTargetNode;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class FocusModifierKt {
    @InterfaceC10770a
    public static final Modifier focusModifier(Modifier modifier) {
        return focusTarget(modifier);
    }

    public static final Modifier focusTarget(Modifier modifier) {
        return modifier.then(FocusTargetNode.FocusTargetElement.INSTANCE);
    }
}
