package anetwork.channel.entity;

import android.text.TextUtils;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import anetwork.channel.Header;
import anetwork.channel.IBodyHandler;
import anetwork.channel.Param;
import anetwork.channel.Request;
import anetwork.channel.util.RequestConstant;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class RequestImpl implements Request {

    /* renamed from: a */
    @Deprecated
    private URI f2869a;

    /* renamed from: b */
    @Deprecated
    private URL f2870b;

    /* renamed from: c */
    private String f2871c;

    /* renamed from: e */
    private List<Header> f2873e;

    /* renamed from: g */
    private List<Param> f2875g;

    /* renamed from: k */
    private int f2879k;

    /* renamed from: l */
    private int f2880l;

    /* renamed from: m */
    private String f2881m;

    /* renamed from: n */
    private String f2882n;

    /* renamed from: o */
    private Map<String, String> f2883o;

    /* renamed from: d */
    private boolean f2872d = true;

    /* renamed from: f */
    private String f2874f = "GET";

    /* renamed from: h */
    private int f2876h = 2;

    /* renamed from: i */
    private String f2877i = "utf-8";

    /* renamed from: j */
    private BodyEntry f2878j = null;

    public RequestImpl() {
    }

    @Override // anetwork.channel.Request
    public void addHeader(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        if (this.f2873e == null) {
            this.f2873e = new ArrayList();
        }
        this.f2873e.add(new BasicHeader(str, str2));
    }

    @Override // anetwork.channel.Request
    public String getBizId() {
        return this.f2881m;
    }

    @Override // anetwork.channel.Request
    public BodyEntry getBodyEntry() {
        return this.f2878j;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public IBodyHandler getBodyHandler() {
        return null;
    }

    @Override // anetwork.channel.Request
    public String getCharset() {
        return this.f2877i;
    }

    @Override // anetwork.channel.Request
    public int getConnectTimeout() {
        return this.f2879k;
    }

    @Override // anetwork.channel.Request
    public Map<String, String> getExtProperties() {
        return this.f2883o;
    }

    @Override // anetwork.channel.Request
    public String getExtProperty(String str) {
        Map<String, String> map = this.f2883o;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // anetwork.channel.Request
    public boolean getFollowRedirects() {
        return this.f2872d;
    }

    @Override // anetwork.channel.Request
    public List<Header> getHeaders() {
        return this.f2873e;
    }

    @Override // anetwork.channel.Request
    public String getMethod() {
        return this.f2874f;
    }

    @Override // anetwork.channel.Request
    public List<Param> getParams() {
        return this.f2875g;
    }

    @Override // anetwork.channel.Request
    public int getReadTimeout() {
        return this.f2880l;
    }

    @Override // anetwork.channel.Request
    public int getRetryTime() {
        return this.f2876h;
    }

    @Override // anetwork.channel.Request
    public String getSeqNo() {
        return this.f2882n;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public URI getURI() {
        URI uri = this.f2869a;
        if (uri != null) {
            return uri;
        }
        if (this.f2871c != null) {
            try {
                this.f2869a = new URI(this.f2871c);
            } catch (Exception e10) {
                ALog.m2528e("anet.RequestImpl", "uri error", this.f2882n, e10, new Object[0]);
            }
        }
        return this.f2869a;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public URL getURL() {
        URL url = this.f2870b;
        if (url != null) {
            return url;
        }
        if (this.f2871c != null) {
            try {
                this.f2870b = new URL(this.f2871c);
            } catch (Exception e10) {
                ALog.m2528e("anet.RequestImpl", "url error", this.f2882n, e10, new Object[0]);
            }
        }
        return this.f2870b;
    }

    @Override // anetwork.channel.Request
    public String getUrlString() {
        return this.f2871c;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public boolean isCookieEnabled() {
        return !RequestConstant.FALSE.equals(getExtProperty(RequestConstant.ENABLE_COOKIE));
    }

    @Override // anetwork.channel.Request
    public void removeHeader(Header header) {
        List<Header> list = this.f2873e;
        if (list != null) {
            list.remove(header);
        }
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public void setBizId(int i10) {
        this.f2881m = String.valueOf(i10);
    }

    @Override // anetwork.channel.Request
    public void setBodyEntry(BodyEntry bodyEntry) {
        this.f2878j = bodyEntry;
    }

    @Override // anetwork.channel.Request
    public void setBodyHandler(IBodyHandler iBodyHandler) {
        this.f2878j = new BodyHandlerEntry(iBodyHandler);
    }

    @Override // anetwork.channel.Request
    public void setCharset(String str) {
        this.f2877i = str;
    }

    @Override // anetwork.channel.Request
    public void setConnectTimeout(int i10) {
        this.f2879k = i10;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public void setCookieEnabled(boolean z10) {
        setExtProperty(RequestConstant.ENABLE_COOKIE, z10 ? RequestConstant.TRUE : RequestConstant.FALSE);
    }

    @Override // anetwork.channel.Request
    public void setExtProperty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f2883o == null) {
            this.f2883o = new HashMap();
        }
        this.f2883o.put(str, str2);
    }

    @Override // anetwork.channel.Request
    public void setFollowRedirects(boolean z10) {
        this.f2872d = z10;
    }

    @Override // anetwork.channel.Request
    public void setHeader(Header header) {
        if (header == null) {
            return;
        }
        if (this.f2873e == null) {
            this.f2873e = new ArrayList();
        }
        int size = this.f2873e.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (header.getName().equalsIgnoreCase(this.f2873e.get(i10).getName())) {
                this.f2873e.set(i10, header);
                break;
            }
            i10++;
        }
        if (i10 < this.f2873e.size()) {
            this.f2873e.add(header);
        }
    }

    @Override // anetwork.channel.Request
    public void setHeaders(List<Header> list) {
        this.f2873e = list;
    }

    @Override // anetwork.channel.Request
    public void setMethod(String str) {
        this.f2874f = str;
    }

    @Override // anetwork.channel.Request
    public void setParams(List<Param> list) {
        this.f2875g = list;
    }

    @Override // anetwork.channel.Request
    public void setReadTimeout(int i10) {
        this.f2880l = i10;
    }

    @Override // anetwork.channel.Request
    public void setRetryTime(int i10) {
        this.f2876h = i10;
    }

    @Override // anetwork.channel.Request
    public void setSeqNo(String str) {
        this.f2882n = str;
    }

    @Deprecated
    public void setUrL(URL url) {
        this.f2870b = url;
        this.f2871c = url.toString();
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public void setUri(URI uri) {
        this.f2869a = uri;
    }

    @Override // anetwork.channel.Request
    public Header[] getHeaders(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f2873e != null) {
            for (int i10 = 0; i10 < this.f2873e.size(); i10++) {
                if (this.f2873e.get(i10) != null && this.f2873e.get(i10).getName() != null && this.f2873e.get(i10).getName().equalsIgnoreCase(str)) {
                    arrayList.add(this.f2873e.get(i10));
                }
            }
            if (arrayList.size() > 0) {
                Header[] headerArr = new Header[arrayList.size()];
                arrayList.toArray(headerArr);
                return headerArr;
            }
        }
        return null;
    }

    @Override // anetwork.channel.Request
    public void setBizId(String str) {
        this.f2881m = str;
    }

    @Deprecated
    public RequestImpl(URI uri) {
        this.f2869a = uri;
        this.f2871c = uri.toString();
    }

    @Deprecated
    public RequestImpl(URL url) {
        this.f2870b = url;
        this.f2871c = url.toString();
    }

    public RequestImpl(String str) {
        this.f2871c = str;
    }
}
