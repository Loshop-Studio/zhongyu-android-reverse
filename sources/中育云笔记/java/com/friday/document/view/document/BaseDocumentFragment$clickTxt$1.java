package com.friday.document.view.document;

import com.friday.common.entity.FileEntity;
import com.friday.document.R$string;
import com.friday.document.viewmodel.BaseFileViewModel;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141f2.C9166c;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9804v;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.BaseDocumentFragment$clickTxt$1", m26211f = "BaseDocumentFragment.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_NS}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseDocumentFragment$clickTxt$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7289c;

    /* renamed from: d */
    public final /* synthetic */ BaseDocumentFragment f7290d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDocumentFragment$clickTxt$1(BaseDocumentFragment baseDocumentFragment, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7290d = baseDocumentFragment;
        this.f7291e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseDocumentFragment$clickTxt$1(this.f7290d, this.f7291e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7289c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            BaseFileViewModel baseFileViewModelM5820E = this.f7290d.m5820E();
            FileEntity fileEntity = this.f7291e;
            this.f7289c = 1;
            obj = baseFileViewModelM5820E.m6265u(fileEntity, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            if (!C9166c.f21406a.m18061e()) {
                AbstractC11958b.m26587h(R$string.disconnected_net_without_text);
                return C10786q.f26013a;
            }
            this.f7290d.isShowLoading(true);
            this.f7290d.m5820E().m6218B(this.f7291e);
        }
        AbstractC9804v.f23002a.m19815a("Preview");
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseDocumentFragment$clickTxt$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
