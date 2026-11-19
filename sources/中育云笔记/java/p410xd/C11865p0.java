package p410xd;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import sd.InterfaceC11112f2;

/* renamed from: xd.p0 */
/* loaded from: classes6.dex */
public final class C11865p0 {

    /* renamed from: a */
    public final InterfaceC9945d f28123a;

    /* renamed from: b */
    public final Object[] f28124b;

    /* renamed from: c */
    public final InterfaceC11112f2[] f28125c;

    /* renamed from: d */
    public int f28126d;

    public C11865p0(InterfaceC9945d interfaceC9945d, int i10) {
        this.f28123a = interfaceC9945d;
        this.f28124b = new Object[i10];
        this.f28125c = new InterfaceC11112f2[i10];
    }

    /* renamed from: a */
    public final void m26341a(InterfaceC11112f2 interfaceC11112f2, Object obj) {
        Object[] objArr = this.f28124b;
        int i10 = this.f28126d;
        objArr[i10] = obj;
        InterfaceC11112f2[] interfaceC11112f2Arr = this.f28125c;
        this.f28126d = i10 + 1;
        AbstractC9979u.m20292e(interfaceC11112f2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC11112f2Arr[i10] = interfaceC11112f2;
    }

    /* renamed from: b */
    public final void m26342b(InterfaceC9945d interfaceC9945d) {
        int length = this.f28125c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            InterfaceC11112f2 interfaceC11112f2 = this.f28125c[length];
            AbstractC9979u.m20291d(interfaceC11112f2);
            interfaceC11112f2.restoreThreadContext(interfaceC9945d, this.f28124b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
