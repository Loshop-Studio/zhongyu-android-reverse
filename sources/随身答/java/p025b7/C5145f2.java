package p025b7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b7.f2 */
/* loaded from: classes5.dex */
public final class C5145f2 {

    /* renamed from: a */
    public final boolean f2293a;

    /* renamed from: b */
    public final boolean f2294b;

    /* renamed from: c */
    public final boolean f2295c;

    /* renamed from: d */
    public final boolean f2296d;

    /* renamed from: e */
    public final boolean f2297e;

    public C5145f2(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f2293a = z9;
        this.f2294b = z10;
        this.f2295c = z11;
        this.f2296d = z12;
        this.f2297e = z13;
    }

    /* renamed from: a */
    public final C5145f2 m2231a(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        return new C5145f2(z9, z10, z11, z12, z13);
    }

    /* renamed from: b */
    public final boolean m2232b() {
        return this.f2297e;
    }

    /* renamed from: c */
    public final boolean m2233c() {
        return this.f2294b;
    }

    /* renamed from: d */
    public final boolean m2234d() {
        return this.f2295c;
    }

    /* renamed from: e */
    public final boolean m2235e() {
        return this.f2293a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5145f2)) {
            return false;
        }
        C5145f2 c5145f2 = (C5145f2) obj;
        return this.f2293a == c5145f2.f2293a && this.f2294b == c5145f2.f2294b && this.f2295c == c5145f2.f2295c && this.f2296d == c5145f2.f2296d && this.f2297e == c5145f2.f2297e;
    }

    /* renamed from: f */
    public final boolean m2236f() {
        return this.f2296d;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f2293a) * 31) + Boolean.hashCode(this.f2294b)) * 31) + Boolean.hashCode(this.f2295c)) * 31) + Boolean.hashCode(this.f2296d)) * 31) + Boolean.hashCode(this.f2297e);
    }

    public String toString() {
        return "SelectToolState(penSelected=" + this.f2293a + ", highlighterSelected=" + this.f2294b + ", imageSelected=" + this.f2295c + ", textSelected=" + this.f2296d + ", geometrySelected=" + this.f2297e + ")";
    }

    public /* synthetic */ C5145f2(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, (i9 & 4) != 0 ? false : z11, (i9 & 8) != 0 ? false : z12, (i9 & 16) != 0 ? false : z13);
    }
}
