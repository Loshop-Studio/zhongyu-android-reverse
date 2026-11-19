package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC8216l;
import com.zykj.view.board.simple.AbstractC8251b;
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

@InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleViewModel$handleExpandClick$1", m17801f = "SimpleViewModel.kt", m17802l = {206}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SimpleViewModel$handleExpandClick$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public boolean f15247a;

    /* renamed from: b */
    public int f15248b;

    /* renamed from: c */
    public final /* synthetic */ SimpleViewModel f15249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$handleExpandClick$1(SimpleViewModel simpleViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15249c = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SimpleViewModel$handleExpandClick$1(this.f15249c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SimpleViewModel$handleExpandClick$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f15248b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            boolean zM16128b = AbstractC9133u.m16128b(((C8254e) this.f15249c.f15241a.getValue()).m13251d(), AbstractC8216l.a.f15041b);
            InterfaceC9270g interfaceC9270g = this.f15249c.f15243c;
            AbstractC8251b.b bVar = new AbstractC8251b.b(zM16128b);
            this.f15247a = zM16128b;
            this.f15248b = 1;
            if (interfaceC9270g.emit(bVar, this) == objM17291f) {
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
