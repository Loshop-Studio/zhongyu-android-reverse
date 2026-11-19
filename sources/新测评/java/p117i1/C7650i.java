package p117i1;

/* renamed from: i1.i */
/* loaded from: classes3.dex */
public class C7650i {

    /* renamed from: a */
    public Class f12898a;

    /* renamed from: b */
    public Class f12899b;

    /* renamed from: c */
    public Class f12900c;

    public C7650i() {
    }

    /* renamed from: a */
    public void m12679a(Class cls, Class cls2, Class cls3) {
        this.f12898a = cls;
        this.f12899b = cls2;
        this.f12900c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7650i c7650i = (C7650i) obj;
        return this.f12898a.equals(c7650i.f12898a) && this.f12899b.equals(c7650i.f12899b) && AbstractC7652k.m12688d(this.f12900c, c7650i.f12900c);
    }

    public int hashCode() {
        int iHashCode = ((this.f12898a.hashCode() * 31) + this.f12899b.hashCode()) * 31;
        Class cls = this.f12900c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f12898a + ", second=" + this.f12899b + '}';
    }

    public C7650i(Class cls, Class cls2, Class cls3) {
        m12679a(cls, cls2, cls3);
    }
}
