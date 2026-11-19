package com.zykj.mistake.feature.review;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.entity.req.StartReviewSessionReq;
import com.zykj.mistake.entity.resp.StartReviewSessionResp;
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

@Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "Lcom/zykj/mistake/entity/resp/StartReviewSessionResp;"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.feature.review.ReviewPracticeSessionStore$startPractice$start$1", m5303f = "ReviewPracticeSessionStore.kt", m5304i = {}, m5305l = {187}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class ReviewPracticeSessionStore$startPractice$start$1 extends SuspendLambda implements InterfaceC6471c {
    final /* synthetic */ int $mode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewPracticeSessionStore$startPractice$start$1(int i, InterfaceC5631c<? super ReviewPracticeSessionStore$startPractice$start$1> interfaceC5631c) {
        super(1, interfaceC5631c);
        this.$mode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
        return new ReviewPracticeSessionStore$startPractice$start$1(this.$mode, interfaceC5631c);
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(InterfaceC5631c<? super StartReviewSessionResp> interfaceC5631c) {
        return ((ReviewPracticeSessionStore$startPractice$start$1) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
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
        StartReviewSessionReq startReviewSessionReq = new StartReviewSessionReq(this.$mode);
        this.label = 1;
        Object objM4434z = interfaceC5090cM4382c.m4434z(startReviewSessionReq, this);
        return objM4434z == coroutineSingletons ? coroutineSingletons : objM4434z;
    }
}
