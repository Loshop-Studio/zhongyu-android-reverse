package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.focus.FocusDirection;

/* loaded from: classes2.dex */
public final class FocusOwnerImplKt {
    private static final String Warning = "FocusRelatedWarning";

    /* renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m30542is1dFocusSearch3ESFkO8(int i10) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30522getNextdhqQ8s())) {
            return true;
        }
        return FocusDirection.m30514equalsimpl0(i10, companion.m30523getPreviousdhqQ8s());
    }
}
