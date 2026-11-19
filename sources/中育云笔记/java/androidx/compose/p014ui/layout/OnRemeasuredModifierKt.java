package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class OnRemeasuredModifierKt {
    @Stable
    public static final Modifier onSizeChanged(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new OnSizeChangedModifier(interfaceC9540l));
    }
}
