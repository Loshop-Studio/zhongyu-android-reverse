package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<InterfaceC7918d> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i6) {
        super(i6);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        InterfaceC7918d andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i6 = 0; i6 < length; i6++) {
                InterfaceC7918d interfaceC7918d = get(i6);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC7918d != subscriptionHelper && (andSet = getAndSet(i6, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public InterfaceC7918d replaceResource(int i6, InterfaceC7918d interfaceC7918d) {
        InterfaceC7918d interfaceC7918d2;
        do {
            interfaceC7918d2 = get(i6);
            if (interfaceC7918d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC7918d == null) {
                    return null;
                }
                interfaceC7918d.cancel();
                return null;
            }
        } while (!compareAndSet(i6, interfaceC7918d2, interfaceC7918d));
        return interfaceC7918d2;
    }

    public boolean setResource(int i6, InterfaceC7918d interfaceC7918d) {
        InterfaceC7918d interfaceC7918d2;
        do {
            interfaceC7918d2 = get(i6);
            if (interfaceC7918d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC7918d == null) {
                    return false;
                }
                interfaceC7918d.cancel();
                return false;
            }
        } while (!compareAndSet(i6, interfaceC7918d2, interfaceC7918d));
        if (interfaceC7918d2 == null) {
            return true;
        }
        interfaceC7918d2.cancel();
        return true;
    }
}
