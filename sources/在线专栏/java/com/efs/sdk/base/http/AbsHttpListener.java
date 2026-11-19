package com.efs.sdk.base.http;

import com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1317b;

/* loaded from: classes.dex */
public abstract class AbsHttpListener implements InterfaceC1317b<HttpResponse> {
    public abstract void onError(HttpResponse httpResponse);

    public abstract void onSuccess(HttpResponse httpResponse);

    @Override // com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1317b
    public void result(HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ) {
            onError(httpResponse);
        } else {
            onSuccess(httpResponse);
        }
    }
}
