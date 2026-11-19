package com.efs.sdk.base.http;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2945b;

/* loaded from: classes2.dex */
public abstract class AbsHttpListener implements InterfaceC2945b<HttpResponse> {
    public abstract void onError(@Nullable HttpResponse httpResponse);

    public abstract void onSuccess(@NonNull HttpResponse httpResponse);

    @Override // com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2945b
    public void result(@Nullable HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ) {
            onError(httpResponse);
        } else {
            onSuccess(httpResponse);
        }
    }
}
