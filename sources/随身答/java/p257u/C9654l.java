package p257u;

import coil3.network.C5344c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.l */
/* loaded from: classes3.dex */
public final class C9654l {

    /* renamed from: a */
    public final int f16996a;

    /* renamed from: b */
    public final long f16997b;

    /* renamed from: c */
    public final long f16998c;

    /* renamed from: d */
    public final C5344c f16999d;

    /* renamed from: e */
    public final InterfaceC9655m f17000e;

    /* renamed from: f */
    public final Object f17001f;

    public C9654l(int i9, long j9, long j10, C5344c c5344c, InterfaceC9655m interfaceC9655m, Object obj) {
        this.f16996a = i9;
        this.f16997b = j9;
        this.f16998c = j10;
        this.f16999d = c5344c;
        this.f17000e = interfaceC9655m;
        this.f17001f = obj;
    }

    /* renamed from: b */
    public static /* synthetic */ C9654l m15992b(C9654l c9654l, int i9, long j9, long j10, C5344c c5344c, InterfaceC9655m interfaceC9655m, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            i9 = c9654l.f16996a;
        }
        if ((i10 & 2) != 0) {
            j9 = c9654l.f16997b;
        }
        if ((i10 & 4) != 0) {
            j10 = c9654l.f16998c;
        }
        if ((i10 & 8) != 0) {
            c5344c = c9654l.f16999d;
        }
        if ((i10 & 16) != 0) {
            interfaceC9655m = c9654l.f17000e;
        }
        if ((i10 & 32) != 0) {
            obj = c9654l.f17001f;
        }
        Object obj3 = obj;
        C5344c c5344c2 = c5344c;
        long j11 = j10;
        return c9654l.m15993a(i9, j9, j11, c5344c2, interfaceC9655m, obj3);
    }

    /* renamed from: a */
    public final C9654l m15993a(int i9, long j9, long j10, C5344c c5344c, InterfaceC9655m interfaceC9655m, Object obj) {
        return new C9654l(i9, j9, j10, c5344c, interfaceC9655m, obj);
    }

    /* renamed from: c */
    public final InterfaceC9655m m15994c() {
        return this.f17000e;
    }

    /* renamed from: d */
    public final int m15995d() {
        return this.f16996a;
    }

    /* renamed from: e */
    public final C5344c m15996e() {
        return this.f16999d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9654l)) {
            return false;
        }
        C9654l c9654l = (C9654l) obj;
        return this.f16996a == c9654l.f16996a && this.f16997b == c9654l.f16997b && this.f16998c == c9654l.f16998c && Intrinsics.areEqual(this.f16999d, c9654l.f16999d) && Intrinsics.areEqual(this.f17000e, c9654l.f17000e) && Intrinsics.areEqual(this.f17001f, c9654l.f17001f);
    }

    /* renamed from: f */
    public final long m15997f() {
        return this.f16997b;
    }

    /* renamed from: g */
    public final long m15998g() {
        return this.f16998c;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f16996a * 31) + Long.hashCode(this.f16997b)) * 31) + Long.hashCode(this.f16998c)) * 31) + this.f16999d.hashCode()) * 31;
        InterfaceC9655m interfaceC9655m = this.f17000e;
        int iHashCode2 = (iHashCode + (interfaceC9655m == null ? 0 : interfaceC9655m.hashCode())) * 31;
        Object obj = this.f17001f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(code=" + this.f16996a + ", requestMillis=" + this.f16997b + ", responseMillis=" + this.f16998c + ", headers=" + this.f16999d + ", body=" + this.f17000e + ", delegate=" + this.f17001f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C9654l(int i9, long j9, long j10, C5344c c5344c, InterfaceC9655m interfaceC9655m, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj2;
        InterfaceC9655m interfaceC9655m2;
        C5344c c5344c2;
        i9 = (i10 & 1) != 0 ? 200 : i9;
        j9 = (i10 & 2) != 0 ? 0L : j9;
        j10 = (i10 & 4) != 0 ? 0L : j10;
        c5344c = (i10 & 8) != 0 ? C5344c.f3079c : c5344c;
        interfaceC9655m = (i10 & 16) != 0 ? null : interfaceC9655m;
        if ((i10 & 32) != 0) {
            obj2 = null;
            c5344c2 = c5344c;
            interfaceC9655m2 = interfaceC9655m;
        } else {
            obj2 = obj;
            interfaceC9655m2 = interfaceC9655m;
            c5344c2 = c5344c;
        }
        this(i9, j9, j10, c5344c2, interfaceC9655m2, obj2);
    }
}
