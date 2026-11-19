package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class OnPlacedModifierKt {
    @Stable
    public static final Modifier onPlaced(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new OnPlacedElement(interfaceC9540l));
    }
}
