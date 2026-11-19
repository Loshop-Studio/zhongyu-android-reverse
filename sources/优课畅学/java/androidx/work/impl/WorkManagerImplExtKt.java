package androidx.work.impl;

import android.content.Context;
import androidx.work.C4817R;
import androidx.work.Configuration;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8823b1;
import p135i8.AbstractC8836g;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10578t;

/* loaded from: classes3.dex */
public final class WorkManagerImplExtKt {

    @InterfaceC9539d(m17800c = "androidx.work.impl.WorkManagerImplExtKt$close$1", m17801f = "WorkManagerImplExt.kt", m17802l = {TbsListener.ErrorCode.THREAD_INIT_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.impl.WorkManagerImplExtKt$close$1 */
    public static final class C48331 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ WorkManagerImpl $this_close;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48331(WorkManagerImpl workManagerImpl, InterfaceC9324c<? super C48331> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_close = workManagerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C48331(this.$this_close, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C48331) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9100d.b bVar = this.$this_close.getWorkManagerScope().getCoroutineContext().get(InterfaceC9212n.f18095c0);
                AbstractC9133u.m16130d(bVar);
                this.label = 1;
                if (AbstractC8823b1.m14811g((InterfaceC9212n) bVar, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public static final void close(WorkManagerImpl workManagerImpl) {
        AbstractC9133u.m16133g(workManagerImpl, "<this>");
        AbstractC8836g.m14852b(null, new C48331(workManagerImpl, null), 1, null);
        workManagerImpl.getWorkDatabase().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Scheduler> createSchedulers(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        Scheduler schedulerCreateBestAvailableBackgroundScheduler = Schedulers.createBestAvailableBackgroundScheduler(context, workDatabase, configuration);
        AbstractC9133u.m16132f(schedulerCreateBestAvailableBackgroundScheduler, "createBestAvailableBackg…kDatabase, configuration)");
        return AbstractC8809v.m14774q(schedulerCreateBestAvailableBackgroundScheduler, new GreedyScheduler(context, configuration, trackers, processor, new WorkLauncherImpl(processor, taskExecutor), taskExecutor));
    }

    public static final WorkManagerImpl createTestWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(workTaskExecutor, "workTaskExecutor");
        WorkDatabase.Companion companion = WorkDatabase.Companion;
        SerialExecutor serialTaskExecutor = workTaskExecutor.getSerialTaskExecutor();
        AbstractC9133u.m16132f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, companion.create(context, serialTaskExecutor, configuration.getClock(), true), null, null, null, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(configuration, "configuration");
        return createWorkManager$default(context, configuration, null, null, null, null, null, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, null);
    }

    public static /* synthetic */ WorkManagerImpl createWorkManager$default(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, InterfaceC10578t interfaceC10578t, int i10, Object obj) {
        Trackers trackers2;
        if ((i10 & 4) != 0) {
            taskExecutor = new WorkManagerTaskExecutor(configuration.getTaskExecutor());
        }
        TaskExecutor taskExecutor2 = taskExecutor;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.Companion;
            Context applicationContext = context.getApplicationContext();
            AbstractC9133u.m16132f(applicationContext, "context.applicationContext");
            SerialExecutor serialTaskExecutor = taskExecutor2.getSerialTaskExecutor();
            AbstractC9133u.m16132f(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
            workDatabase = companion.create(applicationContext, serialTaskExecutor, configuration.getClock(), context.getResources().getBoolean(C4817R.bool.workmanager_test_configuration));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            AbstractC9133u.m16132f(applicationContext2, "context.applicationContext");
            trackers2 = new Trackers(applicationContext2, taskExecutor2, null, null, null, null, 60, null);
        } else {
            trackers2 = trackers;
        }
        return createWorkManager(context, configuration, taskExecutor2, workDatabase, trackers2, (i10 & 32) != 0 ? new Processor(context.getApplicationContext(), configuration, taskExecutor2, workDatabase) : processor, (i10 & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : interfaceC10578t);
    }

    public static final InterfaceC8822b0 createWorkManagerScope(TaskExecutor taskExecutor) {
        AbstractC9133u.m16133g(taskExecutor, "taskExecutor");
        CoroutineDispatcher taskCoroutineDispatcher = taskExecutor.getTaskCoroutineDispatcher();
        AbstractC9133u.m16132f(taskCoroutineDispatcher, "taskExecutor.taskCoroutineDispatcher");
        return AbstractC9165e.m16552a(taskCoroutineDispatcher);
    }

    public static final InterfaceC10578t schedulers(final Scheduler... schedulers) {
        AbstractC9133u.m16133g(schedulers, "schedulers");
        return new InterfaceC10578t() { // from class: androidx.work.impl.WorkManagerImplExtKt.schedulers.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            @Override // p300x7.InterfaceC10578t
            public final List<Scheduler> invoke(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
                AbstractC9133u.m16133g(context, "<anonymous parameter 0>");
                AbstractC9133u.m16133g(configuration, "<anonymous parameter 1>");
                AbstractC9133u.m16133g(taskExecutor, "<anonymous parameter 2>");
                AbstractC9133u.m16133g(workDatabase, "<anonymous parameter 3>");
                AbstractC9133u.m16133g(trackers, "<anonymous parameter 4>");
                AbstractC9133u.m16133g(processor, "<anonymous parameter 5>");
                return AbstractC8801r.m14736u1(schedulers);
            }
        };
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(workTaskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, null, null, null, null, 120, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(workTaskExecutor, "workTaskExecutor");
        AbstractC9133u.m16133g(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, null, null, null, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(workTaskExecutor, "workTaskExecutor");
        AbstractC9133u.m16133g(workDatabase, "workDatabase");
        AbstractC9133u.m16133g(trackers, "trackers");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(workTaskExecutor, "workTaskExecutor");
        AbstractC9133u.m16133g(workDatabase, "workDatabase");
        AbstractC9133u.m16133g(trackers, "trackers");
        AbstractC9133u.m16133g(processor, "processor");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, InterfaceC10578t schedulersCreator) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(workTaskExecutor, "workTaskExecutor");
        AbstractC9133u.m16133g(workDatabase, "workDatabase");
        AbstractC9133u.m16133g(trackers, "trackers");
        AbstractC9133u.m16133g(processor, "processor");
        AbstractC9133u.m16133g(schedulersCreator, "schedulersCreator");
        return new WorkManagerImpl(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}
