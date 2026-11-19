package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC8988b> mapper;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC8988b> function, int i10, ErrorMode errorMode) {
        this.source = parallelFlowable;
        this.mapper = (Function) ObjectHelper.requireNonNull(function, "mapper");
        this.prefetch = i10;
        this.errorMode = (ErrorMode) ObjectHelper.requireNonNull(errorMode, "errorMode");
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
                interfaceC8989cArr2[i10] = FlowableConcatMap.subscribe(interfaceC8989cArr[i10], this.mapper, this.prefetch, this.errorMode);
            }
            this.source.subscribe(interfaceC8989cArr2);
        }
    }
}
