package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import com.zykj.student.dialogue.p076ui.home.AbstractC7636p;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m13412d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m13413d2 = {"<anonymous>", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;", "it"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerViewModel$applyEvents$1", m13451f = "HomePagerViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class HomePagerViewModel$applyEvents$1 extends SuspendLambda implements Function2<QuestionResp, Continuation<? super QuestionResp>, Object> {

    /* renamed from: a */
    public int f11565a;

    /* renamed from: b */
    public /* synthetic */ Object f11566b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7636p f11567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$applyEvents$1(AbstractC7636p abstractC7636p, Continuation continuation) {
        super(2, continuation);
        this.f11567c = abstractC7636p;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(QuestionResp questionResp, Continuation continuation) {
        return ((HomePagerViewModel$applyEvents$1) create(questionResp, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomePagerViewModel$applyEvents$1 homePagerViewModel$applyEvents$1 = new HomePagerViewModel$applyEvents$1(this.f11567c, continuation);
        homePagerViewModel$applyEvents$1.f11566b = obj;
        return homePagerViewModel$applyEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QuestionResp questionResp = (QuestionResp) this.f11566b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11565a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((AbstractC7636p.b) this.f11567c).m11035a().getId() == questionResp.getId() ? QuestionResp.copy$default(questionResp, 0L, 0, 0, null, null, null, null, 0, 0, null, null, null, null, 0, 0, 0, 0, null, 0, 0, false, false, 4194047, null) : questionResp;
    }
}
