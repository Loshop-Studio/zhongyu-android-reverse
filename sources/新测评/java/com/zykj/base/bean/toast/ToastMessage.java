package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b'\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m13558d2 = {"Lcom/zykj/base/bean/toast/ToastMessage;", "", "message", "", "messageResId", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getMessageResId", "()Ljava/lang/Integer;", "setMessageResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "base_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class ToastMessage {
    private String message;
    private Integer messageResId;

    /* JADX WARN: Multi-variable type inference failed */
    public ToastMessage() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getMessageResId() {
        return this.messageResId;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setMessageResId(Integer num) {
        this.messageResId = num;
    }

    public ToastMessage(String str, @StringRes Integer num) {
        this.message = str;
        this.messageResId = num;
    }

    public /* synthetic */ ToastMessage(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num);
    }
}
