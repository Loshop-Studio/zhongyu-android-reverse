package androidx.hilt.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import java.util.Map;
import p279w8.InterfaceC9823a;

/* loaded from: classes2.dex */
public final class HiltWorkerFactory extends WorkerFactory {
    private final Map<String, InterfaceC9823a> mWorkerFactories;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public HiltWorkerFactory(@NonNull Map<String, InterfaceC9823a> map) {
        this.mWorkerFactories = map;
    }

    @Override // androidx.work.WorkerFactory
    @Nullable
    public ListenableWorker createWorker(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        InterfaceC9823a interfaceC9823a = this.mWorkerFactories.get(str);
        if (interfaceC9823a == null) {
            return null;
        }
        return ((WorkerAssistedFactory) interfaceC9823a.get()).create(context, workerParameters);
    }
}
