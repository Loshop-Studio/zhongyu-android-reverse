package com.zykj.mistake.feature.collection.list;

import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.main.C5085y0;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.main.RemoveDialogTarget;
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
import p175u4.C6616c;
import p191w4.InterfaceC6718c;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.list.CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1", m5303f = "CollectionListEffectHandler.kt", m5304i = {}, m5305l = {22}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6592e $mainNavController;
    final /* synthetic */ InterfaceC6718c $platformBridge;
    final /* synthetic */ MainShellViewModel $shellViewModel;
    final /* synthetic */ MistakeCollectionViewModel $viewModel;
    int label;

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/collection/list/g;", "effect", "Ld6/s;", "<anonymous>", "(Lcom/zykj/mistake/feature/collection/list/g;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.list.CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1", m5303f = "CollectionListEffectHandler.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.list.CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1$1 */
    public static final class C46911 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ C6592e $mainNavController;
        final /* synthetic */ InterfaceC6718c $platformBridge;
        final /* synthetic */ MainShellViewModel $shellViewModel;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46911(InterfaceC6718c interfaceC6718c, MainShellViewModel mainShellViewModel, C6592e c6592e, InterfaceC5631c<? super C46911> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$platformBridge = interfaceC6718c;
            this.$shellViewModel = mainShellViewModel;
            this.$mainNavController = c6592e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C46911 c46911 = new C46911(this.$platformBridge, this.$shellViewModel, this.$mainNavController, interfaceC5631c);
            c46911.L$0 = obj;
            return c46911;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC4708g abstractC4708g, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C46911) create(abstractC4708g, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC4708g abstractC4708g = (AbstractC4708g) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            if (abstractC4708g instanceof C4707f) {
                ((MainActivity) this.$platformBridge).m3907b(((C4707f) abstractC4708g).f6760a);
            } else if (AbstractC5830k.m5325b(abstractC4708g, C4703c.f6754a)) {
                this.$shellViewModel.f7816h = true;
            } else if (AbstractC5830k.m5325b(abstractC4708g, C4706e.f6759a)) {
                this.$shellViewModel.m4354b(new C5085y0(RemoveDialogTarget.COLLECTION));
            } else {
                if (!(abstractC4708g instanceof C4705d)) {
                    throw new NoWhenBranchMatchedException();
                }
                C6592e c6592e = this.$mainNavController;
                C4705d c4705d = (C4705d) abstractC4708g;
                AbstractC5830k.m5330g(c4705d, "<this>");
                C6616c c6616c = new C6616c(c4705d.f6755a, c4705d.f6756b, c4705d.f6757c, c4705d.f6758d);
                c6592e.getClass();
                NavController.navigate$default(c6592e.f11003a, c6616c, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
            }
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1(MistakeCollectionViewModel mistakeCollectionViewModel, InterfaceC6718c interfaceC6718c, MainShellViewModel mainShellViewModel, C6592e c6592e, InterfaceC5631c<? super CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$viewModel = mistakeCollectionViewModel;
        this.$platformBridge = interfaceC6718c;
        this.$shellViewModel = mainShellViewModel;
        this.$mainNavController = c6592e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1(this.$viewModel, this.$platformBridge, this.$shellViewModel, this.$mainNavController, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C5904c c5904c = this.$viewModel.f6738e;
            C46911 c46911 = new C46911(this.$platformBridge, this.$shellViewModel, this.$mainNavController, null);
            this.label = 1;
            if (AbstractC5914h.m5552h(c5904c, c46911, this) == coroutineSingletons) {
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
        return ((CollectionListEffectHandlerKt$CollectionListEffectHandler$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
