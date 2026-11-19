package p135i8;

import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.JobSupport;
import p123h7.C8736p;

/* renamed from: i8.a1 */
/* loaded from: classes5.dex */
public class C8819a1 extends JobSupport implements InterfaceC8878u {

    /* renamed from: c */
    public final boolean f16494c;

    public C8819a1(InterfaceC9212n interfaceC9212n) {
        super(true);
        m16278c0(interfaceC9212n);
        this.f16494c = m14799G0();
    }

    /* renamed from: G0 */
    public final boolean m14799G0() {
        JobSupport jobSupportM14829t;
        InterfaceC8860o interfaceC8860oM16275W = m16275W();
        C8863p c8863p = interfaceC8860oM16275W instanceof C8863p ? (C8863p) interfaceC8860oM16275W : null;
        if (c8863p != null && (jobSupportM14829t = c8863p.m14829t()) != null) {
            while (!jobSupportM14829t.mo14800T()) {
                InterfaceC8860o interfaceC8860oM16275W2 = jobSupportM14829t.m16275W();
                C8863p c8863p2 = interfaceC8860oM16275W2 instanceof C8863p ? (C8863p) interfaceC8860oM16275W2 : null;
                if (c8863p2 == null || (jobSupportM14829t = c8863p2.m14829t()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: T */
    public boolean mo14800T() {
        return this.f16494c;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: U */
    public boolean mo14801U() {
        return true;
    }

    @Override // p135i8.InterfaceC8878u
    /* renamed from: a */
    public boolean mo14802a(Throwable th) {
        return m16285i0(new C8884w(th, false, 2, null));
    }

    @Override // p135i8.InterfaceC8878u
    public boolean complete() {
        return m16285i0(C8736p.f16368a);
    }
}
