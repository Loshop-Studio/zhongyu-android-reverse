package androidx.compose.runtime.platform;

import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class Synchronization_androidKt {
    public static /* synthetic */ void SynchronizedObject$annotations() {
    }

    public static final Object makeSynchronizedObject(Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object makeSynchronizedObject$default(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return obj == null ? new Object() : obj;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m30419synchronized(Object obj, InterfaceC9529a interfaceC9529a) {
        R r10;
        synchronized (obj) {
            try {
                r10 = (R) interfaceC9529a.invoke();
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        return r10;
    }
}
