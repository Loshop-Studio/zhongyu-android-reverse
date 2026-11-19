package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class Triple<A, B, C> implements Serializable {

    /* renamed from: c */
    public final Object f23274c;

    /* renamed from: d */
    public final Object f23275d;

    /* renamed from: e */
    public final Object f23276e;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.f23274c = obj;
        this.f23275d = obj2;
        this.f23276e = obj3;
    }

    /* renamed from: a */
    public final Object m20062a() {
        return this.f23274c;
    }

    /* renamed from: c */
    public final Object m20063c() {
        return this.f23275d;
    }

    /* renamed from: d */
    public final Object m20064d() {
        return this.f23276e;
    }

    /* renamed from: e */
    public final Object m20065e() {
        return this.f23274c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return AbstractC9979u.m20289b(this.f23274c, triple.f23274c) && AbstractC9979u.m20289b(this.f23275d, triple.f23275d) && AbstractC9979u.m20289b(this.f23276e, triple.f23276e);
    }

    /* renamed from: f */
    public final Object m20066f() {
        return this.f23275d;
    }

    /* renamed from: g */
    public final Object m20067g() {
        return this.f23276e;
    }

    public int hashCode() {
        Object obj = this.f23274c;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f23275d;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f23276e;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f23274c + ", " + this.f23275d + ", " + this.f23276e + ')';
    }
}
