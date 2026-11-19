package p310qd;

import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10940d;

/* renamed from: qd.z */
/* loaded from: classes6.dex */
public abstract class AbstractC10819z extends AbstractC10818y {
    /* renamed from: A */
    public static boolean m23228A(String str, String suffix, boolean z10) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : m23233F(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m23229B(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m23228A(str, str2, z10);
    }

    /* renamed from: C */
    public static boolean m23230C(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m23231D(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m23230C(str, str2, z10);
    }

    /* renamed from: E */
    public static Comparator m23232E(C9960c0 c9960c0) {
        AbstractC9979u.m20294g(c9960c0, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC9979u.m20293f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* renamed from: F */
    public static boolean m23233F(String str, int i10, String other, int i11, int i12, boolean z10) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    /* renamed from: G */
    public static String m23234G(CharSequence charSequence, int i10) {
        AbstractC9979u.m20294g(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20291d(string);
        return string;
    }

    /* renamed from: H */
    public static final String m23235H(String str, char c10, char c11, boolean z10) {
        AbstractC9979u.m20294g(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            AbstractC9979u.m20293f(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC10790b.m23080h(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    /* renamed from: I */
    public static final String m23236I(String str, String oldValue, String newValue, boolean z10) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(oldValue, "oldValue");
        AbstractC9979u.m20294g(newValue, "newValue");
        int i10 = 0;
        int iM23122b0 = AbstractC10793c0.m23122b0(str, oldValue, 0, z10);
        if (iM23122b0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iM21752e = AbstractC10410o.m21752e(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iM23122b0);
            sb2.append(newValue);
            i10 = iM23122b0 + length;
            if (iM23122b0 >= str.length()) {
                break;
            }
            iM23122b0 = AbstractC10793c0.m23122b0(str, oldValue, iM23122b0 + iM21752e, z10);
        } while (iM23122b0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* renamed from: J */
    public static /* synthetic */ String m23237J(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m23235H(str, c10, c11, z10);
    }

    /* renamed from: K */
    public static /* synthetic */ String m23238K(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m23236I(str, str2, str3, z10);
    }

    /* renamed from: L */
    public static boolean m23239L(String str, String prefix, int i10, boolean z10) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : m23233F(str, i10, prefix, 0, prefix.length(), z10);
    }

    /* renamed from: M */
    public static boolean m23240M(String str, String prefix, boolean z10) {
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC9979u.m20294g(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : m23233F(str, 0, prefix, 0, prefix.length(), z10);
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m23241N(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m23239L(str, str2, i10, z10);
    }

    /* renamed from: O */
    public static /* synthetic */ boolean m23242O(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m23240M(str, str2, z10);
    }

    /* renamed from: u */
    public static String m23243u(char[] cArr) {
        AbstractC9979u.m20294g(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: v */
    public static String m23244v(char[] cArr, int i10, int i11) {
        AbstractC9979u.m20294g(cArr, "<this>");
        AbstractC10940d.Companion.m23885a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    /* renamed from: w */
    public static boolean m23245w(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? AbstractC10793c0.m23110V(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    /* renamed from: x */
    public static String m23246x(byte[] bArr) {
        AbstractC9979u.m20294g(bArr, "<this>");
        return new String(bArr, C10792c.f26019b);
    }

    /* renamed from: y */
    public static final String m23247y(byte[] bArr, int i10, int i11, boolean z10) {
        AbstractC9979u.m20294g(bArr, "<this>");
        AbstractC10940d.Companion.m23885a(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, C10792c.f26019b);
        }
        CharsetDecoder charsetDecoderNewDecoder = C10792c.f26019b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* renamed from: z */
    public static /* synthetic */ String m23248z(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return m23247y(bArr, i10, i11, z10);
    }
}
