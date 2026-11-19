package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.coroutines.p1 */
/* loaded from: classes4.dex */
public final class C5991p1 extends AbstractC6017y0 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9487g = AtomicIntegerFieldUpdater.newUpdater(C5991p1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e */
    public final Thread f9488e = Thread.currentThread();

    /* renamed from: f */
    public InterfaceC5962g0 f9489f;

    /* renamed from: l */
    public static void m5609l(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: i */
    public final boolean mo5426i() {
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: j */
    public final void mo5427j(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f9487g;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m5609l(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f9488e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: k */
    public final void m5610k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9487g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m5609l(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                InterfaceC5962g0 interfaceC5962g0 = this.f9489f;
                if (interfaceC5962g0 != null) {
                    interfaceC5962g0.dispose();
                    return;
                }
                return;
            }
        }
    }
}
