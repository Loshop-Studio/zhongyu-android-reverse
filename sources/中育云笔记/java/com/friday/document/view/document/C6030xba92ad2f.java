package com.friday.document.view.document;

import com.friday.common.entity.FileEntity;
import com.friday.document.adapter.MultiModeFileEntity;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1$find$1", m26211f = "BaseDocumentFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* renamed from: com.friday.document.view.document.BaseDocumentFragment$registerAdapterRemoveObserver$1$onItemRangeRemoved$1$find$1 */
/* loaded from: classes3.dex */
public final class C6030xba92ad2f extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7306c;

    /* renamed from: d */
    public final /* synthetic */ BaseDocumentFragment f7307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6030xba92ad2f(BaseDocumentFragment baseDocumentFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7307d = baseDocumentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new C6030xba92ad2f(this.f7307d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        String fileId;
        FileEntity fileEntityM6239W;
        AbstractC11725a.m25952f();
        if (this.f7306c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        List items = this.f7307d.m5819D().snapshot().getItems();
        BaseDocumentFragment baseDocumentFragment = this.f7307d;
        Iterator it = items.iterator();
        do {
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            fileId = ((MultiModeFileEntity) next).getEntity().getFileId();
            fileEntityM6239W = baseDocumentFragment.m5820E().m6239W();
        } while (!AbstractC9979u.m20289b(fileId, fileEntityM6239W != null ? fileEntityM6239W.getFileId() : null));
        return next;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((C6030xba92ad2f) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
