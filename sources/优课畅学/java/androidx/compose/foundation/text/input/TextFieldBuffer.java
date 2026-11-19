package androidx.compose.foundation.text.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;
    private ChangeTracker backingChangeTracker;
    private final PartialGapBuffer buffer;
    private MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
    private TextRange composition;
    private Pair<TextHighlightType, TextRange> highlight;
    private final OffsetMappingCalculator offsetMappingCalculator;
    private final TextFieldCharSequence originalValue;
    private long selectionInChars;

    public interface ChangeList {
        int getChangeCount();

        /* renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo21341getOriginalRangejx7JFs(int i10);

        /* renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo21342getRangejx7JFs(int i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldBuffer(final TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = null;
        this.backingChangeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.m21345getSelectiond9O1mEE();
        this.composition = textFieldCharSequence.m21344getCompositionMzsxiRA();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations = textFieldCharSequence.getComposingAnnotations();
        if (composingAnnotations != null && !composingAnnotations.isEmpty()) {
            int size = textFieldCharSequence.getComposingAnnotations().size();
            InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.TextFieldBuffer$composingAnnotations$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final AnnotatedString.Range<AnnotatedString.Annotation> invoke(int i10) {
                    return textFieldCharSequence.getComposingAnnotations().get(i10);
                }
            };
            AnnotatedString.Range[] rangeArr = new AnnotatedString.Range[size];
            for (int i10 = 0; i10 < size; i10++) {
                rangeArr[i10] = interfaceC10570l.invoke(Integer.valueOf(i10));
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

    private final void onTextWillChange(int i10, int i11, int i12) {
        getChangeTracker$foundation_release().trackChange(i10, i11, i12);
        OffsetMappingCalculator offsetMappingCalculator = this.offsetMappingCalculator;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.recordEditOperation(i10, i11, i12);
        }
        this.selectionInChars = TextFieldBufferKt.m21343adjustTextRangevJH6DeI(m21337getSelectiond9O1mEE(), i10, i11, i12);
    }

    public static /* synthetic */ void replace$foundation_release$default(TextFieldBuffer textFieldBuffer, int i10, int i11, CharSequence charSequence, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        int i15 = i12;
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        textFieldBuffer.replace$foundation_release(i10, i11, charSequence, i15, i13);
    }

    private final void requireValidIndex(int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        int i11 = z10 ? 0 : -1;
        int length = z11 ? getLength() : getLength() + 1;
        if (i11 <= i10 && i10 < length) {
            z12 = true;
        }
        if (z12) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected " + i10 + " to be in [" + i11 + ", " + length + ')');
    }

    /* renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m21332requireValidRange5zctL8(long j10) {
        long jTextRange = TextRangeKt.TextRange(0, getLength());
        if (TextRange.m26354contains5zctL8(jTextRange, j10)) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected " + ((Object) TextRange.m26367toStringimpl(j10)) + " to be in " + ((Object) TextRange.m26367toStringimpl(jTextRange)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setComposition$foundation_release$default(TextFieldBuffer textFieldBuffer, int i10, int i11, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            list = null;
        }
        textFieldBuffer.setComposition$foundation_release(i10, i11, list);
    }

    /* renamed from: setComposition-OEnZFl4, reason: not valid java name */
    private final void m21333setCompositionOEnZFl4(TextRange textRange) {
        if (textRange != null && !TextRange.m26358getCollapsedimpl(textRange.m26368unboximpl())) {
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
    public static /* synthetic */ TextFieldCharSequence m21334toTextFieldCharSequenceI88jaVs$foundation_release$default(TextFieldBuffer textFieldBuffer, long j10, TextRange textRange, List list, int i10, Object obj) {
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector;
        if ((i10 & 1) != 0) {
            j10 = textFieldBuffer.m21337getSelectiond9O1mEE();
        }
        if ((i10 & 2) != 0) {
            textRange = textFieldBuffer.composition;
        }
        if ((i10 & 4) != 0 && ((mutableVector = textFieldBuffer.composingAnnotations) == null || (list = mutableVector.asMutableList()) == null || list.isEmpty())) {
            list = null;
        }
        return textFieldBuffer.m21340toTextFieldCharSequenceI88jaVs$foundation_release(j10, textRange, list);
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), charSequence.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    public final char charAt(int i10) {
        return this.buffer.charAt(i10);
    }

    public final void clearHighlight$foundation_release() {
        this.highlight = null;
    }

    public final void commitComposition$foundation_release() {
        m21333setCompositionOEnZFl4(null);
    }

    public final ChangeTracker getChangeTracker$foundation_release() {
        ChangeTracker changeTracker = this.backingChangeTracker;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null, 1, null);
        this.backingChangeTracker = changeTracker2;
        return changeTracker2;
    }

    public final ChangeList getChanges() {
        return getChangeTracker$foundation_release();
    }

    public final MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations$foundation_release() {
        return this.composingAnnotations;
    }

    /* renamed from: getComposition-MzsxiRA$foundation_release, reason: not valid java name */
    public final TextRange m21335getCompositionMzsxiRA$foundation_release() {
        return this.composition;
    }

    public final Pair<TextHighlightType, TextRange> getHighlight$foundation_release() {
        return this.highlight;
    }

    public final int getLength() {
        return this.buffer.length();
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m21336getOriginalSelectiond9O1mEE() {
        return this.originalValue.m21345getSelectiond9O1mEE();
    }

    public final CharSequence getOriginalText() {
        return this.originalValue.getText();
    }

    public final TextFieldCharSequence getOriginalValue$foundation_release() {
        return this.originalValue;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m21337getSelectiond9O1mEE() {
        return this.selectionInChars;
    }

    public final boolean hasComposition$foundation_release() {
        return this.composition != null;
    }

    public final boolean hasSelection() {
        return !TextRange.m26358getCollapsedimpl(m21337getSelectiond9O1mEE());
    }

    public final void placeCursorAfterCharAt(int i10) {
        requireValidIndex(i10, false, true);
        this.selectionInChars = TextRangeKt.TextRange(AbstractC8323h.m13513h(i10 + 1, getLength()));
    }

    public final void placeCursorBeforeCharAt(int i10) {
        requireValidIndex(i10, true, false);
        this.selectionInChars = TextRangeKt.TextRange(i10);
    }

    public final void replace(int i10, int i11, CharSequence charSequence) {
        replace$foundation_release(i10, i11, charSequence, 0, charSequence.length());
    }

    public final void replace$foundation_release(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (!(i10 <= i11)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected start=" + i10 + " <= end=" + i11);
        }
        if (!(i12 <= i13)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected textStart=" + i12 + " <= textEnd=" + i13);
        }
        onTextWillChange(i10, i11, i13 - i12);
        this.buffer.replace(i10, i11, charSequence, i12, i13);
        commitComposition$foundation_release();
        clearHighlight$foundation_release();
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.originalValue.toString());
        m21339setSelection5zctL8(this.originalValue.m21345getSelectiond9O1mEE());
        clearChangeList();
    }

    public final void setComposition$foundation_release(int i10, int i11, List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        if (i10 < 0 || i10 > this.buffer.length()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.buffer.length());
        }
        if (i11 < 0 || i11 > this.buffer.length()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.buffer.length());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
        }
        m21333setCompositionOEnZFl4(TextRange.m26352boximpl(TextRangeKt.TextRange(i10, i11)));
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.composingAnnotations == null) {
            this.composingAnnotations = new MutableVector<>(new AnnotatedString.Range[16], 0);
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<AnnotatedString.Annotation> range = list.get(i12);
            MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector2 = this.composingAnnotations;
            if (mutableVector2 != null) {
                mutableVector2.add(AnnotatedString.Range.copy$default(range, null, range.getStart() + i10, range.getEnd() + i10, null, 9, null));
            }
        }
    }

    /* renamed from: setHighlight-K7f2yys$foundation_release, reason: not valid java name */
    public final void m21338setHighlightK7f2yys$foundation_release(int i10, int i11, int i12) {
        if (i11 < i12) {
            this.highlight = new Pair<>(TextHighlightType.m21351boximpl(i10), TextRange.m26352boximpl(TextRangeKt.TextRange(AbstractC8323h.m13518m(i11, 0, getLength()), AbstractC8323h.m13518m(i12, 0, getLength()))));
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i11 + " > " + i12);
        }
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m21339setSelection5zctL8(long j10) {
        m21332requireValidRange5zctL8(j10);
        this.selectionInChars = j10;
        this.highlight = null;
    }

    public final void setTextIfChanged$foundation_release(CharSequence charSequence) {
        int i10;
        int i11;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = charSequence.length();
        boolean z10 = false;
        if (partialGapBuffer.length() <= 0 || charSequence.length() <= 0) {
            i10 = 0;
            i11 = 0;
        } else {
            int i12 = 0;
            int i13 = 0;
            boolean z11 = false;
            while (true) {
                if (!z10) {
                    if (partialGapBuffer.charAt(i12) == charSequence.charAt(i13)) {
                        i12++;
                        i13++;
                    } else {
                        z10 = true;
                    }
                }
                if (!z11) {
                    if (partialGapBuffer.charAt(length - 1) == charSequence.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z11 = true;
                    }
                }
                if (i12 >= length || i13 >= length2 || (z10 && z11)) {
                    break;
                }
            }
            i10 = i12;
            i11 = i13;
        }
        int i14 = length;
        int i15 = length2;
        if (i10 < i14 || i11 < i15) {
            replace$foundation_release(i10, i14, charSequence, i11, i15);
        }
    }

    public String toString() {
        return this.buffer.toString();
    }

    /* renamed from: toTextFieldCharSequence-I88jaVs$foundation_release, reason: not valid java name */
    public final TextFieldCharSequence m21340toTextFieldCharSequenceI88jaVs$foundation_release(long j10, TextRange textRange, List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        return new TextFieldCharSequence(this.buffer.toString(), j10, textRange, null, list, 8, null);
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), i11 - i10);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence.subSequence(i10, i11), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c10) {
        onTextWillChange(getLength(), getLength(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(c10), 0, 0, 24, null);
        return this;
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i10, AbstractC9126n abstractC9126n) {
        this(textFieldCharSequence, (i10 & 2) != 0 ? null : changeTracker, (i10 & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i10 & 8) != 0 ? null : offsetMappingCalculator);
    }
}
