package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    final InterfaceC7916b[] sources;

    public ParallelFromArray(InterfaceC7916b[] interfaceC7916bArr) {
        this.sources = interfaceC7916bArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC7917c[] interfaceC7917cArr) {
        if (validate(interfaceC7917cArr)) {
            int length = interfaceC7917cArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                this.sources[i6].subscribe(interfaceC7917cArr[i6]);
            }
        }
    }
}
