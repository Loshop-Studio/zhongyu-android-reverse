package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m5175d2 = {"Lcom/zykj/base/bean/toast/ToastErrorMessage;", "Lcom/zykj/base/bean/toast/ToastMessage;", "code", "", "message", "", "messageResId", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "base_release"}, m5176k = 1, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ToastErrorMessage extends ToastMessage {
    private final Integer code;

    public ToastErrorMessage() {
        this(null, null, null, 7, null);
    }

    public final Integer getCode() {
        return this.code;
    }

    public /* synthetic */ ToastErrorMessage(Integer num, String str, Integer num2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : num, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : num2);
    }

    public ToastErrorMessage(Integer num, String str, Integer num2) {
        super(str, num2);
        this.code = num;
    }
}
