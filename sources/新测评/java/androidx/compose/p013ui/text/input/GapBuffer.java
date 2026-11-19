package androidx.compose.p013ui.text.input;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u001e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m13558d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "initBuffer", "", "initGapStart", "", "initGapEnd", "([CII)V", "buffer", "capacity", "gapEnd", "gapStart", RequestParameters.SUBRESOURCE_APPEND, "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", RequestParameters.SUBRESOURCE_DELETE, "start", "end", "gapLength", "get", "", "index", "length", "makeSureAvailableSpace", "requestSize", "replace", "text", "", "toString", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
/* loaded from: classes2.dex */
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i10, int i11) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i10;
        this.gapEnd = i11;
    }

    private final void delete(int start, int end) {
        int i10 = this.gapStart;
        if (start < i10 && end <= i10) {
            int i11 = i10 - end;
            char[] cArr = this.buffer;
            ArraysKt.copyInto(cArr, cArr, this.gapEnd - i11, end, i10);
            this.gapStart = start;
            this.gapEnd -= i11;
            return;
        }
        if (start < i10 && end >= i10) {
            this.gapEnd = end + gapLength();
            this.gapStart = start;
            return;
        }
        int iGapLength = start + gapLength();
        int iGapLength2 = end + gapLength();
        int i12 = this.gapEnd;
        char[] cArr2 = this.buffer;
        ArraysKt.copyInto(cArr2, cArr2, this.gapStart, i12, iGapLength);
        this.gapStart += iGapLength - i12;
        this.gapEnd = iGapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int requestSize) {
        if (requestSize <= gapLength()) {
            return;
        }
        int iGapLength = requestSize - gapLength();
        int i10 = this.capacity;
        do {
            i10 *= 2;
        } while (i10 - this.capacity < iGapLength);
        char[] cArr = new char[i10];
        ArraysKt.copyInto(this.buffer, cArr, 0, 0, this.gapStart);
        int i11 = this.capacity;
        int i12 = this.gapEnd;
        int i13 = i11 - i12;
        int i14 = i10 - i13;
        ArraysKt.copyInto(this.buffer, cArr, i14, i12, i13 + i12);
        this.buffer = cArr;
        this.capacity = i10;
        this.gapEnd = i14;
    }

    public final void append(StringBuilder builder) {
        builder.append(this.buffer, 0, this.gapStart);
        Intrinsics.checkNotNullExpressionValue(builder, "append(...)");
        char[] cArr = this.buffer;
        int i10 = this.gapEnd;
        builder.append(cArr, i10, this.capacity - i10);
        Intrinsics.checkNotNullExpressionValue(builder, "append(...)");
    }

    public final char get(int index) {
        int i10 = this.gapStart;
        return index < i10 ? this.buffer[index] : this.buffer[(index - i10) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int start, int end, String text) {
        makeSureAvailableSpace(text.length() - (end - start));
        delete(start, end);
        GapBufferKt.toCharArray(text, this.buffer, this.gapStart);
        this.gapStart += text.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
