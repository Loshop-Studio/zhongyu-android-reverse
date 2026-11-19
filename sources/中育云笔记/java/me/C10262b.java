package me;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import je.C9724d;
import je.C9737q;
import je.C9743w;
import je.C9745y;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;
import pe.AbstractC10676c;

/* renamed from: me.b */
/* loaded from: classes6.dex */
public final class C10262b {

    /* renamed from: c */
    public static final a f24379c = new a(null);

    /* renamed from: a */
    public final C9743w f24380a;

    /* renamed from: b */
    public final C9745y f24381b;

    /* renamed from: me.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean m21370a(je.C9745y r5, je.C9743w r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.AbstractC9979u.m20294g(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.AbstractC9979u.m20294g(r6, r0)
                int r0 = r5.m19632j()
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
                java.lang.String r0 = je.C9745y.m19626p(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                je.d r0 = r5.m19629f()
                int r0 = r0.m19304c()
                r1 = -1
                if (r0 != r1) goto L65
                je.d r0 = r5.m19629f()
                boolean r0 = r0.m19303b()
                if (r0 != 0) goto L65
                je.d r0 = r5.m19629f()
                boolean r0 = r0.m19302a()
                if (r0 != 0) goto L65
                return r2
            L65:
                je.d r5 = r5.m19629f()
                boolean r5 = r5.m19309h()
                if (r5 != 0) goto L7b
                je.d r5 = r6.m19584b()
                boolean r5 = r5.m19309h()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: me.C10262b.a.m21370a(je.y, je.w):boolean");
        }

        public a() {
        }
    }

    /* renamed from: me.b$b */
    public static final class b {

        /* renamed from: a */
        public final long f24382a;

        /* renamed from: b */
        public final C9743w f24383b;

        /* renamed from: c */
        public final C9745y f24384c;

        /* renamed from: d */
        public Date f24385d;

        /* renamed from: e */
        public String f24386e;

        /* renamed from: f */
        public Date f24387f;

        /* renamed from: g */
        public String f24388g;

        /* renamed from: h */
        public Date f24389h;

        /* renamed from: i */
        public long f24390i;

        /* renamed from: j */
        public long f24391j;

        /* renamed from: k */
        public String f24392k;

        /* renamed from: l */
        public int f24393l;

        public b(long j10, C9743w request, C9745y c9745y) {
            AbstractC9979u.m20294g(request, "request");
            this.f24382a = j10;
            this.f24383b = request;
            this.f24384c = c9745y;
            this.f24393l = -1;
            if (c9745y != null) {
                this.f24390i = c9745y.m19627A();
                this.f24391j = c9745y.m19644y();
                C9737q c9737qM19637r = c9745y.m19637r();
                int size = c9737qM19637r.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strM19390b = c9737qM19637r.m19390b(i10);
                    String strM19393f = c9737qM19637r.m19393f(i10);
                    if (AbstractC10819z.m23230C(strM19390b, HttpHeaders.DATE, true)) {
                        this.f24385d = AbstractC10676c.m22603a(strM19393f);
                        this.f24386e = strM19393f;
                    } else if (AbstractC10819z.m23230C(strM19390b, HttpHeaders.EXPIRES, true)) {
                        this.f24389h = AbstractC10676c.m22603a(strM19393f);
                    } else if (AbstractC10819z.m23230C(strM19390b, HttpHeaders.LAST_MODIFIED, true)) {
                        this.f24387f = AbstractC10676c.m22603a(strM19393f);
                        this.f24388g = strM19393f;
                    } else if (AbstractC10819z.m23230C(strM19390b, HttpHeaders.ETAG, true)) {
                        this.f24392k = strM19393f;
                    } else if (AbstractC10819z.m23230C(strM19390b, "Age", true)) {
                        this.f24393l = AbstractC9920d.m20014V(strM19393f, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long m21371a() {
            Date date = this.f24385d;
            long jMax = date != null ? Math.max(0L, this.f24391j - date.getTime()) : 0L;
            int i10 = this.f24393l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f24391j;
            return jMax + (j10 - this.f24390i) + (this.f24382a - j10);
        }

        /* renamed from: b */
        public final C10262b m21372b() {
            C10262b c10262bM21373c = m21373c();
            return (c10262bM21373c.m21369b() == null || !this.f24383b.m19584b().m19310i()) ? c10262bM21373c : new C10262b(null, null);
        }

        /* renamed from: c */
        public final C10262b m21373c() {
            String str;
            if (this.f24384c == null) {
                return new C10262b(this.f24383b, null);
            }
            if (this.f24383b.m19588f() && this.f24384c.m19634l() == null) {
                return new C10262b(this.f24383b, null);
            }
            if (!C10262b.f24379c.m21370a(this.f24384c, this.f24383b)) {
                return new C10262b(this.f24383b, null);
            }
            C9724d c9724dM19584b = this.f24383b.m19584b();
            if (c9724dM19584b.m19308g() || m21375e(this.f24383b)) {
                return new C10262b(this.f24383b, null);
            }
            C9724d c9724dM19629f = this.f24384c.m19629f();
            long jM21371a = m21371a();
            long jM21374d = m21374d();
            if (c9724dM19584b.m19304c() != -1) {
                jM21374d = Math.min(jM21374d, TimeUnit.SECONDS.toMillis(c9724dM19584b.m19304c()));
            }
            long millis = 0;
            long millis2 = c9724dM19584b.m19306e() != -1 ? TimeUnit.SECONDS.toMillis(c9724dM19584b.m19306e()) : 0L;
            if (!c9724dM19629f.m19307f() && c9724dM19584b.m19305d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c9724dM19584b.m19305d());
            }
            if (!c9724dM19629f.m19308g()) {
                long j10 = millis2 + jM21371a;
                if (j10 < millis + jM21374d) {
                    C9745y.a aVarM19641v = this.f24384c.m19641v();
                    if (j10 >= jM21374d) {
                        aVarM19641v.m19646a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM21371a > 86400000 && m21376f()) {
                        aVarM19641v.m19646a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C10262b(null, aVarM19641v.m19648c());
                }
            }
            String str2 = this.f24392k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f24387f != null) {
                    str2 = this.f24388g;
                } else {
                    if (this.f24385d == null) {
                        return new C10262b(this.f24383b, null);
                    }
                    str2 = this.f24386e;
                }
                str = "If-Modified-Since";
            }
            C9737q.a aVarM19391c = this.f24383b.m19587e().m19391c();
            AbstractC9979u.m20291d(str2);
            aVarM19391c.m19398d(str, str2);
            return new C10262b(this.f24383b.m19590h().m19601i(aVarM19391c.m19400f()).m19595b(), this.f24384c);
        }

        /* renamed from: d */
        public final long m21374d() {
            C9745y c9745y = this.f24384c;
            AbstractC9979u.m20291d(c9745y);
            if (c9745y.m19629f().m19304c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m19304c());
            }
            Date date = this.f24389h;
            if (date != null) {
                Date date2 = this.f24385d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f24391j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f24387f != null && this.f24384c.m19645z().m19592j().m19425o() == null) {
                Date date3 = this.f24385d;
                long time2 = date3 != null ? date3.getTime() : this.f24390i;
                Date date4 = this.f24387f;
                AbstractC9979u.m20291d(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        /* renamed from: e */
        public final boolean m21375e(C9743w c9743w) {
            return (c9743w.m19586d("If-Modified-Since") == null && c9743w.m19586d("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        public final boolean m21376f() {
            C9745y c9745y = this.f24384c;
            AbstractC9979u.m20291d(c9745y);
            return c9745y.m19629f().m19304c() == -1 && this.f24389h == null;
        }
    }

    public C10262b(C9743w c9743w, C9745y c9745y) {
        this.f24380a = c9743w;
        this.f24381b = c9745y;
    }

    /* renamed from: a */
    public final C9745y m21368a() {
        return this.f24381b;
    }

    /* renamed from: b */
    public final C9743w m21369b() {
        return this.f24380a;
    }
}
