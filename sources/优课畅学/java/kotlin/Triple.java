package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class Triple<A, B, C> implements Serializable {

    /* renamed from: a */
    public final Object f17361a;

    /* renamed from: b */
    public final Object f17362b;

    /* renamed from: c */
    public final Object f17363c;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.f17361a = obj;
        this.f17362b = obj2;
        this.f17363c = obj3;
    }

    /* renamed from: a */
    public final Object m15917a() {
        return this.f17361a;
    }

    /* renamed from: b */
    public final Object m15918b() {
        return this.f17362b;
    }

    /* renamed from: c */
    public final Object m15919c() {
        return this.f17363c;
    }

    /* renamed from: d */
    public final Object m15920d() {
        return this.f17361a;
    }

    /* renamed from: e */
    public final Object m15921e() {
        return this.f17362b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return AbstractC9133u.m16128b(this.f17361a, triple.f17361a) && AbstractC9133u.m16128b(this.f17362b, triple.f17362b) && AbstractC9133u.m16128b(this.f17363c, triple.f17363c);
    }

    /* renamed from: g */
    public final Object m15922g() {
        return this.f17363c;
    }

    public int hashCode() {
        Object obj = this.f17361a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f17362b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f17363c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f17361a + ", " + this.f17362b + ", " + this.f17363c + ')';
    }
}
