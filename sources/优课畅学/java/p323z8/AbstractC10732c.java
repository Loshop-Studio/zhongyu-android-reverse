package p323z8;

/* renamed from: z8.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10732c {

    /* renamed from: B */
    public String f21284B;

    /* renamed from: C */
    public boolean f21285C;

    /* renamed from: D */
    public C10734e f21286D;

    /* renamed from: K */
    public boolean f21293K;

    /* renamed from: a */
    public long f21294a;

    /* renamed from: b */
    public long f21295b;

    /* renamed from: c */
    public CharSequence f21296c;

    /* renamed from: d */
    public String[] f21297d;

    /* renamed from: e */
    public Object f21298e;

    /* renamed from: f */
    public int f21299f;

    /* renamed from: g */
    public float f21300g;

    /* renamed from: h */
    public float f21301h;

    /* renamed from: i */
    public int f21302i;

    /* renamed from: q */
    public C10735f f21310q;

    /* renamed from: r */
    public int f21311r;

    /* renamed from: s */
    public int f21312s;

    /* renamed from: x */
    public InterfaceC10743n f21317x;

    /* renamed from: y */
    public boolean f21318y;

    /* renamed from: z */
    public boolean f21319z;

    /* renamed from: j */
    public int f21303j = 0;

    /* renamed from: k */
    public float f21304k = -1.0f;

    /* renamed from: l */
    public int f21305l = 0;

    /* renamed from: m */
    public int f21306m = 0;

    /* renamed from: n */
    public byte f21307n = 0;

    /* renamed from: o */
    public float f21308o = -1.0f;

    /* renamed from: p */
    public float f21309p = -1.0f;

    /* renamed from: t */
    public int f21313t = 0;

    /* renamed from: u */
    public int f21314u = 0;

    /* renamed from: v */
    public int f21315v = 0;

    /* renamed from: w */
    public int f21316w = -1;

    /* renamed from: A */
    public int f21283A = 0;

    /* renamed from: E */
    public int f21287E = AbstractC10731b.f21281a;

    /* renamed from: F */
    public int f21288F = 0;

    /* renamed from: G */
    public int f21289G = -1;

    /* renamed from: H */
    public C10738i f21290H = null;

    /* renamed from: I */
    public int f21291I = 0;

    /* renamed from: J */
    public int f21292J = -1;

    /* renamed from: A */
    public void m20038A(InterfaceC10742m interfaceC10742m, boolean z10) {
        interfaceC10742m.mo135l(this, z10);
        this.f21316w = this.f21290H.f21336f;
    }

    /* renamed from: B */
    public void m20039B(long j10) {
        this.f21294a = j10;
        this.f21295b = 0L;
    }

    /* renamed from: C */
    public void m20040C(C10734e c10734e) {
        this.f21286D = c10734e;
    }

    /* renamed from: D */
    public void m20041D(boolean z10) {
        if (!z10) {
            this.f21312s = 0;
        } else {
            this.f21313t = this.f21290H.f21332b;
            this.f21312s = 1;
        }
    }

    /* renamed from: a */
    public int m20042a(InterfaceC10742m interfaceC10742m) {
        return interfaceC10742m.mo128e(this);
    }

    /* renamed from: b */
    public long m20043b() {
        C10738i c10738i = this.f21290H;
        return (c10738i == null || c10738i.f21335e != this.f21315v) ? this.f21294a : this.f21294a + this.f21295b;
    }

    /* renamed from: c */
    public int m20044c() {
        return this.f21287E;
    }

    /* renamed from: d */
    public abstract float mo20045d();

    /* renamed from: e */
    public InterfaceC10743n m20046e() {
        return this.f21317x;
    }

    /* renamed from: f */
    public long m20047f() {
        return this.f21310q.f21324c;
    }

    /* renamed from: g */
    public abstract float mo20048g();

    /* renamed from: h */
    public abstract float[] mo20049h(InterfaceC10742m interfaceC10742m, long j10);

    /* renamed from: i */
    public abstract float mo20050i();

    /* renamed from: j */
    public long m20051j() {
        return this.f21294a;
    }

    /* renamed from: k */
    public C10734e m20052k() {
        return this.f21286D;
    }

    /* renamed from: l */
    public abstract float mo20053l();

    /* renamed from: m */
    public abstract int mo20054m();

    /* renamed from: n */
    public boolean m20055n() {
        if (this.f21289G == this.f21290H.f21333c) {
            return true;
        }
        this.f21288F = 0;
        return false;
    }

    /* renamed from: o */
    public boolean m20056o() {
        return this.f21289G == this.f21290H.f21333c && this.f21288F != 0;
    }

    /* renamed from: p */
    public boolean m20057p() {
        C10734e c10734e = this.f21286D;
        return c10734e == null || c10734e.f21320a < m20043b();
    }

    /* renamed from: q */
    public boolean m20058q() {
        return this.f21308o > -1.0f && this.f21309p > -1.0f && this.f21314u == this.f21290H.f21331a;
    }

    /* renamed from: r */
    public boolean m20059r() {
        C10738i c10738i = this.f21290H;
        if (c10738i == null || c10738i.f21335e != this.f21315v) {
            return false;
        }
        return this.f21293K;
    }

    /* renamed from: s */
    public boolean m20060s() {
        C10734e c10734e = this.f21286D;
        return c10734e == null || m20061t(c10734e.f21320a);
    }

    /* renamed from: t */
    public boolean m20061t(long j10) {
        long jM20043b = j10 - m20043b();
        return jM20043b <= 0 || jM20043b >= this.f21310q.f21324c;
    }

    /* renamed from: u */
    public boolean m20062u() {
        return this.f21316w == this.f21290H.f21336f;
    }

    /* renamed from: v */
    public boolean mo20063v() {
        return this.f21312s == 1 && this.f21313t == this.f21290H.f21332b;
    }

    /* renamed from: w */
    public boolean m20064w() {
        C10734e c10734e = this.f21286D;
        return c10734e == null || m20065x(c10734e.f21320a);
    }

    /* renamed from: x */
    public boolean m20065x(long j10) {
        return j10 - m20043b() >= this.f21310q.f21324c;
    }

    /* renamed from: y */
    public abstract void mo20066y(InterfaceC10742m interfaceC10742m, float f10, float f11);

    /* renamed from: z */
    public void mo20067z(InterfaceC10742m interfaceC10742m, boolean z10) {
        interfaceC10742m.mo125b(this, z10);
        this.f21314u = this.f21290H.f21331a;
    }
}
