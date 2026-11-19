package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j10, AbstractC9126n abstractC9126n) {
        this(annotatedString, j10);
    }

    private final void setSelectionEnd(int i10) {
        if (!(i10 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.selectionEnd = i10;
    }

    private final void setSelectionStart(int i10) {
        if (!(i10 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: " + i10);
        }
        this.selectionStart = i10;
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int i10, int i11) {
        long jTextRange = TextRangeKt.TextRange(i10, i11);
        this.gapBuffer.replace(i10, i11, "");
        long jM26526updateRangeAfterDeletepWDy79M = EditingBufferKt.m26526updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m26362getMinimpl(jM26526updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m26361getMaximpl(jM26526updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long jM26526updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m26526updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m26358getCollapsedimpl(jM26526updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m26362getMinimpl(jM26526updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m26361getMaximpl(jM26526updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int i10) {
        return this.gapBuffer.get(i10);
    }

    /* renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m26524getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m26352boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i10 = this.selectionStart;
        int i11 = this.selectionEnd;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m26525getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int i10, int i11, AnnotatedString annotatedString) {
        replace$ui_text_release(i10, i11, annotatedString.getText());
    }

    public final void setComposition$ui_text_release(int i10, int i11) {
        if (i10 < 0 || i10 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i11 < 0 || i11 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i10 < i11) {
            this.compositionStart = i10;
            this.compositionEnd = i11;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
    }

    public final void setCursor$ui_text_release(int i10) {
        setSelection$ui_text_release(i10, i10);
    }

    public final void setSelection$ui_text_release(int i10, int i11) {
        if (i10 < 0 || i10 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i11 < 0 || i11 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i10 <= i11) {
            setSelectionStart(i10);
            setSelectionEnd(i11);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public /* synthetic */ EditingBuffer(String str, long j10, AbstractC9126n abstractC9126n) {
        this(str, j10);
    }

    public final void replace$ui_text_release(int i10, int i11, String str) {
        if (i10 < 0 || i10 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i11 < 0 || i11 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if (i10 <= i11) {
            this.gapBuffer.replace(i10, i11, str);
            setSelectionStart(str.length() + i10);
            setSelectionEnd(i10 + str.length());
            this.compositionStart = -1;
            this.compositionEnd = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
    }

    private EditingBuffer(AnnotatedString annotatedString, long j10) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m26362getMinimpl(j10);
        this.selectionEnd = TextRange.m26361getMaximpl(j10);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM26362getMinimpl = TextRange.m26362getMinimpl(j10);
        int iM26361getMaximpl = TextRange.m26361getMaximpl(j10);
        if (iM26362getMinimpl >= 0 && iM26362getMinimpl <= annotatedString.length()) {
            if (iM26361getMaximpl < 0 || iM26361getMaximpl > annotatedString.length()) {
                throw new IndexOutOfBoundsException("end (" + iM26361getMaximpl + ") offset is outside of text region " + annotatedString.length());
            }
            if (iM26362getMinimpl <= iM26361getMaximpl) {
                return;
            }
            throw new IllegalArgumentException("Do not set reversed range: " + iM26362getMinimpl + " > " + iM26361getMaximpl);
        }
        throw new IndexOutOfBoundsException("start (" + iM26362getMinimpl + ") offset is outside of text region " + annotatedString.length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(String str, long j10) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j10, (AbstractC9126n) (0 == true ? 1 : 0));
    }
}
