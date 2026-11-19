package androidx.work;

import android.content.Context;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class DefaultWorkerFactory extends WorkerFactory {
    public static final DefaultWorkerFactory INSTANCE = new DefaultWorkerFactory();

    private DefaultWorkerFactory() {
    }

    /* renamed from: createWorker, reason: collision with other method in class */
    public Void m33960createWorker(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        AbstractC9979u.m20294g(appContext, "appContext");
        AbstractC9979u.m20294g(workerClassName, "workerClassName");
        AbstractC9979u.m20294g(workerParameters, "workerParameters");
        return null;
    }

    @Override // androidx.work.WorkerFactory
    public /* bridge */ /* synthetic */ ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        return (ListenableWorker) m33960createWorker(context, str, workerParameters);
    }
}
