package p191n8;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC9100d;
import p135i8.InterfaceC8850k1;

/* renamed from: n8.a0 */
/* loaded from: classes5.dex */
public abstract class AbstractC9436a0 extends AbstractC9443e implements InterfaceC8850k1 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18640d = AtomicIntegerFieldUpdater.newUpdater(AbstractC9436a0.class, "cleanedAndPointers$volatile");

    /* renamed from: c */
    public final long f18641c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC9436a0(long j10, AbstractC9436a0 abstractC9436a0, int i10) {
        super(abstractC9436a0);
        this.f18641c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // p191n8.AbstractC9443e
    /* renamed from: k */
    public boolean mo17293k() {
        return f18640d.get(this) == mo15889r() && !m17317l();
    }

    /* renamed from: p */
    public final boolean m17294p() {
        return f18640d.addAndGet(this, SupportMenu.CATEGORY_MASK) == mo15889r() && !m17317l();
    }

    /* renamed from: r */
    public abstract int mo15889r();

    /* renamed from: s */
    public abstract void mo15890s(int i10, Throwable th, InterfaceC9100d interfaceC9100d);

    /* renamed from: t */
    public final void m17295t() {
        if (f18640d.incrementAndGet(this) == mo15889r()) {
            m17319n();
        }
    }

    /* renamed from: u */
    public final boolean m17296u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18640d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == mo15889r() && !m17317l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
