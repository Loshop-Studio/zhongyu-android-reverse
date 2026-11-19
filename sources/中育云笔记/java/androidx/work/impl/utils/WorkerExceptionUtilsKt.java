package androidx.work.impl.utils;

import androidx.core.util.Consumer;
import androidx.work.Logger;
import androidx.work.WorkerExceptionInfo;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WorkerExceptionUtilsKt {
    public static final void safeAccept(Consumer<WorkerExceptionInfo> consumer, WorkerExceptionInfo info, String tag) {
        AbstractC9979u.m20294g(consumer, "<this>");
        AbstractC9979u.m20294g(info, "info");
        AbstractC9979u.m20294g(tag, "tag");
        try {
            consumer.accept(info);
        } catch (Throwable th) {
            Logger.get().error(tag, "Exception handler threw an exception", th);
        }
    }
}
