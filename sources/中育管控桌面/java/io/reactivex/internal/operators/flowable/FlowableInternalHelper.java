package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableInternalHelper {

    public static final class BufferedReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;

        public BufferedReplayCallable(Flowable<T> flowable, int i6) {
            this.parent = flowable;
            this.bufferSize = i6;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize);
        }
    }

    public static final class BufferedTimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        public BufferedTimedReplay(Flowable<T> flowable, int i6, long j6, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.bufferSize = i6;
            this.time = j6;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler);
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, InterfaceC7916b> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        public FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.mapper = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ InterfaceC7916b apply(Object obj) {
            return apply((FlatMapIntoIterable<T, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC7916b apply(T t6) {
            return new FlowableFromIterable((Iterable) ObjectHelper.requireNonNull(this.mapper.apply(t6), "The mapper returned a null Iterable"));
        }
    }

    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;

        /* renamed from: t */
        private final T f8435t;

        public FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> biFunction, T t6) {
            this.combiner = biFunction;
            this.f8435t = t6;
        }

        @Override // io.reactivex.functions.Function
        public R apply(U u6) {
            return this.combiner.apply(this.f8435t, u6);
        }
    }

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, InterfaceC7916b> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends InterfaceC7916b> mapper;

        public FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends InterfaceC7916b> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ InterfaceC7916b apply(Object obj) {
            return apply((FlatMapWithCombinerOuter<T, R, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC7916b apply(T t6) {
            return new FlowableMapPublisher((InterfaceC7916b) ObjectHelper.requireNonNull(this.mapper.apply(t6), "The mapper returned a null Publisher"), new FlatMapWithCombinerInner(this.combiner, t6));
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, InterfaceC7916b> {
        final Function<? super T, ? extends InterfaceC7916b> itemDelay;

        public ItemDelayFunction(Function<? super T, ? extends InterfaceC7916b> function) {
            this.itemDelay = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ InterfaceC7916b apply(Object obj) {
            return apply((ItemDelayFunction<T, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC7916b apply(T t6) {
            return new FlowableTakePublisher((InterfaceC7916b) ObjectHelper.requireNonNull(this.itemDelay.apply(t6), "The itemDelay returned a null Publisher"), 1L).map(Functions.justFunction(t6)).defaultIfEmpty(t6);
        }
    }

    public static final class ReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;

        public ReplayCallable(Flowable<T> flowable) {
            this.parent = flowable;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay();
        }
    }

    public static final class ReplayFunction<T, R> implements Function<Flowable<T>, InterfaceC7916b> {
        private final Scheduler scheduler;
        private final Function<? super Flowable<T>, ? extends InterfaceC7916b> selector;

        public ReplayFunction(Function<? super Flowable<T>, ? extends InterfaceC7916b> function, Scheduler scheduler) {
            this.selector = function;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC7916b apply(Flowable<T> flowable) {
            return Flowable.fromPublisher((InterfaceC7916b) ObjectHelper.requireNonNull(this.selector.apply(flowable), "The selector returned a null Publisher")).observeOn(this.scheduler);
        }
    }

    public enum RequestMax implements Consumer<InterfaceC7918d> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(InterfaceC7918d interfaceC7918d) {
            interfaceC7918d.request(Long.MAX_VALUE);
        }
    }

    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final BiConsumer<S, Emitter<T>> consumer;

        public SimpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
            this.consumer = biConsumer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return apply((SimpleBiGenerator<T, S>) obj, (Emitter) obj2);
        }

        public S apply(S s6, Emitter<T> emitter) {
            this.consumer.accept(s6, emitter);
            return s6;
        }
    }

    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final Consumer<Emitter<T>> consumer;

        public SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return apply((SimpleGenerator<T, S>) obj, (Emitter) obj2);
        }

        public S apply(S s6, Emitter<T> emitter) {
            this.consumer.accept(emitter);
            return s6;
        }
    }

    public static final class SubscriberOnComplete<T> implements Action {
        final InterfaceC7917c subscriber;

        public SubscriberOnComplete(InterfaceC7917c interfaceC7917c) {
            this.subscriber = interfaceC7917c;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.subscriber.onComplete();
        }
    }

    public static final class SubscriberOnError<T> implements Consumer<Throwable> {
        final InterfaceC7917c subscriber;

        public SubscriberOnError(InterfaceC7917c interfaceC7917c) {
            this.subscriber = interfaceC7917c;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            this.subscriber.onError(th);
        }
    }

    public static final class SubscriberOnNext<T> implements Consumer<T> {
        final InterfaceC7917c subscriber;

        public SubscriberOnNext(InterfaceC7917c interfaceC7917c) {
            this.subscriber = interfaceC7917c;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t6) {
            this.subscriber.onNext(t6);
        }
    }

    public static final class TimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        public TimedReplay(Flowable<T> flowable, long j6, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.time = j6;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.time, this.unit, this.scheduler);
        }
    }

    public static final class ZipIterableFunction<T, R> implements Function<List<InterfaceC7916b>, InterfaceC7916b> {
        private final Function<? super Object[], ? extends R> zipper;

        public ZipIterableFunction(Function<? super Object[], ? extends R> function) {
            this.zipper = function;
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC7916b apply(List<InterfaceC7916b> list) {
            return Flowable.zipIterable(list, this.zipper, false, Flowable.bufferSize());
        }
    }

    private FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, InterfaceC7916b> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new FlatMapIntoIterable(function);
    }

    public static <T, U, R> Function<T, InterfaceC7916b> flatMapWithCombiner(Function<? super T, ? extends InterfaceC7916b> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }

    public static <T, U> Function<T, InterfaceC7916b> itemDelay(Function<? super T, ? extends InterfaceC7916b> function) {
        return new ItemDelayFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable) {
        return new ReplayCallable(flowable);
    }

    public static <T, R> Function<Flowable<T>, InterfaceC7916b> replayFunction(Function<? super Flowable<T>, ? extends InterfaceC7916b> function, Scheduler scheduler) {
        return new ReplayFunction(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    public static <T> Action subscriberOnComplete(InterfaceC7917c interfaceC7917c) {
        return new SubscriberOnComplete(interfaceC7917c);
    }

    public static <T> Consumer<Throwable> subscriberOnError(InterfaceC7917c interfaceC7917c) {
        return new SubscriberOnError(interfaceC7917c);
    }

    public static <T> Consumer<T> subscriberOnNext(InterfaceC7917c interfaceC7917c) {
        return new SubscriberOnNext(interfaceC7917c);
    }

    public static <T, R> Function<List<InterfaceC7916b>, InterfaceC7916b> zipIterable(Function<? super Object[], ? extends R> function) {
        return new ZipIterableFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i6) {
        return new BufferedReplayCallable(flowable, i6);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i6, long j6, TimeUnit timeUnit, Scheduler scheduler) {
        return new BufferedTimedReplay(flowable, i6, j6, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, long j6, TimeUnit timeUnit, Scheduler scheduler) {
        return new TimedReplay(flowable, j6, timeUnit, scheduler);
    }
}
