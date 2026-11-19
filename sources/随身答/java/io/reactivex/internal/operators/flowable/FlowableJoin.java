package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {
    final Function<? super TLeft, ? extends InterfaceC0049b> leftEnd;
    final InterfaceC0049b other;
    final BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
    final Function<? super TRight, ? extends InterfaceC0049b> rightEnd;

    public static final class JoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements InterfaceC0051d, FlowableGroupJoin.JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final InterfaceC0050c downstream;
        final Function<? super TLeft, ? extends InterfaceC0049b> leftEnd;
        int leftIndex;
        final BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
        final Function<? super TRight, ? extends InterfaceC0049b> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable disposables = new CompositeDisposable();
        final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        final Map<Integer, TLeft> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        public JoinSubscription(InterfaceC0050c interfaceC0050c, Function<? super TLeft, ? extends InterfaceC0049b> function, Function<? super TRight, ? extends InterfaceC0049b> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.downstream = interfaceC0050c;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void cancelAll() {
            this.disposables.dispose();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            InterfaceC0050c interfaceC0050c = this.downstream;
            boolean z9 = true;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    spscLinkedArrayQueue.clear();
                    cancelAll();
                    errorAll(interfaceC0050c);
                    return;
                }
                boolean z10 = this.active.get() == 0 ? z9 : false;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z11 = num == null ? z9 : false;
                if (z10 && z11) {
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    interfaceC0050c.onComplete();
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == LEFT_VALUE) {
                        int i9 = this.leftIndex;
                        this.leftIndex = i9 + 1;
                        this.lefts.put(Integer.valueOf(i9), objPoll);
                        try {
                            InterfaceC0049b interfaceC0049b = (InterfaceC0049b) ObjectHelper.requireNonNull(this.leftEnd.apply(objPoll), "The leftEnd returned a null Publisher");
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber = new FlowableGroupJoin.LeftRightEndSubscriber(this, z9, i9);
                            this.disposables.add(leftRightEndSubscriber);
                            interfaceC0049b.subscribe(leftRightEndSubscriber);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(interfaceC0050c);
                                return;
                            }
                            long j9 = this.requested.get();
                            Iterator<TRight> it = this.rights.values().iterator();
                            long j10 = 0;
                            while (it.hasNext()) {
                                try {
                                    Object objRequireNonNull = ObjectHelper.requireNonNull(this.resultSelector.apply(objPoll, it.next()), "The resultSelector returned a null value");
                                    if (j10 == j9) {
                                        ExceptionHelper.addThrowable(this.error, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        cancelAll();
                                        errorAll(interfaceC0050c);
                                        return;
                                    }
                                    interfaceC0050c.onNext(objRequireNonNull);
                                    j10++;
                                } catch (Throwable th) {
                                    fail(th, interfaceC0050c, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j10 != 0) {
                                BackpressureHelper.produced(this.requested, j10);
                            }
                        } catch (Throwable th2) {
                            fail(th2, interfaceC0050c, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i10 = this.rightIndex;
                        this.rightIndex = i10 + 1;
                        this.rights.put(Integer.valueOf(i10), objPoll);
                        try {
                            InterfaceC0049b interfaceC0049b2 = (InterfaceC0049b) ObjectHelper.requireNonNull(this.rightEnd.apply(objPoll), "The rightEnd returned a null Publisher");
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber2 = new FlowableGroupJoin.LeftRightEndSubscriber(this, false, i10);
                            this.disposables.add(leftRightEndSubscriber2);
                            interfaceC0049b2.subscribe(leftRightEndSubscriber2);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(interfaceC0050c);
                                return;
                            }
                            long j11 = this.requested.get();
                            Iterator<TLeft> it2 = this.lefts.values().iterator();
                            long j12 = 0;
                            while (it2.hasNext()) {
                                try {
                                    Object objRequireNonNull2 = ObjectHelper.requireNonNull(this.resultSelector.apply(it2.next(), objPoll), "The resultSelector returned a null value");
                                    if (j12 == j11) {
                                        ExceptionHelper.addThrowable(this.error, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        cancelAll();
                                        errorAll(interfaceC0050c);
                                        return;
                                    }
                                    interfaceC0050c.onNext(objRequireNonNull2);
                                    j12++;
                                } catch (Throwable th3) {
                                    fail(th3, interfaceC0050c, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j12 != 0) {
                                BackpressureHelper.produced(this.requested, j12);
                            }
                        } catch (Throwable th4) {
                            fail(th4, interfaceC0050c, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber3 = (FlowableGroupJoin.LeftRightEndSubscriber) objPoll;
                        this.lefts.remove(Integer.valueOf(leftRightEndSubscriber3.index));
                        this.disposables.remove(leftRightEndSubscriber3);
                    } else if (num == RIGHT_CLOSE) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber4 = (FlowableGroupJoin.LeftRightEndSubscriber) objPoll;
                        this.rights.remove(Integer.valueOf(leftRightEndSubscriber4.index));
                        this.disposables.remove(leftRightEndSubscriber4);
                    }
                    z9 = true;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void errorAll(InterfaceC0050c interfaceC0050c) {
            Throwable thTerminate = ExceptionHelper.terminate(this.error);
            this.lefts.clear();
            this.rights.clear();
            interfaceC0050c.onError(thTerminate);
        }

        public void fail(Throwable th, InterfaceC0050c interfaceC0050c, SimpleQueue<?> simpleQueue) {
            Exceptions.throwIfFatal(th);
            ExceptionHelper.addThrowable(this.error, th);
            simpleQueue.clear();
            cancelAll();
            errorAll(interfaceC0050c);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerClose(boolean z9, FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                try {
                    this.queue.offer(z9 ? LEFT_CLOSE : RIGHT_CLOSE, leftRightEndSubscriber);
                } catch (Throwable th) {
                    throw th;
                }
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerCloseError(Throwable th) {
            if (ExceptionHelper.addThrowable(this.error, th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerComplete(FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber) {
            this.disposables.delete(leftRightSubscriber);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerError(Throwable th) {
            if (!ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.active.decrementAndGet();
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerValue(boolean z9, Object obj) {
            synchronized (this) {
                try {
                    this.queue.offer(z9 ? LEFT_VALUE : RIGHT_VALUE, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            drain();
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this.requested, j9);
            }
        }
    }

    public FlowableJoin(Flowable<TLeft> flowable, InterfaceC0049b interfaceC0049b, Function<? super TLeft, ? extends InterfaceC0049b> function, Function<? super TRight, ? extends InterfaceC0049b> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(flowable);
        this.other = interfaceC0049b;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        JoinSubscription joinSubscription = new JoinSubscription(interfaceC0050c, this.leftEnd, this.rightEnd, this.resultSelector);
        interfaceC0050c.onSubscribe(joinSubscription);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, true);
        joinSubscription.disposables.add(leftRightSubscriber);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber2 = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, false);
        joinSubscription.disposables.add(leftRightSubscriber2);
        this.source.subscribe((FlowableSubscriber) leftRightSubscriber);
        this.other.subscribe(leftRightSubscriber2);
    }
}
