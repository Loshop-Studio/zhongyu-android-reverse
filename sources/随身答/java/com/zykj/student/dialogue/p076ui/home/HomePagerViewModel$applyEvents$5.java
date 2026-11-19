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
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerViewModel$applyEvents$5", m13451f = "HomePagerViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class HomePagerViewModel$applyEvents$5 extends SuspendLambda implements Function2<QuestionResp, Continuation<? super QuestionResp>, Object> {

    /* renamed from: a */
    public int f11571a;

    /* renamed from: b */
    public /* synthetic */ Object f11572b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7636p f11573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$applyEvents$5(AbstractC7636p abstractC7636p, Continuation continuation) {
        super(2, continuation);
        this.f11573c = abstractC7636p;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(QuestionResp questionResp, Continuation continuation) {
        return ((HomePagerViewModel$applyEvents$5) create(questionResp, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomePagerViewModel$applyEvents$5 homePagerViewModel$applyEvents$5 = new HomePagerViewModel$applyEvents$5(this.f11573c, continuation);
        homePagerViewModel$applyEvents$5.f11572b = obj;
        return homePagerViewModel$applyEvents$5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QuestionResp questionResp = (QuestionResp) this.f11572b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11571a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return questionResp.getId() == Long.parseLong(((AbstractC7636p.c) this.f11573c).m11036a()) ? QuestionResp.copy$default(questionResp, 0L, 0, 0, null, null, null, null, 0, 0, null, null, null, null, 0, 0, 0, 0, null, 0, ((AbstractC7636p.c) this.f11573c).m11037b(), false, false, 3670015, null) : questionResp;
    }
}
