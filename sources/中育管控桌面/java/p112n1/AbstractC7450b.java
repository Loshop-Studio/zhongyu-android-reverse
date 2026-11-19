package p112n1;

import java.util.List;
import kotlin.UByte;

/* renamed from: n1.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7450b {

    /* renamed from: a */
    public static List f9521a;

    /* renamed from: a */
    public static short m8499a(byte[] bArr, byte[] bArr2, int i6) {
        int i7 = i6 % 8;
        short s6 = (short) (bArr2[i6] & UByte.MAX_VALUE);
        return (bArr[i6 / 8] & AbstractC7454f.f9528a[i7]) != 0 ? (short) (s6 | 256) : s6;
    }

    /* renamed from: b */
    public static int m8500b(char c7) {
        int i6 = c7 - 19968;
        return (i6 < 0 || i6 >= 7000) ? (7000 > i6 || i6 >= 14000) ? m8499a(AbstractC7453e.f9526a, AbstractC7453e.f9527b, c7 - 33968) : m8499a(AbstractC7452d.f9524a, AbstractC7452d.f9525b, c7 - 26968) : m8499a(AbstractC7451c.f9522a, AbstractC7451c.f9523b, i6);
    }

    /* renamed from: c */
    public static boolean m8501c(char c7) {
        return (19968 <= c7 && c7 <= 40869 && m8500b(c7) > 0) || 12295 == c7;
    }

    /* renamed from: d */
    public static String m8502d(char c7) {
        return m8501c(c7) ? c7 == 12295 ? "LING" : AbstractC7454f.f9529b[m8500b(c7)] : String.valueOf(c7);
    }

    /* renamed from: e */
    public static String m8503e(String str, String str2) {
        return AbstractC7449a.m8497a(str, null, f9521a, str2, null);
    }
}
