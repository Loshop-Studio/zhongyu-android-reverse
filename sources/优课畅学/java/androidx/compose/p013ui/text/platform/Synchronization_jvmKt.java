package androidx.compose.p013ui.text.platform;

import kotlin.jvm.internal.AbstractC9131s;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class Synchronization_jvmKt {
    public static final SynchronizedObject makeSynchronizedObject(Object obj) {
        return new SynchronizedObject();
    }

    public static /* synthetic */ SynchronizedObject makeSynchronizedObject$default(Object obj, int i10, Object obj2) {
        return new SynchronizedObject();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m26633synchronized(SynchronizedObject synchronizedObject, InterfaceC10559a interfaceC10559a) {
        R r10;
        synchronized (synchronizedObject) {
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
