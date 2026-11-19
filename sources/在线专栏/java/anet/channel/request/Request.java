package anet.channel.request;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C0953c;
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

/* loaded from: classes.dex */
public class Request {
    public static final String DEFAULT_CHARSET = "UTF-8";

    /* renamed from: a */
    public final RequestStatistic f5223a;

    /* renamed from: b */
    private HttpUrl f5224b;

    /* renamed from: c */
    private HttpUrl f5225c;

    /* renamed from: d */
    private HttpUrl f5226d;

    /* renamed from: e */
    private URL f5227e;

    /* renamed from: f */
    private String f5228f;

    /* renamed from: g */
    private Map<String, String> f5229g;

    /* renamed from: h */
    private Map<String, String> f5230h;

    /* renamed from: i */
    private String f5231i;

    /* renamed from: j */
    private BodyEntry f5232j;

    /* renamed from: k */
    private boolean f5233k;

    /* renamed from: l */
    private String f5234l;

    /* renamed from: m */
    private String f5235m;

    /* renamed from: n */
    private int f5236n;

    /* renamed from: o */
    private int f5237o;

    /* renamed from: p */
    private int f5238p;

    /* renamed from: q */
    private HostnameVerifier f5239q;

    /* renamed from: r */
    private SSLSocketFactory f5240r;

    /* renamed from: s */
    private boolean f5241s;

    public static class Builder {

        /* renamed from: a */
        private HttpUrl f5242a;

        /* renamed from: b */
        private HttpUrl f5243b;

        /* renamed from: e */
        private Map<String, String> f5246e;

        /* renamed from: f */
        private String f5247f;

        /* renamed from: g */
        private BodyEntry f5248g;

        /* renamed from: j */
        private HostnameVerifier f5251j;

        /* renamed from: k */
        private SSLSocketFactory f5252k;

        /* renamed from: l */
        private String f5253l;

        /* renamed from: m */
        private String f5254m;

        /* renamed from: q */
        private boolean f5258q;

        /* renamed from: c */
        private String f5244c = "GET";

        /* renamed from: d */
        private Map<String, String> f5245d = new HashMap();

        /* renamed from: h */
        private boolean f5249h = true;

        /* renamed from: i */
        private int f5250i = 0;

        /* renamed from: n */
        private int f5255n = 10000;

        /* renamed from: o */
        private int f5256o = 10000;

        /* renamed from: p */
        private RequestStatistic f5257p = null;

        public Builder addHeader(String str, String str2) {
            this.f5245d.put(str, str2);
            return this;
        }

        public Builder addParam(String str, String str2) {
            if (this.f5246e == null) {
                this.f5246e = new HashMap();
            }
            this.f5246e.put(str, str2);
            this.f5243b = null;
            return this;
        }

        public Request build() {
            if (this.f5248g == null && this.f5246e == null && Method.m4515a(this.f5244c)) {
                ALog.m4638e("awcn.Request", "method " + this.f5244c + " must have a request body", null, new Object[0]);
            }
            if (this.f5248g != null && !Method.m4516b(this.f5244c)) {
                ALog.m4638e("awcn.Request", "method " + this.f5244c + " should not have a request body", null, new Object[0]);
                this.f5248g = null;
            }
            BodyEntry bodyEntry = this.f5248g;
            if (bodyEntry != null && bodyEntry.getContentType() != null) {
                addHeader("Content-Type", this.f5248g.getContentType());
            }
            return new Request(this);
        }

        public Builder setAllowRequestInBg(boolean z3) {
            this.f5258q = z3;
            return this;
        }

        public Builder setBizId(String str) {
            this.f5253l = str;
            return this;
        }

        public Builder setBody(BodyEntry bodyEntry) {
            this.f5248g = bodyEntry;
            return this;
        }

        public Builder setCharset(String str) {
            this.f5247f = str;
            this.f5243b = null;
            return this;
        }

        public Builder setConnectTimeout(int i4) {
            if (i4 > 0) {
                this.f5255n = i4;
            }
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.f5245d.clear();
            if (map != null) {
                this.f5245d.putAll(map);
            }
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.f5251j = hostnameVerifier;
            return this;
        }

        public Builder setMethod(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("method is null or empty");
            }
            if ("GET".equalsIgnoreCase(str)) {
                this.f5244c = "GET";
            } else if ("POST".equalsIgnoreCase(str)) {
                this.f5244c = "POST";
            } else if (Method.OPTION.equalsIgnoreCase(str)) {
                this.f5244c = Method.OPTION;
            } else if (Method.HEAD.equalsIgnoreCase(str)) {
                this.f5244c = Method.HEAD;
            } else if (Method.PUT.equalsIgnoreCase(str)) {
                this.f5244c = Method.PUT;
            } else if (Method.DELETE.equalsIgnoreCase(str)) {
                this.f5244c = Method.DELETE;
            } else {
                this.f5244c = "GET";
            }
            return this;
        }

        public Builder setParams(Map<String, String> map) {
            this.f5246e = map;
            this.f5243b = null;
            return this;
        }

        public Builder setReadTimeout(int i4) {
            if (i4 > 0) {
                this.f5256o = i4;
            }
            return this;
        }

        public Builder setRedirectEnable(boolean z3) {
            this.f5249h = z3;
            return this;
        }

        public Builder setRedirectTimes(int i4) {
            this.f5250i = i4;
            return this;
        }

        public Builder setRequestStatistic(RequestStatistic requestStatistic) {
            this.f5257p = requestStatistic;
            return this;
        }

        public Builder setSeq(String str) {
            this.f5254m = str;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f5252k = sSLSocketFactory;
            return this;
        }

        public Builder setUrl(HttpUrl httpUrl) {
            this.f5242a = httpUrl;
            this.f5243b = null;
            return this;
        }

        public Builder setUrl(String str) {
            HttpUrl httpUrl = HttpUrl.parse(str);
            this.f5242a = httpUrl;
            this.f5243b = null;
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
        static boolean m4515a(String str) {
            return str.equals("POST") || str.equals(PUT);
        }

        /* renamed from: b */
        static boolean m4516b(String str) {
            return m4515a(str) || str.equals(DELETE) || str.equals(OPTION);
        }
    }

    /* renamed from: a */
    private Map<String, String> m4479a() {
        return AwcnConfig.isCookieHeaderRedundantFix() ? new HashMap(this.f5229g) : this.f5229g;
    }

    /* renamed from: b */
    private void m4480b() {
        String strM4629a = C0953c.m4629a(this.f5230h, getContentEncoding());
        if (!TextUtils.isEmpty(strM4629a)) {
            if (Method.m4515a(this.f5228f) && this.f5232j == null) {
                try {
                    this.f5232j = new ByteArrayEntry(strM4629a.getBytes(getContentEncoding()));
                    this.f5229g.put("Content-Type", "application/x-www-form-urlencoded; charset=" + getContentEncoding());
                } catch (UnsupportedEncodingException unused) {
                }
            } else {
                String strUrlString = this.f5224b.urlString();
                StringBuilder sb = new StringBuilder(strUrlString);
                if (sb.indexOf("?") == -1) {
                    sb.append('?');
                } else if (strUrlString.charAt(strUrlString.length() - 1) != '&') {
                    sb.append('&');
                }
                sb.append(strM4629a);
                HttpUrl httpUrl = HttpUrl.parse(sb.toString());
                if (httpUrl != null) {
                    this.f5225c = httpUrl;
                }
            }
        }
        if (this.f5225c == null) {
            this.f5225c = this.f5224b;
        }
    }

    public boolean containsBody() {
        return this.f5232j != null;
    }

    public String getBizId() {
        return this.f5234l;
    }

    public byte[] getBodyBytes() {
        if (this.f5232j == null) {
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
        return this.f5237o;
    }

    public String getContentEncoding() {
        String str = this.f5231i;
        return str != null ? str : "UTF-8";
    }

    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.f5229g);
    }

    public String getHost() {
        return this.f5225c.host();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f5239q;
    }

    public HttpUrl getHttpUrl() {
        return this.f5225c;
    }

    public String getMethod() {
        return this.f5228f;
    }

    public int getReadTimeout() {
        return this.f5238p;
    }

    public int getRedirectTimes() {
        return this.f5236n;
    }

    public String getSeq() {
        return this.f5235m;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f5240r;
    }

    public URL getUrl() {
        if (this.f5227e == null) {
            HttpUrl httpUrl = this.f5226d;
            if (httpUrl == null) {
                httpUrl = this.f5225c;
            }
            this.f5227e = httpUrl.toURL();
        }
        return this.f5227e;
    }

    public String getUrlString() {
        return this.f5225c.urlString();
    }

    public boolean isAllowRequestInBg() {
        return this.f5241s;
    }

    public boolean isRedirectEnable() {
        return this.f5233k;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f5244c = this.f5228f;
        builder.f5245d = m4479a();
        builder.f5246e = this.f5230h;
        builder.f5248g = this.f5232j;
        builder.f5247f = this.f5231i;
        builder.f5249h = this.f5233k;
        builder.f5250i = this.f5236n;
        builder.f5251j = this.f5239q;
        builder.f5252k = this.f5240r;
        builder.f5242a = this.f5224b;
        builder.f5243b = this.f5225c;
        builder.f5253l = this.f5234l;
        builder.f5254m = this.f5235m;
        builder.f5255n = this.f5237o;
        builder.f5256o = this.f5238p;
        builder.f5257p = this.f5223a;
        builder.f5258q = this.f5241s;
        return builder;
    }

    public int postBody(OutputStream outputStream) throws IOException {
        BodyEntry bodyEntry = this.f5232j;
        if (bodyEntry != null) {
            return bodyEntry.writeTo(outputStream);
        }
        return 0;
    }

    public void setDnsOptimize(String str, int i4) throws JSONException {
        if (str != null) {
            if (this.f5226d == null) {
                this.f5226d = new HttpUrl(this.f5225c);
            }
            this.f5226d.replaceIpAndPort(str, i4);
        } else {
            this.f5226d = null;
        }
        this.f5227e = null;
        this.f5223a.setIPAndPort(str, i4);
    }

    public void setUrlScheme(boolean z3) {
        if (this.f5226d == null) {
            this.f5226d = new HttpUrl(this.f5225c);
        }
        this.f5226d.setScheme(z3 ? HttpConstant.HTTPS : HttpConstant.HTTP);
        this.f5227e = null;
    }

    private Request(Builder builder) {
        this.f5228f = "GET";
        this.f5233k = true;
        this.f5236n = 0;
        this.f5237o = 10000;
        this.f5238p = 10000;
        this.f5228f = builder.f5244c;
        this.f5229g = builder.f5245d;
        this.f5230h = builder.f5246e;
        this.f5232j = builder.f5248g;
        this.f5231i = builder.f5247f;
        this.f5233k = builder.f5249h;
        this.f5236n = builder.f5250i;
        this.f5239q = builder.f5251j;
        this.f5240r = builder.f5252k;
        this.f5234l = builder.f5253l;
        this.f5235m = builder.f5254m;
        this.f5237o = builder.f5255n;
        this.f5238p = builder.f5256o;
        this.f5224b = builder.f5242a;
        HttpUrl httpUrl = builder.f5243b;
        this.f5225c = httpUrl;
        if (httpUrl == null) {
            m4480b();
        }
        this.f5223a = builder.f5257p != null ? builder.f5257p : new RequestStatistic(getHost(), this.f5234l);
        this.f5241s = builder.f5258q;
    }
}
