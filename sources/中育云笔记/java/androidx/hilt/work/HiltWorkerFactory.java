package androidx.hilt.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import java.util.Map;
import p295pc.InterfaceC10652a;

/* loaded from: classes2.dex */
public final class HiltWorkerFactory extends WorkerFactory {
    private final Map<String, InterfaceC10652a> mWorkerFactories;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public HiltWorkerFactory(@NonNull Map<String, InterfaceC10652a> map) {
        this.mWorkerFactories = map;
    }

    @Override // androidx.work.WorkerFactory
    @Nullable
    public ListenableWorker createWorker(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        InterfaceC10652a interfaceC10652a = this.mWorkerFactories.get(str);
        if (interfaceC10652a == null) {
            return null;
        }
        return ((WorkerAssistedFactory) interfaceC10652a.get()).create(context, workerParameters);
    }
}
