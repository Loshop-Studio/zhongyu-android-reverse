package androidx.hilt.work;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import java.util.Map;
import p279w8.InterfaceC9823a;

/* loaded from: classes2.dex */
abstract class WorkerFactoryModule {
    @NonNull
    public static HiltWorkerFactory provideFactory(@NonNull Map<String, InterfaceC9823a> map) {
        return new HiltWorkerFactory(map);
    }

    @NonNull
    public abstract Map<String, WorkerAssistedFactory<? extends ListenableWorker>> workerFactoriesMap();
}
