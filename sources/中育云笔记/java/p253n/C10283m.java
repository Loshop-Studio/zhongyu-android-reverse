package p253n;

import coil3.decode.DataSource;
import kotlin.jvm.internal.AbstractC9979u;
import p212k.InterfaceC9756j;

/* renamed from: n.m */
/* loaded from: classes3.dex */
public final class C10283m implements InterfaceC10280j {

    /* renamed from: a */
    public final InterfaceC9756j f24472a;

    /* renamed from: b */
    public final boolean f24473b;

    /* renamed from: c */
    public final DataSource f24474c;

    public C10283m(InterfaceC9756j interfaceC9756j, boolean z10, DataSource dataSource) {
        this.f24472a = interfaceC9756j;
        this.f24473b = z10;
        this.f24474c = dataSource;
    }

    /* renamed from: a */
    public final DataSource m21410a() {
        return this.f24474c;
    }

    /* renamed from: b */
    public final InterfaceC9756j m21411b() {
        return this.f24472a;
    }

    /* renamed from: c */
    public final boolean m21412c() {
        return this.f24473b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10283m)) {
            return false;
        }
        C10283m c10283m = (C10283m) obj;
        return AbstractC9979u.m20289b(this.f24472a, c10283m.f24472a) && this.f24473b == c10283m.f24473b && this.f24474c == c10283m.f24474c;
    }

    public int hashCode() {
        return (((this.f24472a.hashCode() * 31) + Boolean.hashCode(this.f24473b)) * 31) + this.f24474c.hashCode();
    }

    public String toString() {
        return "ImageFetchResult(image=" + this.f24472a + ", isSampled=" + this.f24473b + ", dataSource=" + this.f24474c + ')';
    }
}
