package io.reactivex.internal.subscriptions;

import androidx.camera.view.AbstractC0908q;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public enum SubscriptionHelper implements InterfaceC0051d {
    CANCELLED;

    public static void deferredRequest(AtomicReference<InterfaceC0051d> atomicReference, AtomicLong atomicLong, long j9) {
        InterfaceC0051d interfaceC0051d = atomicReference.get();
        if (interfaceC0051d != null) {
            interfaceC0051d.request(j9);
            return;
        }
        if (validate(j9)) {
            BackpressureHelper.add(atomicLong, j9);
            InterfaceC0051d interfaceC0051d2 = atomicReference.get();
            if (interfaceC0051d2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC0051d2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<InterfaceC0051d> atomicReference, AtomicLong atomicLong, InterfaceC0051d interfaceC0051d) {
        if (!setOnce(atomicReference, interfaceC0051d)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        interfaceC0051d.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<InterfaceC0051d> atomicReference, InterfaceC0051d interfaceC0051d) {
        InterfaceC0051d interfaceC0051d2;
        do {
            interfaceC0051d2 = atomicReference.get();
            if (interfaceC0051d2 == CANCELLED) {
                if (interfaceC0051d == null) {
                    return false;
                }
                interfaceC0051d.cancel();
                return false;
            }
        } while (!AbstractC0908q.m812a(atomicReference, interfaceC0051d2, interfaceC0051d));
        return true;
    }

    public static void reportMoreProduced(long j9) {
        RxJavaPlugins.onError(new ProtocolViolationException("More produced than requested: " + j9));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<InterfaceC0051d> atomicReference, InterfaceC0051d interfaceC0051d) {
        InterfaceC0051d interfaceC0051d2;
        do {
            interfaceC0051d2 = atomicReference.get();
            if (interfaceC0051d2 == CANCELLED) {
                if (interfaceC0051d == null) {
                    return false;
                }
                interfaceC0051d.cancel();
                return false;
            }
        } while (!AbstractC0908q.m812a(atomicReference, interfaceC0051d2, interfaceC0051d));
        if (interfaceC0051d2 == null) {
            return true;
        }
        interfaceC0051d2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<InterfaceC0051d> atomicReference, InterfaceC0051d interfaceC0051d) {
        ObjectHelper.requireNonNull(interfaceC0051d, "s is null");
        if (AbstractC0908q.m812a(atomicReference, null, interfaceC0051d)) {
            return true;
        }
        interfaceC0051d.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(InterfaceC0051d interfaceC0051d, InterfaceC0051d interfaceC0051d2) {
        if (interfaceC0051d2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC0051d == null) {
            return true;
        }
        interfaceC0051d2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // p010a9.InterfaceC0051d
    public void cancel() {
    }

    @Override // p010a9.InterfaceC0051d
    public void request(long j9) {
    }

    public static boolean cancel(AtomicReference<InterfaceC0051d> atomicReference) {
        InterfaceC0051d andSet;
        InterfaceC0051d interfaceC0051d = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (interfaceC0051d == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j9) {
        if (j9 > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException("n > 0 required but it was " + j9));
        return false;
    }

    public static boolean setOnce(AtomicReference<InterfaceC0051d> atomicReference, InterfaceC0051d interfaceC0051d, long j9) {
        if (!setOnce(atomicReference, interfaceC0051d)) {
            return false;
        }
        interfaceC0051d.request(j9);
        return true;
    }
}
