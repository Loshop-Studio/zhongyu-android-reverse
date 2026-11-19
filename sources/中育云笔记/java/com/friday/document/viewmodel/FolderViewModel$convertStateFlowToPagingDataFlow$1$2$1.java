package com.friday.document.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1", m26211f = "FolderViewModel.kt", m26212l = {Opcodes.IFLE}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8012c;

    /* renamed from: d */
    public /* synthetic */ Object f8013d;

    /* renamed from: e */
    public final /* synthetic */ FolderViewModel f8014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1(FolderViewModel folderViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8014e = folderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1 folderViewModel$convertStateFlowToPagingDataFlow$1$2$1 = new FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1(this.f8014e, interfaceC11588c);
        folderViewModel$convertStateFlowToPagingDataFlow$1$2$1.f8013d = obj;
        return folderViewModel$convertStateFlowToPagingDataFlow$1$2$1;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        return ((FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1) create(fileEntity, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FileEntity fileEntity = (FileEntity) this.f8013d;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8012c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1$result$1 folderViewModel$convertStateFlowToPagingDataFlow$1$2$1$result$1 = new FolderViewModel$convertStateFlowToPagingDataFlow$1$2$1$result$1(this.f8014e, fileEntity, null);
            this.f8013d = AbstractC11833h.m26224a(fileEntity);
            this.f8012c = 1;
            obj = AbstractC11109f.m24709g(abstractC11106e0M24799b, folderViewModel$convertStateFlowToPagingDataFlow$1$2$1$result$1, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        FileEntity fileEntity2 = (FileEntity) obj;
        fileEntity2.getFileId();
        fileEntity2.getSyncStatus();
        return fileEntity2;
    }
}
