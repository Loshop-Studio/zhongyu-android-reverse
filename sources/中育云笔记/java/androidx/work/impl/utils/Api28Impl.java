package androidx.work.impl.utils;

import android.app.Application;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(28)
/* loaded from: classes3.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    public final String getProcessName() {
        String processName = Application.getProcessName();
        AbstractC9979u.m20293f(processName, "getProcessName()");
        return processName;
    }
}
