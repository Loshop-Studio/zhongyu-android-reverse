package sd;

import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: sd.p1 */
/* loaded from: classes6.dex */
public abstract class AbstractC11151p1 extends LockFreeLinkedListNode implements InterfaceC11163t0, InterfaceC11127j1 {

    /* renamed from: f */
    public JobSupport f26811f;

    @Override // sd.InterfaceC11127j1
    /* renamed from: b */
    public C11167u1 mo20474b() {
        return null;
    }

    @Override // sd.InterfaceC11163t0
    public void dispose() {
        m24787t().m20456t0(this);
    }

    @Override // sd.InterfaceC11127j1
    public boolean isActive() {
        return true;
    }

    /* renamed from: t */
    public final JobSupport m24787t() {
        JobSupport jobSupport = this.f26811f;
        if (jobSupport != null) {
            return jobSupport;
        }
        AbstractC9979u.m20312y("job");
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return AbstractC11126j0.m24738a(this) + '@' + AbstractC11126j0.m24739b(this) + "[job@" + AbstractC11126j0.m24739b(m24787t()) + ']';
    }

    /* renamed from: u */
    public abstract boolean mo20468u();

    /* renamed from: v */
    public abstract void mo20469v(Throwable th);

    /* renamed from: w */
    public final void m24788w(JobSupport jobSupport) {
        this.f26811f = jobSupport;
    }
}
