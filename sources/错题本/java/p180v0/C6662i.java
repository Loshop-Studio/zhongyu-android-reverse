package p180v0;

/* renamed from: v0.i */
/* loaded from: classes2.dex */
public final class C6662i {

    /* renamed from: a */
    public Class f11239a;

    /* renamed from: b */
    public Class f11240b;

    /* renamed from: c */
    public Class f11241c;

    public C6662i(Class cls, Class cls2, Class cls3) {
        this.f11239a = cls;
        this.f11240b = cls2;
        this.f11241c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6662i.class != obj.getClass()) {
            return false;
        }
        C6662i c6662i = (C6662i) obj;
        return this.f11239a.equals(c6662i.f11239a) && this.f11240b.equals(c6662i.f11240b) && AbstractC6664k.m6321a(this.f11241c, c6662i.f11241c);
    }

    public final int hashCode() {
        int iHashCode = (this.f11240b.hashCode() + (this.f11239a.hashCode() * 31)) * 31;
        Class cls = this.f11241c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f11239a + ", second=" + this.f11240b + '}';
    }
}
