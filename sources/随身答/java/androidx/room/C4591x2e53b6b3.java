package androidx.room;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(m13412d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", m13451f = "RoomDatabase.android.kt", m13452i = {0}, m13453l = {2015}, m13454m = "invokeSuspend", m13455n = {"transactionElement"}, m13456s = {"L$0"})
/* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 */
/* loaded from: classes3.dex */
public final class C4591x2e53b6b3<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4591x2e53b6b3(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super C4591x2e53b6b3> continuation) {
        super(2, continuation);
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C4591x2e53b6b3 c4591x2e53b6b3 = new C4591x2e53b6b3(this.$block, continuation);
        c4591x2e53b6b3.L$0 = obj;
        return c4591x2e53b6b3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TransactionElement transactionElement;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactionElement = (TransactionElement) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                transactionElement.release();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                transactionElement.release();
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(TransactionElement.INSTANCE);
        Intrinsics.checkNotNull(element);
        TransactionElement transactionElement2 = (TransactionElement) element;
        transactionElement2.acquire();
        try {
            Function1<Continuation<? super R>, Object> function1 = this.$block;
            this.L$0 = transactionElement2;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            transactionElement = transactionElement2;
            obj = objInvoke;
            transactionElement.release();
            return obj;
        } catch (Throwable th3) {
            transactionElement = transactionElement2;
            th = th3;
            transactionElement.release();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return ((C4591x2e53b6b3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
