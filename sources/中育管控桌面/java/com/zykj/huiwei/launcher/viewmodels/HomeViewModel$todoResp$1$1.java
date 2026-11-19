package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.zykj.huiwei.launcher.bean.resp.TodoResp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;", "it", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$todoResp$1$1", m7918f = "HomeViewModel.kt", m7919i = {0}, m7920l = {114}, m7921m = "invokeSuspend", m7922n = {"$this$catch"}, m7923s = {"L$0"})
/* loaded from: classes4.dex */
public final class HomeViewModel$todoResp$1$1 extends SuspendLambda implements Function3<FlowCollector<? super TodoResp>, Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7118a;

    /* renamed from: b */
    public /* synthetic */ Object f7119b;

    public HomeViewModel$todoResp$1$1(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super TodoResp> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, th, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.f7119b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f7118a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            TodoResp todoResp = new TodoResp(0, 0, 0, 0, 0, 31, null);
            this.f7119b = SpillingKt.nullOutSpilledVariable(flowCollector);
            this.f7118a = 1;
            if (flowCollector.emit(todoResp, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector flowCollector, Throwable th, Continuation continuation) {
        HomeViewModel$todoResp$1$1 homeViewModel$todoResp$1$1 = new HomeViewModel$todoResp$1$1(continuation);
        homeViewModel$todoResp$1$1.f7119b = flowCollector;
        return homeViewModel$todoResp$1$1.invokeSuspend(Unit.INSTANCE);
    }
}
