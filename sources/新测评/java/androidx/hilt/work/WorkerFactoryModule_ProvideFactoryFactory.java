package androidx.hilt.work;

import java.util.Map;
import p192o8.AbstractC8726e;
import p192o8.InterfaceC8727f;
import p279w8.InterfaceC9823a;

/* loaded from: classes2.dex */
public final class WorkerFactoryModule_ProvideFactoryFactory implements InterfaceC8727f {
    private final InterfaceC9823a workerFactoriesProvider;

    public WorkerFactoryModule_ProvideFactoryFactory(InterfaceC9823a interfaceC9823a) {
        this.workerFactoriesProvider = interfaceC9823a;
    }

    public static WorkerFactoryModule_ProvideFactoryFactory create(InterfaceC9823a interfaceC9823a) {
        return new WorkerFactoryModule_ProvideFactoryFactory(interfaceC9823a);
    }

    public static HiltWorkerFactory provideFactory(Map<String, InterfaceC9823a> map) {
        return (HiltWorkerFactory) AbstractC8726e.m14366c(WorkerFactoryModule.provideFactory(map));
    }

    @Override // p279w8.InterfaceC9823a
    public HiltWorkerFactory get() {
        return provideFactory((Map) this.workerFactoriesProvider.get());
    }
}
