package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC8212h;
import com.zykj.view.board.board.AbstractC8214j;
import com.zykj.view.board.simple.AbstractC8251b;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleViewModel$updateEraserSizeLevel$1", m17801f = "SimpleViewModel.kt", m17802l = {175}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SimpleViewModel$updateEraserSizeLevel$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f15256a;

    /* renamed from: b */
    public int f15257b;

    /* renamed from: c */
    public final /* synthetic */ int f15258c;

    /* renamed from: d */
    public final /* synthetic */ SimpleViewModel f15259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateEraserSizeLevel$1(int i10, SimpleViewModel simpleViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15258c = i10;
        this.f15259d = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SimpleViewModel$updateEraserSizeLevel$1(this.f15258c, this.f15259d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SimpleViewModel$updateEraserSizeLevel$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f15257b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            AbstractC8214j abstractC8214j = (AbstractC8214j) AbstractC8212h.m12850b().get(this.f15258c);
            InterfaceC9271h interfaceC9271h = this.f15259d.f15241a;
            do {
                value = interfaceC9271h.getValue();
            } while (!interfaceC9271h.mo16686e(value, C8254e.m13248b((C8254e) value, false, null, null, null, null, null, abstractC8214j, null, 191, null)));
            InterfaceC9270g interfaceC9270g = this.f15259d.f15243c;
            AbstractC8251b.c cVar = new AbstractC8251b.c(abstractC8214j.m12857b());
            this.f15256a = AbstractC9543h.m17814a(abstractC8214j);
            this.f15257b = 1;
            if (interfaceC9270g.emit(cVar, this) == objM17291f) {
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
