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
import kotlin.NoWhenBranchMatchedException;
import p077d8.AbstractC8323h;

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
    public static final long m21508calculateSelectionMagnifierCenterAndroidhUlJWOE(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j10) {
        int iM26364getStartimpl;
        long jM21532getHandleDragPositionF1C5BW0 = textFieldSelectionState.m21532getHandleDragPositionF1C5BW0();
        if ((9223372034707292159L & jM21532getHandleDragPositionF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats || transformedTextFieldState.getVisualText().length() == 0) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        long jM21345getSelectiond9O1mEE = transformedTextFieldState.getVisualText().m21345getSelectiond9O1mEE();
        Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        if (i10 == 1 || i10 == 2) {
            iM26364getStartimpl = TextRange.m26364getStartimpl(jM21345getSelectiond9O1mEE);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iM26364getStartimpl = TextRange.m26359getEndimpl(jM21345getSelectiond9O1mEE);
        }
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM21532getHandleDragPositionF1C5BW0 >> 32));
        int lineForOffset = layoutResult.getLineForOffset(iM26364getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float fM13517l = AbstractC8323h.m13517l(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m27068equalsimpl0(j10, IntSize.Companion.m27075getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fM13517l) > ((int) (j10 >> 32)) / 2) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop) & 4294967295L) | (Float.floatToRawIntBits(fM13517l) << 32));
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                jM24027constructorimpl = TextLayoutStateKt.m21470coerceIn3MmeM6k(jM24027constructorimpl, SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return TextLayoutStateKt.m21472fromTextLayoutToCoreUv8p0NA(textLayoutState, jM24027constructorimpl);
    }
}
