package androidx.room.concurrent;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes3.dex */
public final class ReentrantLockKt {
    public static final <T> T withLock(ReentrantLock reentrantLock, InterfaceC9529a block) {
        AbstractC9979u.m20294g(reentrantLock, "<this>");
        AbstractC9979u.m20294g(block, "block");
        reentrantLock.lock();
        try {
            return (T) block.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            reentrantLock.unlock();
            AbstractC9977s.m20285a(1);
        }
    }
}
