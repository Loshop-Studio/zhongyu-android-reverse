package com.zykj.view.board.simple;

import com.zykj.view.board.simple.AbstractC8884b;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutEraser$1", m26211f = "SimpleViewModel.kt", m26212l = {189}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SimpleViewModel$updateConfigAboutEraser$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f20461c;

    /* renamed from: d */
    public int f20462d;

    /* renamed from: e */
    public final /* synthetic */ SimpleViewModel f20463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateConfigAboutEraser$1(SimpleViewModel simpleViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20463e = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SimpleViewModel$updateConfigAboutEraser$1(this.f20463e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20462d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            C8887e c8887e = (C8887e) this.f20463e.f20452a.getValue();
            InterfaceC11602k interfaceC11602k = this.f20463e.f20454c;
            AbstractC8884b.c cVar = new AbstractC8884b.c(c8887e.m17322c().m16973b());
            this.f20461c = AbstractC11833h.m26224a(c8887e);
            this.f20462d = 1;
            if (interfaceC11602k.emit(cVar, this) == objM25952f) {
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
        return ((SimpleViewModel$updateConfigAboutEraser$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
