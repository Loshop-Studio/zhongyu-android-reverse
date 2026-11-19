package p147rx.internal.operators;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p147rx.Single;
import p147rx.SingleSubscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.functions.FuncN;
import p147rx.plugins.RxJavaHooks;
import p147rx.subscriptions.CompositeSubscription;

/* loaded from: classes2.dex */
public final class SingleOperatorZip {
    private SingleOperatorZip() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, R> Single<R> zip(final Single<? extends T>[] singleArr, final FuncN<? extends R> funcN) {
        return Single.create(new Single.OnSubscribe<R>() { // from class: rx.internal.operators.SingleOperatorZip.1
            @Override // p147rx.functions.Action1
            public void call(final SingleSubscriber<? super R> singleSubscriber) {
                if (singleArr.length == 0) {
                    singleSubscriber.onError(new NoSuchElementException("Can't zip 0 Singles."));
                    return;
                }
                final AtomicInteger atomicInteger = new AtomicInteger(singleArr.length);
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                final Object[] objArr = new Object[singleArr.length];
                CompositeSubscription compositeSubscription = new CompositeSubscription();
                singleSubscriber.add(compositeSubscription);
                for (int i4 = 0; i4 < singleArr.length && !compositeSubscription.isUnsubscribed() && !atomicBoolean.get(); i4++) {
                    final int i5 = i4;
                    Subscription subscription = new SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOperatorZip.1.1
                        @Override // p147rx.SingleSubscriber
                        public void onError(Throwable th) {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                singleSubscriber.onError(th);
                            } else {
                                RxJavaHooks.onError(th);
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // p147rx.SingleSubscriber
                        public void onSuccess(T t3) {
                            objArr[i5] = t3;
                            if (atomicInteger.decrementAndGet() == 0) {
                                try {
                                    singleSubscriber.onSuccess(funcN.call(objArr));
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    onError(th);
                                }
                            }
                        }
                    };
                    compositeSubscription.add(subscription);
                    if (compositeSubscription.isUnsubscribed() || atomicBoolean.get()) {
                        return;
                    }
                    singleArr[i4].subscribe((SingleSubscriber) subscription);
                }
            }
        });
    }
}
