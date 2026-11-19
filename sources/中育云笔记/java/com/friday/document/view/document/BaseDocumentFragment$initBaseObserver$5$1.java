package com.friday.document.view.document;

import com.friday.common.entity.FileEntity;
import com.friday.document.viewmodel.BaseFileViewModel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.BaseDocumentFragment$initBaseObserver$5$1", m26211f = "BaseDocumentFragment.kt", m26212l = {106}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseDocumentFragment$initBaseObserver$5$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7295c;

    /* renamed from: d */
    public final /* synthetic */ BaseDocumentFragment f7296d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDocumentFragment$initBaseObserver$5$1(BaseDocumentFragment baseDocumentFragment, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7296d = baseDocumentFragment;
        this.f7297e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseDocumentFragment$initBaseObserver$5$1(this.f7296d, this.f7297e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7295c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            this.f7296d.isShowLoading(false);
            if (this.f7297e == null) {
                this.f7296d.m5826y();
                return C10786q.f26013a;
            }
            BaseFileViewModel baseFileViewModelM5820E = this.f7296d.m5820E();
            FileEntity fileEntity = this.f7297e;
            this.f7295c = 1;
            obj = baseFileViewModelM5820E.m6269w(fileEntity, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.f7296d.m5820E().m6262s0(this.f7297e.getFileId());
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseDocumentFragment$initBaseObserver$5$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
