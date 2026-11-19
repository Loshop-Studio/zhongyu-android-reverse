package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class SingleFromPublisher<T> extends Single<T> {
    final InterfaceC0049b publisher;

    public static final class ToSingleObserver<T> implements FlowableSubscriber<T>, Disposable {
        volatile boolean disposed;
        boolean done;
        final SingleObserver<? super T> downstream;
        InterfaceC0051d upstream;
        T value;

        public ToSingleObserver(SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t9 = this.value;
            this.value = null;
            if (t9 == null) {
                this.downstream.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.downstream.onSuccess(t9);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.value = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.done) {
                return;
            }
            if (this.value == null) {
                this.value = t9;
                return;
            }
            this.upstream.cancel();
            this.done = true;
            this.value = null;
            this.downstream.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
                interfaceC0051d.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleFromPublisher(InterfaceC0049b interfaceC0049b) {
        this.publisher = interfaceC0049b;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.publisher.subscribe(new ToSingleObserver(singleObserver));
    }
}
