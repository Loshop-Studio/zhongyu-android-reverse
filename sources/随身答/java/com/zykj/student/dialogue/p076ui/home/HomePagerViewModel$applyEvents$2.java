package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import com.zykj.student.dialogue.p076ui.home.AbstractC7636p;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagerViewModel$applyEvents$2", m13451f = "HomePagerViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class HomePagerViewModel$applyEvents$2 extends SuspendLambda implements Function2<QuestionResp, Continuation<? super Boolean>, Object> {

    /* renamed from: a */
    public int f11568a;

    /* renamed from: b */
    public /* synthetic */ Object f11569b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7636p f11570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$applyEvents$2(AbstractC7636p abstractC7636p, Continuation continuation) {
        super(2, continuation);
        this.f11570c = abstractC7636p;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(QuestionResp questionResp, Continuation continuation) {
        return ((HomePagerViewModel$applyEvents$2) create(questionResp, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomePagerViewModel$applyEvents$2 homePagerViewModel$applyEvents$2 = new HomePagerViewModel$applyEvents$2(this.f11570c, continuation);
        homePagerViewModel$applyEvents$2.f11569b = obj;
        return homePagerViewModel$applyEvents$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QuestionResp questionResp = (QuestionResp) this.f11569b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11568a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(!((AbstractC7636p.a) this.f11570c).m11034a().contains(Boxing.boxLong(questionResp.getId())));
    }
}
