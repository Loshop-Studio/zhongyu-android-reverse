package com.zykj.student.dialogue.p076ui.collect;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import com.zykj.student.dialogue.p076ui.collect.AbstractC7494b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Lcom/zykj/student/dialogue/bean/resp/CollectSession;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectHistoryViewModel$applyEvents$1", m13451f = "CollectHistoryViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class CollectHistoryViewModel$applyEvents$1 extends SuspendLambda implements Function2<CollectSession, Continuation<? super Boolean>, Object> {

    /* renamed from: a */
    public int f10750a;

    /* renamed from: b */
    public /* synthetic */ Object f10751b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7494b f10752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectHistoryViewModel$applyEvents$1(AbstractC7494b abstractC7494b, Continuation continuation) {
        super(2, continuation);
        this.f10752c = abstractC7494b;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CollectSession collectSession, Continuation continuation) {
        return ((CollectHistoryViewModel$applyEvents$1) create(collectSession, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CollectHistoryViewModel$applyEvents$1 collectHistoryViewModel$applyEvents$1 = new CollectHistoryViewModel$applyEvents$1(this.f10752c, continuation);
        collectHistoryViewModel$applyEvents$1.f10751b = obj;
        return collectHistoryViewModel$applyEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CollectSession collectSession = (CollectSession) this.f10751b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10750a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((AbstractC7494b.a) this.f10752c).m10187b() || !Intrinsics.areEqual(((AbstractC7494b.a) this.f10752c).m10186a(), collectSession.getId()));
    }
}
