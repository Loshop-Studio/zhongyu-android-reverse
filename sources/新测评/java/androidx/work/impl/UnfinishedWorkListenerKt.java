package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.ProcessUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m13557d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m13558d2 = {"DELAY_MS", "", "MAX_DELAY_MS", "", "TAG", "", "maybeLaunchUnfinishedWorkListener", "", "Lkotlinx/coroutines/CoroutineScope;", "appContext", "Landroid/content/Context;", "configuration", "Landroidx/work/Configuration;", "db", "Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class UnfinishedWorkListenerKt {
    private static final int DELAY_MS = 30000;
    private static final long MAX_DELAY_MS;
    private static final String TAG;

    @Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "throwable", "", "attempt", ""}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", m13596f = "UnfinishedWorkListener.kt", m13597i = {}, m13598l = {59}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 */
    public static final class C47441 extends SuspendLambda implements Function4<FlowCollector<? super Boolean>, Throwable, Long, Continuation<? super Boolean>, Object> {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        public C47441(Continuation<? super C47441> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, Long l10, Continuation<? super Boolean> continuation) {
            return invoke(flowCollector, th, l10.longValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                long j10 = this.J$0;
                Logger.get().error(UnfinishedWorkListenerKt.TAG, "Cannot check for unfinished work", th);
                long jMin = Math.min(j10 * UnfinishedWorkListenerKt.DELAY_MS, UnfinishedWorkListenerKt.MAX_DELAY_MS);
                this.label = 1;
                if (DelayKt.delay(jMin, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(true);
        }

        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th, long j10, Continuation<? super Boolean> continuation) {
            C47441 c47441 = new C47441(continuation);
            c47441.L$0 = th;
            c47441.J$0 = j10;
            return c47441.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", m13596f = "UnfinishedWorkListener.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 */
    public static final class C47452 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $appContext;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47452(Context context, Continuation<? super C47452> continuation) {
            super(2, continuation);
            this.$appContext = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C47452 c47452 = new C47452(this.$appContext, continuation);
            c47452.Z$0 = ((Boolean) obj).booleanValue();
            return c47452;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PackageManagerHelper.setComponentEnabled(this.$appContext, RescheduleReceiver.class, this.Z$0);
            return Unit.INSTANCE;
        }

        public final Object invoke(boolean z9, Continuation<? super Unit> continuation) {
            return ((C47452) create(Boolean.valueOf(z9), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"UnfinishedWorkListener\")");
        TAG = strTagWithPrefix;
        MAX_DELAY_MS = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void maybeLaunchUnfinishedWorkListener(CoroutineScope coroutineScope, Context appContext, Configuration configuration, WorkDatabase db) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db, "db");
        if (ProcessUtils.isDefaultProcess(appContext, configuration)) {
            FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowKt.conflate(FlowKt.retryWhen(db.workSpecDao().hasUnfinishedWorkFlow(), new C47441(null)))), new C47452(appContext, null)), coroutineScope);
        }
    }
}
