package io.reactivex.internal.util;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean addThrowable(Throwable th) {
        Throwable th2 = AbstractC5729a.f9062a;
        while (true) {
            Throwable th3 = get();
            if (th3 == AbstractC5729a.f9062a) {
                return false;
            }
            Throwable compositeException = th3 == null ? th : new CompositeException(th3, th);
            while (!compareAndSet(th3, compositeException)) {
                if (get() != th3) {
                    break;
                }
            }
            return true;
        }
    }

    public boolean isTerminated() {
        return get() == AbstractC5729a.f9062a;
    }

    public Throwable terminate() {
        Throwable th = AbstractC5729a.f9062a;
        Throwable th2 = get();
        Throwable th3 = AbstractC5729a.f9062a;
        return th2 != th3 ? getAndSet(th3) : th2;
    }
}
