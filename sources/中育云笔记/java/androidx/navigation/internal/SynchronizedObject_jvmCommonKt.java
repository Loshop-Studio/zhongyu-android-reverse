package androidx.navigation.internal;

import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class SynchronizedObject_jvmCommonKt {
    public static final <T> T synchronizedImpl(SynchronizedObject lock, InterfaceC9529a action) {
        T t10;
        AbstractC9979u.m20294g(lock, "lock");
        AbstractC9979u.m20294g(action, "action");
        synchronized (lock) {
            try {
                t10 = (T) action.invoke();
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
