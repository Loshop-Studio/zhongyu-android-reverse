package com.zykj.view.board.simple;

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

@InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleViewModel$updateExpandState$1", m17801f = "SimpleViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SimpleViewModel$updateExpandState$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15260a;

    /* renamed from: b */
    public final /* synthetic */ SimpleViewModel f15261b;

    /* renamed from: c */
    public final /* synthetic */ boolean f15262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateExpandState$1(SimpleViewModel simpleViewModel, boolean z10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15261b = simpleViewModel;
        this.f15262c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SimpleViewModel$updateExpandState$1(this.f15261b, this.f15262c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SimpleViewModel$updateExpandState$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        AbstractC9434a.m17291f();
        if (this.f15260a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC9271h interfaceC9271h = this.f15261b.f15241a;
        boolean z10 = this.f15262c;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, C8254e.m13248b((C8254e) value, false, null, null, null, null, null, null, z10 ? AbstractC8216l.b.f15042b : AbstractC8216l.a.f15041b, 127, null)));
        if (!this.f15262c) {
            InterfaceC9271h interfaceC9271h2 = this.f15261b.f15241a;
            do {
                value2 = interfaceC9271h2.getValue();
            } while (!interfaceC9271h2.mo16686e(value2, C8254e.m13248b((C8254e) value2, false, null, AbstractC8222r.d.f15086e, null, null, null, null, null, 251, null)));
        }
        return C8736p.f16368a;
    }
}
