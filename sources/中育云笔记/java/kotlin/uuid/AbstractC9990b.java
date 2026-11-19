package kotlin.uuid;

import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10796e;

/* renamed from: kotlin.uuid.b */
/* loaded from: classes6.dex */
public abstract class AbstractC9990b extends AbstractC9989a {
    /* renamed from: f */
    public static final void m20366f(String str, int i10) {
        AbstractC9979u.m20294g(str, "<this>");
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
    }

    /* renamed from: g */
    public static final void m20367g(long j10, byte[] dst, int i10, int i11, int i12) {
        AbstractC9979u.m20294g(dst, "dst");
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = AbstractC10796e.m23160d()[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            dst[i10] = (byte) (i15 >> 8);
            i10 += 2;
            dst[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    /* renamed from: h */
    public static final String m20368h(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        AbstractC9979u.m20292e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i10);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("...");
        return sb2.toString();
    }

    /* renamed from: i */
    public static final Uuid m20369i(String hexString) {
        AbstractC9979u.m20294g(hexString, "hexString");
        return Uuid.f23466e.m20358a(AbstractC10796e.m23162f(hexString, 0, 16, null, 4, null), AbstractC10796e.m23162f(hexString, 16, 32, null, 4, null));
    }

    /* renamed from: j */
    public static final Uuid m20370j(String hexDashString) {
        AbstractC9979u.m20294g(hexDashString, "hexDashString");
        long jM23162f = AbstractC10796e.m23162f(hexDashString, 0, 8, null, 4, null);
        m20366f(hexDashString, 8);
        long jM23162f2 = AbstractC10796e.m23162f(hexDashString, 9, 13, null, 4, null);
        m20366f(hexDashString, 13);
        long jM23162f3 = AbstractC10796e.m23162f(hexDashString, 14, 18, null, 4, null);
        m20366f(hexDashString, 18);
        long jM23162f4 = AbstractC10796e.m23162f(hexDashString, 19, 23, null, 4, null);
        m20366f(hexDashString, 23);
        return Uuid.f23466e.m20358a((jM23162f2 << 16) | (jM23162f << 32) | jM23162f3, (jM23162f4 << 48) | AbstractC10796e.m23162f(hexDashString, 24, 36, null, 4, null));
    }
}
