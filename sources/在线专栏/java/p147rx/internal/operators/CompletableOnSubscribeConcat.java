package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p147rx.Completable;
import p147rx.CompletableSubscriber;
import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.MissingBackpressureException;
import p147rx.internal.subscriptions.SequentialSubscription;
import p147rx.internal.util.unsafe.SpscArrayQueue;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class CompletableOnSubscribeConcat implements Completable.OnSubscribe {
    final int prefetch;
    final Observable<Completable> sources;

    static final class CompletableConcatSubscriber extends Subscriber<Completable> {
        volatile boolean active;
        final CompletableSubscriber actual;
        volatile boolean done;
        final ConcatInnerSubscriber inner;
        final AtomicBoolean once;
        final SpscArrayQueue<Completable> queue;

        /* renamed from: sr */
        final SequentialSubscription f11769sr;

        final class ConcatInnerSubscriber extends AtomicInteger implements CompletableSubscriber {
            private static final long serialVersionUID = 7233503139645205620L;

            ConcatInnerSubscriber() {
            }

            @Override // p147rx.CompletableSubscriber
            public void onCompleted() {
                CompletableConcatSubscriber.this.innerComplete();
            }

            @Override // p147rx.CompletableSubscriber
            public void onError(Throwable th) {
                CompletableConcatSubscriber.this.innerError(th);
            }

            @Override // p147rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                CompletableConcatSubscriber.this.f11769sr.set(subscription);
            }
        }

        public CompletableConcatSubscriber(CompletableSubscriber completableSubscriber, int i4) {
            this.actual = completableSubscriber;
            this.queue = new SpscArrayQueue<>(i4);
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.f11769sr = sequentialSubscription;
            this.inner = new ConcatInnerSubscriber();
            this.once = new AtomicBoolean();
            add(sequentialSubscription);
            request(i4);
        }

        void drain() {
            ConcatInnerSubscriber concatInnerSubscriber = this.inner;
            if (concatInnerSubscriber.getAndIncrement() != 0) {
                return;
            }
            while (!isUnsubscribed()) {
                if (!this.active) {
                    boolean z3 = this.done;
                    Completable completablePoll = this.queue.poll();
                    boolean z4 = completablePoll == null;
                    if (z3 && z4) {
                        this.actual.onCompleted();
                        return;
                    } else if (!z4) {
                        this.active = true;
                        completablePoll.subscribe(concatInnerSubscriber);
                        request(1L);
                    }
                }
                if (concatInnerSubscriber.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        void innerComplete() {
            this.active = false;
            drain();
        }

        void innerError(Throwable th) {
            unsubscribe();
            onError(th);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                this.actual.onError(th);
            } else {
                RxJavaHooks.onError(th);
            }
        }

        @Override // p147rx.Observer
        public void onNext(Completable completable) {
            if (this.queue.offer(completable)) {
                drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeConcat(Observable<? extends Completable> observable, int i4) {
        this.sources = observable;
        this.prefetch = i4;
    }

    @Override // p147rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompletableConcatSubscriber completableConcatSubscriber = new CompletableConcatSubscriber(completableSubscriber, this.prefetch);
        completableSubscriber.onSubscribe(completableConcatSubscriber);
        this.sources.unsafeSubscribe(completableConcatSubscriber);
    }
}
