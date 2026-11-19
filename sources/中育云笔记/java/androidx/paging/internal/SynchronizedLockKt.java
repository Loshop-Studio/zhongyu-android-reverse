package androidx.paging.internal;

import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes3.dex */
public final class SynchronizedLockKt {
    public static final <T> T withLock(SynchronizedLock synchronizedLock, InterfaceC9529a block) {
        T t10;
        AbstractC9979u.m20294g(synchronizedLock, "<this>");
        AbstractC9979u.m20294g(block, "block");
        synchronized (synchronizedLock) {
            try {
                t10 = (T) block.invoke();
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        return t10;
    }
}
