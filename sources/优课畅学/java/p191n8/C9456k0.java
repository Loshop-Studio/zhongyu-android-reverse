package p191n8;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: n8.k0 */
/* loaded from: classes5.dex */
public class C9456k0 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18665b = AtomicIntegerFieldUpdater.newUpdater(C9456k0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a */
    public InterfaceC9458l0[] f18666a;

    /* renamed from: a */
    public final void m17357a(InterfaceC9458l0 interfaceC9458l0) {
        interfaceC9458l0.mo16769a(this);
        InterfaceC9458l0[] interfaceC9458l0ArrM17362g = m17362g();
        int iM17359c = m17359c();
        m17366k(iM17359c + 1);
        interfaceC9458l0ArrM17362g[iM17359c] = interfaceC9458l0;
        interfaceC9458l0.setIndex(iM17359c);
        m17368m(iM17359c);
    }

    /* renamed from: b */
    public final InterfaceC9458l0 m17358b() {
        InterfaceC9458l0[] interfaceC9458l0Arr = this.f18666a;
        if (interfaceC9458l0Arr != null) {
            return interfaceC9458l0Arr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m17359c() {
        return f18665b.get(this);
    }

    /* renamed from: e */
    public final boolean m17360e() {
        return m17359c() == 0;
    }

    /* renamed from: f */
    public final InterfaceC9458l0 m17361f() {
        InterfaceC9458l0 interfaceC9458l0M17358b;
        synchronized (this) {
            interfaceC9458l0M17358b = m17358b();
        }
        return interfaceC9458l0M17358b;
    }

    /* renamed from: g */
    public final InterfaceC9458l0[] m17362g() {
        InterfaceC9458l0[] interfaceC9458l0Arr = this.f18666a;
        if (interfaceC9458l0Arr == null) {
            InterfaceC9458l0[] interfaceC9458l0Arr2 = new InterfaceC9458l0[4];
            this.f18666a = interfaceC9458l0Arr2;
            return interfaceC9458l0Arr2;
        }
        if (m17359c() < interfaceC9458l0Arr.length) {
            return interfaceC9458l0Arr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC9458l0Arr, m17359c() * 2);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        InterfaceC9458l0[] interfaceC9458l0Arr3 = (InterfaceC9458l0[]) objArrCopyOf;
        this.f18666a = interfaceC9458l0Arr3;
        return interfaceC9458l0Arr3;
    }

    /* renamed from: h */
    public final boolean m17363h(InterfaceC9458l0 interfaceC9458l0) {
        boolean z10;
        synchronized (this) {
            if (interfaceC9458l0.mo16770c() == null) {
                z10 = false;
            } else {
                m17364i(interfaceC9458l0.getIndex());
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
    public final p191n8.InterfaceC9458l0 m17364i(int r6) {
        /*
            r5 = this;
            n8.l0[] r0 = r5.f18666a
            kotlin.jvm.internal.AbstractC9133u.m16130d(r0)
            int r1 = r5.m17359c()
            r2 = -1
            int r1 = r1 + r2
            r5.m17366k(r1)
            int r1 = r5.m17359c()
            if (r6 >= r1) goto L3d
            int r1 = r5.m17359c()
            r5.m17369n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.AbstractC9133u.m16130d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.AbstractC9133u.m16130d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m17369n(r6, r1)
            r5.m17368m(r1)
            goto L3d
        L3a:
            r5.m17367l(r6)
        L3d:
            int r6 = r5.m17359c()
            r6 = r0[r6]
            kotlin.jvm.internal.AbstractC9133u.m16130d(r6)
            r1 = 0
            r6.mo16769a(r1)
            r6.setIndex(r2)
            int r2 = r5.m17359c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p191n8.C9456k0.m17364i(int):n8.l0");
    }

    /* renamed from: j */
    public final InterfaceC9458l0 m17365j() {
        InterfaceC9458l0 interfaceC9458l0M17364i;
        synchronized (this) {
            interfaceC9458l0M17364i = m17359c() > 0 ? m17364i(0) : null;
        }
        return interfaceC9458l0M17364i;
    }

    /* renamed from: k */
    public final void m17366k(int i10) {
        f18665b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m17367l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.m17359c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            n8.l0[] r2 = r5.f18666a
            kotlin.jvm.internal.AbstractC9133u.m16130d(r2)
            int r0 = r0 + 2
            int r3 = r5.m17359c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.AbstractC9133u.m16130d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.AbstractC9133u.m16130d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.AbstractC9133u.m16130d(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.AbstractC9133u.m16130d(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.m17369n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: p191n8.C9456k0.m17367l(int):void");
    }

    /* renamed from: m */
    public final void m17368m(int i10) {
        while (i10 > 0) {
            InterfaceC9458l0[] interfaceC9458l0Arr = this.f18666a;
            AbstractC9133u.m16130d(interfaceC9458l0Arr);
            int i11 = (i10 - 1) / 2;
            InterfaceC9458l0 interfaceC9458l0 = interfaceC9458l0Arr[i11];
            AbstractC9133u.m16130d(interfaceC9458l0);
            InterfaceC9458l0 interfaceC9458l02 = interfaceC9458l0Arr[i10];
            AbstractC9133u.m16130d(interfaceC9458l02);
            if (((Comparable) interfaceC9458l0).compareTo(interfaceC9458l02) <= 0) {
                return;
            }
            m17369n(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: n */
    public final void m17369n(int i10, int i11) {
        InterfaceC9458l0[] interfaceC9458l0Arr = this.f18666a;
        AbstractC9133u.m16130d(interfaceC9458l0Arr);
        InterfaceC9458l0 interfaceC9458l0 = interfaceC9458l0Arr[i11];
        AbstractC9133u.m16130d(interfaceC9458l0);
        InterfaceC9458l0 interfaceC9458l02 = interfaceC9458l0Arr[i10];
        AbstractC9133u.m16130d(interfaceC9458l02);
        interfaceC9458l0Arr[i10] = interfaceC9458l0;
        interfaceC9458l0Arr[i11] = interfaceC9458l02;
        interfaceC9458l0.setIndex(i10);
        interfaceC9458l02.setIndex(i11);
    }
}
