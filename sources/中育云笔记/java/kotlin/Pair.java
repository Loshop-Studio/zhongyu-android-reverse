package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class Pair<A, B> implements Serializable {

    /* renamed from: c */
    public final Object f23261c;

    /* renamed from: d */
    public final Object f23262d;

    public Pair(Object obj, Object obj2) {
        this.f23261c = obj;
        this.f23262d = obj2;
    }

    /* renamed from: e */
    public static /* synthetic */ Pair m20047e(Pair pair, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = pair.f23261c;
        }
        if ((i10 & 2) != 0) {
            obj2 = pair.f23262d;
        }
        return pair.m20050d(obj, obj2);
    }

    /* renamed from: a */
    public final Object m20048a() {
        return this.f23261c;
    }

    /* renamed from: c */
    public final Object m20049c() {
        return this.f23262d;
    }

    /* renamed from: d */
    public final Pair m20050d(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return AbstractC9979u.m20289b(this.f23261c, pair.f23261c) && AbstractC9979u.m20289b(this.f23262d, pair.f23262d);
    }

    /* renamed from: f */
    public final Object m20051f() {
        return this.f23261c;
    }

    /* renamed from: g */
    public final Object m20052g() {
        return this.f23262d;
    }

    public int hashCode() {
        Object obj = this.f23261c;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f23262d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f23261c + ", " + this.f23262d + ')';
    }
}
