package p170l9;

import androidx.compose.material3.internal.CalendarModelKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p136i9.C8899b0;
import p136i9.C8902d;
import p136i9.C8903d0;
import p136i9.C8924v;
import p147j9.AbstractC9038h;
import p203o9.AbstractC9548c;

/* renamed from: l9.b */
/* loaded from: classes5.dex */
public final class C9285b {

    /* renamed from: c */
    public static final a f18285c = new a(null);

    /* renamed from: a */
    public final C8899b0 f18286a;

    /* renamed from: b */
    public final C8903d0 f18287b;

    /* renamed from: l9.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean m17070a(p136i9.C8903d0 r5, p136i9.C8899b0 r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.AbstractC9133u.m16133g(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.AbstractC9133u.m16133g(r6, r0)
                int r0 = r5.m15128f()
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
                java.lang.String r0 = p136i9.C8903d0.m15123k(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                i9.d r0 = r5.m15125c()
                int r0 = r0.m15097e()
                r1 = -1
                if (r0 != r1) goto L65
                i9.d r0 = r5.m15125c()
                boolean r0 = r0.m15096d()
                if (r0 != 0) goto L65
                i9.d r0 = r5.m15125c()
                boolean r0 = r0.m15095c()
                if (r0 != 0) goto L65
                return r2
            L65:
                i9.d r5 = r5.m15125c()
                boolean r5 = r5.m15102j()
                if (r5 != 0) goto L7b
                i9.d r5 = r6.m15042b()
                boolean r5 = r5.m15102j()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p170l9.C9285b.a.m17070a(i9.d0, i9.b0):boolean");
        }

        public a() {
        }
    }

    /* renamed from: l9.b$b */
    public static final class b {

        /* renamed from: a */
        public final long f18288a;

        /* renamed from: b */
        public final C8899b0 f18289b;

        /* renamed from: c */
        public final C8903d0 f18290c;

        /* renamed from: d */
        public Date f18291d;

        /* renamed from: e */
        public String f18292e;

        /* renamed from: f */
        public Date f18293f;

        /* renamed from: g */
        public String f18294g;

        /* renamed from: h */
        public Date f18295h;

        /* renamed from: i */
        public long f18296i;

        /* renamed from: j */
        public long f18297j;

        /* renamed from: k */
        public String f18298k;

        /* renamed from: l */
        public int f18299l;

        public b(long j10, C8899b0 request, C8903d0 c8903d0) {
            AbstractC9133u.m16133g(request, "request");
            this.f18288a = j10;
            this.f18289b = request;
            this.f18290c = c8903d0;
            this.f18299l = -1;
            if (c8903d0 != null) {
                this.f18296i = c8903d0.m15142u();
                this.f18297j = c8903d0.m15140s();
                C8924v c8924vM15133l = c8903d0.m15133l();
                int size = c8924vM15133l.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strM15262c = c8924vM15133l.m15262c(i10);
                    String strM15265g = c8924vM15133l.m15265g(i10);
                    if (AbstractC8687z.m14093A(strM15262c, HttpHeaders.DATE, true)) {
                        this.f18291d = AbstractC9548c.m17824a(strM15265g);
                        this.f18292e = strM15265g;
                    } else if (AbstractC8687z.m14093A(strM15262c, HttpHeaders.EXPIRES, true)) {
                        this.f18295h = AbstractC9548c.m17824a(strM15265g);
                    } else if (AbstractC8687z.m14093A(strM15262c, HttpHeaders.LAST_MODIFIED, true)) {
                        this.f18293f = AbstractC9548c.m17824a(strM15265g);
                        this.f18294g = strM15265g;
                    } else if (AbstractC8687z.m14093A(strM15262c, HttpHeaders.ETAG, true)) {
                        this.f18298k = strM15265g;
                    } else if (AbstractC8687z.m14093A(strM15262c, "Age", true)) {
                        this.f18299l = AbstractC9038h.m15740A(strM15265g, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long m17071a() {
            Date date = this.f18291d;
            long jMax = date != null ? Math.max(0L, this.f18297j - date.getTime()) : 0L;
            int i10 = this.f18299l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + Math.max(0L, this.f18297j - this.f18296i) + Math.max(0L, this.f18288a - this.f18297j);
        }

        /* renamed from: b */
        public final C9285b m17072b() {
            C9285b c9285bM17073c = m17073c();
            return (c9285bM17073c.m17069b() == null || !this.f18289b.m15042b().m15104l()) ? c9285bM17073c : new C9285b(null, null);
        }

        /* renamed from: c */
        public final C9285b m17073c() {
            String str;
            if (this.f18290c == null) {
                return new C9285b(this.f18289b, null);
            }
            if (this.f18289b.m15047g() && this.f18290c.m15130h() == null) {
                return new C9285b(this.f18289b, null);
            }
            if (!C9285b.f18285c.m17070a(this.f18290c, this.f18289b)) {
                return new C9285b(this.f18289b, null);
            }
            C8902d c8902dM15042b = this.f18289b.m15042b();
            if (c8902dM15042b.m15101i() || m17075e(this.f18289b)) {
                return new C9285b(this.f18289b, null);
            }
            C8902d c8902dM15125c = this.f18290c.m15125c();
            long jM17071a = m17071a();
            long jM17074d = m17074d();
            if (c8902dM15042b.m15097e() != -1) {
                jM17074d = Math.min(jM17074d, TimeUnit.SECONDS.toMillis(c8902dM15042b.m15097e()));
            }
            long millis = 0;
            long millis2 = c8902dM15042b.m15099g() != -1 ? TimeUnit.SECONDS.toMillis(c8902dM15042b.m15099g()) : 0L;
            if (!c8902dM15125c.m15100h() && c8902dM15042b.m15098f() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c8902dM15042b.m15098f());
            }
            if (!c8902dM15125c.m15101i()) {
                long j10 = millis2 + jM17071a;
                if (j10 < millis + jM17074d) {
                    C8903d0.a aVarM15137p = this.f18290c.m15137p();
                    if (j10 >= jM17074d) {
                        aVarM15137p.m15143a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM17071a > CalendarModelKt.MillisecondsIn24Hours && m17076f()) {
                        aVarM15137p.m15143a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C9285b(null, aVarM15137p.m15145c());
                }
            }
            String str2 = this.f18298k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f18293f != null) {
                    str2 = this.f18294g;
                } else {
                    if (this.f18291d == null) {
                        return new C9285b(this.f18289b, null);
                    }
                    str2 = this.f18292e;
                }
                str = "If-Modified-Since";
            }
            C8924v.a aVarM15263d = this.f18289b.m15046f().m15263d();
            AbstractC9133u.m16130d(str2);
            aVarM15263d.m15270d(str, str2);
            return new C9285b(this.f18289b.m15049i().m15068p(aVarM15263d.m15272f()).m15055b(), this.f18290c);
        }

        /* renamed from: d */
        public final long m17074d() {
            C8903d0 c8903d0 = this.f18290c;
            AbstractC9133u.m16130d(c8903d0);
            if (c8903d0.m15125c().m15097e() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m15097e());
            }
            Date date = this.f18295h;
            if (date != null) {
                Date date2 = this.f18291d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f18297j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f18293f != null && this.f18290c.m15141t().m15052l().m15290n() == null) {
                Date date3 = this.f18291d;
                long time2 = date3 != null ? date3.getTime() : this.f18296i;
                Date date4 = this.f18293f;
                AbstractC9133u.m16130d(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        /* renamed from: e */
        public final boolean m17075e(C8899b0 c8899b0) {
            return (c8899b0.m15045e("If-Modified-Since") == null && c8899b0.m15045e("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        public final boolean m17076f() {
            C8903d0 c8903d0 = this.f18290c;
            AbstractC9133u.m16130d(c8903d0);
            return c8903d0.m15125c().m15097e() == -1 && this.f18295h == null;
        }
    }

    public C9285b(C8899b0 c8899b0, C8903d0 c8903d0) {
        this.f18286a = c8899b0;
        this.f18287b = c8903d0;
    }

    /* renamed from: a */
    public final C8903d0 m17068a() {
        return this.f18287b;
    }

    /* renamed from: b */
    public final C8899b0 m17069b() {
        return this.f18286a;
    }
}
