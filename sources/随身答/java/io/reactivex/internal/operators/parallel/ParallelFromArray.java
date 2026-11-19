package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    final InterfaceC0049b[] sources;

    public ParallelFromArray(InterfaceC0049b[] interfaceC0049bArr) {
        this.sources = interfaceC0049bArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC0050c[] interfaceC0050cArr) {
        if (validate(interfaceC0050cArr)) {
            int length = interfaceC0050cArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                this.sources[i9].subscribe(interfaceC0050cArr[i9]);
            }
        }
    }
}
