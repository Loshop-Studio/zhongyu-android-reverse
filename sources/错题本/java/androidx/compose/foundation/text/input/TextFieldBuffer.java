package androidx.compose.foundation.text.input;

import android.support.v4.media.AbstractC0037f;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0086\u0001B3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010%\u001a\u00020\u0010H\u0000¢\u0006\u0004\b$\u0010\u0012J%\u0010(\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J;\u0010(\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020\u00142\b\b\u0002\u0010+\u001a\u00020\u0014H\u0000¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u00020\u00102\u0006\u0010.\u001a\u00020&H\u0000¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00060\u0001j\u0002`\u00022\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b2\u00103J-\u00102\u001a\u00060\u0001j\u0002`\u00022\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b2\u00104J\u001b\u00102\u001a\u00060\u0001j\u0002`\u00022\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b2\u00107J\u0015\u00109\u001a\u0002052\u0006\u00108\u001a\u00020\u0014¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020&¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0010¢\u0006\u0004\b@\u0010\u0012J\u0015\u0010A\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0014¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0014¢\u0006\u0004\bC\u0010BJD\u0010J\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020D2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010D2\u001a\b\u0002\u0010G\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a\u0018\u00010\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ'\u0010N\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u00142\u0006\u0010L\u001a\u00020\u00142\u0006\u0010M\u001a\u00020\u0014H\u0002¢\u0006\u0004\bN\u0010\"J\u000f\u0010O\u001a\u00020\u0010H\u0002¢\u0006\u0004\bO\u0010\u0012J'\u0010R\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00142\u0006\u0010P\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010SJ\u001a\u0010W\u001a\u00020\u00102\u0006\u0010T\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bU\u0010VR\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010X\u001a\u0004\bY\u0010ZR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010a\u001a\u00020D8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\ba\u0010bR4\u0010F\u001a\u0004\u0018\u00010D2\b\u0010c\u001a\u0004\u0018\u00010D8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR@\u0010G\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010i2\u0014\u0010j\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010i8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bG\u0010k\u001a\u0004\bl\u0010mR@\u0010o\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020D\u0018\u00010n2\u0014\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020D\u0018\u00010n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0011\u0010x\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0011\u0010z\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\by\u0010?R\u0017\u0010}\u001a\u00020D8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b{\u0010|R\u001d\u0010\u0082\u0001\u001a\u00020~8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0081\u0001\u0010\u0012\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0013\u0010\u0083\u0001\u001a\u00020\f8G¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u000eR,\u0010E\u001a\u00020D2\u0006\u0010c\u001a\u00020D8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010|\"\u0005\b\u0085\u0001\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialValue", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "initialChanges", "originalValue", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "offsetMappingCalculator", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "", "hasComposition$foundation_release", "()Z", "hasComposition", "Ld6/s;", "commitComposition$foundation_release", "()V", "commitComposition", "", "start", "end", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "annotations", "setComposition$foundation_release", "(IILjava/util/List;)V", "setComposition", "Landroidx/compose/foundation/text/input/TextHighlightType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "setHighlight-K7f2yys$foundation_release", "(III)V", "setHighlight", "clearHighlight$foundation_release", "clearHighlight", "", "text", "replace", "(IILjava/lang/CharSequence;)V", "textStart", "textEnd", "replace$foundation_release", "(IILjava/lang/CharSequence;II)V", "newText", "setTextIfChanged$foundation_release", "(Ljava/lang/CharSequence;)V", "setTextIfChanged", RequestParameters.SUBRESOURCE_APPEND, "(Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "", "char", "(C)Ljava/lang/Appendable;", "index", "charAt", "(I)C", "", "toString", "()Ljava/lang/String;", "asCharSequence", "()Ljava/lang/CharSequence;", "revertAllChanges", "placeCursorBeforeCharAt", "(I)V", "placeCursorAfterCharAt", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "composingAnnotations", "toTextFieldCharSequence-I88jaVs$foundation_release", "(JLandroidx/compose/ui/text/TextRange;Ljava/util/List;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "toTextFieldCharSequence", "replaceStart", "replaceEnd", "newLength", "onTextWillChange", "clearChangeList", "startExclusive", "endExclusive", "requireValidIndex", "(IZZ)V", "range", "requireValidRange-5zc-tL8", "(J)V", "requireValidRange", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getOriginalValue$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "buffer", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "backingChangeTracker", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "selectionInChars", "J", "value", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA$foundation_release", "()Landroidx/compose/ui/text/TextRange;", "setComposition-OEnZFl4", "(Landroidx/compose/ui/text/TextRange;)V", "Landroidx/compose/runtime/collection/MutableVector;", "<set-?>", "Landroidx/compose/runtime/collection/MutableVector;", "getComposingAnnotations$foundation_release", "()Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Pair;", "highlight", "Lkotlin/Pair;", "getHighlight$foundation_release", "()Lkotlin/Pair;", "getChangeTracker$foundation_release", "()Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "changeTracker", "getLength", "()I", "length", "getOriginalText", "originalText", "getOriginalSelection-d9O1mEE", "()J", "originalSelection", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "getChanges", "()Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "getChanges$annotations", "changes", "hasSelection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "ChangeList", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,721:1\n1#2:722\n1095#3,3:723\n1101#3:726\n1083#3,2:727\n34#4,6:729\n96#5,5:735\n96#5,5:740\n96#5,5:790\n96#5,5:795\n666#6,45:745\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n*L\n168#1:723,3\n220#1:726\n220#1:727,2\n222#1:729,6\n306#1:735,5\n307#1:740,5\n465#1:790,5\n470#1:795,5\n322#1:745,45\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;

    @Nullable
    private ChangeTracker backingChangeTracker;

    @NotNull
    private final PartialGapBuffer buffer;

    @Nullable
    private MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;

    @Nullable
    private TextRange composition;

    @Nullable
    private Pair<TextHighlightType, TextRange> highlight;

    @Nullable
    private final OffsetMappingCalculator offsetMappingCalculator;

    @NotNull
    private final TextFieldCharSequence originalValue;
    private long selectionInChars;

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "", "changeCount", "", "getChangeCount", "()I", "getOriginalRange", "Landroidx/compose/ui/text/TextRange;", "changeIndex", "getOriginalRange--jx7JFs", "(I)J", "getRange", "getRange--jx7JFs", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface ChangeList {
        int getChangeCount();

        /* renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo7747getOriginalRangejx7JFs(int changeIndex);

        /* renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo7748getRangejx7JFs(int changeIndex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldBuffer(@NotNull final TextFieldCharSequence textFieldCharSequence, @Nullable ChangeTracker changeTracker, @NotNull TextFieldCharSequence textFieldCharSequence2, @Nullable OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = null;
        this.backingChangeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.getSelection();
        this.composition = textFieldCharSequence.getComposition();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations = textFieldCharSequence.getComposingAnnotations();
        if (composingAnnotations != null && !composingAnnotations.isEmpty()) {
            int size = textFieldCharSequence.getComposingAnnotations().size();
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.TextFieldBuffer$composingAnnotations$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final AnnotatedString.Range<AnnotatedString.Annotation> invoke(int i) {
                    return textFieldCharSequence.getComposingAnnotations().get(i);
                }
            };
            AnnotatedString.Range[] rangeArr = new AnnotatedString.Range[size];
            for (int i = 0; i < size; i++) {
                rangeArr[i] = interfaceC6471c.invoke(Integer.valueOf(i));
            }
            mutableVector = new MutableVector<>(rangeArr, size);
        }
        this.composingAnnotations = mutableVector;
    }

    private final void clearChangeList() {
        getChangeTracker$foundation_release().clearChanges();
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getChanges$annotations() {
    }

    private final void onTextWillChange(int replaceStart, int replaceEnd, int newLength) {
        getChangeTracker$foundation_release().trackChange(replaceStart, replaceEnd, newLength);
        OffsetMappingCalculator offsetMappingCalculator = this.offsetMappingCalculator;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.recordEditOperation(replaceStart, replaceEnd, newLength);
        }
        this.selectionInChars = TextFieldBufferKt.m7749adjustTextRangevJH6DeI(getSelectionInChars(), replaceStart, replaceEnd, newLength);
    }

    public static /* synthetic */ void replace$foundation_release$default(TextFieldBuffer textFieldBuffer, int i, int i8, CharSequence charSequence, int i9, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i9 = 0;
        }
        int i12 = i9;
        if ((i11 & 16) != 0) {
            i10 = charSequence.length();
        }
        textFieldBuffer.replace$foundation_release(i, i8, charSequence, i12, i10);
    }

    private final void requireValidIndex(int index, boolean startExclusive, boolean endExclusive) {
        boolean z8 = false;
        int i = startExclusive ? 0 : -1;
        int length = endExclusive ? getLength() : getLength() + 1;
        if (i <= index && index < length) {
            z8 = true;
        }
        if (z8) {
            return;
        }
        StringBuilder sbM99x = AbstractC0037f.m99x("Expected ", " to be in [", index, ", ", i);
        sbM99x.append(length);
        sbM99x.append(')');
        InlineClassHelperKt.throwIllegalArgumentException(sbM99x.toString());
    }

    /* renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m7738requireValidRange5zctL8(long range) {
        long jTextRange = TextRangeKt.TextRange(0, getLength());
        if (TextRange.m12760contains5zctL8(jTextRange, range)) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected " + ((Object) TextRange.m12773toStringimpl(range)) + " to be in " + ((Object) TextRange.m12773toStringimpl(jTextRange)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setComposition$foundation_release$default(TextFieldBuffer textFieldBuffer, int i, int i8, List list, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            list = null;
        }
        textFieldBuffer.setComposition$foundation_release(i, i8, list);
    }

    /* renamed from: setComposition-OEnZFl4, reason: not valid java name */
    private final void m7739setCompositionOEnZFl4(TextRange textRange) {
        if (textRange != null && !TextRange.m12764getCollapsedimpl(textRange.getPackedValue())) {
            this.composition = textRange;
            return;
        }
        this.composition = null;
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: toTextFieldCharSequence-I88jaVs$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m7740toTextFieldCharSequenceI88jaVs$foundation_release$default(TextFieldBuffer textFieldBuffer, long j7, TextRange textRange, List list, int i, Object obj) {
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector;
        if ((i & 1) != 0) {
            j7 = textFieldBuffer.getSelectionInChars();
        }
        if ((i & 2) != 0) {
            textRange = textFieldBuffer.composition;
        }
        if ((i & 4) != 0 && ((mutableVector = textFieldBuffer.composingAnnotations) == null || (list = mutableVector.asMutableList()) == null || list.isEmpty())) {
            list = null;
        }
        return textFieldBuffer.m7746toTextFieldCharSequenceI88jaVs$foundation_release(j7, textRange, list);
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence text) {
        if (text != null) {
            onTextWillChange(getLength(), getLength(), text.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), text, 0, 0, 24, null);
        }
        return this;
    }

    @NotNull
    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    public final char charAt(int index) {
        return this.buffer.charAt(index);
    }

    public final void clearHighlight$foundation_release() {
        this.highlight = null;
    }

    public final void commitComposition$foundation_release() {
        m7739setCompositionOEnZFl4(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ChangeTracker getChangeTracker$foundation_release() {
        ChangeTracker changeTracker = this.backingChangeTracker;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.backingChangeTracker = changeTracker2;
        return changeTracker2;
    }

    @NotNull
    public final ChangeList getChanges() {
        return getChangeTracker$foundation_release();
    }

    @Nullable
    public final MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations$foundation_release() {
        return this.composingAnnotations;
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA$foundation_release, reason: not valid java name and from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    @Nullable
    public final Pair<TextHighlightType, TextRange> getHighlight$foundation_release() {
        return this.highlight;
    }

    public final int getLength() {
        return this.buffer.length();
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m7742getOriginalSelectiond9O1mEE() {
        return this.originalValue.getSelection();
    }

    @NotNull
    public final CharSequence getOriginalText() {
        return this.originalValue.getText();
    }

    @NotNull
    /* renamed from: getOriginalValue$foundation_release, reason: from getter */
    public final TextFieldCharSequence getOriginalValue() {
        return this.originalValue;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelectionInChars() {
        return this.selectionInChars;
    }

    public final boolean hasComposition$foundation_release() {
        return this.composition != null;
    }

    @JvmName(name = "hasSelection")
    public final boolean hasSelection() {
        return !TextRange.m12764getCollapsedimpl(getSelectionInChars());
    }

    public final void placeCursorAfterCharAt(int index) {
        requireValidIndex(index, false, true);
        int i = index + 1;
        int length = getLength();
        if (i > length) {
            i = length;
        }
        this.selectionInChars = TextRangeKt.TextRange(i);
    }

    public final void placeCursorBeforeCharAt(int index) {
        requireValidIndex(index, true, false);
        this.selectionInChars = TextRangeKt.TextRange(index);
    }

    public final void replace(int start, int end, @NotNull CharSequence text) {
        replace$foundation_release(start, end, text, 0, text.length());
    }

    public final void replace$foundation_release(int start, int end, @NotNull CharSequence text, int textStart, int textEnd) {
        if (!(start <= end)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected start=" + start + " <= end=" + end);
        }
        if (!(textStart <= textEnd)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected textStart=" + textStart + " <= textEnd=" + textEnd);
        }
        onTextWillChange(start, end, textEnd - textStart);
        this.buffer.replace(start, end, text, textStart, textEnd);
        commitComposition$foundation_release();
        clearHighlight$foundation_release();
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.originalValue.toString());
        m7745setSelection5zctL8(this.originalValue.getSelection());
        clearChangeList();
    }

    public final void setComposition$foundation_release(int start, int end, @Nullable List<AnnotatedString.Range<AnnotatedString.Annotation>> annotations) {
        if (start < 0 || start > this.buffer.length()) {
            StringBuilder sbM94s = AbstractC0037f.m94s(start, "start (", ") offset is outside of text region ");
            sbM94s.append(this.buffer.length());
            throw new IndexOutOfBoundsException(sbM94s.toString());
        }
        if (end < 0 || end > this.buffer.length()) {
            StringBuilder sbM94s2 = AbstractC0037f.m94s(end, "end (", ") offset is outside of text region ");
            sbM94s2.append(this.buffer.length());
            throw new IndexOutOfBoundsException(sbM94s2.toString());
        }
        if (start >= end) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(start, end, "Do not set reversed or empty range: ", " > "));
        }
        m7739setCompositionOEnZFl4(TextRange.m12758boximpl(TextRangeKt.TextRange(start, end)));
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
        if (annotations == null || annotations.isEmpty()) {
            return;
        }
        if (this.composingAnnotations == null) {
            this.composingAnnotations = new MutableVector<>(new AnnotatedString.Range[16], 0);
        }
        int size = annotations.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<AnnotatedString.Annotation> range = annotations.get(i);
            MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector2 = this.composingAnnotations;
            if (mutableVector2 != null) {
                mutableVector2.add(AnnotatedString.Range.copy$default(range, null, range.getStart() + start, range.getEnd() + start, null, 9, null));
            }
        }
    }

    /* renamed from: setHighlight-K7f2yys$foundation_release, reason: not valid java name */
    public final void m7744setHighlightK7f2yys$foundation_release(int type, int start, int end) {
        if (start >= end) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(start, end, "Do not set reversed or empty range: ", " > "));
        }
        this.highlight = new Pair<>(TextHighlightType.m7757boximpl(type), TextRange.m12758boximpl(TextRangeKt.TextRange(AbstractC5806u.m5274m(start, 0, getLength()), AbstractC5806u.m5274m(end, 0, getLength()))));
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m7745setSelection5zctL8(long j7) {
        m7738requireValidRange5zctL8(j7);
        this.selectionInChars = j7;
        this.highlight = null;
    }

    public final void setTextIfChanged$foundation_release(@NotNull CharSequence newText) {
        int i;
        int i8;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = newText.length();
        boolean z8 = false;
        if (partialGapBuffer.length() <= 0 || newText.length() <= 0) {
            i = 0;
            i8 = 0;
        } else {
            int i9 = 0;
            int i10 = 0;
            boolean z9 = false;
            while (true) {
                if (!z8) {
                    if (partialGapBuffer.charAt(i9) == newText.charAt(i10)) {
                        i9++;
                        i10++;
                    } else {
                        z8 = true;
                    }
                }
                if (!z9) {
                    if (partialGapBuffer.charAt(length - 1) == newText.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z9 = true;
                    }
                }
                if (i9 >= length || i10 >= length2 || (z8 && z9)) {
                    break;
                }
            }
            i = i9;
            i8 = i10;
        }
        int i11 = length;
        int i12 = length2;
        if (i < i11 || i8 < i12) {
            replace$foundation_release(i, i11, newText, i8, i12);
        }
    }

    @NotNull
    public String toString() {
        return this.buffer.toString();
    }

    @NotNull
    /* renamed from: toTextFieldCharSequence-I88jaVs$foundation_release, reason: not valid java name */
    public final TextFieldCharSequence m7746toTextFieldCharSequenceI88jaVs$foundation_release(long selection, @Nullable TextRange composition, @Nullable List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations) {
        return new TextFieldCharSequence(this.buffer.toString(), selection, composition, null, composingAnnotations, 8, null);
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence text, int start, int end) {
        if (text != null) {
            onTextWillChange(getLength(), getLength(), end - start);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), text.subSequence(start, end), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(char c) {
        onTextWillChange(getLength(), getLength(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(c), 0, 0, 24, null);
        return this;
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i, AbstractC5824e abstractC5824e) {
        this(textFieldCharSequence, (i & 2) != 0 ? null : changeTracker, (i & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i & 8) != 0 ? null : offsetMappingCalculator);
    }
}
