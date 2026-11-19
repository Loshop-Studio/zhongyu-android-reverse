package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class Pair<A, B> implements Serializable {

    /* renamed from: a */
    public final Object f17348a;

    /* renamed from: b */
    public final Object f17349b;

    public Pair(Object obj, Object obj2) {
        this.f17348a = obj;
        this.f17349b = obj2;
    }

    /* renamed from: d */
    public static /* synthetic */ Pair m15902d(Pair pair, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = pair.f17348a;
        }
        if ((i10 & 2) != 0) {
            obj2 = pair.f17349b;
        }
        return pair.m15905c(obj, obj2);
    }

    /* renamed from: a */
    public final Object m15903a() {
        return this.f17348a;
    }

    /* renamed from: b */
    public final Object m15904b() {
        return this.f17349b;
    }

    /* renamed from: c */
    public final Pair m15905c(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    /* renamed from: e */
    public final Object m15906e() {
        return this.f17348a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return AbstractC9133u.m16128b(this.f17348a, pair.f17348a) && AbstractC9133u.m16128b(this.f17349b, pair.f17349b);
    }

    /* renamed from: g */
    public final Object m15907g() {
        return this.f17349b;
    }

    public int hashCode() {
        Object obj = this.f17348a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f17349b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f17348a + ", " + this.f17349b + ')';
    }
}
