package androidx.hilt.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public interface WorkerAssistedFactory<T extends ListenableWorker> {
    @NonNull
    T create(@NonNull Context context, @NonNull WorkerParameters workerParameters);
}
