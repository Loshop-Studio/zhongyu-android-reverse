package kotlin.text;

import android.support.v4.media.AbstractC0037f;
import kotlin.collections.AbstractC5786f;
import kotlin.collections.C5780c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlin.text.e */
/* loaded from: classes4.dex */
public abstract class AbstractC5844e {

    /* renamed from: a */
    public static final int[] f9247a;

    /* renamed from: b */
    public static final long[] f9248b;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            iArr[i8] = "0123456789abcdef".charAt(i8 & 15) | ("0123456789abcdef".charAt(i8 >> 4) << '\b');
        }
        f9247a = iArr;
        int[] iArr2 = new int[256];
        for (int i9 = 0; i9 < 256; i9++) {
            iArr2[i9] = "0123456789ABCDEF".charAt(i9 & 15) | ("0123456789ABCDEF".charAt(i9 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr3[i10] = -1;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i11)] = i12;
            i11++;
            i12++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        long[] jArr = new long[256];
        for (int i15 = 0; i15 < 256; i15++) {
            jArr[i15] = -1;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        int i18 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i18;
            i++;
            i18++;
        }
        f9248b = jArr;
    }

    /* renamed from: a */
    public static final void m5364a(int i, int i8, String str) {
        int i9 = i8 - i;
        if (i9 < 1) {
            String strSubstring = str.substring(i, i8);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i + ", but was \"" + strSubstring + "\" of length " + i9);
        }
        if (i9 > 16) {
            int i10 = (i9 + i) - 16;
            while (i < i10) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbM94s = AbstractC0037f.m94s(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbM94s.append(str.charAt(i));
                    sbM94s.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbM94s.toString());
                }
                i++;
            }
        }
    }

    /* renamed from: b */
    public static long m5365b(int i, int i8, String str) {
        C5847h format = C5847h.f9252d;
        AbstractC5830k.m5330g(format, "format");
        C5780c c5780c = AbstractC5786f.Companion;
        int length = str.length();
        c5780c.getClass();
        C5780c.m5142a(i, i8, length);
        if (format.f9255c.f9251a) {
            m5364a(i, i8, str);
            return m5366c(i, i8, str);
        }
        if (i8 - i > 0) {
            m5364a(i, i8, str);
            return m5366c(i, i8, str);
        }
        String strSubstring = str.substring(i, i8);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    /* renamed from: c */
    public static final long m5366c(int i, int i8, String str) {
        long j7 = 0;
        while (i < i8) {
            long j8 = j7 << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j9 = f9248b[cCharAt];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                    i++;
                }
            }
            StringBuilder sbM94s = AbstractC0037f.m94s(i, "Expected a hexadecimal digit at index ", ", but was ");
            sbM94s.append(str.charAt(i));
            throw new NumberFormatException(sbM94s.toString());
        }
        return j7;
    }
}
