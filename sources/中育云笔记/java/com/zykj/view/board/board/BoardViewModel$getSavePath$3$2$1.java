package com.zykj.view.board.board;

import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$2$1", m26211f = "BoardViewModel.kt", m26212l = {1139}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardViewModel$getSavePath$3$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f20189c;

    /* renamed from: d */
    public int f20190d;

    /* renamed from: e */
    public int f20191e;

    /* renamed from: f */
    public /* synthetic */ Object f20192f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC9544p f20193g;

    /* renamed from: h */
    public final /* synthetic */ String f20194h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$getSavePath$3$2$1(InterfaceC9544p interfaceC9544p, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20193g = interfaceC9544p;
        this.f20194h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BoardViewModel$getSavePath$3$2$1 boardViewModel$getSavePath$3$2$1 = new BoardViewModel$getSavePath$3$2$1(this.f20193g, this.f20194h, interfaceC11588c);
        boardViewModel$getSavePath$3$2$1.f20192f = obj;
        return boardViewModel$getSavePath$3$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM20054c;
        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f20192f;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20191e;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC9544p interfaceC9544p = this.f20193g;
                String str = this.f20194h;
                Result.C9921a c9921a = Result.f23263d;
                this.f20192f = AbstractC11833h.m26224a(interfaceC11122i0);
                this.f20189c = AbstractC11833h.m26224a(interfaceC11122i0);
                this.f20190d = 0;
                this.f20191e = 1;
                if (interfaceC9544p.invoke(str, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            objM20054c = Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        Throwable thM20056e = Result.m20056e(objM20054c);
        if (thM20056e != null) {
            thM20056e.printStackTrace();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BoardViewModel$getSavePath$3$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
