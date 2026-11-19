package androidx.room.concurrent;

import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes3.dex */
public final class Synchronized_jvmAndroidKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m33811synchronized(Object lock, InterfaceC9529a block) {
        T t10;
        AbstractC9979u.m20294g(lock, "lock");
        AbstractC9979u.m20294g(block, "block");
        synchronized (lock) {
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
