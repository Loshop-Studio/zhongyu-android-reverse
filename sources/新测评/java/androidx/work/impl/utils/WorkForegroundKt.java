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
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;

@Metadata(m13557d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m13558d2 = {"TAG", "", "workForeground", "", "context", "Landroid/content/Context;", "spec", "Landroidx/work/impl/model/WorkSpec;", "worker", "Landroidx/work/ListenableWorker;", "foregroundUpdater", "Landroidx/work/ForegroundUpdater;", "taskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "(Landroid/content/Context;Landroidx/work/impl/model/WorkSpec;Landroidx/work/ListenableWorker;Landroidx/work/ForegroundUpdater;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class WorkForegroundKt {
    private static final String TAG;

    @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", m13596f = "WorkForeground.kt", m13597i = {}, m13598l = {42, 50}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    @SourceDebugExtension({"SMAP\nWorkForeground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkForeground.kt\nandroidx/work/impl/utils/WorkForegroundKt$workForeground$2\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,55:1\n19#2:56\n*S KotlinDebug\n*F\n+ 1 WorkForeground.kt\nandroidx/work/impl/utils/WorkForegroundKt$workForeground$2\n*L\n49#1:56\n*E\n"})
    /* renamed from: androidx.work.impl.utils.WorkForegroundKt$workForeground$2 */
    public static final class C48532 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Void>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ForegroundUpdater $foregroundUpdater;
        final /* synthetic */ WorkSpec $spec;
        final /* synthetic */ ListenableWorker $worker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48532(ListenableWorker listenableWorker, WorkSpec workSpec, ForegroundUpdater foregroundUpdater, Context context, Continuation<? super C48532> continuation) {
            super(2, continuation);
            this.$worker = listenableWorker;
            this.$spec = workSpec;
            this.$foregroundUpdater = foregroundUpdater;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C48532(this.$worker, this.$spec, this.$foregroundUpdater, this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ListenableFuture<ForegroundInfo> foregroundInfoAsync = this.$worker.getForegroundInfoAsync();
                Intrinsics.checkNotNullExpressionValue(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
                ListenableWorker listenableWorker = this.$worker;
                this.label = 1;
                obj = WorkerWrapperKt.awaitWithin(foregroundInfoAsync, listenableWorker, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
            if (foregroundInfo == null) {
                throw new IllegalStateException("Worker was marked important (" + this.$spec.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = WorkForegroundKt.TAG;
            WorkSpec workSpec = this.$spec;
            Logger.get().debug(str, "Updating notification for " + workSpec.workerClassName);
            ListenableFuture<Void> foregroundAsync = this.$foregroundUpdater.setForegroundAsync(this.$context, this.$worker.getId(), foregroundInfo);
            Intrinsics.checkNotNullExpressionValue(foregroundAsync, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
            this.label = 2;
            Object objAwait = ListenableFutureKt.await(foregroundAsync, this);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Void> continuation) {
            return ((C48532) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkForegroundRunnable");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"WorkForegroundRunnable\")");
        TAG = strTagWithPrefix;
    }

    public static final Object workForeground(Context context, WorkSpec workSpec, ListenableWorker listenableWorker, ForegroundUpdater foregroundUpdater, TaskExecutor taskExecutor, Continuation<? super Unit> continuation) {
        if (!workSpec.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.INSTANCE;
        }
        Executor mainThreadExecutor = taskExecutor.getMainThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "taskExecutor.mainThreadExecutor");
        Object objWithContext = BuildersKt.withContext(ExecutorsKt.from(mainThreadExecutor), new C48532(listenableWorker, workSpec, foregroundUpdater, context, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
