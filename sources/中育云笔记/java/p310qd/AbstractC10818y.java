package p310qd;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: qd.y */
/* loaded from: classes6.dex */
public abstract class AbstractC10818y extends AbstractC10817x {
    /* renamed from: q */
    public static Integer m23224q(String str) {
        AbstractC9979u.m20294g(str, "<this>");
        return m23225r(str, 10);
    }

    /* renamed from: r */
    public static final Integer m23225r(String str, int i10) {
        boolean z10;
        int i11;
        int i12;
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC10788a.m23073a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (AbstractC9979u.m20296i(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iM23074b = AbstractC10788a.m23074b(str.charAt(i11), i10);
            if (iM23074b < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iM23074b) {
                return null;
            }
            i13 = i12 - iM23074b;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    /* renamed from: s */
    public static Long m23226s(String str) {
        AbstractC9979u.m20294g(str, "<this>");
        return m23227t(str, 10);
    }

    /* renamed from: t */
    public static final Long m23227t(String str, int i10) {
        boolean z10;
        AbstractC9979u.m20294g(str, "<this>");
        AbstractC10788a.m23073a(i10);
        int length = str.length();
        Long l10 = null;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (AbstractC9979u.m20296i(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i11 < length) {
            int iM23074b = AbstractC10788a.m23074b(str.charAt(i11), i10);
            if (iM23074b < 0) {
                return l10;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return l10;
                }
                j12 = j10 / i10;
                if (j11 < j12) {
                    return l10;
                }
            }
            Long l11 = l10;
            int i12 = i11;
            long j13 = j11 * i10;
            long j14 = iM23074b;
            if (j13 < j10 + j14) {
                return l11;
            }
            j11 = j13 - j14;
            i11 = i12 + 1;
            l10 = l11;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }
}
