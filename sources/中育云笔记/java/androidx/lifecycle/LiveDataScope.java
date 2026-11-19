package androidx.lifecycle;

import p309qc.C10786q;
import sd.InterfaceC11163t0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public interface LiveDataScope<T> {
    Object emit(T t10, InterfaceC11588c<? super C10786q> interfaceC11588c);

    Object emitSource(LiveData<T> liveData, InterfaceC11588c<? super InterfaceC11163t0> interfaceC11588c);

    T getLatestValue();
}
