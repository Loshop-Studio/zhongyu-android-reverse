package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.lib.error.code.ErrorCodeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m5174d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5175d2 = {"Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;", "Lcom/zykj/base/bean/toast/ToastMessage;", "errorInfo", "Lcom/zykj/lib/error/code/ErrorCodeInfo;", "(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V", "getErrorInfo", "()Lcom/zykj/lib/error/code/ErrorCodeInfo;", "base_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
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
