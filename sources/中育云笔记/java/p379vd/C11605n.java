package p379vd;

import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.channels.BufferOverflow;
import p394wd.InterfaceC11734i;
import vc.InterfaceC11588c;

/* renamed from: vd.n */
/* loaded from: classes6.dex */
public final class C11605n implements InterfaceC11612u, InterfaceC11594c, InterfaceC11734i {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11612u f27503c;

    /* renamed from: d */
    public final InterfaceC10045g f27504d;

    public C11605n(InterfaceC11612u interfaceC11612u, InterfaceC10045g interfaceC10045g) {
        this.f27503c = interfaceC11612u;
        this.f27504d = interfaceC10045g;
    }

    @Override // p394wd.InterfaceC11734i
    /* renamed from: b */
    public InterfaceC11594c mo20855b(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return AbstractC11613v.m25605d(this, interfaceC9945d, i10, bufferOverflow);
    }

    @Override // p379vd.InterfaceC11607p, p379vd.InterfaceC11594c
    public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        return this.f27503c.collect(interfaceC11595d, interfaceC11588c);
    }

    @Override // p379vd.InterfaceC11612u
    public Object getValue() {
        return this.f27503c.getValue();
    }
}
