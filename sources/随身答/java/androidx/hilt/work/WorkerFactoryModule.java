package androidx.hilt.work;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import java.util.Map;
import p130h8.InterfaceC8110a;

/* loaded from: classes3.dex */
abstract class WorkerFactoryModule {
    @NonNull
    public static HiltWorkerFactory provideFactory(@NonNull Map<String, InterfaceC8110a> map) {
        return new HiltWorkerFactory(map);
    }

    @NonNull
    public abstract Map<String, WorkerAssistedFactory<? extends ListenableWorker>> workerFactoriesMap();
}
