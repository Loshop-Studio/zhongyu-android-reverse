package com.friday.user.viewmodel;

import com.friday.user.R$string;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.user.viewmodel.UserViewModel$clearCache$2", m26211f = "UserViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class UserViewModel$clearCache$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10697c;

    /* renamed from: d */
    public final /* synthetic */ UserViewModel f10698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserViewModel$clearCache$2(UserViewModel userViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10698d = userViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new UserViewModel$clearCache$2(this.f10698d, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((UserViewModel$clearCache$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10697c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f10698d.m7829r().setValue(AbstractC11826a.m26206a(false));
        AbstractC11958b.m26587h(R$string.local_cache_has_not_clean);
        return C10786q.f26013a;
    }
}
