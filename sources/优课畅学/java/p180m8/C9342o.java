package p180m8;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import p169l8.InterfaceC9280q;

/* renamed from: m8.o */
/* loaded from: classes5.dex */
public final class C9342o extends SharedFlowImpl implements InterfaceC9280q {
    public C9342o(int i10) {
        super(1, Integer.MAX_VALUE, BufferOverflow.f17604b);
        mo16670a(Integer.valueOf(i10));
    }

    @Override // p169l8.InterfaceC9280q
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) m16657M()).intValue());
        }
        return numValueOf;
    }

    /* renamed from: a0 */
    public final boolean m17170a0(int i10) {
        boolean zMo16670a;
        synchronized (this) {
            zMo16670a = mo16670a(Integer.valueOf(((Number) m16657M()).intValue() + i10));
        }
        return zMo16670a;
    }
}
