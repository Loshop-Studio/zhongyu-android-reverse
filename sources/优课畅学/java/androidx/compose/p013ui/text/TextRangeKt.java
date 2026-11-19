package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.internal.InlineClassHelperKt;

/* loaded from: classes2.dex */
public final class TextRangeKt {
    public static final long TextRange(int i10, int i11) {
        return TextRange.m26353constructorimpl(packWithCheck(i10, i11));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m26370coerceIn8ffj60Q(long j10, int i10, int i11) {
        int iM26364getStartimpl = TextRange.m26364getStartimpl(j10);
        if (iM26364getStartimpl < i10) {
            iM26364getStartimpl = i10;
        }
        if (iM26364getStartimpl > i11) {
            iM26364getStartimpl = i11;
        }
        int iM26359getEndimpl = TextRange.m26359getEndimpl(j10);
        if (iM26359getEndimpl >= i10) {
            i10 = iM26359getEndimpl;
        }
        if (i10 <= i11) {
            i11 = i10;
        }
        return (iM26364getStartimpl == TextRange.m26364getStartimpl(j10) && i11 == TextRange.m26359getEndimpl(j10)) ? j10 : TextRange(iM26364getStartimpl, i11);
    }

    private static final long packWithCheck(int i10, int i11) {
        if (!(i10 >= 0 && i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        return (i11 & 4294967295L) | (i10 << 32);
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m26371substringFDrldGo(CharSequence charSequence, long j10) {
        return charSequence.subSequence(TextRange.m26362getMinimpl(j10), TextRange.m26361getMaximpl(j10)).toString();
    }

    public static final long TextRange(int i10) {
        return TextRange(i10, i10);
    }
}
