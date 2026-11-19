package com.alibaba.sdk.android.oss.network;

import okhttp3.InterfaceC6292e;
import okhttp3.internal.connection.C6310i;

/* loaded from: classes2.dex */
public class CancellationHandler {
    private volatile InterfaceC6292e call;
    private volatile boolean isCancelled;

    public void cancel() {
        if (this.call != null) {
            ((C6310i) this.call).cancel();
        }
        this.isCancelled = true;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCall(InterfaceC6292e interfaceC6292e) {
        this.call = interfaceC6292e;
    }
}
