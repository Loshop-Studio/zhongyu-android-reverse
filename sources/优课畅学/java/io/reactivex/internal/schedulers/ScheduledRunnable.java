package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p277v6.InterfaceC10250b;
import p310y6.InterfaceC10666a;

/* loaded from: classes5.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC10250b {

    /* renamed from: b */
    public static final Object f17105b = new Object();

    /* renamed from: c */
    public static final Object f17106c = new Object();

    /* renamed from: d */
    public static final Object f17107d = new Object();

    /* renamed from: e */
    public static final Object f17108e = new Object();

    /* renamed from: a */
    public final Runnable f17109a;

    public ScheduledRunnable(Runnable runnable, InterfaceC10666a interfaceC10666a) {
        super(3);
        this.f17109a = runnable;
        lazySet(0, interfaceC10666a);
    }

    /* renamed from: a */
    public void m15563a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f17108e) {
                return;
            }
            if (obj == f17106c) {
                future.cancel(false);
                return;
            } else if (obj == f17107d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // p277v6.InterfaceC10250b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f17108e || obj5 == (obj3 = f17106c) || obj5 == (obj4 = f17107d)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z10);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f17108e || obj == (obj2 = f17105b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC10666a) obj).mo19200a(this);
    }

    @Override // p277v6.InterfaceC10250b
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f17105b || obj == f17108e;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f17109a.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f17105b) {
                    ((InterfaceC10666a) obj4).mo19200a(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f17106c) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, f17108e));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f17105b && compareAndSet(0, obj4, f17108e) && obj4 != null) {
            ((InterfaceC10666a) obj4).mo19200a(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f17106c || obj5 == f17107d) {
                return;
            }
        } while (!compareAndSet(1, obj5, f17108e));
    }
}
