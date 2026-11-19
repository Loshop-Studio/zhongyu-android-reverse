package com.zykj.mistake.feature.collection.filter;

import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.platform.picker.CollectionDatePickerTarget;
import java.text.ParseException;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5904c;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p167t4.C6592e;
import p175u4.C6616c;
import p191w4.InterfaceC6718c;
import p207y6.InterfaceC6779c;
import p212z4.C6816c;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1", m5303f = "CollectionFilterResultEffectHandler.kt", m5304i = {}, m5305l = {23}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* renamed from: com.zykj.mistake.feature.collection.filter.CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1 */
/* loaded from: classes3.dex */
final class C4633xe94a128b extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6816c $environment;
    final /* synthetic */ C6592e $mainNavController;
    final /* synthetic */ InterfaceC6718c $platformBridge;
    final /* synthetic */ MainShellViewModel $shellViewModel;
    final /* synthetic */ MistakeCollectionFilterResultViewModel $viewModel;
    int label;

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/collection/filter/q;", "effect", "Ld6/s;", "<anonymous>", "(Lcom/zykj/mistake/feature/collection/filter/q;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.filter.CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1", m5303f = "CollectionFilterResultEffectHandler.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.filter.CollectionFilterResultEffectHandlerKt$CollectionFilterResultEffectHandler$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ C6816c $environment;
        final /* synthetic */ C6592e $mainNavController;
        final /* synthetic */ InterfaceC6718c $platformBridge;
        final /* synthetic */ MainShellViewModel $shellViewModel;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6592e c6592e, InterfaceC6718c interfaceC6718c, MainShellViewModel mainShellViewModel, C6816c c6816c, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$mainNavController = c6592e;
            this.$platformBridge = interfaceC6718c;
            this.$shellViewModel = mainShellViewModel;
            this.$environment = c6816c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mainNavController, this.$platformBridge, this.$shellViewModel, this.$environment, interfaceC5631c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC4671q abstractC4671q, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((AnonymousClass1) create(abstractC4671q, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ParseException {
            AbstractC4671q abstractC4671q = (AbstractC4671q) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            if (AbstractC5830k.m5325b(abstractC4671q, C4665n.f6665a)) {
                this.$mainNavController.f11003a.popBackStack();
            } else if (abstractC4671q instanceof C4669p) {
                ((MainActivity) this.$platformBridge).m3907b(((C4669p) abstractC4671q).f6670a);
            } else if (abstractC4671q instanceof C4663m) {
                this.$shellViewModel.f7816h = true;
                this.$mainNavController.m6222a(Boolean.TRUE, "nav_result_collection_detail_refresh");
                this.$mainNavController.m6222a(new Integer(((C4663m) abstractC4671q).f6663a), "nav_result_collection_added_count");
                this.$mainNavController.f11003a.popBackStack((InterfaceC6779c) AbstractC5832m.m5340a(C6616c.class), false, false);
            } else {
                if (!(abstractC4671q instanceof C4667o)) {
                    throw new NoWhenBranchMatchedException();
                }
                C4667o c4667o = (C4667o) abstractC4671q;
                this.$environment.f11544a.m61f(CollectionDatePickerTarget.FILTER_RESULT, c4667o.f6667a, c4667o.f6668b);
            }
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4633xe94a128b(MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel, C6592e c6592e, InterfaceC6718c interfaceC6718c, MainShellViewModel mainShellViewModel, C6816c c6816c, InterfaceC5631c<? super C4633xe94a128b> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$viewModel = mistakeCollectionFilterResultViewModel;
        this.$mainNavController = c6592e;
        this.$platformBridge = interfaceC6718c;
        this.$shellViewModel = mainShellViewModel;
        this.$environment = c6816c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new C4633xe94a128b(this.$viewModel, this.$mainNavController, this.$platformBridge, this.$shellViewModel, this.$environment, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C5904c c5904c = this.$viewModel.f6581f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mainNavController, this.$platformBridge, this.$shellViewModel, this.$environment, null);
            this.label = 1;
            if (AbstractC5914h.m5552h(c5904c, anonymousClass1, this) == coroutineSingletons) {
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
        return ((C4633xe94a128b) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
