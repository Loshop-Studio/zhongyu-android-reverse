package com.friday.common.network;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class SessionNotReadyException extends IOException {
    public /* synthetic */ SessionNotReadyException(Throwable th, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : th);
    }

    public SessionNotReadyException(Throwable th) {
        super("登录信息暂未就绪，请稍后重试", th);
    }
}
