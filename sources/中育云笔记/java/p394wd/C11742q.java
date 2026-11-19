package p394wd;

import kotlin.coroutines.InterfaceC9945d;
import p409xc.InterfaceC11828c;
import vc.InterfaceC11588c;

/* renamed from: wd.q */
/* loaded from: classes6.dex */
public final class C11742q implements InterfaceC11588c, InterfaceC11828c {

    /* renamed from: c */
    public final InterfaceC11588c f27901c;

    /* renamed from: d */
    public final InterfaceC9945d f27902d;

    public C11742q(InterfaceC11588c interfaceC11588c, InterfaceC9945d interfaceC9945d) {
        this.f27901c = interfaceC11588c;
        this.f27902d = interfaceC9945d;
    }

    @Override // p409xc.InterfaceC11828c
    public InterfaceC11828c getCallerFrame() {
        InterfaceC11588c interfaceC11588c = this.f27901c;
        if (interfaceC11588c instanceof InterfaceC11828c) {
            return (InterfaceC11828c) interfaceC11588c;
        }
        return null;
    }

    @Override // vc.InterfaceC11588c
    public InterfaceC9945d getContext() {
        return this.f27902d;
    }

    @Override // vc.InterfaceC11588c
    public void resumeWith(Object obj) {
        this.f27901c.resumeWith(obj);
    }
}
