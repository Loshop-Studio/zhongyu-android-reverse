package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC8846h;
import com.zykj.view.board.board.AbstractC8848j;
import com.zykj.view.board.simple.AbstractC8884b;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleViewModel$updateEraserSizeLevel$1", m26211f = "SimpleViewModel.kt", m26212l = {175}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SimpleViewModel$updateEraserSizeLevel$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f20467c;

    /* renamed from: d */
    public int f20468d;

    /* renamed from: e */
    public final /* synthetic */ int f20469e;

    /* renamed from: f */
    public final /* synthetic */ SimpleViewModel f20470f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateEraserSizeLevel$1(int i10, SimpleViewModel simpleViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20469e = i10;
        this.f20470f = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SimpleViewModel$updateEraserSizeLevel$1(this.f20469e, this.f20470f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20468d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC8848j abstractC8848j = (AbstractC8848j) AbstractC8846h.m16966b().get(this.f20469e);
            InterfaceC11603l interfaceC11603l = this.f20470f.f20452a;
            do {
                value = interfaceC11603l.getValue();
            } while (!interfaceC11603l.mo20870e(value, C8887e.m17320b((C8887e) value, false, null, null, null, null, null, abstractC8848j, null, 191, null)));
            InterfaceC11602k interfaceC11602k = this.f20470f.f20454c;
            AbstractC8884b.c cVar = new AbstractC8884b.c(abstractC8848j.m16973b());
            this.f20467c = AbstractC11833h.m26224a(abstractC8848j);
            this.f20468d = 1;
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
        return ((SimpleViewModel$updateEraserSizeLevel$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
