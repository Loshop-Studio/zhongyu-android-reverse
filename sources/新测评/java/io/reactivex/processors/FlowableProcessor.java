package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import p215q9.InterfaceC8987a;

/* loaded from: classes5.dex */
public abstract class FlowableProcessor<T> extends Flowable<T> implements InterfaceC8987a, FlowableSubscriber<T> {
    @Nullable
    public abstract Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasSubscribers();

    public abstract boolean hasThrowable();

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @CheckReturnValue
    @NonNull
    public final FlowableProcessor<T> toSerialized() {
        return this instanceof SerializedProcessor ? this : new SerializedProcessor(this);
    }
}
