package p124p;

import coil3.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import p110n.InterfaceC7435r;

/* renamed from: p.p */
/* loaded from: classes3.dex */
public final class C7587p implements InterfaceC7581j {

    /* renamed from: a */
    public final InterfaceC7435r f10043a;

    /* renamed from: b */
    public final String f10044b;

    /* renamed from: c */
    public final DataSource f10045c;

    public C7587p(InterfaceC7435r interfaceC7435r, String str, DataSource dataSource) {
        this.f10043a = interfaceC7435r;
        this.f10044b = str;
        this.f10045c = dataSource;
    }

    /* renamed from: a */
    public final DataSource m8991a() {
        return this.f10045c;
    }

    /* renamed from: b */
    public final InterfaceC7435r m8992b() {
        return this.f10043a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7587p)) {
            return false;
        }
        C7587p c7587p = (C7587p) obj;
        return Intrinsics.areEqual(this.f10043a, c7587p.f10043a) && Intrinsics.areEqual(this.f10044b, c7587p.f10044b) && this.f10045c == c7587p.f10045c;
    }

    public int hashCode() {
        int iHashCode = this.f10043a.hashCode() * 31;
        String str = this.f10044b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f10045c.hashCode();
    }

    public String toString() {
        return "SourceFetchResult(source=" + this.f10043a + ", mimeType=" + this.f10044b + ", dataSource=" + this.f10045c + ')';
    }
}
