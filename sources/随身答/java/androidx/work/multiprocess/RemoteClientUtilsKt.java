package androidx.work.multiprocess;

import androidx.arch.core.util.Function;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;

@Metadata(m13412d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m13413d2 = {"map", "Lcom/google/common/util/concurrent/ListenableFuture;", "O", "I", "transformation", "Landroidx/arch/core/util/Function;", "executor", "Ljava/util/concurrent/Executor;", "work-multiprocess_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RemoteClientUtilsKt {

    /* JADX INFO: Add missing generic type declarations: [O] */
    @Metadata(m13412d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"}, m13413d2 = {"<anonymous>", "O", "I", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.work.multiprocess.RemoteClientUtilsKt$map$1", m13451f = "RemoteClientUtils.kt", m13452i = {}, m13453l = {31}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.work.multiprocess.RemoteClientUtilsKt$map$1 */
    public static final class C50351<O> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super O>, Object> {
        final /* synthetic */ ListenableFuture<I> $this_map;
        final /* synthetic */ Function<I, O> $transformation;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50351(Function<I, O> function, ListenableFuture<I> listenableFuture, Continuation<? super C50351> continuation) {
            super(2, continuation);
            this.$transformation = function;
            this.$this_map = listenableFuture;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C50351(this.$transformation, this.$this_map, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function function;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Function function2 = this.$transformation;
                ListenableFuture<I> listenableFuture = this.$this_map;
                this.L$0 = function2;
                this.label = 1;
                Object objAwait = ListenableFutureKt.await(listenableFuture, this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function = function2;
                obj = objAwait;
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function = (Function) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return function.apply(obj);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super O> continuation) {
            return ((C50351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final <I, O> ListenableFuture<O> map(ListenableFuture<I> listenableFuture, Function<I, O> transformation, Executor executor) {
        Intrinsics.checkNotNullParameter(listenableFuture, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return SuspendToFutureAdapter.INSTANCE.launchFuture(ExecutorsKt.from(executor), false, new C50351(transformation, listenableFuture, null));
    }
}
