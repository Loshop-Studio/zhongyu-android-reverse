package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    final boolean delayError;
    final Function<? super T, ? extends InterfaceC0049b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC0049b> function, boolean z9, int i9, int i10) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z9;
        this.maxConcurrency = i9;
        this.prefetch = i10;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC0050c[] interfaceC0050cArr) {
        if (validate(interfaceC0050cArr)) {
            int length = interfaceC0050cArr.length;
            InterfaceC0050c[] interfaceC0050cArr2 = new InterfaceC0050c[length];
            for (int i9 = 0; i9 < length; i9++) {
                interfaceC0050cArr2[i9] = FlowableFlatMap.subscribe(interfaceC0050cArr[i9], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
            }
            this.source.subscribe(interfaceC0050cArr2);
        }
    }
}
