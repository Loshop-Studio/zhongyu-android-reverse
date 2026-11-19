package p091e1;

/* renamed from: e1.h */
/* loaded from: classes3.dex */
public class C7836h {

    /* renamed from: a */
    public Class f13158a;

    /* renamed from: b */
    public Class f13159b;

    /* renamed from: c */
    public Class f13160c;

    public C7836h() {
    }

    /* renamed from: a */
    public void m12252a(Class cls, Class cls2, Class cls3) {
        this.f13158a = cls;
        this.f13159b = cls2;
        this.f13160c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7836h c7836h = (C7836h) obj;
        return this.f13158a.equals(c7836h.f13158a) && this.f13159b.equals(c7836h.f13159b) && AbstractC7838j.m12260c(this.f13160c, c7836h.f13160c);
    }

    public int hashCode() {
        int iHashCode = ((this.f13158a.hashCode() * 31) + this.f13159b.hashCode()) * 31;
        Class cls = this.f13160c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f13158a + ", second=" + this.f13159b + '}';
    }

    public C7836h(Class cls, Class cls2, Class cls3) {
        m12252a(cls, cls2, cls3);
    }
}
