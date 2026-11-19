package p088e7;

import java.util.concurrent.atomic.AtomicLong;
import p100f7.AbstractC8462a;

/* renamed from: e7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8368a {
    /* renamed from: a */
    public static long m13654a(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, m13655b(j11, j10)));
        return j11;
    }

    /* renamed from: b */
    public static long m13655b(long j10, long j11) {
        long j12 = j10 + j11;
        if (j12 < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    /* renamed from: c */
    public static long m13656c(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                AbstractC8462a.m13801k(new IllegalStateException("More produced than requested: " + j12));
                j12 = 0L;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }
}
