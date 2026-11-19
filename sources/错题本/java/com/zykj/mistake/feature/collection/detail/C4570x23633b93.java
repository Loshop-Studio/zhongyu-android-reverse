package com.zykj.mistake.feature.collection.detail;

import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.feature.collection.filter.C4661l;
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
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5904c;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p167t4.C6592e;
import p175u4.C6620g;
import p191w4.InterfaceC6718c;
import p212z4.C6816c;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1", m5303f = "CollectionDetailEffectHandler.kt", m5304i = {}, m5305l = {24}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* renamed from: com.zykj.mistake.feature.collection.detail.CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1 */
/* loaded from: classes3.dex */
final class C4570x23633b93 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6816c $environment;
    final /* synthetic */ C6592e $mainNavController;
    final /* synthetic */ InterfaceC6718c $platformBridge;
    final /* synthetic */ MainShellViewModel $shellViewModel;
    final /* synthetic */ MistakeCollectionDetailViewModel $viewModel;
    int label;

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/collection/detail/m;", "effect", "Ld6/s;", "<anonymous>", "(Lcom/zykj/mistake/feature/collection/detail/m;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1", m5303f = "CollectionDetailEffectHandler.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.collection.detail.CollectionDetailEffectHandlerKt$CollectionDetailEffectHandler$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ C6816c $environment;
        final /* synthetic */ C6592e $mainNavController;
        final /* synthetic */ InterfaceC6718c $platformBridge;
        final /* synthetic */ MainShellViewModel $shellViewModel;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6592e c6592e, MainShellViewModel mainShellViewModel, InterfaceC6718c interfaceC6718c, C6816c c6816c, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$mainNavController = c6592e;
            this.$shellViewModel = mainShellViewModel;
            this.$platformBridge = interfaceC6718c;
            this.$environment = c6816c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mainNavController, this.$shellViewModel, this.$platformBridge, this.$environment, interfaceC5631c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC4605m abstractC4605m, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((AnonymousClass1) create(abstractC4605m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ParseException {
            AbstractC4605m abstractC4605m = (AbstractC4605m) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            if (AbstractC5830k.m5325b(abstractC4605m, C4593g.f6481a)) {
                this.$mainNavController.f11003a.popBackStack();
            } else if (AbstractC5830k.m5325b(abstractC4605m, C4601k.f6505a)) {
                this.$shellViewModel.f7816h = true;
            } else if (abstractC4605m instanceof C4603l) {
                ((MainActivity) this.$platformBridge).m3907b(((C4603l) abstractC4605m).f6507a);
            } else if (abstractC4605m instanceof C4595h) {
                C4595h c4595h = (C4595h) abstractC4605m;
                this.$environment.f11544a.m61f(CollectionDatePickerTarget.DETAIL_FILTER, c4595h.f6483a, c4595h.f6484b);
            } else if (abstractC4605m instanceof C4597i) {
                C6592e c6592e = this.$mainNavController;
                C4597i c4597i = (C4597i) abstractC4605m;
                AbstractC5830k.m5330g(c4597i, "<this>");
                C4661l c4661l = new C4661l(c4597i.f6486a, c4597i.f6487b, c4597i.f6488c, c4597i.f6489d, c4597i.f6490e, c4597i.f6491f, c4597i.f6492g, c4597i.f6493h);
                c6592e.getClass();
                NavController.navigate$default(c6592e.f11003a, c4661l, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
            } else {
                if (!(abstractC4605m instanceof C4599j)) {
                    throw new NoWhenBranchMatchedException();
                }
                C6592e c6592e2 = this.$mainNavController;
                C4599j c4599j = (C4599j) abstractC4605m;
                AbstractC5830k.m5330g(c4599j, "<this>");
                c6592e2.m6224c(new C6620g(c4599j.f6495a, c4599j.f6496b, c4599j.f6497c, "", "", "", c4599j.f6498d, c4599j.f6499e, c4599j.f6500f, false, c4599j.f6501g, c4599j.f6503i, null, null, null, 256000), c4599j.f6502h);
            }
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4570x23633b93(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, C6592e c6592e, MainShellViewModel mainShellViewModel, InterfaceC6718c interfaceC6718c, C6816c c6816c, InterfaceC5631c<? super C4570x23633b93> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$viewModel = mistakeCollectionDetailViewModel;
        this.$mainNavController = c6592e;
        this.$shellViewModel = mainShellViewModel;
        this.$platformBridge = interfaceC6718c;
        this.$environment = c6816c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new C4570x23633b93(this.$viewModel, this.$mainNavController, this.$shellViewModel, this.$platformBridge, this.$environment, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C5904c c5904c = this.$viewModel.f6440f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mainNavController, this.$shellViewModel, this.$platformBridge, this.$environment, null);
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
        return ((C4570x23633b93) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
