package com.zykj.view.board.board;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$3$1", m26211f = "BoardViewModel.kt", m26212l = {1147}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardViewModel$getSavePath$3$3$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20195c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9544p f20196d;

    /* renamed from: e */
    public final /* synthetic */ Throwable f20197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$getSavePath$3$3$1(InterfaceC9544p interfaceC9544p, Throwable th, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20196d = interfaceC9544p;
        this.f20197e = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BoardViewModel$getSavePath$3$3$1(this.f20196d, this.f20197e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20195c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC9544p interfaceC9544p = this.f20196d;
            Throwable th = this.f20197e;
            this.f20195c = 1;
            if (interfaceC9544p.invoke(th, this) == objM25952f) {
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
        return ((BoardViewModel$getSavePath$3$3$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
