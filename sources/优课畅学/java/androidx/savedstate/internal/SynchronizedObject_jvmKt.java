package androidx.savedstate.internal;

import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class SynchronizedObject_jvmKt {
    public static final <T> T synchronizedImpl(SynchronizedObject lock, InterfaceC10559a action) {
        T t10;
        AbstractC9133u.m16133g(lock, "lock");
        AbstractC9133u.m16133g(action, "action");
        synchronized (lock) {
            try {
                t10 = (T) action.invoke();
                AbstractC9131s.m16125b(1);
            } catch (Throwable th) {
                AbstractC9131s.m16125b(1);
                AbstractC9131s.m16124a(1);
                throw th;
            }
        }
        AbstractC9131s.m16124a(1);
        return t10;
    }
}
