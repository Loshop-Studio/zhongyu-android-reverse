package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p054e7.AbstractC5469a;
import p054e7.C5473e;
import p054e7.C5486r;

/* renamed from: kotlinx.coroutines.i */
/* loaded from: classes4.dex */
public final class C5967i extends AbstractC6017y0 {

    /* renamed from: e */
    public final /* synthetic */ int f9457e;

    /* renamed from: f */
    public final C5961g f9458f;

    public /* synthetic */ C5967i(C5961g c5961g, int i) {
        this.f9457e = i;
        this.f9458f = c5961g;
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: i */
    public final boolean mo5426i() {
        switch (this.f9457e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: j */
    public final void mo5427j(Throwable th) throws DispatchException {
        switch (this.f9457e) {
            case 0:
                C5871c1 c5871c1M5657h = m5657h();
                C5961g c5961g = this.f9458f;
                Throwable thMo5582s = c5961g.mo5582s(c5871c1M5657h);
                if (c5961g.m5587x()) {
                    C5473e c5473e = (C5473e) c5961g.f9450d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5473e.f8449h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c5473e);
                        C5486r c5486r = AbstractC5469a.f8440c;
                        if (AbstractC5830k.m5325b(obj, c5486r)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c5473e, c5486r, thMo5582s)) {
                                if (atomicReferenceFieldUpdater.get(c5473e) != c5486r) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c5473e, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c5473e) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c5961g.mo4965i(thMo5582s);
                if (!c5961g.m5587x()) {
                    c5961g.m5580p();
                    break;
                }
                break;
            default:
                this.f9458f.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
                break;
        }
    }
}
