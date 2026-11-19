package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC9100d;
import p135i8.AbstractC8818a0;
import p135i8.AbstractC8825c0;
import p135i8.AbstractC8832e1;
import p135i8.AbstractC8890y;
import p135i8.C8884w;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9152a extends JobSupport implements InterfaceC9212n, InterfaceC9324c, InterfaceC8822b0 {

    /* renamed from: c */
    public final InterfaceC9100d f17588c;

    public AbstractC9152a(InterfaceC9100d interfaceC9100d, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            m16278c0((InterfaceC9212n) interfaceC9100d.get(InterfaceC9212n.f18095c0));
        }
        this.f17588c = interfaceC9100d.plus(this);
    }

    /* renamed from: G0 */
    public void mo14931G0(Object obj) {
        mo14824B(obj);
    }

    /* renamed from: H0 */
    public void mo16329H0(Throwable th, boolean z10) {
    }

    /* renamed from: I0 */
    public void mo16330I0(Object obj) {
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: J */
    public String mo16265J() {
        return AbstractC8825c0.m14820a(this) + " was cancelled";
    }

    /* renamed from: J0 */
    public final void m16331J0(CoroutineStart coroutineStart, Object obj, InterfaceC10574p interfaceC10574p) {
        coroutineStart.m16224b(interfaceC10574p, obj, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: b0 */
    public final void mo16277b0(Throwable th) {
        AbstractC8818a0.m14797a(this.f17588c, th);
    }

    @Override // p179m7.InterfaceC9324c
    public final InterfaceC9100d getContext() {
        return this.f17588c;
    }

    @Override // p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        return this.f17588c;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC9212n
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: l0 */
    public String mo14929l0() {
        String strM16213b = CoroutineContextKt.m16213b(this.f17588c);
        if (strM16213b == null) {
            return super.mo14929l0();
        }
        return '\"' + strM16213b + "\":" + super.mo14929l0();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: q0 */
    public final void mo16296q0(Object obj) {
        if (!(obj instanceof C8884w)) {
            mo16330I0(obj);
        } else {
            C8884w c8884w = (C8884w) obj;
            mo16329H0(c8884w.f16545a, c8884w.m14927a());
        }
    }

    @Override // p179m7.InterfaceC9324c
    public final void resumeWith(Object obj) {
        Object objM16286j0 = m16286j0(AbstractC8890y.m14937d(obj, null, 1, null));
        if (objM16286j0 == AbstractC8832e1.f16503b) {
            return;
        }
        mo14931G0(objM16286j0);
    }
}
