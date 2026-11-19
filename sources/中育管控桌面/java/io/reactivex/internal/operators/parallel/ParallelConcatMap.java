package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC7916b> mapper;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC7916b> function, int i6, ErrorMode errorMode) {
        this.source = parallelFlowable;
        this.mapper = (Function) ObjectHelper.requireNonNull(function, "mapper");
        this.prefetch = i6;
        this.errorMode = (ErrorMode) ObjectHelper.requireNonNull(errorMode, "errorMode");
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
                interfaceC7917cArr2[i6] = FlowableConcatMap.subscribe(interfaceC7917cArr[i6], this.mapper, this.prefetch, this.errorMode);
            }
            this.source.subscribe(interfaceC7917cArr2);
        }
    }
}
