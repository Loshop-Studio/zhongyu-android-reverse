package androidx.compose.foundation;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class FocusedBoundsKt {
    public static final Modifier onFocusedBoundsChanged(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new FocusedBoundsObserverElement(interfaceC9540l));
    }
}
