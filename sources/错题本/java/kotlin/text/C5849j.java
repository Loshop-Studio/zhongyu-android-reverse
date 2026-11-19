package kotlin.text;

import kotlin.jvm.internal.AbstractC5830k;
import p200x6.C6756f;

/* renamed from: kotlin.text.j */
/* loaded from: classes4.dex */
public final class C5849j {

    /* renamed from: a */
    public final String f9261a;

    /* renamed from: b */
    public final C6756f f9262b;

    public C5849j(String str, C6756f c6756f) {
        this.f9261a = str;
        this.f9262b = c6756f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5849j)) {
            return false;
        }
        C5849j c5849j = (C5849j) obj;
        return AbstractC5830k.m5325b(this.f9261a, c5849j.f9261a) && AbstractC5830k.m5325b(this.f9262b, c5849j.f9262b);
    }

    public final int hashCode() {
        return this.f9262b.hashCode() + (this.f9261a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f9261a + ", range=" + this.f9262b + ')';
    }
}
