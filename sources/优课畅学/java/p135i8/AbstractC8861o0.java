package p135i8;

import com.tencent.ijk.media.player.IjkMediaMeta;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.AbstractC9205i;
import kotlinx.coroutines.CoroutineDispatcher;
import p134i7.C8791m;
import p191n8.AbstractC9461n;

/* renamed from: i8.o0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8861o0 extends CoroutineDispatcher {

    /* renamed from: a */
    public long f16527a;

    /* renamed from: b */
    public boolean f16528b;

    /* renamed from: c */
    public C8791m f16529c;

    /* renamed from: m */
    public static /* synthetic */ void m14885m(AbstractC8861o0 abstractC8861o0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC8861o0.m14888i(z10);
    }

    /* renamed from: v */
    public static /* synthetic */ void m14886v(AbstractC8861o0 abstractC8861o0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC8861o0.m14892t(z10);
    }

    /* renamed from: A */
    public boolean m14887A() {
        return false;
    }

    /* renamed from: i */
    public final void m14888i(boolean z10) {
        long jM14889o = this.f16527a - m14889o(z10);
        this.f16527a = jM14889o;
        if (jM14889o <= 0 && this.f16528b) {
            shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i10) {
        AbstractC9461n.m17380a(i10);
        return this;
    }

    /* renamed from: o */
    public final long m14889o(boolean z10) {
        if (z10) {
            return IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }
        return 1L;
    }

    /* renamed from: q */
    public final void m14890q(AbstractC9205i abstractC9205i) {
        C8791m c8791m = this.f16529c;
        if (c8791m == null) {
            c8791m = new C8791m();
            this.f16529c = c8791m;
        }
        c8791m.addLast(abstractC9205i);
    }

    /* renamed from: r */
    public long mo14891r() {
        C8791m c8791m = this.f16529c;
        return (c8791m == null || c8791m.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public abstract void shutdown();

    /* renamed from: t */
    public final void m14892t(boolean z10) {
        this.f16527a += m14889o(z10);
        if (z10) {
            return;
        }
        this.f16528b = true;
    }

    /* renamed from: w */
    public final boolean m14893w() {
        return this.f16527a >= m14889o(true);
    }

    /* renamed from: x */
    public final boolean m14894x() {
        C8791m c8791m = this.f16529c;
        if (c8791m != null) {
            return c8791m.isEmpty();
        }
        return true;
    }

    /* renamed from: y */
    public abstract long mo14895y();

    /* renamed from: z */
    public final boolean m14896z() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9205i abstractC9205i;
        C8791m c8791m = this.f16529c;
        if (c8791m == null || (abstractC9205i = (AbstractC9205i) c8791m.m14601m()) == null) {
            return false;
        }
        abstractC9205i.run();
        return true;
    }
}
