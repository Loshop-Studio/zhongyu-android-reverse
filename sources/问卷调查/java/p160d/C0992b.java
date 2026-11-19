package p160d;

import java.io.Serializable;
import p160d.p162f.p164b.C1011d;

/* renamed from: d.b */
/* loaded from: classes.dex */
public final class C0992b<A, B> implements Serializable {

    /* renamed from: b */
    public final A f5472b;

    /* renamed from: c */
    public final B f5473c;

    public C0992b(A a2, B b2) {
        this.f5472b = a2;
        this.f5473c = b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0992b)) {
            return false;
        }
        C0992b c0992b = (C0992b) obj;
        return C1011d.m2805a(this.f5472b, c0992b.f5472b) && C1011d.m2805a(this.f5473c, c0992b.f5473c);
    }

    public int hashCode() {
        A a2 = this.f5472b;
        int iHashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f5473c;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f5472b + ", " + this.f5473c + ')';
    }
}
