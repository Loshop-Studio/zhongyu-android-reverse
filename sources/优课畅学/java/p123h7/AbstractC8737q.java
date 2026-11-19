package p123h7;

import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8656a;

/* renamed from: h7.q */
/* loaded from: classes5.dex */
public abstract class AbstractC8737q {
    /* renamed from: a */
    public static final int m14324a(int i10, int i11) {
        return AbstractC9133u.m16135i(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public static final int m14325b(long j10, long j11) {
        return AbstractC9133u.m16136j(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    /* renamed from: c */
    public static final double m14326c(long j10) {
        return ((j10 >>> 11) * 2048) + (j10 & 2047);
    }

    /* renamed from: d */
    public static final String m14327d(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, AbstractC8656a.m13939a(i10));
            AbstractC9133u.m16132f(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j12, AbstractC8656a.m13939a(i10));
        AbstractC9133u.m16132f(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j13, AbstractC8656a.m13939a(i10));
        AbstractC9133u.m16132f(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
