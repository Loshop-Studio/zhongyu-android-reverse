package androidx.compose.p013ui.node;

import androidx.compose.p013ui.internal.InlineClassHelperKt;

/* loaded from: classes2.dex */
public final class LookaheadDelegateKt {
    private static final int MaxLayoutDimension = 16777215;
    private static final int MaxLayoutMask = -16777216;

    public static final void checkMeasuredSize(int i10, int i11) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
    }
}
