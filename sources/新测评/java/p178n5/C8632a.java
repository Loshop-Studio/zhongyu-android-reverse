package p178n5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n5.a */
/* loaded from: classes4.dex */
public final class C8632a {

    /* renamed from: a */
    public final long f14294a;

    /* renamed from: b */
    public final long f14295b;

    /* renamed from: c */
    public final int f14296c;

    /* renamed from: d */
    public final String f14297d;

    /* renamed from: e */
    public final int f14298e;

    /* renamed from: f */
    public final int f14299f;

    /* renamed from: g */
    public final boolean f14300g;

    public C8632a(long j10, long j11, int i10, String extra, int i11, int i12, boolean z9) {
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.f14294a = j10;
        this.f14295b = j11;
        this.f14296c = i10;
        this.f14297d = extra;
        this.f14298e = i11;
        this.f14299f = i12;
        this.f14300g = z9;
    }

    /* renamed from: b */
    public static /* synthetic */ C8632a m14220b(C8632a c8632a, long j10, long j11, int i10, String str, int i11, int i12, boolean z9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j10 = c8632a.f14294a;
        }
        long j12 = j10;
        if ((i13 & 2) != 0) {
            j11 = c8632a.f14295b;
        }
        long j13 = j11;
        if ((i13 & 4) != 0) {
            i10 = c8632a.f14296c;
        }
        return c8632a.m14221a(j12, j13, i10, (i13 & 8) != 0 ? c8632a.f14297d : str, (i13 & 16) != 0 ? c8632a.f14298e : i11, (i13 & 32) != 0 ? c8632a.f14299f : i12, (i13 & 64) != 0 ? c8632a.f14300g : z9);
    }

    /* renamed from: a */
    public final C8632a m14221a(long j10, long j11, int i10, String extra, int i11, int i12, boolean z9) {
        Intrinsics.checkNotNullParameter(extra, "extra");
        return new C8632a(j10, j11, i10, extra, i11, i12, z9);
    }

    /* renamed from: c */
    public final int m14222c() {
        return this.f14299f;
    }

    /* renamed from: d */
    public final int m14223d() {
        return this.f14298e;
    }

    /* renamed from: e */
    public final String m14224e() {
        return this.f14297d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8632a)) {
            return false;
        }
        C8632a c8632a = (C8632a) obj;
        return this.f14294a == c8632a.f14294a && this.f14295b == c8632a.f14295b && this.f14296c == c8632a.f14296c && Intrinsics.areEqual(this.f14297d, c8632a.f14297d) && this.f14298e == c8632a.f14298e && this.f14299f == c8632a.f14299f && this.f14300g == c8632a.f14300g;
    }

    /* renamed from: f */
    public final boolean m14225f() {
        return this.f14300g;
    }

    /* renamed from: g */
    public final int m14226g() {
        return this.f14296c;
    }

    /* renamed from: h */
    public final long m14227h() {
        return this.f14295b;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.f14294a) * 31) + Long.hashCode(this.f14295b)) * 31) + Integer.hashCode(this.f14296c)) * 31) + this.f14297d.hashCode()) * 31) + Integer.hashCode(this.f14298e)) * 31) + Integer.hashCode(this.f14299f)) * 31) + Boolean.hashCode(this.f14300g);
    }

    /* renamed from: i */
    public final long m14228i() {
        return this.f14294a;
    }

    public String toString() {
        return "SubmitTask(userId=" + this.f14294a + ", taskId=" + this.f14295b + ", submitType=" + this.f14296c + ", extra=" + this.f14297d + ", commitState=" + this.f14298e + ", commitCount=" + this.f14299f + ", showFailWrong=" + this.f14300g + ")";
    }

    public /* synthetic */ C8632a(long j10, long j11, int i10, String str, int i11, int i12, boolean z9, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, i10, str, i11, i12, (i13 & 64) != 0 ? false : z9);
    }
}
