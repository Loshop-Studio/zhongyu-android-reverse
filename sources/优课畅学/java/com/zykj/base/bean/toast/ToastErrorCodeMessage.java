package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import com.zykj.lib.error.code.ErrorCodeInfo;
import kotlin.jvm.internal.AbstractC9133u;

@Keep
/* loaded from: classes4.dex */
public final class ToastErrorCodeMessage extends ToastMessage {
    private final ErrorCodeInfo errorInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastErrorCodeMessage(ErrorCodeInfo errorInfo) {
        super(errorInfo.getMessage(), errorInfo.getMessageResId());
        AbstractC9133u.m16133g(errorInfo, "errorInfo");
        this.errorInfo = errorInfo;
    }

    public final ErrorCodeInfo getErrorInfo() {
        return this.errorInfo;
    }
}
