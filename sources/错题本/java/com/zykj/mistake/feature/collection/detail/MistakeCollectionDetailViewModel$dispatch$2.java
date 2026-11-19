package com.zykj.mistake.feature.collection.detail;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.C5873b;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel$dispatch$2", m5303f = "MistakeCollectionDetailViewModel.kt", m5304i = {}, m5305l = {110}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MistakeCollectionDetailViewModel$dispatch$2 extends SuspendLambda implements InterfaceC6473e {
    int label;
    final /* synthetic */ MistakeCollectionDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionDetailViewModel$dispatch$2(MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel, InterfaceC5631c<? super MistakeCollectionDetailViewModel$dispatch$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mistakeCollectionDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MistakeCollectionDetailViewModel$dispatch$2(this.this$0, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C5873b c5873b = this.this$0.f6439e;
            this.label = 1;
            if (c5873b.mo5494q(this, C4593g.f6481a) == coroutineSingletons) {
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
        return ((MistakeCollectionDetailViewModel$dispatch$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
