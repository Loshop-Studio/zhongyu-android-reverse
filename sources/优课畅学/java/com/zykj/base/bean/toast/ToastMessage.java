package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import kotlin.jvm.internal.AbstractC9126n;

@Keep
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

    public /* synthetic */ ToastMessage(String str, Integer num, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num);
    }
}
