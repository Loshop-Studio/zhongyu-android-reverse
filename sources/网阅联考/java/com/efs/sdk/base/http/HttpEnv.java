package com.efs.sdk.base.http;

import android.support.annotation.NonNull;
import com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2945b;
import com.efs.sdk.base.p020a.p031h.p033b.C2950a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class HttpEnv {
    private List<InterfaceC2945b<HttpResponse>> mHttpListenerList;
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

    public List<InterfaceC2945b<HttpResponse>> getHttpListenerList() {
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
        this.mHttpUtil = C2950a.m2192a();
        this.mHttpListenerList = new ArrayList(1);
    }
}
