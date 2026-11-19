package p202o8;

import androidx.compose.material3.internal.CalendarModelKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p172l8.C8905d;
import p172l8.C8918q;
import p172l8.C8924w;
import p172l8.C8926y;
import p182m8.AbstractC9045d;
import p236r8.AbstractC9441c;

/* renamed from: o8.b */
/* loaded from: classes5.dex */
public final class C9233b {

    /* renamed from: c */
    public static final a f15630c = new a(null);

    /* renamed from: a */
    public final C8924w f15631a;

    /* renamed from: b */
    public final C8926y f15632b;

    /* renamed from: o8.b$a */
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
        public final boolean m14805a(p172l8.C8926y r5, p172l8.C8924w r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.m14174i()
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
                java.lang.String r0 = p172l8.C8926y.m14169n(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                l8.d r0 = r5.m14171c()
                int r0 = r0.m13852c()
                r1 = -1
                if (r0 != r1) goto L65
                l8.d r0 = r5.m14171c()
                boolean r0 = r0.m13851b()
                if (r0 != 0) goto L65
                l8.d r0 = r5.m14171c()
                boolean r0 = r0.m13850a()
                if (r0 != 0) goto L65
                return r2
            L65:
                l8.d r5 = r5.m14171c()
                boolean r5 = r5.m13857h()
                if (r5 != 0) goto L7b
                l8.d r5 = r6.m14129b()
                boolean r5 = r5.m13857h()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p202o8.C9233b.a.m14805a(l8.y, l8.w):boolean");
        }

        public a() {
        }
    }

    /* renamed from: o8.b$b */
    public static final class b {

        /* renamed from: a */
        public final long f15633a;

        /* renamed from: b */
        public final C8924w f15634b;

        /* renamed from: c */
        public final C8926y f15635c;

        /* renamed from: d */
        public Date f15636d;

        /* renamed from: e */
        public String f15637e;

        /* renamed from: f */
        public Date f15638f;

        /* renamed from: g */
        public String f15639g;

        /* renamed from: h */
        public Date f15640h;

        /* renamed from: i */
        public long f15641i;

        /* renamed from: j */
        public long f15642j;

        /* renamed from: k */
        public String f15643k;

        /* renamed from: l */
        public int f15644l;

        public b(long j9, C8924w request, C8926y c8926y) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f15633a = j9;
            this.f15634b = request;
            this.f15635c = c8926y;
            this.f15644l = -1;
            if (c8926y != null) {
                this.f15641i = c8926y.m14188x();
                this.f15642j = c8926y.m14186v();
                C8918q c8918qM14179o = c8926y.m14179o();
                int size = c8918qM14179o.size();
                for (int i9 = 0; i9 < size; i9++) {
                    String strM13937b = c8918qM14179o.m13937b(i9);
                    String strM13940f = c8918qM14179o.m13940f(i9);
                    if (StringsKt.equals(strM13937b, HttpHeaders.DATE, true)) {
                        this.f15636d = AbstractC9441c.m15577a(strM13940f);
                        this.f15637e = strM13940f;
                    } else if (StringsKt.equals(strM13937b, HttpHeaders.EXPIRES, true)) {
                        this.f15640h = AbstractC9441c.m15577a(strM13940f);
                    } else if (StringsKt.equals(strM13937b, HttpHeaders.LAST_MODIFIED, true)) {
                        this.f15638f = AbstractC9441c.m15577a(strM13940f);
                        this.f15639g = strM13940f;
                    } else if (StringsKt.equals(strM13937b, HttpHeaders.ETAG, true)) {
                        this.f15643k = strM13940f;
                    } else if (StringsKt.equals(strM13937b, "Age", true)) {
                        this.f15644l = AbstractC9045d.m14480V(strM13940f, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long m14806a() {
            Date date = this.f15636d;
            long jMax = date != null ? Math.max(0L, this.f15642j - date.getTime()) : 0L;
            int i9 = this.f15644l;
            if (i9 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i9));
            }
            long j9 = this.f15642j;
            return jMax + (j9 - this.f15641i) + (this.f15633a - j9);
        }

        /* renamed from: b */
        public final C9233b m14807b() {
            C9233b c9233bM14808c = m14808c();
            return (c9233bM14808c.m14804b() == null || !this.f15634b.m14129b().m13858i()) ? c9233bM14808c : new C9233b(null, null);
        }

        /* renamed from: c */
        public final C9233b m14808c() {
            String str;
            if (this.f15635c == null) {
                return new C9233b(this.f15634b, null);
            }
            if (this.f15634b.m14133f() && this.f15635c.m14176k() == null) {
                return new C9233b(this.f15634b, null);
            }
            if (!C9233b.f15630c.m14805a(this.f15635c, this.f15634b)) {
                return new C9233b(this.f15634b, null);
            }
            C8905d c8905dM14129b = this.f15634b.m14129b();
            if (c8905dM14129b.m13856g() || m14810e(this.f15634b)) {
                return new C9233b(this.f15634b, null);
            }
            C8905d c8905dM14171c = this.f15635c.m14171c();
            long jM14806a = m14806a();
            long jM14809d = m14809d();
            if (c8905dM14129b.m13852c() != -1) {
                jM14809d = Math.min(jM14809d, TimeUnit.SECONDS.toMillis(c8905dM14129b.m13852c()));
            }
            long millis = 0;
            long millis2 = c8905dM14129b.m13854e() != -1 ? TimeUnit.SECONDS.toMillis(c8905dM14129b.m13854e()) : 0L;
            if (!c8905dM14171c.m13855f() && c8905dM14129b.m13853d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c8905dM14129b.m13853d());
            }
            if (!c8905dM14171c.m13856g()) {
                long j9 = millis2 + jM14806a;
                if (j9 < millis + jM14809d) {
                    C8926y.a aVarM14183s = this.f15635c.m14183s();
                    if (j9 >= jM14809d) {
                        aVarM14183s.m14189a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM14806a > CalendarModelKt.MillisecondsIn24Hours && m14811f()) {
                        aVarM14183s.m14189a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C9233b(null, aVarM14183s.m14191c());
                }
            }
            String str2 = this.f15643k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f15638f != null) {
                    str2 = this.f15639g;
                } else {
                    if (this.f15636d == null) {
                        return new C9233b(this.f15634b, null);
                    }
                    str2 = this.f15637e;
                }
                str = "If-Modified-Since";
            }
            C8918q.a aVarM13938c = this.f15634b.m14132e().m13938c();
            Intrinsics.checkNotNull(str2);
            aVarM13938c.m13945d(str, str2);
            return new C9233b(this.f15634b.m14135h().m14146i(aVarM13938c.m13947f()).m14140b(), this.f15635c);
        }

        /* renamed from: d */
        public final long m14809d() {
            C8926y c8926y = this.f15635c;
            Intrinsics.checkNotNull(c8926y);
            if (c8926y.m14171c().m13852c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m13852c());
            }
            Date date = this.f15640h;
            if (date != null) {
                Date date2 = this.f15636d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f15642j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f15638f != null && this.f15635c.m14187w().m14137j().m13972o() == null) {
                Date date3 = this.f15636d;
                long time2 = date3 != null ? date3.getTime() : this.f15641i;
                Date date4 = this.f15638f;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        /* renamed from: e */
        public final boolean m14810e(C8924w c8924w) {
            return (c8924w.m14131d("If-Modified-Since") == null && c8924w.m14131d("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        public final boolean m14811f() {
            C8926y c8926y = this.f15635c;
            Intrinsics.checkNotNull(c8926y);
            return c8926y.m14171c().m13852c() == -1 && this.f15640h == null;
        }
    }

    public C9233b(C8924w c8924w, C8926y c8926y) {
        this.f15631a = c8924w;
        this.f15632b = c8926y;
    }

    /* renamed from: a */
    public final C8926y m14803a() {
        return this.f15632b;
    }

    /* renamed from: b */
    public final C8924w m14804b() {
        return this.f15631a;
    }
}
