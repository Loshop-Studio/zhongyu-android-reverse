package androidx.compose.p009ui.focus;

import androidx.compose.p009ui.focus.FocusDirection;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, m7880d2 = {"Warning", "", "is1dFocusSearch", "", "Landroidx/compose/ui/focus/FocusDirection;", "is1dFocusSearch-3ESFkO8", "(I)Z", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class FocusOwnerImplKt {
    private static final String Warning = "FocusRelatedWarning";

    /* renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m13566is1dFocusSearch3ESFkO8(int i6) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m13542equalsimpl0(i6, companion.m13550getNextdhqQ8s())) {
            return true;
        }
        return FocusDirection.m13542equalsimpl0(i6, companion.m13551getPreviousdhqQ8s());
    }
}
