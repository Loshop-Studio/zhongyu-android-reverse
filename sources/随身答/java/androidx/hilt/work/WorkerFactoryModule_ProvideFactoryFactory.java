package androidx.hilt.work;

import java.util.Map;
import p130h8.InterfaceC8110a;
import p315z7.AbstractC10011e;
import p315z7.InterfaceC10012f;

/* loaded from: classes3.dex */
public final class WorkerFactoryModule_ProvideFactoryFactory implements InterfaceC10012f {
    private final InterfaceC8110a workerFactoriesProvider;

    public WorkerFactoryModule_ProvideFactoryFactory(InterfaceC8110a interfaceC8110a) {
        this.workerFactoriesProvider = interfaceC8110a;
    }

    public static WorkerFactoryModule_ProvideFactoryFactory create(InterfaceC8110a interfaceC8110a) {
        return new WorkerFactoryModule_ProvideFactoryFactory(interfaceC8110a);
    }

    public static HiltWorkerFactory provideFactory(Map<String, InterfaceC8110a> map) {
        return (HiltWorkerFactory) AbstractC10011e.m17383c(WorkerFactoryModule.provideFactory(map));
    }

    @Override // p130h8.InterfaceC8110a
    public HiltWorkerFactory get() {
        return provideFactory((Map) this.workerFactoriesProvider.get());
    }
}
