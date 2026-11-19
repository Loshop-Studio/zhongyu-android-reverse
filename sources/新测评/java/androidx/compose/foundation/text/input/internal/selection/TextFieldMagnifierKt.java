package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m13558d2 = {"calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-hUlJWOE", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n278#2:124\n30#2:130\n65#3:125\n60#4:126\n85#4:129\n53#4,3:131\n22#5:127\n54#6:128\n1#7:134\n*S KotlinDebug\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n*L\n73#1:124\n117#1:130\n89#1:125\n89#1:126\n107#1:129\n117#1:131,3\n89#1:127\n107#1:128\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m18297calculateSelectionMagnifierCenterAndroidhUlJWOE(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j10) {
        int iM23027getStartimpl;
        long jM18321getHandleDragPositionF1C5BW0 = textFieldSelectionState.m18321getHandleDragPositionF1C5BW0();
        if ((9223372034707292159L & jM18321getHandleDragPositionF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats || transformedTextFieldState.getVisualText().length() == 0) {
            return Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        }
        long selection = transformedTextFieldState.getVisualText().getSelection();
        Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        }
        if (i10 == 1 || i10 == 2) {
            iM23027getStartimpl = TextRange.m23027getStartimpl(selection);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iM23027getStartimpl = TextRange.m23022getEndimpl(selection);
        }
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM18321getHandleDragPositionF1C5BW0 >> 32));
        int lineForOffset = layoutResult.getLineForOffset(iM23027getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float fCoerceIn = RangesKt.coerceIn(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m23730equalsimpl0(j10, IntSize.INSTANCE.m23737getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fCoerceIn) > ((int) (j10 >> 32)) / 2) {
            return Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        long jM20727constructorimpl = Offset.m20727constructorimpl((Float.floatToRawIntBits(((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop) & 4294967295L) | (Float.floatToRawIntBits(fCoerceIn) << 32));
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                jM20727constructorimpl = TextLayoutStateKt.m18259coerceIn3MmeM6k(jM20727constructorimpl, SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return TextLayoutStateKt.m18261fromTextLayoutToCoreUv8p0NA(textLayoutState, jM20727constructorimpl);
    }
}
