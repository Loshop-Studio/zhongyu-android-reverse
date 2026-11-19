package p135i8;

import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;

/* renamed from: i8.o1 */
/* loaded from: classes5.dex */
public final class RunnableC8862o1 implements Runnable {

    /* renamed from: a */
    public final CoroutineDispatcher f16530a;

    /* renamed from: b */
    public final InterfaceC8845j f16531b;

    public RunnableC8862o1(CoroutineDispatcher coroutineDispatcher, InterfaceC8845j interfaceC8845j) {
        this.f16530a = coroutineDispatcher;
        this.f16531b = interfaceC8845j;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f16531b.mo14872q(this.f16530a, C8736p.f16368a);
    }
}
