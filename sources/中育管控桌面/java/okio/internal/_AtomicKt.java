package okio.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, m7880d2 = {"setBitsOrZero", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "bits", "okio"}, m7881k = 2, m7882mv = {2, 1, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class _AtomicKt {
    public static final int setBitsOrZero(AtomicInteger atomicInteger, int i6) {
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        do {
            i7 = atomicInteger.get();
            if ((i7 & i6) != 0) {
                return 0;
            }
            i8 = i7 | i6;
        } while (!atomicInteger.compareAndSet(i7, i8));
        return i8;
    }
}
