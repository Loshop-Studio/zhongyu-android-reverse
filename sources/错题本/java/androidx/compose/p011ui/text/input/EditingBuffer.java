package androidx.compose.p011ui.text.input;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0080\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010$\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020\u0016H\u0000¢\u0006\u0004\b%\u0010#J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R*\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00106\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R$\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R$\u0010<\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u001c\u0010@\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bA\u0010BR$\u0010C\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bD\u00103\"\u0004\bE\u00105R\u0014\u0010G\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, m5110d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/e;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/e;)V", "", "hasComposition$ui_text_release", "()Z", "hasComposition", "", "index", "", "get$ui_text_release", "(I)C", "get", "start", "end", "Ld6/s;", "replace$ui_text_release", "(IILandroidx/compose/ui/text/AnnotatedString;)V", "replace", "(IILjava/lang/String;)V", "delete$ui_text_release", "(II)V", RequestParameters.SUBRESOURCE_DELETE, "setSelection$ui_text_release", "setSelection", "setComposition$ui_text_release", "setComposition", "cancelComposition$ui_text_release", "()V", "cancelComposition", "commitComposition$ui_text_release", "commitComposition", "toString", "()Ljava/lang/String;", "toAnnotatedString$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedString", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "value", "selectionStart", "I", "getSelectionStart$ui_text_release", "()I", "setSelectionStart", "(I)V", "selectionEnd", "getSelectionEnd$ui_text_release", "setSelectionEnd", "<set-?>", "compositionStart", "getCompositionStart$ui_text_release", "compositionEnd", "getCompositionEnd$ui_text_release", "getComposition-MzsxiRA$ui_text_release", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text_release", "()J", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "getLength$ui_text_release", "length", "Companion", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,382:1\n114#2,8:383\n114#2,8:391\n*S KotlinDebug\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n*L\n50#1:383,8\n59#1:391,8\n*E\n"})
/* loaded from: classes2.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;

    @NotNull
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j7, AbstractC5824e abstractC5824e) {
        this(annotatedString, j7);
    }

    private final void setSelectionEnd(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: " + i);
        }
        this.selectionEnd = i;
    }

    private final void setSelectionStart(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: " + i);
        }
        this.selectionStart = i;
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

    public final void delete$ui_text_release(int start, int end) {
        long jTextRange = TextRangeKt.TextRange(start, end);
        this.gapBuffer.replace(start, end, "");
        long jM12932updateRangeAfterDeletepWDy79M = EditingBufferKt.m12932updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m12768getMinimpl(jM12932updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m12767getMaximpl(jM12932updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long jM12932updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m12932updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m12764getCollapsedimpl(jM12932updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m12768getMinimpl(jM12932updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m12767getMaximpl(jM12932updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int index) {
        return this.gapBuffer.get(index);
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m12930getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m12758boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* renamed from: getCompositionEnd$ui_text_release, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* renamed from: getCompositionStart$ui_text_release, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i = this.selectionStart;
        int i8 = this.selectionEnd;
        if (i == i8) {
            return i8;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m12931getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    /* renamed from: getSelectionEnd$ui_text_release, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* renamed from: getSelectionStart$ui_text_release, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int start, int end, @NotNull AnnotatedString text) {
        replace$ui_text_release(start, end, text.getText());
    }

    public final void setComposition$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbM94s = AbstractC0037f.m94s(start, "start (", ") offset is outside of text region ");
            sbM94s.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbM94s.toString());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            StringBuilder sbM94s2 = AbstractC0037f.m94s(end, "end (", ") offset is outside of text region ");
            sbM94s2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbM94s2.toString());
        }
        if (start >= end) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(start, end, "Do not set reversed or empty range: ", " > "));
        }
        this.compositionStart = start;
        this.compositionEnd = end;
    }

    public final void setCursor$ui_text_release(int i) {
        setSelection$ui_text_release(i, i);
    }

    public final void setSelection$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbM94s = AbstractC0037f.m94s(start, "start (", ") offset is outside of text region ");
            sbM94s.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbM94s.toString());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            StringBuilder sbM94s2 = AbstractC0037f.m94s(end, "end (", ") offset is outside of text region ");
            sbM94s2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbM94s2.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(start, end, "Do not set reversed range: ", " > "));
        }
        setSelectionStart(start);
        setSelectionEnd(end);
    }

    @NotNull
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, 2, null);
    }

    @NotNull
    public String toString() {
        return this.gapBuffer.toString();
    }

    public /* synthetic */ EditingBuffer(String str, long j7, AbstractC5824e abstractC5824e) {
        this(str, j7);
    }

    public final void replace$ui_text_release(int start, int end, @NotNull String text) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbM94s = AbstractC0037f.m94s(start, "start (", ") offset is outside of text region ");
            sbM94s.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbM94s.toString());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            StringBuilder sbM94s2 = AbstractC0037f.m94s(end, "end (", ") offset is outside of text region ");
            sbM94s2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbM94s2.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(start, end, "Do not set reversed range: ", " > "));
        }
        this.gapBuffer.replace(start, end, text);
        setSelectionStart(text.length() + start);
        setSelectionEnd(text.length() + start);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    private EditingBuffer(AnnotatedString annotatedString, long j7) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m12768getMinimpl(j7);
        this.selectionEnd = TextRange.m12767getMaximpl(j7);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM12768getMinimpl = TextRange.m12768getMinimpl(j7);
        int iM12767getMaximpl = TextRange.m12767getMaximpl(j7);
        if (iM12768getMinimpl >= 0 && iM12768getMinimpl <= annotatedString.length()) {
            if (iM12767getMaximpl < 0 || iM12767getMaximpl > annotatedString.length()) {
                StringBuilder sbM94s = AbstractC0037f.m94s(iM12767getMaximpl, "end (", ") offset is outside of text region ");
                sbM94s.append(annotatedString.length());
                throw new IndexOutOfBoundsException(sbM94s.toString());
            }
            if (iM12768getMinimpl > iM12767getMaximpl) {
                throw new IllegalArgumentException(AbstractC0584a.m912m(iM12768getMinimpl, iM12767getMaximpl, "Do not set reversed range: ", " > "));
            }
            return;
        }
        StringBuilder sbM94s2 = AbstractC0037f.m94s(iM12768getMinimpl, "start (", ") offset is outside of text region ");
        sbM94s2.append(annotatedString.length());
        throw new IndexOutOfBoundsException(sbM94s2.toString());
    }

    private EditingBuffer(String str, long j7) {
        this(new AnnotatedString(str, null, 2, null), j7, (AbstractC5824e) null);
    }
}
