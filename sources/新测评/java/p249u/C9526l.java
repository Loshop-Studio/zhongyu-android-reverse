package p249u;

import coil3.network.C5209c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.l */
/* loaded from: classes3.dex */
public final class C9526l {

    /* renamed from: a */
    public final int f16626a;

    /* renamed from: b */
    public final long f16627b;

    /* renamed from: c */
    public final long f16628c;

    /* renamed from: d */
    public final C5209c f16629d;

    /* renamed from: e */
    public final InterfaceC9527m f16630e;

    /* renamed from: f */
    public final Object f16631f;

    public C9526l(int i10, long j10, long j11, C5209c c5209c, InterfaceC9527m interfaceC9527m, Object obj) {
        this.f16626a = i10;
        this.f16627b = j10;
        this.f16628c = j11;
        this.f16629d = c5209c;
        this.f16630e = interfaceC9527m;
        this.f16631f = obj;
    }

    /* renamed from: b */
    public static /* synthetic */ C9526l m15889b(C9526l c9526l, int i10, long j10, long j11, C5209c c5209c, InterfaceC9527m interfaceC9527m, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = c9526l.f16626a;
        }
        if ((i11 & 2) != 0) {
            j10 = c9526l.f16627b;
        }
        if ((i11 & 4) != 0) {
            j11 = c9526l.f16628c;
        }
        if ((i11 & 8) != 0) {
            c5209c = c9526l.f16629d;
        }
        if ((i11 & 16) != 0) {
            interfaceC9527m = c9526l.f16630e;
        }
        if ((i11 & 32) != 0) {
            obj = c9526l.f16631f;
        }
        Object obj3 = obj;
        C5209c c5209c2 = c5209c;
        long j12 = j11;
        return c9526l.m15890a(i10, j10, j12, c5209c2, interfaceC9527m, obj3);
    }

    /* renamed from: a */
    public final C9526l m15890a(int i10, long j10, long j11, C5209c c5209c, InterfaceC9527m interfaceC9527m, Object obj) {
        return new C9526l(i10, j10, j11, c5209c, interfaceC9527m, obj);
    }

    /* renamed from: c */
    public final InterfaceC9527m m15891c() {
        return this.f16630e;
    }

    /* renamed from: d */
    public final int m15892d() {
        return this.f16626a;
    }

    /* renamed from: e */
    public final C5209c m15893e() {
        return this.f16629d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9526l)) {
            return false;
        }
        C9526l c9526l = (C9526l) obj;
        return this.f16626a == c9526l.f16626a && this.f16627b == c9526l.f16627b && this.f16628c == c9526l.f16628c && Intrinsics.areEqual(this.f16629d, c9526l.f16629d) && Intrinsics.areEqual(this.f16630e, c9526l.f16630e) && Intrinsics.areEqual(this.f16631f, c9526l.f16631f);
    }

    /* renamed from: f */
    public final long m15894f() {
        return this.f16627b;
    }

    /* renamed from: g */
    public final long m15895g() {
        return this.f16628c;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f16626a * 31) + Long.hashCode(this.f16627b)) * 31) + Long.hashCode(this.f16628c)) * 31) + this.f16629d.hashCode()) * 31;
        InterfaceC9527m interfaceC9527m = this.f16630e;
        int iHashCode2 = (iHashCode + (interfaceC9527m == null ? 0 : interfaceC9527m.hashCode())) * 31;
        Object obj = this.f16631f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(code=" + this.f16626a + ", requestMillis=" + this.f16627b + ", responseMillis=" + this.f16628c + ", headers=" + this.f16629d + ", body=" + this.f16630e + ", delegate=" + this.f16631f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C9526l(int i10, long j10, long j11, C5209c c5209c, InterfaceC9527m interfaceC9527m, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj2;
        InterfaceC9527m interfaceC9527m2;
        C5209c c5209c2;
        i10 = (i11 & 1) != 0 ? 200 : i10;
        j10 = (i11 & 2) != 0 ? 0L : j10;
        j11 = (i11 & 4) != 0 ? 0L : j11;
        c5209c = (i11 & 8) != 0 ? C5209c.f3184c : c5209c;
        interfaceC9527m = (i11 & 16) != 0 ? null : interfaceC9527m;
        if ((i11 & 32) != 0) {
            obj2 = null;
            c5209c2 = c5209c;
            interfaceC9527m2 = interfaceC9527m;
        } else {
            obj2 = obj;
            interfaceC9527m2 = interfaceC9527m;
            c5209c2 = c5209c;
        }
        this(i10, j10, j11, c5209c2, interfaceC9527m2, obj2);
    }
}
