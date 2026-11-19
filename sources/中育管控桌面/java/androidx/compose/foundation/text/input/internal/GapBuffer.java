package androidx.compose.foundation.text.input.internal;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J2\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0005J\b\u0010 \u001a\u00020!H\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m7880d2 = {"Landroidx/compose/foundation/text/input/internal/GapBuffer;", "", "initBuffer", "", "initGapStart", "", "initGapEnd", "([CII)V", "buffer", "capacity", "gapEnd", "gapStart", RequestParameters.SUBRESOURCE_APPEND, "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", RequestParameters.SUBRESOURCE_DELETE, "start", "end", "gapLength", "get", "", "index", "length", "makeSureAvailableSpace", "requestSize", "replace", "text", "", "textStart", "textEnd", "toString", "", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
/* loaded from: classes.dex */
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i6, int i7) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i6;
        this.gapEnd = i7;
    }

    private final void delete(int start, int end) {
        int i6 = this.gapStart;
        if (start < i6 && end <= i6) {
            int i7 = i6 - end;
            char[] cArr = this.buffer;
            ArraysKt.copyInto(cArr, cArr, this.gapEnd - i7, end, i6);
            this.gapStart = start;
            this.gapEnd -= i7;
            return;
        }
        if (start < i6 && end >= i6) {
            this.gapEnd = end + gapLength();
            this.gapStart = start;
            return;
        }
        int iGapLength = start + gapLength();
        int iGapLength2 = end + gapLength();
        int i8 = this.gapEnd;
        char[] cArr2 = this.buffer;
        ArraysKt.copyInto(cArr2, cArr2, this.gapStart, i8, iGapLength);
        this.gapStart += iGapLength - i8;
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
        int i6 = this.capacity;
        do {
            i6 *= 2;
        } while (i6 - this.capacity < iGapLength);
        char[] cArr = new char[i6];
        ArraysKt.copyInto(this.buffer, cArr, 0, 0, this.gapStart);
        int i7 = this.capacity;
        int i8 = this.gapEnd;
        int i9 = i7 - i8;
        int i10 = i6 - i9;
        ArraysKt.copyInto(this.buffer, cArr, i10, i8, i9 + i8);
        this.buffer = cArr;
        this.capacity = i6;
        this.gapEnd = i10;
    }

    public static /* synthetic */ void replace$default(GapBuffer gapBuffer, int i6, int i7, CharSequence charSequence, int i8, int i9, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            i8 = 0;
        }
        int i11 = i8;
        if ((i10 & 16) != 0) {
            i9 = charSequence.length();
        }
        gapBuffer.replace(i6, i7, charSequence, i11, i9);
    }

    public final void append(StringBuilder builder) {
        builder.append(this.buffer, 0, this.gapStart);
        Intrinsics.checkNotNullExpressionValue(builder, "append(...)");
        char[] cArr = this.buffer;
        int i6 = this.gapEnd;
        builder.append(cArr, i6, this.capacity - i6);
        Intrinsics.checkNotNullExpressionValue(builder, "append(...)");
    }

    public final char get(int index) {
        int i6 = this.gapStart;
        return index < i6 ? this.buffer[index] : this.buffer[(index - i6) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int start, int end, CharSequence text, int textStart, int textEnd) {
        int i6 = textEnd - textStart;
        makeSureAvailableSpace(i6 - (end - start));
        delete(start, end);
        ToCharArray_androidKt.toCharArray(text, this.buffer, this.gapStart, textStart, textEnd);
        this.gapStart += i6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
