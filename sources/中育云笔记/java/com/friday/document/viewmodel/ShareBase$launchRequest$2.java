package com.friday.document.viewmodel;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p430z2.C11970b1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBase$launchRequest$2", m26211f = "ShareBase.kt", m26212l = {30}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBase$launchRequest$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8178c;

    /* renamed from: d */
    public final /* synthetic */ ShareBase f8179d;

    /* renamed from: e */
    public final /* synthetic */ boolean f8180e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC9540l f8181f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC9540l f8182g;

    /* renamed from: h */
    public final /* synthetic */ String f8183h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBase$launchRequest$2(ShareBase shareBase, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8179d = shareBase;
        this.f8180e = z10;
        this.f8181f = interfaceC9540l;
        this.f8182g = interfaceC9540l2;
        this.f8183h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareBase$launchRequest$2(this.f8179d, this.f8180e, this.f8181f, this.f8182g, this.f8183h, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8178c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            this.f8179d.m6348h().setValue(this.f8180e ? C11970b1.m26594b((C11970b1) this.f8179d.m6348h().getValue(), false, true, null, null, 9, null) : C11970b1.m26594b((C11970b1) this.f8179d.m6348h().getValue(), true, false, null, null, 10, null));
            InterfaceC9540l interfaceC9540l = this.f8181f;
            this.f8178c = 1;
            obj = interfaceC9540l.invoke(this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f8182g.invoke(obj);
        if (this.f8183h != null) {
            this.f8179d.m6348h().setValue(C11970b1.m26594b((C11970b1) this.f8179d.m6348h().getValue(), false, false, null, this.f8183h, 7, null));
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareBase$launchRequest$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
