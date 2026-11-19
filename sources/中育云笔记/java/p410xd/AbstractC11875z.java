package p410xd;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import sd.InterfaceC11173w1;

/* renamed from: xd.z */
/* loaded from: classes6.dex */
public abstract class AbstractC11875z extends AbstractC11838c implements InterfaceC11173w1 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28134f = AtomicIntegerFieldUpdater.newUpdater(AbstractC11875z.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: e */
    public final long f28135e;

    public AbstractC11875z(long j10, AbstractC11875z abstractC11875z, int i10) {
        super(abstractC11875z);
        this.f28135e = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // p410xd.AbstractC11838c
    /* renamed from: k */
    public boolean mo26242k() {
        return f28134f.get(this) == mo2760r() && !m26243l();
    }

    /* renamed from: p */
    public final boolean m26356p() {
        return f28134f.addAndGet(this, SupportMenu.CATEGORY_MASK) == mo2760r() && !m26243l();
    }

    /* renamed from: r */
    public abstract int mo2760r();

    /* renamed from: s */
    public abstract void mo2761s(int i10, Throwable th, InterfaceC9945d interfaceC9945d);

    /* renamed from: t */
    public final void m26357t() {
        if (f28134f.incrementAndGet(this) == mo2760r()) {
            m26245n();
        }
    }

    /* renamed from: u */
    public final boolean m26358u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f28134f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == mo2760r() && !m26243l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
