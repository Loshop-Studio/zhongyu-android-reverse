package p194p;

import coil3.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import p172n.InterfaceC8603r;

/* renamed from: p.p */
/* loaded from: classes3.dex */
public final class C8800p implements InterfaceC8794j {

    /* renamed from: a */
    public final InterfaceC8603r f14943a;

    /* renamed from: b */
    public final String f14944b;

    /* renamed from: c */
    public final DataSource f14945c;

    public C8800p(InterfaceC8603r interfaceC8603r, String str, DataSource dataSource) {
        this.f14943a = interfaceC8603r;
        this.f14944b = str;
        this.f14945c = dataSource;
    }

    /* renamed from: a */
    public final DataSource m14699a() {
        return this.f14945c;
    }

    /* renamed from: b */
    public final InterfaceC8603r m14700b() {
        return this.f14943a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8800p)) {
            return false;
        }
        C8800p c8800p = (C8800p) obj;
        return Intrinsics.areEqual(this.f14943a, c8800p.f14943a) && Intrinsics.areEqual(this.f14944b, c8800p.f14944b) && this.f14945c == c8800p.f14945c;
    }

    public int hashCode() {
        int iHashCode = this.f14943a.hashCode() * 31;
        String str = this.f14944b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f14945c.hashCode();
    }

    public String toString() {
        return "SourceFetchResult(source=" + this.f14943a + ", mimeType=" + this.f14944b + ", dataSource=" + this.f14945c + ')';
    }
}
