package p410xd;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: xd.n0 */
/* loaded from: classes6.dex */
public class C11861n0 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28111b = AtomicIntegerFieldUpdater.newUpdater(C11861n0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a */
    public InterfaceC11863o0[] f28112a;

    /* renamed from: a */
    public final void m26305a(InterfaceC11863o0 interfaceC11863o0) {
        interfaceC11863o0.mo24848c(this);
        InterfaceC11863o0[] interfaceC11863o0ArrM26310g = m26310g();
        int iM26307c = m26307c();
        m26314k(iM26307c + 1);
        interfaceC11863o0ArrM26310g[iM26307c] = interfaceC11863o0;
        interfaceC11863o0.setIndex(iM26307c);
        m26316m(iM26307c);
    }

    /* renamed from: b */
    public final InterfaceC11863o0 m26306b() {
        InterfaceC11863o0[] interfaceC11863o0Arr = this.f28112a;
        if (interfaceC11863o0Arr != null) {
            return interfaceC11863o0Arr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m26307c() {
        return f28111b.get(this);
    }

    /* renamed from: e */
    public final boolean m26308e() {
        return m26307c() == 0;
    }

    /* renamed from: f */
    public final InterfaceC11863o0 m26309f() {
        InterfaceC11863o0 interfaceC11863o0M26306b;
        synchronized (this) {
            interfaceC11863o0M26306b = m26306b();
        }
        return interfaceC11863o0M26306b;
    }

    /* renamed from: g */
    public final InterfaceC11863o0[] m26310g() {
        InterfaceC11863o0[] interfaceC11863o0Arr = this.f28112a;
        if (interfaceC11863o0Arr == null) {
            InterfaceC11863o0[] interfaceC11863o0Arr2 = new InterfaceC11863o0[4];
            this.f28112a = interfaceC11863o0Arr2;
            return interfaceC11863o0Arr2;
        }
        if (m26307c() < interfaceC11863o0Arr.length) {
            return interfaceC11863o0Arr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC11863o0Arr, m26307c() * 2);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        InterfaceC11863o0[] interfaceC11863o0Arr3 = (InterfaceC11863o0[]) objArrCopyOf;
        this.f28112a = interfaceC11863o0Arr3;
        return interfaceC11863o0Arr3;
    }

    /* renamed from: h */
    public final boolean m26311h(InterfaceC11863o0 interfaceC11863o0) {
        boolean z10;
        synchronized (this) {
            if (interfaceC11863o0.mo24847b() == null) {
                z10 = false;
            } else {
                m26312i(interfaceC11863o0.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p410xd.InterfaceC11863o0 m26312i(int r6) {
        /*
            r5 = this;
            xd.o0[] r0 = r5.f28112a
            kotlin.jvm.internal.AbstractC9979u.m20291d(r0)
            int r1 = r5.m26307c()
            r2 = -1
            int r1 = r1 + r2
            r5.m26314k(r1)
            int r1 = r5.m26307c()
            if (r6 >= r1) goto L3d
            int r1 = r5.m26307c()
            r5.m26317n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.AbstractC9979u.m20291d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.AbstractC9979u.m20291d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m26317n(r6, r1)
            r5.m26316m(r1)
            goto L3d
        L3a:
            r5.m26315l(r6)
        L3d:
            int r6 = r5.m26307c()
            r6 = r0[r6]
            kotlin.jvm.internal.AbstractC9979u.m20291d(r6)
            r1 = 0
            r6.mo24848c(r1)
            r6.setIndex(r2)
            int r2 = r5.m26307c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p410xd.C11861n0.m26312i(int):xd.o0");
    }

    /* renamed from: j */
    public final InterfaceC11863o0 m26313j() {
        InterfaceC11863o0 interfaceC11863o0M26312i;
        synchronized (this) {
            interfaceC11863o0M26312i = m26307c() > 0 ? m26312i(0) : null;
        }
        return interfaceC11863o0M26312i;
    }

    /* renamed from: k */
    public final void m26314k(int i10) {
        f28111b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m26315l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.m26307c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            xd.o0[] r2 = r5.f28112a
            kotlin.jvm.internal.AbstractC9979u.m20291d(r2)
            int r0 = r0 + 2
            int r3 = r5.m26307c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.AbstractC9979u.m20291d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.AbstractC9979u.m20291d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.AbstractC9979u.m20291d(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.m26317n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410xd.C11861n0.m26315l(int):void");
    }

    /* renamed from: m */
    public final void m26316m(int i10) {
        while (i10 > 0) {
            InterfaceC11863o0[] interfaceC11863o0Arr = this.f28112a;
            AbstractC9979u.m20291d(interfaceC11863o0Arr);
            int i11 = (i10 - 1) / 2;
            InterfaceC11863o0 interfaceC11863o0 = interfaceC11863o0Arr[i11];
            AbstractC9979u.m20291d(interfaceC11863o0);
            InterfaceC11863o0 interfaceC11863o02 = interfaceC11863o0Arr[i10];
            AbstractC9979u.m20291d(interfaceC11863o02);
            if (((Comparable) interfaceC11863o0).compareTo(interfaceC11863o02) <= 0) {
                return;
            }
            m26317n(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: n */
    public final void m26317n(int i10, int i11) {
        InterfaceC11863o0[] interfaceC11863o0Arr = this.f28112a;
        AbstractC9979u.m20291d(interfaceC11863o0Arr);
        InterfaceC11863o0 interfaceC11863o0 = interfaceC11863o0Arr[i11];
        AbstractC9979u.m20291d(interfaceC11863o0);
        InterfaceC11863o0 interfaceC11863o02 = interfaceC11863o0Arr[i10];
        AbstractC9979u.m20291d(interfaceC11863o02);
        interfaceC11863o0Arr[i10] = interfaceC11863o0;
        interfaceC11863o0Arr[i11] = interfaceC11863o02;
        interfaceC11863o0.setIndex(i10);
        interfaceC11863o02.setIndex(i11);
    }
}
