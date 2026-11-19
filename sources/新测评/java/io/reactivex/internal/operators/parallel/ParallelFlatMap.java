package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    final boolean delayError;
    final Function<? super T, ? extends InterfaceC8988b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC8988b> function, boolean z9, int i10, int i11) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z9;
        this.maxConcurrency = i10;
        this.prefetch = i11;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC8989c[] interfaceC8989cArr) {
        if (validate(interfaceC8989cArr)) {
            int length = interfaceC8989cArr.length;
            InterfaceC8989c[] interfaceC8989cArr2 = new InterfaceC8989c[length];
            for (int i10 = 0; i10 < length; i10++) {
                interfaceC8989cArr2[i10] = FlowableFlatMap.subscribe(interfaceC8989cArr[i10], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
            }
            this.source.subscribe(interfaceC8989cArr2);
        }
    }
}
