package kotlin.collections;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlin.collections.a0 */
/* loaded from: classes2.dex */
public final class C5776a0 {

    /* renamed from: a */
    public final int f9163a;

    /* renamed from: b */
    public final Object f9164b;

    public C5776a0(int i, Object obj) {
        this.f9163a = i;
        this.f9164b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5776a0)) {
            return false;
        }
        C5776a0 c5776a0 = (C5776a0) obj;
        return this.f9163a == c5776a0.f9163a && AbstractC5830k.m5325b(this.f9164b, c5776a0.f9164b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f9163a) * 31;
        Object obj = this.f9164b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f9163a + ", value=" + this.f9164b + ')';
    }
}
