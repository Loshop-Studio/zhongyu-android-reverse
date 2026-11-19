package p054e7;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.InterfaceC5969i1;
import p075h6.InterfaceC5636h;

/* renamed from: e7.p */
/* loaded from: classes4.dex */
public abstract class AbstractC5484p extends AbstractC5470b implements InterfaceC5969i1 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8477d = AtomicIntegerFieldUpdater.newUpdater(AbstractC5484p.class, "cleanedAndPointers$volatile");

    /* renamed from: c */
    public final long f8478c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC5484p(long j7, AbstractC5484p abstractC5484p, int i) {
        super(abstractC5484p);
        this.f8478c = j7;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p054e7.AbstractC5470b
    /* renamed from: c */
    public final boolean mo4841c() {
        return f8477d.get(this) == mo4863f() && m4840b() != null;
    }

    /* renamed from: e */
    public final boolean m4862e() {
        return f8477d.addAndGet(this, SupportMenu.CATEGORY_MASK) == mo4863f() && m4840b() != null;
    }

    /* renamed from: f */
    public abstract int mo4863f();

    /* renamed from: g */
    public abstract void mo4864g(int i, InterfaceC5636h interfaceC5636h);

    /* renamed from: h */
    public final void m4865h() {
        if (f8477d.incrementAndGet(this) == mo4863f()) {
            m4842d();
        }
    }

    /* renamed from: i */
    public final boolean m4866i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f8477d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo4863f() && m4840b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
