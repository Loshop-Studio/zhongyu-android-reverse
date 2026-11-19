package p135i8;

import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9211m;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: i8.d1 */
/* loaded from: classes5.dex */
public abstract class AbstractC8829d1 extends LockFreeLinkedListNode implements InterfaceC9211m, InterfaceC8849k0, InterfaceC8882v0 {

    /* renamed from: d */
    public JobSupport f16500d;

    @Override // p135i8.InterfaceC8849k0
    public void dispose() {
        m14829t().m16300u0(this);
    }

    @Override // p135i8.InterfaceC8882v0
    public C8844i1 getList() {
        return null;
    }

    @Override // p135i8.InterfaceC8882v0
    public boolean isActive() {
        return true;
    }

    /* renamed from: t */
    public final JobSupport m14829t() {
        JobSupport jobSupport = this.f16500d;
        if (jobSupport != null) {
            return jobSupport;
        }
        AbstractC9133u.m16151y("job");
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return AbstractC8825c0.m14820a(this) + '@' + AbstractC8825c0.m14821b(this) + "[job@" + AbstractC8825c0.m14821b(m14829t()) + ']';
    }

    /* renamed from: u */
    public final void m14830u(JobSupport jobSupport) {
        this.f16500d = jobSupport;
    }
}
