package p169x0;

import android.net.Uri;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: x0.c */
/* loaded from: classes.dex */
public final class C3434c {

    /* renamed from: i */
    public static final C3434c f12037i = new a().m10480b();

    /* renamed from: a */
    private EnumC3446o f12038a;

    /* renamed from: b */
    private boolean f12039b;

    /* renamed from: c */
    private boolean f12040c;

    /* renamed from: d */
    private boolean f12041d;

    /* renamed from: e */
    private boolean f12042e;

    /* renamed from: f */
    private long f12043f;

    /* renamed from: g */
    private long f12044g;

    /* renamed from: h */
    private C3435d f12045h;

    /* renamed from: x0.c$a */
    public static final class a {

        /* renamed from: a */
        boolean f12046a = false;

        /* renamed from: b */
        boolean f12047b = false;

        /* renamed from: c */
        EnumC3446o f12048c = EnumC3446o.NOT_REQUIRED;

        /* renamed from: d */
        boolean f12049d = false;

        /* renamed from: e */
        boolean f12050e = false;

        /* renamed from: f */
        long f12051f = -1;

        /* renamed from: g */
        long f12052g = -1;

        /* renamed from: h */
        C3435d f12053h = new C3435d();

        /* renamed from: a */
        public a m10479a(Uri uri, boolean z3) {
            this.f12053h.m10488a(uri, z3);
            return this;
        }

        /* renamed from: b */
        public C3434c m10480b() {
            return new C3434c(this);
        }

        /* renamed from: c */
        public a m10481c(EnumC3446o enumC3446o) {
            this.f12048c = enumC3446o;
            return this;
        }

        /* renamed from: d */
        public a m10482d(boolean z3) {
            this.f12049d = z3;
            return this;
        }

        /* renamed from: e */
        public a m10483e(boolean z3) {
            this.f12046a = z3;
            return this;
        }

        /* renamed from: f */
        public a m10484f(boolean z3) {
            this.f12047b = z3;
            return this;
        }

        /* renamed from: g */
        public a m10485g(boolean z3) {
            this.f12050e = z3;
            return this;
        }

        /* renamed from: h */
        public a m10486h(long j4, TimeUnit timeUnit) {
            this.f12052g = timeUnit.toMillis(j4);
            return this;
        }

        /* renamed from: i */
        public a m10487i(long j4, TimeUnit timeUnit) {
            this.f12051f = timeUnit.toMillis(j4);
            return this;
        }
    }

    public C3434c() {
        this.f12038a = EnumC3446o.NOT_REQUIRED;
        this.f12043f = -1L;
        this.f12044g = -1L;
        this.f12045h = new C3435d();
    }

    /* renamed from: a */
    public C3435d m10462a() {
        return this.f12045h;
    }

    /* renamed from: b */
    public EnumC3446o m10463b() {
        return this.f12038a;
    }

    /* renamed from: c */
    public long m10464c() {
        return this.f12043f;
    }

    /* renamed from: d */
    public long m10465d() {
        return this.f12044g;
    }

    /* renamed from: e */
    public boolean m10466e() {
        return this.f12045h.m10490c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3434c.class != obj.getClass()) {
            return false;
        }
        C3434c c3434c = (C3434c) obj;
        if (this.f12039b == c3434c.f12039b && this.f12040c == c3434c.f12040c && this.f12041d == c3434c.f12041d && this.f12042e == c3434c.f12042e && this.f12043f == c3434c.f12043f && this.f12044g == c3434c.f12044g && this.f12038a == c3434c.f12038a) {
            return this.f12045h.equals(c3434c.f12045h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m10467f() {
        return this.f12041d;
    }

    /* renamed from: g */
    public boolean m10468g() {
        return this.f12039b;
    }

    /* renamed from: h */
    public boolean m10469h() {
        return this.f12040c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f12038a.hashCode() * 31) + (this.f12039b ? 1 : 0)) * 31) + (this.f12040c ? 1 : 0)) * 31) + (this.f12041d ? 1 : 0)) * 31) + (this.f12042e ? 1 : 0)) * 31;
        long j4 = this.f12043f;
        int i4 = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f12044g;
        return ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f12045h.hashCode();
    }

    /* renamed from: i */
    public boolean m10470i() {
        return this.f12042e;
    }

    /* renamed from: j */
    public void m10471j(C3435d c3435d) {
        this.f12045h = c3435d;
    }

    /* renamed from: k */
    public void m10472k(EnumC3446o enumC3446o) {
        this.f12038a = enumC3446o;
    }

    /* renamed from: l */
    public void m10473l(boolean z3) {
        this.f12041d = z3;
    }

    /* renamed from: m */
    public void m10474m(boolean z3) {
        this.f12039b = z3;
    }

    /* renamed from: n */
    public void m10475n(boolean z3) {
        this.f12040c = z3;
    }

    /* renamed from: o */
    public void m10476o(boolean z3) {
        this.f12042e = z3;
    }

    /* renamed from: p */
    public void m10477p(long j4) {
        this.f12043f = j4;
    }

    /* renamed from: q */
    public void m10478q(long j4) {
        this.f12044g = j4;
    }

    C3434c(a aVar) {
        this.f12038a = EnumC3446o.NOT_REQUIRED;
        this.f12043f = -1L;
        this.f12044g = -1L;
        this.f12045h = new C3435d();
        this.f12039b = aVar.f12046a;
        int i4 = Build.VERSION.SDK_INT;
        this.f12040c = i4 >= 23 && aVar.f12047b;
        this.f12038a = aVar.f12048c;
        this.f12041d = aVar.f12049d;
        this.f12042e = aVar.f12050e;
        if (i4 >= 24) {
            this.f12045h = aVar.f12053h;
            this.f12043f = aVar.f12051f;
            this.f12044g = aVar.f12052g;
        }
    }

    public C3434c(C3434c c3434c) {
        this.f12038a = EnumC3446o.NOT_REQUIRED;
        this.f12043f = -1L;
        this.f12044g = -1L;
        this.f12045h = new C3435d();
        this.f12039b = c3434c.f12039b;
        this.f12040c = c3434c.f12040c;
        this.f12038a = c3434c.f12038a;
        this.f12041d = c3434c.f12041d;
        this.f12042e = c3434c.f12042e;
        this.f12045h = c3434c.f12045h;
    }
}
