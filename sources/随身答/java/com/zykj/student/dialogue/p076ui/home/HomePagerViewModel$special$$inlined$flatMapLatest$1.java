package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PagingData;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import p244s6.C9526k0;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, m13413d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerViewModel$special$$inlined$flatMapLatest$1", m13451f = "HomePagerViewModel.kt", m13452i = {0, 0}, m13453l = {189}, m13454m = "invokeSuspend", m13455n = {"$this$transformLatest", "it"}, m13456s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 HomePagerViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomePagerViewModel\n*L\n1#1,189:1\n76#2,14:190\n*E\n"})
/* loaded from: classes5.dex */
public final class HomePagerViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super PagingData<QuestionResp>>, C9526k0, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11557a;

    /* renamed from: b */
    public /* synthetic */ Object f11558b;

    /* renamed from: c */
    public /* synthetic */ Object f11559c;

    /* renamed from: d */
    public final /* synthetic */ HomePagerViewModel f11560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, HomePagerViewModel homePagerViewModel) {
        super(3, continuation);
        this.f11560d = homePagerViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super PagingData<QuestionResp>> flowCollector, C9526k0 c9526k0, Continuation<? super Unit> continuation) {
        return invoke((FlowCollector) flowCollector, (Object) c9526k0, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f11557a
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L15
            java.lang.Object r1 = r0.f11558b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r19)
            goto L78
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1d:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r2 = r0.f11558b
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r4 = r0.f11559c
            r5 = r4
            s6.k0 r5 = (p244s6.C9526k0) r5
            com.zykj.student.dialogue.ui.home.HomePagerViewModel r6 = r0.f11560d
            java.lang.Long r6 = r6.getCatalogId()
            if (r6 == 0) goto L59
            long r6 = r6.longValue()
            androidx.paging.Pager r8 = new androidx.paging.Pager
            androidx.paging.PagingConfig r9 = new androidx.paging.PagingConfig
            r16 = 62
            r17 = 0
            r10 = 4
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            com.zykj.student.dialogue.ui.home.HomePagerViewModel$a r11 = new com.zykj.student.dialogue.ui.home.HomePagerViewModel$a
            com.zykj.student.dialogue.ui.home.HomePagerViewModel r10 = r0.f11560d
            r11.<init>(r5, r6)
            r12 = 2
            r13 = 0
            r10 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            kotlinx.coroutines.flow.Flow r5 = r8.getFlow()
            if (r5 != 0) goto L63
        L59:
            androidx.paging.PagingData$Companion r5 = androidx.paging.PagingData.INSTANCE
            androidx.paging.PagingData r5 = r5.empty()
            kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.flowOf(r5)
        L63:
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.f11558b = r6
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r0.f11559c = r4
            r0.f11557a = r3
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.emitAll(r2, r5, r0)
            if (r2 != r1) goto L78
            return r1
        L78:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.HomePagerViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomePagerViewModel$special$$inlined$flatMapLatest$1.smali:151
    }

    public final Object invoke(FlowCollector flowCollector, Object obj, Continuation continuation) {
        HomePagerViewModel$special$$inlined$flatMapLatest$1 homePagerViewModel$special$$inlined$flatMapLatest$1 = new HomePagerViewModel$special$$inlined$flatMapLatest$1(continuation, this.f11560d);
        homePagerViewModel$special$$inlined$flatMapLatest$1.f11558b = flowCollector;
        homePagerViewModel$special$$inlined$flatMapLatest$1.f11559c = obj;
        return homePagerViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
