package p045d6;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: d6.q */
/* loaded from: classes.dex */
public final class C5441q implements Comparable {

    /* renamed from: a */
    public final short f8403a;

    public /* synthetic */ C5441q(short s8) {
        this.f8403a = s8;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC5830k.m5332i(this.f8403a & 65535, ((C5441q) obj).f8403a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5441q) {
            return this.f8403a == ((C5441q) obj).f8403a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f8403a);
    }

    public final String toString() {
        return String.valueOf(this.f8403a & 65535);
    }
}
