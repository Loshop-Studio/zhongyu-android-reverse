package com.alibaba.sdk.android.oss.network;

import p172l8.InterfaceC8906e;

/* loaded from: classes3.dex */
public class CancellationHandler {
    private volatile InterfaceC8906e call;
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

    public void setCall(InterfaceC8906e interfaceC8906e) {
        this.call = interfaceC8906e;
    }
}
