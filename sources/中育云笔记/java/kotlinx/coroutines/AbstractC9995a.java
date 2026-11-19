package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;
import sd.AbstractC11098c0;
import sd.AbstractC11114g0;
import sd.AbstractC11126j0;
import sd.AbstractC11155q1;
import sd.AbstractC11177y;
import sd.C11174x;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes6.dex */
public abstract class AbstractC9995a extends JobSupport implements InterfaceC10045g, InterfaceC11588c, InterfaceC11122i0 {

    /* renamed from: e */
    public final InterfaceC9945d f23512e;

    public AbstractC9995a(InterfaceC9945d interfaceC9945d, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            m20433c0((InterfaceC10045g) interfaceC9945d.get(InterfaceC10045g.f23976b0));
        }
        this.f23512e = interfaceC9945d.plus(this);
    }

    /* renamed from: F0 */
    public void mo20490F0(Object obj) {
        mo20460w(obj);
    }

    /* renamed from: G0 */
    public void mo20491G0(Throwable th, boolean z10) {
    }

    /* renamed from: H0 */
    public void mo20492H0(Object obj) {
    }

    /* renamed from: I0 */
    public final void m20493I0(CoroutineStart coroutineStart, Object obj, InterfaceC9544p interfaceC9544p) {
        coroutineStart.m20373c(interfaceC9544p, obj, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: J */
    public String mo20416J() {
        return AbstractC11126j0.m24738a(this) + " was cancelled";
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: b0 */
    public final void mo20432b0(Throwable th) {
        AbstractC11114g0.m24718a(this.f23512e, th);
    }

    @Override // vc.InterfaceC11588c
    public final InterfaceC9945d getContext() {
        return this.f23512e;
    }

    @Override // sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.f23512e;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC10045g
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: k0 */
    public String mo20443k0() {
        String strM24685g = AbstractC11098c0.m24685g(this.f23512e);
        if (strM24685g == null) {
            return super.mo20443k0();
        }
        return '\"' + strM24685g + "\":" + super.mo20443k0();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: p0 */
    public final void mo20450p0(Object obj) {
        if (!(obj instanceof C11174x)) {
            mo20492H0(obj);
        } else {
            C11174x c11174x = (C11174x) obj;
            mo20491G0(c11174x.f26837a, c11174x.m24814a());
        }
    }

    @Override // vc.InterfaceC11588c
    public final void resumeWith(Object obj) {
        Object objM20442j0 = m20442j0(AbstractC11177y.m24829b(obj));
        if (objM20442j0 == AbstractC11155q1.f26815b) {
            return;
        }
        mo20490F0(objM20442j0);
    }
}
