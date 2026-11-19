package com.efs.sdk.base.http;

import com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1317b;
import com.efs.sdk.base.p035a.p046h.p048b.C1322a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class HttpEnv {
    private List<InterfaceC1317b<HttpResponse>> mHttpListenerList;
    private IHttpUtil mHttpUtil;

    static class SingletonHolder {
        private static final HttpEnv INSTANCE = new HttpEnv();

        private SingletonHolder() {
        }
    }

    public static HttpEnv getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void addListener(AbsHttpListener absHttpListener) {
        this.mHttpListenerList.add(absHttpListener);
    }

    public List<InterfaceC1317b<HttpResponse>> getHttpListenerList() {
        return new ArrayList(this.mHttpListenerList);
    }

    public IHttpUtil getHttpUtil() {
        return this.mHttpUtil;
    }

    public void removeListener(AbsHttpListener absHttpListener) {
        this.mHttpListenerList.remove(absHttpListener);
    }

    public void setHttpUtil(IHttpUtil iHttpUtil) {
        this.mHttpUtil = iHttpUtil;
    }

    private HttpEnv() {
        this.mHttpUtil = C1322a.m5551a();
        this.mHttpListenerList = new ArrayList(1);
    }
}
