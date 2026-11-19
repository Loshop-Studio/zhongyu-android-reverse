package p109d1;

/* renamed from: d1.i */
/* loaded from: classes3.dex */
public class C8908i {

    /* renamed from: a */
    public Class f20880a;

    /* renamed from: b */
    public Class f20881b;

    /* renamed from: c */
    public Class f20882c;

    public C8908i() {
    }

    /* renamed from: a */
    public void m17464a(Class cls, Class cls2, Class cls3) {
        this.f20880a = cls;
        this.f20881b = cls2;
        this.f20882c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8908i c8908i = (C8908i) obj;
        return this.f20880a.equals(c8908i.f20880a) && this.f20881b.equals(c8908i.f20881b) && AbstractC8910k.m17473d(this.f20882c, c8908i.f20882c);
    }

    public int hashCode() {
        int iHashCode = ((this.f20880a.hashCode() * 31) + this.f20881b.hashCode()) * 31;
        Class cls = this.f20882c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f20880a + ", second=" + this.f20881b + '}';
    }

    public C8908i(Class cls, Class cls2, Class cls3) {
        m17464a(cls, cls2, cls3);
    }
}
