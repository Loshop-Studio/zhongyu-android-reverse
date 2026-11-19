package p191n8;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8877t1;

/* renamed from: n8.m0 */
/* loaded from: classes5.dex */
public final class C9460m0 {

    /* renamed from: a */
    public final InterfaceC9100d f18675a;

    /* renamed from: b */
    public final Object[] f18676b;

    /* renamed from: c */
    public final InterfaceC8877t1[] f18677c;

    /* renamed from: d */
    public int f18678d;

    public C9460m0(InterfaceC9100d interfaceC9100d, int i10) {
        this.f18675a = interfaceC9100d;
        this.f18676b = new Object[i10];
        this.f18677c = new InterfaceC8877t1[i10];
    }

    /* renamed from: a */
    public final void m17378a(InterfaceC8877t1 interfaceC8877t1, Object obj) {
        Object[] objArr = this.f18676b;
        int i10 = this.f18678d;
        objArr[i10] = obj;
        InterfaceC8877t1[] interfaceC8877t1Arr = this.f18677c;
        this.f18678d = i10 + 1;
        AbstractC9133u.m16131e(interfaceC8877t1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC8877t1Arr[i10] = interfaceC8877t1;
    }

    /* renamed from: b */
    public final void m17379b(InterfaceC9100d interfaceC9100d) {
        int length = this.f18677c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            InterfaceC8877t1 interfaceC8877t1 = this.f18677c[length];
            AbstractC9133u.m16130d(interfaceC8877t1);
            interfaceC8877t1.restoreThreadContext(interfaceC9100d, this.f18676b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
