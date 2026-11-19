package p150s1;

/* renamed from: s1.a */
/* loaded from: classes.dex */
public class C3376a {

    /* renamed from: a */
    public final String f11852a;

    /* renamed from: b */
    public final boolean f11853b;

    /* renamed from: c */
    public final boolean f11854c;

    C3376a(String str, boolean z3, boolean z4) {
        this.f11852a = str;
        this.f11853b = z3;
        this.f11854c = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3376a c3376a = (C3376a) obj;
        if (this.f11853b == c3376a.f11853b && this.f11854c == c3376a.f11854c) {
            return this.f11852a.equals(c3376a.f11852a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f11852a.hashCode() * 31) + (this.f11853b ? 1 : 0)) * 31) + (this.f11854c ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.f11852a + "', granted=" + this.f11853b + ", shouldShowRequestPermissionRationale=" + this.f11854c + '}';
    }
}
