package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8216l;
import com.zykj.view.board.board.AbstractC8222r;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardViewModel$updateExpandState$1", m17801f = "BoardViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardViewModel$updateExpandState$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14984a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f14985b;

    /* renamed from: c */
    public final /* synthetic */ boolean f14986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$updateExpandState$1(BoardViewModel boardViewModel, boolean z10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14985b = boardViewModel;
        this.f14986c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new BoardViewModel$updateExpandState$1(this.f14985b, this.f14986c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BoardViewModel$updateExpandState$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        AbstractC9434a.m17291f();
        if (this.f14984a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC9271h interfaceC9271h = this.f14985b.f14946x;
        boolean z10 = this.f14986c;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, ((C8215k) value).m12858a(z10 ? AbstractC8216l.b.f15042b : AbstractC8216l.a.f15041b)));
        if (!this.f14986c) {
            InterfaceC9271h interfaceC9271h2 = this.f14985b.f14942t;
            do {
                value2 = interfaceC9271h2.getValue();
            } while (!interfaceC9271h2.mo16686e(value2, C8217m.m12861b((C8217m) value2, AbstractC8222r.d.f15086e, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 510, null)));
        }
        return C8736p.f16368a;
    }
}
