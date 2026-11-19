package androidx.hilt.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class HiltWorkerFactory extends WorkerFactory {
    private final Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> mWorkerFactories;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public HiltWorkerFactory(@NonNull Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> map) {
        this.mWorkerFactories = map;
    }

    @Override // androidx.work.WorkerFactory
    @Nullable
    public ListenableWorker createWorker(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Provider<WorkerAssistedFactory<? extends ListenableWorker>> provider = this.mWorkerFactories.get(str);
        if (provider == null) {
            return null;
        }
        return provider.get().create(context, workerParameters);
    }
}
