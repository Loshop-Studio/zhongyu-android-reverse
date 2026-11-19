package com.alibaba.sdk.android.oss.network;

import p058f5.InterfaceC6363e;

/* loaded from: classes3.dex */
public class CancellationHandler {
    private volatile InterfaceC6363e call;
    private volatile boolean isCancelled;

    public void cancel() {
        if (this.call != null) {
            this.call.cancel();
        }
        this.isCancelled = true;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCall(InterfaceC6363e interfaceC6363e) {
        this.call = interfaceC6363e;
    }
}
