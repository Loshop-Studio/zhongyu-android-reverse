package com.huawei.hms.common;

import com.huawei.hms.support.api.client.Status;

/* loaded from: classes5.dex */
public class ApiException extends Exception {

    /* renamed from: c */
    public final Status f11438c;

    public ApiException(Status status) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(status.getStatusCode());
        sb2.append(": ");
        sb2.append(status.getStatusMessage() != null ? status.getStatusMessage() : "");
        super(sb2.toString());
        this.f11438c = status;
    }

    public int getStatusCode() {
        return this.f11438c.getStatusCode();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.f11438c.getStatusMessage();
    }
}
