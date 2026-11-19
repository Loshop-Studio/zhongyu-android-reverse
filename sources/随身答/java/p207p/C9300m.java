package p207p;

import coil3.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import p151k.InterfaceC8239j;

/* renamed from: p.m */
/* loaded from: classes3.dex */
public final class C9300m implements InterfaceC9297j {

    /* renamed from: a */
    public final InterfaceC8239j f16101a;

    /* renamed from: b */
    public final boolean f16102b;

    /* renamed from: c */
    public final DataSource f16103c;

    public C9300m(InterfaceC8239j interfaceC8239j, boolean z9, DataSource dataSource) {
        this.f16101a = interfaceC8239j;
        this.f16102b = z9;
        this.f16103c = dataSource;
    }

    /* renamed from: a */
    public final DataSource m15142a() {
        return this.f16103c;
    }

    /* renamed from: b */
    public final InterfaceC8239j m15143b() {
        return this.f16101a;
    }

    /* renamed from: c */
    public final boolean m15144c() {
        return this.f16102b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9300m)) {
            return false;
        }
        C9300m c9300m = (C9300m) obj;
        return Intrinsics.areEqual(this.f16101a, c9300m.f16101a) && this.f16102b == c9300m.f16102b && this.f16103c == c9300m.f16103c;
    }

    public int hashCode() {
        return (((this.f16101a.hashCode() * 31) + Boolean.hashCode(this.f16102b)) * 31) + this.f16103c.hashCode();
    }

    public String toString() {
        return "ImageFetchResult(image=" + this.f16101a + ", isSampled=" + this.f16102b + ", dataSource=" + this.f16103c + ')';
    }
}
