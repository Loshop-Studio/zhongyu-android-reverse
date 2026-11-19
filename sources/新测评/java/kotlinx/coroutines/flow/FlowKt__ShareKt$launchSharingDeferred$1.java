package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m13596f = "Share.kt", m13597i = {0}, m13598l = {337}, m13599m = "invokeSuspend", m13600n = {"state"}, m13601s = {"L$0"})
/* loaded from: classes5.dex */
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompletableDeferred<Result<StateFlow<T>>> $result;
    final /* synthetic */ Flow<T> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharingDeferred$1(Flow<? extends T> flow, CompletableDeferred<Result<StateFlow<T>>> completableDeferred, Continuation<? super FlowKt__ShareKt$launchSharingDeferred$1> continuation) {
        super(2, continuation);
        this.$upstream = flow;
        this.$result = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                Flow<T> flow = this.$upstream;
                final CompletableDeferred<Result<StateFlow<T>>> completableDeferred = this.$result;
                FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.1
                    /* JADX WARN: Type inference failed for: r4v1, types: [T, kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow] */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(T t10, Continuation<? super Unit> continuation) {
                        Ref.ObjectRef<MutableStateFlow<T>> objectRef3 = objectRef2;
                        MutableStateFlow<T> mutableStateFlow = objectRef3.element;
                        if (mutableStateFlow != null) {
                            mutableStateFlow.setValue(t10);
                        } else {
                            CoroutineScope coroutineScope2 = coroutineScope;
                            CompletableDeferred<Result<StateFlow<T>>> completableDeferred2 = completableDeferred;
                            ?? r42 = (T) StateFlowKt.MutableStateFlow(t10);
                            Result.Companion companion = Result.INSTANCE;
                            completableDeferred2.complete(Result.m24298boximpl(Result.m24299constructorimpl(new ReadonlyStateFlow(r42, JobKt.getJob(coroutineScope2.getCoroutineContext())))));
                            objectRef3.element = r42;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = objectRef2;
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (objectRef.element == 0) {
                CompletableDeferred<Result<StateFlow<T>>> completableDeferred2 = this.$result;
                Result.Companion companion = Result.INSTANCE;
                completableDeferred2.complete(Result.m24298boximpl(Result.m24299constructorimpl(ResultKt.createFailure(new NoSuchElementException("Flow is empty")))));
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.$result.completeExceptionally(th);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
