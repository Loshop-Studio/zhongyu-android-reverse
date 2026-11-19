package androidx.compose.p014ui.text.input;

import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10964p;

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

    private final void delete(int i10, int i11) {
        int i12 = this.gapStart;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.buffer;
            AbstractC10964p.m24018k(cArr, cArr, this.gapEnd - i13, i11, i12);
            this.gapStart = i10;
            this.gapEnd -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.gapEnd = i11 + gapLength();
            this.gapStart = i10;
            return;
        }
        int iGapLength = i10 + gapLength();
        int iGapLength2 = i11 + gapLength();
        int i14 = this.gapEnd;
        char[] cArr2 = this.buffer;
        AbstractC10964p.m24018k(cArr2, cArr2, this.gapStart, i14, iGapLength);
        this.gapStart += iGapLength - i14;
        this.gapEnd = iGapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i10) {
        if (i10 <= gapLength()) {
            return;
        }
        int iGapLength = i10 - gapLength();
        int i11 = this.capacity;
        do {
            i11 *= 2;
        } while (i11 - this.capacity < iGapLength);
        char[] cArr = new char[i11];
        AbstractC10964p.m24018k(this.buffer, cArr, 0, 0, this.gapStart);
        int i12 = this.capacity;
        int i13 = this.gapEnd;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        AbstractC10964p.m24018k(this.buffer, cArr, i15, i13, i14 + i13);
        this.buffer = cArr;
        this.capacity = i11;
        this.gapEnd = i15;
    }

    public final void append(StringBuilder sb2) {
        sb2.append(this.buffer, 0, this.gapStart);
        AbstractC9979u.m20293f(sb2, "append(...)");
        char[] cArr = this.buffer;
        int i10 = this.gapEnd;
        sb2.append(cArr, i10, this.capacity - i10);
        AbstractC9979u.m20293f(sb2, "append(...)");
    }

    public final char get(int i10) {
        int i11 = this.gapStart;
        return i10 < i11 ? this.buffer[i10] : this.buffer[(i10 - i11) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i10, int i11, String str) {
        makeSureAvailableSpace(str.length() - (i11 - i10));
        delete(i10, i11);
        GapBufferKt.toCharArray(str, this.buffer, this.gapStart);
        this.gapStart += str.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        return sb2.toString();
    }
}
