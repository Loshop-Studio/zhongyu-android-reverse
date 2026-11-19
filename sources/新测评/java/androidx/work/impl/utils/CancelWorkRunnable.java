package androidx.work.impl.utils;

import androidx.autofill.HintConstants;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0014"}, m13558d2 = {"cancel", "", "workManagerImpl", "Landroidx/work/impl/WorkManagerImpl;", "workSpecId", "", "forAll", "Landroidx/work/Operation;", "forId", "id", "Ljava/util/UUID;", "forName", HintConstants.AUTOFILL_HINT_NAME, "forNameInline", "forTag", "tag", "iterativelyCancelWorkAndDependents", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "reschedulePendingWorkers", "work-runtime_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@JvmName(name = "CancelWorkRunnable")
/* loaded from: classes3.dex */
public final class CancelWorkRunnable {

    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13558d2 = {"<anonymous>", "", "invoke"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$forAll$1 */
    public static final class C48411 extends Lambda implements Function0<Unit> {
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48411(WorkManagerImpl workManagerImpl) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkDatabase workDatabase, WorkManagerImpl workManagerImpl) {
            Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
            while (it.hasNext()) {
                CancelWorkRunnable.cancel(workManagerImpl, it.next());
            }
            new PreferenceUtils(workDatabase).setLastCancelAllTimeMillis(workManagerImpl.getConfiguration().getClock().currentTimeMillis());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            final WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
            final WorkManagerImpl workManagerImpl = this.$workManagerImpl;
            workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.b
                @Override // java.lang.Runnable
                public final void run() {
                    CancelWorkRunnable.C48411.invoke$lambda$0(workDatabase, workManagerImpl);
                }
            });
        }
    }

    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13558d2 = {"<anonymous>", "", "invoke"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$forId$1 */
    public static final class C48421 extends Lambda implements Function0<Unit> {
        final /* synthetic */ UUID $id;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48421(WorkManagerImpl workManagerImpl, UUID uuid) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
            this.$id = uuid;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkManagerImpl workManagerImpl, UUID uuid) {
            String string = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            CancelWorkRunnable.cancel(workManagerImpl, string);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
            final WorkManagerImpl workManagerImpl = this.$workManagerImpl;
            final UUID uuid = this.$id;
            workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.c
                @Override // java.lang.Runnable
                public final void run() {
                    CancelWorkRunnable.C48421.invoke$lambda$0(workManagerImpl, uuid);
                }
            });
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13558d2 = {"<anonymous>", "", "invoke"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$forTag$1 */
    public static final class C48441 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $tag;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48441(WorkManagerImpl workManagerImpl, String str) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
            this.$tag = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
            Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(str).iterator();
            while (it.hasNext()) {
                CancelWorkRunnable.cancel(workManagerImpl, it.next());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            final WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
            final String str = this.$tag;
            final WorkManagerImpl workManagerImpl = this.$workManagerImpl;
            workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.d
                @Override // java.lang.Runnable
                public final void run() {
                    CancelWorkRunnable.C48441.invoke$lambda$0(workDatabase, str, workManagerImpl);
                }
            });
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel(WorkManagerImpl workManagerImpl, String str) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
        iterativelyCancelWorkAndDependents(workDatabase, str);
        Processor processor = workManagerImpl.getProcessor();
        Intrinsics.checkNotNullExpressionValue(processor, "workManagerImpl.processor");
        processor.stopAndCancelWork(str, 1);
        Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    public static final Operation forAll(WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelAllWork", serialTaskExecutor, new C48411(workManagerImpl));
    }

    public static final Operation forId(UUID id, WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelWorkById", serialTaskExecutor, new C48421(workManagerImpl, id));
    }

    public static final Operation forName(final String name, final WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str = "CancelWorkByName_" + name;
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str, serialTaskExecutor, new Function0<Unit>() { // from class: androidx.work.impl.utils.CancelWorkRunnable.forName.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CancelWorkRunnable.forNameInline(name, workManagerImpl);
                CancelWorkRunnable.reschedulePendingWorkers(workManagerImpl);
            }
        });
    }

    public static final void forNameInline(final String name, final WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.a
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable.forNameInline$lambda$0(workDatabase, name, workManagerImpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forNameInline$lambda$0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
        Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str).iterator();
        while (it.hasNext()) {
            cancel(workManagerImpl, it.next());
        }
    }

    public static final Operation forTag(String tag, WorkManagerImpl workManagerImpl) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str = "CancelWorkByTag_" + tag;
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        Intrinsics.checkNotNullExpressionValue(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str, serialTaskExecutor, new C48441(workManagerImpl, tag));
    }

    private static final void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        List listMutableListOf = CollectionsKt.mutableListOf(str);
        while (!listMutableListOf.isEmpty()) {
            String str2 = (String) CollectionsKt.removeLast(listMutableListOf);
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setCancelledState(str2);
            }
            listMutableListOf.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }
}
