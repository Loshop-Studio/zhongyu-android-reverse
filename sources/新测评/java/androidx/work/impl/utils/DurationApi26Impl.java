package androidx.work.impl.utils;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi(26)
@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m13558d2 = {"toMillisCompat", "", "Ljava/time/Duration;", "work-runtime_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@JvmName(name = "DurationApi26Impl")
/* loaded from: classes3.dex */
public final class DurationApi26Impl {
    public static final long toMillisCompat(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return duration.toMillis();
    }
}
