package androidx.hilt.work;

import androidx.work.ListenableWorker;
import java.util.Map;
import javax.inject.Provider;
import p167l6.AbstractC9257e;
import p167l6.InterfaceC9258f;

/* loaded from: classes3.dex */
public final class WorkerFactoryModule_ProvideFactoryFactory implements InterfaceC9258f {
    private final Provider<Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> workerFactoriesProvider;

    public WorkerFactoryModule_ProvideFactoryFactory(Provider<Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> provider) {
        this.workerFactoriesProvider = provider;
    }

    public static WorkerFactoryModule_ProvideFactoryFactory create(Provider<Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> provider) {
        return new WorkerFactoryModule_ProvideFactoryFactory(provider);
    }

    public static HiltWorkerFactory provideFactory(Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> map) {
        return (HiltWorkerFactory) AbstractC9257e.m16973c(WorkerFactoryModule.provideFactory(map));
    }

    @Override // javax.inject.Provider
    public HiltWorkerFactory get() {
        return provideFactory(this.workerFactoriesProvider.get());
    }
}
