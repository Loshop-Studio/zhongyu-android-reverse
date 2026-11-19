package p310qd;

import kotlin.jvm.internal.AbstractC9979u;
import p265nd.C10405j;

/* renamed from: qd.i */
/* loaded from: classes6.dex */
public final class C10802i {

    /* renamed from: a */
    public final String f26074a;

    /* renamed from: b */
    public final C10405j f26075b;

    public C10802i(String value, C10405j range) {
        AbstractC9979u.m20294g(value, "value");
        AbstractC9979u.m20294g(range, "range");
        this.f26074a = value;
        this.f26075b = range;
    }

    /* renamed from: a */
    public final C10405j m23191a() {
        return this.f26075b;
    }

    /* renamed from: b */
    public final String m23192b() {
        return this.f26074a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10802i)) {
            return false;
        }
        C10802i c10802i = (C10802i) obj;
        return AbstractC9979u.m20289b(this.f26074a, c10802i.f26074a) && AbstractC9979u.m20289b(this.f26075b, c10802i.f26075b);
    }

    public int hashCode() {
        return (this.f26074a.hashCode() * 31) + this.f26075b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f26074a + ", range=" + this.f26075b + ')';
    }
}
