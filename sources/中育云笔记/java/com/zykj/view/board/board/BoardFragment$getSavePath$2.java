package com.zykj.view.board.board;

import com.blankj.utilcode.util.ToastUtils;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$getSavePath$2", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardFragment$getSavePath$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20056c;

    /* renamed from: d */
    public /* synthetic */ Object f20057d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9540l f20058e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC9540l f20059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$getSavePath$2(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20058e = interfaceC9540l;
        this.f20059f = interfaceC9540l2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BoardFragment$getSavePath$2 boardFragment$getSavePath$2 = new BoardFragment$getSavePath$2(this.f20058e, this.f20059f, interfaceC11588c);
        boardFragment$getSavePath$2.f20057d = obj;
        return boardFragment$getSavePath$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((BoardFragment$getSavePath$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f20057d;
        AbstractC11725a.m25952f();
        if (this.f20056c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC9540l interfaceC9540l = this.f20058e;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(th);
        } else {
            String message = th.getMessage();
            if (message != null) {
                ToastUtils.showShort(message, new Object[0]);
            }
        }
        this.f20059f.invoke(null);
        return C10786q.f26013a;
    }
}
