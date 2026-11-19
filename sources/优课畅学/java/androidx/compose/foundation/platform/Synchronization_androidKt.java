package androidx.compose.foundation.platform;

import kotlin.jvm.internal.AbstractC9131s;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
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
    public static final <R> R m21118synchronized(Object obj, InterfaceC10559a interfaceC10559a) {
        R r10;
        synchronized (obj) {
            try {
                r10 = (R) interfaceC10559a.invoke();
                AbstractC9131s.m16125b(1);
            } catch (Throwable th) {
                AbstractC9131s.m16125b(1);
                AbstractC9131s.m16124a(1);
                throw th;
            }
        }
        AbstractC9131s.m16124a(1);
        return r10;
    }
}
