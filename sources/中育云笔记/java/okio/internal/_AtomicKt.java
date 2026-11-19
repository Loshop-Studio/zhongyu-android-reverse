package okio.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class _AtomicKt {
    public static final int setBitsOrZero(AtomicInteger atomicInteger, int i10) {
        int i11;
        int i12;
        AbstractC9979u.m20294g(atomicInteger, "<this>");
        do {
            i11 = atomicInteger.get();
            if ((i11 & i10) != 0) {
                return 0;
            }
            i12 = i11 | i10;
        } while (!atomicInteger.compareAndSet(i11, i12));
        return i12;
    }
}
