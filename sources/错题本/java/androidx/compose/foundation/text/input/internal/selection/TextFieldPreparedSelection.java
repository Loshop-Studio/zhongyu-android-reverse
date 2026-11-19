package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 i2\u00020\u0001:\u0001iB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ&\u0010\u0017\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u000fJ\r\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u000fJ\r\u0010 \u001a\u00020\u0000¢\u0006\u0004\b \u0010\u000fJ\r\u0010!\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u000fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u000fJ\r\u0010#\u001a\u00020\u0000¢\u0006\u0004\b#\u0010\u000fJ\r\u0010$\u001a\u00020\u0000¢\u0006\u0004\b$\u0010\u000fJ\r\u0010%\u001a\u00020\u0000¢\u0006\u0004\b%\u0010\u000fJ\r\u0010&\u001a\u00020\u0000¢\u0006\u0004\b&\u0010\u000fJ\r\u0010'\u001a\u00020\u0000¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\u0000¢\u0006\u0004\b(\u0010\u000fJ\r\u0010)\u001a\u00020\u0000¢\u0006\u0004\b)\u0010\u000fJ\r\u0010*\u001a\u00020\u0000¢\u0006\u0004\b*\u0010\u000fJ\r\u0010+\u001a\u00020\u0000¢\u0006\u0004\b+\u0010\u000fJ\r\u0010,\u001a\u00020\u0000¢\u0006\u0004\b,\u0010\u000fJ\r\u0010-\u001a\u00020\u0000¢\u0006\u0004\b-\u0010\u000fJ\r\u0010.\u001a\u00020\u0000¢\u0006\u0004\b.\u0010\u000fJ\r\u0010/\u001a\u00020\u0000¢\u0006\u0004\b/\u0010\u000fJ\r\u00100\u001a\u00020\u0000¢\u0006\u0004\b0\u0010\u000fJ\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b1\u0010\u000fJ3\u00104\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\u00062\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015H\u0082\b¢\u0006\u0004\b4\u00105J(\u00108\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a06H\u0082\b¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010;J\u001e\u0010=\u001a\u00020\u001a*\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u001aH\u0082\u0010¢\u0006\u0004\b=\u0010>J\u001e\u0010?\u001a\u00020\u001a*\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u001aH\u0082\u0010¢\u0006\u0004\b?\u0010>J\u001d\u0010@\u001a\u00020\u001a*\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u001aH\u0002¢\u0006\u0004\b@\u0010>J\u001d\u0010A\u001a\u00020\u001a*\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u001aH\u0002¢\u0006\u0004\bA\u0010>J\u001b\u0010C\u001a\u00020\u001a*\u00020\u00042\u0006\u0010B\u001a\u00020\u001aH\u0002¢\u0006\u0004\bC\u0010>J\u0017\u0010E\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u001aH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001aH\u0002¢\u0006\u0004\bH\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010T\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR(\u0010Y\u001a\u00020X8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010`\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "isFromSoftKeyboard", "", "visibleTextLayoutHeight", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "textPreparedSelectionState", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V", "selectAll", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "deselect", "moveCursorLeftByChar", "moveCursorRightByChar", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "or", "collapseLeftOr", "(Lr6/c;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "collapseRightOr", "", "getPrecedingCharacterIndex", "()I", "getNextCharacterIndex", "moveCursorPrevByChar", "moveCursorNextByChar", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "moveCursorNextByWord", "moveCursorPrevByWord", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorToLineEnd", "moveCursorUpByPage", "moveCursorDownByPage", "selectMovement", "deleteMovement", "resetCachedX", "block", "applyIfNotEmpty", "(ZLr6/c;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "Lkotlin/Function0;", "proposedCursorMovement", "moveCursorTo", "(ZLr6/a;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "isLtr", "()Z", "currentOffset", "getNextWordOffsetForLayout", "(Landroidx/compose/ui/text/TextLayoutResult;I)I", "getPrevWordOffsetForLayout", "getLineStartByOffsetForLayout", "getLineEndByOffsetForLayout", "linesAmount", "jumpByLinesOffset", "pagesAmount", "jumpByPagesOffset", "(I)I", TypedValues.CycleType.S_WAVE_OFFSET, "charOffset", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroidx/compose/ui/text/TextLayoutResult;", "Z", "F", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "initialWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "getInitialWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "Landroidx/compose/ui/text/TextRange;", "selection", "J", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "getWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "setWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "", "text", "Ljava/lang/String;", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n126#1,11:569\n126#1,11:580\n126#1,11:591\n126#1,11:602\n130#1,7:613\n196#1,5:620\n130#1,5:625\n201#1,15:630\n136#1:645\n196#1,5:646\n130#1,5:651\n201#1,15:656\n136#1:671\n196#1,5:672\n130#1,5:677\n201#1,15:682\n136#1:697\n196#1,5:698\n130#1,5:703\n201#1,15:708\n136#1:723\n196#1,5:724\n130#1,5:729\n201#1,15:734\n136#1:749\n196#1,5:750\n130#1,5:755\n201#1,15:760\n136#1:775\n196#1,5:776\n130#1,5:781\n201#1,15:786\n136#1:801\n196#1,5:802\n130#1,5:807\n201#1,15:812\n136#1:827\n200#1:828\n130#1,5:829\n201#1,15:834\n136#1:849\n200#1:850\n130#1,5:851\n201#1,15:856\n136#1:871\n196#1,5:872\n130#1,5:877\n201#1,15:882\n136#1:897\n196#1,5:898\n130#1,5:903\n201#1,15:908\n136#1:923\n200#1:924\n130#1,5:925\n201#1,15:930\n136#1:945\n200#1:946\n130#1,5:947\n201#1,15:952\n136#1:967\n130#1,7:968\n130#1,7:975\n602#2,8:561\n30#3:982\n53#4,3:983\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n*L\n139#1:569,11\n141#1:580,11\n158#1:591,11\n171#1:602,11\n200#1:613,7\n217#1:620,5\n217#1:625,5\n217#1:630,15\n217#1:645\n219#1:646,5\n219#1:651,5\n219#1:656,15\n219#1:671\n221#1:672,5\n221#1:677,5\n221#1:682,15\n221#1:697\n223#1:698,5\n223#1:703,5\n223#1:708,15\n223#1:723\n239#1:724,5\n239#1:729,5\n239#1:734,15\n239#1:749\n243#1:750,5\n243#1:755,5\n243#1:760,15\n243#1:775\n247#1:776,5\n247#1:781,5\n247#1:786,15\n247#1:801\n255#1:802,5\n255#1:807,5\n255#1:812,15\n255#1:827\n264#1:828\n264#1:829,5\n264#1:834,15\n264#1:849\n267#1:850\n267#1:851,5\n267#1:856,15\n267#1:871\n283#1:872,5\n283#1:877,5\n283#1:882,15\n283#1:897\n287#1:898,5\n287#1:903,5\n287#1:908,15\n287#1:923\n292#1:924\n292#1:925,5\n292#1:930,15\n292#1:945\n295#1:946\n295#1:947,5\n295#1:952,15\n295#1:967\n299#1:968,7\n304#1:975,7\n106#1:561,8\n395#1:982\n395#1:983,3\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection {
    public static final int NoCharacterFound = -1;

    @NotNull
    private final TextFieldCharSequence initialValue;

    @NotNull
    private final SelectionWedgeAffinity initialWedgeAffinity;
    private final boolean isFromSoftKeyboard;
    private long selection;

    @NotNull
    private final TransformedTextFieldState state;

    @NotNull
    private final String text;

    @Nullable
    private final TextLayoutResult textLayoutResult;

    @NotNull
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;

    @Nullable
    private WedgeAffinity wedgeAffinity;
    public static final int $stable = 8;

    public TextFieldPreparedSelection(@NotNull TransformedTextFieldState transformedTextFieldState, @Nullable TextLayoutResult textLayoutResult, boolean z8, float f, @NotNull TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z8;
        this.visibleTextLayoutHeight = f;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC6471c readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            this.initialValue = visualText;
            this.initialWedgeAffinity = transformedTextFieldState.getSelectionWedgeAffinity();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.selection = visualText.getSelection();
            this.text = visualText.getText().toString();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean resetCachedX, InterfaceC6471c block) {
        if (resetCachedX) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            block.invoke(this);
        }
        return this;
    }

    public static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        if (z8) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            interfaceC6471c.invoke(textFieldPreparedSelection);
        }
        return textFieldPreparedSelection;
    }

    private final int charOffset(int offset) {
        int length = this.text.length() - 1;
        return offset > length ? length : offset;
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true);
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = TextRange.m12767getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i));
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = TextRange.m12768getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i < this.initialValue.length()) {
            long jM12742getWordBoundaryjx7JFs = textLayoutResult.m12742getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m12765getEndimpl(jM12742getWordBoundaryjx7JFs) > i) {
                return TextRange.m12765getEndimpl(jM12742getWordBoundaryjx7JFs);
            }
            i++;
        }
        return this.initialValue.length();
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = TextRange.m12765getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i > 0) {
            long jM12742getWordBoundaryjx7JFs = textLayoutResult.m12742getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m12770getStartimpl(jM12742getWordBoundaryjx7JFs) < i) {
                return TextRange.m12770getStartimpl(jM12742getWordBoundaryjx7JFs);
            }
            i--;
        }
        return 0;
    }

    public static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = TextRange.m12765getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i);
    }

    private final boolean isLtr() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (paragraphDirection = textLayoutResult.getParagraphDirection(TextRange.m12765getEndimpl(this.selection))) == null || paragraphDirection == ResolvedTextDirection.Ltr;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int iM12765getEndimpl = TextRange.m12765getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(iM12765getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iM12765getEndimpl) + i;
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
        return textLayoutResult.m12740getOffsetForPositionk4lQ0M(Offset.m10433constructorimpl((Float.floatToRawIntBits(cachedX) << 32) | (Float.floatToRawIntBits(lineBottom) & 4294967295L)));
    }

    private final int jumpByPagesOffset(int pagesAmount) {
        int iM12765getEndimpl = TextRange.m12765getEndimpl(this.initialValue.getSelection());
        if (this.textLayoutResult == null || Float.isNaN(this.visibleTextLayoutHeight)) {
            return iM12765getEndimpl;
        }
        Rect rectTranslate = this.textLayoutResult.getCursorRect(iM12765getEndimpl).translate(0.0f, this.visibleTextLayoutHeight * pagesAmount);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(rectTranslate.getTop()));
        return Math.abs(rectTranslate.getTop() - lineBottom) > Math.abs(rectTranslate.getBottom() - lineBottom) ? this.textLayoutResult.m12740getOffsetForPositionk4lQ0M(rectTranslate.m10476getTopLeftF1C5BW0()) : this.textLayoutResult.m12740getOffsetForPositionk4lQ0M(rectTranslate.m10469getBottomLeftF1C5BW0());
    }

    private final TextFieldPreparedSelection moveCursorTo(boolean resetCachedX, InterfaceC6469a proposedCursorMovement) {
        if (resetCachedX) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) proposedCursorMovement.invoke()).intValue(), iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    public static /* synthetic */ TextFieldPreparedSelection moveCursorTo$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z8, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        if (z8) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(textFieldPreparedSelection.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) interfaceC6469a.invoke()).intValue(), iM12765getEndimpl, textFieldPreparedSelection.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(textFieldPreparedSelection.getSelection())) {
                textFieldPreparedSelection.m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                textFieldPreparedSelection.setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return textFieldPreparedSelection;
    }

    @NotNull
    public final TextFieldPreparedSelection collapseLeftOr(@NotNull InterfaceC6471c or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m12764getCollapsedimpl(this.selection)) {
                or.invoke(this);
                return this;
            }
            if (isLtr()) {
                this.selection = TextRangeKt.TextRange(TextRange.m12768getMinimpl(this.selection));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m12767getMaximpl(this.selection));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection collapseRightOr(@NotNull InterfaceC6471c or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m12764getCollapsedimpl(this.selection)) {
                or.invoke(this);
                return this;
            }
            if (isLtr()) {
                this.selection = TextRangeKt.TextRange(TextRange.m12767getMaximpl(this.selection));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m12768getMinimpl(this.selection));
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection deleteMovement() {
        if (this.text.length() > 0) {
            if (TextRange.m12764getCollapsedimpl(this.initialValue.getSelection())) {
                TransformedTextFieldState.m7882replaceTextM8tDOmk$default(this.state, "", TextRangeKt.TextRange(TextRange.m12770getStartimpl(this.initialValue.getSelection()), TextRange.m12765getEndimpl(this.selection)), null, !this.isFromSoftKeyboard, 4, null);
            } else {
                this.state.deleteSelectedText();
            }
            this.selection = this.state.getVisualText().getSelection();
            this.wedgeAffinity = WedgeAffinity.Start;
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m12765getEndimpl(this.selection));
        }
        return this;
    }

    @NotNull
    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    @NotNull
    public final SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m12765getEndimpl(this.selection));
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m12765getEndimpl(this.selection));
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    @Nullable
    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorDownByLine() {
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, 1) : this.text.length(), iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(1), iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorLeftByChar() {
        return isLtr() ? moveCursorPrevByChar() : moveCursorNextByChar();
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        return isLtr() ? moveCursorPrevByWord() : moveCursorNextByWord();
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorNextByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m12765getEndimpl(this.selection)), iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            int iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m12767getMaximpl(this.selection));
            if (iFindParagraphEnd == TextRange.m12767getMaximpl(this.selection) && iFindParagraphEnd != this.text.length()) {
                iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, iFindParagraphEnd + 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(iFindParagraphEnd, iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorPrevByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m12765getEndimpl(this.selection)), iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            int iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m12768getMinimpl(this.selection));
            if (iFindParagraphStart == TextRange.m12768getMinimpl(this.selection) && iFindParagraphStart != 0) {
                iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, iFindParagraphStart - 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(iFindParagraphStart, iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getPrevWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorRightByChar() {
        return isLtr() ? moveCursorNextByChar() : moveCursorPrevByChar();
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorRightByWord() {
        return isLtr() ? moveCursorNextByWord() : moveCursorPrevByWord();
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(this.text.length(), iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(0, iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        return isLtr() ? moveCursorToLineStart() : moveCursorToLineEnd();
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        return isLtr() ? moveCursorToLineEnd() : moveCursorToLineStart();
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorUpByLine() {
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, -1) : 0, iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if (this.text.length() > 0) {
            int iM12765getEndimpl = TextRange.m12765getEndimpl(getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(-1), iM12765getEndimpl, this.state);
            int iM7897component1impl = CursorAndWedgeAffinity.m7897component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM7898component2impl = CursorAndWedgeAffinity.m7898component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM7897component1impl != iM12765getEndimpl || !TextRange.m12764getCollapsedimpl(getSelection())) {
                m7924setSelection5zctL8(TextRangeKt.TextRange(iM7897component1impl));
            }
            if (wedgeAffinityM7898component2impl != null) {
                setWedgeAffinity(wedgeAffinityM7898component2impl);
            }
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    @NotNull
    public final TextFieldPreparedSelection selectMovement() {
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m12770getStartimpl(this.initialValue.getSelection()), TextRange.m12765getEndimpl(this.selection));
        }
        return this;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m7924setSelection5zctL8(long j7) {
        this.selection = j7;
    }

    public final void setWedgeAffinity(@Nullable WedgeAffinity wedgeAffinity) {
        this.wedgeAffinity = wedgeAffinity;
    }
}
