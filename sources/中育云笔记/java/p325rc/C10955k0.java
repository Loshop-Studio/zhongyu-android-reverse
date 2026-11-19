package p325rc;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.k0 */
/* loaded from: classes6.dex */
public final class C10955k0 {

    /* renamed from: a */
    public final int f26456a;

    /* renamed from: b */
    public final Object f26457b;

    public C10955k0(int i10, Object obj) {
        this.f26456a = i10;
        this.f26457b = obj;
    }

    /* renamed from: a */
    public final int m23962a() {
        return this.f26456a;
    }

    /* renamed from: b */
    public final Object m23963b() {
        return this.f26457b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10955k0)) {
            return false;
        }
        C10955k0 c10955k0 = (C10955k0) obj;
        return this.f26456a == c10955k0.f26456a && AbstractC9979u.m20289b(this.f26457b, c10955k0.f26457b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f26456a) * 31;
        Object obj = this.f26457b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f26456a + ", value=" + this.f26457b + ')';
    }
}
