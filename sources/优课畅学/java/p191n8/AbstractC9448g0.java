package p191n8;

import p113g8.AbstractC8686y;

/* renamed from: n8.g0 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC9448g0 {
    /* renamed from: a */
    public static final int m17333a(String str, int i10, int i11, int i12) {
        return (int) AbstractC9444e0.m17323c(str, i10, i11, i12);
    }

    /* renamed from: b */
    public static final long m17334b(String str, long j10, long j11, long j12) {
        String strM17324d = AbstractC9444e0.m17324d(str);
        if (strM17324d == null) {
            return j10;
        }
        Long lM14091s = AbstractC8686y.m14091s(strM17324d);
        if (lM14091s == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM17324d + '\'').toString());
        }
        long jLongValue = lM14091s.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: c */
    public static final String m17335c(String str, String str2) {
        String strM17324d = AbstractC9444e0.m17324d(str);
        return strM17324d == null ? str2 : strM17324d;
    }

    /* renamed from: d */
    public static final boolean m17336d(String str, boolean z10) {
        String strM17324d = AbstractC9444e0.m17324d(str);
        return strM17324d != null ? Boolean.parseBoolean(strM17324d) : z10;
    }

    /* renamed from: e */
    public static /* synthetic */ int m17337e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return AbstractC9444e0.m17322b(str, i10, i11, i12);
    }

    /* renamed from: f */
    public static /* synthetic */ long m17338f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return AbstractC9444e0.m17323c(str, j10, j13, j12);
    }
}
