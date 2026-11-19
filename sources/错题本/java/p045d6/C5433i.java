package p045d6;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: d6.i */
/* loaded from: classes.dex */
public final class C5433i implements Comparable {

    /* renamed from: a */
    public final byte f8393a;

    public /* synthetic */ C5433i(byte b6) {
        this.f8393a = b6;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC5830k.m5332i(this.f8393a & 255, ((C5433i) obj).f8393a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5433i) {
            return this.f8393a == ((C5433i) obj).f8393a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f8393a);
    }

    public final String toString() {
        return String.valueOf(this.f8393a & 255);
    }
}
