package androidx.work.impl.utils;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(26)
/* loaded from: classes3.dex */
public final class DurationApi26Impl {
    public static final long toMillisCompat(Duration duration) {
        AbstractC9133u.m16133g(duration, "<this>");
        return duration.toMillis();
    }
}
