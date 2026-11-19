package p147rx.internal.producers;

import java.util.ArrayList;
import java.util.List;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public final class ProducerObserverArbiter<T> implements Producer, Observer<T> {
    static final Producer NULL_PRODUCER = new Producer() { // from class: rx.internal.producers.ProducerObserverArbiter.1
        @Override // p147rx.Producer
        public void request(long j4) {
        }
    };
    final Subscriber<? super T> child;
    Producer currentProducer;
    boolean emitting;
    volatile boolean hasError;
    Producer missedProducer;
    long missedRequested;
    Object missedTerminal;
    List<T> queue;
    long requested;

    public ProducerObserverArbiter(Subscriber<? super T> subscriber) {
        this.child = subscriber;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0009, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void emitLoop() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p147rx.internal.producers.ProducerObserverArbiter.emitLoop():void");
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        synchronized (this) {
            if (this.emitting) {
                this.missedTerminal = Boolean.TRUE;
            } else {
                this.emitting = true;
                this.child.onCompleted();
            }
        }
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        boolean z3;
        synchronized (this) {
            if (this.emitting) {
                this.missedTerminal = th;
                z3 = false;
            } else {
                this.emitting = true;
                z3 = true;
            }
        }
        if (z3) {
            this.child.onError(th);
        } else {
            this.hasError = true;
        }
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        synchronized (this) {
            if (this.emitting) {
                List arrayList = this.queue;
                if (arrayList == null) {
                    arrayList = new ArrayList(4);
                    this.queue = arrayList;
                }
                arrayList.add(t3);
                return;
            }
            this.emitting = true;
            try {
                this.child.onNext(t3);
                long j4 = this.requested;
                if (j4 != Long.MAX_VALUE) {
                    this.requested = j4 - 1;
                }
                emitLoop();
            } catch (Throwable th) {
                synchronized (this) {
                    this.emitting = false;
                    throw th;
                }
            }
        }
    }

    @Override // p147rx.Producer
    public void request(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j4 == 0) {
            return;
        }
        synchronized (this) {
            if (this.emitting) {
                this.missedRequested += j4;
                return;
            }
            this.emitting = true;
            Producer producer = this.currentProducer;
            try {
                long j5 = this.requested + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.requested = j5;
                emitLoop();
                if (producer != null) {
                    producer.request(j4);
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.emitting = false;
                    throw th;
                }
            }
        }
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            if (this.emitting) {
                if (producer == null) {
                    producer = NULL_PRODUCER;
                }
                this.missedProducer = producer;
                return;
            }
            this.emitting = true;
            this.currentProducer = producer;
            long j4 = this.requested;
            try {
                emitLoop();
                if (producer == null || j4 == 0) {
                    return;
                }
                producer.request(j4);
            } catch (Throwable th) {
                synchronized (this) {
                    this.emitting = false;
                    throw th;
                }
            }
        }
    }
}
