package com.zykj.view.board.simple;

import com.taobao.sophix.PatchStatus;
import com.zykj.view.board.simple.AbstractC8884b;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleViewModel$updatePenType$1", m26211f = "SimpleViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SimpleViewModel$updatePenType$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20482c;

    /* renamed from: d */
    public final /* synthetic */ SimpleViewModel f20483d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC8886d f20484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updatePenType$1(SimpleViewModel simpleViewModel, AbstractC8886d abstractC8886d, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20483d = simpleViewModel;
        this.f20484e = abstractC8886d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SimpleViewModel$updatePenType$1(this.f20483d, this.f20484e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20482c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11603l interfaceC11603l = this.f20483d.f20452a;
            AbstractC8886d abstractC8886d = this.f20484e;
            do {
                value = interfaceC11603l.getValue();
            } while (!interfaceC11603l.mo20870e(value, C8887e.m17320b((C8887e) value, false, null, null, abstractC8886d, null, null, null, null, 247, null)));
            InterfaceC11602k interfaceC11602k = this.f20483d.f20454c;
            AbstractC8884b.f fVar = new AbstractC8884b.f(this.f20484e.m17317a(), this.f20484e.m17319c());
            this.f20482c = 1;
            if (interfaceC11602k.emit(fVar, this) == objM25952f) {
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
        return ((SimpleViewModel$updatePenType$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
