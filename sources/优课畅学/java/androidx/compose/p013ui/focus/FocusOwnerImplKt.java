package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.focus.FocusDirection;

/* loaded from: classes2.dex */
public final class FocusOwnerImplKt {
    private static final String Warning = "FocusRelatedWarning";

    /* renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m23940is1dFocusSearch3ESFkO8(int i10) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23920getNextdhqQ8s())) {
            return true;
        }
        return FocusDirection.m23912equalsimpl0(i10, companion.m23921getPreviousdhqQ8s());
    }
}
