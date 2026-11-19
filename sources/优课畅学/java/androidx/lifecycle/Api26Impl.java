package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(26)
/* loaded from: classes3.dex */
public final class Api26Impl {
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final long toMillis(Duration timeout) {
        AbstractC9133u.m16133g(timeout, "timeout");
        return timeout.toMillis();
    }
}
