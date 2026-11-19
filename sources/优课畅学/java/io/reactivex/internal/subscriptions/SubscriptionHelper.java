package io.reactivex.internal.subscriptions;

import androidx.camera.view.AbstractC0949q;
import ba.InterfaceC5219c;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p088e7.AbstractC8368a;
import p100f7.AbstractC8462a;
import p321z6.AbstractC10726b;

/* loaded from: classes5.dex */
public enum SubscriptionHelper implements InterfaceC5219c {
    CANCELLED;

    /* renamed from: a */
    public static boolean m15569a(AtomicReference atomicReference) {
        InterfaceC5219c interfaceC5219c;
        InterfaceC5219c interfaceC5219c2 = (InterfaceC5219c) atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (interfaceC5219c2 == subscriptionHelper || (interfaceC5219c = (InterfaceC5219c) atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (interfaceC5219c == null) {
            return true;
        }
        interfaceC5219c.cancel();
        return true;
    }

    /* renamed from: b */
    public static void m15570b(AtomicReference atomicReference, AtomicLong atomicLong, long j10) {
        InterfaceC5219c interfaceC5219c = (InterfaceC5219c) atomicReference.get();
        if (interfaceC5219c != null) {
            interfaceC5219c.request(j10);
            return;
        }
        if (m15574g(j10)) {
            AbstractC8368a.m13654a(atomicLong, j10);
            InterfaceC5219c interfaceC5219c2 = (InterfaceC5219c) atomicReference.get();
            if (interfaceC5219c2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC5219c2.request(andSet);
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m15571c(AtomicReference atomicReference, AtomicLong atomicLong, InterfaceC5219c interfaceC5219c) {
        if (!m15573e(atomicReference, interfaceC5219c)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        interfaceC5219c.request(andSet);
        return true;
    }

    /* renamed from: d */
    public static void m15572d() {
        AbstractC8462a.m13801k(new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: e */
    public static boolean m15573e(AtomicReference atomicReference, InterfaceC5219c interfaceC5219c) {
        AbstractC10726b.m20030c(interfaceC5219c, "s is null");
        if (AbstractC0949q.m807a(atomicReference, null, interfaceC5219c)) {
            return true;
        }
        interfaceC5219c.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        m15572d();
        return false;
    }

    /* renamed from: g */
    public static boolean m15574g(long j10) {
        if (j10 > 0) {
            return true;
        }
        AbstractC8462a.m13801k(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    /* renamed from: h */
    public static boolean m15575h(InterfaceC5219c interfaceC5219c, InterfaceC5219c interfaceC5219c2) {
        if (interfaceC5219c2 == null) {
            AbstractC8462a.m13801k(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC5219c == null) {
            return true;
        }
        interfaceC5219c2.cancel();
        m15572d();
        return false;
    }

    @Override // ba.InterfaceC5219c
    public void cancel() {
    }

    @Override // ba.InterfaceC5219c
    public void request(long j10) {
    }
}
