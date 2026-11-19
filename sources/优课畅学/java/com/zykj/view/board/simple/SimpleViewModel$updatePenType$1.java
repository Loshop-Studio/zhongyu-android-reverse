package com.zykj.view.board.simple;

import com.zykj.view.board.simple.AbstractC8251b;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleViewModel$updatePenType$1", m17801f = "SimpleViewModel.kt", m17802l = {83}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SimpleViewModel$updatePenType$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15271a;

    /* renamed from: b */
    public final /* synthetic */ SimpleViewModel f15272b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC8253d f15273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updatePenType$1(SimpleViewModel simpleViewModel, AbstractC8253d abstractC8253d, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15272b = simpleViewModel;
        this.f15273c = abstractC8253d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SimpleViewModel$updatePenType$1(this.f15272b, this.f15273c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SimpleViewModel$updatePenType$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f15271a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9271h interfaceC9271h = this.f15272b.f15241a;
            AbstractC8253d abstractC8253d = this.f15273c;
            do {
                value = interfaceC9271h.getValue();
            } while (!interfaceC9271h.mo16686e(value, C8254e.m13248b((C8254e) value, false, null, null, abstractC8253d, null, null, null, null, 247, null)));
            InterfaceC9270g interfaceC9270g = this.f15272b.f15243c;
            AbstractC8251b.f fVar = new AbstractC8251b.f(this.f15273c.m13245a(), this.f15273c.m13247c());
            this.f15271a = 1;
            if (interfaceC9270g.emit(fVar, this) == objM17291f) {
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
