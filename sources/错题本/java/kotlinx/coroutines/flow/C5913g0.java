package kotlinx.coroutines.flow;

import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.flow.internal.AbstractC5919a;
import kotlinx.coroutines.flow.internal.AbstractC5921c;
import p075h6.InterfaceC5631c;

/* renamed from: kotlinx.coroutines.flow.g0 */
/* loaded from: classes4.dex */
public final class C5913g0 extends AbstractC5921c {

    /* renamed from: a */
    public long f9372a;

    /* renamed from: b */
    public C5961g f9373b;

    @Override // kotlinx.coroutines.flow.internal.AbstractC5921c
    /* renamed from: a */
    public final boolean mo5543a(AbstractC5919a abstractC5919a) {
        C5911f0 c5911f0 = (C5911f0) abstractC5919a;
        if (this.f9372a >= 0) {
            return false;
        }
        long j7 = c5911f0.f9368i;
        if (j7 < c5911f0.f9369j) {
            c5911f0.f9369j = j7;
        }
        this.f9372a = j7;
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5921c
    /* renamed from: b */
    public final InterfaceC5631c[] mo5544b(AbstractC5919a abstractC5919a) {
        long j7 = this.f9372a;
        this.f9372a = -1L;
        this.f9373b = null;
        return ((C5911f0) abstractC5919a).m5542u(j7);
    }
}
