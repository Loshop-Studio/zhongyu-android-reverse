package androidx.work.impl.utils;

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
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class CancelWorkRunnable {

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$forAll$1 */
    public static final class C48741 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48741(WorkManagerImpl workManagerImpl) {
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

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m33968invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m33968invoke() {
            final WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            AbstractC9979u.m20293f(workDatabase, "workManagerImpl.workDatabase");
            final WorkManagerImpl workManagerImpl = this.$workManagerImpl;
            workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.b
                @Override // java.lang.Runnable
                public final void run() {
                    CancelWorkRunnable.C48741.invoke$lambda$0(workDatabase, workManagerImpl);
                }
            });
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$forId$1 */
    public static final class C48751 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ UUID $id;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48751(WorkManagerImpl workManagerImpl, UUID uuid) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
            this.$id = uuid;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkManagerImpl workManagerImpl, UUID uuid) {
            String string = uuid.toString();
            AbstractC9979u.m20293f(string, "id.toString()");
            CancelWorkRunnable.cancel(workManagerImpl, string);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m33969invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m33969invoke() {
            WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            AbstractC9979u.m20293f(workDatabase, "workManagerImpl.workDatabase");
            final WorkManagerImpl workManagerImpl = this.$workManagerImpl;
            final UUID uuid = this.$id;
            workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.c
                @Override // java.lang.Runnable
                public final void run() {
                    CancelWorkRunnable.C48751.invoke$lambda$0(workManagerImpl, uuid);
                }
            });
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$forTag$1 */
    public static final class C48771 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ String $tag;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48771(WorkManagerImpl workManagerImpl, String str) {
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

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m33971invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m33971invoke() {
            final WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            AbstractC9979u.m20293f(workDatabase, "workManagerImpl.workDatabase");
            final String str = this.$tag;
            final WorkManagerImpl workManagerImpl = this.$workManagerImpl;
            workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.d
                @Override // java.lang.Runnable
                public final void run() {
                    CancelWorkRunnable.C48771.invoke$lambda$0(workDatabase, str, workManagerImpl);
                }
            });
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel(WorkManagerImpl workManagerImpl, String str) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        AbstractC9979u.m20293f(workDatabase, "workManagerImpl.workDatabase");
        iterativelyCancelWorkAndDependents(workDatabase, str);
        Processor processor = workManagerImpl.getProcessor();
        AbstractC9979u.m20293f(processor, "workManagerImpl.processor");
        processor.stopAndCancelWork(str, 1);
        Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    public static final Operation forAll(WorkManagerImpl workManagerImpl) {
        AbstractC9979u.m20294g(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        AbstractC9979u.m20293f(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelAllWork", serialTaskExecutor, new C48741(workManagerImpl));
    }

    public static final Operation forId(UUID id2, WorkManagerImpl workManagerImpl) {
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        AbstractC9979u.m20293f(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelWorkById", serialTaskExecutor, new C48751(workManagerImpl, id2));
    }

    public static final Operation forName(final String name, final WorkManagerImpl workManagerImpl) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str = "CancelWorkByName_" + name;
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        AbstractC9979u.m20293f(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str, serialTaskExecutor, new InterfaceC9529a() { // from class: androidx.work.impl.utils.CancelWorkRunnable.forName.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33970invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33970invoke() {
                CancelWorkRunnable.forNameInline(name, workManagerImpl);
                CancelWorkRunnable.reschedulePendingWorkers(workManagerImpl);
            }
        });
    }

    public static final void forNameInline(final String name, final WorkManagerImpl workManagerImpl) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        AbstractC9979u.m20293f(workDatabase, "workManagerImpl.workDatabase");
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
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str = "CancelWorkByTag_" + tag;
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        AbstractC9979u.m20293f(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str, serialTaskExecutor, new C48771(workManagerImpl, tag));
    }

    private static final void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        List listM24141s = AbstractC10978w.m24141s(str);
        while (!listM24141s.isEmpty()) {
            String str2 = (String) AbstractC10937b0.m23870O(listM24141s);
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setCancelledState(str2);
            }
            listM24141s.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }
}
