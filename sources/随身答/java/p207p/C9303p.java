package p207p;

import coil3.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import p183n.InterfaceC9073r;

/* renamed from: p.p */
/* loaded from: classes3.dex */
public final class C9303p implements InterfaceC9297j {

    /* renamed from: a */
    public final InterfaceC9073r f16108a;

    /* renamed from: b */
    public final String f16109b;

    /* renamed from: c */
    public final DataSource f16110c;

    public C9303p(InterfaceC9073r interfaceC9073r, String str, DataSource dataSource) {
        this.f16108a = interfaceC9073r;
        this.f16109b = str;
        this.f16110c = dataSource;
    }

    /* renamed from: a */
    public final DataSource m15150a() {
        return this.f16110c;
    }

    /* renamed from: b */
    public final String m15151b() {
        return this.f16109b;
    }

    /* renamed from: c */
    public final InterfaceC9073r m15152c() {
        return this.f16108a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9303p)) {
            return false;
        }
        C9303p c9303p = (C9303p) obj;
        return Intrinsics.areEqual(this.f16108a, c9303p.f16108a) && Intrinsics.areEqual(this.f16109b, c9303p.f16109b) && this.f16110c == c9303p.f16110c;
    }

    public int hashCode() {
        int iHashCode = this.f16108a.hashCode() * 31;
        String str = this.f16109b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f16110c.hashCode();
    }

    public String toString() {
        return "SourceFetchResult(source=" + this.f16108a + ", mimeType=" + this.f16109b + ", dataSource=" + this.f16110c + ')';
    }
}
