package com.zykj.mistake.feature.notebook.detail;

import androidx.navigation.C2856d;
import com.zykj.view.simpleBoard.SimpleBoardView;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1", m5303f = "MistakeDetailNewScreen.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C4764a5 $draftController;
    final /* synthetic */ boolean $isTemporaryDraftMode;
    final /* synthetic */ InterfaceC6471c $onIntent;
    final /* synthetic */ C4837m3 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1(C4837m3 c4837m3, boolean z8, C4764a5 c4764a5, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$state = c4837m3;
        this.$isTemporaryDraftMode = z8;
        this.$draftController = c4764a5;
        this.$onIntent = interfaceC6471c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1(this.$state, this.$isTemporaryDraftMode, this.$draftController, this.$onIntent, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        MistakeDetailNewContract$DraftNavigation mistakeDetailNewContract$DraftNavigation = this.$state.f7134N;
        C5443s c5443s = C5443s.f8405a;
        if (mistakeDetailNewContract$DraftNavigation == null) {
            return c5443s;
        }
        if (!this.$isTemporaryDraftMode) {
            this.$draftController.m4175k(new C2856d(10, this.$onIntent, mistakeDetailNewContract$DraftNavigation));
            return c5443s;
        }
        SimpleBoardView simpleBoardView = this.$draftController.f6894a;
        if (simpleBoardView != null) {
            simpleBoardView.clean();
        }
        this.$draftController.m4170f();
        this.$onIntent.invoke(new C4775c2(mistakeDetailNewContract$DraftNavigation));
        return c5443s;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
