package p135i8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.InterfaceC9211m;

/* renamed from: i8.x0 */
/* loaded from: classes5.dex */
public final class C8888x0 extends AbstractC8894z0 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16550f = AtomicIntegerFieldUpdater.newUpdater(C8888x0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e */
    public final InterfaceC9211m f16551e;

    public C8888x0(InterfaceC9211m interfaceC9211m) {
        this.f16551e = interfaceC9211m;
    }

    @Override // kotlinx.coroutines.InterfaceC9211m
    /* renamed from: a */
    public void mo14884a(Throwable th) {
        if (f16550f.compareAndSet(this, 0, 1)) {
            this.f16551e.mo14884a(th);
        }
    }
}
