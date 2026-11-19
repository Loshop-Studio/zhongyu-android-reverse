package p257u;

import coil3.C5304c;
import coil3.network.C5344c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.j */
/* loaded from: classes3.dex */
public final class C9652j {

    /* renamed from: a */
    public final String f16992a;

    /* renamed from: b */
    public final String f16993b;

    /* renamed from: c */
    public final C5344c f16994c;

    /* renamed from: d */
    public final C5304c f16995d;

    public C9652j(String str, String str2, C5344c c5344c, InterfaceC9653k interfaceC9653k, C5304c c5304c) {
        this.f16992a = str;
        this.f16993b = str2;
        this.f16994c = c5344c;
        this.f16995d = c5304c;
    }

    /* renamed from: a */
    public final InterfaceC9653k m15988a() {
        return null;
    }

    /* renamed from: b */
    public final C5344c m15989b() {
        return this.f16994c;
    }

    /* renamed from: c */
    public final String m15990c() {
        return this.f16993b;
    }

    /* renamed from: d */
    public final String m15991d() {
        return this.f16992a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9652j)) {
            return false;
        }
        C9652j c9652j = (C9652j) obj;
        return Intrinsics.areEqual(this.f16992a, c9652j.f16992a) && Intrinsics.areEqual(this.f16993b, c9652j.f16993b) && Intrinsics.areEqual(this.f16994c, c9652j.f16994c) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f16995d, c9652j.f16995d);
    }

    public int hashCode() {
        return (((((this.f16992a.hashCode() * 31) + this.f16993b.hashCode()) * 31) + this.f16994c.hashCode()) * 961) + this.f16995d.hashCode();
    }

    public String toString() {
        return "NetworkRequest(url=" + this.f16992a + ", method=" + this.f16993b + ", headers=" + this.f16994c + ", body=" + ((Object) null) + ", extras=" + this.f16995d + ')';
    }
}
