package androidx.work.impl;

import android.content.Context;
import androidx.compose.material3.MenuKt;
import androidx.work.C4765R;
import androidx.work.Configuration;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9548t;
import p309qc.C10786q;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11113g;
import sd.AbstractC11147o1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class WorkManagerImplExtKt {

    @InterfaceC11829d(m26210c = "androidx.work.impl.WorkManagerImplExtKt$close$1", m26211f = "WorkManagerImplExt.kt", m26212l = {PatchStatus.CODE_LOAD_RES_INJECT_PATH}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.WorkManagerImplExtKt$close$1 */
    public static final class C47811 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ WorkManagerImpl $this_close;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47811(WorkManagerImpl workManagerImpl, InterfaceC11588c<? super C47811> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_close = workManagerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C47811(this.$this_close, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC9945d.b bVar = this.$this_close.getWorkManagerScope().getCoroutineContext().get(InterfaceC10045g.f23976b0);
                AbstractC9979u.m20291d(bVar);
                this.label = 1;
                if (AbstractC11147o1.m24773g((InterfaceC10045g) bVar, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C47811) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final void close(WorkManagerImpl workManagerImpl) {
        AbstractC9979u.m20294g(workManagerImpl, "<this>");
        AbstractC11113g.m24717b(null, new C47811(workManagerImpl, null), 1, null);
        workManagerImpl.getWorkDatabase().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Scheduler> createSchedulers(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        Scheduler schedulerCreateBestAvailableBackgroundScheduler = Schedulers.createBestAvailableBackgroundScheduler(context, workDatabase, configuration);
        AbstractC9979u.m20293f(schedulerCreateBestAvailableBackgroundScheduler, "createBestAvailableBackg…kDatabase, configuration)");
        return AbstractC10978w.m24139q(schedulerCreateBestAvailableBackgroundScheduler, new GreedyScheduler(context, configuration, trackers, processor, new WorkLauncherImpl(processor, taskExecutor), taskExecutor));
    }

    public static final WorkManagerImpl createTestWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(workTaskExecutor, "workTaskExecutor");
        WorkDatabase.Companion companion = WorkDatabase.Companion;
        SerialExecutor serialTaskExecutor = workTaskExecutor.getSerialTaskExecutor();
        AbstractC9979u.m20293f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, companion.create(context, serialTaskExecutor, configuration.getClock(), true), null, null, null, 112, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        return createWorkManager$default(context, configuration, null, null, null, null, null, 124, null);
    }

    public static /* synthetic */ WorkManagerImpl createWorkManager$default(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, InterfaceC9548t interfaceC9548t, int i10, Object obj) {
        Trackers trackers2;
        if ((i10 & 4) != 0) {
            taskExecutor = new WorkManagerTaskExecutor(configuration.getTaskExecutor());
        }
        TaskExecutor taskExecutor2 = taskExecutor;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.Companion;
            Context applicationContext = context.getApplicationContext();
            AbstractC9979u.m20293f(applicationContext, "context.applicationContext");
            SerialExecutor serialTaskExecutor = taskExecutor2.getSerialTaskExecutor();
            AbstractC9979u.m20293f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
            workDatabase = companion.create(applicationContext, serialTaskExecutor, configuration.getClock(), context.getResources().getBoolean(C4765R.bool.workmanager_test_configuration));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            AbstractC9979u.m20293f(applicationContext2, "context.applicationContext");
            trackers2 = new Trackers(applicationContext2, taskExecutor2, null, null, null, null, 60, null);
        } else {
            trackers2 = trackers;
        }
        return createWorkManager(context, configuration, taskExecutor2, workDatabase, trackers2, (i10 & 32) != 0 ? new Processor(context.getApplicationContext(), configuration, taskExecutor2, workDatabase) : processor, (i10 & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : interfaceC9548t);
    }

    public static final InterfaceC11122i0 createWorkManagerScope(TaskExecutor taskExecutor) {
        AbstractC9979u.m20294g(taskExecutor, "taskExecutor");
        AbstractC11106e0 taskCoroutineDispatcher = taskExecutor.getTaskCoroutineDispatcher();
        AbstractC9979u.m20293f(taskCoroutineDispatcher, "taskExecutor.taskCoroutineDispatcher");
        return AbstractC10006d.m20744a(taskCoroutineDispatcher);
    }

    public static final InterfaceC9548t schedulers(final Scheduler... schedulers) {
        AbstractC9979u.m20294g(schedulers, "schedulers");
        return new InterfaceC9548t() { // from class: androidx.work.impl.WorkManagerImplExtKt.schedulers.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            @Override // p181hd.InterfaceC9548t
            public final List<Scheduler> invoke(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
                AbstractC9979u.m20294g(context, "<anonymous parameter 0>");
                AbstractC9979u.m20294g(configuration, "<anonymous parameter 1>");
                AbstractC9979u.m20294g(taskExecutor, "<anonymous parameter 2>");
                AbstractC9979u.m20294g(workDatabase, "<anonymous parameter 3>");
                AbstractC9979u.m20294g(trackers, "<anonymous parameter 4>");
                AbstractC9979u.m20294g(processor, "<anonymous parameter 5>");
                return AbstractC10968r.m24097p1(schedulers);
            }
        };
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(workTaskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, null, null, null, null, MenuKt.InTransitionDuration, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(workTaskExecutor, "workTaskExecutor");
        AbstractC9979u.m20294g(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, null, null, null, 112, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(workTaskExecutor, "workTaskExecutor");
        AbstractC9979u.m20294g(workDatabase, "workDatabase");
        AbstractC9979u.m20294g(trackers, "trackers");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(workTaskExecutor, "workTaskExecutor");
        AbstractC9979u.m20294g(workDatabase, "workDatabase");
        AbstractC9979u.m20294g(trackers, "trackers");
        AbstractC9979u.m20294g(processor, "processor");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, InterfaceC9548t schedulersCreator) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(workTaskExecutor, "workTaskExecutor");
        AbstractC9979u.m20294g(workDatabase, "workDatabase");
        AbstractC9979u.m20294g(trackers, "trackers");
        AbstractC9979u.m20294g(processor, "processor");
        AbstractC9979u.m20294g(schedulersCreator, "schedulersCreator");
        return new WorkManagerImpl(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}
