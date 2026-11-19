package p380w;

import coil3.decode.DataSource;
import kotlin.jvm.internal.AbstractC9979u;
import p212k.InterfaceC9756j;
import p312r.InterfaceC10825d;

/* renamed from: w.r */
/* loaded from: classes3.dex */
public final class C11638r implements InterfaceC11631k {

    /* renamed from: a */
    public final InterfaceC9756j f27636a;

    /* renamed from: b */
    public final C11627g f27637b;

    /* renamed from: c */
    public final DataSource f27638c;

    /* renamed from: d */
    public final InterfaceC10825d.b f27639d;

    /* renamed from: e */
    public final String f27640e;

    /* renamed from: f */
    public final boolean f27641f;

    /* renamed from: g */
    public final boolean f27642g;

    public C11638r(InterfaceC9756j interfaceC9756j, C11627g c11627g, DataSource dataSource, InterfaceC10825d.b bVar, String str, boolean z10, boolean z11) {
        this.f27636a = interfaceC9756j;
        this.f27637b = c11627g;
        this.f27638c = dataSource;
        this.f27639d = bVar;
        this.f27640e = str;
        this.f27641f = z10;
        this.f27642g = z11;
    }

    @Override // p380w.InterfaceC11631k
    /* renamed from: a */
    public C11627g mo25641a() {
        return this.f27637b;
    }

    /* renamed from: b */
    public final DataSource m25754b() {
        return this.f27638c;
    }

    /* renamed from: c */
    public InterfaceC9756j m25755c() {
        return this.f27636a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11638r)) {
            return false;
        }
        C11638r c11638r = (C11638r) obj;
        return AbstractC9979u.m20289b(this.f27636a, c11638r.f27636a) && AbstractC9979u.m20289b(this.f27637b, c11638r.f27637b) && this.f27638c == c11638r.f27638c && AbstractC9979u.m20289b(this.f27639d, c11638r.f27639d) && AbstractC9979u.m20289b(this.f27640e, c11638r.f27640e) && this.f27641f == c11638r.f27641f && this.f27642g == c11638r.f27642g;
    }

    public int hashCode() {
        int iHashCode = ((((this.f27636a.hashCode() * 31) + this.f27637b.hashCode()) * 31) + this.f27638c.hashCode()) * 31;
        InterfaceC10825d.b bVar = this.f27639d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f27640e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f27641f)) * 31) + Boolean.hashCode(this.f27642g);
    }

    public String toString() {
        return "SuccessResult(image=" + this.f27636a + ", request=" + this.f27637b + ", dataSource=" + this.f27638c + ", memoryCacheKey=" + this.f27639d + ", diskCacheKey=" + this.f27640e + ", isSampled=" + this.f27641f + ", isPlaceholderCached=" + this.f27642g + ')';
    }
}
