package p124p;

import coil3.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import p087k.InterfaceC6611j;

/* renamed from: p.m */
/* loaded from: classes3.dex */
public final class C7584m implements InterfaceC7581j {

    /* renamed from: a */
    public final InterfaceC6611j f10036a;

    /* renamed from: b */
    public final boolean f10037b;

    /* renamed from: c */
    public final DataSource f10038c;

    public C7584m(InterfaceC6611j interfaceC6611j, boolean z6, DataSource dataSource) {
        this.f10036a = interfaceC6611j;
        this.f10037b = z6;
        this.f10038c = dataSource;
    }

    /* renamed from: a */
    public final DataSource m8983a() {
        return this.f10038c;
    }

    /* renamed from: b */
    public final InterfaceC6611j m8984b() {
        return this.f10036a;
    }

    /* renamed from: c */
    public final boolean m8985c() {
        return this.f10037b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7584m)) {
            return false;
        }
        C7584m c7584m = (C7584m) obj;
        return Intrinsics.areEqual(this.f10036a, c7584m.f10036a) && this.f10037b == c7584m.f10037b && this.f10038c == c7584m.f10038c;
    }

    public int hashCode() {
        return (((this.f10036a.hashCode() * 31) + Boolean.hashCode(this.f10037b)) * 31) + this.f10038c.hashCode();
    }

    public String toString() {
        return "ImageFetchResult(image=" + this.f10036a + ", isSampled=" + this.f10037b + ", dataSource=" + this.f10038c + ')';
    }
}
