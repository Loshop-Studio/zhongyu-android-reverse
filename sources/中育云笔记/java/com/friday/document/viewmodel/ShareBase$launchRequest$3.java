package com.friday.document.viewmodel;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p430z2.C11970b1;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBase$launchRequest$3", m26211f = "ShareBase.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBase$launchRequest$3 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8184c;

    /* renamed from: d */
    public /* synthetic */ Object f8185d;

    /* renamed from: e */
    public final /* synthetic */ ShareBase f8186e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC9540l f8187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBase$launchRequest$3(ShareBase shareBase, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8186e = shareBase;
        this.f8187f = interfaceC9540l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        ShareBase$launchRequest$3 shareBase$launchRequest$3 = new ShareBase$launchRequest$3(this.f8186e, this.f8187f, interfaceC11588c);
        shareBase$launchRequest$3.f8185d = obj;
        return shareBase$launchRequest$3;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((ShareBase$launchRequest$3) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f8185d;
        AbstractC11725a.m25952f();
        if (this.f8184c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11603l interfaceC11603lM6348h = this.f8186e.m6348h();
        C11970b1 c11970b1 = (C11970b1) this.f8186e.m6348h().getValue();
        String message = th.getMessage();
        if (message == null) {
            message = "未知错误";
        }
        interfaceC11603lM6348h.setValue(C11970b1.m26594b(c11970b1, false, false, message, null, 11, null));
        InterfaceC9540l interfaceC9540l = this.f8187f;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(th);
        }
        return C10786q.f26013a;
    }
}
