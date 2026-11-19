package com.tendcloud.tenddata;

import android.os.SystemClock;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.tendcloud.tenddata.da */
/* loaded from: classes5.dex */
final class C7923da {

    /* renamed from: a */
    private static final int f14666a = 15000;

    /* renamed from: b */
    private static final int f14667b = 15000;

    /* renamed from: c */
    private URL f14668c;

    /* renamed from: d */
    private EnumC7926dd f14669d;

    /* renamed from: e */
    private C7925dc f14670e;

    /* renamed from: f */
    private C7924db f14671f;

    /* renamed from: g */
    private String f14672g;

    /* renamed from: h */
    private String f14673h;

    /* renamed from: i */
    private String f14674i;

    /* renamed from: j */
    private int f14675j;

    /* renamed from: k */
    private int f14676k;

    /* renamed from: com.tendcloud.tenddata.da$a */
    public static final class a {
        private C7924db body;
        private String cert;
        private C7925dc headers;
        private String host;

        /* renamed from: ip */
        private String f14677ip;
        private EnumC7926dd method;
        private URL url;
        private int connectionTimeout = 15000;
        private int readTimeout = 15000;

        public a body(C7924db c7924db) {
            this.body = c7924db;
            return this;
        }

        public C7923da build() {
            return new C7923da(this.url, this.method, this.headers, this.body, this.connectionTimeout, this.readTimeout, this.cert, this.host, this.f14677ip);
        }

        public a cert(String str) {
            this.cert = str;
            return this;
        }

        public a connectionTimeout(int i10) {
            this.connectionTimeout = i10;
            return this;
        }

        public a header(C7925dc c7925dc) {
            this.headers = c7925dc;
            return this;
        }

        public a host(String str) {
            this.host = str;
            return this;
        }

        /* renamed from: ip */
        public a m11673ip(String str) {
            this.f14677ip = str;
            return this;
        }

        public a method(EnumC7926dd enumC7926dd) {
            this.method = enumC7926dd;
            return this;
        }

        public a readTimeout(int i10) {
            this.readTimeout = i10;
            return this;
        }

        public a url(String str) {
            try {
                this.url = new URL(str);
                return this;
            } catch (MalformedURLException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }

    /* renamed from: a */
    public EnumC7926dd m11669a() {
        return this.f14669d;
    }

    /* renamed from: b */
    public C7927de m11672b() {
        C7927de c7927deM11682a = C7927de.m11682a("");
        try {
            C7927de c7927deM11671a = m11671a(false);
            if (c7927deM11671a.m11686b() != C7927de.m11680a()) {
                return c7927deM11671a;
            }
            String strM11651a = C7919cx.m11651a(this.f14673h);
            if (C7912cq.m11608b(strM11651a)) {
                return c7927deM11671a;
            }
            this.f14668c = C7920cy.m11659a(this.f14668c, strM11651a);
            return m11671a(true);
        } catch (Throwable unused) {
            return c7927deM11682a;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n url: ");
        sb2.append(this.f14668c);
        sb2.append("\n method: ");
        sb2.append(this.f14669d);
        sb2.append("\n headers: ");
        sb2.append(this.f14670e);
        sb2.append("\n content length: ");
        C7924db c7924db = this.f14671f;
        sb2.append(c7924db != null ? Integer.valueOf(c7924db.m11675a().length) : "");
        sb2.append("\n content Type: ");
        C7924db c7924db2 = this.f14671f;
        sb2.append(c7924db2 != null ? c7924db2.m11676b() : "");
        sb2.append("\n host: ");
        sb2.append(this.f14673h);
        sb2.append("\n ip: ");
        sb2.append(this.f14674i);
        sb2.append("\n connectionTimeout: ");
        sb2.append(this.f14675j);
        sb2.append("\n readTimeout: ");
        sb2.append(this.f14676k);
        sb2.append("\n cert:  ");
        sb2.append(this.f14672g);
        sb2.append(SignParameters.NEW_LINE);
        return sb2.toString();
    }

    private C7923da(URL url, EnumC7926dd enumC7926dd, C7925dc c7925dc, C7924db c7924db, int i10, int i11, String str, String str2, String str3) {
        this.f14668c = url;
        this.f14669d = enumC7926dd;
        this.f14670e = c7925dc;
        this.f14671f = c7924db;
        this.f14675j = i10;
        this.f14676k = i11;
        this.f14672g = str;
        this.f14673h = str2;
        this.f14674i = str3;
    }

    /* renamed from: a */
    public C7927de m11670a(AbstractC7841a abstractC7841a) {
        C7927de c7927deM11682a = C7927de.m11682a("");
        try {
            c7927deM11682a = m11671a(false);
            URL url = this.f14668c;
            String str = this.f14673h;
            if (abstractC7841a.name().equals("SDK") && c7927deM11682a.m11686b() == C7927de.m11680a()) {
                C7918cw.m11650a(str);
                int i10 = 0;
                while (true) {
                    if (i10 > C7918cw.f14643a.size()) {
                        break;
                    }
                    String strM11648a = C7918cw.m11648a();
                    this.f14673h = strM11648a;
                    URL urlM11649a = C7918cw.m11649a(url, strM11648a);
                    this.f14668c = urlM11649a;
                    if (url.equals(urlM11649a) && str.equals(this.f14673h)) {
                        break;
                    }
                    c7927deM11682a = m11671a(false);
                    C7918cw.m11650a(this.f14673h);
                    if (c7927deM11682a.m11686b() != C7927de.m11680a()) {
                        C7906ck.m11567a(C7843ab.f14307g, C7843ab.f14324x, C7843ab.f14269D, this.f14668c.toString());
                        C7906ck.m11567a(C7843ab.f14307g, C7843ab.f14324x, C7843ab.f14270E, this.f14673h);
                        break;
                    }
                    i10++;
                }
            }
            C7920cy.m11664b(this.f14673h, this.f14674i);
        } catch (Throwable unused) {
        }
        if (c7927deM11682a.m11686b() != C7927de.m11680a()) {
            String str2 = this.f14673h;
            C7920cy.m11662a(str2, C7920cy.m11663b(str2), 2);
            C7920cy.m11660a(this.f14673h);
            return c7927deM11682a;
        }
        if (C7920cy.m11658a(this.f14673h, 2) != null) {
            this.f14668c = C7920cy.m11659a(this.f14668c, C7920cy.m11658a(this.f14673h, 2));
            c7927deM11682a = m11671a(true);
            if (c7927deM11682a.m11686b() == C7927de.m11680a()) {
                C7920cy.m11662a(this.f14673h, null, 2);
            }
        } else {
            if (C7920cy.m11658a(this.f14673h, 1) != null) {
                this.f14668c = C7920cy.m11659a(this.f14668c, C7920cy.m11658a(this.f14673h, 1));
                c7927deM11682a = m11671a(true);
                if (c7927deM11682a.m11686b() != C7927de.m11680a()) {
                    String str3 = this.f14673h;
                    C7920cy.m11662a(str3, C7920cy.m11658a(str3, 1), 2);
                    C7920cy.m11660a(this.f14673h);
                }
            }
            if (c7927deM11682a.m11686b() == C7927de.m11680a() && C7920cy.m11658a(this.f14673h, 3) != null) {
                this.f14668c = C7920cy.m11659a(this.f14668c, C7920cy.m11658a(this.f14673h, 3));
                c7927deM11682a = m11671a(true);
                if (c7927deM11682a.m11686b() != C7927de.m11680a()) {
                    String str4 = this.f14673h;
                    C7920cy.m11662a(str4, C7920cy.m11658a(str4, 3), 2);
                }
            }
            if (c7927deM11682a.m11686b() == C7927de.m11680a() && C7920cy.m11658a(this.f14673h, 4) != null) {
                this.f14668c = C7920cy.m11659a(this.f14668c, C7920cy.m11658a(this.f14673h, 4));
                c7927deM11682a = m11671a(true);
                if (c7927deM11682a.m11686b() != C7927de.m11680a()) {
                    String str5 = this.f14673h;
                    C7920cy.m11662a(str5, C7920cy.m11658a(str5, 4), 2);
                }
            }
            if (c7927deM11682a.m11686b() == C7927de.m11680a() && C7919cx.m11652b(this.f14673h) == 3 && !C7919cx.m11653c(this.f14673h)) {
                String strM11651a = C7919cx.m11651a(this.f14673h);
                if (!C7912cq.m11608b(strM11651a)) {
                    this.f14668c = C7920cy.m11659a(this.f14668c, strM11651a);
                    C7919cx.updateTimeStamp(this.f14673h);
                    c7927deM11682a = m11671a(true);
                    if (c7927deM11682a.m11686b() != C7927de.m11680a()) {
                        C7920cy.m11661a(this.f14673h, strM11651a);
                    }
                }
            }
        }
        if (c7927deM11682a.m11686b() == C7927de.m11680a() && C7919cx.m11652b(this.f14673h) < 3) {
            C7919cx.updateFailureCountWithHost(this.f14673h);
        }
        return c7927deM11682a;
    }

    /* renamed from: a */
    public C7927de m11671a(boolean z10) {
        HttpURLConnection httpURLConnection = null;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.f14668c.openConnection();
            try {
                httpURLConnection2.setConnectTimeout(15000);
                httpURLConnection2.setReadTimeout(15000);
                URL url = this.f14668c;
                if (url != null && url.toString().startsWith("https://")) {
                    C7917cv.f14639a.put(Long.valueOf(Thread.currentThread().getId()), this.f14673h);
                    if (z10) {
                        C7917cv.setHostNameVerifyAllowAll(httpURLConnection2);
                    }
                }
                if (!C7912cq.m11608b(this.f14672g)) {
                    C7917cv.m11639a(httpURLConnection2, this.f14672g);
                }
                if (!C7912cq.m11608b(this.f14673h)) {
                    httpURLConnection2.setRequestProperty("Host", C7912cq.m11608b(this.f14668c.getHost()) ? this.f14673h : this.f14668c.getHost());
                    httpURLConnection2.setRequestProperty("Host", this.f14673h);
                }
                EnumC7926dd enumC7926dd = this.f14669d;
                if (enumC7926dd != null) {
                    enumC7926dd.m11679a(httpURLConnection2);
                }
                C7925dc c7925dc = this.f14670e;
                if (c7925dc != null) {
                    c7925dc.m11678a(httpURLConnection2);
                }
                C7924db c7924db = this.f14671f;
                if (c7924db != null) {
                    c7924db.m11674a(httpURLConnection2);
                }
                httpURLConnection2.connect();
                C7927de c7927deM11683a = C7927de.m11683a(this.f14673h, httpURLConnection2, jElapsedRealtime, this.f14671f);
                httpURLConnection2.disconnect();
                return c7927deM11683a;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    return C7927de.m11682a(th.getMessage());
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
