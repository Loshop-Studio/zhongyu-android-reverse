package com.zykj.mistake.feature.ask;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.ask.AskMaterialRouteKt$AskMaterialRoute$1$1", m5303f = "AskMaterialRoute.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class AskMaterialRouteKt$AskMaterialRoute$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C4520f $bundle;
    final /* synthetic */ MistakeAskMaterialViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskMaterialRouteKt$AskMaterialRoute$1$1(MistakeAskMaterialViewModel mistakeAskMaterialViewModel, C4520f c4520f, InterfaceC5631c<? super AskMaterialRouteKt$AskMaterialRoute$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$viewModel = mistakeAskMaterialViewModel;
        this.$bundle = c4520f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new AskMaterialRouteKt$AskMaterialRoute$1$1(this.$viewModel, this.$bundle, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        this.$viewModel.m3995a(new C4541q(this.$bundle));
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((AskMaterialRouteKt$AskMaterialRoute$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
