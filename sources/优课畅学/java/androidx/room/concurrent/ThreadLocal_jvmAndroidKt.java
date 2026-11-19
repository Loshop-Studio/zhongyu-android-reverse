package androidx.room.concurrent;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8880u1;

/* loaded from: classes3.dex */
public final class ThreadLocal_jvmAndroidKt {
    public static /* synthetic */ void ThreadLocal$annotations() {
    }

    public static final <T> InterfaceC9100d.b asContextElement(ThreadLocal<T> threadLocal, T t10) {
        AbstractC9133u.m16133g(threadLocal, "<this>");
        return AbstractC8880u1.m14917a(threadLocal, t10);
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }
}
