package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9131s;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
final /* synthetic */ class ActualJvm_jvmKt__OldSynchronized_androidKt {
    @InterfaceC8721a
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m23629synchronized(Object obj, InterfaceC10559a interfaceC10559a) {
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
