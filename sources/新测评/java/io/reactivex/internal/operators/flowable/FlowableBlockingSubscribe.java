package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BlockingSubscriber;
import io.reactivex.internal.subscribers.BoundedSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.BlockingIgnoringReceiver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableBlockingSubscribe {
    private FlowableBlockingSubscribe() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void subscribe(InterfaceC8988b interfaceC8988b, InterfaceC8989c interfaceC8989c) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingSubscriber blockingSubscriber = new BlockingSubscriber(linkedBlockingQueue);
        interfaceC8988b.subscribe(blockingSubscriber);
        while (!blockingSubscriber.isCancelled()) {
            try {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (blockingSubscriber.isCancelled()) {
                        return;
                    }
                    BlockingHelper.verifyNonBlocking();
                    objPoll = linkedBlockingQueue.take();
                }
                if (blockingSubscriber.isCancelled() || objPoll == BlockingSubscriber.TERMINATED || NotificationLite.acceptFull(objPoll, interfaceC8989c)) {
                    return;
                }
            } catch (InterruptedException e10) {
                blockingSubscriber.cancel();
                interfaceC8989c.onError(e10);
                return;
            }
        }
    }

    public static <T> void subscribe(InterfaceC8988b interfaceC8988b) {
        BlockingIgnoringReceiver blockingIgnoringReceiver = new BlockingIgnoringReceiver();
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(Functions.emptyConsumer(), blockingIgnoringReceiver, blockingIgnoringReceiver, Functions.REQUEST_MAX);
        interfaceC8988b.subscribe(lambdaSubscriber);
        BlockingHelper.awaitForComplete(blockingIgnoringReceiver, lambdaSubscriber);
        Throwable th = blockingIgnoringReceiver.error;
        if (th != null) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    public static <T> void subscribe(InterfaceC8988b interfaceC8988b, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        subscribe(interfaceC8988b, new LambdaSubscriber(consumer, consumer2, action, Functions.REQUEST_MAX));
    }

    public static <T> void subscribe(InterfaceC8988b interfaceC8988b, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, int i10) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ObjectHelper.verifyPositive(i10, "number > 0 required");
        subscribe(interfaceC8988b, new BoundedSubscriber(consumer, consumer2, action, Functions.boundedConsumer(i10), i10));
    }
}
