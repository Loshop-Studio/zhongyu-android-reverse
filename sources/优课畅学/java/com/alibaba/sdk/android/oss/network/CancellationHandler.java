package com.alibaba.sdk.android.oss.network;

import p136i9.InterfaceC8904e;

/* loaded from: classes3.dex */
public class CancellationHandler {
    private volatile InterfaceC8904e call;
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

    public void setCall(InterfaceC8904e interfaceC8904e) {
        this.call = interfaceC8904e;
    }
}
