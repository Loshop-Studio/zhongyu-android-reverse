package androidx.hilt.work;

import java.util.Map;
import p166gc.AbstractC9291e;
import p166gc.InterfaceC9292f;
import p295pc.InterfaceC10652a;

/* loaded from: classes2.dex */
public final class WorkerFactoryModule_ProvideFactoryFactory implements InterfaceC9292f {
    private final InterfaceC10652a workerFactoriesProvider;

    public WorkerFactoryModule_ProvideFactoryFactory(InterfaceC10652a interfaceC10652a) {
        this.workerFactoriesProvider = interfaceC10652a;
    }

    public static WorkerFactoryModule_ProvideFactoryFactory create(InterfaceC10652a interfaceC10652a) {
        return new WorkerFactoryModule_ProvideFactoryFactory(interfaceC10652a);
    }

    public static HiltWorkerFactory provideFactory(Map<String, InterfaceC10652a> map) {
        return (HiltWorkerFactory) AbstractC9291e.m18323c(WorkerFactoryModule.provideFactory(map));
    }

    @Override // p295pc.InterfaceC10652a
    public HiltWorkerFactory get() {
        return provideFactory((Map) this.workerFactoriesProvider.get());
    }
}
