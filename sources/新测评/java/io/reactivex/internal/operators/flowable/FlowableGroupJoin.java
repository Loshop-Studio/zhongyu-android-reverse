package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {
    final Function<? super TLeft, ? extends InterfaceC8988b> leftEnd;
    final InterfaceC8988b other;
    final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> resultSelector;
    final Function<? super TRight, ? extends InterfaceC8988b> rightEnd;

    public static final class GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements InterfaceC8990d, JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final InterfaceC8989c downstream;
        final Function<? super TLeft, ? extends InterfaceC8988b> leftEnd;
        int leftIndex;
        final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> resultSelector;
        final Function<? super TRight, ? extends InterfaceC8988b> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable disposables = new CompositeDisposable();
        final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        final Map<Integer, UnicastProcessor<TRight>> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        public GroupJoinSubscription(InterfaceC8989c interfaceC8989c, Function<? super TLeft, ? extends InterfaceC8988b> function, Function<? super TRight, ? extends InterfaceC8988b> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
            this.downstream = interfaceC8989c;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
        }

        @Override // p215q9.InterfaceC8990d
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
            InterfaceC8989c interfaceC8989c = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    spscLinkedArrayQueue.clear();
                    cancelAll();
                    errorAll(interfaceC8989c);
                    return;
                }
                boolean z9 = this.active.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z10 = num == null;
                if (z9 && z10) {
                    Iterator<UnicastProcessor<TRight>> it = this.lefts.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    interfaceC8989c.onComplete();
                    return;
                }
                if (z10) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == LEFT_VALUE) {
                        UnicastProcessor unicastProcessorCreate = UnicastProcessor.create();
                        int i10 = this.leftIndex;
                        this.leftIndex = i10 + 1;
                        this.lefts.put(Integer.valueOf(i10), unicastProcessorCreate);
                        try {
                            InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.leftEnd.apply(objPoll), "The leftEnd returned a null Publisher");
                            LeftRightEndSubscriber leftRightEndSubscriber = new LeftRightEndSubscriber(this, true, i10);
                            this.disposables.add(leftRightEndSubscriber);
                            interfaceC8988b.subscribe(leftRightEndSubscriber);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(interfaceC8989c);
                                return;
                            }
                            try {
                                Object objRequireNonNull = ObjectHelper.requireNonNull(this.resultSelector.apply(objPoll, unicastProcessorCreate), "The resultSelector returned a null value");
                                if (this.requested.get() == 0) {
                                    fail(new MissingBackpressureException("Could not emit value due to lack of requests"), interfaceC8989c, spscLinkedArrayQueue);
                                    return;
                                }
                                interfaceC8989c.onNext(objRequireNonNull);
                                BackpressureHelper.produced(this.requested, 1L);
                                Iterator<TRight> it2 = this.rights.values().iterator();
                                while (it2.hasNext()) {
                                    unicastProcessorCreate.onNext(it2.next());
                                }
                            } catch (Throwable th) {
                                fail(th, interfaceC8989c, spscLinkedArrayQueue);
                                return;
                            }
                        } catch (Throwable th2) {
                            fail(th2, interfaceC8989c, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i11 = this.rightIndex;
                        this.rightIndex = i11 + 1;
                        this.rights.put(Integer.valueOf(i11), objPoll);
                        try {
                            InterfaceC8988b interfaceC8988b2 = (InterfaceC8988b) ObjectHelper.requireNonNull(this.rightEnd.apply(objPoll), "The rightEnd returned a null Publisher");
                            LeftRightEndSubscriber leftRightEndSubscriber2 = new LeftRightEndSubscriber(this, false, i11);
                            this.disposables.add(leftRightEndSubscriber2);
                            interfaceC8988b2.subscribe(leftRightEndSubscriber2);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(interfaceC8989c);
                                return;
                            } else {
                                Iterator<UnicastProcessor<TRight>> it3 = this.lefts.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th3) {
                            fail(th3, interfaceC8989c, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        LeftRightEndSubscriber leftRightEndSubscriber3 = (LeftRightEndSubscriber) objPoll;
                        UnicastProcessor<TRight> unicastProcessorRemove = this.lefts.remove(Integer.valueOf(leftRightEndSubscriber3.index));
                        this.disposables.remove(leftRightEndSubscriber3);
                        if (unicastProcessorRemove != null) {
                            unicastProcessorRemove.onComplete();
                        }
                    } else if (num == RIGHT_CLOSE) {
                        LeftRightEndSubscriber leftRightEndSubscriber4 = (LeftRightEndSubscriber) objPoll;
                        this.rights.remove(Integer.valueOf(leftRightEndSubscriber4.index));
                        this.disposables.remove(leftRightEndSubscriber4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void errorAll(InterfaceC8989c interfaceC8989c) {
            Throwable thTerminate = ExceptionHelper.terminate(this.error);
            Iterator<UnicastProcessor<TRight>> it = this.lefts.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thTerminate);
            }
            this.lefts.clear();
            this.rights.clear();
            interfaceC8989c.onError(thTerminate);
        }

        public void fail(Throwable th, InterfaceC8989c interfaceC8989c, SimpleQueue<?> simpleQueue) {
            Exceptions.throwIfFatal(th);
            ExceptionHelper.addThrowable(this.error, th);
            simpleQueue.clear();
            cancelAll();
            errorAll(interfaceC8989c);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerClose(boolean z9, LeftRightEndSubscriber leftRightEndSubscriber) {
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
        public void innerComplete(LeftRightSubscriber leftRightSubscriber) {
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

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
            }
        }
    }

    public interface JoinSupport {
        void innerClose(boolean z9, LeftRightEndSubscriber leftRightEndSubscriber);

        void innerCloseError(Throwable th);

        void innerComplete(LeftRightSubscriber leftRightSubscriber);

        void innerError(Throwable th);

        void innerValue(boolean z9, Object obj);
    }

    public static final class LeftRightEndSubscriber extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final JoinSupport parent;

        public LeftRightEndSubscriber(JoinSupport joinSupport, boolean z9, int i10) {
            this.parent = joinSupport;
            this.isLeft = z9;
            this.index = i10;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.parent.innerCloseError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this, interfaceC8990d, Long.MAX_VALUE);
        }
    }

    public static final class LeftRightSubscriber extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final JoinSupport parent;

        public LeftRightSubscriber(JoinSupport joinSupport, boolean z9) {
            this.parent = joinSupport;
            this.isLeft = z9;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this, interfaceC8990d, Long.MAX_VALUE);
        }
    }

    public FlowableGroupJoin(Flowable<TLeft> flowable, InterfaceC8988b interfaceC8988b, Function<? super TLeft, ? extends InterfaceC8988b> function, Function<? super TRight, ? extends InterfaceC8988b> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
        super(flowable);
        this.other = interfaceC8988b;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        GroupJoinSubscription groupJoinSubscription = new GroupJoinSubscription(interfaceC8989c, this.leftEnd, this.rightEnd, this.resultSelector);
        interfaceC8989c.onSubscribe(groupJoinSubscription);
        LeftRightSubscriber leftRightSubscriber = new LeftRightSubscriber(groupJoinSubscription, true);
        groupJoinSubscription.disposables.add(leftRightSubscriber);
        LeftRightSubscriber leftRightSubscriber2 = new LeftRightSubscriber(groupJoinSubscription, false);
        groupJoinSubscription.disposables.add(leftRightSubscriber2);
        this.source.subscribe((FlowableSubscriber) leftRightSubscriber);
        this.other.subscribe(leftRightSubscriber2);
    }
}
