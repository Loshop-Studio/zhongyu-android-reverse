package com.zykj.mistake.feature.notebook.list;

import android.content.Intent;
import androidx.navigation.C2857e;
import com.zykj.mistake.activity.LegacyMistakeActivity;
import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.main.C5054j0;
import com.zykj.mistake.main.C5056k0;
import com.zykj.mistake.main.C5069q0;
import com.zykj.mistake.main.C5071r0;
import com.zykj.mistake.main.C5073s0;
import com.zykj.mistake.main.C5085y0;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.main.RemoveDialogTarget;
import com.zykj.mistake.utils.C5100e;
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
import p212z4.C6820g;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.NotebookEffectHandlerKt$NotebookEffectHandler$1$1", m5303f = "NotebookEffectHandler.kt", m5304i = {}, m5305l = {26}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class NotebookEffectHandlerKt$NotebookEffectHandler$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6820g $environment;
    final /* synthetic */ C6592e $mainNavController;
    final /* synthetic */ InterfaceC6718c $platformBridge;
    final /* synthetic */ MainShellViewModel $shellViewModel;
    final /* synthetic */ MistakeNotebookViewModel $viewModel;
    int label;

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/notebook/list/y;", "effect", "Ld6/s;", "<anonymous>", "(Lcom/zykj/mistake/feature/notebook/list/y;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.list.NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1", m5303f = "NotebookEffectHandler.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.feature.notebook.list.NotebookEffectHandlerKt$NotebookEffectHandler$1$1$1 */
    public static final class C49261 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ C6820g $environment;
        final /* synthetic */ C6592e $mainNavController;
        final /* synthetic */ InterfaceC6718c $platformBridge;
        final /* synthetic */ MainShellViewModel $shellViewModel;
        final /* synthetic */ MistakeNotebookViewModel $viewModel;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49261(C6820g c6820g, MainShellViewModel mainShellViewModel, C6592e c6592e, InterfaceC6718c interfaceC6718c, MistakeNotebookViewModel mistakeNotebookViewModel, InterfaceC5631c<? super C49261> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$environment = c6820g;
            this.$shellViewModel = mainShellViewModel;
            this.$mainNavController = c6592e;
            this.$platformBridge = interfaceC6718c;
            this.$viewModel = mistakeNotebookViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C49261 c49261 = new C49261(this.$environment, this.$shellViewModel, this.$mainNavController, this.$platformBridge, this.$viewModel, interfaceC5631c);
            c49261.L$0 = obj;
            return c49261;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC4988y abstractC4988y, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C49261) create(abstractC4988y, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC4988y abstractC4988y = (AbstractC4988y) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            if (AbstractC5830k.m5325b(abstractC4988y, C4957k.f7571a)) {
                C5100e.m4458b(6, "MainFloatingButton", null);
                this.$environment.f11555c.invoke(new C2857e(14, this.$shellViewModel, this.$viewModel));
            } else if (AbstractC5830k.m5325b(abstractC4988y, C4972q.f7594a)) {
                int i = LegacyMistakeActivity.f5783b;
                MainActivity mainActivity = this.$environment.f11553a;
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) LegacyMistakeActivity.class));
            } else if (AbstractC5830k.m5325b(abstractC4988y, C4982v.f7618a)) {
                this.$shellViewModel.m4354b(new C5085y0(RemoveDialogTarget.NOTEBOOK));
            } else if (abstractC4988y instanceof C4976s) {
                this.$shellViewModel.m4354b(new C5071r0(((C4976s) abstractC4988y).f7612a));
            } else if (abstractC4988y instanceof C4978t) {
                this.$shellViewModel.m4354b(new C5073s0(((C4978t) abstractC4988y).f7614a));
            } else if (AbstractC5830k.m5325b(abstractC4988y, C4963m.f7585a)) {
                this.$shellViewModel.m4354b(C5054j0.f7926a);
            } else if (AbstractC5830k.m5325b(abstractC4988y, C4966n.f7587a)) {
                this.$shellViewModel.m4354b(C5056k0.f7927a);
            } else if (abstractC4988y instanceof C4970p) {
                C4970p c4970p = (C4970p) abstractC4988y;
                this.$shellViewModel.m4354b(new C5069q0(c4970p.f7591a, c4970p.f7592b));
            } else if (abstractC4988y instanceof C4974r) {
                C6592e c6592e = this.$mainNavController;
                C4974r c4974r = (C4974r) abstractC4988y;
                AbstractC5830k.m5330g(c4974r, "<this>");
                c6592e.m6224c(new C6620g(c4974r.f7598a, c4974r.f7599b, c4974r.f7600c, c4974r.f7601d, c4974r.f7602e, c4974r.f7603f, c4974r.f7604g, c4974r.f7605h, c4974r.f7606i, c4974r.f7607j, c4974r.f7608k, c4974r.f7610m, null, null, null, 256000), c4974r.f7609l);
            } else if (AbstractC5830k.m5325b(abstractC4988y, C4984w.f7620a)) {
                ((MainActivity) this.$platformBridge).m3909d(false);
            } else if (AbstractC5830k.m5325b(abstractC4988y, C4968o.f7589a)) {
                ((MainActivity) this.$platformBridge).m3908c();
            } else if (AbstractC5830k.m5325b(abstractC4988y, C4960l.f7574a)) {
                this.$shellViewModel.f7816h = true;
            } else if (AbstractC5830k.m5325b(abstractC4988y, C4980u.f7616a)) {
                this.$shellViewModel.f7817i = true;
            } else {
                if (!(abstractC4988y instanceof C4986x)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((MainActivity) this.$platformBridge).m3907b(((C4986x) abstractC4988y).f7622a);
            }
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotebookEffectHandlerKt$NotebookEffectHandler$1$1(MistakeNotebookViewModel mistakeNotebookViewModel, C6820g c6820g, MainShellViewModel mainShellViewModel, C6592e c6592e, InterfaceC6718c interfaceC6718c, InterfaceC5631c<? super NotebookEffectHandlerKt$NotebookEffectHandler$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$viewModel = mistakeNotebookViewModel;
        this.$environment = c6820g;
        this.$shellViewModel = mainShellViewModel;
        this.$mainNavController = c6592e;
        this.$platformBridge = interfaceC6718c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new NotebookEffectHandlerKt$NotebookEffectHandler$1$1(this.$viewModel, this.$environment, this.$shellViewModel, this.$mainNavController, this.$platformBridge, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            MistakeNotebookViewModel mistakeNotebookViewModel = this.$viewModel;
            C5904c c5904c = mistakeNotebookViewModel.f7451g;
            C49261 c49261 = new C49261(this.$environment, this.$shellViewModel, this.$mainNavController, this.$platformBridge, mistakeNotebookViewModel, null);
            this.label = 1;
            if (AbstractC5914h.m5552h(c5904c, c49261, this) == coroutineSingletons) {
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
        return ((NotebookEffectHandlerKt$NotebookEffectHandler$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
