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

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$updatePenSizeLevel$1", m26211f = "BoardViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardViewModel$updatePenSizeLevel$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20207c;

    /* renamed from: d */
    public final /* synthetic */ BoardViewModel f20208d;

    /* renamed from: e */
    public final /* synthetic */ int f20209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$updatePenSizeLevel$1(BoardViewModel boardViewModel, int i10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20208d = boardViewModel;
        this.f20209e = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BoardViewModel$updatePenSizeLevel$1(this.f20208d, this.f20209e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        AbstractC11725a.m25952f();
        if (this.f20207c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11603l interfaceC11603l = this.f20208d.f20151l;
        int i10 = this.f20209e;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8858t.m17017b((C8858t) value, false, false, null, i10, null, 23, null)));
        this.f20208d.m16903U0();
        AbstractC11584n.m25516m(AbstractC11826a.m26208c(this.f20209e));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BoardViewModel$updatePenSizeLevel$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
