package p276w5;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w5.c */
/* loaded from: classes4.dex */
public final class C9761c {

    /* renamed from: a */
    public final String f17208a;

    /* renamed from: b */
    public final String f17209b;

    public C9761c(String name, String url) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f17208a = name;
        this.f17209b = url;
    }

    /* renamed from: a */
    public final String m16358a() {
        return this.f17208a;
    }

    /* renamed from: b */
    public final String m16359b() {
        return this.f17209b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9761c)) {
            return false;
        }
        C9761c c9761c = (C9761c) obj;
        return Intrinsics.areEqual(this.f17208a, c9761c.f17208a) && Intrinsics.areEqual(this.f17209b, c9761c.f17209b);
    }

    public int hashCode() {
        return (this.f17208a.hashCode() * 31) + this.f17209b.hashCode();
    }

    public String toString() {
        return "DetailDraftState(name=" + this.f17208a + ", url=" + this.f17209b + ")";
    }
}
