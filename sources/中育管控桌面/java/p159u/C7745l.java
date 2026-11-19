package p159u;

import coil3.network.C4590c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.l */
/* loaded from: classes3.dex */
public final class C7745l {

    /* renamed from: a */
    public final int f10236a;

    /* renamed from: b */
    public final long f10237b;

    /* renamed from: c */
    public final long f10238c;

    /* renamed from: d */
    public final C4590c f10239d;

    /* renamed from: e */
    public final InterfaceC7746m f10240e;

    /* renamed from: f */
    public final Object f10241f;

    public C7745l(int i6, long j6, long j7, C4590c c4590c, InterfaceC7746m interfaceC7746m, Object obj) {
        this.f10236a = i6;
        this.f10237b = j6;
        this.f10238c = j7;
        this.f10239d = c4590c;
        this.f10240e = interfaceC7746m;
        this.f10241f = obj;
    }

    /* renamed from: b */
    public static /* synthetic */ C7745l m9239b(C7745l c7745l, int i6, long j6, long j7, C4590c c4590c, InterfaceC7746m interfaceC7746m, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            i6 = c7745l.f10236a;
        }
        if ((i7 & 2) != 0) {
            j6 = c7745l.f10237b;
        }
        if ((i7 & 4) != 0) {
            j7 = c7745l.f10238c;
        }
        if ((i7 & 8) != 0) {
            c4590c = c7745l.f10239d;
        }
        if ((i7 & 16) != 0) {
            interfaceC7746m = c7745l.f10240e;
        }
        if ((i7 & 32) != 0) {
            obj = c7745l.f10241f;
        }
        Object obj3 = obj;
        C4590c c4590c2 = c4590c;
        long j8 = j7;
        return c7745l.m9240a(i6, j6, j8, c4590c2, interfaceC7746m, obj3);
    }

    /* renamed from: a */
    public final C7745l m9240a(int i6, long j6, long j7, C4590c c4590c, InterfaceC7746m interfaceC7746m, Object obj) {
        return new C7745l(i6, j6, j7, c4590c, interfaceC7746m, obj);
    }

    /* renamed from: c */
    public final InterfaceC7746m m9241c() {
        return this.f10240e;
    }

    /* renamed from: d */
    public final int m9242d() {
        return this.f10236a;
    }

    /* renamed from: e */
    public final C4590c m9243e() {
        return this.f10239d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7745l)) {
            return false;
        }
        C7745l c7745l = (C7745l) obj;
        return this.f10236a == c7745l.f10236a && this.f10237b == c7745l.f10237b && this.f10238c == c7745l.f10238c && Intrinsics.areEqual(this.f10239d, c7745l.f10239d) && Intrinsics.areEqual(this.f10240e, c7745l.f10240e) && Intrinsics.areEqual(this.f10241f, c7745l.f10241f);
    }

    /* renamed from: f */
    public final long m9244f() {
        return this.f10237b;
    }

    /* renamed from: g */
    public final long m9245g() {
        return this.f10238c;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f10236a * 31) + Long.hashCode(this.f10237b)) * 31) + Long.hashCode(this.f10238c)) * 31) + this.f10239d.hashCode()) * 31;
        InterfaceC7746m interfaceC7746m = this.f10240e;
        int iHashCode2 = (iHashCode + (interfaceC7746m == null ? 0 : interfaceC7746m.hashCode())) * 31;
        Object obj = this.f10241f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(code=" + this.f10236a + ", requestMillis=" + this.f10237b + ", responseMillis=" + this.f10238c + ", headers=" + this.f10239d + ", body=" + this.f10240e + ", delegate=" + this.f10241f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C7745l(int i6, long j6, long j7, C4590c c4590c, InterfaceC7746m interfaceC7746m, Object obj, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj2;
        InterfaceC7746m interfaceC7746m2;
        C4590c c4590c2;
        i6 = (i7 & 1) != 0 ? 200 : i6;
        j6 = (i7 & 2) != 0 ? 0L : j6;
        j7 = (i7 & 4) != 0 ? 0L : j7;
        c4590c = (i7 & 8) != 0 ? C4590c.f1868c : c4590c;
        interfaceC7746m = (i7 & 16) != 0 ? null : interfaceC7746m;
        if ((i7 & 32) != 0) {
            obj2 = null;
            c4590c2 = c4590c;
            interfaceC7746m2 = interfaceC7746m;
        } else {
            obj2 = obj;
            interfaceC7746m2 = interfaceC7746m;
            c4590c2 = c4590c;
        }
        this(i6, j6, j7, c4590c2, interfaceC7746m2, obj2);
    }
}
