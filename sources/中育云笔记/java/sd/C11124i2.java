package sd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobKt__JobKt;

/* renamed from: sd.i2 */
/* loaded from: classes6.dex */
public final class C11124i2 extends AbstractC11151p1 {

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26789i = AtomicIntegerFieldUpdater.newUpdater(C11124i2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: g */
    public final Thread f26790g = Thread.currentThread();

    /* renamed from: h */
    public InterfaceC11163t0 f26791h;

    /* renamed from: A */
    public final void m24734A(InterfaceC10045g interfaceC10045g) {
        int i10;
        this.f26791h = JobKt__JobKt.m20396m(interfaceC10045g, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26789i;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                m24736z(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f26789i.compareAndSet(this, i10, 0));
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: u */
    public boolean mo20468u() {
        return true;
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: v */
    public void mo20469v(Throwable th) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26789i;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                m24736z(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f26789i.compareAndSet(this, i10, 2));
        this.f26790g.interrupt();
        f26789i.set(this, 3);
    }

    /* renamed from: x */
    public final void m24735x() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26789i;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m24736z(i10);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f26789i.compareAndSet(this, i10, 1)) {
                InterfaceC11163t0 interfaceC11163t0 = this.f26791h;
                if (interfaceC11163t0 != null) {
                    interfaceC11163t0.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: z */
    public final Void m24736z(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }
}
