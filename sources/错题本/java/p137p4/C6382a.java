package p137p4;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: p4.a */
/* loaded from: classes3.dex */
public final class C6382a {

    /* renamed from: a */
    public final long f10444a;

    /* renamed from: b */
    public final String f10445b;

    public C6382a(long j7, String name) {
        AbstractC5830k.m5330g(name, "name");
        this.f10444a = j7;
        this.f10445b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6382a)) {
            return false;
        }
        C6382a c6382a = (C6382a) obj;
        return this.f10444a == c6382a.f10444a && AbstractC5830k.m5325b(this.f10445b, c6382a.f10445b);
    }

    public final int hashCode() {
        return this.f10445b.hashCode() + (Long.hashCode(this.f10444a) * 31);
    }

    public final String toString() {
        return "FilterSubjectUiState(bookId=" + this.f10444a + ", name=" + this.f10445b + ")";
    }
}
