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

/* loaded from: classes.dex */
public class RequestImpl implements Request {

    /* renamed from: a */
    @Deprecated
    private URI f5591a;

    /* renamed from: b */
    @Deprecated
    private URL f5592b;

    /* renamed from: c */
    private String f5593c;

    /* renamed from: e */
    private List<Header> f5595e;

    /* renamed from: g */
    private List<Param> f5597g;

    /* renamed from: k */
    private int f5601k;

    /* renamed from: l */
    private int f5602l;

    /* renamed from: m */
    private String f5603m;

    /* renamed from: n */
    private String f5604n;

    /* renamed from: o */
    private Map<String, String> f5605o;

    /* renamed from: d */
    private boolean f5594d = true;

    /* renamed from: f */
    private String f5596f = "GET";

    /* renamed from: h */
    private int f5598h = 2;

    /* renamed from: i */
    private String f5599i = "utf-8";

    /* renamed from: j */
    private BodyEntry f5600j = null;

    public RequestImpl() {
    }

    @Override // anetwork.channel.Request
    public void addHeader(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        if (this.f5595e == null) {
            this.f5595e = new ArrayList();
        }
        this.f5595e.add(new BasicHeader(str, str2));
    }

    @Override // anetwork.channel.Request
    public String getBizId() {
        return this.f5603m;
    }

    @Override // anetwork.channel.Request
    public BodyEntry getBodyEntry() {
        return this.f5600j;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public IBodyHandler getBodyHandler() {
        return null;
    }

    @Override // anetwork.channel.Request
    public String getCharset() {
        return this.f5599i;
    }

    @Override // anetwork.channel.Request
    public int getConnectTimeout() {
        return this.f5601k;
    }

    @Override // anetwork.channel.Request
    public Map<String, String> getExtProperties() {
        return this.f5605o;
    }

    @Override // anetwork.channel.Request
    public String getExtProperty(String str) {
        Map<String, String> map = this.f5605o;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // anetwork.channel.Request
    public boolean getFollowRedirects() {
        return this.f5594d;
    }

    @Override // anetwork.channel.Request
    public List<Header> getHeaders() {
        return this.f5595e;
    }

    @Override // anetwork.channel.Request
    public String getMethod() {
        return this.f5596f;
    }

    @Override // anetwork.channel.Request
    public List<Param> getParams() {
        return this.f5597g;
    }

    @Override // anetwork.channel.Request
    public int getReadTimeout() {
        return this.f5602l;
    }

    @Override // anetwork.channel.Request
    public int getRetryTime() {
        return this.f5598h;
    }

    @Override // anetwork.channel.Request
    public String getSeqNo() {
        return this.f5604n;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public URI getURI() {
        URI uri = this.f5591a;
        if (uri != null) {
            return uri;
        }
        if (this.f5593c != null) {
            try {
                this.f5591a = new URI(this.f5593c);
            } catch (Exception e4) {
                ALog.m4637e("anet.RequestImpl", "uri error", this.f5604n, e4, new Object[0]);
            }
        }
        return this.f5591a;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public URL getURL() {
        URL url = this.f5592b;
        if (url != null) {
            return url;
        }
        if (this.f5593c != null) {
            try {
                this.f5592b = new URL(this.f5593c);
            } catch (Exception e4) {
                ALog.m4637e("anet.RequestImpl", "url error", this.f5604n, e4, new Object[0]);
            }
        }
        return this.f5592b;
    }

    @Override // anetwork.channel.Request
    public String getUrlString() {
        return this.f5593c;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public boolean isCookieEnabled() {
        return !RequestConstant.FALSE.equals(getExtProperty(RequestConstant.ENABLE_COOKIE));
    }

    @Override // anetwork.channel.Request
    public void removeHeader(Header header) {
        List<Header> list = this.f5595e;
        if (list != null) {
            list.remove(header);
        }
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public void setBizId(int i4) {
        this.f5603m = String.valueOf(i4);
    }

    @Override // anetwork.channel.Request
    public void setBodyEntry(BodyEntry bodyEntry) {
        this.f5600j = bodyEntry;
    }

    @Override // anetwork.channel.Request
    public void setBodyHandler(IBodyHandler iBodyHandler) {
        this.f5600j = new BodyHandlerEntry(iBodyHandler);
    }

    @Override // anetwork.channel.Request
    public void setCharset(String str) {
        this.f5599i = str;
    }

    @Override // anetwork.channel.Request
    public void setConnectTimeout(int i4) {
        this.f5601k = i4;
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public void setCookieEnabled(boolean z3) {
        setExtProperty(RequestConstant.ENABLE_COOKIE, z3 ? RequestConstant.TRUE : RequestConstant.FALSE);
    }

    @Override // anetwork.channel.Request
    public void setExtProperty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f5605o == null) {
            this.f5605o = new HashMap();
        }
        this.f5605o.put(str, str2);
    }

    @Override // anetwork.channel.Request
    public void setFollowRedirects(boolean z3) {
        this.f5594d = z3;
    }

    @Override // anetwork.channel.Request
    public void setHeader(Header header) {
        if (header == null) {
            return;
        }
        if (this.f5595e == null) {
            this.f5595e = new ArrayList();
        }
        int i4 = 0;
        int size = this.f5595e.size();
        while (true) {
            if (i4 >= size) {
                break;
            }
            if (header.getName().equalsIgnoreCase(this.f5595e.get(i4).getName())) {
                this.f5595e.set(i4, header);
                break;
            }
            i4++;
        }
        if (i4 < this.f5595e.size()) {
            this.f5595e.add(header);
        }
    }

    @Override // anetwork.channel.Request
    public void setHeaders(List<Header> list) {
        this.f5595e = list;
    }

    @Override // anetwork.channel.Request
    public void setMethod(String str) {
        this.f5596f = str;
    }

    @Override // anetwork.channel.Request
    public void setParams(List<Param> list) {
        this.f5597g = list;
    }

    @Override // anetwork.channel.Request
    public void setReadTimeout(int i4) {
        this.f5602l = i4;
    }

    @Override // anetwork.channel.Request
    public void setRetryTime(int i4) {
        this.f5598h = i4;
    }

    @Override // anetwork.channel.Request
    public void setSeqNo(String str) {
        this.f5604n = str;
    }

    @Deprecated
    public void setUrL(URL url) {
        this.f5592b = url;
        this.f5593c = url.toString();
    }

    @Override // anetwork.channel.Request
    @Deprecated
    public void setUri(URI uri) {
        this.f5591a = uri;
    }

    @Override // anetwork.channel.Request
    public Header[] getHeaders(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f5595e == null) {
            return null;
        }
        for (int i4 = 0; i4 < this.f5595e.size(); i4++) {
            if (this.f5595e.get(i4) != null && this.f5595e.get(i4).getName() != null && this.f5595e.get(i4).getName().equalsIgnoreCase(str)) {
                arrayList.add(this.f5595e.get(i4));
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        Header[] headerArr = new Header[arrayList.size()];
        arrayList.toArray(headerArr);
        return headerArr;
    }

    @Override // anetwork.channel.Request
    public void setBizId(String str) {
        this.f5603m = str;
    }

    @Deprecated
    public RequestImpl(URI uri) {
        this.f5591a = uri;
        this.f5593c = uri.toString();
    }

    @Deprecated
    public RequestImpl(URL url) {
        this.f5592b = url;
        this.f5593c = url.toString();
    }

    public RequestImpl(String str) {
        this.f5593c = str;
    }
}
