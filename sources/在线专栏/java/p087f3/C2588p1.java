package p087f3;

import org.jetbrains.annotations.Nullable;

/* renamed from: f3.p1 */
/* loaded from: classes.dex */
public class C2588p1 extends C2600t1 implements InterfaceC2607w {

    /* renamed from: b */
    private final boolean f10276b;

    public C2588p1(@Nullable InterfaceC2578m1 interfaceC2578m1) {
        super(true);
        m8701R(interfaceC2578m1);
        this.f10276b = m8644t0();
    }

    /* renamed from: t0 */
    private final boolean m8644t0() {
        InterfaceC2589q interfaceC2589qM8699N = m8699N();
        C2592r c2592r = interfaceC2589qM8699N instanceof C2592r ? (C2592r) interfaceC2589qM8699N : null;
        if (c2592r == null) {
            return false;
        }
        C2600t1 c2600t1M8666t = c2592r.m8666t();
        while (!c2600t1M8666t.mo8645K()) {
            InterfaceC2589q interfaceC2589qM8699N2 = c2600t1M8666t.m8699N();
            C2592r c2592r2 = interfaceC2589qM8699N2 instanceof C2592r ? (C2592r) interfaceC2589qM8699N2 : null;
            if (c2592r2 == null) {
                return false;
            }
            c2600t1M8666t = c2592r2.m8666t();
        }
        return true;
    }

    @Override // p087f3.C2600t1
    /* renamed from: K */
    public boolean mo8645K() {
        return this.f10276b;
    }

    @Override // p087f3.C2600t1
    /* renamed from: L */
    public boolean mo8646L() {
        return true;
    }
}
