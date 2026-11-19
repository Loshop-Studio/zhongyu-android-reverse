package com.zykj.mistake.feature.notebook.detail;

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
@DebugMetadata(m5302c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewScreenKt$MistakeDetailNewScreen$dispatchIntent$1$1$1", m5303f = "MistakeDetailNewScreen.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* renamed from: com.zykj.mistake.feature.notebook.detail.MistakeDetailNewScreenKt$MistakeDetailNewScreen$dispatchIntent$1$1$1 */
/* loaded from: classes3.dex */
final class C4747xd569f006 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C4764a5 $draftController;
    final /* synthetic */ AbstractC4813i3 $intent;
    final /* synthetic */ InterfaceC6471c $onIntent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4747xd569f006(C4764a5 c4764a5, InterfaceC6471c interfaceC6471c, AbstractC4813i3 abstractC4813i3, InterfaceC5631c<? super C4747xd569f006> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$draftController = c4764a5;
        this.$onIntent = interfaceC6471c;
        this.$intent = abstractC4813i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new C4747xd569f006(this.$draftController, this.$onIntent, this.$intent, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        SimpleBoardView simpleBoardView = this.$draftController.f6894a;
        if (simpleBoardView != null) {
            simpleBoardView.clean();
        }
        this.$draftController.m4170f();
        this.$onIntent.invoke(this.$intent);
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((C4747xd569f006) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
