package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$getWeatherData$1", m7918f = "HomeViewModel.kt", m7919i = {0}, m7920l = {212}, m7921m = "invokeSuspend", m7922n = {"$this$flow"}, m7923s = {"L$0"})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getWeatherData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$getWeatherData$1 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7103a;

    /* renamed from: b */
    public /* synthetic */ Object f7104b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f7105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getWeatherData$1(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7105c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeViewModel$getWeatherData$1 homeViewModel$getWeatherData$1 = new HomeViewModel$getWeatherData$1(this.f7105c, continuation);
        homeViewModel$getWeatherData$1.f7104b = obj;
        return homeViewModel$getWeatherData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.f7104b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f7103a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            String strM6094O = this.f7105c.m6094O();
            HomeViewModel homeViewModel = this.f7105c;
            if (strM6094O.length() == 0) {
                strM6094O = homeViewModel.m6106z().getCity();
            }
            this.f7104b = SpillingKt.nullOutSpilledVariable(flowCollector);
            this.f7103a = 1;
            if (flowCollector.emit(strM6094O, this) == coroutine_suspended) {
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
    public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
        return ((HomeViewModel$getWeatherData$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
