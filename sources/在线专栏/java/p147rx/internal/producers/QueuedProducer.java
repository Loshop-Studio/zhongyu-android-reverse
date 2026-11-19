package p147rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.exceptions.MissingBackpressureException;
import p147rx.internal.operators.BackpressureUtils;
import p147rx.internal.util.atomic.SpscLinkedAtomicQueue;
import p147rx.internal.util.unsafe.SpscLinkedQueue;
import p147rx.internal.util.unsafe.UnsafeAccess;

/* loaded from: classes2.dex */
public final class QueuedProducer<T> extends AtomicLong implements Producer, Observer<T> {
    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final Subscriber<? super T> child;
    volatile boolean done;
    Throwable error;
    final Queue<Object> queue;
    final AtomicInteger wip;

    public QueuedProducer(Subscriber<? super T> subscriber) {
        this(subscriber, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new SpscLinkedAtomicQueue());
    }

    private boolean checkTerminated(boolean z3, boolean z4) {
        if (this.child.isUnsubscribed()) {
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            this.queue.clear();
            this.child.onError(th);
            return true;
        }
        if (!z4) {
            return false;
        }
        this.child.onCompleted();
        return true;
    }

    private void drain() {
        if (this.wip.getAndIncrement() == 0) {
            Subscriber<? super T> subscriber = this.child;
            Queue<Object> queue = this.queue;
            while (!checkTerminated(this.done, queue.isEmpty())) {
                this.wip.lazySet(1);
                long j4 = get();
                long j5 = 0;
                while (j4 != 0) {
                    boolean z3 = this.done;
                    Object objPoll = queue.poll();
                    if (checkTerminated(z3, objPoll == null)) {
                        return;
                    }
                    if (objPoll == null) {
                        break;
                    }
                    try {
                        if (objPoll == NULL_SENTINEL) {
                            subscriber.onNext(null);
                        } else {
                            subscriber.onNext(objPoll);
                        }
                        j4--;
                        j5++;
                    } catch (Throwable th) {
                        if (objPoll == NULL_SENTINEL) {
                            objPoll = null;
                        }
                        Exceptions.throwOrReport(th, subscriber, objPoll);
                        return;
                    }
                }
                if (j5 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j5);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public boolean offer(T t3) {
        if (t3 == null) {
            if (!this.queue.offer(NULL_SENTINEL)) {
                return false;
            }
        } else if (!this.queue.offer(t3)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        if (offer(t3)) {
            return;
        }
        onError(new MissingBackpressureException());
    }

    @Override // p147rx.Producer
    public void request(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j4 > 0) {
            BackpressureUtils.getAndAddRequest(this, j4);
            drain();
        }
    }

    public QueuedProducer(Subscriber<? super T> subscriber, Queue<Object> queue) {
        this.child = subscriber;
        this.queue = queue;
        this.wip = new AtomicInteger();
    }
}
