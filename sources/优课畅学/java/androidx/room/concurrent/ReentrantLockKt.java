package androidx.room.concurrent;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class ReentrantLockKt {
    public static final <T> T withLock(ReentrantLock reentrantLock, InterfaceC10559a block) {
        AbstractC9133u.m16133g(reentrantLock, "<this>");
        AbstractC9133u.m16133g(block, "block");
        reentrantLock.lock();
        try {
            return (T) block.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            reentrantLock.unlock();
            AbstractC9131s.m16124a(1);
        }
    }
}
