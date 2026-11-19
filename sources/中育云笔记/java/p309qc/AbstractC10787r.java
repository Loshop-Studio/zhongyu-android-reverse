package p309qc;

import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10788a;

/* renamed from: qc.r */
/* loaded from: classes6.dex */
public abstract class AbstractC10787r {
    /* renamed from: a */
    public static final int m23069a(int i10, int i11) {
        return AbstractC9979u.m20296i(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public static final int m23070b(long j10, long j11) {
        return AbstractC9979u.m20297j(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    /* renamed from: c */
    public static final double m23071c(long j10) {
        return ((j10 >>> 11) * 2048) + (j10 & 2047);
    }

    /* renamed from: d */
    public static final String m23072d(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, AbstractC10788a.m23073a(i10));
            AbstractC9979u.m20293f(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, AbstractC10788a.m23073a(i10));
        AbstractC9979u.m20293f(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, AbstractC10788a.m23073a(i10));
        AbstractC9979u.m20293f(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
