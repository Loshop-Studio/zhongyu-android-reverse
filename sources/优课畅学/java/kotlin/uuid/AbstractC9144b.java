package kotlin.uuid;

import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8664e;

/* renamed from: kotlin.uuid.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9144b extends AbstractC9143a {
    /* renamed from: f */
    public static final void m16206f(String str, int i10) {
        AbstractC9133u.m16133g(str, "<this>");
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
    }

    /* renamed from: g */
    public static final void m16207g(long j10, byte[] dst, int i10, int i11, int i12) {
        AbstractC9133u.m16133g(dst, "dst");
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = AbstractC8664e.m14021d()[(int) ((j10 >> (i13 << 3)) & 255)];
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
    public static final String m16208h(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC9133u.m16131e(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i10);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append("...");
        return sb.toString();
    }

    /* renamed from: i */
    public static final Uuid m16209i(String hexString) {
        AbstractC9133u.m16133g(hexString, "hexString");
        return Uuid.f17537c.m16198a(AbstractC8664e.m14023f(hexString, 0, 16, null, 4, null), AbstractC8664e.m14023f(hexString, 16, 32, null, 4, null));
    }

    /* renamed from: j */
    public static final Uuid m16210j(String hexDashString) {
        AbstractC9133u.m16133g(hexDashString, "hexDashString");
        long jM14023f = AbstractC8664e.m14023f(hexDashString, 0, 8, null, 4, null);
        m16206f(hexDashString, 8);
        long jM14023f2 = AbstractC8664e.m14023f(hexDashString, 9, 13, null, 4, null);
        m16206f(hexDashString, 13);
        long jM14023f3 = AbstractC8664e.m14023f(hexDashString, 14, 18, null, 4, null);
        m16206f(hexDashString, 18);
        long jM14023f4 = AbstractC8664e.m14023f(hexDashString, 19, 23, null, 4, null);
        m16206f(hexDashString, 23);
        return Uuid.f17537c.m16198a((jM14023f2 << 16) | (jM14023f << 32) | jM14023f3, (jM14023f4 << 48) | AbstractC8664e.m14023f(hexDashString, 24, 36, null, 4, null));
    }
}
