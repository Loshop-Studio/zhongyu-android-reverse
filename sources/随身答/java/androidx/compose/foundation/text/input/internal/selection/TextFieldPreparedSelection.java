package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.TextRangeKt;
import androidx.compose.p012ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 W2\u00020\u0001:\u0001WB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ,\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00072\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)H\u0082\bJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u001f\u0010-\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)J\u001f\u0010/\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)J\u0006\u00100\u001a\u00020\u0000J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020+J\u0006\u00103\u001a\u00020+J\b\u00104\u001a\u00020\u0007H\u0002J\u0010\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+H\u0002J\u0006\u00107\u001a\u00020\u0000J\u0006\u00108\u001a\u00020\u0000J\u0006\u00109\u001a\u00020\u0000J\u0006\u0010:\u001a\u00020\u0000J\u0006\u0010;\u001a\u00020\u0000J\u0006\u0010<\u001a\u00020\u0000J\u0006\u0010=\u001a\u00020\u0000J\u0006\u0010>\u001a\u00020\u0000J\u0006\u0010?\u001a\u00020\u0000J\u0006\u0010@\u001a\u00020\u0000J\u0006\u0010A\u001a\u00020\u0000J\u0006\u0010B\u001a\u00020\u0000J!\u0010C\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00072\f\u0010D\u001a\b\u0012\u0004\u0012\u00020+0EH\u0082\bJ\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\u0006\u0010H\u001a\u00020\u0000J\u0006\u0010I\u001a\u00020\u0000J\u0006\u0010J\u001a\u00020\u0000J\u0006\u0010K\u001a\u00020\u0000J\u0006\u0010L\u001a\u00020\u0000J\u0006\u0010M\u001a\u00020\u0000J\u0006\u0010N\u001a\u00020\u0000J\u0006\u0010O\u001a\u00020\u0000J\u0016\u0010P\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0002J\u0016\u0010R\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0002J\u0017\u0010S\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0082\u0010J\u0017\u0010T\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0082\u0010J\u0014\u0010U\u001a\u00020+*\u00020\u00052\u0006\u0010V\u001a\u00020+H\u0002R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u00020\u0016X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m13413d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "state", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "isFromSoftKeyboard", "", "visibleTextLayoutHeight", "", "textPreparedSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V", "initialValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "getInitialWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "selection", "Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", "J", "text", "", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "getWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "setWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "applyIfNotEmpty", "resetCachedX", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "charOffset", "", TypedValues.CycleType.S_WAVE_OFFSET, "collapseLeftOr", "or", "collapseRightOr", "deleteMovement", "deselect", "getNextCharacterIndex", "getPrecedingCharacterIndex", "isLtr", "jumpByPagesOffset", "pagesAmount", "moveCursorDownByLine", "moveCursorDownByPage", "moveCursorLeftByChar", "moveCursorLeftByWord", "moveCursorNextByChar", "moveCursorNextByParagraph", "moveCursorNextByWord", "moveCursorPrevByChar", "moveCursorPrevByParagraph", "moveCursorPrevByWord", "moveCursorRightByChar", "moveCursorRightByWord", "moveCursorTo", "proposedCursorMovement", "Lkotlin/Function0;", "moveCursorToEnd", "moveCursorToHome", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorUpByLine", "moveCursorUpByPage", "selectAll", "selectMovement", "getLineEndByOffsetForLayout", "currentOffset", "getLineStartByOffsetForLayout", "getNextWordOffsetForLayout", "getPrevWordOffsetForLayout", "jumpByLinesOffset", "linesAmount", "Companion", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n126#1,11:569\n126#1,11:580\n126#1,11:591\n126#1,11:602\n130#1,7:613\n196#1,5:620\n130#1,5:625\n201#1,15:630\n136#1:645\n196#1,5:646\n130#1,5:651\n201#1,15:656\n136#1:671\n196#1,5:672\n130#1,5:677\n201#1,15:682\n136#1:697\n196#1,5:698\n130#1,5:703\n201#1,15:708\n136#1:723\n196#1,5:724\n130#1,5:729\n201#1,15:734\n136#1:749\n196#1,5:750\n130#1,5:755\n201#1,15:760\n136#1:775\n196#1,5:776\n130#1,5:781\n201#1,15:786\n136#1:801\n196#1,5:802\n130#1,5:807\n201#1,15:812\n136#1:827\n200#1:828\n130#1,5:829\n201#1,15:834\n136#1:849\n200#1:850\n130#1,5:851\n201#1,15:856\n136#1:871\n196#1,5:872\n130#1,5:877\n201#1,15:882\n136#1:897\n196#1,5:898\n130#1,5:903\n201#1,15:908\n136#1:923\n200#1:924\n130#1,5:925\n201#1,15:930\n136#1:945\n200#1:946\n130#1,5:947\n201#1,15:952\n136#1:967\n130#1,7:968\n130#1,7:975\n602#2,8:561\n30#3:982\n53#4,3:983\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n*L\n139#1:569,11\n141#1:580,11\n158#1:591,11\n171#1:602,11\n200#1:613,7\n217#1:620,5\n217#1:625,5\n217#1:630,15\n217#1:645\n219#1:646,5\n219#1:651,5\n219#1:656,15\n219#1:671\n221#1:672,5\n221#1:677,5\n221#1:682,15\n221#1:697\n223#1:698,5\n223#1:703,5\n223#1:708,15\n223#1:723\n239#1:724,5\n239#1:729,5\n239#1:734,15\n239#1:749\n243#1:750,5\n243#1:755,5\n243#1:760,15\n243#1:775\n247#1:776,5\n247#1:781,5\n247#1:786,15\n247#1:801\n255#1:802,5\n255#1:807,5\n255#1:812,15\n255#1:827\n264#1:828\n264#1:829,5\n264#1:834,15\n264#1:849\n267#1:850\n267#1:851,5\n267#1:856,15\n267#1:871\n283#1:872,5\n283#1:877,5\n283#1:882,15\n283#1:897\n287#1:898,5\n287#1:903,5\n287#1:908,15\n287#1:923\n292#1:924\n292#1:925,5\n292#1:930,15\n292#1:945\n295#1:946\n295#1:947,5\n295#1:952,15\n295#1:967\n299#1:968,7\n304#1:975,7\n106#1:561,8\n395#1:982\n395#1:983,3\n*E\n"})
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
    public static final int $stable = 8;

    public TextFieldPreparedSelection(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z9, float f10, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z9;
        this.visibleTextLayoutHeight = f10;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            this.initialValue = visualText;
            this.initialWedgeAffinity = transformedTextFieldState.getSelectionWedgeAffinity();
            Unit unit = Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.selection = visualText.getSelection();
            this.text = visualText.getText().toString();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean resetCachedX, Function1<? super TextFieldPreparedSelection, Unit> block) {
        if (resetCachedX) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            block.invoke(this);
        }
        return this;
    }

    public static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z9, Function1 function1, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        if (z9) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            function1.invoke(textFieldPreparedSelection);
        }
        return textFieldPreparedSelection;
    }

    private final int charOffset(int offset) {
        return RangesKt.coerceAtMost(offset, this.text.length() - 1);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i9) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i9), true);
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = TextRange.m23457getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i9);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i9) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i9));
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = TextRange.m23458getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i9);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i9) {
        while (i9 < this.initialValue.length()) {
            long jM23432getWordBoundaryjx7JFs = textLayoutResult.m23432getWordBoundaryjx7JFs(charOffset(i9));
            if (TextRange.m23455getEndimpl(jM23432getWordBoundaryjx7JFs) > i9) {
                return TextRange.m23455getEndimpl(jM23432getWordBoundaryjx7JFs);
            }
            i9++;
        }
        return this.initialValue.length();
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = TextRange.m23455getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i9);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i9) {
        while (i9 > 0) {
            long jM23432getWordBoundaryjx7JFs = textLayoutResult.m23432getWordBoundaryjx7JFs(charOffset(i9));
            if (TextRange.m23460getStartimpl(jM23432getWordBoundaryjx7JFs) < i9) {
                return TextRange.m23460getStartimpl(jM23432getWordBoundaryjx7JFs);
            }
            i9--;
        }
        return 0;
    }

    public static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = TextRange.m23455getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i9);
    }

    private final boolean isLtr() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (paragraphDirection = textLayoutResult.getParagraphDirection(TextRange.m23455getEndimpl(this.selection))) == null || paragraphDirection == ResolvedTextDirection.Ltr;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i9) {
        int iM23455getEndimpl = TextRange.m23455getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(iM23455getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iM23455getEndimpl) + i9;
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
        return textLayoutResult.m23430getOffsetForPositionk4lQ0M(Offset.m21160constructorimpl((Float.floatToRawIntBits(cachedX) << 32) | (Float.floatToRawIntBits(lineBottom) & 4294967295L)));
    }

    private final int jumpByPagesOffset(int pagesAmount) {
        int iM23455getEndimpl = TextRange.m23455getEndimpl(this.initialValue.getSelection());
        if (this.textLayoutResult == null || Float.isNaN(this.visibleTextLayoutHeight)) {
            return iM23455getEndimpl;
        }
        Rect rectTranslate = this.textLayoutResult.getCursorRect(iM23455getEndimpl).translate(0.0f, this.visibleTextLayoutHeight * pagesAmount);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(rectTranslate.getTop()));
        return Math.abs(rectTranslate.getTop() - lineBottom) > Math.abs(rectTranslate.getBottom() - lineBottom) ? this.textLayoutResult.m23430getOffsetForPositionk4lQ0M(rectTranslate.m21203getTopLeftF1C5BW0()) : this.textLayoutResult.m23430getOffsetForPositionk4lQ0M(rectTranslate.m21196getBottomLeftF1C5BW0());
    }

    private final TextFieldPreparedSelection moveCursorTo(boolean resetCachedX, Function0<Integer> proposedCursorMovement) {
        if (resetCachedX) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(proposedCursorMovement.invoke().intValue(), iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public static /* synthetic */ TextFieldPreparedSelection moveCursorTo$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z9, Function0 function0, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        if (z9) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(textFieldPreparedSelection.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) function0.invoke()).intValue(), iM23455getEndimpl, textFieldPreparedSelection.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                textFieldPreparedSelection.m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                textFieldPreparedSelection.setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return textFieldPreparedSelection;
    }

    public final TextFieldPreparedSelection collapseLeftOr(Function1<? super TextFieldPreparedSelection, Unit> or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m23454getCollapsedimpl(this.selection)) {
                or.invoke(this);
                return this;
            }
            if (isLtr()) {
                this.selection = TextRangeKt.TextRange(TextRange.m23458getMinimpl(this.selection));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m23457getMaximpl(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection collapseRightOr(Function1<? super TextFieldPreparedSelection, Unit> or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m23454getCollapsedimpl(this.selection)) {
                or.invoke(this);
                return this;
            }
            if (isLtr()) {
                this.selection = TextRangeKt.TextRange(TextRange.m23457getMaximpl(this.selection));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m23458getMinimpl(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection deleteMovement() {
        if (this.text.length() > 0) {
            if (TextRange.m23454getCollapsedimpl(this.initialValue.getSelection())) {
                TransformedTextFieldState.m18698replaceTextM8tDOmk$default(this.state, "", TextRangeKt.TextRange(TextRange.m23460getStartimpl(this.initialValue.getSelection()), TextRange.m23455getEndimpl(this.selection)), null, !this.isFromSoftKeyboard, 4, null);
            } else {
                this.state.deleteSelectedText();
            }
            this.selection = this.state.getVisualText().getSelection();
            this.wedgeAffinity = WedgeAffinity.Start;
        }
        return this;
    }

    public final TextFieldPreparedSelection deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m23455getEndimpl(this.selection));
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
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m23455getEndimpl(this.selection));
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m23455getEndimpl(this.selection));
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    public final TextFieldPreparedSelection moveCursorDownByLine() {
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, 1) : this.text.length(), iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(1), iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
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
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m23455getEndimpl(this.selection)), iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            int iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m23457getMaximpl(this.selection));
            if (iFindParagraphEnd == TextRange.m23457getMaximpl(this.selection) && iFindParagraphEnd != this.text.length()) {
                iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, iFindParagraphEnd + 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(iFindParagraphEnd, iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m23455getEndimpl(this.selection)), iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            int iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m23458getMinimpl(this.selection));
            if (iFindParagraphStart == TextRange.m23458getMinimpl(this.selection) && iFindParagraphStart != 0) {
                iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, iFindParagraphStart - 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(iFindParagraphStart, iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getPrevWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
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
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(this.text.length(), iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(0, iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
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
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByLine() {
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, -1) : 0, iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if (this.text.length() > 0) {
            int iM23455getEndimpl = TextRange.m23455getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(-1), iM23455getEndimpl, this.state);
            int iM18713component1impl = CursorAndWedgeAffinity.m18713component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM18714component2impl = CursorAndWedgeAffinity.m18714component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM18713component1impl != iM23455getEndimpl || !TextRange.m23454getCollapsedimpl(getSelection())) {
                m18740setSelection5zctL8(TextRangeKt.TextRange(iM18713component1impl));
            }
            if (wedgeAffinityM18714component2impl != null) {
                setWedgeAffinity(wedgeAffinityM18714component2impl);
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
            this.selection = TextRangeKt.TextRange(TextRange.m23460getStartimpl(this.initialValue.getSelection()), TextRange.m23455getEndimpl(this.selection));
        }
        return this;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m18740setSelection5zctL8(long j9) {
        this.selection = j9;
    }

    public final void setWedgeAffinity(WedgeAffinity wedgeAffinity) {
        this.wedgeAffinity = wedgeAffinity;
    }
}
