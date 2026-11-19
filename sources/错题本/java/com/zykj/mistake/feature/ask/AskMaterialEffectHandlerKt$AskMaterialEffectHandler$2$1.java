package com.zykj.mistake.feature.ask;

import com.zykj.mistake.activity.MainActivity;
import java.util.ArrayList;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5904c;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p167t4.C6592e;
import p191w4.InterfaceC6718c;
import p212z4.C6814a;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1", m5303f = "AskMaterialEffectHandler.kt", m5304i = {}, m5305l = {39}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6814a $environment;
    final /* synthetic */ C6592e $mainNavController;
    final /* synthetic */ InterfaceC6718c $platformBridge;
    final /* synthetic */ C4512b $resolveGate;
    final /* synthetic */ MistakeAskMaterialViewModel $viewModel;
    int label;

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/ask/j;", "effect", "Ld6/s;", "<anonymous>", "(Lcom/zykj/mistake/feature/ask/j;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1", m5303f = "AskMaterialEffectHandler.kt", m5304i = {0}, m5305l = {44}, m5306m = "invokeSuspend", m5307n = {"effect"}, m5308s = {"L$0"})
    /* renamed from: com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1$1 */
    public static final class C44971 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ C6814a $environment;
        final /* synthetic */ C6592e $mainNavController;
        final /* synthetic */ InterfaceC6718c $platformBridge;
        final /* synthetic */ C4512b $resolveGate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44971(C6592e c6592e, InterfaceC6718c interfaceC6718c, C6814a c6814a, C4512b c4512b, InterfaceC5631c<? super C44971> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$mainNavController = c6592e;
            this.$platformBridge = interfaceC6718c;
            this.$environment = c6814a;
            this.$resolveGate = c4512b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C44971 c44971 = new C44971(this.$mainNavController, this.$platformBridge, this.$environment, this.$resolveGate, interfaceC5631c);
            c44971.L$0 = obj;
            return c44971;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC4528j abstractC4528j, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C44971) create(abstractC4528j, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC4528j abstractC4528j = (AbstractC4528j) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                if (AbstractC5830k.m5325b(abstractC4528j, C4522g.f6239a)) {
                    this.$mainNavController.f11003a.popBackStack();
                } else if (abstractC4528j instanceof C4526i) {
                    ((MainActivity) this.$platformBridge).m3907b(((C4526i) abstractC4528j).f6250a);
                } else {
                    if (!(abstractC4528j instanceof C4524h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList arrayList = ((C4524h) abstractC4528j).f6247a;
                    C6814a c6814a = this.$environment;
                    InterfaceC6718c interfaceC6718c = this.$platformBridge;
                    C4512b c4512b = this.$resolveGate;
                    this.L$0 = null;
                    this.label = 1;
                    if (AbstractC4510a.m3999c(arrayList, c6814a, interfaceC6718c, c4512b, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1(MistakeAskMaterialViewModel mistakeAskMaterialViewModel, C6592e c6592e, InterfaceC6718c interfaceC6718c, C6814a c6814a, C4512b c4512b, InterfaceC5631c<? super AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$viewModel = mistakeAskMaterialViewModel;
        this.$mainNavController = c6592e;
        this.$platformBridge = interfaceC6718c;
        this.$environment = c6814a;
        this.$resolveGate = c4512b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1(this.$viewModel, this.$mainNavController, this.$platformBridge, this.$environment, this.$resolveGate, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C5904c c5904c = this.$viewModel.f6213d;
            C44971 c44971 = new C44971(this.$mainNavController, this.$platformBridge, this.$environment, this.$resolveGate, null);
            this.label = 1;
            if (AbstractC5914h.m5552h(c5904c, c44971, this) == coroutineSingletons) {
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
        return ((AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
