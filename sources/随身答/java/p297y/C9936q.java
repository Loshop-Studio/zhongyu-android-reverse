package p297y;

import coil3.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import p151k.InterfaceC8239j;
import p247t.InterfaceC9595d;

/* renamed from: y.q */
/* loaded from: classes3.dex */
public final class C9936q implements InterfaceC9929j {

    /* renamed from: a */
    public final InterfaceC8239j f17861a;

    /* renamed from: b */
    public final C9924e f17862b;

    /* renamed from: c */
    public final DataSource f17863c;

    /* renamed from: d */
    public final InterfaceC9595d.b f17864d;

    /* renamed from: e */
    public final String f17865e;

    /* renamed from: f */
    public final boolean f17866f;

    /* renamed from: g */
    public final boolean f17867g;

    public C9936q(InterfaceC8239j interfaceC8239j, C9924e c9924e, DataSource dataSource, InterfaceC9595d.b bVar, String str, boolean z9, boolean z10) {
        this.f17861a = interfaceC8239j;
        this.f17862b = c9924e;
        this.f17863c = dataSource;
        this.f17864d = bVar;
        this.f17865e = str;
        this.f17866f = z9;
        this.f17867g = z10;
    }

    @Override // p297y.InterfaceC9929j
    /* renamed from: a */
    public C9924e mo17012a() {
        return this.f17862b;
    }

    /* renamed from: b */
    public final DataSource m17119b() {
        return this.f17863c;
    }

    /* renamed from: c */
    public InterfaceC8239j m17120c() {
        return this.f17861a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9936q)) {
            return false;
        }
        C9936q c9936q = (C9936q) obj;
        return Intrinsics.areEqual(this.f17861a, c9936q.f17861a) && Intrinsics.areEqual(this.f17862b, c9936q.f17862b) && this.f17863c == c9936q.f17863c && Intrinsics.areEqual(this.f17864d, c9936q.f17864d) && Intrinsics.areEqual(this.f17865e, c9936q.f17865e) && this.f17866f == c9936q.f17866f && this.f17867g == c9936q.f17867g;
    }

    public int hashCode() {
        int iHashCode = ((((this.f17861a.hashCode() * 31) + this.f17862b.hashCode()) * 31) + this.f17863c.hashCode()) * 31;
        InterfaceC9595d.b bVar = this.f17864d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f17865e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f17866f)) * 31) + Boolean.hashCode(this.f17867g);
    }

    public String toString() {
        return "SuccessResult(image=" + this.f17861a + ", request=" + this.f17862b + ", dataSource=" + this.f17863c + ", memoryCacheKey=" + this.f17864d + ", diskCacheKey=" + this.f17865e + ", isSampled=" + this.f17866f + ", isPlaceholderCached=" + this.f17867g + ')';
    }
}
