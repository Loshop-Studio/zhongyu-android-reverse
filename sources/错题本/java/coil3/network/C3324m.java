package coil3.network;

import androidx.collection.AbstractC0584a;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.network.m */
/* loaded from: classes2.dex */
public final class C3324m {

    /* renamed from: a */
    public final int f2024a;

    /* renamed from: b */
    public final long f2025b;

    /* renamed from: c */
    public final long f2026c;

    /* renamed from: d */
    public final C3322k f2027d;

    /* renamed from: e */
    public final C3325n f2028e;

    /* renamed from: f */
    public final Object f2029f;

    public C3324m(int i, long j7, long j8, C3322k c3322k, C3325n c3325n, Object obj) {
        this.f2024a = i;
        this.f2025b = j7;
        this.f2026c = j8;
        this.f2027d = c3322k;
        this.f2028e = c3325n;
        this.f2029f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3324m)) {
            return false;
        }
        C3324m c3324m = (C3324m) obj;
        return this.f2024a == c3324m.f2024a && this.f2025b == c3324m.f2025b && this.f2026c == c3324m.f2026c && AbstractC5830k.m5325b(this.f2027d, c3324m.f2027d) && AbstractC5830k.m5325b(this.f2028e, c3324m.f2028e) && AbstractC5830k.m5325b(this.f2029f, c3324m.f2029f);
    }

    public final int hashCode() {
        int iHashCode = (this.f2027d.f2019a.hashCode() + AbstractC0584a.m897B(this.f2026c, AbstractC0584a.m897B(this.f2025b, this.f2024a * 31, 31), 31)) * 31;
        C3325n c3325n = this.f2028e;
        int iHashCode2 = (iHashCode + (c3325n == null ? 0 : c3325n.f2030a.hashCode())) * 31;
        Object obj = this.f2029f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.f2024a + ", requestMillis=" + this.f2025b + ", responseMillis=" + this.f2026c + ", headers=" + this.f2027d + ", body=" + this.f2028e + ", delegate=" + this.f2029f + ')';
    }
}
