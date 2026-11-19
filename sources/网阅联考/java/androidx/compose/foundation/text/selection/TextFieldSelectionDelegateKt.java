package androidx.compose.foundation.text.selection;

import androidx.compose.p006ui.text.TextLayoutResult;
import androidx.compose.p006ui.text.TextRange;
import androidx.compose.p006ui.text.TextRangeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m5175d2 = {"getTextFieldSelection", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rawStartOffset", "", "rawEndOffset", "previousSelection", "isStartHandle", "", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getTextFieldSelection-bb3KNj8", "(Landroidx/compose/ui/text/TextLayoutResult;IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldSelectionDelegateKt {
    /* renamed from: getTextFieldSelection-bb3KNj8, reason: not valid java name */
    public static final long m7766getTextFieldSelectionbb3KNj8(TextLayoutResult textLayoutResult, int i4, int i5, TextRange textRange, boolean z3, SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (textLayoutResult == null) {
            return TextRangeKt.TextRange(0, 0);
        }
        long jTextRange = TextRangeKt.TextRange(i4, i5);
        return (textRange == null && Intrinsics.areEqual(adjustment, SelectionAdjustment.INSTANCE.getCharacter())) ? jTextRange : adjustment.mo7715adjustZXO7KMw(textLayoutResult, jTextRange, -1, z3, textRange);
    }
}
