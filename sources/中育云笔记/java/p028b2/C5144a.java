package p028b2;

/* renamed from: b2.a */
/* loaded from: classes3.dex */
public final class C5144a {

    /* renamed from: a */
    public final long f2977a;

    /* renamed from: b */
    public final float f2978b;

    /* renamed from: c */
    public final float f2979c;

    public C5144a(long j10, float f10, float f11) {
        this.f2977a = j10;
        this.f2978b = f10;
        this.f2979c = f11;
    }

    /* renamed from: a */
    public final long m2661a() {
        return this.f2977a;
    }

    /* renamed from: b */
    public final float m2662b() {
        return this.f2978b;
    }

    /* renamed from: c */
    public final float m2663c() {
        return this.f2979c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5144a)) {
            return false;
        }
        C5144a c5144a = (C5144a) obj;
        return this.f2977a == c5144a.f2977a && Float.compare(this.f2978b, c5144a.f2978b) == 0 && Float.compare(this.f2979c, c5144a.f2979c) == 0;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f2977a) * 31) + Float.hashCode(this.f2978b)) * 31) + Float.hashCode(this.f2979c);
    }

    public String toString() {
        return "AutoFocus(time=" + this.f2977a + ", x=" + this.f2978b + ", y=" + this.f2979c + ")";
    }
}
