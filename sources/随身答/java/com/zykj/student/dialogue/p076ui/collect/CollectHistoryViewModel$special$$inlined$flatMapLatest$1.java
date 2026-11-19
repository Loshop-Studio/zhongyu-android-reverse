package com.zykj.student.dialogue.p076ui.collect;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import com.zykj.student.dialogue.p076ui.collect.CollectHistoryViewModel.C7485a;
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
import p244s6.C9526k0;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m13413d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryViewModel$special$$inlined$flatMapLatest$1", m13451f = "CollectHistoryViewModel.kt", m13452i = {0, 0}, m13453l = {189}, m13454m = "invokeSuspend", m13455n = {"$this$transformLatest", "it"}, m13456s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 CollectHistoryViewModel.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel\n*L\n1#1,189:1\n61#2,12:190\n*E\n"})
/* loaded from: classes5.dex */
public final class CollectHistoryViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super PagingData<CollectSession>>, C9526k0, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10743a;

    /* renamed from: b */
    public /* synthetic */ Object f10744b;

    /* renamed from: c */
    public /* synthetic */ Object f10745c;

    /* renamed from: d */
    public final /* synthetic */ CollectHistoryViewModel f10746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectHistoryViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, CollectHistoryViewModel collectHistoryViewModel) {
        super(3, continuation);
        this.f10746d = collectHistoryViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super PagingData<CollectSession>> flowCollector, C9526k0 c9526k0, Continuation<? super Unit> continuation) {
        return invoke((FlowCollector) flowCollector, (Object) c9526k0, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f10743a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f10744b;
            Object obj2 = this.f10745c;
            Object obj3 = null;
            Flow flow = new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 62, null), obj3, this.f10746d.new C7485a((C9526k0) obj2), 2, null).getFlow();
            this.f10744b = SpillingKt.nullOutSpilledVariable(flowCollector);
            this.f10745c = SpillingKt.nullOutSpilledVariable(obj2);
            this.f10743a = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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

    public final Object invoke(FlowCollector flowCollector, Object obj, Continuation continuation) {
        CollectHistoryViewModel$special$$inlined$flatMapLatest$1 collectHistoryViewModel$special$$inlined$flatMapLatest$1 = new CollectHistoryViewModel$special$$inlined$flatMapLatest$1(continuation, this.f10746d);
        collectHistoryViewModel$special$$inlined$flatMapLatest$1.f10744b = flowCollector;
        collectHistoryViewModel$special$$inlined$flatMapLatest$1.f10745c = obj;
        return collectHistoryViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
