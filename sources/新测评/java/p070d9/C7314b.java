package p070d9;

import androidx.compose.material3.internal.CalendarModelKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p011a9.C0041d;
import p011a9.C0054q;
import p011a9.C0060w;
import p011a9.C0062y;
import p028b9.AbstractC5070d;
import p103g9.AbstractC7602c;

/* renamed from: d9.b */
/* loaded from: classes5.dex */
public final class C7314b {

    /* renamed from: c */
    public static final a f11825c = new a(null);

    /* renamed from: a */
    public final C0060w f11826a;

    /* renamed from: b */
    public final C0062y f11827b;

    /* renamed from: d9.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean m11603a(p011a9.C0062y r5, p011a9.C0060w r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.m418i()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = p011a9.C0062y.m413n(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                a9.d r0 = r5.m415f()
                int r0 = r0.m93c()
                r1 = -1
                if (r0 != r1) goto L65
                a9.d r0 = r5.m415f()
                boolean r0 = r0.m92b()
                if (r0 != 0) goto L65
                a9.d r0 = r5.m415f()
                boolean r0 = r0.m91a()
                if (r0 != 0) goto L65
                return r2
            L65:
                a9.d r5 = r5.m415f()
                boolean r5 = r5.m98h()
                if (r5 != 0) goto L7b
                a9.d r5 = r6.m373b()
                boolean r5 = r5.m98h()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p070d9.C7314b.a.m11603a(a9.y, a9.w):boolean");
        }

        public a() {
        }
    }

    /* renamed from: d9.b$b */
    public static final class b {

        /* renamed from: a */
        public final long f11828a;

        /* renamed from: b */
        public final C0060w f11829b;

        /* renamed from: c */
        public final C0062y f11830c;

        /* renamed from: d */
        public Date f11831d;

        /* renamed from: e */
        public String f11832e;

        /* renamed from: f */
        public Date f11833f;

        /* renamed from: g */
        public String f11834g;

        /* renamed from: h */
        public Date f11835h;

        /* renamed from: i */
        public long f11836i;

        /* renamed from: j */
        public long f11837j;

        /* renamed from: k */
        public String f11838k;

        /* renamed from: l */
        public int f11839l;

        public b(long j10, C0060w request, C0062y c0062y) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f11828a = j10;
            this.f11829b = request;
            this.f11830c = c0062y;
            this.f11839l = -1;
            if (c0062y != null) {
                this.f11836i = c0062y.m432x();
                this.f11837j = c0062y.m430v();
                C0054q c0054qM423o = c0062y.m423o();
                int size = c0054qM423o.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strM181b = c0054qM423o.m181b(i10);
                    String strM184f = c0054qM423o.m184f(i10);
                    if (StringsKt.equals(strM181b, HttpHeaders.DATE, true)) {
                        this.f11831d = AbstractC7602c.m12490a(strM184f);
                        this.f11832e = strM184f;
                    } else if (StringsKt.equals(strM181b, HttpHeaders.EXPIRES, true)) {
                        this.f11835h = AbstractC7602c.m12490a(strM184f);
                    } else if (StringsKt.equals(strM181b, HttpHeaders.LAST_MODIFIED, true)) {
                        this.f11833f = AbstractC7602c.m12490a(strM184f);
                        this.f11834g = strM184f;
                    } else if (StringsKt.equals(strM181b, HttpHeaders.ETAG, true)) {
                        this.f11838k = strM184f;
                    } else if (StringsKt.equals(strM181b, "Age", true)) {
                        this.f11839l = AbstractC5070d.m2631V(strM184f, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long m11604a() {
            Date date = this.f11831d;
            long jMax = date != null ? Math.max(0L, this.f11837j - date.getTime()) : 0L;
            int i10 = this.f11839l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f11837j;
            return jMax + (j10 - this.f11836i) + (this.f11828a - j10);
        }

        /* renamed from: b */
        public final C7314b m11605b() {
            C7314b c7314bM11606c = m11606c();
            return (c7314bM11606c.m11602b() == null || !this.f11829b.m373b().m99i()) ? c7314bM11606c : new C7314b(null, null);
        }

        /* renamed from: c */
        public final C7314b m11606c() {
            String str;
            if (this.f11830c == null) {
                return new C7314b(this.f11829b, null);
            }
            if (this.f11829b.m377f() && this.f11830c.m420k() == null) {
                return new C7314b(this.f11829b, null);
            }
            if (!C7314b.f11825c.m11603a(this.f11830c, this.f11829b)) {
                return new C7314b(this.f11829b, null);
            }
            C0041d c0041dM373b = this.f11829b.m373b();
            if (c0041dM373b.m97g() || m11608e(this.f11829b)) {
                return new C7314b(this.f11829b, null);
            }
            C0041d c0041dM415f = this.f11830c.m415f();
            long jM11604a = m11604a();
            long jM11607d = m11607d();
            if (c0041dM373b.m93c() != -1) {
                jM11607d = Math.min(jM11607d, TimeUnit.SECONDS.toMillis(c0041dM373b.m93c()));
            }
            long millis = 0;
            long millis2 = c0041dM373b.m95e() != -1 ? TimeUnit.SECONDS.toMillis(c0041dM373b.m95e()) : 0L;
            if (!c0041dM415f.m96f() && c0041dM373b.m94d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c0041dM373b.m94d());
            }
            if (!c0041dM415f.m97g()) {
                long j10 = millis2 + jM11604a;
                if (j10 < millis + jM11607d) {
                    C0062y.a aVarM427s = this.f11830c.m427s();
                    if (j10 >= jM11607d) {
                        aVarM427s.m433a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM11604a > CalendarModelKt.MillisecondsIn24Hours && m11609f()) {
                        aVarM427s.m433a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C7314b(null, aVarM427s.m435c());
                }
            }
            String str2 = this.f11838k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f11833f != null) {
                    str2 = this.f11834g;
                } else {
                    if (this.f11831d == null) {
                        return new C7314b(this.f11829b, null);
                    }
                    str2 = this.f11832e;
                }
                str = "If-Modified-Since";
            }
            C0054q.a aVarM182c = this.f11829b.m376e().m182c();
            Intrinsics.checkNotNull(str2);
            aVarM182c.m189d(str, str2);
            return new C7314b(this.f11829b.m379h().m390i(aVarM182c.m191f()).m384b(), this.f11830c);
        }

        /* renamed from: d */
        public final long m11607d() {
            C0062y c0062y = this.f11830c;
            Intrinsics.checkNotNull(c0062y);
            if (c0062y.m415f().m93c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m93c());
            }
            Date date = this.f11835h;
            if (date != null) {
                Date date2 = this.f11831d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f11837j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f11833f != null && this.f11830c.m431w().m381j().m216o() == null) {
                Date date3 = this.f11831d;
                long time2 = date3 != null ? date3.getTime() : this.f11836i;
                Date date4 = this.f11833f;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        /* renamed from: e */
        public final boolean m11608e(C0060w c0060w) {
            return (c0060w.m375d("If-Modified-Since") == null && c0060w.m375d("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        public final boolean m11609f() {
            C0062y c0062y = this.f11830c;
            Intrinsics.checkNotNull(c0062y);
            return c0062y.m415f().m93c() == -1 && this.f11835h == null;
        }
    }

    public C7314b(C0060w c0060w, C0062y c0062y) {
        this.f11826a = c0060w;
        this.f11827b = c0062y;
    }

    /* renamed from: a */
    public final C0062y m11601a() {
        return this.f11827b;
    }

    /* renamed from: b */
    public final C0060w m11602b() {
        return this.f11826a;
    }
}
