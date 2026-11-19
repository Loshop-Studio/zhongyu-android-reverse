package com.friday.main.view;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p375v7.InterfaceC11548a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$initObserver$10$1$1$1", m26211f = "HomeActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeActivity$initObserver$10$1$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9395c;

    /* renamed from: d */
    public final /* synthetic */ HomeActivity f9396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$initObserver$10$1$1$1(HomeActivity homeActivity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9396d = homeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeActivity$initObserver$10$1$1$1(this.f9396d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f9395c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11548a interfaceC11548a = (InterfaceC11548a) this.f9396d.m7142w0().m7259r().getValue();
        if (interfaceC11548a != null) {
            HomeActivity homeActivity = this.f9396d;
            interfaceC11548a.mo25410e();
            interfaceC11548a.mo25411f(homeActivity.getPackageName());
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeActivity$initObserver$10$1$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
