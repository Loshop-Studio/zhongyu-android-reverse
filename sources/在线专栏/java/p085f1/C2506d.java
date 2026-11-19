package p085f1;

/* renamed from: f1.d */
/* loaded from: classes.dex */
public class C2506d {

    /* renamed from: a */
    public String f10136a;

    /* renamed from: b */
    public Long f10137b;

    public C2506d(String str, boolean z3) {
        this(str, z3 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2506d)) {
            return false;
        }
        C2506d c2506d = (C2506d) obj;
        if (!this.f10136a.equals(c2506d.f10136a)) {
            return false;
        }
        Long l3 = this.f10137b;
        Long l4 = c2506d.f10137b;
        return l3 != null ? l3.equals(l4) : l4 == null;
    }

    public int hashCode() {
        int iHashCode = this.f10136a.hashCode() * 31;
        Long l3 = this.f10137b;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }

    public C2506d(String str, long j4) {
        this.f10136a = str;
        this.f10137b = Long.valueOf(j4);
    }
}
