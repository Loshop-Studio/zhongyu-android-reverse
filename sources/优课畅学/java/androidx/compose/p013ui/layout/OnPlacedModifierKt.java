package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Stable;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class OnPlacedModifierKt {
    @Stable
    public static final Modifier onPlaced(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new OnPlacedElement(interfaceC10570l));
    }
}
