package com.friday.user.viewmodel;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.user.viewmodel.UserViewModel$getName$2", m26211f = "UserViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class UserViewModel$getName$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10717c;

    /* renamed from: d */
    public /* synthetic */ Object f10718d;

    public UserViewModel$getName$2(InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        UserViewModel$getName$2 userViewModel$getName$2 = new UserViewModel$getName$2(interfaceC11588c);
        userViewModel$getName$2.f10718d = obj;
        return userViewModel$getName$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((UserViewModel$getName$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f10718d;
        AbstractC11725a.m25952f();
        if (this.f10717c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        th.printStackTrace();
        return C10786q.f26013a;
    }
}
