package com.alibaba.sdk.android.oss.network;

import p011a9.InterfaceC0042e;

/* loaded from: classes3.dex */
public class CancellationHandler {
    private volatile InterfaceC0042e call;
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

    public void setCall(InterfaceC0042e interfaceC0042e) {
        this.call = interfaceC0042e;
    }
}
