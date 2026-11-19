package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import sd.AbstractC11106e0;
import sd.AbstractC11115g1;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface TaskExecutor {
    default void executeOnTaskThread(@NonNull Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }

    @NonNull
    Executor getMainThreadExecutor();

    @NonNull
    SerialExecutor getSerialTaskExecutor();

    @NonNull
    default AbstractC11106e0 getTaskCoroutineDispatcher() {
        return AbstractC11115g1.m24721b(getSerialTaskExecutor());
    }
}
