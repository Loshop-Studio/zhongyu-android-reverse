package androidx.compose.foundation.text.selection;

import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13412d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001a$\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¨\u0006\f"}, m13413d2 = {"getSelectionHandleCoordinates", "Landroidx/compose/ui/geometry/Offset;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", TypedValues.CycleType.S_WAVE_OFFSET, "", "isStart", "", "areHandlesCrossed", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "getHorizontalPosition", "", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,69:1\n54#2:70\n59#2:72\n85#3:71\n90#3:73\n53#3,3:75\n30#4:74\n*S KotlinDebug\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n*L\n47#1:70\n49#1:72\n47#1:71\n49#1:73\n50#1:75,3\n50#1:74\n*E\n"})
/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i9, boolean z9, boolean z10) {
        return textLayoutResult.getHorizontalPosition(i9, textLayoutResult.getBidiRunDirection(((!z9 || z10) && (z9 || !z10)) ? Math.max(i9 + (-1), 0) : i9) == textLayoutResult.getParagraphDirection(i9));
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i9, boolean z9, boolean z10) {
        int lineForOffset = textLayoutResult.getLineForOffset(i9);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Offset.INSTANCE.m21183getUnspecifiedF1C5BW0();
        }
        float fCoerceIn = RangesKt.coerceIn(getHorizontalPosition(textLayoutResult, i9, z9, z10), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        float fCoerceIn2 = RangesKt.coerceIn(textLayoutResult.getLineBottom(lineForOffset), 0.0f, (int) (textLayoutResult.getSize() & 4294967295L));
        return Offset.m21160constructorimpl((Float.floatToRawIntBits(fCoerceIn) << 32) | (Float.floatToRawIntBits(fCoerceIn2) & 4294967295L));
    }
}
