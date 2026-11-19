package p129u2;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p117r2.C4496a0;
import p117r2.C4501d;
import p117r2.C4516s;
import p117r2.C4522y;
import p121s2.AbstractC4550b;
import p141x2.AbstractC4666c;

/* renamed from: u2.b */
/* loaded from: classes2.dex */
public final class C4612b {

    /* renamed from: c */
    public static final a f5809c = new a(null);

    /* renamed from: a */
    public final C4522y f5810a;

    /* renamed from: b */
    public final C4496a0 f5811b;

    /* renamed from: u2.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean m6366a(p117r2.C4496a0 r5, p117r2.C4522y r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.m5804e()
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
                java.lang.String r0 = p117r2.C4496a0.m5799i(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                r2.d r0 = r5.m5801b()
                int r0 = r0.m5853c()
                r1 = -1
                if (r0 != r1) goto L65
                r2.d r0 = r5.m5801b()
                boolean r0 = r0.m5852b()
                if (r0 != 0) goto L65
                r2.d r0 = r5.m5801b()
                boolean r0 = r0.m5851a()
                if (r0 != 0) goto L65
                return r2
            L65:
                r2.d r5 = r5.m5801b()
                boolean r5 = r5.m5858h()
                if (r5 != 0) goto L7a
                r2.d r5 = r6.m6133b()
                boolean r5 = r5.m5858h()
                if (r5 != 0) goto L7a
                r2 = 1
            L7a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p129u2.C4612b.a.m6366a(r2.a0, r2.y):boolean");
        }
    }

    /* renamed from: u2.b$b */
    public static final class b {

        /* renamed from: a */
        public Date f5812a;

        /* renamed from: b */
        public String f5813b;

        /* renamed from: c */
        public Date f5814c;

        /* renamed from: d */
        public String f5815d;

        /* renamed from: e */
        public Date f5816e;

        /* renamed from: f */
        public long f5817f;

        /* renamed from: g */
        public long f5818g;

        /* renamed from: h */
        public String f5819h;

        /* renamed from: i */
        public int f5820i;

        /* renamed from: j */
        public final long f5821j;

        /* renamed from: k */
        public final C4522y f5822k;

        /* renamed from: l */
        public final C4496a0 f5823l;

        public b(long j4, C4522y request, C4496a0 c4496a0) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f5821j = j4;
            this.f5822k = request;
            this.f5823l = c4496a0;
            this.f5820i = -1;
            if (c4496a0 != null) {
                this.f5817f = c4496a0.m5817s();
                this.f5818g = c4496a0.m5815q();
                C4516s c4516sM5808j = c4496a0.m5808j();
                int size = c4516sM5808j.size();
                for (int i4 = 0; i4 < size; i4++) {
                    String strM5960b = c4516sM5808j.m5960b(i4);
                    String strM5962e = c4516sM5808j.m5962e(i4);
                    if (StringsKt__StringsJVMKt.equals(strM5960b, "Date", true)) {
                        this.f5812a = AbstractC4666c.m6563a(strM5962e);
                        this.f5813b = strM5962e;
                    } else if (StringsKt__StringsJVMKt.equals(strM5960b, "Expires", true)) {
                        this.f5816e = AbstractC4666c.m6563a(strM5962e);
                    } else if (StringsKt__StringsJVMKt.equals(strM5960b, "Last-Modified", true)) {
                        this.f5814c = AbstractC4666c.m6563a(strM5962e);
                        this.f5815d = strM5962e;
                    } else if (StringsKt__StringsJVMKt.equals(strM5960b, "ETag", true)) {
                        this.f5819h = strM5962e;
                    } else if (StringsKt__StringsJVMKt.equals(strM5960b, "Age", true)) {
                        this.f5820i = AbstractC4550b.m6214Q(strM5962e, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long m6367a() {
            Date date = this.f5812a;
            long jMax = date != null ? Math.max(0L, this.f5818g - date.getTime()) : 0L;
            int i4 = this.f5820i;
            if (i4 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i4));
            }
            long j4 = this.f5818g;
            return jMax + (j4 - this.f5817f) + (this.f5821j - j4);
        }

        /* renamed from: b */
        public final C4612b m6368b() {
            C4612b c4612bM6369c = m6369c();
            return (c4612bM6369c.m6365b() == null || !this.f5822k.m6133b().m5859i()) ? c4612bM6369c : new C4612b(null, null);
        }

        /* renamed from: c */
        public final C4612b m6369c() {
            String str;
            if (this.f5823l == null) {
                return new C4612b(this.f5822k, null);
            }
            if (this.f5822k.m6137f() && this.f5823l.m5806g() == null) {
                return new C4612b(this.f5822k, null);
            }
            if (!C4612b.f5809c.m6366a(this.f5823l, this.f5822k)) {
                return new C4612b(this.f5822k, null);
            }
            C4501d c4501dM6133b = this.f5822k.m6133b();
            if (c4501dM6133b.m5857g() || m6371e(this.f5822k)) {
                return new C4612b(this.f5822k, null);
            }
            C4501d c4501dM5801b = this.f5823l.m5801b();
            long jM6367a = m6367a();
            long jM6370d = m6370d();
            if (c4501dM6133b.m5853c() != -1) {
                jM6370d = Math.min(jM6370d, TimeUnit.SECONDS.toMillis(c4501dM6133b.m5853c()));
            }
            long millis = 0;
            long millis2 = c4501dM6133b.m5855e() != -1 ? TimeUnit.SECONDS.toMillis(c4501dM6133b.m5855e()) : 0L;
            if (!c4501dM5801b.m5856f() && c4501dM6133b.m5854d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c4501dM6133b.m5854d());
            }
            if (!c4501dM5801b.m5857g()) {
                long j4 = millis2 + jM6367a;
                if (j4 < millis + jM6370d) {
                    C4496a0.a aVarM5812n = this.f5823l.m5812n();
                    if (j4 >= jM6370d) {
                        aVarM5812n.m5818a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM6367a > 86400000 && m6372f()) {
                        aVarM5812n.m5818a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C4612b(null, aVarM5812n.m5820c());
                }
            }
            String str2 = this.f5819h;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f5814c != null) {
                    str2 = this.f5815d;
                } else {
                    if (this.f5812a == null) {
                        return new C4612b(this.f5822k, null);
                    }
                    str2 = this.f5813b;
                }
                str = "If-Modified-Since";
            }
            C4516s.a aVarM5961c = this.f5822k.m6136e().m5961c();
            Intrinsics.checkNotNull(str2);
            aVarM5961c.m5967d(str, str2);
            return new C4612b(this.f5822k.m6139h().m6145d(aVarM5961c.m5968e()).m6143b(), this.f5823l);
        }

        /* renamed from: d */
        public final long m6370d() {
            C4496a0 c4496a0 = this.f5823l;
            Intrinsics.checkNotNull(c4496a0);
            if (c4496a0.m5801b().m5853c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m5853c());
            }
            Date date = this.f5816e;
            if (date != null) {
                Date date2 = this.f5812a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f5818g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f5814c == null || this.f5823l.m5816r().m6141j().m5993o() != null) {
                return 0L;
            }
            Date date3 = this.f5812a;
            long time2 = date3 != null ? date3.getTime() : this.f5817f;
            Date date4 = this.f5814c;
            Intrinsics.checkNotNull(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        /* renamed from: e */
        public final boolean m6371e(C4522y c4522y) {
            return (c4522y.m6135d("If-Modified-Since") == null && c4522y.m6135d("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        public final boolean m6372f() {
            C4496a0 c4496a0 = this.f5823l;
            Intrinsics.checkNotNull(c4496a0);
            return c4496a0.m5801b().m5853c() == -1 && this.f5816e == null;
        }
    }

    public C4612b(C4522y c4522y, C4496a0 c4496a0) {
        this.f5810a = c4522y;
        this.f5811b = c4496a0;
    }

    /* renamed from: a */
    public final C4496a0 m6364a() {
        return this.f5811b;
    }

    /* renamed from: b */
    public final C4522y m6365b() {
        return this.f5810a;
    }
}
