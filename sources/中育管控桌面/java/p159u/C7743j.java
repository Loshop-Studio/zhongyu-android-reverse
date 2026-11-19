package p159u;

import coil3.C4550c;
import coil3.network.C4590c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.j */
/* loaded from: classes3.dex */
public final class C7743j {

    /* renamed from: a */
    public final String f10232a;

    /* renamed from: b */
    public final String f10233b;

    /* renamed from: c */
    public final C4590c f10234c;

    /* renamed from: d */
    public final C4550c f10235d;

    public C7743j(String str, String str2, C4590c c4590c, InterfaceC7744k interfaceC7744k, C4550c c4550c) {
        this.f10232a = str;
        this.f10233b = str2;
        this.f10234c = c4590c;
        this.f10235d = c4550c;
    }

    /* renamed from: a */
    public final InterfaceC7744k m9235a() {
        return null;
    }

    /* renamed from: b */
    public final C4590c m9236b() {
        return this.f10234c;
    }

    /* renamed from: c */
    public final String m9237c() {
        return this.f10233b;
    }

    /* renamed from: d */
    public final String m9238d() {
        return this.f10232a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7743j)) {
            return false;
        }
        C7743j c7743j = (C7743j) obj;
        return Intrinsics.areEqual(this.f10232a, c7743j.f10232a) && Intrinsics.areEqual(this.f10233b, c7743j.f10233b) && Intrinsics.areEqual(this.f10234c, c7743j.f10234c) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f10235d, c7743j.f10235d);
    }

    public int hashCode() {
        return (((((this.f10232a.hashCode() * 31) + this.f10233b.hashCode()) * 31) + this.f10234c.hashCode()) * 961) + this.f10235d.hashCode();
    }

    public String toString() {
        return "NetworkRequest(url=" + this.f10232a + ", method=" + this.f10233b + ", headers=" + this.f10234c + ", body=" + ((Object) null) + ", extras=" + this.f10235d + ')';
    }
}
