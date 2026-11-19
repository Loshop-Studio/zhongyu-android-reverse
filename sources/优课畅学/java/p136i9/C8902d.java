package p136i9;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p124h8.C8738a;
import p147j9.AbstractC9034d;

/* renamed from: i9.d */
/* loaded from: classes5.dex */
public final class C8902d {

    /* renamed from: n */
    public static final b f16665n;

    /* renamed from: o */
    public static final C8902d f16666o;

    /* renamed from: p */
    public static final C8902d f16667p;

    /* renamed from: a */
    public final boolean f16668a;

    /* renamed from: b */
    public final boolean f16669b;

    /* renamed from: c */
    public final int f16670c;

    /* renamed from: d */
    public final int f16671d;

    /* renamed from: e */
    public final boolean f16672e;

    /* renamed from: f */
    public final boolean f16673f;

    /* renamed from: g */
    public final boolean f16674g;

    /* renamed from: h */
    public final int f16675h;

    /* renamed from: i */
    public final int f16676i;

    /* renamed from: j */
    public final boolean f16677j;

    /* renamed from: k */
    public final boolean f16678k;

    /* renamed from: l */
    public final boolean f16679l;

    /* renamed from: m */
    public String f16680m;

    /* renamed from: i9.d$a */
    public static final class a {

        /* renamed from: a */
        public boolean f16681a;

        /* renamed from: b */
        public boolean f16682b;

        /* renamed from: c */
        public int f16683c = -1;

        /* renamed from: d */
        public int f16684d = -1;

        /* renamed from: e */
        public int f16685e = -1;

        /* renamed from: f */
        public boolean f16686f;

        /* renamed from: g */
        public boolean f16687g;

        /* renamed from: h */
        public boolean f16688h;

        /* renamed from: a */
        public final C8902d m15107a() {
            return AbstractC9034d.m15700a(this);
        }

        /* renamed from: b */
        public final boolean m15108b() {
            return this.f16688h;
        }

        /* renamed from: c */
        public final int m15109c() {
            return this.f16683c;
        }

        /* renamed from: d */
        public final int m15110d() {
            return this.f16684d;
        }

        /* renamed from: e */
        public final int m15111e() {
            return this.f16685e;
        }

        /* renamed from: f */
        public final boolean m15112f() {
            return this.f16681a;
        }

        /* renamed from: g */
        public final boolean m15113g() {
            return this.f16682b;
        }

        /* renamed from: h */
        public final boolean m15114h() {
            return this.f16687g;
        }

        /* renamed from: i */
        public final boolean m15115i() {
            return this.f16686f;
        }

        /* renamed from: j */
        public final a m15116j(long j10) {
            long jM14353r = C8738a.m14353r(j10);
            if (jM14353r >= 0) {
                this.f16684d = AbstractC9034d.m15701b(jM14353r);
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + jM14353r).toString());
        }

        /* renamed from: k */
        public final a m15117k() {
            return AbstractC9034d.m15704e(this);
        }

        /* renamed from: l */
        public final a m15118l() {
            return AbstractC9034d.m15705f(this);
        }

        /* renamed from: m */
        public final void m15119m(boolean z10) {
            this.f16681a = z10;
        }

        /* renamed from: n */
        public final void m15120n(boolean z10) {
            this.f16686f = z10;
        }
    }

    /* renamed from: i9.d$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final C8902d m15121a(C8924v headers) {
            AbstractC9133u.m16133g(headers, "headers");
            return AbstractC9034d.m15706g(this, headers);
        }

        public b() {
        }
    }

    static {
        b bVar = new b(null);
        f16665n = bVar;
        f16666o = AbstractC9034d.m15703d(bVar);
        f16667p = AbstractC9034d.m15702c(bVar);
    }

    public C8902d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f16668a = z10;
        this.f16669b = z11;
        this.f16670c = i10;
        this.f16671d = i11;
        this.f16672e = z12;
        this.f16673f = z13;
        this.f16674g = z14;
        this.f16675h = i12;
        this.f16676i = i13;
        this.f16677j = z15;
        this.f16678k = z16;
        this.f16679l = z17;
        this.f16680m = str;
    }

    /* renamed from: a */
    public final String m15093a() {
        return this.f16680m;
    }

    /* renamed from: b */
    public final boolean m15094b() {
        return this.f16679l;
    }

    /* renamed from: c */
    public final boolean m15095c() {
        return this.f16672e;
    }

    /* renamed from: d */
    public final boolean m15096d() {
        return this.f16673f;
    }

    /* renamed from: e */
    public final int m15097e() {
        return this.f16670c;
    }

    /* renamed from: f */
    public final int m15098f() {
        return this.f16675h;
    }

    /* renamed from: g */
    public final int m15099g() {
        return this.f16676i;
    }

    /* renamed from: h */
    public final boolean m15100h() {
        return this.f16674g;
    }

    /* renamed from: i */
    public final boolean m15101i() {
        return this.f16668a;
    }

    /* renamed from: j */
    public final boolean m15102j() {
        return this.f16669b;
    }

    /* renamed from: k */
    public final boolean m15103k() {
        return this.f16678k;
    }

    /* renamed from: l */
    public final boolean m15104l() {
        return this.f16677j;
    }

    /* renamed from: m */
    public final int m15105m() {
        return this.f16671d;
    }

    /* renamed from: n */
    public final void m15106n(String str) {
        this.f16680m = str;
    }

    public String toString() {
        return AbstractC9034d.m15707h(this);
    }
}
