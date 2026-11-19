package kotlinx.coroutines.channels;

import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p135i8.AbstractC8818a0;
import p157k8.AbstractC9065a;
import p157k8.InterfaceC9071g;

/* renamed from: kotlinx.coroutines.channels.e */
/* loaded from: classes5.dex */
public final class C9162e extends AbstractC9065a implements InterfaceC9071g {
    public C9162e(InterfaceC9100d interfaceC9100d, InterfaceC9158a interfaceC9158a) {
        super(interfaceC9100d, interfaceC9158a, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC9152a
    /* renamed from: H0 */
    public void mo16329H0(Throwable th, boolean z10) {
        if (m15875L0().close(th) || z10) {
            return;
        }
        AbstractC8818a0.m14797a(getContext(), th);
    }

    @Override // kotlinx.coroutines.AbstractC9152a
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public void mo16330I0(C8736p c8736p) {
        InterfaceC9163f.a.m16549a(m15875L0(), null, 1, null);
    }

    @Override // p157k8.InterfaceC9071g
    public /* bridge */ /* synthetic */ InterfaceC9163f getChannel() {
        return m15874K0();
    }

    @Override // kotlinx.coroutines.AbstractC9152a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC9212n
    public boolean isActive() {
        return super.isActive();
    }
}
