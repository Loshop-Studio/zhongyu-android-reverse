package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", m13596f = "ConnectionPoolImpl.kt", m13597i = {}, m13598l = {209}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class Pool$acquireWithTimeout$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<ConnectionWithLock> $connection;
    Object L$0;
    int label;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$2(Ref.ObjectRef<ConnectionWithLock> objectRef, Pool pool, Continuation<? super Pool$acquireWithTimeout$2> continuation) {
        super(2, continuation);
        this.$connection = objectRef;
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Pool$acquireWithTimeout$2(this.$connection, this.this$0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef<ConnectionWithLock> objectRef;
        T t10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef<ConnectionWithLock> objectRef2 = this.$connection;
            Pool pool = this.this$0;
            this.L$0 = objectRef2;
            this.label = 1;
            Object objAcquire = pool.acquire(this);
            if (objAcquire == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t10 = objAcquire;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            t10 = obj;
        }
        objectRef.element = t10;
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Pool$acquireWithTimeout$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
