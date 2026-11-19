package p440zd;

import java.util.concurrent.Executor;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import sd.AbstractC11107e1;

/* renamed from: zd.e */
/* loaded from: classes6.dex */
public abstract class AbstractC12044e extends AbstractC11107e1 {

    /* renamed from: d */
    public final int f28417d;

    /* renamed from: e */
    public final int f28418e;

    /* renamed from: f */
    public final long f28419f;

    /* renamed from: g */
    public final String f28420g;

    /* renamed from: h */
    public CoroutineScheduler f28421h = m26670j();

    public AbstractC12044e(int i10, int i11, long j10, String str) {
        this.f28417d = i10;
        this.f28418e = i11;
        this.f28419f = j10;
        this.f28420g = str;
    }

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        CoroutineScheduler.m20924l(this.f28421h, runnable, false, false, 6, null);
    }

    @Override // sd.AbstractC11106e0
    public void dispatchYield(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        CoroutineScheduler.m20924l(this.f28421h, runnable, false, true, 2, null);
    }

    @Override // sd.AbstractC11107e1
    /* renamed from: i */
    public Executor mo24697i() {
        return this.f28421h;
    }

    /* renamed from: j */
    public final CoroutineScheduler m26670j() {
        return new CoroutineScheduler(this.f28417d, this.f28418e, this.f28419f, this.f28420g);
    }

    /* renamed from: k */
    public final void m26671k(Runnable runnable, boolean z10, boolean z11) {
        this.f28421h.m20934k(runnable, z10, z11);
    }
}
