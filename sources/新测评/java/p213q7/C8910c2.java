package p213q7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q7.c2 */
/* loaded from: classes5.dex */
public final class C8910c2 {

    /* renamed from: a */
    public final boolean f15235a;

    /* renamed from: b */
    public final boolean f15236b;

    /* renamed from: c */
    public final boolean f15237c;

    /* renamed from: d */
    public final boolean f15238d;

    /* renamed from: e */
    public final boolean f15239e;

    public C8910c2(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15235a = z9;
        this.f15236b = z10;
        this.f15237c = z11;
        this.f15238d = z12;
        this.f15239e = z13;
    }

    /* renamed from: a */
    public final C8910c2 m15028a(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        return new C8910c2(z9, z10, z11, z12, z13);
    }

    /* renamed from: b */
    public final boolean m15029b() {
        return this.f15239e;
    }

    /* renamed from: c */
    public final boolean m15030c() {
        return this.f15236b;
    }

    /* renamed from: d */
    public final boolean m15031d() {
        return this.f15237c;
    }

    /* renamed from: e */
    public final boolean m15032e() {
        return this.f15235a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8910c2)) {
            return false;
        }
        C8910c2 c8910c2 = (C8910c2) obj;
        return this.f15235a == c8910c2.f15235a && this.f15236b == c8910c2.f15236b && this.f15237c == c8910c2.f15237c && this.f15238d == c8910c2.f15238d && this.f15239e == c8910c2.f15239e;
    }

    /* renamed from: f */
    public final boolean m15033f() {
        return this.f15238d;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f15235a) * 31) + Boolean.hashCode(this.f15236b)) * 31) + Boolean.hashCode(this.f15237c)) * 31) + Boolean.hashCode(this.f15238d)) * 31) + Boolean.hashCode(this.f15239e);
    }

    public String toString() {
        return "SelectToolState(penSelected=" + this.f15235a + ", highlighterSelected=" + this.f15236b + ", imageSelected=" + this.f15237c + ", textSelected=" + this.f15238d + ", geometrySelected=" + this.f15239e + ")";
    }

    public /* synthetic */ C8910c2(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13);
    }
}
