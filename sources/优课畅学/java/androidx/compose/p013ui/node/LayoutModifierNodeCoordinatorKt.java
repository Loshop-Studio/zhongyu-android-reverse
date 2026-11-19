package androidx.compose.p013ui.node;

import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.HorizontalAlignmentLine;
import androidx.compose.p013ui.unit.IntOffset;

/* loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (!(child != null)) {
            InlineClassHelperKt.throwIllegalStateException("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i10 = child.get(alignmentLine);
        if (i10 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        child.setShallowPlacing$ui_release(true);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(true);
        lookaheadCapablePlaceable.replace$ui_release();
        child.setShallowPlacing$ui_release(false);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(false);
        return i10 + (alignmentLine instanceof HorizontalAlignmentLine ? IntOffset.m27028getYimpl(child.mo25829getPositionnOccac()) : IntOffset.m27027getXimpl(child.mo25829getPositionnOccac()));
    }
}
