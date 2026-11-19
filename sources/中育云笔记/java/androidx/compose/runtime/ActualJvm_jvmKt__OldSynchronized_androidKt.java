package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
final /* synthetic */ class ActualJvm_jvmKt__OldSynchronized_androidKt {
    @InterfaceC10770a
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m30231synchronized(Object obj, InterfaceC9529a interfaceC9529a) {
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
