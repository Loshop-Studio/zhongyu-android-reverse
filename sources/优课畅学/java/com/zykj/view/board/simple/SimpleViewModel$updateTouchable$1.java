package com.zykj.view.board.simple;

import com.zykj.view.board.simple.AbstractC8251b;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleViewModel$updateTouchable$1", m17801f = "SimpleViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SimpleViewModel$updateTouchable$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15274a;

    /* renamed from: b */
    public final /* synthetic */ SimpleViewModel f15275b;

    /* renamed from: c */
    public final /* synthetic */ boolean f15276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateTouchable$1(SimpleViewModel simpleViewModel, boolean z10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15275b = simpleViewModel;
        this.f15276c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SimpleViewModel$updateTouchable$1(this.f15275b, this.f15276c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SimpleViewModel$updateTouchable$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        AbstractC9434a.m17291f();
        if (this.f15274a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC9271h interfaceC9271h = this.f15275b.f15241a;
        boolean z10 = this.f15276c;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8254e.m13248b((C8254e) value, z10, null, null, null, null, null, null, null, 254, null)));
        this.f15275b.f15243c.mo16670a(new AbstractC8251b.d(this.f15276c));
        return C8736p.f16368a;
    }
}
