package com.zykj.mistake.feature.notebook.detail;

import com.zykj.mistake.feature.review.C5005m;
import com.zykj.mistake.feature.review.C5009q;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.C5946n0;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$switchReviewQuestion$3", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {0, 0, 0}, m5305l = {1078}, m5306m = "invokeSuspend", m5307n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-MistakeDetailNewViewModel$switchReviewQuestion$3$1"}, m5308s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2474:1\n230#2,5:2475\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3\n*L\n1081#1:2475,5\n*E\n"})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$switchReviewQuestion$3 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $loadingAlreadyShown;
    final /* synthetic */ String $sessionId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$switchReviewQuestion$3(boolean z8, MistakeDetailNewViewModel mistakeDetailNewViewModel, String str, InterfaceC5631c<? super MistakeDetailNewViewModel$switchReviewQuestion$3> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$loadingAlreadyShown = z8;
        this.this$0 = mistakeDetailNewViewModel;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        MistakeDetailNewViewModel$switchReviewQuestion$3 mistakeDetailNewViewModel$switchReviewQuestion$3 = new MistakeDetailNewViewModel$switchReviewQuestion$3(this.$loadingAlreadyShown, this.this$0, this.$sessionId, interfaceC5631c);
        mistakeDetailNewViewModel$switchReviewQuestion$3.L$0 = obj;
        return mistakeDetailNewViewModel$switchReviewQuestion$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM13956constructorimpl;
        Object value;
        Object objM4328c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                if (!this.$loadingAlreadyShown) {
                    this.this$0.m4144S(C4805h1.f7013a);
                }
                String str = this.$sessionId;
                C5009q c5009q = C5009q.f7711a;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                objM4328c = c5009q.m4328c(str, false, this);
                if (objM4328c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                objM4328c = obj;
            }
            objM13956constructorimpl = Result.m13956constructorimpl((C5005m) objM4328c);
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        MistakeDetailNewViewModel mistakeDetailNewViewModel = this.this$0;
        String str2 = this.$sessionId;
        if (Result.m13962isSuccessimpl(objM13956constructorimpl)) {
            C5005m c5005m = (C5005m) objM13956constructorimpl;
            if (c5005m == null || c5005m.f7693c.isEmpty()) {
                C5946n0 c5946n0 = mistakeDetailNewViewModel.f6876e;
                do {
                    value = c5946n0.getValue();
                    C5009q c5009q2 = C5009q.f7711a;
                } while (!c5946n0.m5569i(value, C4837m3.m4207a((C4837m3) value, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, null, false, false, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, 0, null, 0, false, null, null, null, null, false, false, false, false, null, null, false, null, false, false, false, true, false, MistakeDetailNewViewModel.m4119d0(C5009q.m4326f(str2)), 0, -1, 1610612735, 1)));
            } else {
                MistakeDetailNewViewModel.m4112a(mistakeDetailNewViewModel, c5005m);
            }
        }
        MistakeDetailNewViewModel mistakeDetailNewViewModel2 = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM13956constructorimpl);
        if (thM13959exceptionOrNullimpl != null) {
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mistakeDetailNewViewModel2.m4144S(new C4817j1(message));
        }
        this.this$0.m4144S(C4900x0.f7400a);
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$switchReviewQuestion$3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
