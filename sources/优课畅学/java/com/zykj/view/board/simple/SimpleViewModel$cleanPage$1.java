package com.zykj.view.board.simple;

import com.zykj.view.board.simple.AbstractC8251b;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleViewModel$cleanPage$1", m17801f = "SimpleViewModel.kt", m17802l = {237}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SimpleViewModel$cleanPage$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15245a;

    /* renamed from: b */
    public final /* synthetic */ SimpleViewModel f15246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$cleanPage$1(SimpleViewModel simpleViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15246b = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SimpleViewModel$cleanPage$1(this.f15246b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SimpleViewModel$cleanPage$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f15245a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9270g interfaceC9270g = this.f15246b.f15243c;
            AbstractC8251b.a aVar = AbstractC8251b.a.f15278a;
            this.f15245a = 1;
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
