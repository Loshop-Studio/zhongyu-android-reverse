package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<InterfaceC0051d> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i9) {
        super(i9);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        InterfaceC0051d andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i9 = 0; i9 < length; i9++) {
                InterfaceC0051d interfaceC0051d = get(i9);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC0051d != subscriptionHelper && (andSet = getAndSet(i9, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public InterfaceC0051d replaceResource(int i9, InterfaceC0051d interfaceC0051d) {
        InterfaceC0051d interfaceC0051d2;
        do {
            interfaceC0051d2 = get(i9);
            if (interfaceC0051d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC0051d == null) {
                    return null;
                }
                interfaceC0051d.cancel();
                return null;
            }
        } while (!compareAndSet(i9, interfaceC0051d2, interfaceC0051d));
        return interfaceC0051d2;
    }

    public boolean setResource(int i9, InterfaceC0051d interfaceC0051d) {
        InterfaceC0051d interfaceC0051d2;
        do {
            interfaceC0051d2 = get(i9);
            if (interfaceC0051d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC0051d == null) {
                    return false;
                }
                interfaceC0051d.cancel();
                return false;
            }
        } while (!compareAndSet(i9, interfaceC0051d2, interfaceC0051d));
        if (interfaceC0051d2 == null) {
            return true;
        }
        interfaceC0051d2.cancel();
        return true;
    }
}
