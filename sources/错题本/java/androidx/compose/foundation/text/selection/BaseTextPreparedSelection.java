package androidx.compose.foundation.text.selection;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bO\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000 l*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001lB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0001\u0010\u000f*\u00028\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014H\u0084\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00028\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00028\u0000¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010!J&\u0010&\u001a\u00028\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b&\u0010'J&\u0010(\u001a\u00028\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0018¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00028\u0000¢\u0006\u0004\b,\u0010!J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010!J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010!J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010!J\u000f\u00100\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b2\u00101J\r\u00103\u001a\u00028\u0000¢\u0006\u0004\b3\u0010!J\r\u00104\u001a\u00028\u0000¢\u0006\u0004\b4\u0010!J\r\u00105\u001a\u00028\u0000¢\u0006\u0004\b5\u0010!J\r\u00106\u001a\u00028\u0000¢\u0006\u0004\b6\u0010!J\u000f\u00107\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b7\u00101J\r\u00108\u001a\u00028\u0000¢\u0006\u0004\b8\u0010!J\u000f\u00109\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b9\u00101J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010!J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010!J\r\u0010<\u001a\u00028\u0000¢\u0006\u0004\b<\u0010!J\r\u0010=\u001a\u00028\u0000¢\u0006\u0004\b=\u0010!J\u000f\u0010>\u001a\u00028\u0000H\u0002¢\u0006\u0004\b>\u0010!J\u000f\u0010?\u001a\u00028\u0000H\u0002¢\u0006\u0004\b?\u0010!J\u000f\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0004\b@\u0010!J\u000f\u0010A\u001a\u00028\u0000H\u0002¢\u0006\u0004\bA\u0010!J\u000f\u0010B\u001a\u00020\u0010H\u0002¢\u0006\u0004\bB\u0010CJ\u001e\u0010E\u001a\u00020\u0018*\u00020\u00072\b\b\u0002\u0010D\u001a\u00020\u0018H\u0082\u0010¢\u0006\u0004\bE\u0010FJ\u001e\u0010G\u001a\u00020\u0018*\u00020\u00072\b\b\u0002\u0010D\u001a\u00020\u0018H\u0082\u0010¢\u0006\u0004\bG\u0010FJ\u001d\u0010H\u001a\u00020\u0018*\u00020\u00072\b\b\u0002\u0010D\u001a\u00020\u0018H\u0002¢\u0006\u0004\bH\u0010FJ\u001d\u0010I\u001a\u00020\u0018*\u00020\u00072\b\b\u0002\u0010D\u001a\u00020\u0018H\u0002¢\u0006\u0004\bI\u0010FJ\u001b\u0010K\u001a\u00020\u0018*\u00020\u00072\u0006\u0010J\u001a\u00020\u0018H\u0002¢\u0006\u0004\bK\u0010FJ\u000f\u0010L\u001a\u00020\u0018H\u0002¢\u0006\u0004\bL\u0010*J\u000f\u0010M\u001a\u00020\u0018H\u0002¢\u0006\u0004\bM\u0010*J\u000f\u0010N\u001a\u00020\u0018H\u0002¢\u0006\u0004\bN\u0010*J\u0017\u0010O\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010]\u001a\u0004\b^\u0010_R(\u0010`\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b`\u0010T\u001a\u0004\ba\u0010V\"\u0004\bb\u0010cR\"\u0010d\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010Q\u001a\u0004\be\u0010S\"\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020h8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006m"}, m5110d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/e;)V", "U", "", "resetCachedX", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;ZLr6/c;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "", TypedValues.CycleType.S_WAVE_OFFSET, "setCursor", "(I)V", "start", "end", "setSelection", "(II)V", "selectAll", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "deselect", "moveCursorLeft", "moveCursorRight", "or", "collapseLeftOr", "(Lr6/c;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "getPrecedingCharacterIndex", "()I", "getNextCharacterIndex", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "()Ljava/lang/Integer;", "getPreviousWordOffset", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "moveCursorPrev", "moveCursorNext", "moveCursorNextByWord", "moveCursorPrevByWord", "isLtr", "()Z", "currentOffset", "getNextWordOffsetForLayout", "(Landroidx/compose/ui/text/TextLayoutResult;I)I", "getPrevWordOffset", "getLineStartByOffsetForLayout", "getLineEndByOffsetForLayout", "linesAmount", "jumpByLinesOffset", "transformedEndOffset", "transformedMinOffset", "transformedMaxOffset", "charOffset", "(I)I", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "J", "getOriginalSelection-d9O1mEE", "()J", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "selection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "annotatedString", "getAnnotatedString", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "getText$foundation_release", "()Ljava/lang/String;", "text", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,401:1\n73#1,8:402\n73#1,8:410\n73#1,8:418\n73#1,8:426\n73#1,8:434\n73#1,8:442\n73#1,8:450\n73#1,8:458\n73#1,8:466\n73#1,8:474\n73#1,8:482\n73#1,8:490\n73#1,6:498\n80#1:505\n73#1,8:506\n73#1,8:514\n73#1,8:522\n74#1,7:530\n74#1,7:537\n73#1,8:544\n73#1,8:552\n73#1,8:560\n73#1,8:568\n74#1,7:576\n1#2:504\n30#3:583\n53#4,3:584\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:402,8\n93#1:410,8\n95#1:418,8\n103#1:426,8\n112#1:434,8\n125#1:442,8\n146#1:450,8\n151#1:458,8\n156#1:466,8\n158#1:474,8\n160#1:482,8\n168#1:490,8\n178#1:498,6\n178#1:505\n182#1:506,8\n184#1:514,8\n192#1:522,8\n201#1:530,7\n204#1:537,7\n208#1:544,8\n212#1:552,8\n214#1:560,8\n222#1:568,8\n232#1:576,7\n310#1:583\n310#1:584,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final int NoCharacterFound = -1;

    @NotNull
    private AnnotatedString annotatedString;

    @Nullable
    private final TextLayoutResult layoutResult;

    @NotNull
    private final OffsetMapping offsetMapping;
    private final long originalSelection;

    @NotNull
    private final AnnotatedString originalText;
    private long selection;

    @NotNull
    private final TextPreparedSelectionState state;
    public static final int $stable = 8;

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j7, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, AbstractC5824e abstractC5824e) {
        this(annotatedString, j7, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i & 1) != 0) {
            z8 = true;
        }
        if (z8) {
            baseTextPreparedSelection.getState().resetCachedX();
        }
        if (baseTextPreparedSelection.getText$foundation_release().length() > 0) {
            interfaceC6471c.invoke(obj);
        }
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection) obj;
    }

    private final int charOffset(int offset) {
        int length = getText$foundation_release().length() - 1;
        return offset > length ? length : offset;
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true));
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i8 & 1) != 0) {
            i = baseTextPreparedSelection.transformedMaxOffset();
        }
        return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i)));
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i8 & 1) != 0) {
            i = baseTextPreparedSelection.transformedMinOffset();
        }
        return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i < this.originalText.length()) {
            long jM12742getWordBoundaryjx7JFs = textLayoutResult.m12742getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m12765getEndimpl(jM12742getWordBoundaryjx7JFs) > i) {
                return this.offsetMapping.transformedToOriginal(TextRange.m12765getEndimpl(jM12742getWordBoundaryjx7JFs));
            }
            i++;
        }
        return this.originalText.length();
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i8 & 1) != 0) {
            i = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i) {
        while (i > 0) {
            long jM12742getWordBoundaryjx7JFs = textLayoutResult.m12742getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m12770getStartimpl(jM12742getWordBoundaryjx7JFs) < i) {
                return this.offsetMapping.transformedToOriginal(TextRange.m12770getStartimpl(jM12742getWordBoundaryjx7JFs));
            }
            i--;
        }
        return 0;
    }

    public static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i8 & 1) != 0) {
            i = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i);
    }

    private final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.getParagraphDirection(transformedEndOffset()) : null) != ResolvedTextDirection.Rtl;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int iTransformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(iTransformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iTransformedEndOffset) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        AbstractC5830k.m5327d(cachedX);
        float fFloatValue = cachedX.floatValue();
        if ((isLtr() && fFloatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && fFloatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m12740getOffsetForPositionk4lQ0M(Offset.m10433constructorimpl((Float.floatToRawIntBits(cachedX.floatValue()) << 32) | (Float.floatToRawIntBits(lineBottom) & 4294967295L))));
    }

    private final T moveCursorNext() {
        int nextCharacterIndex;
        if (AbstractC0584a.m905f(this) > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        return this;
    }

    private final T moveCursorNextByWord() {
        Integer nextWordOffset;
        if (AbstractC0584a.m905f(this) > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        return this;
    }

    private final T moveCursorPrev() {
        int precedingCharacterIndex;
        if (AbstractC0584a.m905f(this) > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        return this;
    }

    private final T moveCursorPrevByWord() {
        Integer previousWordOffset;
        if (AbstractC0584a.m905f(this) > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        return this;
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m12765getEndimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m12767getMaximpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m12768getMinimpl(this.selection));
    }

    @NotNull
    public final <U> T apply(U u8, boolean z8, @NotNull InterfaceC6471c interfaceC6471c) {
        if (z8) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            interfaceC6471c.invoke(u8);
        }
        AbstractC5830k.m5328e(u8, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u8;
    }

    @NotNull
    public final T collapseLeftOr(@NotNull InterfaceC6471c or) {
        if (AbstractC0584a.m905f(this) > 0) {
            if (TextRange.m12764getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m12768getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m12767getMaximpl(this.selection));
            }
        }
        return this;
    }

    @NotNull
    public final T collapseRightOr(@NotNull InterfaceC6471c or) {
        if (AbstractC0584a.m905f(this) > 0) {
            if (TextRange.m12764getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m12767getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m12768getMinimpl(this.selection));
            }
        }
        return this;
    }

    @NotNull
    public final T deselect() {
        if (AbstractC0584a.m905f(this) > 0) {
            setCursor(TextRange.m12765getEndimpl(this.selection));
        }
        return this;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @Nullable
    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    @Nullable
    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m12765getEndimpl(this.selection));
    }

    @Nullable
    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getOriginalSelection() {
        return this.originalSelection;
    }

    @NotNull
    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m12765getEndimpl(this.selection));
    }

    @Nullable
    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    @NotNull
    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    @NotNull
    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    @NotNull
    public final T moveCursorDownByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        return this;
    }

    @NotNull
    public final T moveCursorLeft() {
        if (AbstractC0584a.m905f(this) > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorLeftByWord() {
        if (AbstractC0584a.m905f(this) > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorNextByParagraph() {
        if (AbstractC0584a.m905f(this) > 0) {
            int iFindParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m12767getMaximpl(this.selection));
            if (iFindParagraphEnd == TextRange.m12767getMaximpl(this.selection) && iFindParagraphEnd != getText$foundation_release().length()) {
                iFindParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation_release(), iFindParagraphEnd + 1);
            }
            setCursor(iFindParagraphEnd);
        }
        return this;
    }

    @NotNull
    public final T moveCursorPrevByParagraph() {
        if (AbstractC0584a.m905f(this) > 0) {
            int iFindParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m12768getMinimpl(this.selection));
            if (iFindParagraphStart == TextRange.m12768getMinimpl(this.selection) && iFindParagraphStart != 0) {
                iFindParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation_release(), iFindParagraphStart - 1);
            }
            setCursor(iFindParagraphStart);
        }
        return this;
    }

    @NotNull
    public final T moveCursorRight() {
        if (AbstractC0584a.m905f(this) > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorRightByWord() {
        if (AbstractC0584a.m905f(this) > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToEnd() {
        if (AbstractC0584a.m905f(this) > 0) {
            setCursor(getText$foundation_release().length());
        }
        return this;
    }

    @NotNull
    public final T moveCursorToHome() {
        if (AbstractC0584a.m905f(this) > 0) {
            setCursor(0);
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineEnd() {
        Integer lineEndByOffset;
        if (AbstractC0584a.m905f(this) > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineLeftSide() {
        if (AbstractC0584a.m905f(this) > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineRightSide() {
        if (AbstractC0584a.m905f(this) > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineStart() {
        Integer lineStartByOffset;
        if (AbstractC0584a.m905f(this) > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        return this;
    }

    @NotNull
    public final T moveCursorUpByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        return this;
    }

    @NotNull
    public final T selectAll() {
        if (AbstractC0584a.m905f(this) > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        return this;
    }

    @NotNull
    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m12770getStartimpl(this.originalSelection), TextRange.m12765getEndimpl(this.selection));
        }
        return this;
    }

    public final void setAnnotatedString(@NotNull AnnotatedString annotatedString) {
        this.annotatedString = annotatedString;
    }

    public final void setCursor(int offset) {
        setSelection(offset, offset);
    }

    public final void setSelection(int start, int end) {
        this.selection = TextRangeKt.TextRange(start, end);
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m8015setSelection5zctL8(long j7) {
        this.selection = j7;
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j7, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j7;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j7;
        this.annotatedString = annotatedString;
    }
}
