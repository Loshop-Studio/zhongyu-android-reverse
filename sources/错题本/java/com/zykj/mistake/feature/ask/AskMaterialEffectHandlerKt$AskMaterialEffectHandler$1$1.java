package com.zykj.mistake.feature.ask;

import java.util.Set;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p212z4.C6814a;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1", m5303f = "AskMaterialEffectHandler.kt", m5304i = {}, m5305l = {30}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C4520f $bundle;
    final /* synthetic */ C6814a $environment;
    final /* synthetic */ MistakeAskMaterialViewModel $viewModel;
    final /* synthetic */ Set<String> $webPreviewingItems;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1(C4520f c4520f, C6814a c6814a, MistakeAskMaterialViewModel mistakeAskMaterialViewModel, Set<String> set, InterfaceC5631c<? super AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$bundle = c4520f;
        this.$environment = c6814a;
        this.$viewModel = mistakeAskMaterialViewModel;
        this.$webPreviewingItems = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1(this.$bundle, this.$environment, this.$viewModel, this.$webPreviewingItems, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C4520f c4520f = this.$bundle;
            C6814a c6814a = this.$environment;
            MistakeAskMaterialViewModel mistakeAskMaterialViewModel = this.$viewModel;
            Set<String> set = this.$webPreviewingItems;
            this.label = 1;
            if (AbstractC4510a.m3998b(c4520f, c6814a, mistakeAskMaterialViewModel, set, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
