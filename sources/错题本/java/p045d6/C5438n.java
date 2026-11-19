package p045d6;

import kotlin.jvm.internal.AbstractC5830k;
import p169t6.AbstractC6600a;

/* renamed from: d6.n */
/* loaded from: classes.dex */
public final class C5438n implements Comparable {

    /* renamed from: a */
    public final long f8400a;

    public /* synthetic */ C5438n(long j7) {
        this.f8400a = j7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC5830k.m5333j(this.f8400a ^ Long.MIN_VALUE, ((C5438n) obj).f8400a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5438n) {
            return this.f8400a == ((C5438n) obj).f8400a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8400a);
    }

    public final String toString() {
        return AbstractC6600a.m6248z(10, this.f8400a);
    }
}
