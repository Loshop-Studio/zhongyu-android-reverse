package p023b8;

/* renamed from: b8.b */
/* loaded from: classes4.dex */
public final class C3202b {

    /* renamed from: a */
    public C3201a[] f1735a;

    /* renamed from: b */
    public int f1736b;

    /* renamed from: c */
    public int f1737c;

    /* renamed from: d */
    public volatile int f1738d;

    /* renamed from: a */
    public final void m2137a(long j7, Class cls) {
        int i = ((((int) (j7 >>> 32)) ^ ((int) j7)) & Integer.MAX_VALUE) % this.f1736b;
        C3201a c3201a = this.f1735a[i];
        for (C3201a c3201a2 = c3201a; c3201a2 != null; c3201a2 = c3201a2.f1734c) {
            if (c3201a2.f1732a == j7) {
                c3201a2.f1733b = cls;
                return;
            }
        }
        this.f1735a[i] = new C3201a(j7, cls, c3201a);
        this.f1738d++;
        if (this.f1738d > this.f1737c) {
            int i8 = this.f1736b;
            int i9 = i8 * 2;
            C3201a[] c3201aArr = new C3201a[i9];
            for (C3201a c3201a3 : this.f1735a) {
                while (c3201a3 != null) {
                    long j8 = c3201a3.f1732a;
                    int i10 = ((((int) j8) ^ ((int) (j8 >>> 32))) & Integer.MAX_VALUE) % i9;
                    C3201a c3201a4 = c3201a3.f1734c;
                    c3201a3.f1734c = c3201aArr[i10];
                    c3201aArr[i10] = c3201a3;
                    c3201a3 = c3201a4;
                }
            }
            this.f1735a = c3201aArr;
            this.f1736b = i9;
            this.f1737c = (i8 * 8) / 3;
        }
    }
}
