package androidx.work.impl.utils;

import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
public final class StatusRunnable {
    public static final ListenableFuture<List<WorkInfo>> forStringIds(WorkDatabase workDatabase, TaskExecutor executor, final List<String> ids) {
        AbstractC9979u.m20294g(workDatabase, "<this>");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(ids, "ids");
        return loadStatusFuture(workDatabase, executor, new InterfaceC9540l() { // from class: androidx.work.impl.utils.StatusRunnable.forStringIds.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final List<WorkInfo> invoke(WorkDatabase db2) {
                AbstractC9979u.m20294g(db2, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.workSpecDao().getWorkStatusPojoForIds(ids));
                AbstractC9979u.m20293f(listApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForIds(ids))");
                return listApply;
            }
        });
    }

    public static final ListenableFuture<List<WorkInfo>> forTag(WorkDatabase workDatabase, TaskExecutor executor, final String tag) {
        AbstractC9979u.m20294g(workDatabase, "<this>");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(tag, "tag");
        return loadStatusFuture(workDatabase, executor, new InterfaceC9540l() { // from class: androidx.work.impl.utils.StatusRunnable.forTag.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final List<WorkInfo> invoke(WorkDatabase db2) {
                AbstractC9979u.m20294g(db2, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.workSpecDao().getWorkStatusPojoForTag(tag));
                AbstractC9979u.m20293f(listApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForTag(tag))");
                return listApply;
            }
        });
    }

    public static final ListenableFuture<WorkInfo> forUUID(WorkDatabase workDatabase, TaskExecutor executor, final UUID id2) {
        AbstractC9979u.m20294g(workDatabase, "<this>");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(id2, "id");
        return loadStatusFuture(workDatabase, executor, new InterfaceC9540l() { // from class: androidx.work.impl.utils.StatusRunnable.forUUID.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final WorkInfo invoke(WorkDatabase db2) {
                AbstractC9979u.m20294g(db2, "db");
                WorkSpecDao workSpecDao = db2.workSpecDao();
                String string = id2.toString();
                AbstractC9979u.m20293f(string, "id.toString()");
                WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(string);
                if (workStatusPojoForId != null) {
                    return workStatusPojoForId.toWorkInfo();
                }
                return null;
            }
        });
    }

    public static final ListenableFuture<List<WorkInfo>> forUniqueWork(WorkDatabase workDatabase, TaskExecutor executor, final String name) {
        AbstractC9979u.m20294g(workDatabase, "<this>");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(name, "name");
        return loadStatusFuture(workDatabase, executor, new InterfaceC9540l() { // from class: androidx.work.impl.utils.StatusRunnable.forUniqueWork.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final List<WorkInfo> invoke(WorkDatabase db2) {
                AbstractC9979u.m20294g(db2, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.workSpecDao().getWorkStatusPojoForName(name));
                AbstractC9979u.m20293f(listApply, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
                return listApply;
            }
        });
    }

    public static final ListenableFuture<List<WorkInfo>> forWorkQuerySpec(WorkDatabase workDatabase, TaskExecutor executor, final WorkQuery querySpec) {
        AbstractC9979u.m20294g(workDatabase, "<this>");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(querySpec, "querySpec");
        return loadStatusFuture(workDatabase, executor, new InterfaceC9540l() { // from class: androidx.work.impl.utils.StatusRunnable.forWorkQuerySpec.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final List<WorkInfo> invoke(WorkDatabase db2) {
                AbstractC9979u.m20294g(db2, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db2.rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(querySpec)));
                AbstractC9979u.m20293f(listApply, "WORK_INFO_MAPPER.apply(d…(querySpec.toRawQuery()))");
                return listApply;
            }
        });
    }

    private static final <T> ListenableFuture<T> loadStatusFuture(final WorkDatabase workDatabase, TaskExecutor taskExecutor, final InterfaceC9540l interfaceC9540l) {
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        AbstractC9979u.m20293f(serialTaskExecutor, "executor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new InterfaceC9529a() { // from class: androidx.work.impl.utils.StatusRunnable.loadStatusFuture.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            @Override // p181hd.InterfaceC9529a
            public final T invoke() {
                return interfaceC9540l.invoke(workDatabase);
            }
        });
    }
}
