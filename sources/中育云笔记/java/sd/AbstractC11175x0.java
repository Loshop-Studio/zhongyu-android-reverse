package sd;

import kotlinx.coroutines.AbstractC10008f;
import p325rc.C10958m;
import p410xd.AbstractC11856l;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: sd.x0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11175x0 extends AbstractC11106e0 {

    /* renamed from: c */
    public long f26838c;

    /* renamed from: d */
    public boolean f26839d;

    /* renamed from: e */
    public C10958m f26840e;

    /* renamed from: j */
    public static /* synthetic */ void m24816j(AbstractC11175x0 abstractC11175x0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC11175x0.m24821i(z10);
    }

    /* renamed from: u */
    public static /* synthetic */ void m24817u(AbstractC11175x0 abstractC11175x0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC11175x0.m24825s(z10);
    }

    /* renamed from: B */
    public abstract long mo24818B();

    /* renamed from: C */
    public final boolean m24819C() {
        AbstractC10008f abstractC10008f;
        C10958m c10958m = this.f26840e;
        if (c10958m == null || (abstractC10008f = (AbstractC10008f) c10958m.m23976r()) == null) {
            return false;
        }
        abstractC10008f.run();
        return true;
    }

    /* renamed from: D */
    public boolean m24820D() {
        return false;
    }

    /* renamed from: i */
    public final void m24821i(boolean z10) {
        long jM24822k = this.f26838c - m24822k(z10);
        this.f26838c = jM24822k;
        if (jM24822k <= 0 && this.f26839d) {
            shutdown();
        }
    }

    /* renamed from: k */
    public final long m24822k(boolean z10) {
        if (z10) {
            return IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }
        return 1L;
    }

    /* renamed from: l */
    public final void m24823l(AbstractC10008f abstractC10008f) {
        C10958m c10958m = this.f26840e;
        if (c10958m == null) {
            c10958m = new C10958m();
            this.f26840e = c10958m;
        }
        c10958m.addLast(abstractC10008f);
    }

    @Override // sd.AbstractC11106e0
    public final AbstractC11106e0 limitedParallelism(int i10, String str) {
        AbstractC11856l.m26301a(i10);
        return AbstractC11856l.m26302b(this, str);
    }

    /* renamed from: r */
    public long mo24824r() {
        C10958m c10958m = this.f26840e;
        return (c10958m == null || c10958m.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: s */
    public final void m24825s(boolean z10) {
        this.f26838c += m24822k(z10);
        if (z10) {
            return;
        }
        this.f26839d = true;
    }

    public abstract void shutdown();

    /* renamed from: w */
    public final boolean m24826w() {
        return this.f26838c >= m24822k(true);
    }

    /* renamed from: x */
    public final boolean m24827x() {
        C10958m c10958m = this.f26840e;
        if (c10958m != null) {
            return c10958m.isEmpty();
        }
        return true;
    }
}
