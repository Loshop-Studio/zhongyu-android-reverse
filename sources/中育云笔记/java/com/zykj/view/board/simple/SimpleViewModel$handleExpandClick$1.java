package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC8850l;
import com.zykj.view.board.simple.AbstractC8884b;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleViewModel$handleExpandClick$1", m26211f = "SimpleViewModel.kt", m26212l = {206}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SimpleViewModel$handleExpandClick$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public boolean f20458c;

    /* renamed from: d */
    public int f20459d;

    /* renamed from: e */
    public final /* synthetic */ SimpleViewModel f20460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$handleExpandClick$1(SimpleViewModel simpleViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20460e = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SimpleViewModel$handleExpandClick$1(this.f20460e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20459d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            boolean zM20289b = AbstractC9979u.m20289b(((C8887e) this.f20460e.f20452a.getValue()).m17323d(), AbstractC8850l.a.f20257b);
            InterfaceC11602k interfaceC11602k = this.f20460e.f20454c;
            AbstractC8884b.b bVar = new AbstractC8884b.b(zM20289b);
            this.f20458c = zM20289b;
            this.f20459d = 1;
            if (interfaceC11602k.emit(bVar, this) == objM25952f) {
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
        return ((SimpleViewModel$handleExpandClick$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
