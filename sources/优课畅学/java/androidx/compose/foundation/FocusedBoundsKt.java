package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class FocusedBoundsKt {
    public static final Modifier onFocusedBoundsChanged(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new FocusedBoundsObserverElement(interfaceC10570l));
    }
}
