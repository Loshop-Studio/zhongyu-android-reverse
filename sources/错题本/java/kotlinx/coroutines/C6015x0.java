package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.x0 */
/* loaded from: classes4.dex */
public class C6015x0 extends C5871c1 implements InterfaceC5983n {

    /* renamed from: c */
    public final boolean f9527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6015x0(InterfaceC6013w0 interfaceC6013w0) {
        super(true);
        boolean z8 = true;
        m5444K(interfaceC6013w0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5871c1.f9289b;
        InterfaceC5971j interfaceC5971j = (InterfaceC5971j) atomicReferenceFieldUpdater.get(this);
        C5974k c5974k = interfaceC5971j instanceof C5974k ? (C5974k) interfaceC5971j : null;
        if (c5974k == null) {
            z8 = false;
            break;
        }
        C5871c1 c5871c1M5657h = c5974k.m5657h();
        while (!c5871c1M5657h.mo5440F()) {
            InterfaceC5971j interfaceC5971j2 = (InterfaceC5971j) atomicReferenceFieldUpdater.get(c5871c1M5657h);
            C5974k c5974k2 = interfaceC5971j2 instanceof C5974k ? (C5974k) interfaceC5971j2 : null;
            if (c5974k2 == null) {
                z8 = false;
                break;
            }
            c5871c1M5657h = c5974k2.m5657h();
        }
        this.f9527c = z8;
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: F */
    public final boolean mo5440F() {
        return this.f9527c;
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: G */
    public final boolean mo5441G() {
        return true;
    }
}
