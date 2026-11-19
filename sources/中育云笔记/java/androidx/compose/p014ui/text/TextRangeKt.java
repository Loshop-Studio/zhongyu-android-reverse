package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.internal.InlineClassHelperKt;

/* loaded from: classes2.dex */
public final class TextRangeKt {
    public static final long TextRange(int i10, int i11) {
        return TextRange.m32955constructorimpl(packWithCheck(i10, i11));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m32972coerceIn8ffj60Q(long j10, int i10, int i11) {
        int iM32966getStartimpl = TextRange.m32966getStartimpl(j10);
        if (iM32966getStartimpl < i10) {
            iM32966getStartimpl = i10;
        }
        if (iM32966getStartimpl > i11) {
            iM32966getStartimpl = i11;
        }
        int iM32961getEndimpl = TextRange.m32961getEndimpl(j10);
        if (iM32961getEndimpl >= i10) {
            i10 = iM32961getEndimpl;
        }
        if (i10 <= i11) {
            i11 = i10;
        }
        return (iM32966getStartimpl == TextRange.m32966getStartimpl(j10) && i11 == TextRange.m32961getEndimpl(j10)) ? j10 : TextRange(iM32966getStartimpl, i11);
    }

    private static final long packWithCheck(int i10, int i11) {
        if (!(i10 >= 0 && i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        return (i11 & 4294967295L) | (i10 << 32);
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m32973substringFDrldGo(CharSequence charSequence, long j10) {
        return charSequence.subSequence(TextRange.m32964getMinimpl(j10), TextRange.m32963getMaximpl(j10)).toString();
    }

    public static final long TextRange(int i10) {
        return TextRange(i10, i10);
    }
}
