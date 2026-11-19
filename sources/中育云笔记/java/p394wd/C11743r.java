package p394wd;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import p379vd.InterfaceC11612u;

/* renamed from: wd.r */
/* loaded from: classes6.dex */
public final class C11743r extends SharedFlowImpl implements InterfaceC11612u {
    public C11743r(int i10) {
        super(1, Integer.MAX_VALUE, BufferOverflow.f23520d);
        mo20854a(Integer.valueOf(i10));
    }

    @Override // p379vd.InterfaceC11612u
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) m20841L()).intValue());
        }
        return numValueOf;
    }

    /* renamed from: Z */
    public final boolean m25971Z(int i10) {
        boolean zMo20854a;
        synchronized (this) {
            zMo20854a = mo20854a(Integer.valueOf(((Number) m20841L()).intValue() + i10));
        }
        return zMo20854a;
    }
}
