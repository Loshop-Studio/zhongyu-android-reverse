package p249u;

import coil3.C5169c;
import coil3.network.C5209c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.j */
/* loaded from: classes3.dex */
public final class C9524j {

    /* renamed from: a */
    public final String f16622a;

    /* renamed from: b */
    public final String f16623b;

    /* renamed from: c */
    public final C5209c f16624c;

    /* renamed from: d */
    public final C5169c f16625d;

    public C9524j(String str, String str2, C5209c c5209c, InterfaceC9525k interfaceC9525k, C5169c c5169c) {
        this.f16622a = str;
        this.f16623b = str2;
        this.f16624c = c5209c;
        this.f16625d = c5169c;
    }

    /* renamed from: a */
    public final InterfaceC9525k m15885a() {
        return null;
    }

    /* renamed from: b */
    public final C5209c m15886b() {
        return this.f16624c;
    }

    /* renamed from: c */
    public final String m15887c() {
        return this.f16623b;
    }

    /* renamed from: d */
    public final String m15888d() {
        return this.f16622a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9524j)) {
            return false;
        }
        C9524j c9524j = (C9524j) obj;
        return Intrinsics.areEqual(this.f16622a, c9524j.f16622a) && Intrinsics.areEqual(this.f16623b, c9524j.f16623b) && Intrinsics.areEqual(this.f16624c, c9524j.f16624c) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f16625d, c9524j.f16625d);
    }

    public int hashCode() {
        return (((((this.f16622a.hashCode() * 31) + this.f16623b.hashCode()) * 31) + this.f16624c.hashCode()) * 961) + this.f16625d.hashCode();
    }

    public String toString() {
        return "NetworkRequest(url=" + this.f16622a + ", method=" + this.f16623b + ", headers=" + this.f16624c + ", body=" + ((Object) null) + ", extras=" + this.f16625d + ')';
    }
}
