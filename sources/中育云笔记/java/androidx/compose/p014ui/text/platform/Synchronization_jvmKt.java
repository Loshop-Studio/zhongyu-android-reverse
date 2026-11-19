package androidx.compose.p014ui.text.platform;

import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class Synchronization_jvmKt {
    public static final SynchronizedObject makeSynchronizedObject(Object obj) {
        return new SynchronizedObject();
    }

    public static /* synthetic */ SynchronizedObject makeSynchronizedObject$default(Object obj, int i10, Object obj2) {
        return new SynchronizedObject();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m33235synchronized(SynchronizedObject synchronizedObject, InterfaceC9529a interfaceC9529a) {
        R r10;
        synchronized (synchronizedObject) {
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
