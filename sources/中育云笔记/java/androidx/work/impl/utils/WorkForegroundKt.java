package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.WorkerWrapperKt;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.AbstractC11115g1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class WorkForegroundKt {
    private static final String TAG;

    @InterfaceC11829d(m26210c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", m26211f = "WorkForeground.kt", m26212l = {42, 50}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.utils.WorkForegroundKt$workForeground$2 */
    public static final class C48862 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Context $context;
        final /* synthetic */ ForegroundUpdater $foregroundUpdater;
        final /* synthetic */ WorkSpec $spec;
        final /* synthetic */ ListenableWorker $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48862(ListenableWorker listenableWorker, WorkSpec workSpec, ForegroundUpdater foregroundUpdater, Context context, InterfaceC11588c<? super C48862> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$worker = listenableWorker;
            this.$spec = workSpec;
            this.$foregroundUpdater = foregroundUpdater;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C48862(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ListenableFuture<ForegroundInfo> foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
                AbstractC9979u.m20293f(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
                ListenableWorker listenableWorker = this.$worker;
                this.label = 1;
                obj = WorkerWrapperKt.awaitWithin(foregroundInfoAsync, listenableWorker, this);
                if (obj != objM25952f) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
            if (foregroundInfo == null) {
                throw new IllegalStateException("Worker was marked important (" + this.$spec.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = WorkForegroundKt.TAG;
            WorkSpec workSpec = this.$spec;
            Logger.get().debug(str, "Updating notification for " + workSpec.workerClassName);
            ListenableFuture<Void> foregroundAsync = this.$foregroundUpdater.setForegroundAsync(this.$context, this.$worker.getId(), foregroundInfo);
            AbstractC9979u.m20293f(foregroundAsync, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
            this.label = 2;
            Object objAwait = ListenableFutureKt.await(foregroundAsync, this);
            return objAwait == objM25952f ? objM25952f : objAwait;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super Void> interfaceC11588c) {
            return ((C48862) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkForegroundRunnable");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"WorkForegroundRunnable\")");
        TAG = strTagWithPrefix;
    }

    public static final Object workForeground(Context context, WorkSpec workSpec, ListenableWorker listenableWorker, ForegroundUpdater foregroundUpdater, TaskExecutor taskExecutor, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (!workSpec.expedited || Build.VERSION.SDK_INT >= 31) {
            return C10786q.f26013a;
        }
        Executor mainThreadExecutor = taskExecutor.getMainThreadExecutor();
        AbstractC9979u.m20293f(mainThreadExecutor, "taskExecutor.mainThreadExecutor");
        Object objM24709g = AbstractC11109f.m24709g(AbstractC11115g1.m24721b(mainThreadExecutor), new C48862(listenableWorker, workSpec, foregroundUpdater, context, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }
}
