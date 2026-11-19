package androidx.room;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", m13451f = "MultiInstanceInvalidationClient.android.kt", m13452i = {0}, m13453l = {87}, m13454m = "invokeSuspend", m13455n = {"invalidatedTablesSet"}, m13456s = {"L$0"})
/* renamed from: androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 */
/* loaded from: classes3.dex */
public final class C4580x5cbf7351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String[] $tables;
    Object L$0;
    int label;
    final /* synthetic */ MultiInstanceInvalidationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4580x5cbf7351(String[] strArr, MultiInstanceInvalidationClient multiInstanceInvalidationClient, Continuation<? super C4580x5cbf7351> continuation) {
        super(2, continuation);
        this.$tables = strArr;
        this.this$0 = multiInstanceInvalidationClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C4580x5cbf7351(this.$tables, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set<String> set;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            String[] strArr = this.$tables;
            Set<String> of = SetsKt.setOf(Arrays.copyOf(strArr, strArr.length));
            MutableSharedFlow mutableSharedFlow = this.this$0.invalidatedTables;
            this.L$0 = of;
            this.label = 1;
            if (mutableSharedFlow.emit(of, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            set = of;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.getInvalidationTracker().notifyObserversByTableNames$room_runtime_release(set);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C4580x5cbf7351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
