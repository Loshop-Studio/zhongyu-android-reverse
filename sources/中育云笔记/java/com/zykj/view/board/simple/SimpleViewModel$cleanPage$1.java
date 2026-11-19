package com.zykj.view.board.simple;

import com.zykj.view.board.simple.AbstractC8884b;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleViewModel$cleanPage$1", m26211f = "SimpleViewModel.kt", m26212l = {237}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SimpleViewModel$cleanPage$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20456c;

    /* renamed from: d */
    public final /* synthetic */ SimpleViewModel f20457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$cleanPage$1(SimpleViewModel simpleViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20457d = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SimpleViewModel$cleanPage$1(this.f20457d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20456c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11602k interfaceC11602k = this.f20457d.f20454c;
            AbstractC8884b.a aVar = AbstractC8884b.a.f20489a;
            this.f20456c = 1;
            if (interfaceC11602k.emit(aVar, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SimpleViewModel$cleanPage$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
