package anetwork.channel.entity;

import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C5076c;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.Utils;
import anetwork.channel.aidl.ParcelableRequest;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.util.C5137a;
import anetwork.channel.util.RequestConstant;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anetwork.channel.entity.g */
/* loaded from: classes3.dex */
public class C5121g {

    /* renamed from: b */
    public RequestStatistic f2904b;

    /* renamed from: c */
    public final int f2905c;

    /* renamed from: d */
    public final int f2906d;

    /* renamed from: e */
    public final String f2907e;

    /* renamed from: f */
    public final int f2908f;

    /* renamed from: g */
    private ParcelableRequest f2909g;

    /* renamed from: h */
    private Request f2910h;

    /* renamed from: j */
    private int f2912j;

    /* renamed from: k */
    private final boolean f2913k;

    /* renamed from: i */
    private int f2911i = 0;

    /* renamed from: a */
    public int f2903a = 0;

    public C5121g(ParcelableRequest parcelableRequest, int i10, boolean z10) {
        this.f2910h = null;
        this.f2912j = 0;
        if (parcelableRequest == null) {
            throw new IllegalArgumentException("request is null");
        }
        this.f2909g = parcelableRequest;
        this.f2908f = i10;
        this.f2913k = z10;
        this.f2907e = C5137a.m2654a(parcelableRequest.seqNo, i10 == 0 ? "HTTP" : "DGRD");
        int i11 = parcelableRequest.connectTimeout;
        this.f2905c = i11 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i11;
        int i12 = parcelableRequest.readTimeout;
        this.f2906d = i12 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i12;
        int i13 = parcelableRequest.retryTime;
        this.f2912j = (i13 < 0 || i13 > 3) ? 2 : i13;
        HttpUrl httpUrlM2614l = m2614l();
        RequestStatistic requestStatistic = new RequestStatistic(httpUrlM2614l.host(), String.valueOf(parcelableRequest.bizId));
        this.f2904b = requestStatistic;
        requestStatistic.url = httpUrlM2614l.simpleUrlString();
        this.f2910h = m2612b(httpUrlM2614l);
    }

    /* renamed from: b */
    private Request m2612b(HttpUrl httpUrl) {
        Request.Builder requestStatistic = new Request.Builder().setUrl(httpUrl).setMethod(this.f2909g.method).setBody(this.f2909g.bodyEntry).setReadTimeout(this.f2906d).setConnectTimeout(this.f2905c).setRedirectEnable(this.f2909g.allowRedirect).setRedirectTimes(this.f2911i).setBizId(this.f2909g.bizId).setSeq(this.f2907e).setRequestStatistic(this.f2904b);
        requestStatistic.setParams(this.f2909g.params);
        String str = this.f2909g.charset;
        if (str != null) {
            requestStatistic.setCharset(str);
        }
        requestStatistic.setHeaders(m2613c(httpUrl));
        return requestStatistic.build();
    }

    /* renamed from: l */
    private HttpUrl m2614l() {
        HttpUrl httpUrl = HttpUrl.parse(this.f2909g.url);
        if (httpUrl == null) {
            throw new IllegalArgumentException("url is invalid. url=" + this.f2909g.url);
        }
        if (NetworkConfigCenter.isSSLEnabled()) {
            if (RequestConstant.FALSE.equalsIgnoreCase(this.f2909g.getExtProperty(RequestConstant.ENABLE_SCHEME_REPLACE))) {
                httpUrl.lockScheme();
            }
            return httpUrl;
        }
        ALog.m2530i("anet.RequestConfig", "request ssl disabled.", this.f2907e, new Object[0]);
        httpUrl.downgradeSchemeAndLock();
        return httpUrl;
    }

    /* renamed from: a */
    public Request m2615a() {
        return this.f2910h;
    }

    /* renamed from: c */
    public boolean m2620c() {
        return this.f2913k;
    }

    /* renamed from: d */
    public boolean m2621d() {
        return this.f2903a < this.f2912j;
    }

    /* renamed from: e */
    public boolean m2622e() {
        if (!NetworkConfigCenter.isHttpSessionEnable() || RequestConstant.FALSE.equalsIgnoreCase(this.f2909g.getExtProperty(RequestConstant.ENABLE_HTTP_DNS))) {
            return false;
        }
        return NetworkConfigCenter.isAllowHttpIpRetry() || this.f2903a == 0;
    }

    /* renamed from: f */
    public HttpUrl m2623f() {
        return this.f2910h.getHttpUrl();
    }

    /* renamed from: g */
    public String m2624g() {
        return this.f2910h.getUrlString();
    }

    /* renamed from: h */
    public Map<String, String> m2625h() {
        return this.f2910h.getHeaders();
    }

    /* renamed from: i */
    public boolean m2626i() {
        return !RequestConstant.FALSE.equalsIgnoreCase(this.f2909g.getExtProperty(RequestConstant.ENABLE_COOKIE));
    }

    /* renamed from: j */
    public boolean m2627j() {
        return RequestConstant.TRUE.equals(this.f2909g.getExtProperty(RequestConstant.CHECK_CONTENT_LENGTH));
    }

    /* renamed from: k */
    public void m2628k() {
        int i10 = this.f2903a + 1;
        this.f2903a = i10;
        this.f2904b.retryTimes = i10;
    }

    /* renamed from: c */
    private Map<String, String> m2613c(HttpUrl httpUrl) {
        String strHost = httpUrl.host();
        boolean z10 = !C5076c.m2521a(strHost);
        if (strHost.length() > 2 && strHost.charAt(0) == '[' && strHost.charAt(strHost.length() - 1) == ']' && C5076c.m2522b(strHost.substring(1, strHost.length() - 1))) {
            z10 = false;
        }
        HashMap map = new HashMap();
        Map<String, String> map2 = this.f2909g.headers;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                if (!"Host".equalsIgnoreCase(key) && !":host".equalsIgnoreCase(key)) {
                    boolean zEqualsIgnoreCase = RequestConstant.TRUE.equalsIgnoreCase(this.f2909g.getExtProperty(RequestConstant.KEEP_CUSTOM_COOKIE));
                    if (!HttpConstant.COOKIE.equalsIgnoreCase(key) || zEqualsIgnoreCase) {
                        map.put(key, entry.getValue());
                    }
                } else if (!z10) {
                    map.put("Host", entry.getValue());
                }
            }
        }
        return map;
    }

    /* renamed from: a */
    public void m2617a(Request request) {
        this.f2910h = request;
    }

    /* renamed from: a */
    public String m2616a(String str) {
        return this.f2909g.getExtProperty(str);
    }

    /* renamed from: a */
    public void m2618a(HttpUrl httpUrl) {
        ALog.m2530i("anet.RequestConfig", "redirect", this.f2907e, "to url", httpUrl.toString());
        this.f2911i++;
        this.f2904b.url = httpUrl.simpleUrlString();
        this.f2910h = m2612b(httpUrl);
    }

    /* renamed from: b */
    public int m2619b() {
        return this.f2906d * (this.f2912j + 1);
    }
}
