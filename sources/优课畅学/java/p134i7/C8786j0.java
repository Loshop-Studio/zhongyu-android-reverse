package p134i7;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.j0 */
/* loaded from: classes5.dex */
public final class C8786j0 {

    /* renamed from: a */
    public final int f16462a;

    /* renamed from: b */
    public final Object f16463b;

    public C8786j0(int i10, Object obj) {
        this.f16462a = i10;
        this.f16463b = obj;
    }

    /* renamed from: a */
    public final int m14584a() {
        return this.f16462a;
    }

    /* renamed from: b */
    public final Object m14585b() {
        return this.f16463b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8786j0)) {
            return false;
        }
        C8786j0 c8786j0 = (C8786j0) obj;
        return this.f16462a == c8786j0.f16462a && AbstractC9133u.m16128b(this.f16463b, c8786j0.f16463b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f16462a) * 31;
        Object obj = this.f16463b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f16462a + ", value=" + this.f16463b + ')';
    }
}
