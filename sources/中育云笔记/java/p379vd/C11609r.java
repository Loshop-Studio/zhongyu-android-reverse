package p379vd;

import kotlinx.coroutines.flow.SharedFlowImpl;
import p394wd.AbstractC11728c;
import vc.InterfaceC11588c;

/* renamed from: vd.r */
/* loaded from: classes6.dex */
public final class C11609r extends AbstractC11728c {

    /* renamed from: a */
    public long f27507a = -1;

    /* renamed from: b */
    public InterfaceC11588c f27508b;

    @Override // p394wd.AbstractC11728c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo25598a(SharedFlowImpl sharedFlowImpl) {
        if (this.f27507a >= 0) {
            return false;
        }
        this.f27507a = sharedFlowImpl.m20853X();
        return true;
    }

    @Override // p394wd.AbstractC11728c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC11588c[] mo25599b(SharedFlowImpl sharedFlowImpl) {
        long j10 = this.f27507a;
        this.f27507a = -1L;
        this.f27508b = null;
        return sharedFlowImpl.m20852W(j10);
    }
}
