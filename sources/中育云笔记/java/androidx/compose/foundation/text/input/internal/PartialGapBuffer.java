package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PartialGapBuffer implements CharSequence {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private CharSequence text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public PartialGapBuffer(CharSequence charSequence) {
        this.text = charSequence;
    }

    public static /* synthetic */ void replace$default(PartialGapBuffer partialGapBuffer, int i10, int i11, CharSequence charSequence, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        int i15 = i12;
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        partialGapBuffer.replace(i10, i11, charSequence, i15, i13);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return get(i10);
    }

    public final boolean contentEquals(CharSequence charSequence) {
        return AbstractC9979u.m20289b(toString(), charSequence.toString());
    }

    public char get(int i10) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(i10);
        }
        if (i10 < this.bufStart) {
            return this.text.charAt(i10);
        }
        int length = gapBuffer.length();
        int i11 = this.bufStart;
        return i10 < length + i11 ? gapBuffer.get(i10 - i11) : this.text.charAt(i10 - ((length - this.bufEnd) + i11));
    }

    public int getLength() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final void replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (!(i10 <= i11)) {
            InlineClassHelperKt.throwIllegalArgumentException("start=" + i10 + " > end=" + i11);
        }
        if (!(i12 <= i13)) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart=" + i12 + " > textEnd=" + i13);
        }
        if (!(i10 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i10);
        }
        if (!(i12 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart must be non-negative, but was " + i12);
        }
        GapBuffer gapBuffer = this.buffer;
        int i14 = i13 - i12;
        if (gapBuffer != null) {
            int i15 = this.bufStart;
            int i16 = i10 - i15;
            int i17 = i11 - i15;
            if (i16 >= 0 && i17 <= gapBuffer.length()) {
                gapBuffer.replace(i16, i17, charSequence, i12, i13);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i10, i11, charSequence, i12, i13);
            return;
        }
        int iMax = Math.max(255, i14 + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.text.length() - i11, 64);
        int i18 = i10 - iMin;
        ToCharArray_androidKt.toCharArray(this.text, cArr, 0, i18, i10);
        int i19 = iMax - iMin2;
        int i20 = iMin2 + i11;
        ToCharArray_androidKt.toCharArray(this.text, cArr, i19, i11, i20);
        ToCharArray_androidKt.toCharArray(charSequence, cArr, iMin, i12, i13);
        this.buffer = new GapBuffer(cArr, iMin + i14, i19);
        this.bufStart = i18;
        this.bufEnd = i20;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return toString().subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.text, 0, this.bufStart);
        gapBuffer.append(sb2);
        CharSequence charSequence = this.text;
        sb2.append(charSequence, this.bufEnd, charSequence.length());
        return sb2.toString();
    }
}
