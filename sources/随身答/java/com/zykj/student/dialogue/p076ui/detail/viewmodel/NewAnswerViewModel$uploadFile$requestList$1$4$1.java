package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.WorkInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Landroidx/work/WorkInfo;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel$uploadFile$requestList$1$4$1", m13451f = "NewAnswerViewModel.kt", m13452i = {0}, m13453l = {151}, m13454m = "invokeSuspend", m13455n = {"$this$flow"}, m13456s = {"L$0"})
/* loaded from: classes5.dex */
public final class NewAnswerViewModel$uploadFile$requestList$1$4$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends WorkInfo>>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11243a;

    /* renamed from: b */
    public /* synthetic */ Object f11244b;

    public NewAnswerViewModel$uploadFile$requestList$1$4$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NewAnswerViewModel$uploadFile$requestList$1$4$1 newAnswerViewModel$uploadFile$requestList$1$4$1 = new NewAnswerViewModel$uploadFile$requestList$1$4$1(continuation);
        newAnswerViewModel$uploadFile$requestList$1$4$1.f11244b = obj;
        return newAnswerViewModel$uploadFile$requestList$1$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends WorkInfo>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.f11244b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11243a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f11244b = SpillingKt.nullOutSpilledVariable(flowCollector);
            this.f11243a = 1;
            if (flowCollector.emit(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
        return ((NewAnswerViewModel$uploadFile$requestList$1$4$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
