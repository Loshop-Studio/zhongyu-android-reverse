package p113g8;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p113g8.C8666f;
import p134i7.AbstractC8773d;

/* renamed from: g8.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8664e {

    /* renamed from: a */
    public static final int[] f16225a;

    /* renamed from: b */
    public static final int[] f16226b;

    /* renamed from: c */
    public static final int[] f16227c;

    /* renamed from: d */
    public static final long[] f16228d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f16225a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f16226b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f16227c = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f16228d = jArr;
    }

    /* renamed from: a */
    public static final void m14018a(String str, int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if (i13 < 1) {
            m14027j(str, i10, i11, "at least", 1);
        } else if (i13 > i12) {
            m14020c(str, i10, (i13 + i10) - i12);
        }
    }

    /* renamed from: b */
    public static final void m14019b(String str, int i10, int i11, String str2, String str3, boolean z10, int i12) {
        if ((i11 - i10) - str2.length() <= str3.length()) {
            m14028k(str, i10, i11, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!AbstractC8658b.m13946h(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    m14029l(str, i10, i11, str2, RequestParameters.PREFIX);
                }
            }
            i10 += str2.length();
        }
        int length2 = i11 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!AbstractC8658b.m13946h(str3.charAt(i14), str.charAt(length2 + i14), z10)) {
                    m14029l(str, length2, i11, str3, "suffix");
                }
            }
        }
        m14018a(str, i10, length2, i12);
    }

    /* renamed from: c */
    public static final void m14020c(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i10 + ", but was '" + str.charAt(i10) + "'.\nThe result won't fit the type being parsed.");
            }
            i10++;
        }
    }

    /* renamed from: d */
    public static final int[] m14021d() {
        return f16225a;
    }

    /* renamed from: e */
    public static final long m14022e(String str, int i10, int i11, C8666f format) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(format, "format");
        return m14024g(str, i10, i11, format, 16);
    }

    /* renamed from: f */
    public static /* synthetic */ long m14023f(String str, int i10, int i11, C8666f c8666f, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            c8666f = C8666f.f16229d.m14040a();
        }
        return m14022e(str, i10, i11, c8666f);
    }

    /* renamed from: g */
    public static final long m14024g(String str, int i10, int i11, C8666f c8666f, int i12) {
        AbstractC8773d.Companion.m14511a(i10, i11, str.length());
        C8666f.c cVarM14036b = c8666f.m14036b();
        if (cVarM14036b.m14046f()) {
            m14018a(str, i10, i11, i12);
            return m14025h(str, i10, i11);
        }
        String strM14044d = cVarM14036b.m14044d();
        String strM14045e = cVarM14036b.m14045e();
        m14019b(str, i10, i11, strM14044d, strM14045e, cVarM14036b.m14043c(), i12);
        return m14025h(str, i10 + strM14044d.length(), i11 - strM14045e.length());
    }

    /* renamed from: h */
    public static final long m14025h(String str, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f16228d[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            m14026i(str, i10);
            throw new KotlinNothingValueException();
        }
        return j10;
    }

    /* renamed from: i */
    public static final Void m14026i(String str, int i10) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i10 + ", but was " + str.charAt(i10));
    }

    /* renamed from: j */
    public static final void m14027j(String str, int i10, int i11, String str2, int i12) {
        AbstractC9133u.m16131e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    /* renamed from: k */
    public static final void m14028k(String str, int i10, int i11, String str2, String str3) {
        AbstractC9133u.m16131e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    /* renamed from: l */
    public static final void m14029l(String str, int i10, int i11, String str2, String str3) {
        int iM13513h = AbstractC8323h.m13513h(str2.length() + i10, i11);
        AbstractC9133u.m16131e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, iM13513h);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i10 + ", but was " + strSubstring);
    }
}
