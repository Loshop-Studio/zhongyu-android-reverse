package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.text.MultiParagraph;
import androidx.compose.p013ui.text.TextGranularity;
import androidx.compose.p013ui.text.TextInclusionStrategy;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.EditCommand;
import androidx.compose.p013ui.text.input.EditingBuffer;

/* loaded from: classes.dex */
public final class HandwritingGesture_androidKt {
    private static final int LINE_FEED_CODE_POINT = 10;
    private static final int NBSP_CODE_POINT = 160;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m21402adjustHandwritingDeleteGestureRange72CqOWE(long j10, CharSequence charSequence) {
        int iM26364getStartimpl = TextRange.m26364getStartimpl(j10);
        int iM26359getEndimpl = TextRange.m26359getEndimpl(j10);
        int iCodePointBefore = iM26364getStartimpl > 0 ? Character.codePointBefore(charSequence, iM26364getStartimpl) : 10;
        int iCodePointAt = iM26359getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, iM26359getEndimpl) : 10;
        if (isWhitespaceExceptNewline(iCodePointBefore) && (isWhitespace(iCodePointAt) || isPunctuation(iCodePointAt))) {
            do {
                iM26364getStartimpl -= Character.charCount(iCodePointBefore);
                if (iM26364getStartimpl == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM26364getStartimpl);
            } while (isWhitespaceExceptNewline(iCodePointBefore));
            return TextRangeKt.TextRange(iM26364getStartimpl, iM26359getEndimpl);
        }
        if (!isWhitespaceExceptNewline(iCodePointAt)) {
            return j10;
        }
        if (!isWhitespace(iCodePointBefore) && !isPunctuation(iCodePointBefore)) {
            return j10;
        }
        do {
            iM26359getEndimpl += Character.charCount(iCodePointAt);
            if (iM26359getEndimpl == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM26359getEndimpl);
        } while (isWhitespaceExceptNewline(iCodePointAt));
        return TextRangeKt.TextRange(iM26364getStartimpl, iM26359getEndimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand compoundEditCommand(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.compoundEditCommand.1
            @Override // androidx.compose.p013ui.text.input.EditCommand
            public void applyTo(EditingBuffer editingBuffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(editingBuffer);
                }
            }
        };
    }

    /* renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m21403enclosurepWDy79M(long j10, long j11) {
        return TextRangeKt.TextRange(Math.min(TextRange.m26364getStartimpl(j10), TextRange.m26364getStartimpl(j10)), Math.max(TextRange.m26359getEndimpl(j11), TextRange.m26359getEndimpl(j11)));
    }

    /* renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m21404getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j10, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int i10 = (int) (4294967295L & j10);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) >= multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin && Float.intBitsToFloat(i10) <= multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            int i11 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i11) >= (-handwritingGestureLineMargin) && Float.intBitsToFloat(i11) <= multiParagraph.getWidth() + handwritingGestureLineMargin) {
                return lineForVerticalPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m21406getOffsetForHandwritingGestured4ec7I(TextLayoutState textLayoutState, long j10, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return m21407getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j10, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
    }

    /* renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m21407getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j10, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jMo25641screenToLocalMKHz9U;
        int iM21404getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (iM21404getLineForHandwritingGestured4ec7I = m21404getLineForHandwritingGestured4ec7I(multiParagraph, (jMo25641screenToLocalMKHz9U = layoutCoordinates.mo25641screenToLocalMKHz9U(j10)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m26215getOffsetForPositionk4lQ0M(Offset.m24029copydBAh8RU$default(jMo25641screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineTop(iM21404getLineForHandwritingGestured4ec7I) + multiParagraph.getLineBottom(iM21404getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m21408getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j10, long j11, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.Companion.m26369getZerod9O1mEE();
        }
        long jMo25641screenToLocalMKHz9U = layoutCoordinates.mo25641screenToLocalMKHz9U(j10);
        long jMo25641screenToLocalMKHz9U2 = layoutCoordinates.mo25641screenToLocalMKHz9U(j11);
        int iM21404getLineForHandwritingGestured4ec7I = m21404getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo25641screenToLocalMKHz9U, viewConfiguration);
        int iM21404getLineForHandwritingGestured4ec7I2 = m21404getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo25641screenToLocalMKHz9U2, viewConfiguration);
        if (iM21404getLineForHandwritingGestured4ec7I != -1) {
            if (iM21404getLineForHandwritingGestured4ec7I2 != -1) {
                iM21404getLineForHandwritingGestured4ec7I = Math.min(iM21404getLineForHandwritingGestured4ec7I, iM21404getLineForHandwritingGestured4ec7I2);
            }
            iM21404getLineForHandwritingGestured4ec7I2 = iM21404getLineForHandwritingGestured4ec7I;
        } else if (iM21404getLineForHandwritingGestured4ec7I2 == -1) {
            return TextRange.Companion.m26369getZerod9O1mEE();
        }
        float lineTop = (textLayoutResult.getLineTop(iM21404getLineForHandwritingGestured4ec7I2) + textLayoutResult.getLineBottom(iM21404getLineForHandwritingGestured4ec7I2)) / 2;
        int i10 = (int) (jMo25641screenToLocalMKHz9U >> 32);
        int i11 = (int) (jMo25641screenToLocalMKHz9U2 >> 32);
        return textLayoutResult.getMultiParagraph().m26216getRangeForRect86BmAI(new Rect(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), lineTop - 0.1f, Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), lineTop + 0.1f), TextGranularity.Companion.m26326getCharacterDRrd7Zo(), TextInclusionStrategy.Companion.getAnyOverlap());
    }

    /* renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m21409getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i10, TextInclusionStrategy textInclusionStrategy) {
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.Companion.m26369getZerod9O1mEE() : multiParagraph.m26216getRangeForRect86BmAI(rect.m24072translatek4lQ0M(layoutCoordinates.mo25641screenToLocalMKHz9U(Offset.Companion.m24051getZeroF1C5BW0())), i10, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m21411getRangeForScreenRectOH9lIzo(TextLayoutState textLayoutState, Rect rect, int i10, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        return m21409getRangeForScreenRectO048IG0(layoutResult != null ? layoutResult.getMultiParagraph() : null, rect, textLayoutState.getTextLayoutNodeCoordinates(), i10, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m21413getRangeForScreenRectsO048IG0(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i10, TextInclusionStrategy textInclusionStrategy) {
        long jM21411getRangeForScreenRectOH9lIzo = m21411getRangeForScreenRectOH9lIzo(textLayoutState, rect, i10, textInclusionStrategy);
        if (TextRange.m26358getCollapsedimpl(jM21411getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m26369getZerod9O1mEE();
        }
        long jM21411getRangeForScreenRectOH9lIzo2 = m21411getRangeForScreenRectOH9lIzo(textLayoutState, rect2, i10, textInclusionStrategy);
        return TextRange.m26358getCollapsedimpl(jM21411getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m26369getZerod9O1mEE() : m21403enclosurepWDy79M(jM21411getRangeForScreenRectOH9lIzo, jM21411getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBiDiBoundary(TextLayoutResult textLayoutResult, int i10) {
        int lineForOffset = textLayoutResult.getLineForOffset(i10);
        return (i10 == textLayoutResult.getLineStart(lineForOffset) || i10 == TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null)) ? textLayoutResult.getParagraphDirection(i10) != textLayoutResult.getBidiRunDirection(i10) : textLayoutResult.getBidiRunDirection(i10) != textLayoutResult.getBidiRunDirection(i10 - 1);
    }

    private static final boolean isNewline(int i10) {
        int type = Character.getType(i10);
        return type == 14 || type == 13 || i10 == 10;
    }

    private static final boolean isPunctuation(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean isWhitespace(int i10) {
        return Character.isWhitespace(i10) || i10 == NBSP_CODE_POINT;
    }

    private static final boolean isWhitespaceExceptNewline(int i10) {
        return isWhitespace(i10) && !isNewline(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rangeOfWhitespaces(CharSequence charSequence, int i10) {
        int iCharCount = i10;
        while (iCharCount > 0) {
            int iCodePointBefore = CodepointHelpers_jvmKt.codePointBefore(charSequence, iCharCount);
            if (!isWhitespace(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i10 < charSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmKt.codePointAt(charSequence, i10);
            if (!isWhitespace(iCodePointAt)) {
                break;
            }
            i10 += CodepointHelpers_jvmKt.charCount(iCodePointAt);
        }
        return TextRangeKt.TextRange(iCharCount, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toOffset(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m21405getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j10, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m21407getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j10, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m21410getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i10, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return m21409getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i10, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m21412getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i10, TextInclusionStrategy textInclusionStrategy) {
        long jM21410getRangeForScreenRectOH9lIzo = m21410getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i10, textInclusionStrategy);
        if (TextRange.m26358getCollapsedimpl(jM21410getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m26369getZerod9O1mEE();
        }
        long jM21410getRangeForScreenRectOH9lIzo2 = m21410getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i10, textInclusionStrategy);
        return TextRange.m26358getCollapsedimpl(jM21410getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m26369getZerod9O1mEE() : m21403enclosurepWDy79M(jM21410getRangeForScreenRectOH9lIzo, jM21410getRangeForScreenRectOH9lIzo2);
    }
}
