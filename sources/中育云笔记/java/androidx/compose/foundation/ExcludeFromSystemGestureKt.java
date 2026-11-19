package androidx.compose.foundation;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureKt {
    @InterfaceC10770a
    public static final Modifier excludeFromSystemGesture(Modifier modifier) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    @InterfaceC10770a
    public static final Modifier excludeFromSystemGesture(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, interfaceC9540l);
    }
}
