package p062g0;

/* renamed from: g0.h */
/* loaded from: classes2.dex */
public class C3748h {

    /* renamed from: a */
    public Class f4393a;

    /* renamed from: b */
    public Class f4394b;

    /* renamed from: c */
    public Class f4395c;

    public C3748h() {
    }

    /* renamed from: a */
    public void m4764a(Class cls, Class cls2, Class cls3) {
        this.f4393a = cls;
        this.f4394b = cls2;
        this.f4395c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3748h c3748h = (C3748h) obj;
        return this.f4393a.equals(c3748h.f4393a) && this.f4394b.equals(c3748h.f4394b) && AbstractC3750j.m4772c(this.f4395c, c3748h.f4395c);
    }

    public int hashCode() {
        int iHashCode = ((this.f4393a.hashCode() * 31) + this.f4394b.hashCode()) * 31;
        Class cls = this.f4395c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f4393a + ", second=" + this.f4394b + '}';
    }

    public C3748h(Class cls, Class cls2, Class cls3) {
        m4764a(cls, cls2, cls3);
    }
}
