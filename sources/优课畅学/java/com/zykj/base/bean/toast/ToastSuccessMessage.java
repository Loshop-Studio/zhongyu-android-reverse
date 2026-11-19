package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC9126n;

@Keep
/* loaded from: classes4.dex */
public final class ToastSuccessMessage extends ToastMessage {
    /* JADX WARN: Multi-variable type inference failed */
    public ToastSuccessMessage() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ToastSuccessMessage(String str, Integer num, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num);
    }

    public ToastSuccessMessage(String str, Integer num) {
        super(str, num);
    }
}
