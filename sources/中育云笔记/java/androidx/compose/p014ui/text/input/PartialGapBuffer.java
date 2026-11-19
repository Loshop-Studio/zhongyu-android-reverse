package androidx.compose.p014ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.compose.p014ui.text.InternalTextApi;
import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@InternalTextApi
/* loaded from: classes2.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private String text;
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

    public PartialGapBuffer(String str) {
        this.text = str;
    }

    public final char get(int i10) {
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

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public final String getText() {
        return this.text;
    }

    public final void replace(int i10, int i11, String str) {
        if (!(i10 <= i11)) {
            InlineClassHelperKt.throwIllegalArgumentException("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (!(i10 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i10);
        }
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer != null) {
            int i12 = this.bufStart;
            int i13 = i10 - i12;
            int i14 = i11 - i12;
            if (i13 >= 0 && i14 <= gapBuffer.length()) {
                gapBuffer.replace(i13, i14, str);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i10, i11, str);
            return;
        }
        int iMax = Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.text.length() - i11, 64);
        int i15 = i10 - iMin;
        GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i15, i10);
        int i16 = iMax - iMin2;
        int i17 = iMin2 + i11;
        GapBuffer_jvmKt.toCharArray(this.text, cArr, i16, i11, i17);
        GapBufferKt.toCharArray(str, cArr, iMin);
        this.buffer = new GapBuffer(cArr, iMin + str.length(), i16);
        this.bufStart = i15;
        this.bufEnd = i17;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.text, 0, this.bufStart);
        gapBuffer.append(sb2);
        String str = this.text;
        sb2.append((CharSequence) str, this.bufEnd, str.length());
        return sb2.toString();
    }
}
