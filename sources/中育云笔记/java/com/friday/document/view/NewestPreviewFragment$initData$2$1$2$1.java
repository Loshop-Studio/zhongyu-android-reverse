package com.friday.document.view;

import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.NewestPreviewFragment$initData$2$1$2$1", m26211f = "NewestPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NewestPreviewFragment$initData$2$1$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7212c;

    /* renamed from: d */
    public final /* synthetic */ NewestPreviewFragment f7213d;

    /* renamed from: e */
    public final /* synthetic */ List f7214e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewestPreviewFragment$initData$2$1$2$1(NewestPreviewFragment newestPreviewFragment, List list, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7213d = newestPreviewFragment;
        this.f7214e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewestPreviewFragment$initData$2$1$2$1(this.f7213d, this.f7214e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f7212c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f7213d.m5726O(this.f7214e);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewestPreviewFragment$initData$2$1$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
