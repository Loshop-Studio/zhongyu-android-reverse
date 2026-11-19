package androidx.hilt.work;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import java.util.Map;
import p295pc.InterfaceC10652a;

/* loaded from: classes2.dex */
abstract class WorkerFactoryModule {
    @NonNull
    public static HiltWorkerFactory provideFactory(@NonNull Map<String, InterfaceC10652a> map) {
        return new HiltWorkerFactory(map);
    }

    @NonNull
    public abstract Map<String, WorkerAssistedFactory<? extends ListenableWorker>> workerFactoriesMap();
}
