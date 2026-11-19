package sd;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import p410xd.C11874y;
import vc.InterfaceC11588c;

/* renamed from: sd.j2 */
/* loaded from: classes6.dex */
public final class RunnableC11128j2 extends C11874y implements Runnable {

    /* renamed from: g */
    public final long f26792g;

    public RunnableC11128j2(long j10, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c.getContext(), interfaceC11588c);
        this.f26792g = j10;
    }

    @Override // kotlinx.coroutines.AbstractC9995a, kotlinx.coroutines.JobSupport
    /* renamed from: k0 */
    public String mo20443k0() {
        return super.mo20443k0() + "(timeMillis=" + this.f26792g + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m20410E(TimeoutKt.m20485a(this.f26792g, DelayKt.m20377c(getContext()), this));
    }
}
