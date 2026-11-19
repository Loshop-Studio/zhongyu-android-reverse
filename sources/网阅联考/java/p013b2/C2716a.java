package p013b2;

/* renamed from: b2.a */
/* loaded from: classes2.dex */
public class C2716a {

    /* renamed from: a */
    public final String f461a;

    /* renamed from: b */
    public final boolean f462b;

    /* renamed from: c */
    public final boolean f463c;

    public C2716a(String str, boolean z3, boolean z4) {
        this.f461a = str;
        this.f462b = z3;
        this.f463c = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2716a c2716a = (C2716a) obj;
        if (this.f462b == c2716a.f462b && this.f463c == c2716a.f463c) {
            return this.f461a.equals(c2716a.f461a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f461a.hashCode() * 31) + (this.f462b ? 1 : 0)) * 31) + (this.f463c ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.f461a + "', granted=" + this.f462b + ", shouldShowRequestPermissionRationale=" + this.f463c + '}';
    }
}
