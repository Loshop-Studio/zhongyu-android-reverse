package p145q5;

import p159s5.InterfaceC6559b;
import p168t5.InterfaceC6598b;

/* renamed from: q5.f */
/* loaded from: classes3.dex */
public interface InterfaceC6435f {
    boolean isDisposed();

    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);

    void setCancellable(InterfaceC6598b interfaceC6598b);

    void setDisposable(InterfaceC6559b interfaceC6559b);
}
