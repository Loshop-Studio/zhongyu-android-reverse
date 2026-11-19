package p169l8;

import kotlinx.coroutines.flow.SharedFlowImpl;
import p179m7.InterfaceC9324c;
import p180m8.AbstractC9330c;

/* renamed from: l8.n */
/* loaded from: classes5.dex */
public final class C9277n extends AbstractC9330c {

    /* renamed from: a */
    public long f18274a = -1;

    /* renamed from: b */
    public InterfaceC9324c f18275b;

    @Override // p180m8.AbstractC9330c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo17050a(SharedFlowImpl sharedFlowImpl) {
        if (this.f18274a >= 0) {
            return false;
        }
        this.f18274a = sharedFlowImpl.m16669Y();
        return true;
    }

    @Override // p180m8.AbstractC9330c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC9324c[] mo17051b(SharedFlowImpl sharedFlowImpl) {
        long j10 = this.f18274a;
        this.f18274a = -1L;
        this.f18275b = null;
        return sharedFlowImpl.m16668X(j10);
    }
}
