package com.efs.sdk.base.http;

import androidx.annotation.NonNull;
import com.efs.sdk.base.p039a.p050h.p051a.InterfaceC5685b;
import com.efs.sdk.base.p039a.p050h.p052b.C5690a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class HttpEnv {
    private List<InterfaceC5685b<HttpResponse>> mHttpListenerList;
    private IHttpUtil mHttpUtil;

    public static class SingletonHolder {
        private static final HttpEnv INSTANCE = new HttpEnv();

        private SingletonHolder() {
        }
    }

    public static HttpEnv getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void addListener(@NonNull AbsHttpListener absHttpListener) {
        this.mHttpListenerList.add(absHttpListener);
    }

    public List<InterfaceC5685b<HttpResponse>> getHttpListenerList() {
        return new ArrayList(this.mHttpListenerList);
    }

    public IHttpUtil getHttpUtil() {
        return this.mHttpUtil;
    }

    public void removeListener(@NonNull AbsHttpListener absHttpListener) {
        this.mHttpListenerList.remove(absHttpListener);
    }

    public void setHttpUtil(IHttpUtil iHttpUtil) {
        this.mHttpUtil = iHttpUtil;
    }

    private HttpEnv() {
        this.mHttpUtil = C5690a.m4161a();
        this.mHttpListenerList = new ArrayList(1);
    }
}
