package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC0049b> mapper;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC0049b> function, int i9, ErrorMode errorMode) {
        this.source = parallelFlowable;
        this.mapper = (Function) ObjectHelper.requireNonNull(function, "mapper");
        this.prefetch = i9;
        this.errorMode = (ErrorMode) ObjectHelper.requireNonNull(errorMode, "errorMode");
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
                interfaceC0050cArr2[i9] = FlowableConcatMap.subscribe(interfaceC0050cArr[i9], this.mapper, this.prefetch, this.errorMode);
            }
            this.source.subscribe(interfaceC0050cArr2);
        }
    }
}
