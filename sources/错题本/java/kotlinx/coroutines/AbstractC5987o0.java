package kotlinx.coroutines;

import kotlin.collections.C5801p;
import p054e7.AbstractC5469a;
import p054e7.C5480l;

/* renamed from: kotlinx.coroutines.o0 */
/* loaded from: classes4.dex */
public abstract class AbstractC5987o0 extends AbstractC5995r {

    /* renamed from: d */
    public static final /* synthetic */ int f9480d = 0;

    /* renamed from: a */
    public long f9481a;

    /* renamed from: b */
    public boolean f9482b;

    /* renamed from: c */
    public C5801p f9483c;

    /* renamed from: d */
    public final void m5603d(boolean z8) {
        long j7 = this.f9481a - (z8 ? 4294967296L : 1L);
        this.f9481a = j7;
        if (j7 <= 0 && this.f9482b) {
            shutdown();
        }
    }

    /* renamed from: k */
    public final void m5604k(AbstractC5893e0 abstractC5893e0) {
        C5801p c5801p = this.f9483c;
        if (c5801p == null) {
            c5801p = new C5801p();
            this.f9483c = c5801p;
        }
        c5801p.addLast(abstractC5893e0);
    }

    /* renamed from: l */
    public abstract Thread mo5514l();

    @Override // kotlinx.coroutines.AbstractC5995r
    public final AbstractC5995r limitedParallelism(int i, String str) {
        AbstractC5469a.m4825a(i);
        return str != null ? new C5480l(this, str) : this;
    }

    /* renamed from: m */
    public final void m5605m(boolean z8) {
        this.f9481a = (z8 ? 4294967296L : 1L) + this.f9481a;
        if (z8) {
            return;
        }
        this.f9482b = true;
    }

    /* renamed from: n */
    public abstract long mo5596n();

    /* renamed from: o */
    public final boolean m5606o() {
        C5801p c5801p = this.f9483c;
        if (c5801p == null) {
            return false;
        }
        AbstractC5893e0 abstractC5893e0 = (AbstractC5893e0) (c5801p.isEmpty() ? null : c5801p.removeFirst());
        if (abstractC5893e0 == null) {
            return false;
        }
        abstractC5893e0.run();
        return true;
    }

    /* renamed from: q */
    public void mo5607q(long j7, AbstractRunnableC5978l0 abstractRunnableC5978l0) {
        RunnableC6016y.f9528h.m5601v(j7, abstractRunnableC5978l0);
    }

    public abstract void shutdown();
}
