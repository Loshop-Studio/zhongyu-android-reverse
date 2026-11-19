package p085f1;

/* renamed from: f1.i */
/* loaded from: classes.dex */
public class C2511i {

    /* renamed from: a */
    public final String f10142a;

    /* renamed from: b */
    public final int f10143b;

    public C2511i(String str, int i4) {
        this.f10142a = str;
        this.f10143b = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2511i)) {
            return false;
        }
        C2511i c2511i = (C2511i) obj;
        if (this.f10143b != c2511i.f10143b) {
            return false;
        }
        return this.f10142a.equals(c2511i.f10142a);
    }

    public int hashCode() {
        return (this.f10142a.hashCode() * 31) + this.f10143b;
    }
}
