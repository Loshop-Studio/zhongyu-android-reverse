package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.C8660c;
import p300x7.InterfaceC10559a;

/* loaded from: classes5.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        byte[] bytes = str.getBytes(C8660c.f16206b);
        AbstractC9133u.m16132f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        AbstractC9133u.m16133g(bArr, "<this>");
        return new String(bArr, C8660c.f16206b);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, InterfaceC10559a action) {
        AbstractC9133u.m16133g(reentrantLock, "<this>");
        AbstractC9133u.m16133g(action, "action");
        reentrantLock.lock();
        try {
            return (T) action.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            reentrantLock.unlock();
            AbstractC9131s.m16124a(1);
        }
    }
}
