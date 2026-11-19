package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m7880d2 = {"Lcom/zykj/base/bean/toast/ToastErrorMessage;", "Lcom/zykj/base/bean/toast/ToastMessage;", "code", "", "message", "", "messageResId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "base_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class ToastErrorMessage extends ToastMessage {
    private final Integer code;

    public ToastErrorMessage() {
        this(null, null, null, 7, null);
    }

    public final Integer getCode() {
        return this.code;
    }

    public /* synthetic */ ToastErrorMessage(Integer num, String str, Integer num2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : num, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : num2);
    }

    public ToastErrorMessage(Integer num, String str, Integer num2) {
        super(str, num2);
        this.code = num;
    }
}
