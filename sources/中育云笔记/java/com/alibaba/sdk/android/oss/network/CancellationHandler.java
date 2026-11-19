package com.alibaba.sdk.android.oss.network;

import je.InterfaceC9725e;

/* loaded from: classes3.dex */
public class CancellationHandler {
    private volatile InterfaceC9725e call;
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

    public void setCall(InterfaceC9725e interfaceC9725e) {
        this.call = interfaceC9725e;
    }
}
