package com.zykj.view.board.board;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$getSavePath$2", m26211f = "BoardViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardViewModel$getSavePath$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20180c;

    public BoardViewModel$getSavePath$2(InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BoardViewModel$getSavePath$2(interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, InterfaceC11588c interfaceC11588c) {
        return ((BoardViewModel$getSavePath$2) create(str, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f20180c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return C10786q.f26013a;
    }
}
