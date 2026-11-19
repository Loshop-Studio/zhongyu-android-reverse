package com.zykj.evaluation.p057ui.detail;

import com.zykj.evaluation.bean.bundle.DetailBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$initData$1", m13596f = "BaseDetailViewModel.kt", m13597i = {0}, m13598l = {313}, m13599m = "invokeSuspend", m13600n = {"$this$launchData"}, m13601s = {"L$0"})
/* loaded from: classes4.dex */
public final class BaseDetailViewModel$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9120a;

    /* renamed from: b */
    public int f9121b;

    /* renamed from: c */
    public /* synthetic */ Object f9122c;

    /* renamed from: d */
    public final /* synthetic */ BaseDetailViewModel f9123d;

    /* renamed from: e */
    public final /* synthetic */ Function2 f9124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDetailViewModel$initData$1(BaseDetailViewModel baseDetailViewModel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f9123d = baseDetailViewModel;
        this.f9124e = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseDetailViewModel$initData$1 baseDetailViewModel$initData$1 = new BaseDetailViewModel$initData$1(this.f9123d, this.f9124e, continuation);
        baseDetailViewModel$initData$1.f9122c = obj;
        return baseDetailViewModel$initData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BaseDetailViewModel baseDetailViewModel;
        CoroutineScope coroutineScope = (CoroutineScope) this.f9122c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9121b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            BaseDetailViewModel baseDetailViewModel2 = this.f9123d;
            Function2 function2 = this.f9124e;
            this.f9122c = SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.f9120a = baseDetailViewModel2;
            this.f9121b = 1;
            Object objInvoke = function2.invoke(coroutineScope, this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseDetailViewModel = baseDetailViewModel2;
            obj = objInvoke;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseDetailViewModel = (BaseDetailViewModel) this.f9120a;
            ResultKt.throwOnFailure(obj);
        }
        baseDetailViewModel.mo9277U((DetailBundle) obj, true);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseDetailViewModel$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
