package io.reactivex.internal.subscriptions;

import androidx.compose.animation.core.AbstractC0433h;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public enum SubscriptionHelper implements InterfaceC7918d {
    CANCELLED;

    public static void deferredRequest(AtomicReference<InterfaceC7918d> atomicReference, AtomicLong atomicLong, long j6) {
        InterfaceC7918d interfaceC7918d = atomicReference.get();
        if (interfaceC7918d != null) {
            interfaceC7918d.request(j6);
            return;
        }
        if (validate(j6)) {
            BackpressureHelper.add(atomicLong, j6);
            InterfaceC7918d interfaceC7918d2 = atomicReference.get();
            if (interfaceC7918d2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC7918d2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<InterfaceC7918d> atomicReference, AtomicLong atomicLong, InterfaceC7918d interfaceC7918d) {
        if (!setOnce(atomicReference, interfaceC7918d)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        interfaceC7918d.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<InterfaceC7918d> atomicReference, InterfaceC7918d interfaceC7918d) {
        InterfaceC7918d interfaceC7918d2;
        do {
            interfaceC7918d2 = atomicReference.get();
            if (interfaceC7918d2 == CANCELLED) {
                if (interfaceC7918d == null) {
                    return false;
                }
                interfaceC7918d.cancel();
                return false;
            }
        } while (!AbstractC0433h.m112a(atomicReference, interfaceC7918d2, interfaceC7918d));
        return true;
    }

    public static void reportMoreProduced(long j6) {
        RxJavaPlugins.onError(new ProtocolViolationException("More produced than requested: " + j6));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<InterfaceC7918d> atomicReference, InterfaceC7918d interfaceC7918d) {
        InterfaceC7918d interfaceC7918d2;
        do {
            interfaceC7918d2 = atomicReference.get();
            if (interfaceC7918d2 == CANCELLED) {
                if (interfaceC7918d == null) {
                    return false;
                }
                interfaceC7918d.cancel();
                return false;
            }
        } while (!AbstractC0433h.m112a(atomicReference, interfaceC7918d2, interfaceC7918d));
        if (interfaceC7918d2 == null) {
            return true;
        }
        interfaceC7918d2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<InterfaceC7918d> atomicReference, InterfaceC7918d interfaceC7918d) {
        ObjectHelper.requireNonNull(interfaceC7918d, "s is null");
        if (AbstractC0433h.m112a(atomicReference, null, interfaceC7918d)) {
            return true;
        }
        interfaceC7918d.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(InterfaceC7918d interfaceC7918d, InterfaceC7918d interfaceC7918d2) {
        if (interfaceC7918d2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC7918d == null) {
            return true;
        }
        interfaceC7918d2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // p193y5.InterfaceC7918d
    public void cancel() {
    }

    @Override // p193y5.InterfaceC7918d
    public void request(long j6) {
    }

    public static boolean cancel(AtomicReference<InterfaceC7918d> atomicReference) {
        InterfaceC7918d andSet;
        InterfaceC7918d interfaceC7918d = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (interfaceC7918d == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j6) {
        if (j6 > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException("n > 0 required but it was " + j6));
        return false;
    }

    public static boolean setOnce(AtomicReference<InterfaceC7918d> atomicReference, InterfaceC7918d interfaceC7918d, long j6) {
        if (!setOnce(atomicReference, interfaceC7918d)) {
            return false;
        }
        interfaceC7918d.request(j6);
        return true;
    }
}
