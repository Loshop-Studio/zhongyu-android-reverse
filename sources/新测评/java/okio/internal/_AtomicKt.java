package okio.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, m13558d2 = {"setBitsOrZero", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "bits", "okio"}, m13559k = 2, m13560mv = {2, 1, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class _AtomicKt {
    public static final int setBitsOrZero(AtomicInteger atomicInteger, int i10) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
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
