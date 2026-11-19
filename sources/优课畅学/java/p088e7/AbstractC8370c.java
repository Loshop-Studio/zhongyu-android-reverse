package p088e7;

import ba.InterfaceC5218b;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import p100f7.AbstractC8462a;

/* renamed from: e7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8370c {
    /* renamed from: a */
    public static void m13660a(InterfaceC5218b interfaceC5218b, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thM15577b = atomicThrowable.m15577b();
            if (thM15577b != null) {
                interfaceC5218b.onError(thM15577b);
            } else {
                interfaceC5218b.onComplete();
            }
        }
    }

    /* renamed from: b */
    public static void m13661b(InterfaceC5218b interfaceC5218b, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.m15576a(th)) {
            AbstractC8462a.m13801k(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            interfaceC5218b.onError(atomicThrowable.m15577b());
        }
    }

    /* renamed from: c */
    public static void m13662c(InterfaceC5218b interfaceC5218b, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC5218b.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thM15577b = atomicThrowable.m15577b();
                if (thM15577b != null) {
                    interfaceC5218b.onError(thM15577b);
                } else {
                    interfaceC5218b.onComplete();
                }
            }
        }
    }
}
