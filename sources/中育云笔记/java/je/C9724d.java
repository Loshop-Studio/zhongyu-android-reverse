package je;

import androidx.collection.SieveCacheKt;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;

/* renamed from: je.d */
/* loaded from: classes6.dex */
public final class C9724d {

    /* renamed from: n */
    public static final b f22682n = new b(null);

    /* renamed from: o */
    public static final C9724d f22683o = new a().m19314d().m19311a();

    /* renamed from: p */
    public static final C9724d f22684p = new a().m19315e().m19313c(Integer.MAX_VALUE, TimeUnit.SECONDS).m19311a();

    /* renamed from: a */
    public final boolean f22685a;

    /* renamed from: b */
    public final boolean f22686b;

    /* renamed from: c */
    public final int f22687c;

    /* renamed from: d */
    public final int f22688d;

    /* renamed from: e */
    public final boolean f22689e;

    /* renamed from: f */
    public final boolean f22690f;

    /* renamed from: g */
    public final boolean f22691g;

    /* renamed from: h */
    public final int f22692h;

    /* renamed from: i */
    public final int f22693i;

    /* renamed from: j */
    public final boolean f22694j;

    /* renamed from: k */
    public final boolean f22695k;

    /* renamed from: l */
    public final boolean f22696l;

    /* renamed from: m */
    public String f22697m;

    /* renamed from: je.d$a */
    public static final class a {

        /* renamed from: a */
        public boolean f22698a;

        /* renamed from: b */
        public boolean f22699b;

        /* renamed from: c */
        public int f22700c = -1;

        /* renamed from: d */
        public int f22701d = -1;

        /* renamed from: e */
        public int f22702e = -1;

        /* renamed from: f */
        public boolean f22703f;

        /* renamed from: g */
        public boolean f22704g;

        /* renamed from: h */
        public boolean f22705h;

        /* renamed from: a */
        public final C9724d m19311a() {
            return new C9724d(this.f22698a, this.f22699b, this.f22700c, -1, false, false, false, this.f22701d, this.f22702e, this.f22703f, this.f22704g, this.f22705h, null, null);
        }

        /* renamed from: b */
        public final int m19312b(long j10) {
            if (j10 > SieveCacheKt.NodeLinkMask) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        /* renamed from: c */
        public final a m19313c(int i10, TimeUnit timeUnit) {
            AbstractC9979u.m20294g(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f22701d = m19312b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        /* renamed from: d */
        public final a m19314d() {
            this.f22698a = true;
            return this;
        }

        /* renamed from: e */
        public final a m19315e() {
            this.f22703f = true;
            return this;
        }
    }

    /* renamed from: je.d$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final int m19316a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (AbstractC10793c0.m23106T(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final je.C9724d m19317b(je.C9737q r33) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: je.C9724d.b.m19317b(je.q):je.d");
        }

        public b() {
        }
    }

    public /* synthetic */ C9724d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, AbstractC9972n abstractC9972n) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    /* renamed from: a */
    public final boolean m19302a() {
        return this.f22689e;
    }

    /* renamed from: b */
    public final boolean m19303b() {
        return this.f22690f;
    }

    /* renamed from: c */
    public final int m19304c() {
        return this.f22687c;
    }

    /* renamed from: d */
    public final int m19305d() {
        return this.f22692h;
    }

    /* renamed from: e */
    public final int m19306e() {
        return this.f22693i;
    }

    /* renamed from: f */
    public final boolean m19307f() {
        return this.f22691g;
    }

    /* renamed from: g */
    public final boolean m19308g() {
        return this.f22685a;
    }

    /* renamed from: h */
    public final boolean m19309h() {
        return this.f22686b;
    }

    /* renamed from: i */
    public final boolean m19310i() {
        return this.f22694j;
    }

    public String toString() {
        String str = this.f22697m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f22685a) {
            sb2.append("no-cache, ");
        }
        if (this.f22686b) {
            sb2.append("no-store, ");
        }
        if (this.f22687c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f22687c);
            sb2.append(", ");
        }
        if (this.f22688d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f22688d);
            sb2.append(", ");
        }
        if (this.f22689e) {
            sb2.append("private, ");
        }
        if (this.f22690f) {
            sb2.append("public, ");
        }
        if (this.f22691g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f22692h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f22692h);
            sb2.append(", ");
        }
        if (this.f22693i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f22693i);
            sb2.append(", ");
        }
        if (this.f22694j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f22695k) {
            sb2.append("no-transform, ");
        }
        if (this.f22696l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
        this.f22697m = string;
        return string;
    }

    public C9724d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f22685a = z10;
        this.f22686b = z11;
        this.f22687c = i10;
        this.f22688d = i11;
        this.f22689e = z12;
        this.f22690f = z13;
        this.f22691g = z14;
        this.f22692h = i12;
        this.f22693i = i13;
        this.f22694j = z15;
        this.f22695k = z16;
        this.f22696l = z17;
        this.f22697m = str;
    }
}
