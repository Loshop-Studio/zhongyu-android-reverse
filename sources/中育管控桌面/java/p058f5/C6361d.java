package p058f5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import p065g5.AbstractC6420d;

/* renamed from: f5.d */
/* loaded from: classes4.dex */
public final class C6361d {

    /* renamed from: n */
    public static final b f7833n;

    /* renamed from: o */
    public static final C6361d f7834o;

    /* renamed from: p */
    public static final C6361d f7835p;

    /* renamed from: a */
    public final boolean f7836a;

    /* renamed from: b */
    public final boolean f7837b;

    /* renamed from: c */
    public final int f7838c;

    /* renamed from: d */
    public final int f7839d;

    /* renamed from: e */
    public final boolean f7840e;

    /* renamed from: f */
    public final boolean f7841f;

    /* renamed from: g */
    public final boolean f7842g;

    /* renamed from: h */
    public final int f7843h;

    /* renamed from: i */
    public final int f7844i;

    /* renamed from: j */
    public final boolean f7845j;

    /* renamed from: k */
    public final boolean f7846k;

    /* renamed from: l */
    public final boolean f7847l;

    /* renamed from: m */
    public String f7848m;

    /* renamed from: f5.d$a */
    public static final class a {

        /* renamed from: a */
        public boolean f7849a;

        /* renamed from: b */
        public boolean f7850b;

        /* renamed from: c */
        public int f7851c = -1;

        /* renamed from: d */
        public int f7852d = -1;

        /* renamed from: e */
        public int f7853e = -1;

        /* renamed from: f */
        public boolean f7854f;

        /* renamed from: g */
        public boolean f7855g;

        /* renamed from: h */
        public boolean f7856h;

        /* renamed from: a */
        public final C6361d m6644a() {
            return AbstractC6420d.m6942a(this);
        }

        /* renamed from: b */
        public final boolean m6645b() {
            return this.f7856h;
        }

        /* renamed from: c */
        public final int m6646c() {
            return this.f7851c;
        }

        /* renamed from: d */
        public final int m6647d() {
            return this.f7852d;
        }

        /* renamed from: e */
        public final int m6648e() {
            return this.f7853e;
        }

        /* renamed from: f */
        public final boolean m6649f() {
            return this.f7849a;
        }

        /* renamed from: g */
        public final boolean m6650g() {
            return this.f7850b;
        }

        /* renamed from: h */
        public final boolean m6651h() {
            return this.f7855g;
        }

        /* renamed from: i */
        public final boolean m6652i() {
            return this.f7854f;
        }

        /* renamed from: j */
        public final a m6653j(long j6) {
            long jM18521getInWholeSecondsimpl = Duration.m18521getInWholeSecondsimpl(j6);
            if (jM18521getInWholeSecondsimpl >= 0) {
                this.f7852d = AbstractC6420d.m6943b(jM18521getInWholeSecondsimpl);
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + jM18521getInWholeSecondsimpl).toString());
        }

        /* renamed from: k */
        public final a m6654k() {
            return AbstractC6420d.m6946e(this);
        }

        /* renamed from: l */
        public final a m6655l() {
            return AbstractC6420d.m6947f(this);
        }

        /* renamed from: m */
        public final void m6656m(boolean z6) {
            this.f7849a = z6;
        }

        /* renamed from: n */
        public final void m6657n(boolean z6) {
            this.f7854f = z6;
        }
    }

    /* renamed from: f5.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6361d m6658a(C6383v headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return AbstractC6420d.m6948g(this, headers);
        }

        public b() {
        }
    }

    static {
        b bVar = new b(null);
        f7833n = bVar;
        f7834o = AbstractC6420d.m6945d(bVar);
        f7835p = AbstractC6420d.m6944c(bVar);
    }

    public C6361d(boolean z6, boolean z7, int i6, int i7, boolean z8, boolean z9, boolean z10, int i8, int i9, boolean z11, boolean z12, boolean z13, String str) {
        this.f7836a = z6;
        this.f7837b = z7;
        this.f7838c = i6;
        this.f7839d = i7;
        this.f7840e = z8;
        this.f7841f = z9;
        this.f7842g = z10;
        this.f7843h = i8;
        this.f7844i = i9;
        this.f7845j = z11;
        this.f7846k = z12;
        this.f7847l = z13;
        this.f7848m = str;
    }

    /* renamed from: a */
    public final String m6630a() {
        return this.f7848m;
    }

    /* renamed from: b */
    public final boolean m6631b() {
        return this.f7847l;
    }

    /* renamed from: c */
    public final boolean m6632c() {
        return this.f7840e;
    }

    /* renamed from: d */
    public final boolean m6633d() {
        return this.f7841f;
    }

    /* renamed from: e */
    public final int m6634e() {
        return this.f7838c;
    }

    /* renamed from: f */
    public final int m6635f() {
        return this.f7843h;
    }

    /* renamed from: g */
    public final int m6636g() {
        return this.f7844i;
    }

    /* renamed from: h */
    public final boolean m6637h() {
        return this.f7842g;
    }

    /* renamed from: i */
    public final boolean m6638i() {
        return this.f7836a;
    }

    /* renamed from: j */
    public final boolean m6639j() {
        return this.f7837b;
    }

    /* renamed from: k */
    public final boolean m6640k() {
        return this.f7846k;
    }

    /* renamed from: l */
    public final boolean m6641l() {
        return this.f7845j;
    }

    /* renamed from: m */
    public final int m6642m() {
        return this.f7839d;
    }

    /* renamed from: n */
    public final void m6643n(String str) {
        this.f7848m = str;
    }

    public String toString() {
        return AbstractC6420d.m6949h(this);
    }
}
