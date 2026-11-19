package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    final boolean delayError;
    final Function<? super T, ? extends InterfaceC7916b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC7916b> function, boolean z6, int i6, int i7) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z6;
        this.maxConcurrency = i6;
        this.prefetch = i7;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC7917c[] interfaceC7917cArr) {
        if (validate(interfaceC7917cArr)) {
            int length = interfaceC7917cArr.length;
            InterfaceC7917c[] interfaceC7917cArr2 = new InterfaceC7917c[length];
            for (int i6 = 0; i6 < length; i6++) {
                interfaceC7917cArr2[i6] = FlowableFlatMap.subscribe(interfaceC7917cArr[i6], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
            }
            this.source.subscribe(interfaceC7917cArr2);
        }
    }
}
