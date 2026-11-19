package p410xd;

import p310qd.AbstractC10818y;

/* renamed from: xd.f0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC11845f0 {
    /* renamed from: a */
    public static final int m26261a(String str, int i10, int i11, int i12) {
        return (int) AbstractC11841d0.m26251c(str, i10, i11, i12);
    }

    /* renamed from: b */
    public static final long m26262b(String str, long j10, long j11, long j12) {
        String strM26252d = AbstractC11841d0.m26252d(str);
        if (strM26252d == null) {
            return j10;
        }
        Long lM23226s = AbstractC10818y.m23226s(strM26252d);
        if (lM23226s == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM26252d + '\'').toString());
        }
        long jLongValue = lM23226s.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: c */
    public static final String m26263c(String str, String str2) {
        String strM26252d = AbstractC11841d0.m26252d(str);
        return strM26252d == null ? str2 : strM26252d;
    }

    /* renamed from: d */
    public static final boolean m26264d(String str, boolean z10) {
        String strM26252d = AbstractC11841d0.m26252d(str);
        return strM26252d != null ? Boolean.parseBoolean(strM26252d) : z10;
    }

    /* renamed from: e */
    public static /* synthetic */ int m26265e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return AbstractC11841d0.m26250b(str, i10, i11, i12);
    }

    /* renamed from: f */
    public static /* synthetic */ long m26266f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return AbstractC11841d0.m26251c(str, j10, j13, j12);
    }
}
