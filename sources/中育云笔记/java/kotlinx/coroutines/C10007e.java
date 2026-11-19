package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p393wc.AbstractC11725a;
import p410xd.AbstractC11850i;
import p410xd.C11874y;
import sd.AbstractC11155q1;
import sd.AbstractC11177y;
import sd.C11174x;
import vc.InterfaceC11588c;

/* renamed from: kotlinx.coroutines.e */
/* loaded from: classes6.dex */
public final class C10007e extends C11874y {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23589g = AtomicIntegerFieldUpdater.newUpdater(C10007e.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C10007e(InterfaceC9945d interfaceC9945d, InterfaceC11588c interfaceC11588c) {
        super(interfaceC9945d, interfaceC11588c);
    }

    /* renamed from: M0 */
    private final boolean m20752M0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f23589g;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f23589g.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: N0 */
    private final boolean m20753N0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f23589g;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f23589g.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p410xd.C11874y, kotlinx.coroutines.AbstractC9995a
    /* renamed from: F0 */
    public void mo20490F0(Object obj) {
        if (m20752M0()) {
            return;
        }
        AbstractC11850i.m26278b(IntrinsicsKt__IntrinsicsJvmKt.m20224d(this.f28133f), AbstractC11177y.m24828a(obj, this.f28133f));
    }

    /* renamed from: K0 */
    public final Object m20754K0() {
        if (m20753N0()) {
            return AbstractC11725a.m25952f();
        }
        Object objM24797h = AbstractC11155q1.m24797h(m20430X());
        if (objM24797h instanceof C11174x) {
            throw ((C11174x) objM24797h).f26837a;
        }
        return objM24797h;
    }

    @Override // p410xd.C11874y, kotlinx.coroutines.JobSupport
    /* renamed from: w */
    public void mo20460w(Object obj) {
        mo20490F0(obj);
    }
}
