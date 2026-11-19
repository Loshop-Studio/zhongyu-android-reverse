package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    final InterfaceC8988b[] sources;

    public ParallelFromArray(InterfaceC8988b[] interfaceC8988bArr) {
        this.sources = interfaceC8988bArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC8989c[] interfaceC8989cArr) {
        if (validate(interfaceC8989cArr)) {
            int length = interfaceC8989cArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.sources[i10].subscribe(interfaceC8989cArr[i10]);
            }
        }
    }
}
