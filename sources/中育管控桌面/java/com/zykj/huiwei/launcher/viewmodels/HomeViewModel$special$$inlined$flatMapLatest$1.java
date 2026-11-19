package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.exifinterface.media.ExifInterface;
import com.zykj.huiwei.launcher.bean.resp.TodoResp;
import com.zykj.huiwei.launcher.proto.C6069g;
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

@Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m7880d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$flatMapLatest$1", m7918f = "HomeViewModel.kt", m7919i = {0, 0}, m7920l = {189}, m7921m = "invokeSuspend", m7922n = {"$this$transformLatest", "it"}, m7923s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel\n*L\n1#1,189:1\n111#2,5:190\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super TodoResp>, C6069g, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f7036a;

    /* renamed from: b */
    public /* synthetic */ Object f7037b;

    /* renamed from: c */
    public /* synthetic */ Object f7038c;

    /* renamed from: d */
    public final /* synthetic */ HomeViewModel f7039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, HomeViewModel homeViewModel) {
        super(3, continuation);
        this.f7039d = homeViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super TodoResp> flowCollector, C6069g c6069g, Continuation<? super Unit> continuation) {
        return invoke((FlowCollector) flowCollector, (Object) c6069g, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f7036a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f7037b;
            Object obj2 = this.f7038c;
            Flow flowM18689catch = FlowKt.m18689catch(this.f7039d.homeRepository.m5416c((int) ((C6069g) obj2).getId()), new HomeViewModel$todoResp$1$1(null));
            this.f7037b = SpillingKt.nullOutSpilledVariable(flowCollector);
            this.f7038c = SpillingKt.nullOutSpilledVariable(obj2);
            this.f7036a = 1;
            if (FlowKt.emitAll(flowCollector, flowM18689catch, this) == coroutine_suspended) {
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

    public final Object invoke(FlowCollector flowCollector, Object obj, Continuation continuation) {
        HomeViewModel$special$$inlined$flatMapLatest$1 homeViewModel$special$$inlined$flatMapLatest$1 = new HomeViewModel$special$$inlined$flatMapLatest$1(continuation, this.f7039d);
        homeViewModel$special$$inlined$flatMapLatest$1.f7037b = flowCollector;
        homeViewModel$special$$inlined$flatMapLatest$1.f7038c = obj;
        return homeViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
