package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p054e7.AbstractC5469a;
import p054e7.C5483o;
import p185v7.AbstractC6683l;

/* renamed from: kotlinx.coroutines.d0 */
/* loaded from: classes4.dex */
public final class C5890d0 extends C5483o {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9337e = AtomicIntegerFieldUpdater.newUpdater(C5890d0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p054e7.C5483o, kotlinx.coroutines.C5871c1
    /* renamed from: s */
    public final void mo4860s(Object obj) throws DispatchException {
        mo4861t(obj);
    }

    @Override // p054e7.C5483o, kotlinx.coroutines.C5871c1
    /* renamed from: t */
    public final void mo4861t(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f9337e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC5469a.m4832h(AbstractC6683l.m6374n(this.f8476d), AbstractC6014x.m5653x(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
