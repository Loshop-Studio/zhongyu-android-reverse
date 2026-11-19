package kotlinx.coroutines.channels;

import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p309qc.C10786q;
import p365ud.AbstractC11389d;
import p365ud.InterfaceC11395j;
import sd.AbstractC11114g0;

/* renamed from: kotlinx.coroutines.channels.e */
/* loaded from: classes6.dex */
public final class C10004e extends AbstractC11389d implements InterfaceC11395j {
    public C10004e(InterfaceC9945d interfaceC9945d, InterfaceC10000a interfaceC10000a) {
        super(interfaceC9945d, interfaceC10000a, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC9995a
    /* renamed from: G0 */
    public void mo20491G0(Throwable th, boolean z10) {
        if (m25341K0().close(th) || z10) {
            return;
        }
        AbstractC11114g0.m24718a(getContext(), th);
    }

    @Override // kotlinx.coroutines.AbstractC9995a
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void mo20492H0(C10786q c10786q) {
        InterfaceC10005f.a.m20742a(m25341K0(), null, 1, null);
    }

    @Override // p365ud.InterfaceC11395j
    public /* bridge */ /* synthetic */ InterfaceC10005f getChannel() {
        return m25340J0();
    }

    @Override // kotlinx.coroutines.AbstractC9995a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC10045g
    public boolean isActive() {
        return super.isActive();
    }
}
