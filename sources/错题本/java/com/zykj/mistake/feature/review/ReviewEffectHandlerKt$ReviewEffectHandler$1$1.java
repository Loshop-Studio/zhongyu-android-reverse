package com.zykj.mistake.feature.review;

import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$EntryMode;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5904c;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p167t4.C6592e;
import p175u4.C6620g;
import p191w4.InterfaceC6718c;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.review.ReviewEffectHandlerKt$ReviewEffectHandler$1$1", m5303f = "ReviewEffectHandler.kt", m5304i = {}, m5305l = {17}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class ReviewEffectHandlerKt$ReviewEffectHandler$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6592e $mainNavController;
    final /* synthetic */ InterfaceC6718c $platformBridge;
    final /* synthetic */ ReviewViewModel $viewModel;
    int label;

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/review/c;", "effect", "Ld6/s;", "<anonymous>", "(Lcom/zykj/mistake/feature/review/c;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.review.ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1", m5303f = "ReviewEffectHandler.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.review.ReviewEffectHandlerKt$ReviewEffectHandler$1$1$1 */
    public static final class C49921 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ C6592e $mainNavController;
        final /* synthetic */ InterfaceC6718c $platformBridge;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49921(C6592e c6592e, InterfaceC6718c interfaceC6718c, InterfaceC5631c<? super C49921> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$mainNavController = c6592e;
            this.$platformBridge = interfaceC6718c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C49921 c49921 = new C49921(this.$mainNavController, this.$platformBridge, interfaceC5631c);
            c49921.L$0 = obj;
            return c49921;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC4995c abstractC4995c, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C49921) create(abstractC4995c, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC4995c abstractC4995c = (AbstractC4995c) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            if (abstractC4995c instanceof C4993a) {
                C4993a c4993a = (C4993a) abstractC4995c;
                this.$mainNavController.m6224c(new C6620g(0, 0, 0L, null, null, null, null, false, false, false, null, 0, MistakeDetailNewContract$EntryMode.REVIEW_RECOMMEND, c4993a.f7639a, c4993a.f7640b, 57343), EmptyList.INSTANCE);
            } else {
                if (!(abstractC4995c instanceof C4994b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((MainActivity) this.$platformBridge).m3907b(((C4994b) abstractC4995c).f7641a);
            }
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewEffectHandlerKt$ReviewEffectHandler$1$1(ReviewViewModel reviewViewModel, C6592e c6592e, InterfaceC6718c interfaceC6718c, InterfaceC5631c<? super ReviewEffectHandlerKt$ReviewEffectHandler$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$viewModel = reviewViewModel;
        this.$mainNavController = c6592e;
        this.$platformBridge = interfaceC6718c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new ReviewEffectHandlerKt$ReviewEffectHandler$1$1(this.$viewModel, this.$mainNavController, this.$platformBridge, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C5904c c5904c = this.$viewModel.f7636e;
            C49921 c49921 = new C49921(this.$mainNavController, this.$platformBridge, null);
            this.label = 1;
            if (AbstractC5914h.m5552h(c5904c, c49921, this) == coroutineSingletons) {
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
        return ((ReviewEffectHandlerKt$ReviewEffectHandler$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
