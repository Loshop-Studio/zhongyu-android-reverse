package com.zykj.evaluation.p057ui.home;

import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PagingData;
import com.zykj.evaluation.bean.GetTaskListReq;
import com.zykj.evaluation.paging.SimplePagerKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p245t6.C9450o0;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m13558d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1", m13596f = "HomeViewModel.kt", m13597i = {0, 0}, m13598l = {189}, m13599m = "invokeSuspend", m13600n = {"$this$transformLatest", "it"}, m13601s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel\n*L\n1#1,189:1\n424#2:190\n462#2:191\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super PagingData<C9450o0>>, GetTaskListReq, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9780a;

    /* renamed from: b */
    public /* synthetic */ Object f9781b;

    /* renamed from: c */
    public /* synthetic */ Object f9782c;

    /* renamed from: d */
    public final /* synthetic */ HomeViewModel f9783d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC6928a f9784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1(Continuation continuation, HomeViewModel homeViewModel, AbstractC6928a abstractC6928a) {
        super(3, continuation);
        this.f9783d = homeViewModel;
        this.f9784e = abstractC6928a;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super PagingData<C9450o0>> flowCollector, GetTaskListReq getTaskListReq, Continuation<? super Unit> continuation) {
        return invoke((FlowCollector) flowCollector, (Object) getTaskListReq, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9780a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f9781b;
            Object obj2 = this.f9782c;
            Flow flowM8777c = SimplePagerKt.m8777c(null, new HomeViewModel$buildDataInfo$1$1(this.f9783d, this.f9784e, (GetTaskListReq) obj2, null), new HomeViewModel$buildDataInfo$1$2(this.f9784e, null), 1, null);
            this.f9781b = SpillingKt.nullOutSpilledVariable(flowCollector);
            this.f9782c = SpillingKt.nullOutSpilledVariable(obj2);
            this.f9780a = 1;
            if (FlowKt.emitAll(flowCollector, flowM8777c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public final Object invoke(FlowCollector flowCollector, Object obj, Continuation continuation) {
        HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1 homeViewModel$buildDataInfo$$inlined$flatMapLatest$1 = new HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1(continuation, this.f9783d, this.f9784e);
        homeViewModel$buildDataInfo$$inlined$flatMapLatest$1.f9781b = flowCollector;
        homeViewModel$buildDataInfo$$inlined$flatMapLatest$1.f9782c = obj;
        return homeViewModel$buildDataInfo$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
