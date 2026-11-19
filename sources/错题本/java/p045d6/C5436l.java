package p045d6;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: d6.l */
/* loaded from: classes.dex */
public final class C5436l implements Comparable {

    /* renamed from: a */
    public final int f8398a;

    public /* synthetic */ C5436l(int i) {
        this.f8398a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC5830k.m5332i(this.f8398a ^ Integer.MIN_VALUE, ((C5436l) obj).f8398a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5436l) {
            return this.f8398a == ((C5436l) obj).f8398a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8398a);
    }

    public final String toString() {
        return String.valueOf(this.f8398a & 4294967295L);
    }
}
