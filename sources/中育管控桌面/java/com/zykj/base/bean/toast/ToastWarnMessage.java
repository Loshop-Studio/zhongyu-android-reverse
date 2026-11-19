package com.zykj.base.bean.toast;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7880d2 = {"Lcom/zykj/base/bean/toast/ToastWarnMessage;", "Lcom/zykj/base/bean/toast/ToastMessage;", "message", "", "messageResId", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "base_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class ToastWarnMessage extends ToastMessage {
    /* JADX WARN: Multi-variable type inference failed */
    public ToastWarnMessage() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ToastWarnMessage(String str, Integer num, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : num);
    }

    public ToastWarnMessage(String str, Integer num) {
        super(str, num);
    }
}
