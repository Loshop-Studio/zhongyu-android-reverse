package p079i5;

import androidx.compose.material3.internal.CalendarModelKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p058f5.C6358b0;
import p058f5.C6361d;
import p058f5.C6362d0;
import p058f5.C6383v;
import p065g5.AbstractC6424h;
import p102l5.AbstractC7349c;

/* renamed from: i5.b */
/* loaded from: classes4.dex */
public final class C6550b {

    /* renamed from: c */
    public static final a f8384c = new a(null);

    /* renamed from: a */
    public final C6358b0 f8385a;

    /* renamed from: b */
    public final C6362d0 f8386b;

    /* renamed from: i5.b$a */
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
        public final boolean m7416a(p058f5.C6362d0 r5, p058f5.C6358b0 r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.m6665j()
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
                java.lang.String r0 = p058f5.C6362d0.m6660o(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                f5.d r0 = r5.m6662g()
                int r0 = r0.m6634e()
                r1 = -1
                if (r0 != r1) goto L65
                f5.d r0 = r5.m6662g()
                boolean r0 = r0.m6633d()
                if (r0 != 0) goto L65
                f5.d r0 = r5.m6662g()
                boolean r0 = r0.m6632c()
                if (r0 != 0) goto L65
                return r2
            L65:
                f5.d r5 = r5.m6662g()
                boolean r5 = r5.m6639j()
                if (r5 != 0) goto L7b
                f5.d r5 = r6.m6578b()
                boolean r5 = r5.m6639j()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p079i5.C6550b.a.m7416a(f5.d0, f5.b0):boolean");
        }

        public a() {
        }
    }

    /* renamed from: i5.b$b */
    public static final class b {

        /* renamed from: a */
        public final long f8387a;

        /* renamed from: b */
        public final C6358b0 f8388b;

        /* renamed from: c */
        public final C6362d0 f8389c;

        /* renamed from: d */
        public Date f8390d;

        /* renamed from: e */
        public String f8391e;

        /* renamed from: f */
        public Date f8392f;

        /* renamed from: g */
        public String f8393g;

        /* renamed from: h */
        public Date f8394h;

        /* renamed from: i */
        public long f8395i;

        /* renamed from: j */
        public long f8396j;

        /* renamed from: k */
        public String f8397k;

        /* renamed from: l */
        public int f8398l;

        public b(long j6, C6358b0 request, C6362d0 c6362d0) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f8387a = j6;
            this.f8388b = request;
            this.f8389c = c6362d0;
            this.f8398l = -1;
            if (c6362d0 != null) {
                this.f8395i = c6362d0.m6679y();
                this.f8396j = c6362d0.m6677w();
                C6383v c6383vM6670p = c6362d0.m6670p();
                int size = c6383vM6670p.size();
                for (int i6 = 0; i6 < size; i6++) {
                    String strM6801c = c6383vM6670p.m6801c(i6);
                    String strM6804g = c6383vM6670p.m6804g(i6);
                    if (StringsKt.equals(strM6801c, HttpHeaders.DATE, true)) {
                        this.f8390d = AbstractC7349c.m8319a(strM6804g);
                        this.f8391e = strM6804g;
                    } else if (StringsKt.equals(strM6801c, HttpHeaders.EXPIRES, true)) {
                        this.f8394h = AbstractC7349c.m8319a(strM6804g);
                    } else if (StringsKt.equals(strM6801c, HttpHeaders.LAST_MODIFIED, true)) {
                        this.f8392f = AbstractC7349c.m8319a(strM6804g);
                        this.f8393g = strM6804g;
                    } else if (StringsKt.equals(strM6801c, HttpHeaders.ETAG, true)) {
                        this.f8397k = strM6804g;
                    } else if (StringsKt.equals(strM6801c, "Age", true)) {
                        this.f8398l = AbstractC6424h.m6982A(strM6804g, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long m7417a() {
            Date date = this.f8390d;
            long jMax = date != null ? Math.max(0L, this.f8396j - date.getTime()) : 0L;
            int i6 = this.f8398l;
            if (i6 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i6));
            }
            return jMax + Math.max(0L, this.f8396j - this.f8395i) + Math.max(0L, this.f8387a - this.f8396j);
        }

        /* renamed from: b */
        public final C6550b m7418b() {
            C6550b c6550bM7419c = m7419c();
            return (c6550bM7419c.m7415b() == null || !this.f8388b.m6578b().m6641l()) ? c6550bM7419c : new C6550b(null, null);
        }

        /* renamed from: c */
        public final C6550b m7419c() {
            String str;
            if (this.f8389c == null) {
                return new C6550b(this.f8388b, null);
            }
            if (this.f8388b.m6583g() && this.f8389c.m6667l() == null) {
                return new C6550b(this.f8388b, null);
            }
            if (!C6550b.f8384c.m7416a(this.f8389c, this.f8388b)) {
                return new C6550b(this.f8388b, null);
            }
            C6361d c6361dM6578b = this.f8388b.m6578b();
            if (c6361dM6578b.m6638i() || m7421e(this.f8388b)) {
                return new C6550b(this.f8388b, null);
            }
            C6361d c6361dM6662g = this.f8389c.m6662g();
            long jM7417a = m7417a();
            long jM7420d = m7420d();
            if (c6361dM6578b.m6634e() != -1) {
                jM7420d = Math.min(jM7420d, TimeUnit.SECONDS.toMillis(c6361dM6578b.m6634e()));
            }
            long millis = 0;
            long millis2 = c6361dM6578b.m6636g() != -1 ? TimeUnit.SECONDS.toMillis(c6361dM6578b.m6636g()) : 0L;
            if (!c6361dM6662g.m6637h() && c6361dM6578b.m6635f() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c6361dM6578b.m6635f());
            }
            if (!c6361dM6662g.m6638i()) {
                long j6 = millis2 + jM7417a;
                if (j6 < millis + jM7420d) {
                    C6362d0.a aVarM6674t = this.f8389c.m6674t();
                    if (j6 >= jM7420d) {
                        aVarM6674t.m6680a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM7417a > CalendarModelKt.MillisecondsIn24Hours && m7422f()) {
                        aVarM6674t.m6680a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C6550b(null, aVarM6674t.m6682c());
                }
            }
            String str2 = this.f8397k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f8392f != null) {
                    str2 = this.f8393g;
                } else {
                    if (this.f8390d == null) {
                        return new C6550b(this.f8388b, null);
                    }
                    str2 = this.f8391e;
                }
                str = "If-Modified-Since";
            }
            C6383v.a aVarM6802d = this.f8388b.m6582f().m6802d();
            Intrinsics.checkNotNull(str2);
            aVarM6802d.m6809d(str, str2);
            return new C6550b(this.f8388b.m6585i().m6604p(aVarM6802d.m6811f()).m6591b(), this.f8389c);
        }

        /* renamed from: d */
        public final long m7420d() {
            C6362d0 c6362d0 = this.f8389c;
            Intrinsics.checkNotNull(c6362d0);
            if (c6362d0.m6662g().m6634e() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m6634e());
            }
            Date date = this.f8394h;
            if (date != null) {
                Date date2 = this.f8390d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f8396j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f8392f != null && this.f8389c.m6678x().m6588l().m6829n() == null) {
                Date date3 = this.f8390d;
                long time2 = date3 != null ? date3.getTime() : this.f8395i;
                Date date4 = this.f8392f;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        /* renamed from: e */
        public final boolean m7421e(C6358b0 c6358b0) {
            return (c6358b0.m6581e("If-Modified-Since") == null && c6358b0.m6581e("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        public final boolean m7422f() {
            C6362d0 c6362d0 = this.f8389c;
            Intrinsics.checkNotNull(c6362d0);
            return c6362d0.m6662g().m6634e() == -1 && this.f8394h == null;
        }
    }

    public C6550b(C6358b0 c6358b0, C6362d0 c6362d0) {
        this.f8385a = c6358b0;
        this.f8386b = c6362d0;
    }

    /* renamed from: a */
    public final C6362d0 m7414a() {
        return this.f8386b;
    }

    /* renamed from: b */
    public final C6358b0 m7415b() {
        return this.f8385a;
    }
}
