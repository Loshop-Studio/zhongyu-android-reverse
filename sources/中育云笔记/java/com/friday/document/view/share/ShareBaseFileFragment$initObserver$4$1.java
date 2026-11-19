package com.friday.document.view.share;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import p430z2.C11970b1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$4$1", m26211f = "ShareBaseFileFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseFileFragment$initObserver$4$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7586c;

    /* renamed from: d */
    public final /* synthetic */ ShareBaseFileFragment f7587d;

    /* renamed from: e */
    public final /* synthetic */ C11970b1 f7588e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseFileFragment$initObserver$4$1(ShareBaseFileFragment shareBaseFileFragment, C11970b1 c11970b1, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7587d = shareBaseFileFragment;
        this.f7588e = c11970b1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareBaseFileFragment$initObserver$4$1(this.f7587d, this.f7588e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f7586c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ShareBaseFileFragment.m6021w(this.f7587d).f6443g.setRefreshing(this.f7588e.m26598e());
        this.f7587d.isShowLoading(this.f7588e.m26597d());
        String strM26596c = this.f7588e.m26596c();
        if (strM26596c != null) {
            AbstractC11958b.m26588i(strM26596c);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareBaseFileFragment$initObserver$4$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
