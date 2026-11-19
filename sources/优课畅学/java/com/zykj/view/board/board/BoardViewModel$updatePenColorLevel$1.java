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

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardViewModel$updatePenColorLevel$1", m17801f = "BoardViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardViewModel$updatePenColorLevel$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14987a;

    /* renamed from: b */
    public final /* synthetic */ int f14988b;

    /* renamed from: c */
    public final /* synthetic */ BoardViewModel f14989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$updatePenColorLevel$1(int i10, BoardViewModel boardViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14988b = i10;
        this.f14989c = boardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new BoardViewModel$updatePenColorLevel$1(this.f14988b, this.f14989c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BoardViewModel$updatePenColorLevel$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        AbstractC9434a.m17291f();
        if (this.f14987a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        AbstractC8223s abstractC8223s = (AbstractC8223s) AbstractC8212h.m12851c().get(this.f14988b);
        InterfaceC9271h interfaceC9271h = this.f14989c.f14934l;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8224t.m12901b((C8224t) value, false, false, null, 0, abstractC8223s, 15, null)));
        this.f14989c.m12787S0();
        AbstractC0040n.m108l(AbstractC9536a.m17798c(abstractC8223s.m12899a()));
        return C8736p.f16368a;
    }
}
