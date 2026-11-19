package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001a$\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¨\u0006\f"}, m13558d2 = {"getSelectionHandleCoordinates", "Landroidx/compose/ui/geometry/Offset;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", TypedValues.CycleType.S_WAVE_OFFSET, "", "isStart", "", "areHandlesCrossed", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "getHorizontalPosition", "", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,69:1\n54#2:70\n59#2:72\n85#3:71\n90#3:73\n53#3,3:75\n30#4:74\n*S KotlinDebug\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n*L\n47#1:70\n49#1:72\n47#1:71\n49#1:73\n50#1:75,3\n50#1:74\n*E\n"})
/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i10, boolean z9, boolean z10) {
        return textLayoutResult.getHorizontalPosition(i10, textLayoutResult.getBidiRunDirection(((!z9 || z10) && (z9 || !z10)) ? Math.max(i10 + (-1), 0) : i10) == textLayoutResult.getParagraphDirection(i10));
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i10, boolean z9, boolean z10) {
        int lineForOffset = textLayoutResult.getLineForOffset(i10);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        }
        float fCoerceIn = RangesKt.coerceIn(getHorizontalPosition(textLayoutResult, i10, z9, z10), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        float fCoerceIn2 = RangesKt.coerceIn(textLayoutResult.getLineBottom(lineForOffset), 0.0f, (int) (textLayoutResult.getSize() & 4294967295L));
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(fCoerceIn) << 32) | (Float.floatToRawIntBits(fCoerceIn2) & 4294967295L));
    }
}
