package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p135i8.AbstractC8832e1;
import p135i8.AbstractC8890y;
import p135i8.C8884w;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.AbstractC9455k;
import p191n8.C9473z;

/* renamed from: kotlinx.coroutines.h */
/* loaded from: classes5.dex */
public final class C9204h extends C9473z {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18066e = AtomicIntegerFieldUpdater.newUpdater(C9204h.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C9204h(InterfaceC9100d interfaceC9100d, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9100d, interfaceC9324c);
    }

    /* renamed from: M0 */
    private final boolean m16720M0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18066e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f18066e.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: N0 */
    private final boolean m16721N0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18066e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f18066e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p191n8.C9473z, kotlinx.coroutines.JobSupport
    /* renamed from: B */
    public void mo14824B(Object obj) {
        mo14931G0(obj);
    }

    @Override // p191n8.C9473z, kotlinx.coroutines.AbstractC9152a
    /* renamed from: G0 */
    public void mo14931G0(Object obj) {
        if (m16720M0()) {
            return;
        }
        AbstractC9455k.m17354c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(this.f18693d), AbstractC8890y.m14934a(obj, this.f18693d), null, 2, null);
    }

    /* renamed from: K0 */
    public final Object m16722K0() {
        if (m16721N0()) {
            return AbstractC9434a.m17291f();
        }
        Object objM14841h = AbstractC8832e1.m14841h(m16276X());
        if (objM14841h instanceof C8884w) {
            throw ((C8884w) objM14841h).f16545a;
        }
        return objM14841h;
    }
}
