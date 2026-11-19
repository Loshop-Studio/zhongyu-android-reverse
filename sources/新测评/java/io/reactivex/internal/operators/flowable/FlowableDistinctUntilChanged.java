package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableDistinctUntilChanged<T, K> extends AbstractFlowableWithUpstream<T, T> {
    final BiPredicate<? super K, ? super K> comparer;
    final Function<? super T, K> keySelector;

    public static final class DistinctUntilChangedConditionalSubscriber<T, K> extends BasicFuseableConditionalSubscriber<T, T> {
        final BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final Function<? super T, K> keySelector;
        K last;

        public DistinctUntilChangedConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.keySelector = function;
            this.comparer = biPredicate;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f13368qs.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.keySelector.apply(tPoll);
                if (!this.hasValue) {
                    this.hasValue = true;
                    this.last = kApply;
                    return tPoll;
                }
                if (!this.comparer.test(this.last, kApply)) {
                    this.last = kApply;
                    return tPoll;
                }
                this.last = kApply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            return transitiveBoundaryFusion(i10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                return this.downstream.tryOnNext(t10);
            }
            try {
                K kApply = this.keySelector.apply(t10);
                if (this.hasValue) {
                    boolean zTest = this.comparer.test(this.last, kApply);
                    this.last = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.hasValue = true;
                    this.last = kApply;
                }
                this.downstream.onNext(t10);
                return true;
            } catch (Throwable th) {
                fail(th);
                return true;
            }
        }
    }

    public static final class DistinctUntilChangedSubscriber<T, K> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        final BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final Function<? super T, K> keySelector;
        K last;

        public DistinctUntilChangedSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(interfaceC8989c);
            this.keySelector = function;
            this.comparer = biPredicate;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.f13369qs.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.keySelector.apply(tPoll);
                if (!this.hasValue) {
                    this.hasValue = true;
                    this.last = kApply;
                    return tPoll;
                }
                if (!this.comparer.test(this.last, kApply)) {
                    this.last = kApply;
                    return tPoll;
                }
                this.last = kApply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            return transitiveBoundaryFusion(i10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(t10);
                return true;
            }
            try {
                K kApply = this.keySelector.apply(t10);
                if (this.hasValue) {
                    boolean zTest = this.comparer.test(this.last, kApply);
                    this.last = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.hasValue = true;
                    this.last = kApply;
                }
                this.downstream.onNext(t10);
                return true;
            } catch (Throwable th) {
                fail(th);
                return true;
            }
        }
    }

    public FlowableDistinctUntilChanged(Flowable<T> flowable, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(flowable);
        this.keySelector = function;
        this.comparer = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        if (interfaceC8989c instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new DistinctUntilChangedConditionalSubscriber((ConditionalSubscriber) interfaceC8989c, this.keySelector, this.comparer));
        } else {
            this.source.subscribe((FlowableSubscriber) new DistinctUntilChangedSubscriber(interfaceC8989c, this.keySelector, this.comparer));
        }
    }
}
