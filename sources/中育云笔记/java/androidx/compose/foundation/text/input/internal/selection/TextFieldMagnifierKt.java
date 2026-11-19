package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.unit.IntSize;
import kotlin.NoWhenBranchMatchedException;
import p265nd.AbstractC10410o;

/* loaded from: classes.dex */
public final class TextFieldMagnifierKt {

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
    public static final long m28110calculateSelectionMagnifierCenterAndroidhUlJWOE(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j10) {
        int iM32966getStartimpl;
        long jM28134getHandleDragPositionF1C5BW0 = textFieldSelectionState.m28134getHandleDragPositionF1C5BW0();
        if ((9223372034707292159L & jM28134getHandleDragPositionF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats || transformedTextFieldState.getVisualText().length() == 0) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        long jM27947getSelectiond9O1mEE = transformedTextFieldState.getVisualText().m27947getSelectiond9O1mEE();
        Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        if (i10 == 1 || i10 == 2) {
            iM32966getStartimpl = TextRange.m32966getStartimpl(jM27947getSelectiond9O1mEE);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iM32966getStartimpl = TextRange.m32961getEndimpl(jM27947getSelectiond9O1mEE);
        }
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM28134getHandleDragPositionF1C5BW0 >> 32));
        int lineForOffset = layoutResult.getLineForOffset(iM32966getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float fM21760m = AbstractC10410o.m21760m(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m33670equalsimpl0(j10, IntSize.Companion.m33677getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fM21760m) > ((int) (j10 >> 32)) / 2) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop) & 4294967295L) | (Float.floatToRawIntBits(fM21760m) << 32));
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                jM30629constructorimpl = TextLayoutStateKt.m28072coerceIn3MmeM6k(jM30629constructorimpl, SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return TextLayoutStateKt.m28074fromTextLayoutToCoreUv8p0NA(textLayoutState, jM30629constructorimpl);
    }
}
