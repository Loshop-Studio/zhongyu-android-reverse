package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.entity.req.SetMistakeQstItemPracticeResultReq;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.network.InterfaceC5090c;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/network/ApiResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$submitPendingAnswerResult$5", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {2145}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$submitPendingAnswerResult$5 extends SuspendLambda implements InterfaceC6471c {
    final /* synthetic */ MistakeDetailNewContract$AnswerResult $result;
    final /* synthetic */ C4837m3 $state;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$submitPendingAnswerResult$5(MistakeDetailNewViewModel mistakeDetailNewViewModel, C4837m3 c4837m3, MistakeDetailNewContract$AnswerResult mistakeDetailNewContract$AnswerResult, InterfaceC5631c<? super MistakeDetailNewViewModel$submitPendingAnswerResult$5> interfaceC5631c) {
        super(1, interfaceC5631c);
        this.this$0 = mistakeDetailNewViewModel;
        this.$state = c4837m3;
        this.$result = mistakeDetailNewContract$AnswerResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$submitPendingAnswerResult$5(this.this$0, this.$state, this.$result, interfaceC5631c);
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(InterfaceC5631c<? super ApiResp> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$submitPendingAnswerResult$5) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return obj;
        }
        AbstractC5774b.m5119b(obj);
        InterfaceC5090c interfaceC5090cM4116c = MistakeDetailNewViewModel.m4116c(this.this$0);
        SetMistakeQstItemPracticeResultReq setMistakeQstItemPracticeResultReq = new SetMistakeQstItemPracticeResultReq(this.$state.f7149b, this.$result == MistakeDetailNewContract$AnswerResult.CORRECT);
        this.label = 1;
        Object objM4407D = interfaceC5090cM4116c.m4407D(setMistakeQstItemPracticeResultReq, this);
        return objM4407D == coroutineSingletons ? coroutineSingletons : objM4407D;
    }
}
