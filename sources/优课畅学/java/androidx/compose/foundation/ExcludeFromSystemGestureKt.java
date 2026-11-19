package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureKt {
    @InterfaceC8721a
    public static final Modifier excludeFromSystemGesture(Modifier modifier) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    @InterfaceC8721a
    public static final Modifier excludeFromSystemGesture(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, interfaceC10570l);
    }
}
