package p073d4;

/* renamed from: d4.a */
/* loaded from: classes.dex */
public class C8289a {

    /* renamed from: a */
    public double f15694a;

    /* renamed from: b */
    public double f15695b;

    /* renamed from: c */
    public double f15696c;

    /* renamed from: d */
    public double f15697d;

    /* renamed from: e */
    public double f15698e;

    /* renamed from: f */
    public double f15699f;

    public C8289a() {
    }

    /* renamed from: a */
    public static C8289a m13460a(C8289a c8289a, C8289a c8289a2) {
        if (c8289a == null) {
            return c8289a2;
        }
        if (c8289a2 == null) {
            return c8289a;
        }
        double d10 = c8289a.f15694a;
        double d11 = c8289a2.f15694a;
        if (d10 >= d11) {
            d10 = d11;
        }
        double d12 = c8289a.f15695b;
        double d13 = c8289a2.f15695b;
        if (d12 >= d13) {
            d12 = d13;
        }
        double d14 = c8289a.f15696c;
        double d15 = c8289a2.f15696c;
        if (d14 <= d15) {
            d14 = d15;
        }
        double d16 = c8289a.f15697d;
        double d17 = c8289a2.f15697d;
        if (d16 <= d17) {
            d16 = d17;
        }
        return new C8289a(d10, d12, d14, d16);
    }

    public C8289a(double d10, double d11, double d12, double d13) {
        this.f15694a = d10;
        this.f15695b = d11;
        this.f15696c = d12;
        this.f15697d = d13;
        this.f15698e = d12 - d10;
        this.f15699f = d13 - d11;
    }
}
