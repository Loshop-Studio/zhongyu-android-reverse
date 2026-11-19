package androidx.work;

import android.content.ComponentName;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.Data;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WorkerParametersExtensions {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Data buildDelegatedRemoteRequestData(String delegatedWorkerName, ComponentName componentName, Data inputData) {
        AbstractC9979u.m20294g(delegatedWorkerName, "delegatedWorkerName");
        AbstractC9979u.m20294g(componentName, "componentName");
        AbstractC9979u.m20294g(inputData, "inputData");
        Data.Builder builder = new Data.Builder();
        builder.putAll(inputData).putString("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName.getPackageName()).putString("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", componentName.getClassName()).putString("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", delegatedWorkerName);
        return builder.build();
    }

    public static final boolean isRemoteWorkRequest(WorkerParameters workerParameters) {
        AbstractC9979u.m20294g(workerParameters, "<this>");
        Data inputData = workerParameters.getInputData();
        AbstractC9979u.m20293f(inputData, "inputData");
        return isRemoteWorkRequest(inputData);
    }

    public static final /* synthetic */ <T extends ListenableWorker> WorkerParameters usingRemoteService(WorkerParameters workerParameters, ComponentName componentName) {
        AbstractC9979u.m20294g(workerParameters, "<this>");
        AbstractC9979u.m20294g(componentName, "componentName");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        String name = ListenableWorker.class.getName();
        AbstractC9979u.m20293f(name, "T::class.java.name");
        return usingRemoteService(workerParameters, name, componentName);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean isRemoteWorkRequest(Data data) {
        AbstractC9979u.m20294g(data, "<this>");
        return data.hasKeyWithValueOfType("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class) && data.hasKeyWithValueOfType("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class) && data.hasKeyWithValueOfType("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
    }

    public static final WorkerParameters usingRemoteService(WorkerParameters workerParameters, String workerClassName, ComponentName componentName) {
        AbstractC9979u.m20294g(workerParameters, "<this>");
        AbstractC9979u.m20294g(workerClassName, "workerClassName");
        AbstractC9979u.m20294g(componentName, "componentName");
        UUID id2 = workerParameters.getId();
        Data inputData = workerParameters.getInputData();
        AbstractC9979u.m20293f(inputData, "inputData");
        return new WorkerParameters(id2, buildDelegatedRemoteRequestData(workerClassName, componentName, inputData), workerParameters.getTags(), workerParameters.getRuntimeExtras(), workerParameters.getRunAttemptCount(), workerParameters.getGeneration(), workerParameters.getBackgroundExecutor(), workerParameters.getWorkerContext(), workerParameters.getTaskExecutor(), workerParameters.getWorkerFactory(), workerParameters.getProgressUpdater(), workerParameters.getForegroundUpdater());
    }
}
