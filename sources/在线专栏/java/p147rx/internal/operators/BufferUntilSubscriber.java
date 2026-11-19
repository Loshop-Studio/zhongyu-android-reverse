package p147rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Subscriber;
import p147rx.functions.Action0;
import p147rx.subjects.Subject;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public final class BufferUntilSubscriber<T> extends Subject<T, T> {
    static final Observer EMPTY_OBSERVER = new Observer() { // from class: rx.internal.operators.BufferUntilSubscriber.1
        @Override // p147rx.Observer
        public void onCompleted() {
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
        }

        @Override // p147rx.Observer
        public void onNext(Object obj) {
        }
    };
    private boolean forward;
    final State<T> state;

    static final class OnSubscribeAction<T> implements Observable.OnSubscribe<T> {
        final State<T> state;

        public OnSubscribeAction(State<T> state) {
            this.state = state;
        }

        @Override // p147rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            boolean z3;
            if (!this.state.casObserverRef(null, subscriber)) {
                subscriber.onError(new IllegalStateException("Only one subscriber allowed!"));
                return;
            }
            subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.BufferUntilSubscriber.OnSubscribeAction.1
                @Override // p147rx.functions.Action0
                public void call() {
                    OnSubscribeAction.this.state.set(BufferUntilSubscriber.EMPTY_OBSERVER);
                }
            }));
            synchronized (this.state.guard) {
                State<T> state = this.state;
                z3 = true;
                if (state.emitting) {
                    z3 = false;
                } else {
                    state.emitting = true;
                }
            }
            if (!z3) {
                return;
            }
            while (true) {
                Object objPoll = this.state.buffer.poll();
                if (objPoll != null) {
                    NotificationLite.accept(this.state.get(), objPoll);
                } else {
                    synchronized (this.state.guard) {
                        if (this.state.buffer.isEmpty()) {
                            this.state.emitting = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    static final class State<T> extends AtomicReference<Observer<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        boolean emitting;
        final Object guard = new Object();
        final ConcurrentLinkedQueue<Object> buffer = new ConcurrentLinkedQueue<>();

        State() {
        }

        boolean casObserverRef(Observer<? super T> observer, Observer<? super T> observer2) {
            return compareAndSet(observer, observer2);
        }
    }

    private BufferUntilSubscriber(State<T> state) {
        super(new OnSubscribeAction(state));
        this.state = state;
    }

    public static <T> BufferUntilSubscriber<T> create() {
        return new BufferUntilSubscriber<>(new State());
    }

    private void emit(Object obj) {
        synchronized (this.state.guard) {
            this.state.buffer.add(obj);
            if (this.state.get() != null) {
                State<T> state = this.state;
                if (!state.emitting) {
                    this.forward = true;
                    state.emitting = true;
                }
            }
        }
        if (!this.forward) {
            return;
        }
        while (true) {
            Object objPoll = this.state.buffer.poll();
            if (objPoll == null) {
                return;
            } else {
                NotificationLite.accept(this.state.get(), objPoll);
            }
        }
    }

    @Override // p147rx.subjects.Subject
    public boolean hasObservers() {
        boolean z3;
        synchronized (this.state.guard) {
            z3 = this.state.get() != null;
        }
        return z3;
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        if (this.forward) {
            this.state.get().onCompleted();
        } else {
            emit(NotificationLite.completed());
        }
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        if (this.forward) {
            this.state.get().onError(th);
        } else {
            emit(NotificationLite.error(th));
        }
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        if (this.forward) {
            this.state.get().onNext(t3);
        } else {
            emit(NotificationLite.next(t3));
        }
    }
}
