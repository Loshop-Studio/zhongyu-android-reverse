package p214p6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p6.j */
/* loaded from: classes5.dex */
public final class C9335j {

    /* renamed from: a */
    public int f16206a;

    /* renamed from: b */
    public boolean f16207b;

    /* renamed from: c */
    public double f16208c;

    public C9335j(int i9, boolean z9, double d10) {
        this.f16206a = i9;
        this.f16207b = z9;
        this.f16208c = d10;
    }

    /* renamed from: a */
    public final boolean m15219a() {
        return this.f16207b;
    }

    /* renamed from: b */
    public final double m15220b() {
        return this.f16208c;
    }

    /* renamed from: c */
    public final int m15221c() {
        return this.f16206a;
    }

    /* renamed from: d */
    public final void m15222d() {
        this.f16206a = 0;
        this.f16207b = false;
        this.f16208c = 1.0d;
    }

    /* renamed from: e */
    public final void m15223e(boolean z9) {
        this.f16207b = z9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9335j)) {
            return false;
        }
        C9335j c9335j = (C9335j) obj;
        return this.f16206a == c9335j.f16206a && this.f16207b == c9335j.f16207b && Double.compare(this.f16208c, c9335j.f16208c) == 0;
    }

    /* renamed from: f */
    public final void m15224f(double d10) {
        this.f16208c = d10;
    }

    /* renamed from: g */
    public final void m15225g(int i9) {
        this.f16206a = i9;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f16206a) * 31) + Boolean.hashCode(this.f16207b)) * 31) + Double.hashCode(this.f16208c);
    }

    public String toString() {
        return "PlayInfo(videoProgress=" + this.f16206a + ", resumePlaying=" + this.f16207b + ", speedRate=" + this.f16208c + ")";
    }

    public /* synthetic */ C9335j(int i9, boolean z9, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i9, (i10 & 2) != 0 ? false : z9, (i10 & 4) != 0 ? 1.0d : d10);
    }
}
