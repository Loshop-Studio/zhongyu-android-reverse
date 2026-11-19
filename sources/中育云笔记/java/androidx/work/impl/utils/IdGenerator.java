package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class IdGenerator {
    private final WorkDatabase workDatabase;

    public IdGenerator(WorkDatabase workDatabase) {
        AbstractC9979u.m20294g(workDatabase, "workDatabase");
        this.workDatabase = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer nextAlarmManagerId$lambda$1(IdGenerator idGenerator) {
        return Integer.valueOf(IdGeneratorKt.nextId(idGenerator.workDatabase, IdGeneratorKt.NEXT_ALARM_MANAGER_ID_KEY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer nextJobSchedulerIdWithRange$lambda$0(IdGenerator idGenerator, int i10, int i11) {
        int iNextId = IdGeneratorKt.nextId(idGenerator.workDatabase, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY);
        if (i10 > iNextId || iNextId > i11) {
            IdGeneratorKt.updatePreference(idGenerator.workDatabase, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY, i10 + 1);
        } else {
            i10 = iNextId;
        }
        return Integer.valueOf(i10);
    }

    public final int nextAlarmManagerId() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return IdGenerator.nextAlarmManagerId$lambda$1(this.f2184a);
            }
        });
        AbstractC9979u.m20293f(objRunInTransaction, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        return ((Number) objRunInTransaction).intValue();
    }

    public final int nextJobSchedulerIdWithRange(final int i10, final int i11) {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return IdGenerator.nextJobSchedulerIdWithRange$lambda$0(this.f2185a, i10, i11);
            }
        });
        AbstractC9979u.m20293f(objRunInTransaction, "workDatabase.runInTransa…d\n            }\n        )");
        return ((Number) objRunInTransaction).intValue();
    }
}
