package com.zykj.mistake.feature.review;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.entity.req.SubmitReviewResultReq;
import com.zykj.mistake.entity.resp.SubmitReviewResultResp;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$AnswerResult;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.network.InterfaceC5090c;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.review.ReviewPracticeSessionStore$submitAnswer$response$1", m5303f = "ReviewPracticeSessionStore.kt", m5304i = {}, m5305l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class ReviewPracticeSessionStore$submitAnswer$response$1 extends SuspendLambda implements InterfaceC6471c {
    final /* synthetic */ int $itemId;
    final /* synthetic */ long $numericSessionId;
    final /* synthetic */ MistakeDetailNewContract$AnswerResult $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewPracticeSessionStore$submitAnswer$response$1(long j7, int i, MistakeDetailNewContract$AnswerResult mistakeDetailNewContract$AnswerResult, InterfaceC5631c<? super ReviewPracticeSessionStore$submitAnswer$response$1> interfaceC5631c) {
        super(1, interfaceC5631c);
        this.$numericSessionId = j7;
        this.$itemId = i;
        this.$result = mistakeDetailNewContract$AnswerResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
        return new ReviewPracticeSessionStore$submitAnswer$response$1(this.$numericSessionId, this.$itemId, this.$result, interfaceC5631c);
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(InterfaceC5631c<? super SubmitReviewResultResp> interfaceC5631c) {
        return ((ReviewPracticeSessionStore$submitAnswer$response$1) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
        C5009q c5009q = C5009q.f7711a;
        InterfaceC5090c interfaceC5090cM4382c = C5088a.f7986a.m4382c();
        SubmitReviewResultReq submitReviewResultReq = new SubmitReviewResultReq(this.$numericSessionId, this.$itemId, this.$result == MistakeDetailNewContract$AnswerResult.CORRECT);
        this.label = 1;
        Object objM4426r = interfaceC5090cM4382c.m4426r(submitReviewResultReq, this);
        return objM4426r == coroutineSingletons ? coroutineSingletons : objM4426r;
    }
}
