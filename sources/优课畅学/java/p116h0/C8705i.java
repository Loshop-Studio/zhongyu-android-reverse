package p116h0;

/* renamed from: h0.i */
/* loaded from: classes3.dex */
public class C8705i {

    /* renamed from: a */
    public Class f16322a;

    /* renamed from: b */
    public Class f16323b;

    /* renamed from: c */
    public Class f16324c;

    public C8705i() {
    }

    /* renamed from: a */
    public void m14177a(Class cls, Class cls2, Class cls3) {
        this.f16322a = cls;
        this.f16323b = cls2;
        this.f16324c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8705i c8705i = (C8705i) obj;
        return this.f16322a.equals(c8705i.f16322a) && this.f16323b.equals(c8705i.f16323b) && AbstractC8707k.m14186d(this.f16324c, c8705i.f16324c);
    }

    public int hashCode() {
        int iHashCode = ((this.f16322a.hashCode() * 31) + this.f16323b.hashCode()) * 31;
        Class cls = this.f16324c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f16322a + ", second=" + this.f16323b + '}';
    }

    public C8705i(Class cls, Class cls2, Class cls3) {
        m14177a(cls, cls2, cls3);
    }
}
