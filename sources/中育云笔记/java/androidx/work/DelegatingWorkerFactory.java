package androidx.work;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public class DelegatingWorkerFactory extends WorkerFactory {
    private final List<WorkerFactory> factories = new CopyOnWriteArrayList();

    public final void addFactory(WorkerFactory workerFactory) {
        AbstractC9979u.m20294g(workerFactory, "workerFactory");
        this.factories.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker createWorker(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        AbstractC9979u.m20294g(appContext, "appContext");
        AbstractC9979u.m20294g(workerClassName, "workerClassName");
        AbstractC9979u.m20294g(workerParameters, "workerParameters");
        Iterator<T> it = this.factories.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker listenableWorkerCreateWorker = ((WorkerFactory) it.next()).createWorker(appContext, workerClassName, workerParameters);
                if (listenableWorkerCreateWorker != null) {
                    return listenableWorkerCreateWorker;
                }
            } catch (Throwable th) {
                Logger.get().error(DelegatingWorkerFactoryKt.TAG, "Unable to instantiate a ListenableWorker (" + workerClassName + ')', th);
                throw th;
            }
        }
        return null;
    }
}
