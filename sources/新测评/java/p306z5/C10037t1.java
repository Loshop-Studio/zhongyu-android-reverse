package p306z5;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z5.t1 */
/* loaded from: classes4.dex */
public final class C10037t1 {

    /* renamed from: a */
    public final long f18041a;

    /* renamed from: b */
    public final String f18042b;

    public C10037t1(long j10, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f18041a = j10;
        this.f18042b = name;
    }

    /* renamed from: a */
    public final long m16896a() {
        return this.f18041a;
    }

    /* renamed from: b */
    public final String m16897b() {
        return this.f18042b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10037t1)) {
            return false;
        }
        C10037t1 c10037t1 = (C10037t1) obj;
        return this.f18041a == c10037t1.f18041a && Intrinsics.areEqual(this.f18042b, c10037t1.f18042b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f18041a) * 31) + this.f18042b.hashCode();
    }

    public String toString() {
        return "TopicData(id=" + this.f18041a + ", name=" + this.f18042b + ")";
    }
}
