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
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableInternalHelper {

    public static final class BufferedReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;

        public BufferedReplayCallable(Flowable<T> flowable, int i10) {
            this.parent = flowable;
            this.bufferSize = i10;
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

        public BufferedTimedReplay(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.bufferSize = i10;
            this.time = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler);
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, InterfaceC8988b> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        public FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.mapper = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ InterfaceC8988b apply(Object obj) throws Exception {
            return apply((FlatMapIntoIterable<T, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC8988b apply(T t10) throws Exception {
            return new FlowableFromIterable((Iterable) ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null Iterable"));
        }
    }

    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;

        /* renamed from: t */
        private final T f13313t;

        public FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> biFunction, T t10) {
            this.combiner = biFunction;
            this.f13313t = t10;
        }

        @Override // io.reactivex.functions.Function
        public R apply(U u10) throws Exception {
            return this.combiner.apply(this.f13313t, u10);
        }
    }

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, InterfaceC8988b> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends InterfaceC8988b> mapper;

        public FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends InterfaceC8988b> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ InterfaceC8988b apply(Object obj) throws Exception {
            return apply((FlatMapWithCombinerOuter<T, R, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC8988b apply(T t10) throws Exception {
            return new FlowableMapPublisher((InterfaceC8988b) ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null Publisher"), new FlatMapWithCombinerInner(this.combiner, t10));
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, InterfaceC8988b> {
        final Function<? super T, ? extends InterfaceC8988b> itemDelay;

        public ItemDelayFunction(Function<? super T, ? extends InterfaceC8988b> function) {
            this.itemDelay = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ InterfaceC8988b apply(Object obj) throws Exception {
            return apply((ItemDelayFunction<T, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC8988b apply(T t10) throws Exception {
            return new FlowableTakePublisher((InterfaceC8988b) ObjectHelper.requireNonNull(this.itemDelay.apply(t10), "The itemDelay returned a null Publisher"), 1L).map(Functions.justFunction(t10)).defaultIfEmpty(t10);
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

    public static final class ReplayFunction<T, R> implements Function<Flowable<T>, InterfaceC8988b> {
        private final Scheduler scheduler;
        private final Function<? super Flowable<T>, ? extends InterfaceC8988b> selector;

        public ReplayFunction(Function<? super Flowable<T>, ? extends InterfaceC8988b> function, Scheduler scheduler) {
            this.selector = function;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC8988b apply(Flowable<T> flowable) throws Exception {
            return Flowable.fromPublisher((InterfaceC8988b) ObjectHelper.requireNonNull(this.selector.apply(flowable), "The selector returned a null Publisher")).observeOn(this.scheduler);
        }
    }

    public enum RequestMax implements Consumer<InterfaceC8990d> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(InterfaceC8990d interfaceC8990d) throws Exception {
            interfaceC8990d.request(Long.MAX_VALUE);
        }
    }

    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final BiConsumer<S, Emitter<T>> consumer;

        public SimpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
            this.consumer = biConsumer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) throws Exception {
            return apply((SimpleBiGenerator<T, S>) obj, (Emitter) obj2);
        }

        public S apply(S s10, Emitter<T> emitter) throws Exception {
            this.consumer.accept(s10, emitter);
            return s10;
        }
    }

    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final Consumer<Emitter<T>> consumer;

        public SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) throws Exception {
            return apply((SimpleGenerator<T, S>) obj, (Emitter) obj2);
        }

        public S apply(S s10, Emitter<T> emitter) throws Exception {
            this.consumer.accept(emitter);
            return s10;
        }
    }

    public static final class SubscriberOnComplete<T> implements Action {
        final InterfaceC8989c subscriber;

        public SubscriberOnComplete(InterfaceC8989c interfaceC8989c) {
            this.subscriber = interfaceC8989c;
        }

        @Override // io.reactivex.functions.Action
        public void run() throws Exception {
            this.subscriber.onComplete();
        }
    }

    public static final class SubscriberOnError<T> implements Consumer<Throwable> {
        final InterfaceC8989c subscriber;

        public SubscriberOnError(InterfaceC8989c interfaceC8989c) {
            this.subscriber = interfaceC8989c;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) throws Exception {
            this.subscriber.onError(th);
        }
    }

    public static final class SubscriberOnNext<T> implements Consumer<T> {
        final InterfaceC8989c subscriber;

        public SubscriberOnNext(InterfaceC8989c interfaceC8989c) {
            this.subscriber = interfaceC8989c;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t10) throws Exception {
            this.subscriber.onNext(t10);
        }
    }

    public static final class TimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        public TimedReplay(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.time = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.time, this.unit, this.scheduler);
        }
    }

    public static final class ZipIterableFunction<T, R> implements Function<List<InterfaceC8988b>, InterfaceC8988b> {
        private final Function<? super Object[], ? extends R> zipper;

        public ZipIterableFunction(Function<? super Object[], ? extends R> function) {
            this.zipper = function;
        }

        @Override // io.reactivex.functions.Function
        public InterfaceC8988b apply(List<InterfaceC8988b> list) {
            return Flowable.zipIterable(list, this.zipper, false, Flowable.bufferSize());
        }
    }

    private FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, InterfaceC8988b> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new FlatMapIntoIterable(function);
    }

    public static <T, U, R> Function<T, InterfaceC8988b> flatMapWithCombiner(Function<? super T, ? extends InterfaceC8988b> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }

    public static <T, U> Function<T, InterfaceC8988b> itemDelay(Function<? super T, ? extends InterfaceC8988b> function) {
        return new ItemDelayFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable) {
        return new ReplayCallable(flowable);
    }

    public static <T, R> Function<Flowable<T>, InterfaceC8988b> replayFunction(Function<? super Flowable<T>, ? extends InterfaceC8988b> function, Scheduler scheduler) {
        return new ReplayFunction(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    public static <T> Action subscriberOnComplete(InterfaceC8989c interfaceC8989c) {
        return new SubscriberOnComplete(interfaceC8989c);
    }

    public static <T> Consumer<Throwable> subscriberOnError(InterfaceC8989c interfaceC8989c) {
        return new SubscriberOnError(interfaceC8989c);
    }

    public static <T> Consumer<T> subscriberOnNext(InterfaceC8989c interfaceC8989c) {
        return new SubscriberOnNext(interfaceC8989c);
    }

    public static <T, R> Function<List<InterfaceC8988b>, InterfaceC8988b> zipIterable(Function<? super Object[], ? extends R> function) {
        return new ZipIterableFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i10) {
        return new BufferedReplayCallable(flowable, i10);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new BufferedTimedReplay(flowable, i10, j10, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new TimedReplay(flowable, j10, timeUnit, scheduler);
    }
}
