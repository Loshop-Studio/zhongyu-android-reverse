package com.friday.document.view.document;

import com.friday.common.entity.FileEntity;
import com.friday.document.adapter.MultiModeFileEntity;
import com.friday.document.adapter.RecycleBinAdapter;
import com.friday.document.viewmodel.RecycleBinViewModel;
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

@InterfaceC11829d(m26210c = "com.friday.document.view.document.RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1", m26211f = "RecycleBinFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7427c;

    /* renamed from: d */
    public final /* synthetic */ RecycleBinFragment f7428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1(RecycleBinFragment recycleBinFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7428d = recycleBinFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1(this.f7428d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        String fileId;
        FileEntity fileEntityM6239W;
        AbstractC11725a.m25952f();
        if (this.f7427c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        List<MultiModeFileEntity> items = ((RecycleBinAdapter) this.f7428d.m5819D()).snapshot().getItems();
        RecycleBinFragment recycleBinFragment = this.f7428d;
        Iterator<T> it = items.iterator();
        do {
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            fileId = ((MultiModeFileEntity) next).getEntity().getFileId();
            fileEntityM6239W = ((RecycleBinViewModel) recycleBinFragment.m5820E()).m6239W();
        } while (!AbstractC9979u.m20289b(fileId, fileEntityM6239W != null ? fileEntityM6239W.getFileId() : null));
        return next;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((RecycleBinFragment$initView$3$2$onItemRangeRemoved$1$find$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
