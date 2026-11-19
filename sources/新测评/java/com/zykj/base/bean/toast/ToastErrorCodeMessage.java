package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import com.zykj.lib.error.code.ErrorCodeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;", "Lcom/zykj/base/bean/toast/ToastMessage;", "errorInfo", "Lcom/zykj/lib/error/code/ErrorCodeInfo;", "<init>", "(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V", "getErrorInfo", "()Lcom/zykj/lib/error/code/ErrorCodeInfo;", "base_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class ToastErrorCodeMessage extends ToastMessage {
    private final ErrorCodeInfo errorInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastErrorCodeMessage(ErrorCodeInfo errorInfo) {
        super(errorInfo.getMessage(), errorInfo.getMessageResId());
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        this.errorInfo = errorInfo;
    }

    public final ErrorCodeInfo getErrorInfo() {
        return this.errorInfo;
    }
}
