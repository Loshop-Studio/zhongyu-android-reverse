package p087f3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C2791f;
import kotlinx.coroutines.internal.C2804s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p146r2.C3032c;
import p146r2.C3033d;

/* renamed from: f3.s0 */
/* loaded from: classes.dex */
public final class C2596s0<T> extends C2804s<T> {

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10278d = AtomicIntegerFieldUpdater.newUpdater(C2596s0.class, "_decision");

    @NotNull
    private volatile /* synthetic */ int _decision;

    public C2596s0(@NotNull InterfaceC3015g interfaceC3015g, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        super(interfaceC3015g, interfaceC3012d);
        this._decision = 0;
    }

    /* renamed from: A0 */
    private final boolean m8663A0() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f10278d.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: z0 */
    private final boolean m8664z0() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f10278d.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.C2804s, p087f3.C2600t1
    /* renamed from: l */
    protected void mo8546l(@Nullable Object obj) {
        mo8498t0(obj);
    }

    @Override // kotlinx.coroutines.internal.C2804s, p087f3.AbstractC2528a
    /* renamed from: t0 */
    protected void mo8498t0(@Nullable Object obj) {
        if (m8664z0()) {
            return;
        }
        C2791f.m9290c(C3032c.m10174b(this.f10786c), C2537c0.m8531a(obj, this.f10786c), null, 2, null);
    }

    @Nullable
    /* renamed from: y0 */
    public final Object m8665y0() {
        if (m8663A0()) {
            return C3033d.m10175c();
        }
        Object objM8740h = C2603u1.m8740h(m8700O());
        if (objM8740h instanceof C2613y) {
            throw ((C2613y) objM8740h).f10316a;
        }
        return objM8740h;
    }
}
