package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8207c;
import com.zykj.view.board.board.AbstractC8216l;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardViewModel$handleExpandClick$1", m17801f = "BoardViewModel.kt", m17802l = {778}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardViewModel$handleExpandClick$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public boolean f14981a;

    /* renamed from: b */
    public int f14982b;

    /* renamed from: c */
    public final /* synthetic */ BoardViewModel f14983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$handleExpandClick$1(BoardViewModel boardViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14983c = boardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new BoardViewModel$handleExpandClick$1(this.f14983c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BoardViewModel$handleExpandClick$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14982b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            boolean zM16128b = AbstractC9133u.m16128b(((C8215k) this.f14983c.f14946x.getValue()).m12859b(), AbstractC8216l.a.f15041b);
            InterfaceC9270g interfaceC9270g = this.f14983c.f14930h;
            AbstractC8207c.a aVar = new AbstractC8207c.a(zM16128b);
            this.f14981a = zM16128b;
            this.f14982b = 1;
            if (interfaceC9270g.emit(aVar, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
