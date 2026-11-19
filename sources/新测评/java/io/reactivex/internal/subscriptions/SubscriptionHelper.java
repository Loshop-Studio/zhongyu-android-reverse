package io.reactivex.internal.subscriptions;

import androidx.camera.view.AbstractC0920q;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public enum SubscriptionHelper implements InterfaceC8990d {
    CANCELLED;

    public static void deferredRequest(AtomicReference<InterfaceC8990d> atomicReference, AtomicLong atomicLong, long j10) {
        InterfaceC8990d interfaceC8990d = atomicReference.get();
        if (interfaceC8990d != null) {
            interfaceC8990d.request(j10);
            return;
        }
        if (validate(j10)) {
            BackpressureHelper.add(atomicLong, j10);
            InterfaceC8990d interfaceC8990d2 = atomicReference.get();
            if (interfaceC8990d2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC8990d2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<InterfaceC8990d> atomicReference, AtomicLong atomicLong, InterfaceC8990d interfaceC8990d) {
        if (!setOnce(atomicReference, interfaceC8990d)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        interfaceC8990d.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<InterfaceC8990d> atomicReference, InterfaceC8990d interfaceC8990d) {
        InterfaceC8990d interfaceC8990d2;
        do {
            interfaceC8990d2 = atomicReference.get();
            if (interfaceC8990d2 == CANCELLED) {
                if (interfaceC8990d == null) {
                    return false;
                }
                interfaceC8990d.cancel();
                return false;
            }
        } while (!AbstractC0920q.m1034a(atomicReference, interfaceC8990d2, interfaceC8990d));
        return true;
    }

    public static void reportMoreProduced(long j10) {
        RxJavaPlugins.onError(new ProtocolViolationException("More produced than requested: " + j10));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<InterfaceC8990d> atomicReference, InterfaceC8990d interfaceC8990d) {
        InterfaceC8990d interfaceC8990d2;
        do {
            interfaceC8990d2 = atomicReference.get();
            if (interfaceC8990d2 == CANCELLED) {
                if (interfaceC8990d == null) {
                    return false;
                }
                interfaceC8990d.cancel();
                return false;
            }
        } while (!AbstractC0920q.m1034a(atomicReference, interfaceC8990d2, interfaceC8990d));
        if (interfaceC8990d2 == null) {
            return true;
        }
        interfaceC8990d2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<InterfaceC8990d> atomicReference, InterfaceC8990d interfaceC8990d) {
        ObjectHelper.requireNonNull(interfaceC8990d, "s is null");
        if (AbstractC0920q.m1034a(atomicReference, null, interfaceC8990d)) {
            return true;
        }
        interfaceC8990d.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(InterfaceC8990d interfaceC8990d, InterfaceC8990d interfaceC8990d2) {
        if (interfaceC8990d2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC8990d == null) {
            return true;
        }
        interfaceC8990d2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // p215q9.InterfaceC8990d
    public void cancel() {
    }

    @Override // p215q9.InterfaceC8990d
    public void request(long j10) {
    }

    public static boolean cancel(AtomicReference<InterfaceC8990d> atomicReference) {
        InterfaceC8990d andSet;
        InterfaceC8990d interfaceC8990d = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (interfaceC8990d == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j10) {
        if (j10 > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean setOnce(AtomicReference<InterfaceC8990d> atomicReference, InterfaceC8990d interfaceC8990d, long j10) {
        if (!setOnce(atomicReference, interfaceC8990d)) {
            return false;
        }
        interfaceC8990d.request(j10);
        return true;
    }
}
