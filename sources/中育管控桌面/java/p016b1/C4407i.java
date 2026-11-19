package p016b1;

/* renamed from: b1.i */
/* loaded from: classes3.dex */
public class C4407i {

    /* renamed from: a */
    public Class f1265a;

    /* renamed from: b */
    public Class f1266b;

    /* renamed from: c */
    public Class f1267c;

    public C4407i() {
    }

    /* renamed from: a */
    public void m1434a(Class cls, Class cls2, Class cls3) {
        this.f1265a = cls;
        this.f1266b = cls2;
        this.f1267c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4407i c4407i = (C4407i) obj;
        return this.f1265a.equals(c4407i.f1265a) && this.f1266b.equals(c4407i.f1266b) && AbstractC4409k.m1443d(this.f1267c, c4407i.f1267c);
    }

    public int hashCode() {
        int iHashCode = ((this.f1265a.hashCode() * 31) + this.f1266b.hashCode()) * 31;
        Class cls = this.f1267c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f1265a + ", second=" + this.f1266b + '}';
    }

    public C4407i(Class cls, Class cls2, Class cls3) {
        m1434a(cls, cls2, cls3);
    }
}
