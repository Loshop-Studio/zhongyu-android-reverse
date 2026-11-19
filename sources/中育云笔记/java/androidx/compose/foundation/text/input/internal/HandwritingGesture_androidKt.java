package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.text.MultiParagraph;
import androidx.compose.p014ui.text.TextGranularity;
import androidx.compose.p014ui.text.TextInclusionStrategy;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.p014ui.text.input.EditCommand;
import androidx.compose.p014ui.text.input.EditingBuffer;

/* loaded from: classes.dex */
public final class HandwritingGesture_androidKt {
    private static final int LINE_FEED_CODE_POINT = 10;
    private static final int NBSP_CODE_POINT = 160;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m28004adjustHandwritingDeleteGestureRange72CqOWE(long j10, CharSequence charSequence) {
        int iM32966getStartimpl = TextRange.m32966getStartimpl(j10);
        int iM32961getEndimpl = TextRange.m32961getEndimpl(j10);
        int iCodePointBefore = iM32966getStartimpl > 0 ? Character.codePointBefore(charSequence, iM32966getStartimpl) : 10;
        int iCodePointAt = iM32961getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, iM32961getEndimpl) : 10;
        if (isWhitespaceExceptNewline(iCodePointBefore) && (isWhitespace(iCodePointAt) || isPunctuation(iCodePointAt))) {
            do {
                iM32966getStartimpl -= Character.charCount(iCodePointBefore);
                if (iM32966getStartimpl == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM32966getStartimpl);
            } while (isWhitespaceExceptNewline(iCodePointBefore));
            return TextRangeKt.TextRange(iM32966getStartimpl, iM32961getEndimpl);
        }
        if (!isWhitespaceExceptNewline(iCodePointAt)) {
            return j10;
        }
        if (!isWhitespace(iCodePointBefore) && !isPunctuation(iCodePointBefore)) {
            return j10;
        }
        do {
            iM32961getEndimpl += Character.charCount(iCodePointAt);
            if (iM32961getEndimpl == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM32961getEndimpl);
        } while (isWhitespaceExceptNewline(iCodePointAt));
        return TextRangeKt.TextRange(iM32966getStartimpl, iM32961getEndimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand compoundEditCommand(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.compoundEditCommand.1
            @Override // androidx.compose.p014ui.text.input.EditCommand
            public void applyTo(EditingBuffer editingBuffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(editingBuffer);
                }
            }
        };
    }

    /* renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m28005enclosurepWDy79M(long j10, long j11) {
        return TextRangeKt.TextRange(Math.min(TextRange.m32966getStartimpl(j10), TextRange.m32966getStartimpl(j10)), Math.max(TextRange.m32961getEndimpl(j11), TextRange.m32961getEndimpl(j11)));
    }

    /* renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m28006getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j10, ViewConfiguration viewConfiguration) {
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
    public static final int m28008getOffsetForHandwritingGestured4ec7I(TextLayoutState textLayoutState, long j10, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return m28009getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j10, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
    }

    /* renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m28009getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j10, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jMo32243screenToLocalMKHz9U;
        int iM28006getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (iM28006getLineForHandwritingGestured4ec7I = m28006getLineForHandwritingGestured4ec7I(multiParagraph, (jMo32243screenToLocalMKHz9U = layoutCoordinates.mo32243screenToLocalMKHz9U(j10)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m32817getOffsetForPositionk4lQ0M(Offset.m30631copydBAh8RU$default(jMo32243screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineTop(iM28006getLineForHandwritingGestured4ec7I) + multiParagraph.getLineBottom(iM28006getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m28010getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j10, long j11, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.Companion.m32971getZerod9O1mEE();
        }
        long jMo32243screenToLocalMKHz9U = layoutCoordinates.mo32243screenToLocalMKHz9U(j10);
        long jMo32243screenToLocalMKHz9U2 = layoutCoordinates.mo32243screenToLocalMKHz9U(j11);
        int iM28006getLineForHandwritingGestured4ec7I = m28006getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo32243screenToLocalMKHz9U, viewConfiguration);
        int iM28006getLineForHandwritingGestured4ec7I2 = m28006getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo32243screenToLocalMKHz9U2, viewConfiguration);
        if (iM28006getLineForHandwritingGestured4ec7I != -1) {
            if (iM28006getLineForHandwritingGestured4ec7I2 != -1) {
                iM28006getLineForHandwritingGestured4ec7I = Math.min(iM28006getLineForHandwritingGestured4ec7I, iM28006getLineForHandwritingGestured4ec7I2);
            }
            iM28006getLineForHandwritingGestured4ec7I2 = iM28006getLineForHandwritingGestured4ec7I;
        } else if (iM28006getLineForHandwritingGestured4ec7I2 == -1) {
            return TextRange.Companion.m32971getZerod9O1mEE();
        }
        float lineTop = (textLayoutResult.getLineTop(iM28006getLineForHandwritingGestured4ec7I2) + textLayoutResult.getLineBottom(iM28006getLineForHandwritingGestured4ec7I2)) / 2;
        int i10 = (int) (jMo32243screenToLocalMKHz9U >> 32);
        int i11 = (int) (jMo32243screenToLocalMKHz9U2 >> 32);
        return textLayoutResult.getMultiParagraph().m32818getRangeForRect86BmAI(new Rect(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), lineTop - 0.1f, Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), lineTop + 0.1f), TextGranularity.Companion.m32928getCharacterDRrd7Zo(), TextInclusionStrategy.Companion.getAnyOverlap());
    }

    /* renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m28011getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i10, TextInclusionStrategy textInclusionStrategy) {
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.Companion.m32971getZerod9O1mEE() : multiParagraph.m32818getRangeForRect86BmAI(rect.m30674translatek4lQ0M(layoutCoordinates.mo32243screenToLocalMKHz9U(Offset.Companion.m30653getZeroF1C5BW0())), i10, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m28013getRangeForScreenRectOH9lIzo(TextLayoutState textLayoutState, Rect rect, int i10, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        return m28011getRangeForScreenRectO048IG0(layoutResult != null ? layoutResult.getMultiParagraph() : null, rect, textLayoutState.getTextLayoutNodeCoordinates(), i10, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m28015getRangeForScreenRectsO048IG0(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i10, TextInclusionStrategy textInclusionStrategy) {
        long jM28013getRangeForScreenRectOH9lIzo = m28013getRangeForScreenRectOH9lIzo(textLayoutState, rect, i10, textInclusionStrategy);
        if (TextRange.m32960getCollapsedimpl(jM28013getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m32971getZerod9O1mEE();
        }
        long jM28013getRangeForScreenRectOH9lIzo2 = m28013getRangeForScreenRectOH9lIzo(textLayoutState, rect2, i10, textInclusionStrategy);
        return TextRange.m32960getCollapsedimpl(jM28013getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m32971getZerod9O1mEE() : m28005enclosurepWDy79M(jM28013getRangeForScreenRectOH9lIzo, jM28013getRangeForScreenRectOH9lIzo2);
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
        return Character.isWhitespace(i10) || i10 == 160;
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
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m28007getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j10, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m28009getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j10, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m28012getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i10, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return m28011getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i10, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m28014getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i10, TextInclusionStrategy textInclusionStrategy) {
        long jM28012getRangeForScreenRectOH9lIzo = m28012getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i10, textInclusionStrategy);
        if (TextRange.m32960getCollapsedimpl(jM28012getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m32971getZerod9O1mEE();
        }
        long jM28012getRangeForScreenRectOH9lIzo2 = m28012getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i10, textInclusionStrategy);
        return TextRange.m32960getCollapsedimpl(jM28012getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m32971getZerod9O1mEE() : m28005enclosurepWDy79M(jM28012getRangeForScreenRectOH9lIzo, jM28012getRangeForScreenRectOH9lIzo2);
    }
}
