package p087f3;

import kotlinx.coroutines.internal.C2785a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: f3.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC2617z0 extends AbstractC2545e0 {

    /* renamed from: b */
    private long f10320b;

    /* renamed from: c */
    private boolean f10321c;

    /* renamed from: d */
    @Nullable
    private C2785a<AbstractC2599t0<?>> f10322d;

    /* renamed from: M */
    public static /* synthetic */ void m8761M(AbstractC2617z0 abstractC2617z0, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        abstractC2617z0.m8764L(z3);
    }

    /* renamed from: N */
    private final long m8762N(boolean z3) {
        return z3 ? 4294967296L : 1L;
    }

    /* renamed from: R */
    public static /* synthetic */ void m8763R(AbstractC2617z0 abstractC2617z0, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        abstractC2617z0.m8766Q(z3);
    }

    /* renamed from: L */
    public final void m8764L(boolean z3) {
        long jM8762N = this.f10320b - m8762N(z3);
        this.f10320b = jM8762N;
        if (jM8762N <= 0 && this.f10321c) {
            shutdown();
        }
    }

    /* renamed from: O */
    public final void m8765O(@NotNull AbstractC2599t0<?> abstractC2599t0) {
        C2785a<AbstractC2599t0<?>> c2785a = this.f10322d;
        if (c2785a == null) {
            c2785a = new C2785a<>();
            this.f10322d = c2785a;
        }
        c2785a.m9272a(abstractC2599t0);
    }

    /* renamed from: P */
    protected long mo8512P() {
        C2785a<AbstractC2599t0<?>> c2785a = this.f10322d;
        return (c2785a == null || c2785a.m9273c()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: Q */
    public final void m8766Q(boolean z3) {
        this.f10320b += m8762N(z3);
        if (z3) {
            return;
        }
        this.f10321c = true;
    }

    /* renamed from: S */
    public final boolean m8767S() {
        return this.f10320b >= m8762N(true);
    }

    /* renamed from: T */
    public final boolean m8768T() {
        C2785a<AbstractC2599t0<?>> c2785a = this.f10322d;
        if (c2785a == null) {
            return true;
        }
        return c2785a.m9273c();
    }

    /* renamed from: U */
    public long mo8513U() {
        return !m8769V() ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: V */
    public final boolean m8769V() {
        AbstractC2599t0<?> abstractC2599t0M9274d;
        C2785a<AbstractC2599t0<?>> c2785a = this.f10322d;
        if (c2785a == null || (abstractC2599t0M9274d = c2785a.m9274d()) == null) {
            return false;
        }
        abstractC2599t0M9274d.run();
        return true;
    }

    /* renamed from: W */
    public boolean m8770W() {
        return false;
    }

    protected void shutdown() {
    }
}
