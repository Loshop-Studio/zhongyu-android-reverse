package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC9126n;

@Keep
/* loaded from: classes4.dex */
public final class ToastErrorMessage extends ToastMessage {
    private final Integer code;

    public ToastErrorMessage() {
        this(null, null, null, 7, null);
    }

    public final Integer getCode() {
        return this.code;
    }

    public /* synthetic */ ToastErrorMessage(Integer num, String str, Integer num2, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : num2);
    }

    public ToastErrorMessage(Integer num, String str, Integer num2) {
        super(str, num2);
        this.code = num;
    }
}
