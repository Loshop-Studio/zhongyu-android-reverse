package com.zykj.view.board.board;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p378vb.AbstractC11584n;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$updatePenColorLevel$1", m26211f = "BoardViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardViewModel$updatePenColorLevel$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20204c;

    /* renamed from: d */
    public final /* synthetic */ int f20205d;

    /* renamed from: e */
    public final /* synthetic */ BoardViewModel f20206e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$updatePenColorLevel$1(int i10, BoardViewModel boardViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20205d = i10;
        this.f20206e = boardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BoardViewModel$updatePenColorLevel$1(this.f20205d, this.f20206e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        AbstractC11725a.m25952f();
        if (this.f20204c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        AbstractC8857s abstractC8857s = (AbstractC8857s) AbstractC8846h.m16967c().get(this.f20205d);
        InterfaceC11603l interfaceC11603l = this.f20206e.f20151l;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8858t.m17017b((C8858t) value, false, false, null, 0, abstractC8857s, 15, null)));
        this.f20206e.m16903U0();
        AbstractC11584n.m25515l(AbstractC11826a.m26208c(abstractC8857s.m17015a()));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BoardViewModel$updatePenColorLevel$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
