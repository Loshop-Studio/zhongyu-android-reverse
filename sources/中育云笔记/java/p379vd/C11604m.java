package p379vd;

import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.channels.BufferOverflow;
import p394wd.InterfaceC11734i;
import vc.InterfaceC11588c;

/* renamed from: vd.m */
/* loaded from: classes6.dex */
public final class C11604m implements InterfaceC11607p, InterfaceC11594c, InterfaceC11734i {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11607p f27501c;

    /* renamed from: d */
    public final InterfaceC10045g f27502d;

    public C11604m(InterfaceC11607p interfaceC11607p, InterfaceC10045g interfaceC10045g) {
        this.f27501c = interfaceC11607p;
        this.f27502d = interfaceC10045g;
    }

    @Override // p394wd.InterfaceC11734i
    /* renamed from: b */
    public InterfaceC11594c mo20855b(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return AbstractC11608q.m25595e(this, interfaceC9945d, i10, bufferOverflow);
    }

    @Override // p379vd.InterfaceC11607p, p379vd.InterfaceC11594c
    public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        return this.f27501c.collect(interfaceC11595d, interfaceC11588c);
    }
}
