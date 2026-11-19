package p119n;

import coil3.decode.DataSource;
import coil3.decode.InterfaceC3275p;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: n.k */
/* loaded from: classes2.dex */
public final class C6206k implements InterfaceC6200e {

    /* renamed from: a */
    public final InterfaceC3275p f9922a;

    /* renamed from: b */
    public final String f9923b;

    /* renamed from: c */
    public final DataSource f9924c;

    public C6206k(InterfaceC3275p interfaceC3275p, String str, DataSource dataSource) {
        this.f9922a = interfaceC3275p;
        this.f9923b = str;
        this.f9924c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6206k)) {
            return false;
        }
        C6206k c6206k = (C6206k) obj;
        return AbstractC5830k.m5325b(this.f9922a, c6206k.f9922a) && AbstractC5830k.m5325b(this.f9923b, c6206k.f9923b) && this.f9924c == c6206k.f9924c;
    }

    public final int hashCode() {
        int iHashCode = this.f9922a.hashCode() * 31;
        String str = this.f9923b;
        return this.f9924c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f9922a + ", mimeType=" + this.f9923b + ", dataSource=" + this.f9924c + ')';
    }
}
