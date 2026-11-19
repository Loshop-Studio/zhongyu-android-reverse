package androidx.room.concurrent;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import sd.AbstractC11116g2;

/* loaded from: classes3.dex */
public final class ThreadLocal_jvmAndroidKt {
    public static /* synthetic */ void ThreadLocal$annotations() {
    }

    public static final <T> InterfaceC9945d.b asContextElement(ThreadLocal<T> threadLocal, T t10) {
        AbstractC9979u.m20294g(threadLocal, "<this>");
        return AbstractC11116g2.m24722a(threadLocal, t10);
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }
}
