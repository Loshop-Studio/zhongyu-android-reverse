package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0086H¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m13558d2 = {"launchOperation", "Landroidx/work/Operation;", "tracer", "Landroidx/work/Tracer;", "label", "", "executor", "Ljava/util/concurrent/Executor;", "block", "Lkotlin/Function0;", "", "await", "Landroidx/work/Operation$State$SUCCESS;", "(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n+ 2 Tracer.kt\nandroidx/work/TracerKt\n*L\n1#1,71:1\n53#2,9:72\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n*L\n48#1:72,9\n*E\n"})
/* loaded from: classes3.dex */
public final class OperationKt {

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 176)
    @DebugMetadata(m13595c = "androidx.work.OperationKt", m13596f = "Operation.kt", m13597i = {}, m13598l = {36}, m13599m = "await", m13600n = {}, m13601s = {})
    /* renamed from: androidx.work.OperationKt$await$1 */
    public static final class C47311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C47311(Continuation<? super C47311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object await(androidx.work.Operation r4, kotlin.coroutines.Continuation<? super androidx.work.Operation.State.SUCCESS> r5) {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt.C47311
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt.C47311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.label = r3
            java.lang.Object r5 = androidx.concurrent.futures.ListenableFutureKt.await(r4, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "result.await()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, Continuation<? super Operation.State.SUCCESS> continuation) {
        ListenableFuture<Operation.State.SUCCESS> result = operation.getResult();
        Intrinsics.checkNotNullExpressionValue(result, "result");
        InlineMarker.mark(0);
        Object objAwait = androidx.concurrent.futures.ListenableFutureKt.await(result, continuation);
        InlineMarker.mark(1);
        Intrinsics.checkNotNullExpressionValue(objAwait, "result.await()");
        return objAwait;
    }

    public static final Operation launchOperation(final Tracer tracer, final String label, final Executor executor, final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        final MutableLiveData mutableLiveData = new MutableLiveData(Operation.IN_PROGRESS);
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.g
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return OperationKt.launchOperation$lambda$2(executor, tracer, label, block, mutableLiveData, completer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->…}\n            }\n        }");
        return new OperationImpl(mutableLiveData, future);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchOperation$lambda$2(Executor executor, final Tracer tracer, final String str, final Function0 function0, final MutableLiveData mutableLiveData, final CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        executor.execute(new Runnable() { // from class: androidx.work.h
            @Override // java.lang.Runnable
            public final void run() {
                OperationKt.launchOperation$lambda$2$lambda$1(tracer, str, function0, mutableLiveData, completer);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchOperation$lambda$2$lambda$1(Tracer tracer, String str, Function0 function0, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(str);
            } finally {
                if (zIsEnabled) {
                    tracer.endSection();
                }
            }
        }
        try {
            function0.invoke();
            Operation.State.SUCCESS success = Operation.SUCCESS;
            mutableLiveData.postValue(success);
            completer.set(success);
        } catch (Throwable th) {
            mutableLiveData.postValue(new Operation.State.FAILURE(th));
            completer.setException(th);
        }
        Unit unit = Unit.INSTANCE;
    }
}
