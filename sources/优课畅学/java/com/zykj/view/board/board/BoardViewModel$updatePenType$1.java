package com.zykj.view.board.board;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p007a6.AbstractC0040n;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardViewModel$updatePenType$1", m17801f = "BoardViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardViewModel$updatePenType$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14993a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f14994b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC8225u f14995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$updatePenType$1(BoardViewModel boardViewModel, AbstractC8225u abstractC8225u, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14994b = boardViewModel;
        this.f14995c = abstractC8225u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new BoardViewModel$updatePenType$1(this.f14994b, this.f14995c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BoardViewModel$updatePenType$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        AbstractC9434a.m17291f();
        if (this.f14993a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC9271h interfaceC9271h = this.f14994b.f14934l;
        AbstractC8225u abstractC8225u = this.f14995c;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8224t.m12901b((C8224t) value, false, false, abstractC8225u, 0, null, 27, null)));
        this.f14994b.m12787S0();
        AbstractC0040n.m110n(AbstractC9536a.m17798c(this.f14995c.m12909b()));
        return C8736p.f16368a;
    }
}
