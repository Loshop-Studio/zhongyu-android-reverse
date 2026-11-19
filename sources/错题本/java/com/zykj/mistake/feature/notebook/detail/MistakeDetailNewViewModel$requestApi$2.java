package com.zykj.mistake.feature.notebook.detail;

import com.zykj.mistake.data.AbstractC4496e;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$requestApi$2", m5303f = "MistakeDetailNewViewModel.kt", m5304i = {}, m5305l = {2398}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeDetailNewViewModel$requestApi$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ boolean $loadingAlreadyShown;
    final /* synthetic */ InterfaceC6471c $onSuccess;
    final /* synthetic */ InterfaceC6471c $request;
    final /* synthetic */ InterfaceC6471c $transform;
    int label;
    final /* synthetic */ MistakeDetailNewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewViewModel$requestApi$2(boolean z8, MistakeDetailNewViewModel mistakeDetailNewViewModel, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC5631c<? super MistakeDetailNewViewModel$requestApi$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$loadingAlreadyShown = z8;
        this.this$0 = mistakeDetailNewViewModel;
        this.$request = interfaceC6471c;
        this.$transform = interfaceC6471c2;
        this.$onSuccess = interfaceC6471c3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewViewModel$requestApi$2(this.$loadingAlreadyShown, this.this$0, this.$request, this.$transform, this.$onSuccess, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM3979b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            if (!this.$loadingAlreadyShown) {
                this.this$0.m4144S(C4805h1.f7013a);
            }
            InterfaceC6471c interfaceC6471c = this.$request;
            InterfaceC6471c interfaceC6471c2 = this.$transform;
            this.label = 1;
            objM3979b = AbstractC4496e.m3979b(interfaceC6471c, interfaceC6471c2, this);
            if (objM3979b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            objM3979b = ((Result) obj).getValue();
        }
        InterfaceC6471c interfaceC6471c3 = this.$onSuccess;
        if (Result.m13962isSuccessimpl(objM3979b)) {
            interfaceC6471c3.invoke(objM3979b);
        }
        MistakeDetailNewViewModel mistakeDetailNewViewModel = this.this$0;
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM3979b);
        if (thM13959exceptionOrNullimpl != null) {
            String message = thM13959exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mistakeDetailNewViewModel.m4144S(new C4817j1(message));
        }
        this.this$0.m4144S(C4900x0.f7400a);
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewViewModel$requestApi$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
