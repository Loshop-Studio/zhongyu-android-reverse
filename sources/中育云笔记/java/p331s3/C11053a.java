package p331s3;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: s3.a */
/* loaded from: classes4.dex */
public final class C11053a {

    /* renamed from: a */
    public int f26678a;

    /* renamed from: b */
    public int f26679b;

    /* renamed from: c */
    public String f26680c;

    /* renamed from: d */
    public boolean f26681d;

    public C11053a(int i10, int i11, String label, boolean z10) {
        AbstractC9979u.m20294g(label, "label");
        this.f26678a = i10;
        this.f26679b = i11;
        this.f26680c = label;
        this.f26681d = z10;
    }

    /* renamed from: a */
    public final boolean m24508a() {
        return this.f26681d;
    }

    /* renamed from: b */
    public final String m24509b() {
        return this.f26680c;
    }

    /* renamed from: c */
    public final int m24510c() {
        return this.f26679b;
    }

    /* renamed from: d */
    public final int m24511d() {
        return this.f26678a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11053a)) {
            return false;
        }
        C11053a c11053a = (C11053a) obj;
        return this.f26678a == c11053a.f26678a && this.f26679b == c11053a.f26679b && AbstractC9979u.m20289b(this.f26680c, c11053a.f26680c) && this.f26681d == c11053a.f26681d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f26678a) * 31) + Integer.hashCode(this.f26679b)) * 31) + this.f26680c.hashCode()) * 31) + Boolean.hashCode(this.f26681d);
    }

    public String toString() {
        return "MosTabHost(selectIcon=" + this.f26678a + ", normalIcon=" + this.f26679b + ", label=" + this.f26680c + ", connect=" + this.f26681d + ")";
    }
}
