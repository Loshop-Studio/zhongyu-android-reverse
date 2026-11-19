package p011b0;

/* renamed from: b0.d */
/* loaded from: classes.dex */
public class C1021d<F, S> {

    /* renamed from: a */
    public final F f5698a;

    /* renamed from: b */
    public final S f5699b;

    public C1021d(F f4, S s3) {
        this.f5698a = f4;
        this.f5699b = s3;
    }

    /* renamed from: a */
    public static <A, B> C1021d<A, B> m4775a(A a4, B b4) {
        return new C1021d<>(a4, b4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1021d)) {
            return false;
        }
        C1021d c1021d = (C1021d) obj;
        return C1020c.m4773a(c1021d.f5698a, this.f5698a) && C1020c.m4773a(c1021d.f5699b, this.f5699b);
    }

    public int hashCode() {
        F f4 = this.f5698a;
        int iHashCode = f4 == null ? 0 : f4.hashCode();
        S s3 = this.f5699b;
        return iHashCode ^ (s3 != null ? s3.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f5698a + " " + this.f5699b + "}";
    }
}
