package p327s;

import coil3.network.C5486c;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: s.l */
/* loaded from: classes3.dex */
public final class C11019l {

    /* renamed from: a */
    public final int f26592a;

    /* renamed from: b */
    public final long f26593b;

    /* renamed from: c */
    public final long f26594c;

    /* renamed from: d */
    public final C5486c f26595d;

    /* renamed from: e */
    public final InterfaceC11020m f26596e;

    /* renamed from: f */
    public final Object f26597f;

    public C11019l(int i10, long j10, long j11, C5486c c5486c, InterfaceC11020m interfaceC11020m, Object obj) {
        this.f26592a = i10;
        this.f26593b = j10;
        this.f26594c = j11;
        this.f26595d = c5486c;
        this.f26596e = interfaceC11020m;
        this.f26597f = obj;
    }

    /* renamed from: b */
    public static /* synthetic */ C11019l m24337b(C11019l c11019l, int i10, long j10, long j11, C5486c c5486c, InterfaceC11020m interfaceC11020m, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = c11019l.f26592a;
        }
        if ((i11 & 2) != 0) {
            j10 = c11019l.f26593b;
        }
        if ((i11 & 4) != 0) {
            j11 = c11019l.f26594c;
        }
        if ((i11 & 8) != 0) {
            c5486c = c11019l.f26595d;
        }
        if ((i11 & 16) != 0) {
            interfaceC11020m = c11019l.f26596e;
        }
        if ((i11 & 32) != 0) {
            obj = c11019l.f26597f;
        }
        Object obj3 = obj;
        C5486c c5486c2 = c5486c;
        long j12 = j11;
        return c11019l.m24338a(i10, j10, j12, c5486c2, interfaceC11020m, obj3);
    }

    /* renamed from: a */
    public final C11019l m24338a(int i10, long j10, long j11, C5486c c5486c, InterfaceC11020m interfaceC11020m, Object obj) {
        return new C11019l(i10, j10, j11, c5486c, interfaceC11020m, obj);
    }

    /* renamed from: c */
    public final InterfaceC11020m m24339c() {
        return this.f26596e;
    }

    /* renamed from: d */
    public final int m24340d() {
        return this.f26592a;
    }

    /* renamed from: e */
    public final C5486c m24341e() {
        return this.f26595d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11019l)) {
            return false;
        }
        C11019l c11019l = (C11019l) obj;
        return this.f26592a == c11019l.f26592a && this.f26593b == c11019l.f26593b && this.f26594c == c11019l.f26594c && AbstractC9979u.m20289b(this.f26595d, c11019l.f26595d) && AbstractC9979u.m20289b(this.f26596e, c11019l.f26596e) && AbstractC9979u.m20289b(this.f26597f, c11019l.f26597f);
    }

    /* renamed from: f */
    public final long m24342f() {
        return this.f26593b;
    }

    /* renamed from: g */
    public final long m24343g() {
        return this.f26594c;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f26592a * 31) + Long.hashCode(this.f26593b)) * 31) + Long.hashCode(this.f26594c)) * 31) + this.f26595d.hashCode()) * 31;
        InterfaceC11020m interfaceC11020m = this.f26596e;
        int iHashCode2 = (iHashCode + (interfaceC11020m == null ? 0 : interfaceC11020m.hashCode())) * 31;
        Object obj = this.f26597f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(code=" + this.f26592a + ", requestMillis=" + this.f26593b + ", responseMillis=" + this.f26594c + ", headers=" + this.f26595d + ", body=" + this.f26596e + ", delegate=" + this.f26597f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C11019l(int i10, long j10, long j11, C5486c c5486c, InterfaceC11020m interfaceC11020m, Object obj, int i11, AbstractC9972n abstractC9972n) {
        Object obj2;
        InterfaceC11020m interfaceC11020m2;
        C5486c c5486c2;
        i10 = (i11 & 1) != 0 ? 200 : i10;
        j10 = (i11 & 2) != 0 ? 0L : j10;
        j11 = (i11 & 4) != 0 ? 0L : j11;
        c5486c = (i11 & 8) != 0 ? C5486c.f3859c : c5486c;
        interfaceC11020m = (i11 & 16) != 0 ? null : interfaceC11020m;
        if ((i11 & 32) != 0) {
            obj2 = null;
            c5486c2 = c5486c;
            interfaceC11020m2 = interfaceC11020m;
        } else {
            obj2 = obj;
            interfaceC11020m2 = interfaceC11020m;
            c5486c2 = c5486c;
        }
        this(i10, j10, j11, c5486c2, interfaceC11020m2, obj2);
    }
}
