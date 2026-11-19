package com.zykj.mistake.feature.review;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.entity.resp.GetNextReviewQuestionResp;
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

@Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/GetNextReviewQuestionResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.review.ReviewPracticeSessionStore$requestNextRound$response$1", m5303f = "ReviewPracticeSessionStore.kt", m5304i = {}, m5305l = {70}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class ReviewPracticeSessionStore$requestNextRound$response$1 extends SuspendLambda implements InterfaceC6471c {
    final /* synthetic */ boolean $continueNextRound;
    final /* synthetic */ long $numericSessionId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewPracticeSessionStore$requestNextRound$response$1(long j7, boolean z8, InterfaceC5631c<? super ReviewPracticeSessionStore$requestNextRound$response$1> interfaceC5631c) {
        super(1, interfaceC5631c);
        this.$numericSessionId = j7;
        this.$continueNextRound = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
        return new ReviewPracticeSessionStore$requestNextRound$response$1(this.$numericSessionId, this.$continueNextRound, interfaceC5631c);
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(InterfaceC5631c<? super GetNextReviewQuestionResp> interfaceC5631c) {
        return ((ReviewPracticeSessionStore$requestNextRound$response$1) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
        long j7 = this.$numericSessionId;
        boolean z8 = this.$continueNextRound;
        this.label = 1;
        Object objM4406C = interfaceC5090cM4382c.m4406C(j7, z8, this);
        return objM4406C == coroutineSingletons ? coroutineSingletons : objM4406C;
    }
}
