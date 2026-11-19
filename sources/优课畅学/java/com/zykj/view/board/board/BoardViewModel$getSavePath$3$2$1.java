package com.zykj.view.board.board;

import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$2$1", m17801f = "BoardViewModel.kt", m17802l = {1139}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardViewModel$getSavePath$3$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f14972a;

    /* renamed from: b */
    public int f14973b;

    /* renamed from: c */
    public int f14974c;

    /* renamed from: d */
    public /* synthetic */ Object f14975d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC10574p f14976e;

    /* renamed from: f */
    public final /* synthetic */ String f14977f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$getSavePath$3$2$1(InterfaceC10574p interfaceC10574p, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14976e = interfaceC10574p;
        this.f14977f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        BoardViewModel$getSavePath$3$2$1 boardViewModel$getSavePath$3$2$1 = new BoardViewModel$getSavePath$3$2$1(this.f14976e, this.f14977f, interfaceC9324c);
        boardViewModel$getSavePath$3$2$1.f14975d = obj;
        return boardViewModel$getSavePath$3$2$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BoardViewModel$getSavePath$3$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15909b;
        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f14975d;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14974c;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC10574p interfaceC10574p = this.f14976e;
                String str = this.f14977f;
                Result.C9076a c9076a = Result.f17350b;
                this.f14975d = AbstractC9543h.m17814a(interfaceC8822b0);
                this.f14972a = AbstractC9543h.m17814a(interfaceC8822b0);
                this.f14973b = 0;
                this.f14974c = 1;
                if (interfaceC10574p.invoke(str, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            objM15909b = Result.m15909b(C8736p.f16368a);
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        Throwable thM15911d = Result.m15911d(objM15909b);
        if (thM15911d != null) {
            thM15911d.printStackTrace();
        }
        return C8736p.f16368a;
    }
}
