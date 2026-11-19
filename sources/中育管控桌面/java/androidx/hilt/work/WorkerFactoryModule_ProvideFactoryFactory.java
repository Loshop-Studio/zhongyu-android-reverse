package androidx.hilt.work;

import androidx.work.ListenableWorker;
import java.util.Map;
import javax.inject.Provider;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;

/* loaded from: classes2.dex */
public final class WorkerFactoryModule_ProvideFactoryFactory implements InterfaceC0017f {
    private final Provider<Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> workerFactoriesProvider;

    public WorkerFactoryModule_ProvideFactoryFactory(Provider<Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> provider) {
        this.workerFactoriesProvider = provider;
    }

    public static WorkerFactoryModule_ProvideFactoryFactory create(Provider<Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> provider) {
        return new WorkerFactoryModule_ProvideFactoryFactory(provider);
    }

    public static HiltWorkerFactory provideFactory(Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> map) {
        return (HiltWorkerFactory) AbstractC0016e.m26c(WorkerFactoryModule.provideFactory(map));
    }

    @Override // javax.inject.Provider
    public HiltWorkerFactory get() {
        return provideFactory(this.workerFactoriesProvider.get());
    }
}
