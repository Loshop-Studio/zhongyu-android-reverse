package androidx.hilt.work;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: classes3.dex */
abstract class WorkerFactoryModule {
    @NonNull
    public static HiltWorkerFactory provideFactory(@NonNull Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> map) {
        return new HiltWorkerFactory(map);
    }

    @NonNull
    public abstract Map<String, WorkerAssistedFactory<? extends ListenableWorker>> workerFactoriesMap();
}
