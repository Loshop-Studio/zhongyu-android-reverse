package androidx.lifecycle;

import p123h7.C8736p;
import p135i8.InterfaceC8849k0;
import p179m7.InterfaceC9324c;

/* loaded from: classes3.dex */
public interface LiveDataScope<T> {
    Object emit(T t10, InterfaceC9324c<? super C8736p> interfaceC9324c);

    Object emitSource(LiveData<T> liveData, InterfaceC9324c<? super InterfaceC8849k0> interfaceC9324c);

    T getLatestValue();
}
