package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection {
    public static final int NoCharacterFound = -1;
    private final TextFieldCharSequence initialValue;
    private final SelectionWedgeAffinity initialWedgeAffinity;
    private final boolean isFromSoftKeyboard;
    private long selection;
    private final TransformedTextFieldState state;
    private final String text;
    private final TextLayoutResult textLayoutResult;
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;
    private WedgeAffinity wedgeAffinity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public TextFieldPreparedSelection(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z10, float f10, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z10;
        this.visibleTextLayoutHeight = f10;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC10570l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            this.initialValue = visualText;
            this.initialWedgeAffinity = transformedTextFieldState.getSelectionWedgeAffinity();
            C8736p c8736p = C8736p.f16368a;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.selection = visualText.m21345getSelectiond9O1mEE();
            this.text = visualText.getText().toString();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean z10, InterfaceC10570l interfaceC10570l) {
        if (z10) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            interfaceC10570l.invoke(this);
        }
        return this;
    }

    public static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            interfaceC10570l.invoke(textFieldPreparedSelection);
        }
        return textFieldPreparedSelection;
    }

    private final int charOffset(int i10) {
        return AbstractC8323h.m13513h(i10, this.text.length() - 1);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i10) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i10), true);
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = TextRange.m26361getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i10);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i10) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i10));
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = TextRange.m26362getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i10);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i10) {
        while (i10 < this.initialValue.length()) {
            long jM26336getWordBoundaryjx7JFs = textLayoutResult.m26336getWordBoundaryjx7JFs(charOffset(i10));
            if (TextRange.m26359getEndimpl(jM26336getWordBoundaryjx7JFs) > i10) {
                return TextRange.m26359getEndimpl(jM26336getWordBoundaryjx7JFs);
            }
            i10++;
        }
        return this.initialValue.length();
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = TextRange.m26359getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i10);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i10) {
        while (i10 > 0) {
            long jM26336getWordBoundaryjx7JFs = textLayoutResult.m26336getWordBoundaryjx7JFs(charOffset(i10));
            if (TextRange.m26364getStartimpl(jM26336getWordBoundaryjx7JFs) < i10) {
                return TextRange.m26364getStartimpl(jM26336getWordBoundaryjx7JFs);
            }
            i10--;
        }
        return 0;
    }

    public static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = TextRange.m26359getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i10);
    }

    private final boolean isLtr() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (paragraphDirection = textLayoutResult.getParagraphDirection(TextRange.m26359getEndimpl(this.selection))) == null || paragraphDirection == ResolvedTextDirection.Ltr;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i10) {
        int iM26359getEndimpl = TextRange.m26359getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(iM26359getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iM26359getEndimpl) + i10;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return this.text.length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m26334getOffsetForPositionk4lQ0M(Offset.m24027constructorimpl((Float.floatToRawIntBits(cachedX) << 32) | (Float.floatToRawIntBits(lineBottom) & 4294967295L)));
    }

    private final int jumpByPagesOffset(int i10) {
        int iM26359getEndimpl = TextRange.m26359getEndimpl(this.initialValue.m21345getSelectiond9O1mEE());
        if (this.textLayoutResult == null || Float.isNaN(this.visibleTextLayoutHeight)) {
            return iM26359getEndimpl;
        }
        Rect rectTranslate = this.textLayoutResult.getCursorRect(iM26359getEndimpl).translate(0.0f, this.visibleTextLayoutHeight * i10);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(rectTranslate.getTop()));
        return Math.abs(rectTranslate.getTop() - lineBottom) > Math.abs(rectTranslate.getBottom() - lineBottom) ? this.textLayoutResult.m26334getOffsetForPositionk4lQ0M(rectTranslate.m24070getTopLeftF1C5BW0()) : this.textLayoutResult.m26334getOffsetForPositionk4lQ0M(rectTranslate.m24063getBottomLeftF1C5BW0());
    }

    private final TextFieldPreparedSelection moveCursorTo(boolean z10, InterfaceC10559a interfaceC10559a) {
        if (z10) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) interfaceC10559a.invoke()).intValue(), iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public static /* synthetic */ TextFieldPreparedSelection moveCursorTo$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z10, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(textFieldPreparedSelection.m21517getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) interfaceC10559a.invoke()).intValue(), iM26359getEndimpl, textFieldPreparedSelection.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(textFieldPreparedSelection.m21517getSelectiond9O1mEE())) {
                textFieldPreparedSelection.m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                textFieldPreparedSelection.setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return textFieldPreparedSelection;
    }

    public final TextFieldPreparedSelection collapseLeftOr(InterfaceC10570l interfaceC10570l) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m26358getCollapsedimpl(this.selection)) {
                interfaceC10570l.invoke(this);
                return this;
            }
            if (isLtr()) {
                this.selection = TextRangeKt.TextRange(TextRange.m26362getMinimpl(this.selection));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m26361getMaximpl(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection collapseRightOr(InterfaceC10570l interfaceC10570l) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m26358getCollapsedimpl(this.selection)) {
                interfaceC10570l.invoke(this);
                return this;
            }
            if (isLtr()) {
                this.selection = TextRangeKt.TextRange(TextRange.m26361getMaximpl(this.selection));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m26362getMinimpl(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection deleteMovement() {
        if (this.text.length() > 0) {
            if (TextRange.m26358getCollapsedimpl(this.initialValue.m21345getSelectiond9O1mEE())) {
                TransformedTextFieldState.m21476replaceTextM8tDOmk$default(this.state, "", TextRangeKt.TextRange(TextRange.m26364getStartimpl(this.initialValue.m21345getSelectiond9O1mEE()), TextRange.m26359getEndimpl(this.selection)), null, !this.isFromSoftKeyboard, 4, null);
            } else {
                this.state.deleteSelectedText();
            }
            this.selection = this.state.getVisualText().m21345getSelectiond9O1mEE();
            this.wedgeAffinity = WedgeAffinity.Start;
        }
        return this;
    }

    public final TextFieldPreparedSelection deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m26359getEndimpl(this.selection));
        }
        return this;
    }

    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    public final SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m26359getEndimpl(this.selection));
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m26359getEndimpl(this.selection));
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m21517getSelectiond9O1mEE() {
        return this.selection;
    }

    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    public final TextFieldPreparedSelection moveCursorDownByLine() {
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, 1) : this.text.length(), iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(1), iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorLeftByChar() {
        return isLtr() ? moveCursorPrevByChar() : moveCursorNextByChar();
    }

    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        return isLtr() ? moveCursorPrevByWord() : moveCursorNextByWord();
    }

    public final TextFieldPreparedSelection moveCursorNextByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m26359getEndimpl(this.selection)), iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            int iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m26361getMaximpl(this.selection));
            if (iFindParagraphEnd == TextRange.m26361getMaximpl(this.selection) && iFindParagraphEnd != this.text.length()) {
                iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, iFindParagraphEnd + 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(iFindParagraphEnd, iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m26359getEndimpl(this.selection)), iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            int iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m26362getMinimpl(this.selection));
            if (iFindParagraphStart == TextRange.m26362getMinimpl(this.selection) && iFindParagraphStart != 0) {
                iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, iFindParagraphStart - 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(iFindParagraphStart, iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getPrevWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorRightByChar() {
        return isLtr() ? moveCursorNextByChar() : moveCursorPrevByChar();
    }

    public final TextFieldPreparedSelection moveCursorRightByWord() {
        return isLtr() ? moveCursorNextByWord() : moveCursorPrevByWord();
    }

    public final TextFieldPreparedSelection moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(this.text.length(), iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(0, iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        return isLtr() ? moveCursorToLineStart() : moveCursorToLineEnd();
    }

    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        return isLtr() ? moveCursorToLineEnd() : moveCursorToLineStart();
    }

    public final TextFieldPreparedSelection moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByLine() {
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, -1) : 0, iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if (this.text.length() > 0) {
            int iM26359getEndimpl = TextRange.m26359getEndimpl(m21517getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(-1), iM26359getEndimpl, this.state);
            int iM21491component1impl = CursorAndWedgeAffinity.m21491component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM21492component2impl = CursorAndWedgeAffinity.m21492component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM21491component1impl != iM26359getEndimpl || !TextRange.m26358getCollapsedimpl(m21517getSelectiond9O1mEE())) {
                m21518setSelection5zctL8(TextRangeKt.TextRange(iM21491component1impl));
            }
            if (wedgeAffinityM21492component2impl != null) {
                setWedgeAffinity(wedgeAffinityM21492component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    public final TextFieldPreparedSelection selectMovement() {
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m26364getStartimpl(this.initialValue.m21345getSelectiond9O1mEE()), TextRange.m26359getEndimpl(this.selection));
        }
        return this;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m21518setSelection5zctL8(long j10) {
        this.selection = j10;
    }

    public final void setWedgeAffinity(WedgeAffinity wedgeAffinity) {
        this.wedgeAffinity = wedgeAffinity;
    }
}
