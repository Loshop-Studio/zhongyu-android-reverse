package androidx.work.impl.utils;

import androidx.work.Configuration;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class PruneWorkRunnableKt {
    public static final Operation pruneWork(final WorkDatabase workDatabase, Configuration configuration, TaskExecutor executor) {
        AbstractC9979u.m20294g(workDatabase, "<this>");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(executor, "executor");
        Tracer tracer = configuration.getTracer();
        SerialExecutor serialTaskExecutor = executor.getSerialTaskExecutor();
        AbstractC9979u.m20293f(serialTaskExecutor, "executor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "PruneWork", serialTaskExecutor, new InterfaceC9529a() { // from class: androidx.work.impl.utils.PruneWorkRunnableKt.pruneWork.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33972invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33972invoke() {
                workDatabase.workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            }
        });
    }
}
