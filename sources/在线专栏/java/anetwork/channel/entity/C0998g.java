package anetwork.channel.entity;

import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C0953c;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.Utils;
import anetwork.channel.aidl.ParcelableRequest;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.util.C1014a;
import anetwork.channel.util.RequestConstant;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anetwork.channel.entity.g */
/* loaded from: classes.dex */
public class C0998g {

    /* renamed from: b */
    public RequestStatistic f5626b;

    /* renamed from: c */
    public final int f5627c;

    /* renamed from: d */
    public final int f5628d;

    /* renamed from: e */
    public final String f5629e;

    /* renamed from: f */
    public final int f5630f;

    /* renamed from: g */
    private ParcelableRequest f5631g;

    /* renamed from: h */
    private Request f5632h;

    /* renamed from: j */
    private int f5634j;

    /* renamed from: k */
    private final boolean f5635k;

    /* renamed from: i */
    private int f5633i = 0;

    /* renamed from: a */
    public int f5625a = 0;

    public C0998g(ParcelableRequest parcelableRequest, int i4, boolean z3) {
        this.f5632h = null;
        this.f5634j = 0;
        if (parcelableRequest == null) {
            throw new IllegalArgumentException("request is null");
        }
        this.f5631g = parcelableRequest;
        this.f5630f = i4;
        this.f5635k = z3;
        this.f5629e = C1014a.m4763a(parcelableRequest.seqNo, i4 == 0 ? "HTTP" : "DGRD");
        int i5 = parcelableRequest.connectTimeout;
        this.f5627c = i5 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i5;
        int i6 = parcelableRequest.readTimeout;
        this.f5628d = i6 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i6;
        int i7 = parcelableRequest.retryTime;
        this.f5634j = (i7 < 0 || i7 > 3) ? 2 : i7;
        HttpUrl httpUrlM4723l = m4723l();
        RequestStatistic requestStatistic = new RequestStatistic(httpUrlM4723l.host(), String.valueOf(parcelableRequest.bizId));
        this.f5626b = requestStatistic;
        requestStatistic.url = httpUrlM4723l.simpleUrlString();
        this.f5632h = m4721b(httpUrlM4723l);
    }

    /* renamed from: b */
    private Request m4721b(HttpUrl httpUrl) {
        Request.Builder requestStatistic = new Request.Builder().setUrl(httpUrl).setMethod(this.f5631g.method).setBody(this.f5631g.bodyEntry).setReadTimeout(this.f5628d).setConnectTimeout(this.f5627c).setRedirectEnable(this.f5631g.allowRedirect).setRedirectTimes(this.f5633i).setBizId(this.f5631g.bizId).setSeq(this.f5629e).setRequestStatistic(this.f5626b);
        requestStatistic.setParams(this.f5631g.params);
        String str = this.f5631g.charset;
        if (str != null) {
            requestStatistic.setCharset(str);
        }
        requestStatistic.setHeaders(m4722c(httpUrl));
        return requestStatistic.build();
    }

    /* renamed from: l */
    private HttpUrl m4723l() {
        HttpUrl httpUrl = HttpUrl.parse(this.f5631g.url);
        if (httpUrl == null) {
            throw new IllegalArgumentException("url is invalid. url=" + this.f5631g.url);
        }
        if (!NetworkConfigCenter.isSSLEnabled()) {
            ALog.m4639i("anet.RequestConfig", "request ssl disabled.", this.f5629e, new Object[0]);
            httpUrl.downgradeSchemeAndLock();
        } else if (RequestConstant.FALSE.equalsIgnoreCase(this.f5631g.getExtProperty(RequestConstant.ENABLE_SCHEME_REPLACE))) {
            httpUrl.lockScheme();
        }
        return httpUrl;
    }

    /* renamed from: a */
    public Request m4724a() {
        return this.f5632h;
    }

    /* renamed from: c */
    public boolean m4729c() {
        return this.f5635k;
    }

    /* renamed from: d */
    public boolean m4730d() {
        return this.f5625a < this.f5634j;
    }

    /* renamed from: e */
    public boolean m4731e() {
        return NetworkConfigCenter.isHttpSessionEnable() && !RequestConstant.FALSE.equalsIgnoreCase(this.f5631g.getExtProperty(RequestConstant.ENABLE_HTTP_DNS)) && (NetworkConfigCenter.isAllowHttpIpRetry() || this.f5625a == 0);
    }

    /* renamed from: f */
    public HttpUrl m4732f() {
        return this.f5632h.getHttpUrl();
    }

    /* renamed from: g */
    public String m4733g() {
        return this.f5632h.getUrlString();
    }

    /* renamed from: h */
    public Map<String, String> m4734h() {
        return this.f5632h.getHeaders();
    }

    /* renamed from: i */
    public boolean m4735i() {
        return !RequestConstant.FALSE.equalsIgnoreCase(this.f5631g.getExtProperty(RequestConstant.ENABLE_COOKIE));
    }

    /* renamed from: j */
    public boolean m4736j() {
        return RequestConstant.TRUE.equals(this.f5631g.getExtProperty(RequestConstant.CHECK_CONTENT_LENGTH));
    }

    /* renamed from: k */
    public void m4737k() {
        int i4 = this.f5625a + 1;
        this.f5625a = i4;
        this.f5626b.retryTimes = i4;
    }

    /* renamed from: c */
    private Map<String, String> m4722c(HttpUrl httpUrl) {
        String strHost = httpUrl.host();
        boolean z3 = !C0953c.m4630a(strHost);
        if (strHost.length() > 2 && strHost.charAt(0) == '[' && strHost.charAt(strHost.length() - 1) == ']' && C0953c.m4631b(strHost.substring(1, strHost.length() - 1))) {
            z3 = false;
        }
        HashMap map = new HashMap();
        Map<String, String> map2 = this.f5631g.headers;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                if (!"Host".equalsIgnoreCase(key) && !":host".equalsIgnoreCase(key)) {
                    boolean zEqualsIgnoreCase = RequestConstant.TRUE.equalsIgnoreCase(this.f5631g.getExtProperty(RequestConstant.KEEP_CUSTOM_COOKIE));
                    if (!HttpConstant.COOKIE.equalsIgnoreCase(key) || zEqualsIgnoreCase) {
                        map.put(key, entry.getValue());
                    }
                } else if (!z3) {
                    map.put("Host", entry.getValue());
                }
            }
        }
        return map;
    }

    /* renamed from: a */
    public void m4726a(Request request) {
        this.f5632h = request;
    }

    /* renamed from: a */
    public String m4725a(String str) {
        return this.f5631g.getExtProperty(str);
    }

    /* renamed from: a */
    public void m4727a(HttpUrl httpUrl) {
        ALog.m4639i("anet.RequestConfig", "redirect", this.f5629e, "to url", httpUrl.toString());
        this.f5633i++;
        this.f5626b.url = httpUrl.simpleUrlString();
        this.f5632h = m4721b(httpUrl);
    }

    /* renamed from: b */
    public int m4728b() {
        return this.f5628d * (this.f5634j + 1);
    }
}
