package androidx.hilt.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import java.util.Map;
import p130h8.InterfaceC8110a;

/* loaded from: classes3.dex */
public final class HiltWorkerFactory extends WorkerFactory {
    private final Map<String, InterfaceC8110a> mWorkerFactories;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public HiltWorkerFactory(@NonNull Map<String, InterfaceC8110a> map) {
        this.mWorkerFactories = map;
    }

    @Override // androidx.work.WorkerFactory
    @Nullable
    public ListenableWorker createWorker(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        InterfaceC8110a interfaceC8110a = this.mWorkerFactories.get(str);
        if (interfaceC8110a == null) {
            return null;
        }
        return ((WorkerAssistedFactory) interfaceC8110a.get()).create(context, workerParameters);
    }
}
