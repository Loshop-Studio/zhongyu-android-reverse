package com.zykj.gallery.page;

import androidx.exifinterface.media.ExifInterface;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.zykj.gallery.page.PagingModuleDelegate.C6025a;
import kotlin.Metadata;
import kotlin.Pair;
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
@DebugMetadata(m7917c = "com.zykj.gallery.page.PagingModuleDelegate$special$$inlined$flatMapLatest$1", m7918f = "PagingModuleDelegate.kt", m7919i = {0, 0}, m7920l = {189}, m7921m = "invokeSuspend", m7922n = {"$this$transformLatest", "it"}, m7923s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 PagingModuleDelegate.kt\ncom/zykj/gallery/page/PagingModuleDelegate\n*L\n1#1,189:1\n31#2,7:190\n*E\n"})
/* loaded from: classes2.dex */
public final class PagingModuleDelegate$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super PagingData<Object>>, Pair<Object, ? extends Long>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f5771a;

    /* renamed from: b */
    public /* synthetic */ Object f5772b;

    /* renamed from: c */
    public /* synthetic */ Object f5773c;

    /* renamed from: d */
    public final /* synthetic */ PagingModuleDelegate f5774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingModuleDelegate$special$$inlined$flatMapLatest$1(Continuation continuation, PagingModuleDelegate pagingModuleDelegate) {
        super(3, continuation);
        this.f5774d = pagingModuleDelegate;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super PagingData<Object>> flowCollector, Pair<Object, ? extends Long> pair, Continuation<? super Unit> continuation) {
        return invoke((FlowCollector) flowCollector, (Object) pair, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f5771a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f5772b;
            Object obj2 = this.f5773c;
            Pair pair = (Pair) obj2;
            Object objComponent1 = pair.component1();
            ((Number) pair.component2()).longValue();
            Flow flow = new Pager(new PagingConfig(this.f5774d.f5767b, 0, false, 0, 0, 0, 58, null), null, this.f5774d.new C6025a(objComponent1), 2, null).getFlow();
            this.f5772b = SpillingKt.nullOutSpilledVariable(flowCollector);
            this.f5773c = SpillingKt.nullOutSpilledVariable(obj2);
            this.f5771a = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
        PagingModuleDelegate$special$$inlined$flatMapLatest$1 pagingModuleDelegate$special$$inlined$flatMapLatest$1 = new PagingModuleDelegate$special$$inlined$flatMapLatest$1(continuation, this.f5774d);
        pagingModuleDelegate$special$$inlined$flatMapLatest$1.f5772b = flowCollector;
        pagingModuleDelegate$special$$inlined$flatMapLatest$1.f5773c = obj;
        return pagingModuleDelegate$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
