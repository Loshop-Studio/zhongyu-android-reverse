package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<InterfaceC8990d> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i10) {
        super(i10);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        InterfaceC8990d andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                InterfaceC8990d interfaceC8990d = get(i10);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC8990d != subscriptionHelper && (andSet = getAndSet(i10, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public InterfaceC8990d replaceResource(int i10, InterfaceC8990d interfaceC8990d) {
        InterfaceC8990d interfaceC8990d2;
        do {
            interfaceC8990d2 = get(i10);
            if (interfaceC8990d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC8990d == null) {
                    return null;
                }
                interfaceC8990d.cancel();
                return null;
            }
        } while (!compareAndSet(i10, interfaceC8990d2, interfaceC8990d));
        return interfaceC8990d2;
    }

    public boolean setResource(int i10, InterfaceC8990d interfaceC8990d) {
        InterfaceC8990d interfaceC8990d2;
        do {
            interfaceC8990d2 = get(i10);
            if (interfaceC8990d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC8990d == null) {
                    return false;
                }
                interfaceC8990d.cancel();
                return false;
            }
        } while (!compareAndSet(i10, interfaceC8990d2, interfaceC8990d));
        if (interfaceC8990d2 == null) {
            return true;
        }
        interfaceC8990d2.cancel();
        return true;
    }
}
