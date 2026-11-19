package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p147rx.Completable;
import p147rx.CompletableSubscriber;
import p147rx.Subscription;
import p147rx.internal.subscriptions.SequentialSubscription;

/* loaded from: classes2.dex */
public final class CompletableOnSubscribeConcatArray implements Completable.OnSubscribe {
    final Completable[] sources;

    static final class ConcatInnerSubscriber extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        final CompletableSubscriber actual;
        int index;

        /* renamed from: sd */
        final SequentialSubscription f11770sd = new SequentialSubscription();
        final Completable[] sources;

        public ConcatInnerSubscriber(CompletableSubscriber completableSubscriber, Completable[] completableArr) {
            this.actual = completableSubscriber;
            this.sources = completableArr;
        }

        void next() {
            if (!this.f11770sd.isUnsubscribed() && getAndIncrement() == 0) {
                Completable[] completableArr = this.sources;
                while (!this.f11770sd.isUnsubscribed()) {
                    int i4 = this.index;
                    this.index = i4 + 1;
                    if (i4 == completableArr.length) {
                        this.actual.onCompleted();
                        return;
                    } else {
                        completableArr[i4].unsafeSubscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // p147rx.CompletableSubscriber
        public void onCompleted() {
            next();
        }

        @Override // p147rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        @Override // p147rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f11770sd.replace(subscription);
        }
    }

    public CompletableOnSubscribeConcatArray(Completable[] completableArr) {
        this.sources = completableArr;
    }

    @Override // p147rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        ConcatInnerSubscriber concatInnerSubscriber = new ConcatInnerSubscriber(completableSubscriber, this.sources);
        completableSubscriber.onSubscribe(concatInnerSubscriber.f11770sd);
        concatInnerSubscriber.next();
    }
}
