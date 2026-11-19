package p113g8;

import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;

/* renamed from: g8.i */
/* loaded from: classes5.dex */
public final class C8670i {

    /* renamed from: a */
    public final String f16261a;

    /* renamed from: b */
    public final C8321f f16262b;

    public C8670i(String value, C8321f range) {
        AbstractC9133u.m16133g(value, "value");
        AbstractC9133u.m16133g(range, "range");
        this.f16261a = value;
        this.f16262b = range;
    }

    /* renamed from: a */
    public final C8321f m14052a() {
        return this.f16262b;
    }

    /* renamed from: b */
    public final String m14053b() {
        return this.f16261a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8670i)) {
            return false;
        }
        C8670i c8670i = (C8670i) obj;
        return AbstractC9133u.m16128b(this.f16261a, c8670i.f16261a) && AbstractC9133u.m16128b(this.f16262b, c8670i.f16262b);
    }

    public int hashCode() {
        return (this.f16261a.hashCode() * 31) + this.f16262b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f16261a + ", range=" + this.f16262b + ')';
    }
}
