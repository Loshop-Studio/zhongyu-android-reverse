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
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class StatusRunnable {
    public static final ListenableFuture<List<WorkInfo>> forStringIds(WorkDatabase workDatabase, TaskExecutor executor, final List<String> ids) {
        AbstractC9133u.m16133g(workDatabase, "<this>");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(ids, "ids");
        return loadStatusFuture(workDatabase, executor, new InterfaceC10570l() { // from class: androidx.work.impl.utils.StatusRunnable.forStringIds.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final List<WorkInfo> invoke(WorkDatabase db) {
                AbstractC9133u.m16133g(db, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db.workSpecDao().getWorkStatusPojoForIds(ids));
                AbstractC9133u.m16132f(listApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForIds(ids))");
                return listApply;
            }
        });
    }

    public static final ListenableFuture<List<WorkInfo>> forTag(WorkDatabase workDatabase, TaskExecutor executor, final String tag) {
        AbstractC9133u.m16133g(workDatabase, "<this>");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(tag, "tag");
        return loadStatusFuture(workDatabase, executor, new InterfaceC10570l() { // from class: androidx.work.impl.utils.StatusRunnable.forTag.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final List<WorkInfo> invoke(WorkDatabase db) {
                AbstractC9133u.m16133g(db, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db.workSpecDao().getWorkStatusPojoForTag(tag));
                AbstractC9133u.m16132f(listApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForTag(tag))");
                return listApply;
            }
        });
    }

    public static final ListenableFuture<WorkInfo> forUUID(WorkDatabase workDatabase, TaskExecutor executor, final UUID id) {
        AbstractC9133u.m16133g(workDatabase, "<this>");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(id, "id");
        return loadStatusFuture(workDatabase, executor, new InterfaceC10570l() { // from class: androidx.work.impl.utils.StatusRunnable.forUUID.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final WorkInfo invoke(WorkDatabase db) {
                AbstractC9133u.m16133g(db, "db");
                WorkSpecDao workSpecDao = db.workSpecDao();
                String string = id.toString();
                AbstractC9133u.m16132f(string, "id.toString()");
                WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(string);
                if (workStatusPojoForId != null) {
                    return workStatusPojoForId.toWorkInfo();
                }
                return null;
            }
        });
    }

    public static final ListenableFuture<List<WorkInfo>> forUniqueWork(WorkDatabase workDatabase, TaskExecutor executor, final String name) {
        AbstractC9133u.m16133g(workDatabase, "<this>");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(name, "name");
        return loadStatusFuture(workDatabase, executor, new InterfaceC10570l() { // from class: androidx.work.impl.utils.StatusRunnable.forUniqueWork.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final List<WorkInfo> invoke(WorkDatabase db) {
                AbstractC9133u.m16133g(db, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db.workSpecDao().getWorkStatusPojoForName(name));
                AbstractC9133u.m16132f(listApply, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
                return listApply;
            }
        });
    }

    public static final ListenableFuture<List<WorkInfo>> forWorkQuerySpec(WorkDatabase workDatabase, TaskExecutor executor, final WorkQuery querySpec) {
        AbstractC9133u.m16133g(workDatabase, "<this>");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(querySpec, "querySpec");
        return loadStatusFuture(workDatabase, executor, new InterfaceC10570l() { // from class: androidx.work.impl.utils.StatusRunnable.forWorkQuerySpec.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final List<WorkInfo> invoke(WorkDatabase db) {
                AbstractC9133u.m16133g(db, "db");
                List<WorkInfo> listApply = WorkSpec.WORK_INFO_MAPPER.apply(db.rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(querySpec)));
                AbstractC9133u.m16132f(listApply, "WORK_INFO_MAPPER.apply(d…(querySpec.toRawQuery()))");
                return listApply;
            }
        });
    }

    private static final <T> ListenableFuture<T> loadStatusFuture(final WorkDatabase workDatabase, TaskExecutor taskExecutor, final InterfaceC10570l interfaceC10570l) {
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        AbstractC9133u.m16132f(serialTaskExecutor, "executor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new InterfaceC10559a() { // from class: androidx.work.impl.utils.StatusRunnable.loadStatusFuture.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            @Override // p300x7.InterfaceC10559a
            public final T invoke() {
                return interfaceC10570l.invoke(workDatabase);
            }
        });
    }
}
