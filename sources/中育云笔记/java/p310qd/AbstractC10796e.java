package p310qd;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p310qd.C10798f;
import p325rc.AbstractC10940d;

/* renamed from: qd.e */
/* loaded from: classes6.dex */
public abstract class AbstractC10796e {

    /* renamed from: a */
    public static final int[] f26038a;

    /* renamed from: b */
    public static final int[] f26039b;

    /* renamed from: c */
    public static final int[] f26040c;

    /* renamed from: d */
    public static final long[] f26041d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f26038a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f26039b = iArr2;
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
        f26040c = iArr3;
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
        f26041d = jArr;
    }

    /* renamed from: a */
    public static final void m23157a(String str, int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if (i13 < 1) {
            m23166j(str, i10, i11, "at least", 1);
        } else if (i13 > i12) {
            m23159c(str, i10, (i13 + i10) - i12);
        }
    }

    /* renamed from: b */
    public static final void m23158b(String str, int i10, int i11, String str2, String str3, boolean z10, int i12) {
        if ((i11 - i10) - str2.length() <= str3.length()) {
            m23167k(str, i10, i11, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!AbstractC10790b.m23080h(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    m23168l(str, i10, i11, str2, RequestParameters.PREFIX);
                }
            }
            i10 += str2.length();
        }
        int length2 = i11 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!AbstractC10790b.m23080h(str3.charAt(i14), str.charAt(length2 + i14), z10)) {
                    m23168l(str, length2, i11, str3, "suffix");
                }
            }
        }
        m23157a(str, i10, length2, i12);
    }

    /* renamed from: c */
    public static final void m23159c(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i10 + ", but was '" + str.charAt(i10) + "'.\nThe result won't fit the type being parsed.");
            }
            i10++;
        }
    }

    /* renamed from: d */
    public static final int[] m23160d() {
        return f26038a;
    }

    /* renamed from: e */
    public static final long m23161e(String str, int i10, int i11, C10798f format) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(format, "format");
        return m23163g(str, i10, i11, format, 16);
    }

    /* renamed from: f */
    public static /* synthetic */ long m23162f(String str, int i10, int i11, C10798f c10798f, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            c10798f = C10798f.f26042d.m23179a();
        }
        return m23161e(str, i10, i11, c10798f);
    }

    /* renamed from: g */
    public static final long m23163g(String str, int i10, int i11, C10798f c10798f, int i12) {
        AbstractC10940d.Companion.m23885a(i10, i11, str.length());
        C10798f.c cVarM23175b = c10798f.m23175b();
        if (cVarM23175b.m23185f()) {
            m23157a(str, i10, i11, i12);
            return m23164h(str, i10, i11);
        }
        String strM23183d = cVarM23175b.m23183d();
        String strM23184e = cVarM23175b.m23184e();
        m23158b(str, i10, i11, strM23183d, strM23184e, cVarM23175b.m23182c(), i12);
        return m23164h(str, i10 + strM23183d.length(), i11 - strM23184e.length());
    }

    /* renamed from: h */
    public static final long m23164h(String str, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f26041d[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            m23165i(str, i10);
            throw new KotlinNothingValueException();
        }
        return j10;
    }

    /* renamed from: i */
    public static final Void m23165i(String str, int i10) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i10 + ", but was " + str.charAt(i10));
    }

    /* renamed from: j */
    public static final void m23166j(String str, int i10, int i11, String str2, int i12) {
        AbstractC9979u.m20292e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    /* renamed from: k */
    public static final void m23167k(String str, int i10, int i11, String str2, String str3) {
        AbstractC9979u.m20292e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    /* renamed from: l */
    public static final void m23168l(String str, int i10, int i11, String str2, String str3) {
        int iM21756i = AbstractC10410o.m21756i(str2.length() + i10, i11);
        AbstractC9979u.m20292e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, iM21756i);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i10 + ", but was " + strSubstring);
    }
}
