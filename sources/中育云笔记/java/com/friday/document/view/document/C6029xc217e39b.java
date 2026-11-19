package com.friday.document.view.document;

import com.friday.document.adapter.MultiModeFileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1", m26211f = "BaseDocumentFragment.kt", m26212l = {44}, m26213m = "invokeSuspend")
/* renamed from: com.friday.document.view.document.BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1 */
/* loaded from: classes3.dex */
public final class C6029xc217e39b extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7304c;

    /* renamed from: d */
    public final /* synthetic */ BaseDocumentFragment f7305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6029xc217e39b(BaseDocumentFragment baseDocumentFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7305d = baseDocumentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new C6029xc217e39b(this.f7305d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7304c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C6030xba92ad2f c6030xba92ad2f = new C6030xba92ad2f(this.f7305d, null);
            this.f7304c = 1;
            obj = AbstractC11109f.m24709g(abstractC11106e0M24799b, c6030xba92ad2f, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        if (((MultiModeFileEntity) obj) == null) {
            this.f7305d.m5826y();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((C6029xc217e39b) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
