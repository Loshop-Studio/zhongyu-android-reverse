package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p152r6.InterfaceC6471c;

/* renamed from: kotlinx.coroutines.u0 */
/* loaded from: classes4.dex */
public final class C6007u0 extends AbstractC6017y0 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9511f = AtomicIntegerFieldUpdater.newUpdater(C6007u0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e */
    public final InterfaceC6471c f9512e;

    public C6007u0(InterfaceC6471c interfaceC6471c) {
        this.f9512e = interfaceC6471c;
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: i */
    public final boolean mo5426i() {
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: j */
    public final void mo5427j(Throwable th) {
        if (f9511f.compareAndSet(this, 0, 1)) {
            this.f9512e.invoke(th);
        }
    }
}
