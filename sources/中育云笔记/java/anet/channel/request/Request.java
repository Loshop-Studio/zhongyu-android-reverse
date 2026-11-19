package anet.channel.request;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C5076c;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class Request {
    public static final String DEFAULT_CHARSET = "UTF-8";

    /* renamed from: a */
    public final RequestStatistic f2501a;

    /* renamed from: b */
    private HttpUrl f2502b;

    /* renamed from: c */
    private HttpUrl f2503c;

    /* renamed from: d */
    private HttpUrl f2504d;

    /* renamed from: e */
    private URL f2505e;

    /* renamed from: f */
    private String f2506f;

    /* renamed from: g */
    private Map<String, String> f2507g;

    /* renamed from: h */
    private Map<String, String> f2508h;

    /* renamed from: i */
    private String f2509i;

    /* renamed from: j */
    private BodyEntry f2510j;

    /* renamed from: k */
    private boolean f2511k;

    /* renamed from: l */
    private String f2512l;

    /* renamed from: m */
    private String f2513m;

    /* renamed from: n */
    private int f2514n;

    /* renamed from: o */
    private int f2515o;

    /* renamed from: p */
    private int f2516p;

    /* renamed from: q */
    private HostnameVerifier f2517q;

    /* renamed from: r */
    private SSLSocketFactory f2518r;

    /* renamed from: s */
    private boolean f2519s;

    public static class Builder {

        /* renamed from: a */
        private HttpUrl f2520a;

        /* renamed from: b */
        private HttpUrl f2521b;

        /* renamed from: e */
        private Map<String, String> f2524e;

        /* renamed from: f */
        private String f2525f;

        /* renamed from: g */
        private BodyEntry f2526g;

        /* renamed from: j */
        private HostnameVerifier f2529j;

        /* renamed from: k */
        private SSLSocketFactory f2530k;

        /* renamed from: l */
        private String f2531l;

        /* renamed from: m */
        private String f2532m;

        /* renamed from: q */
        private boolean f2536q;

        /* renamed from: c */
        private String f2522c = "GET";

        /* renamed from: d */
        private Map<String, String> f2523d = new HashMap();

        /* renamed from: h */
        private boolean f2527h = true;

        /* renamed from: i */
        private int f2528i = 0;

        /* renamed from: n */
        private int f2533n = 10000;

        /* renamed from: o */
        private int f2534o = 10000;

        /* renamed from: p */
        private RequestStatistic f2535p = null;

        public Builder addHeader(String str, String str2) {
            this.f2523d.put(str, str2);
            return this;
        }

        public Builder addParam(String str, String str2) {
            if (this.f2524e == null) {
                this.f2524e = new HashMap();
            }
            this.f2524e.put(str, str2);
            this.f2521b = null;
            return this;
        }

        public Request build() {
            if (this.f2526g == null && this.f2524e == null && Method.m2406a(this.f2522c)) {
                ALog.m2529e("awcn.Request", "method " + this.f2522c + " must have a request body", null, new Object[0]);
            }
            if (this.f2526g != null && !Method.m2407b(this.f2522c)) {
                ALog.m2529e("awcn.Request", "method " + this.f2522c + " should not have a request body", null, new Object[0]);
                this.f2526g = null;
            }
            BodyEntry bodyEntry = this.f2526g;
            if (bodyEntry != null && bodyEntry.getContentType() != null) {
                addHeader("Content-Type", this.f2526g.getContentType());
            }
            return new Request(this);
        }

        public Builder setAllowRequestInBg(boolean z10) {
            this.f2536q = z10;
            return this;
        }

        public Builder setBizId(String str) {
            this.f2531l = str;
            return this;
        }

        public Builder setBody(BodyEntry bodyEntry) {
            this.f2526g = bodyEntry;
            return this;
        }

        public Builder setCharset(String str) {
            this.f2525f = str;
            this.f2521b = null;
            return this;
        }

        public Builder setConnectTimeout(int i10) {
            if (i10 > 0) {
                this.f2533n = i10;
            }
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.f2523d.clear();
            if (map != null) {
                this.f2523d.putAll(map);
            }
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.f2529j = hostnameVerifier;
            return this;
        }

        public Builder setMethod(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("method is null or empty");
            }
            if ("GET".equalsIgnoreCase(str)) {
                this.f2522c = "GET";
                return this;
            }
            if ("POST".equalsIgnoreCase(str)) {
                this.f2522c = "POST";
                return this;
            }
            if (Method.OPTION.equalsIgnoreCase(str)) {
                this.f2522c = Method.OPTION;
                return this;
            }
            if (Method.HEAD.equalsIgnoreCase(str)) {
                this.f2522c = Method.HEAD;
                return this;
            }
            if (Method.PUT.equalsIgnoreCase(str)) {
                this.f2522c = Method.PUT;
                return this;
            }
            if (Method.DELETE.equalsIgnoreCase(str)) {
                this.f2522c = Method.DELETE;
                return this;
            }
            this.f2522c = "GET";
            return this;
        }

        public Builder setParams(Map<String, String> map) {
            this.f2524e = map;
            this.f2521b = null;
            return this;
        }

        public Builder setReadTimeout(int i10) {
            if (i10 > 0) {
                this.f2534o = i10;
            }
            return this;
        }

        public Builder setRedirectEnable(boolean z10) {
            this.f2527h = z10;
            return this;
        }

        public Builder setRedirectTimes(int i10) {
            this.f2528i = i10;
            return this;
        }

        public Builder setRequestStatistic(RequestStatistic requestStatistic) {
            this.f2535p = requestStatistic;
            return this;
        }

        public Builder setSeq(String str) {
            this.f2532m = str;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f2530k = sSLSocketFactory;
            return this;
        }

        public Builder setUrl(HttpUrl httpUrl) {
            this.f2520a = httpUrl;
            this.f2521b = null;
            return this;
        }

        public Builder setUrl(String str) {
            HttpUrl httpUrl = HttpUrl.parse(str);
            this.f2520a = httpUrl;
            this.f2521b = null;
            if (httpUrl != null) {
                return this;
            }
            throw new IllegalArgumentException("toURL is invalid! toURL = " + str);
        }
    }

    public static final class Method {
        public static final String DELETE = "DELETE";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String OPTION = "OPTIONS";
        public static final String POST = "POST";
        public static final String PUT = "PUT";

        /* renamed from: a */
        public static boolean m2406a(String str) {
            return str.equals("POST") || str.equals(PUT);
        }

        /* renamed from: b */
        public static boolean m2407b(String str) {
            return m2406a(str) || str.equals(DELETE) || str.equals(OPTION);
        }
    }

    /* renamed from: a */
    private Map<String, String> m2370a() {
        return AwcnConfig.isCookieHeaderRedundantFix() ? new HashMap(this.f2507g) : this.f2507g;
    }

    /* renamed from: b */
    private void m2371b() {
        String strM2520a = C5076c.m2520a(this.f2508h, getContentEncoding());
        if (!TextUtils.isEmpty(strM2520a)) {
            if (Method.m2406a(this.f2506f) && this.f2510j == null) {
                try {
                    this.f2510j = new ByteArrayEntry(strM2520a.getBytes(getContentEncoding()));
                    this.f2507g.put("Content-Type", "application/x-www-form-urlencoded; charset=" + getContentEncoding());
                } catch (UnsupportedEncodingException unused) {
                }
            } else {
                String strUrlString = this.f2502b.urlString();
                StringBuilder sb2 = new StringBuilder(strUrlString);
                if (sb2.indexOf("?") == -1) {
                    sb2.append('?');
                } else if (strUrlString.charAt(strUrlString.length() - 1) != '&') {
                    sb2.append('&');
                }
                sb2.append(strM2520a);
                HttpUrl httpUrl = HttpUrl.parse(sb2.toString());
                if (httpUrl != null) {
                    this.f2503c = httpUrl;
                }
            }
        }
        if (this.f2503c == null) {
            this.f2503c = this.f2502b;
        }
    }

    public boolean containsBody() {
        return this.f2510j != null;
    }

    public String getBizId() {
        return this.f2512l;
    }

    public byte[] getBodyBytes() {
        if (this.f2510j == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
        try {
            postBody(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public int getConnectTimeout() {
        return this.f2515o;
    }

    public String getContentEncoding() {
        String str = this.f2509i;
        return str != null ? str : DEFAULT_CHARSET;
    }

    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.f2507g);
    }

    public String getHost() {
        return this.f2503c.host();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f2517q;
    }

    public HttpUrl getHttpUrl() {
        return this.f2503c;
    }

    public String getMethod() {
        return this.f2506f;
    }

    public int getReadTimeout() {
        return this.f2516p;
    }

    public int getRedirectTimes() {
        return this.f2514n;
    }

    public String getSeq() {
        return this.f2513m;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f2518r;
    }

    public URL getUrl() {
        if (this.f2505e == null) {
            HttpUrl httpUrl = this.f2504d;
            if (httpUrl == null) {
                httpUrl = this.f2503c;
            }
            this.f2505e = httpUrl.toURL();
        }
        return this.f2505e;
    }

    public String getUrlString() {
        return this.f2503c.urlString();
    }

    public boolean isAllowRequestInBg() {
        return this.f2519s;
    }

    public boolean isRedirectEnable() {
        return this.f2511k;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f2522c = this.f2506f;
        builder.f2523d = m2370a();
        builder.f2524e = this.f2508h;
        builder.f2526g = this.f2510j;
        builder.f2525f = this.f2509i;
        builder.f2527h = this.f2511k;
        builder.f2528i = this.f2514n;
        builder.f2529j = this.f2517q;
        builder.f2530k = this.f2518r;
        builder.f2520a = this.f2502b;
        builder.f2521b = this.f2503c;
        builder.f2531l = this.f2512l;
        builder.f2532m = this.f2513m;
        builder.f2533n = this.f2515o;
        builder.f2534o = this.f2516p;
        builder.f2535p = this.f2501a;
        builder.f2536q = this.f2519s;
        return builder;
    }

    public int postBody(OutputStream outputStream) {
        BodyEntry bodyEntry = this.f2510j;
        if (bodyEntry != null) {
            return bodyEntry.writeTo(outputStream);
        }
        return 0;
    }

    public void setDnsOptimize(String str, int i10) throws JSONException {
        if (str != null) {
            if (this.f2504d == null) {
                this.f2504d = new HttpUrl(this.f2503c);
            }
            this.f2504d.replaceIpAndPort(str, i10);
        } else {
            this.f2504d = null;
        }
        this.f2505e = null;
        this.f2501a.setIPAndPort(str, i10);
    }

    public void setUrlScheme(boolean z10) {
        if (this.f2504d == null) {
            this.f2504d = new HttpUrl(this.f2503c);
        }
        this.f2504d.setScheme(z10 ? "https" : HttpConstant.HTTP);
        this.f2505e = null;
    }

    private Request(Builder builder) {
        this.f2506f = "GET";
        this.f2511k = true;
        this.f2514n = 0;
        this.f2515o = 10000;
        this.f2516p = 10000;
        this.f2506f = builder.f2522c;
        this.f2507g = builder.f2523d;
        this.f2508h = builder.f2524e;
        this.f2510j = builder.f2526g;
        this.f2509i = builder.f2525f;
        this.f2511k = builder.f2527h;
        this.f2514n = builder.f2528i;
        this.f2517q = builder.f2529j;
        this.f2518r = builder.f2530k;
        this.f2512l = builder.f2531l;
        this.f2513m = builder.f2532m;
        this.f2515o = builder.f2533n;
        this.f2516p = builder.f2534o;
        this.f2502b = builder.f2520a;
        HttpUrl httpUrl = builder.f2521b;
        this.f2503c = httpUrl;
        if (httpUrl == null) {
            m2371b();
        }
        this.f2501a = builder.f2535p != null ? builder.f2535p : new RequestStatistic(getHost(), this.f2512l);
        this.f2519s = builder.f2536q;
    }
}
