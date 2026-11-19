package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p310qd.C10792c;

/* loaded from: classes6.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        AbstractC9979u.m20294g(str, "<this>");
        byte[] bytes = str.getBytes(C10792c.f26019b);
        AbstractC9979u.m20293f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        AbstractC9979u.m20294g(bArr, "<this>");
        return new String(bArr, C10792c.f26019b);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, InterfaceC9529a action) {
        AbstractC9979u.m20294g(reentrantLock, "<this>");
        AbstractC9979u.m20294g(action, "action");
        reentrantLock.lock();
        try {
            return (T) action.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            reentrantLock.unlock();
            AbstractC9977s.m20285a(1);
        }
    }
}
